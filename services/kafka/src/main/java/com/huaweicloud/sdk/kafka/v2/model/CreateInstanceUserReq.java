package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateInstanceUserReq
 */
public class CreateInstanceUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_desc")

    private String userDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_passwd")

    private String userPasswd;

    public CreateInstanceUserReq withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateInstanceUserReq withUserDesc(String userDesc) {
        this.userDesc = userDesc;
        return this;
    }

    /**
     * 用户描述。
     * @return userDesc
     */
    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public CreateInstanceUserReq withUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
        return this;
    }

    /**
     * 用户密码。  密码不能和用户名相同。 复杂度要求： - 输入长度为8到32位的字符串。 - 必须包含如下四种字符中的两种组合：   - 小写字母   - 大写字母   - 数字   - 特殊字符包括（`~!@#$%^&*()-_=+\\|[{}]:'\",<.>/?）
     * @return userPasswd
     */
    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceUserReq that = (CreateInstanceUserReq) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.userDesc, that.userDesc)
            && Objects.equals(this.userPasswd, that.userPasswd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userDesc, userPasswd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceUserReq {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userDesc: ").append(toIndentedString(userDesc)).append("\n");
        sb.append("    userPasswd: ").append(toIndentedString(userPasswd)).append("\n");
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
