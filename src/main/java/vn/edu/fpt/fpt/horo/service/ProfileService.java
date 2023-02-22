package vn.edu.fpt.fpt.horo.service;

import vn.edu.fpt.fpt.horo.dto.common.PageableResponse;
import vn.edu.fpt.fpt.horo.dto.event.CreateProfileEvent;
import vn.edu.fpt.fpt.horo.dto.request.profile.ChangeAvatarRequest;
import vn.edu.fpt.fpt.horo.dto.request.profile.UpdateProfileRequest;
import vn.edu.fpt.fpt.horo.dto.response.profile.GetCVOfAccountResponse;
import vn.edu.fpt.fpt.horo.dto.response.profile.GetProfileDetailResponse;

public interface ProfileService {

    void createProfile(CreateProfileEvent event);

    void updateProfile(String profileId, UpdateProfileRequest request);

    GetProfileDetailResponse getProfileDetails(String profileId);

    PageableResponse<GetCVOfAccountResponse> getCVOfAccount(String accountId);

    void changeAvatar(String profileId, ChangeAvatarRequest request);
}
