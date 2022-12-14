package org.petmily.domain.member.form;

import lombok.Data;

import java.sql.Date;
import java.util.Map;

@Data
public class JoinRequest {

    private String id;
    private String pw;
    private String confirmPw;
    private String name;
    private Date birth;
    private String gender;
    private String email;
    private String phone;

    public boolean isPwEqualToConfirm() {
        return pw != null && pw.equals(confirmPw);
    }
}
