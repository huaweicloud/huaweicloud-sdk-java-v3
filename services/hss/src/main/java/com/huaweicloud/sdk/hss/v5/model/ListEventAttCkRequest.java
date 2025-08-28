package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListEventAttCkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_days")

    private Integer lastDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_list")

    private List<String> severityList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_tag")

    private String attackTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<String> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    public ListEventAttCkRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**: 区域ID，用于查询目的区域内的资产。获取方式请参见[获取区域ID](hss_02_0026.xml)。 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListEventAttCkRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListEventAttCkRequest withLastDays(Integer lastDays) {
        this.lastDays = lastDays;
        return this;
    }

    /**
     * **参数解释**: 查询时间范围天数，与自定义查询时间begin_time，end_time互斥。 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值30 **默认取值**: 不涉及 
     * minimum: 1
     * maximum: 30
     * @return lastDays
     */
    public Integer getLastDays() {
        return lastDays;
    }

    public void setLastDays(Integer lastDays) {
        this.lastDays = lastDays;
    }

    public ListEventAttCkRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: 事件类别 **约束限制**: 不涉及 **取值范围**: - host : 主机安全事件 - container : 容器安全事件 - serverless : serverless场景安全事件  **默认取值**: 不涉及 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListEventAttCkRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**： 服务器名称 **约束限制**： 不涉及 **取值范围**： 字符长度1-256位 **默认取值**： 不涉及 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListEventAttCkRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 服务器ID **约束限制**： 不涉及 **取值范围**： 字符长度1-256位 **默认取值**： 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListEventAttCkRequest withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**： 服务器私有IP **约束限制**： 不涉及 **取值范围**： 字符长度1-256位 **默认取值**： 不涉及 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ListEventAttCkRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 服务器公网IP **约束限制**： 不涉及 **取值范围**： 字符长度1-256位 **默认取值**： 不涉及 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ListEventAttCkRequest withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**： 容器实例名称 **约束限制**： 不涉及 **取值范围**： 字符长度1-512位 **默认取值**： 不涉及 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ListEventAttCkRequest withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释**: 事件类型 **约束限制**: 不涉及 **取值范围**: - 1001：通用恶意软件 - 1002：病毒 - 1003：蠕虫 - 1004：木马 - 1005：僵尸网络 - 1006：后门 - 1010：Rootkit - 1011：勒索软件 - 1012：黑客工具 - 1015：Webshell - 1016：挖矿 - 1017：反弹Shell - 2001：一般漏洞利用 - 2012：远程代码执行 - 2047：Redis漏洞利用 - 2048：Hadoop漏洞利用 - 2049：MySQL漏洞利用 - 3002：文件提权 - 3003：进程提权 - 3004：关键文件变更 - 3005：文件/目录变更 - 3007：进程异常行为 - 3015：高危命令执行 - 3018：异常Shell - 3026：crontab提权 - 3027：Crontab可疑任务 - 3029：系统安全防护被禁用 - 3030：备份删除 - 3031：异常注册表操作 - 3036：容器镜像阻断 - 4002：暴力破解 - 4004：异常登录 - 4006：非法系统账号 - 4014：用户账号添加 - 4020：用户密码窃取 - 6002：端口扫描 - 6003：主机扫描 - 13001：Kubernetes事件删除 - 13002：Pod异常行为 - 13003：枚举用户信息 - 13004：绑定集群用户角色  **默认取值**: 不涉及 
     * minimum: 1000
     * maximum: 30000
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public ListEventAttCkRequest withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释**: 处置状态 **约束限制**: 不涉及 **取值范围**: - unhandled：未处理 - handled：已处理  **默认取值**: 不涉及 
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ListEventAttCkRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**: 威胁等级 **约束限制**: 不涉及 **取值范围**: - Security：安全 - Low：低危 - Medium：中危 - High：高危 - Critical：危急  **默认取值**: 不涉及 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ListEventAttCkRequest withSeverityList(List<String> severityList) {
        this.severityList = severityList;
        return this;
    }

    public ListEventAttCkRequest addSeverityListItem(String severityListItem) {
        if (this.severityList == null) {
            this.severityList = new ArrayList<>();
        }
        this.severityList.add(severityListItem);
        return this;
    }

    public ListEventAttCkRequest withSeverityList(Consumer<List<String>> severityListSetter) {
        if (this.severityList == null) {
            this.severityList = new ArrayList<>();
        }
        severityListSetter.accept(this.severityList);
        return this;
    }

    /**
     * **参数解释**: 威胁等级 **约束限制**: 不涉及 **取值范围**: - Security：安全 - Low：低危 - Medium：中危 - High：高危 - Critical：危急  **默认取值**: 不涉及 
     * @return severityList
     */
    public List<String> getSeverityList() {
        return severityList;
    }

    public void setSeverityList(List<String> severityList) {
        this.severityList = severityList;
    }

    public ListEventAttCkRequest withAttackTag(String attackTag) {
        this.attackTag = attackTag;
        return this;
    }

    /**
     * **参数解释**: 攻击标识 **约束限制**: 不涉及 **取值范围**: - attack_success：攻击成功 - attack_attempt：攻击尝试 - attack_blocked：攻击被阻断 - abnormal_behavior：异常行为 - collapsible_host：主机失陷 - system_vulnerability：系统脆弱性  **默认取值**: 不涉及 
     * @return attackTag
     */
    public String getAttackTag() {
        return attackTag;
    }

    public void setAttackTag(String attackTag) {
        this.attackTag = attackTag;
    }

    public ListEventAttCkRequest withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释**: 资产重要性 **约束限制**: 不涉及 **取值范围**: - important：重要资产 - common：般资产 - test：测试资产  **默认取值**: 不涉及 
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public ListEventAttCkRequest withTagList(List<String> tagList) {
        this.tagList = tagList;
        return this;
    }

    public ListEventAttCkRequest addTagListItem(String tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public ListEventAttCkRequest withTagList(Consumer<List<String>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /**
     * 事件标签列表，例如:[\"热点事件\"]
     * @return tagList
     */
    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public ListEventAttCkRequest withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * **参数解释**： 告警名称 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位 **默认取值**： 不涉及 
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventAttCkRequest that = (ListEventAttCkRequest) obj;
        return Objects.equals(this.region, that.region)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.lastDays, that.lastDays) && Objects.equals(this.category, that.category)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.handleStatus, that.handleStatus) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.severityList, that.severityList) && Objects.equals(this.attackTag, that.attackTag)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.tagList, that.tagList)
            && Objects.equals(this.eventName, that.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            enterpriseProjectId,
            lastDays,
            category,
            hostName,
            hostId,
            privateIp,
            publicIp,
            containerName,
            eventType,
            handleStatus,
            severity,
            severityList,
            attackTag,
            assetValue,
            tagList,
            eventName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventAttCkRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    lastDays: ").append(toIndentedString(lastDays)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    severityList: ").append(toIndentedString(severityList)).append("\n");
        sb.append("    attackTag: ").append(toIndentedString(attackTag)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
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
