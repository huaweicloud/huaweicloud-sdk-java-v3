package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 主持人允许观众入会入会请求消息体
 */
public class RestAllowAudienceReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowAudience")

    private Integer allowAudience;

    public RestAllowAudienceReqBody withAllowAudience(Integer allowAudience) {
        this.allowAudience = allowAudience;
        return this;
    }

    /**
     * 主持人是否允许入会 1：允许入会
     * @return allowAudience
     */
    public Integer getAllowAudience() {
        return allowAudience;
    }

    public void setAllowAudience(Integer allowAudience) {
        this.allowAudience = allowAudience;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestAllowAudienceReqBody that = (RestAllowAudienceReqBody) obj;
        return Objects.equals(this.allowAudience, that.allowAudience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowAudience);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestAllowAudienceReqBody {\n");
        sb.append("    allowAudience: ").append(toIndentedString(allowAudience)).append("\n");
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
