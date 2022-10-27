package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配额资源
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
    @JsonProperty(value = "shared_quota")

    private String sharedQuota;

    public QuotaResourcesResponseInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 主机安全配额的资源ID
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
     * 资源规格编码，包含如下:   - hss.version.basic : 基础版   - hss.version.enterprise : 企业版   - hss.version.premium : 旗舰版   - hss.version.wtp : 网页防篡改版   - hss.version.container : 容器版
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
     * 配额状态   - normal : 正常   - expired : 已过期   - freeze : 已冻结
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
     * 使用状态   - idle : 空闲   - used : 使用中
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
     * 服务器ID
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
     * 服务器名称
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
     * 计费模式   - packet_cycle : 包周期   - on_demand : 按需
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
     * 标签
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
     * 过期时间，-1表示没有到期时间
     * minimum: 0
     * maximum: 2147483647
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public QuotaResourcesResponseInfo withSharedQuota(String sharedQuota) {
        this.sharedQuota = sharedQuota;
        return this;
    }

    /**
     * 是否共享配额   - shared：共享的   - unshared：非共享的
     * @return sharedQuota
     */
    public String getSharedQuota() {
        return sharedQuota;
    }

    public void setSharedQuota(String sharedQuota) {
        this.sharedQuota = sharedQuota;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaResourcesResponseInfo quotaResourcesResponseInfo = (QuotaResourcesResponseInfo) o;
        return Objects.equals(this.resourceId, quotaResourcesResponseInfo.resourceId)
            && Objects.equals(this.version, quotaResourcesResponseInfo.version)
            && Objects.equals(this.quotaStatus, quotaResourcesResponseInfo.quotaStatus)
            && Objects.equals(this.usedStatus, quotaResourcesResponseInfo.usedStatus)
            && Objects.equals(this.hostId, quotaResourcesResponseInfo.hostId)
            && Objects.equals(this.hostName, quotaResourcesResponseInfo.hostName)
            && Objects.equals(this.chargingMode, quotaResourcesResponseInfo.chargingMode)
            && Objects.equals(this.tags, quotaResourcesResponseInfo.tags)
            && Objects.equals(this.expireTime, quotaResourcesResponseInfo.expireTime)
            && Objects.equals(this.sharedQuota, quotaResourcesResponseInfo.sharedQuota);
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
            sharedQuota);
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
        sb.append("    sharedQuota: ").append(toIndentedString(sharedQuota)).append("\n");
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
