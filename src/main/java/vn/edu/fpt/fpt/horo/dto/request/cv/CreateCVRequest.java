package vn.edu.fpt.fpt.horo.dto.request.cv;

import vn.edu.fpt.fpt.horo.dto.common.CreateFileRequest;

import java.io.Serializable;

/**
 * vn.edu.fpt.fpt.horo.dto.request.cv
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

public class CreateCVRequest implements Serializable {
    private static final long serialVersionUID = 2487988312120991051L;
    private String cvName;
    private String description;
    private CreateFileRequest cv;
}
