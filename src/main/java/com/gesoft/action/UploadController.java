package com.gesoft.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by WCL on 2017/10/31.
 */
@Controller
public class UploadController {

    @PostMapping("/file/upload")
    public void upload(@RequestParam("upload_file") MultipartFile multipartFile) {

        try {
            if(multipartFile.isEmpty()){
                return;
            }

            File file = new File("d://" + multipartFile.getOriginalFilename());
            multipartFile.transferTo(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    @PostMapping("/file/uploads")
    public void upload(@RequestParam("upload_files") MultipartFile[] uploadingFiles) {

        try {
            for(MultipartFile uploadedFile : uploadingFiles) {
                File file = new File("d://" + uploadedFile.getOriginalFilename());
                uploadedFile.transferTo(file);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
