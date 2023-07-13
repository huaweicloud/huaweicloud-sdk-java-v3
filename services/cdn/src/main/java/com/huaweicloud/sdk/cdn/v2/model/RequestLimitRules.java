package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 请求限速配置。
 */
public class RequestLimitRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_rate_after")

    private Long limitRateAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_rate_value")

    private Integer limitRateValue;

    public RequestLimitRules withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态, on：开启，off：关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RequestLimitRules withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 限速方式，目前只支持按传送流量限速，当单个HTTP请求流量达到设定的值，开始限制访问速度。  > size:按传送流量限速。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RequestLimitRules withLimitRateAfter(Long limitRateAfter) {
        this.limitRateAfter = limitRateAfter;
        return this;
    }

    /**
     * 限速条件,type=size,limit_rate_after=50表示从传输传输50个字节后开始限速且限速值为limit_rate_value，  > 单位byte，取值范围：0-1073741824。
     * @return limitRateAfter
     */
    public Long getLimitRateAfter() {
        return limitRateAfter;
    }

    public void setLimitRateAfter(Long limitRateAfter) {
        this.limitRateAfter = limitRateAfter;
    }

    public RequestLimitRules withLimitRateValue(Integer limitRateValue) {
        this.limitRateValue = limitRateValue;
        return this;
    }

    /**
     * 限速值,设置开始限速后的最大访问速度。  > 单位Bps，取值范围 0-104857600
     * @return limitRateValue
     */
    public Integer getLimitRateValue() {
        return limitRateValue;
    }

    public void setLimitRateValue(Integer limitRateValue) {
        this.limitRateValue = limitRateValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequestLimitRules that = (RequestLimitRules) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.limitRateAfter, that.limitRateAfter)
            && Objects.equals(this.limitRateValue, that.limitRateValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, limitRateAfter, limitRateValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestLimitRules {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    limitRateAfter: ").append(toIndentedString(limitRateAfter)).append("\n");
        sb.append("    limitRateValue: ").append(toIndentedString(limitRateValue)).append("\n");
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
