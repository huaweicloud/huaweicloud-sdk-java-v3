package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * reset-password信息详情
 */
public class ResetPassword  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_password")
    
    private String newPassword;

    public ResetPassword withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    


    /**
     * 裸金属服务器新密码。该接口不做密码安全性校验，设置的密码复杂度请遵循密码规则。密码规则：密码长度范围为8到26位。密码至少包含以下4种字符中的3种：大写字母小写字母数字特殊字符Windows：!@$%-_=+[]:./?Linux：!@%^-_=+[]{}:,./?密码不能包含用户名或用户名的逆序。Windows系统的裸金属服务器，不能包含用户名中超过两个连续字符的部分。
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetPassword resetPassword = (ResetPassword) o;
        return Objects.equals(this.newPassword, resetPassword.newPassword);
    }
    @Override
    public int hashCode() {
        return Objects.hash(newPassword);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPassword {\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

