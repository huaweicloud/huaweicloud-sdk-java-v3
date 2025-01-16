package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudWafHostItem
 */
public class CloudWafHostItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostid")

    private String hostid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private List<CloudWafServer> server = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_tag")

    private String webTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Flag flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CloudWafHostItem withId(String id) {
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

    public CloudWafHostItem withHostid(String hostid) {
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

    public CloudWafHostItem withRegion(String region) {
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

    public CloudWafHostItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 域名描述信息，可选参数。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CloudWafHostItem withServer(List<CloudWafServer> server) {
        this.server = server;
        return this;
    }

    public CloudWafHostItem addServerItem(CloudWafServer serverItem) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public CloudWafHostItem withServer(Consumer<List<CloudWafServer>> serverSetter) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        serverSetter.accept(this.server);
        return this;
    }

    /**
     * 防护域名的源站服务器配置信息
     * @return server
     */
    public List<CloudWafServer> getServer() {
        return server;
    }

    public void setServer(List<CloudWafServer> server) {
        this.server = server;
    }

    public CloudWafHostItem withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * WAF部署模式，默认是1，目前仅支持反代模式，冗余参数
     * @return type
     */
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

    public CloudWafHostItem withHostname(String hostname) {
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

    public CloudWafHostItem withAccessCode(String accessCode) {
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

    public CloudWafHostItem withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 防护策略id
     * @return policyid
     */
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

    public CloudWafHostItem withProtectStatus(Integer protectStatus) {
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

    public CloudWafHostItem withAccessStatus(Integer accessStatus) {
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

    public CloudWafHostItem withExclusiveIp(Boolean exclusiveIp) {
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

    public CloudWafHostItem withPaidType(String paidType) {
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

    public CloudWafHostItem withWebTag(String webTag) {
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

    public CloudWafHostItem withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudWafHostItem that = (CloudWafHostItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.hostid, that.hostid)
            && Objects.equals(this.region, that.region) && Objects.equals(this.description, that.description)
            && Objects.equals(this.server, that.server) && Objects.equals(this.type, that.type)
            && Objects.equals(this.proxy, that.proxy) && Objects.equals(this.hostname, that.hostname)
            && Objects.equals(this.accessCode, that.accessCode) && Objects.equals(this.policyid, that.policyid)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.accessStatus, that.accessStatus)
            && Objects.equals(this.exclusiveIp, that.exclusiveIp) && Objects.equals(this.paidType, that.paidType)
            && Objects.equals(this.webTag, that.webTag) && Objects.equals(this.flag, that.flag)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hostid,
            region,
            description,
            server,
            type,
            proxy,
            hostname,
            accessCode,
            policyid,
            timestamp,
            protectStatus,
            accessStatus,
            exclusiveIp,
            paidType,
            webTag,
            flag,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudWafHostItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostid: ").append(toIndentedString(hostid)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    exclusiveIp: ").append(toIndentedString(exclusiveIp)).append("\n");
        sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
