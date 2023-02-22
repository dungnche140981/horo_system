package vn.edu.fpt.fpt.horo.controller.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.fpt.fpt.horo.constant.ResponseStatusEnum;
import vn.edu.fpt.fpt.horo.controller.CurriculumVitaeController;
import vn.edu.fpt.fpt.horo.dto.common.GeneralResponse;
import vn.edu.fpt.fpt.horo.dto.request.cv.CreateCVRequest;
import vn.edu.fpt.fpt.horo.dto.request.cv.UpdateCVRequest;
import vn.edu.fpt.fpt.horo.dto.response.cv.CreateCVResponse;
import vn.edu.fpt.fpt.horo.dto.response.cv.GetCVDetailResponse;
import vn.edu.fpt.fpt.horo.factory.ResponseFactory;
import vn.edu.fpt.fpt.horo.service.CVService;

import javax.servlet.http.HttpServletResponse;

/**
 * vn.edu.fpt.fpt.horo.controller.impl
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@RestController
@RequiredArgsConstructor
@Slf4j
public class CurriculumVitaeControllerImpl implements CurriculumVitaeController {

    private final ResponseFactory responseFactory;
    private final CVService cvService;

    @Override
    public ResponseEntity<GeneralResponse<CreateCVResponse>> createCV(String profileId, CreateCVRequest request) {
        return responseFactory.response(cvService.createCV(profileId, request));
    }

    @Override
    public ResponseEntity<GeneralResponse<Object>> updateCV(String cvId, UpdateCVRequest request) {
        cvService.updateCVById(cvId, request);
        return responseFactory.response(ResponseStatusEnum.SUCCESS);
    }

    @Override
    public ResponseEntity<GeneralResponse<GetCVDetailResponse>> getCVDetail(String cvId) {
        return responseFactory.response(cvService.getCVDetailById(cvId));
    }

    @Override
    public void downloadCV(String cvId, HttpServletResponse response) {
        cvService.downloadCV(cvId, response);
    }

    @Override
    public ResponseEntity<GeneralResponse<Object>> deleteCV(String cvId) {
        cvService.deleteCVById(cvId);
        return responseFactory.response(ResponseStatusEnum.SUCCESS);
    }
}
