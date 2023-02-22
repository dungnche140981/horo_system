package vn.edu.fpt.fpt.horo.utils;

/**
 * vn.edu.fpt.fpt.horo.utils
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

public class FileUtils {

    public static String getFileSize(Long length){
        double sizeInBytes = 4 * Math.ceil((length / 3))*0.5624896334383812;
        if(sizeInBytes < 1000){
            return String.format("%f %s", sizeInBytes, "Byte");
        }
        double sizeInKb =sizeInBytes/1000;
        if(sizeInKb < 1000){
            return String.format("%f %s", sizeInKb, "KB");
        }
        double sizeInMb = sizeInKb / 1000;
        if(sizeInMb < 1000){
            return String.format("%f %s", sizeInMb, "MB");
        }
        double sizeInGb = sizeInMb / 1000;
        return String.format("%f %s", sizeInGb, "GB");
    }
}
