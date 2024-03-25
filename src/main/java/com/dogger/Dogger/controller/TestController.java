package com.dogger.Dogger.controller;

import com.dogger.Dogger.dto.DogDto;
import com.dogger.Dogger.model.Dog;
import com.dogger.Dogger.model.Interest;
import com.dogger.Dogger.model.Photo;
import com.dogger.Dogger.service.DogService;
import com.dogger.Dogger.service.LikeService;
import com.dogger.Dogger.service.PhotoService;
import com.dogger.Dogger.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TestController {
    private final LikeService likeService;
    private final DogService dogService;
    private final PhotoService photoService;

    @Autowired
    public TestController(LikeService likeService, DogService dogService, PhotoService photoService) {
        this.likeService = likeService;
        this.dogService = dogService;
        this.photoService = photoService;
    }

    @GetMapping("/register")
    public String createAccountForm(Model model){
        model.addAttribute("dogDto", new DogDto());
        return "register";
    }


    @PostMapping("/register")
    public String createAccountFormSend(@ModelAttribute DogDto dogDto,
                                        @RequestParam("images") MultipartFile[] images) throws IOException {
        int size = dogService.getAllDogs().size();
        long index = dogService.getTopDogIndex();
        dogDto.setId(index+1);
        dogDto.setAccount(size+1);
        List<MultipartFile> photos = new ArrayList<>();

        for (MultipartFile image : images){
            if (!image.isEmpty()){
                int amount = photoService.getAllPhotos().size() + 1;
                try {
                    String filename = image.getOriginalFilename();
                    String name = String.format("image_%d.jpeg", amount);
                    String path = new File("src/main/resources/static/photos").getAbsolutePath() + "/" + name;

                    Photo photo = new Photo();
                    photo.setName(name);
                    photo.setAccount(size + 1);
                    photo.setFilename(filename);
                    photo.setLink(path);
                    photoService.savePhoto(photo);

                    image.transferTo(new File(path));

                }
                catch (IOException ex){
                    System.out.println("Error during upload file");
                }
            }
        }
        dogDto.setPhotos(photos);
        System.out.println(dogDto);
        return "redirect:/";
    }

    public void saveFile(){}


    @GetMapping("/")
    public String helloPage(Model model){
        List<Photo> photos = photoService.getPhotosByAccountId(5);
        List<String> names = new ArrayList<>();
        for (Photo photo : photos){
            names.add(photo.getName());
        }
        System.out.println(names);



        model.addAttribute("names", names);
        model.addAttribute("imageUtil", new ImageUtil());



//       List<String> interests = dogService.getDog(1).getInterests()
//               .stream().map(Interest::getInterest)
//               .collect(Collectors.toCollection(ArrayList::new));
//
//       for (String interest : interests){
//           System.out.println(interest);
//       }


//        List<Dog> dogs = dogService.getAllDogs();
//        dogs.forEach(System.out::println);
//        List<String> likes = likeService.givenLikes("Ellie");
//        System.out.println(likes);
//        List<String> likes1 = likeService.returnedLikes("Alex");
//        System.out.println(likes1);
        return "hello";
    }
}
