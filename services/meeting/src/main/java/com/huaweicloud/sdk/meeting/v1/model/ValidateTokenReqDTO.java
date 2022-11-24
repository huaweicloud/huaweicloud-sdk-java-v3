package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ValidateTokenReqDTO
 */
public class ValidateTokenReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needGenNewToken")

    private Boolean needGenNewToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needAccountInfo")

    private Boolean needAccountInfo;

    public ValidateTokenReqDTO withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Access Token。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ValidateTokenReqDTO withNeedGenNewToken(Boolean needGenNewToken) {
        this.needGenNewToken = needGenNewToken;
        return this;
    }

    /**
     * 是否生成新的Token。 * true：生成新的token值 * false：不生成新的token值 
     * @return needGenNewToken
     */
    public Boolean getNeedGenNewToken() {
        return needGenNewToken;
    }

    public void setNeedGenNewToken(Boolean needGenNewToken) {
        this.needGenNewToken = needGenNewToken;
    }

    public ValidateTokenReqDTO withNeedAccountInfo(Boolean needAccountInfo) {
        this.needAccountInfo = needAccountInfo;
        return this;
    }

    /**
     * 是否需要返回用户帐号信息（帐号、用户名称等信息）。
     * @return needAccountInfo
     */
    public Boolean getNeedAccountInfo() {
        return needAccountInfo;
    }

    public void setNeedAccountInfo(Boolean needAccountInfo) {
        this.needAccountInfo = needAccountInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidateTokenReqDTO validateTokenReqDTO = (ValidateTokenReqDTO) o;
        return Objects.equals(this.token, validateTokenReqDTO.token)
            && Objects.equals(this.needGenNewToken, validateTokenReqDTO.needGenNewToken)
            && Objects.equals(this.needAccountInfo, validateTokenReqDTO.needAccountInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, needGenNewToken, needAccountInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateTokenReqDTO {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    needGenNewToken: ").append(toIndentedString(needGenNewToken)).append("\n");
        sb.append("    needAccountInfo: ").append(toIndentedString(needAccountInfo)).append("\n");
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
