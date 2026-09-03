package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateSubscriptionUserRequestDingTalkBotEndpointInfo
 */
public class CreateSubscriptionUserRequestDingTalkBotEndpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_secret")

    private String appSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_code")

    private String robotCode;

    public CreateSubscriptionUserRequestDingTalkBotEndpointInfo withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 钉钉企业用户的userId。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public CreateSubscriptionUserRequestDingTalkBotEndpointInfo withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * 个人钉钉appKey字段。
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public CreateSubscriptionUserRequestDingTalkBotEndpointInfo withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    /**
     * 个人钉钉appSecret字段。
     * @return appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public CreateSubscriptionUserRequestDingTalkBotEndpointInfo withRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }

    /**
     * 个人钉钉robotCode字段。
     * @return robotCode
     */
    public String getRobotCode() {
        return robotCode;
    }

    public void setRobotCode(String robotCode) {
        this.robotCode = robotCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubscriptionUserRequestDingTalkBotEndpointInfo that =
            (CreateSubscriptionUserRequestDingTalkBotEndpointInfo) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.appKey, that.appKey)
            && Objects.equals(this.appSecret, that.appSecret) && Objects.equals(this.robotCode, that.robotCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, appKey, appSecret, robotCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscriptionUserRequestDingTalkBotEndpointInfo {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
        sb.append("    robotCode: ").append(toIndentedString(robotCode)).append("\n");
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
