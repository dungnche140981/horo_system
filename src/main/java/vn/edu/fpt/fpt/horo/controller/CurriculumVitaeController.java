package vn.edu.fpt.fpt.horo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.fpt.fpt.horo.dto.common.GeneralResponse;
import vn.edu.fpt.fpt.horo.dto.request.cv.CreateCVRequest;
import vn.edu.fpt.fpt.horo.dto.request.cv.UpdateCVRequest;
import vn.edu.fpt.fpt.horo.dto.response.cv.CreateCVResponse;
import vn.edu.fpt.fpt.horo.dto.response.cv.GetCVDetailResponse;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("${app.application-context}/public/api/v1/cv")
public interface CurriculumVitaeController {

    @PostMapping(value = "/{profile-id}")
    ResponseEntity<GeneralResponse<CreateCVResponse>> createCV(@PathVariable(name = "profile-id") String profileId, @RequestBody CreateCVRequest request);

    @PutMapping(value = "/{cv-id}")
    ResponseEntity<GeneralResponse<Object>> updateCV(@PathVariable("cv-id") String cvId, @RequestBody UpdateCVRequest request);
    @GetMapping("/{cv-id}")
    ResponseEntity<GeneralResponse<GetCVDetailResponse>> getCVDetail(@PathVariable(name = "cv-id") String cvId);

    @PostMapping("/{cv-id}")
    void downloadCV(@PathVariable(name = "cv-id") String cvId, HttpServletResponse response);

    @DeleteMapping("/{cv-id}")
    ResponseEntity<GeneralResponse<Object>> deleteCV(@PathVariable(name = "cv-id") String cvId);


}
