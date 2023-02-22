package vn.edu.fpt.fpt.horo.service;

import vn.edu.fpt.fpt.horo.dto.cache.UserInfo;

public interface UserInfoService {

    UserInfo getUserInfo(String accountId);

    void addAvatarToUserInfo(String accountId, String avatarURL);

}
