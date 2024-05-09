package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 绑定CSS集群请求体
 */
public class CreateCssClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_id")

    private String cssId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_pwd")

    private String userPwd;

    public CreateCssClusterReq withCssId(String cssId) {
        this.cssId = cssId;
        return this;
    }

    /**
     * 集群id
     * @return cssId
     */
    public String getCssId() {
        return cssId;
    }

    public void setCssId(String cssId) {
        this.cssId = cssId;
    }

    public CreateCssClusterReq withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 集群用户账号
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateCssClusterReq withUserPwd(String userPwd) {
        this.userPwd = userPwd;
        return this;
    }

    /**
     * 集群用户密码，长度限制为[8,32]
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCssClusterReq that = (CreateCssClusterReq) obj;
        return Objects.equals(this.cssId, that.cssId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userPwd, that.userPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cssId, userName, userPwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCssClusterReq {\n");
        sb.append("    cssId: ").append(toIndentedString(cssId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPwd: ").append(toIndentedString(userPwd)).append("\n");
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
