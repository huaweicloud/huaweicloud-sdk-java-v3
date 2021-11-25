package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** AntiTamperRuleResponseBody */
public class AntiTamperRuleResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public AntiTamperRuleResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /** 规则id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AntiTamperRuleResponseBody withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /** 策略id
     * 
     * @return policyid */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public AntiTamperRuleResponseBody withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** 时间戳
     * 
     * @return timestamp */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public AntiTamperRuleResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 创建规则的时间戳
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AntiTamperRuleResponseBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 规则状态，0：关闭，1：开启
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AntiTamperRuleResponseBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 防篡改的域名
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public AntiTamperRuleResponseBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 防篡改的url
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AntiTamperRuleResponseBody antiTamperRuleResponseBody = (AntiTamperRuleResponseBody) o;
        return Objects.equals(this.id, antiTamperRuleResponseBody.id)
            && Objects.equals(this.policyid, antiTamperRuleResponseBody.policyid)
            && Objects.equals(this.timestamp, antiTamperRuleResponseBody.timestamp)
            && Objects.equals(this.description, antiTamperRuleResponseBody.description)
            && Objects.equals(this.status, antiTamperRuleResponseBody.status)
            && Objects.equals(this.hostname, antiTamperRuleResponseBody.hostname)
            && Objects.equals(this.url, antiTamperRuleResponseBody.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, policyid, timestamp, description, status, hostname, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiTamperRuleResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
