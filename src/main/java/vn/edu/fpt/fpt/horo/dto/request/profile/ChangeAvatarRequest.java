package vn.edu.fpt.fpt.horo.dto.request.profile;

import vn.edu.fpt.fpt.horo.dto.common.CreateFileRequest;

import java.io.Serializable;

/**
 * vn.edu.fpt.fpt.horo.dto.request.profile
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

public class ChangeAvatarRequest implements Serializable {
    private static final long serialVersionUID = 3747410200687205822L;
    private CreateFileRequest avatar;
}
