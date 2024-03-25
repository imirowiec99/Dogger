package com.dogger.Dogger.util;

import java.util.Base64;
import java.util.List;

public class ImageUtil {
    public String getImageData(byte[] byteData){
        return Base64.getMimeEncoder().encodeToString(byteData);
    }


}
