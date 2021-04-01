package com.sda.zdjavapol68.example.zad33;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyImageSearcher implements ImageSearcher{
    @Override
    public List<File> getImages(Path path) {

        List<File> allImages = new ArrayList<>();

        //allImages.addAll()

        for(File file : path.toFile().listFiles()) {
            if(file.isDirectory()) {
                allImages.addAll(getImages(file.toPath()));
            } else {
                if (file.getName().endsWith(".png")||file.getName().endsWith(".jpg")) {
                    allImages.add(file);
                }

            }
        }

        return allImages;

    }
}
