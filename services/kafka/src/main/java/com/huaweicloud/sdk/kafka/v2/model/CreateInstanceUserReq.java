package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * CreateInstanceUserReq
 */
public class CreateInstanceUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_passwd")

    @JacksonXmlProperty(localName = "user_passwd")

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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceUserReq createInstanceUserReq = (CreateInstanceUserReq) o;
        return Objects.equals(this.userName, createInstanceUserReq.userName)
            && Objects.equals(this.userPasswd, createInstanceUserReq.userPasswd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userPasswd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceUserReq {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
