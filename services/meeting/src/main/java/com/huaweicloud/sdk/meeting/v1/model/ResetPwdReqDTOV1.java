package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResetPwdReqDTOV1
 */
public class ResetPwdReqDTOV1  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private String user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="newPwd")
    
    private String newPwd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="passWordType")
    
    private Integer passWordType;

    public ResetPwdReqDTOV1 withUser(String user) {
        this.user = user;
        return this;
    }

    


    /**
     * 用户身份信息（手机号码或邮箱账号或用户真实账号） maxLength：255 minLength：1 
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ResetPwdReqDTOV1 withNewPwd(String newPwd) {
        this.newPwd = newPwd;
        return this;
    }

    


    /**
     * 用户新的登录密码 密码要求： * 长度范围要求8~32 * 至少包含大小写字母、数字 * 不能包含3个以上重复字符 * 密码不能包含与其对应的用户名（不区分大小写）以及逆序的用户名（不区分大小写） 
     * @return newPwd
     */
    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    public ResetPwdReqDTOV1 withPassWordType(Integer passWordType) {
        this.passWordType = passWordType;
        return this;
    }

    


    /**
     * * 1:临时密码，重置完密码后登录Web Portal根据配置可能需要强制修改密码 * 非1：正式密码，重置完密码后登录Web Portal不需要强制修改密码。 
     * @return passWordType
     */
    public Integer getPassWordType() {
        return passWordType;
    }

    public void setPassWordType(Integer passWordType) {
        this.passWordType = passWordType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetPwdReqDTOV1 resetPwdReqDTOV1 = (ResetPwdReqDTOV1) o;
        return Objects.equals(this.user, resetPwdReqDTOV1.user) &&
            Objects.equals(this.newPwd, resetPwdReqDTOV1.newPwd) &&
            Objects.equals(this.passWordType, resetPwdReqDTOV1.passWordType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(user, newPwd, passWordType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPwdReqDTOV1 {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    newPwd: ").append(toIndentedString(newPwd)).append("\n");
        sb.append("    passWordType: ").append(toIndentedString(passWordType)).append("\n");
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

