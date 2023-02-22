package vn.edu.fpt.fpt.horo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.fpt.fpt.horo.dto.common.GeneralResponse;
import vn.edu.fpt.fpt.horo.dto.common.PageableResponse;
import vn.edu.fpt.fpt.horo.dto.event.CreateProfileEvent;
import vn.edu.fpt.fpt.horo.dto.request.profile.ChangeAvatarRequest;
import vn.edu.fpt.fpt.horo.dto.request.profile.UpdateProfileRequest;
import vn.edu.fpt.fpt.horo.dto.response.profile.GetCVOfAccountResponse;
import vn.edu.fpt.fpt.horo.dto.response.profile.GetProfileDetailResponse;

@RequestMapping("${app.application-context}/public/api/v1/profiles")
public interface ProfileController {

    @PostMapping(value = "/profile")
    ResponseEntity<GeneralResponse<Object>> createProfile(@RequestBody CreateProfileEvent event);

    @PutMapping("/{profile-id}")
    ResponseEntity<GeneralResponse<Object>> updateProfiles(@PathVariable("profile-id") String parameter, @RequestBody UpdateProfileRequest request);

    @GetMapping("/{profile-id}")
    ResponseEntity<GeneralResponse<GetProfileDetailResponse>> getProfileDetails(@PathVariable(name = "profile-id") String profileId);

    @GetMapping("/{account-id}/cv")
    ResponseEntity<GeneralResponse<PageableResponse<GetCVOfAccountResponse>>> getCVOfAccount(@PathVariable(name = "account-id") String accountId);

    @PostMapping(value = "/{profile-id}/avatar")
    ResponseEntity<GeneralResponse<Object>> changeAvatar(@PathVariable(name = "profile-id") String profileId, @RequestBody ChangeAvatarRequest request);

}
