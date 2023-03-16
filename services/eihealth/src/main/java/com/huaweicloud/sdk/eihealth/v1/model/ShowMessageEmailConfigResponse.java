package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMessageEmailConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private String server;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_prefix")

    private String subjectPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    public ShowMessageEmailConfigResponse withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * 服务器地址
     * @return server
     */
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public ShowMessageEmailConfigResponse withSubjectPrefix(String subjectPrefix) {
        this.subjectPrefix = subjectPrefix;
        return this;
    }

    /**
     * 展示名
     * @return subjectPrefix
     */
    public String getSubjectPrefix() {
        return subjectPrefix;
    }

    public void setSubjectPrefix(String subjectPrefix) {
        this.subjectPrefix = subjectPrefix;
    }

    public ShowMessageEmailConfigResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowMessageEmailConfigResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShowMessageEmailConfigResponse withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMessageEmailConfigResponse showMessageEmailConfigResponse = (ShowMessageEmailConfigResponse) o;
        return Objects.equals(this.server, showMessageEmailConfigResponse.server)
            && Objects.equals(this.subjectPrefix, showMessageEmailConfigResponse.subjectPrefix)
            && Objects.equals(this.userName, showMessageEmailConfigResponse.userName)
            && Objects.equals(this.email, showMessageEmailConfigResponse.email)
            && Objects.equals(this.language, showMessageEmailConfigResponse.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, subjectPrefix, userName, email, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMessageEmailConfigResponse {\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    subjectPrefix: ").append(toIndentedString(subjectPrefix)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
