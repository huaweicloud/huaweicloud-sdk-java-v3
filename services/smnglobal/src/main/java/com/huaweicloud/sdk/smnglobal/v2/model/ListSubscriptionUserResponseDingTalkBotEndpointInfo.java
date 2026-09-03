package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListSubscriptionUserResponseDingTalkBotEndpointInfo
 */
public class ListSubscriptionUserResponseDingTalkBotEndpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_code")

    private String robotCode;

    public ListSubscriptionUserResponseDingTalkBotEndpointInfo withEndpoint(String endpoint) {
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

    public ListSubscriptionUserResponseDingTalkBotEndpointInfo withRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }

    /**
     * 钉钉创建的机器人编码。
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
        ListSubscriptionUserResponseDingTalkBotEndpointInfo that =
            (ListSubscriptionUserResponseDingTalkBotEndpointInfo) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.robotCode, that.robotCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, robotCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionUserResponseDingTalkBotEndpointInfo {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
