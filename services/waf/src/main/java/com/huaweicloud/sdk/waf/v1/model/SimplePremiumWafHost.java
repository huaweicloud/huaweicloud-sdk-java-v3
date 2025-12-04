package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 独享模式域名信息列表
 */
public class SimplePremiumWafHost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Map<String, String> extend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Flag flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_tag")

    private String webTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostid")

    private String hostid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_ids")

    private List<String> poolIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    public SimplePremiumWafHost withId(String id) {
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

    public SimplePremiumWafHost withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 域名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public SimplePremiumWafHost withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public SimplePremiumWafHost putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public SimplePremiumWafHost withExtend(Consumer<Map<String, String>> extendSetter) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }

    /**
     * 扩展字段，用于保存防护域名的一些配置信息。
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    public SimplePremiumWafHost withRegion(String region) {
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

    public SimplePremiumWafHost withFlag(Flag flag) {
        this.flag = flag;
        return this;
    }

    public SimplePremiumWafHost withFlag(Consumer<Flag> flagSetter) {
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

    public SimplePremiumWafHost withDescription(String description) {
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

    public SimplePremiumWafHost withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 防护域名初始绑定的防护策略ID,可以通过策略名称调用查询防护策略列表（ListPolicy）接口查询到对应的策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public SimplePremiumWafHost withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释：** 域名防护状态标识，用于指定域名在WAF中的防护运行状态 **约束限制：** 不涉及 **取值范围：**  - -1：bypass，该域名的请求直接到达其后端服务器，不再经过WAF  - 0：暂停防护，WAF只转发该域名的请求，不做攻击检测  - 1：开启防护，WAF根据您配置的策略进行攻击检测  **默认取值：** 不涉及
     * @return protectStatus
     */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    public SimplePremiumWafHost withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * **参数解释：** 域名接入状态 **约束限制：** 不涉及 **取值范围：**  - 0: 未接入  - 1: 已接入  **默认取值：** 不涉及
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public SimplePremiumWafHost withWebTag(String webTag) {
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

    public SimplePremiumWafHost withHostid(String hostid) {
        this.hostid = hostid;
        return this;
    }

    /**
     * 域名id，和id的值是一样的，属于冗余字段
     * @return hostid
     */
    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public SimplePremiumWafHost withEnterpriseProjectId(String enterpriseProjectId) {
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

    public SimplePremiumWafHost withPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
        return this;
    }

    public SimplePremiumWafHost addPoolIdsItem(String poolIdsItem) {
        if (this.poolIds == null) {
            this.poolIds = new ArrayList<>();
        }
        this.poolIds.add(poolIdsItem);
        return this;
    }

    public SimplePremiumWafHost withPoolIds(Consumer<List<String>> poolIdsSetter) {
        if (this.poolIds == null) {
            this.poolIds = new ArrayList<>();
        }
        poolIdsSetter.accept(this.poolIds);
        return this;
    }

    /**
     * 云模式elb接入域名返回此字段，表示域名所属独享引擎组
     * @return poolIds
     */
    public List<String> getPoolIds() {
        return poolIds;
    }

    public void setPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
    }

    public SimplePremiumWafHost withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 云模式elb接入域名返回此字段，表示负载均衡器（ELB）id
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public SimplePremiumWafHost withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * 云模式elb接入域名返回此字段，表示业务端口
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimplePremiumWafHost that = (SimplePremiumWafHost) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.hostname, that.hostname)
            && Objects.equals(this.extend, that.extend) && Objects.equals(this.region, that.region)
            && Objects.equals(this.flag, that.flag) && Objects.equals(this.description, that.description)
            && Objects.equals(this.policyid, that.policyid) && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.accessStatus, that.accessStatus) && Objects.equals(this.webTag, that.webTag)
            && Objects.equals(this.hostid, that.hostid)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.poolIds, that.poolIds) && Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.protocolPort, that.protocolPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hostname,
            extend,
            region,
            flag,
            description,
            policyid,
            protectStatus,
            accessStatus,
            webTag,
            hostid,
            enterpriseProjectId,
            poolIds,
            loadbalancerId,
            protocolPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimplePremiumWafHost {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
        sb.append("    hostid: ").append(toIndentedString(hostid)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    poolIds: ").append(toIndentedString(poolIds)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
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
