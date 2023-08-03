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
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_value")

    private String matchValue;

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
     * status只支持on，off无效。  > request_limit_rules字段置空时代表关闭请求限速功能。  > 旧接口中的参数，后续将下线。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RequestLimitRules withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级，值越大，优先级越高,取值范围：1-100。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public RequestLimitRules withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配类型，all：所有文件，catalog：目录。
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public RequestLimitRules withMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }

    /**
     * 匹配类型值。 当match_type为all时传空值，例如：\"\"； 当match_type为catalog时传目录地址，以“/”作为首字符,例如：\"/test\"。  > 值为catalog的时候必填
     * @return matchValue
     */
    public String getMatchValue() {
        return matchValue;
    }

    public void setMatchValue(String matchValue) {
        this.matchValue = matchValue;
    }

    public RequestLimitRules withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 限速方式，当前仅支持按流量大小限速，取值为size。
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
     * 限速条件,type=size,limit_rate_after=50表示从传输表示传输50个字节后开始限速且限速值为limit_rate_value， 单位byte，取值范围：0-1073741824。
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
     * 限速值,单位Bps，取值范围 0-104857600。
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
        return Objects.equals(this.status, that.status) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.matchType, that.matchType) && Objects.equals(this.matchValue, that.matchValue)
            && Objects.equals(this.type, that.type) && Objects.equals(this.limitRateAfter, that.limitRateAfter)
            && Objects.equals(this.limitRateValue, that.limitRateValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, priority, matchType, matchValue, type, limitRateAfter, limitRateValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestLimitRules {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
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
