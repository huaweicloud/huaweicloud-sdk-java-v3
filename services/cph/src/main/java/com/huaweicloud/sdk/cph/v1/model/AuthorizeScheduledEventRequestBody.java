package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 授权计划事件请求体。
 */
public class AuthorizeScheduledEventRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_type")

    private String authorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    private String notBefore;

    public AuthorizeScheduledEventRequestBody withAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * 授权类型。取值范围： maintenance：维护、 redeploy：重部署
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    public AuthorizeScheduledEventRequestBody withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 计划执行开始时间。仅maintenance类型的事件支持，预约的时间需要比当前时间多5分钟以上，传空字符串表示立即执行。
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizeScheduledEventRequestBody that = (AuthorizeScheduledEventRequestBody) obj;
        return Objects.equals(this.authorizationType, that.authorizationType)
            && Objects.equals(this.notBefore, that.notBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationType, notBefore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeScheduledEventRequestBody {\n");
        sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
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
