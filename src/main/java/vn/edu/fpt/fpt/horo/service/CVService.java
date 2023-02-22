package vn.edu.fpt.fpt.horo.service;

import vn.edu.fpt.fpt.horo.dto.request.cv.CreateCVRequest;
import vn.edu.fpt.fpt.horo.dto.request.cv.UpdateCVRequest;
import vn.edu.fpt.fpt.horo.dto.response.cv.CreateCVResponse;
import vn.edu.fpt.fpt.horo.dto.response.cv.GetCVDetailResponse;

import javax.servlet.http.HttpServletResponse;

public interface CVService {

    CreateCVResponse createCV(String profileId, CreateCVRequest request);

    GetCVDetailResponse getCVDetailById(String cvId);

    void updateCVById(String cvId, UpdateCVRequest request);

    void downloadCV(String cvId, HttpServletResponse response);

    void deleteCVById(String cvId);
}
