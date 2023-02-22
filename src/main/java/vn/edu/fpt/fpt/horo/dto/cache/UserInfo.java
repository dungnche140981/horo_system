package vn.edu.fpt.fpt.horo.dto.cache;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * vn.edu.fpt.fpt.horo.dto.cache
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonPropertyOrder({"username", "email", "fullName", "avatar", "roles"})
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 4689073615796931874L;
    private String username;
    private String email;
    private String fullName;
    private String avatar;
    private List<String> roles;
}
