package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CloudWafHostItem */
public class CloudWafHostItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostid")

    private String hostid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Flag flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_code")

    private String accessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive_ip")

    private Boolean exclusiveIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paid_type")

    private String paidType;

    public CloudWafHostItem withId(String id) {
        this.id = id;
        return this;
    }

    /** 域名id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CloudWafHostItem withHostid(String hostid) {
        this.hostid = hostid;
        return this;
    }

    /** 域名id
     * 
     * @return hostid */
    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public CloudWafHostItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述信息
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CloudWafHostItem withType(Integer type) {
        this.type = type;
        return this;
    }

    /** WAF部署模式
     * 
     * @return type */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CloudWafHostItem withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /** 是否开启了代理
     * 
     * @return proxy */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    public CloudWafHostItem withFlag(Flag flag) {
        this.flag = flag;
        return this;
    }

    public CloudWafHostItem withFlag(Consumer<Flag> flagSetter) {
        if (this.flag == null) {
            this.flag = new Flag();
            flagSetter.accept(this.flag);
        }

        return this;
    }

    /** Get flag
     * 
     * @return flag */
    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public CloudWafHostItem withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 创建的云模式防护域名
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public CloudWafHostItem withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    /** cname前缀
     * 
     * @return accessCode */
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public CloudWafHostItem withPolicyid(String policyid) {
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

    public CloudWafHostItem withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** 创建防护域名的时间
     * 
     * @return timestamp */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public CloudWafHostItem withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /** 域名防护状态： - -1：bypass，该域名的请求直接到达其后端服务器，不再经过WAF - 0：暂停防护，WAF只转发该域名的请求，不做攻击检测 - 1：开启防护，WAF根据您配置的策略进行攻击检测
     * 
     * @return protectStatus */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    public CloudWafHostItem withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /** 接入状态
     * 
     * @return accessStatus */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public CloudWafHostItem withExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
        return this;
    }

    /** 是否使用独享ip
     * 
     * @return exclusiveIp */
    public Boolean getExclusiveIp() {
        return exclusiveIp;
    }

    public void setExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
    }

    public CloudWafHostItem withPaidType(String paidType) {
        this.paidType = paidType;
        return this;
    }

    /** 付费模式，目前只支持prePaid预付款模式
     * 
     * @return paidType */
    public String getPaidType() {
        return paidType;
    }

    public void setPaidType(String paidType) {
        this.paidType = paidType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudWafHostItem cloudWafHostItem = (CloudWafHostItem) o;
        return Objects.equals(this.id, cloudWafHostItem.id) && Objects.equals(this.hostid, cloudWafHostItem.hostid)
            && Objects.equals(this.description, cloudWafHostItem.description)
            && Objects.equals(this.type, cloudWafHostItem.type) && Objects.equals(this.proxy, cloudWafHostItem.proxy)
            && Objects.equals(this.flag, cloudWafHostItem.flag)
            && Objects.equals(this.hostname, cloudWafHostItem.hostname)
            && Objects.equals(this.accessCode, cloudWafHostItem.accessCode)
            && Objects.equals(this.policyid, cloudWafHostItem.policyid)
            && Objects.equals(this.timestamp, cloudWafHostItem.timestamp)
            && Objects.equals(this.protectStatus, cloudWafHostItem.protectStatus)
            && Objects.equals(this.accessStatus, cloudWafHostItem.accessStatus)
            && Objects.equals(this.exclusiveIp, cloudWafHostItem.exclusiveIp)
            && Objects.equals(this.paidType, cloudWafHostItem.paidType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hostid,
            description,
            type,
            proxy,
            flag,
            hostname,
            accessCode,
            policyid,
            timestamp,
            protectStatus,
            accessStatus,
            exclusiveIp,
            paidType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudWafHostItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostid: ").append(toIndentedString(hostid)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    exclusiveIp: ").append(toIndentedString(exclusiveIp)).append("\n");
        sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
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
