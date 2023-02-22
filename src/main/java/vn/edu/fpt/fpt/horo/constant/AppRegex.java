package vn.edu.fpt.fpt.horo.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * vn.edu.fpt.fpt.horo.constant
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppRegex {
    public static final String PARAM_REGEX = "^%%([a-zA-Z0-9_]*)%%$";
    public static final String PARAM_INFIX = "%%";
}
