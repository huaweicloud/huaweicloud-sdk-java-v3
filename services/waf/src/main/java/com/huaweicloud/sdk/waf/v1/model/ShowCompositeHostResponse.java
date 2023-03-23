package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCompositeHostResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostid")

    private String hostid;

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

    private Flag flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_type")

    private String wafType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_tag")

    private String webTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_progress")

    private List<AccessProgress> accessProgress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "premium_waf_instances")

    private List<PremiumWafInstances> premiumWafInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive_ip")

    private Boolean exclusiveIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public ShowCompositeHostResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 域名id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowCompositeHostResponse withHostid(String hostid) {
        this.hostid = hostid;
        return this;
    }

    /**
     * 域名id
     * @return hostid
     */
    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public ShowCompositeHostResponse withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 创建的云模式防护域名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public ShowCompositeHostResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public ShowCompositeHostResponse withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    /**
     * cname前缀
     * @return accessCode
     */
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public ShowCompositeHostResponse withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 域名防护状态：  - -1：bypass，该域名的请求直接到达其后端服务器，不再经过WAF  - 0：暂停防护，WAF只转发该域名的请求，不做攻击检测  - 1：开启防护，WAF根据您配置的策略进行攻击检测
     * @return protectStatus
     */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ShowCompositeHostResponse withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * 域名接入状态，0表示未接入，1表示已接入
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public ShowCompositeHostResponse withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * 防护域名是否使用代理   - false：不使用代理   - true：使用代理
     * @return proxy
     */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    public ShowCompositeHostResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建防护域名的时间
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ShowCompositeHostResponse withPaidType(String paidType) {
        this.paidType = paidType;
        return this;
    }

    /**
     * 套餐付费模式，默认值为prePaid。prePaid：包周期款模式；postPaid：按需模式。
     * @return paidType
     */
    public String getPaidType() {
        return paidType;
    }

    public void setPaidType(String paidType) {
        this.paidType = paidType;
    }

    public ShowCompositeHostResponse withFlag(Flag flag) {
        this.flag = flag;
        return this;
    }

    public ShowCompositeHostResponse withFlag(Consumer<Flag> flagSetter) {
        if (this.flag == null) {
            this.flag = new Flag();
            flagSetter.accept(this.flag);
        }

        return this;
    }

    /**
     * Get flag
     * @return flag
     */
    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public ShowCompositeHostResponse withWafType(String wafType) {
        this.wafType = wafType;
        return this;
    }

    /**
     * 域名所属WAF模式,cloud为云模式，premium为独享模式
     * @return wafType
     */
    public String getWafType() {
        return wafType;
    }

    public void setWafType(String wafType) {
        this.wafType = wafType;
    }

    public ShowCompositeHostResponse withWebTag(String webTag) {
        this.webTag = webTag;
        return this;
    }

    /**
     * 网站名称，对应WAF控制台域名详情中的网站名称
     * @return webTag
     */
    public String getWebTag() {
        return webTag;
    }

    public void setWebTag(String webTag) {
        this.webTag = webTag;
    }

    public ShowCompositeHostResponse withAccessProgress(List<AccessProgress> accessProgress) {
        this.accessProgress = accessProgress;
        return this;
    }

    public ShowCompositeHostResponse addAccessProgressItem(AccessProgress accessProgressItem) {
        if (this.accessProgress == null) {
            this.accessProgress = new ArrayList<>();
        }
        this.accessProgress.add(accessProgressItem);
        return this;
    }

    public ShowCompositeHostResponse withAccessProgress(Consumer<List<AccessProgress>> accessProgressSetter) {
        if (this.accessProgress == null) {
            this.accessProgress = new ArrayList<>();
        }
        accessProgressSetter.accept(this.accessProgress);
        return this;
    }

    /**
     * 接入进度，仅用于新版console(前端)使用
     * @return accessProgress
     */
    public List<AccessProgress> getAccessProgress() {
        return accessProgress;
    }

    public void setAccessProgress(List<AccessProgress> accessProgress) {
        this.accessProgress = accessProgress;
    }

    public ShowCompositeHostResponse withPremiumWafInstances(List<PremiumWafInstances> premiumWafInstances) {
        this.premiumWafInstances = premiumWafInstances;
        return this;
    }

    public ShowCompositeHostResponse addPremiumWafInstancesItem(PremiumWafInstances premiumWafInstancesItem) {
        if (this.premiumWafInstances == null) {
            this.premiumWafInstances = new ArrayList<>();
        }
        this.premiumWafInstances.add(premiumWafInstancesItem);
        return this;
    }

    public ShowCompositeHostResponse withPremiumWafInstances(
        Consumer<List<PremiumWafInstances>> premiumWafInstancesSetter) {
        if (this.premiumWafInstances == null) {
            this.premiumWafInstances = new ArrayList<>();
        }
        premiumWafInstancesSetter.accept(this.premiumWafInstances);
        return this;
    }

    /**
     * 租户引擎实例信息列表
     * @return premiumWafInstances
     */
    public List<PremiumWafInstances> getPremiumWafInstances() {
        return premiumWafInstances;
    }

    public void setPremiumWafInstances(List<PremiumWafInstances> premiumWafInstances) {
        this.premiumWafInstances = premiumWafInstances;
    }

    public ShowCompositeHostResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 域名描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowCompositeHostResponse withExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
        return this;
    }

    /**
     * 是否使用独享ip   - true：使用独享ip   - false：不实用独享ip
     * @return exclusiveIp
     */
    public Boolean getExclusiveIp() {
        return exclusiveIp;
    }

    public void setExclusiveIp(Boolean exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
    }

    public ShowCompositeHostResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 华为云区域ID，控制台创建的域名会携带此参数，api调用创建的域名此参数为空，可以通过华为云上地区和终端节点文档查询区域ID对应的中文名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCompositeHostResponse showCompositeHostResponse = (ShowCompositeHostResponse) o;
        return Objects.equals(this.id, showCompositeHostResponse.id)
            && Objects.equals(this.hostid, showCompositeHostResponse.hostid)
            && Objects.equals(this.hostname, showCompositeHostResponse.hostname)
            && Objects.equals(this.policyid, showCompositeHostResponse.policyid)
            && Objects.equals(this.accessCode, showCompositeHostResponse.accessCode)
            && Objects.equals(this.protectStatus, showCompositeHostResponse.protectStatus)
            && Objects.equals(this.accessStatus, showCompositeHostResponse.accessStatus)
            && Objects.equals(this.proxy, showCompositeHostResponse.proxy)
            && Objects.equals(this.timestamp, showCompositeHostResponse.timestamp)
            && Objects.equals(this.paidType, showCompositeHostResponse.paidType)
            && Objects.equals(this.flag, showCompositeHostResponse.flag)
            && Objects.equals(this.wafType, showCompositeHostResponse.wafType)
            && Objects.equals(this.webTag, showCompositeHostResponse.webTag)
            && Objects.equals(this.accessProgress, showCompositeHostResponse.accessProgress)
            && Objects.equals(this.premiumWafInstances, showCompositeHostResponse.premiumWafInstances)
            && Objects.equals(this.description, showCompositeHostResponse.description)
            && Objects.equals(this.exclusiveIp, showCompositeHostResponse.exclusiveIp)
            && Objects.equals(this.region, showCompositeHostResponse.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hostid,
            hostname,
            policyid,
            accessCode,
            protectStatus,
            accessStatus,
            proxy,
            timestamp,
            paidType,
            flag,
            wafType,
            webTag,
            accessProgress,
            premiumWafInstances,
            description,
            exclusiveIp,
            region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCompositeHostResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostid: ").append(toIndentedString(hostid)).append("\n");
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
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
        sb.append("    accessProgress: ").append(toIndentedString(accessProgress)).append("\n");
        sb.append("    premiumWafInstances: ").append(toIndentedString(premiumWafInstances)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    exclusiveIp: ").append(toIndentedString(exclusiveIp)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
