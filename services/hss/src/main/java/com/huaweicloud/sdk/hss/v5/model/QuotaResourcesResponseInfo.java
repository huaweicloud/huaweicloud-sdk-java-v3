package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 配额资源 **取值范围**： 不涉及 
 */
public class QuotaResourcesResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_status")

    private String quotaStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_status")

    private String usedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagInfo> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_quota")

    private String sharedQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    public QuotaResourcesResponseInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释** : HSS配额的资源ID **取值范围** : 字符长度1-128位 
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public QuotaResourcesResponseInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 资源规格编码 **取值范围**： 包含如下6种。 - hss.version.basic ：基础版。 - hss.version.advanced ：专业版。 - hss.version.enterprise ：企业版。 - hss.version.premium ：旗舰版。 - hss.version.wtp ：网页防篡改版。 - hss.version.container.enterprise：容器版。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public QuotaResourcesResponseInfo withQuotaStatus(String quotaStatus) {
        this.quotaStatus = quotaStatus;
        return this;
    }

    /**
     * **参数解释**： 配额状态 **取值范围**： 包含如下3种。 - normal : 正常 - expired : 已过期 - freeze : 已冻结
     * @return quotaStatus
     */
    public String getQuotaStatus() {
        return quotaStatus;
    }

    public void setQuotaStatus(String quotaStatus) {
        this.quotaStatus = quotaStatus;
    }

    public QuotaResourcesResponseInfo withUsedStatus(String usedStatus) {
        this.usedStatus = usedStatus;
        return this;
    }

    /**
     * **参数解释**： 使用状态 **取值范围**： 包含如下2种。 - idle : 空闲 - used : 使用中
     * @return usedStatus
     */
    public String getUsedStatus() {
        return usedStatus;
    }

    public void setUsedStatus(String usedStatus) {
        this.usedStatus = usedStatus;
    }

    public QuotaResourcesResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器ID **取值范围**: 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public QuotaResourcesResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-128位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public QuotaResourcesResponseInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**： 计费模式 **取值范围**: - packet_cycle ：包周期。 - on_demand ：按需。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public QuotaResourcesResponseInfo withTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public QuotaResourcesResponseInfo addTagsItem(TagInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QuotaResourcesResponseInfo withTags(Consumer<List<TagInfo>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**： 标签 **取值范围**: 不涉及
     * @return tags
     */
    public List<TagInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagInfo> tags) {
        this.tags = tags;
    }

    public QuotaResourcesResponseInfo withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * **参数解释**： 过期时间 **取值范围**: -1到9223372036854775807，-1表示没有到期时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public QuotaResourcesResponseInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间 **取值范围**: 0到9223372036854775807
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public QuotaResourcesResponseInfo withSharedQuota(String sharedQuota) {
        this.sharedQuota = sharedQuota;
        return this;
    }

    /**
     * **参数解释**： 是否共享配额 **取值范围**: - shared：共享的 - unshared：非共享的
     * @return sharedQuota
     */
    public String getSharedQuota() {
        return sharedQuota;
    }

    public void setSharedQuota(String sharedQuota) {
        this.sharedQuota = sharedQuota;
    }

    public QuotaResourcesResponseInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 主机所属的企业项目ID。 企业项目ID默认取值为“0”，表示默认企业项目。如果需要查询所有企业项目下的主机，请传参“all_granted_eps”。如果您只有某个企业项目的权限，则需要传递该企业项目ID，查询该企业项目下的主机，否则会因权限不足而报错。 **取值范围**: 字符长度1-256位 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public QuotaResourcesResponseInfo withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * **参数解释**: 所属企业项目名称 **取值范围**: 字符长度1-256位 
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaResourcesResponseInfo that = (QuotaResourcesResponseInfo) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.version, that.version)
            && Objects.equals(this.quotaStatus, that.quotaStatus) && Objects.equals(this.usedStatus, that.usedStatus)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.sharedQuota, that.sharedQuota)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            version,
            quotaStatus,
            usedStatus,
            hostId,
            hostName,
            chargingMode,
            tags,
            expireTime,
            createTime,
            sharedQuota,
            enterpriseProjectId,
            enterpriseProjectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaResourcesResponseInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    quotaStatus: ").append(toIndentedString(quotaStatus)).append("\n");
        sb.append("    usedStatus: ").append(toIndentedString(usedStatus)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    sharedQuota: ").append(toIndentedString(sharedQuota)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
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
