package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CompositeHostResponse */
public class CompositeHostResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_code")

    private String accessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paid_type")

    private String paidType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private HostFlag flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_type")

    private String wafType;

    public CompositeHostResponse withId(String id) {
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

    public CompositeHostResponse withHostname(String hostname) {
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

    public CompositeHostResponse withPolicyid(String policyid) {
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

    public CompositeHostResponse withAccessCode(String accessCode) {
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

    public CompositeHostResponse withProtectStatus(Integer protectStatus) {
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

    public CompositeHostResponse withAccessStatus(Integer accessStatus) {
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

    public CompositeHostResponse withProxy(Boolean proxy) {
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

    public CompositeHostResponse withTimestamp(Long timestamp) {
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

    public CompositeHostResponse withPaidType(String paidType) {
        this.paidType = paidType;
        return this;
    }

    /** 套餐付费模式，目前只支持prePaid预付款模式
     * 
     * @return paidType */
    public String getPaidType() {
        return paidType;
    }

    public void setPaidType(String paidType) {
        this.paidType = paidType;
    }

    public CompositeHostResponse withFlag(HostFlag flag) {
        this.flag = flag;
        return this;
    }

    public CompositeHostResponse withFlag(Consumer<HostFlag> flagSetter) {
        if (this.flag == null) {
            this.flag = new HostFlag();
            flagSetter.accept(this.flag);
        }

        return this;
    }

    /** Get flag
     * 
     * @return flag */
    public HostFlag getFlag() {
        return flag;
    }

    public void setFlag(HostFlag flag) {
        this.flag = flag;
    }

    public CompositeHostResponse withWafType(String wafType) {
        this.wafType = wafType;
        return this;
    }

    /** 域名所属WAF模式
     * 
     * @return wafType */
    public String getWafType() {
        return wafType;
    }

    public void setWafType(String wafType) {
        this.wafType = wafType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompositeHostResponse compositeHostResponse = (CompositeHostResponse) o;
        return Objects.equals(this.id, compositeHostResponse.id)
            && Objects.equals(this.hostname, compositeHostResponse.hostname)
            && Objects.equals(this.policyid, compositeHostResponse.policyid)
            && Objects.equals(this.accessCode, compositeHostResponse.accessCode)
            && Objects.equals(this.protectStatus, compositeHostResponse.protectStatus)
            && Objects.equals(this.accessStatus, compositeHostResponse.accessStatus)
            && Objects.equals(this.proxy, compositeHostResponse.proxy)
            && Objects.equals(this.timestamp, compositeHostResponse.timestamp)
            && Objects.equals(this.paidType, compositeHostResponse.paidType)
            && Objects.equals(this.flag, compositeHostResponse.flag)
            && Objects.equals(this.wafType, compositeHostResponse.wafType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hostname,
            policyid,
            accessCode,
            protectStatus,
            accessStatus,
            proxy,
            timestamp,
            paidType,
            flag,
            wafType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompositeHostResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    wafType: ").append(toIndentedString(wafType)).append("\n");
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
