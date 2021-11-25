package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** WhiteBlackIpResponseBody */
public class WhiteBlackIpResponseBody {

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
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    public WhiteBlackIpResponseBody withId(String id) {
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

    public WhiteBlackIpResponseBody withPolicyid(String policyid) {
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

    public WhiteBlackIpResponseBody withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** 创建规则的时间戳
     * 
     * @return timestamp */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public WhiteBlackIpResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 规则描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WhiteBlackIpResponseBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 规则状态
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public WhiteBlackIpResponseBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /** 黑白名单
     * 
     * @return ip */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public WhiteBlackIpResponseBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /** 防护动作： - 0拦截 - 1放行 - 2仅记录
     * 
     * @return white */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhiteBlackIpResponseBody whiteBlackIpResponseBody = (WhiteBlackIpResponseBody) o;
        return Objects.equals(this.id, whiteBlackIpResponseBody.id)
            && Objects.equals(this.policyid, whiteBlackIpResponseBody.policyid)
            && Objects.equals(this.timestamp, whiteBlackIpResponseBody.timestamp)
            && Objects.equals(this.description, whiteBlackIpResponseBody.description)
            && Objects.equals(this.status, whiteBlackIpResponseBody.status)
            && Objects.equals(this.ip, whiteBlackIpResponseBody.ip)
            && Objects.equals(this.white, whiteBlackIpResponseBody.white);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, policyid, timestamp, description, status, ip, white);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WhiteBlackIpResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
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
