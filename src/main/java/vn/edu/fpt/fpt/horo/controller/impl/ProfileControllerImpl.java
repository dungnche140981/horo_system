package vn.edu.fpt.fpt.horo.controller.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.fpt.fpt.horo.constant.ResponseStatusEnum;
import vn.edu.fpt.fpt.horo.controller.ProfileController;
import vn.edu.fpt.fpt.horo.dto.common.GeneralResponse;
import vn.edu.fpt.fpt.horo.dto.common.PageableResponse;
import vn.edu.fpt.fpt.horo.dto.event.CreateProfileEvent;
import vn.edu.fpt.fpt.horo.dto.request.profile.ChangeAvatarRequest;
import vn.edu.fpt.fpt.horo.dto.request.profile.UpdateProfileRequest;
import vn.edu.fpt.fpt.horo.dto.response.profile.GetCVOfAccountResponse;
import vn.edu.fpt.fpt.horo.dto.response.profile.GetProfileDetailResponse;
import vn.edu.fpt.fpt.horo.factory.ResponseFactory;
import vn.edu.fpt.fpt.horo.service.ProfileService;

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
public class ProfileControllerImpl implements ProfileController {

    private final ResponseFactory responseFactory;
    private final ProfileService profileService;

    @Override
    public ResponseEntity<GeneralResponse<Object>> createProfile(CreateProfileEvent event) {
        profileService.createProfile(event);
        return responseFactory.response(ResponseStatusEnum.SUCCESS);
    }

    @Override
    public ResponseEntity<GeneralResponse<Object>> updateProfiles(String profileId, UpdateProfileRequest request) {
        profileService.updateProfile(profileId, request);
        return responseFactory.response(ResponseStatusEnum.SUCCESS);
    }

    @Override
    public ResponseEntity<GeneralResponse<GetProfileDetailResponse>> getProfileDetails(String profileId) {
        return responseFactory.response(profileService.getProfileDetails(profileId));
    }

    @Override
    public ResponseEntity<GeneralResponse<PageableResponse<GetCVOfAccountResponse>>> getCVOfAccount(String accountId) {
        return responseFactory.response(profileService.getCVOfAccount(accountId));
    }

    @Override
    public ResponseEntity<GeneralResponse<Object>> changeAvatar(String profileId, ChangeAvatarRequest request) {
        profileService.changeAvatar(profileId, request);
        return responseFactory.response(ResponseStatusEnum.SUCCESS);
    }
}
