package vn.edu.fpt.fpt.horo.service;

import vn.edu.fpt.fpt.horo.dto.common.CreateFileRequest;
import vn.edu.fpt.fpt.horo.entity._File;

import javax.servlet.http.HttpServletResponse;
import java.io.File;

public interface S3BucketStorageService {

    void uploadFile(CreateFileRequest request, String fileKey);

    void downloadFile(String fileKey, HttpServletResponse response);

    void downloadFile(_File file, HttpServletResponse response);
    File downloadFile(String fileKey);

    String sharingUsingPresignedURL(String fileKey);

    // deleteFile
}
