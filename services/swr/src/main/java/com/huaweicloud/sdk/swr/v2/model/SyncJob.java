package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SyncJob
 */
public class SyncJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdAt")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainID")

    private String domainID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainName")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    private Boolean override;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteNamespace")

    private String remoteNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteRegionId")

    private String remoteRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoName")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncOperatorId")

    private String syncOperatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncOperatorName")

    private String syncOperatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updatedAt")

    private String updatedAt;

    public SyncJob withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间，UTC日期格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SyncJob withDomainID(String domainID) {
        this.domainID = domainID;
        return this;
    }

    /**
     * 租户ID
     * @return domainID
     */
    public String getDomainID() {
        return domainID;
    }

    public void setDomainID(String domainID) {
        this.domainID = domainID;
    }

    public SyncJob withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 租户名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public SyncJob withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SyncJob withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public SyncJob withOverride(Boolean override) {
        this.override = override;
        return this;
    }

    /**
     * 是否覆盖
     * @return override
     */
    public Boolean getOverride() {
        return override;
    }

    public void setOverride(Boolean override) {
        this.override = override;
    }

    public SyncJob withRemoteNamespace(String remoteNamespace) {
        this.remoteNamespace = remoteNamespace;
        return this;
    }

    /**
     * 目的组织
     * @return remoteNamespace
     */
    public String getRemoteNamespace() {
        return remoteNamespace;
    }

    public void setRemoteNamespace(String remoteNamespace) {
        this.remoteNamespace = remoteNamespace;
    }

    public SyncJob withRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
        return this;
    }

    /**
     * 目的region
     * @return remoteRegionId
     */
    public String getRemoteRegionId() {
        return remoteRegionId;
    }

    public void setRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
    }

    public SyncJob withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 仓库名
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public SyncJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 同步状态,waiting、running、success、failed、timeout、cancel、existed
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SyncJob withSyncOperatorId(String syncOperatorId) {
        this.syncOperatorId = syncOperatorId;
        return this;
    }

    /**
     * 操作用户ID
     * @return syncOperatorId
     */
    public String getSyncOperatorId() {
        return syncOperatorId;
    }

    public void setSyncOperatorId(String syncOperatorId) {
        this.syncOperatorId = syncOperatorId;
    }

    public SyncJob withSyncOperatorName(String syncOperatorName) {
        this.syncOperatorName = syncOperatorName;
        return this;
    }

    /**
     * 操作用户名
     * @return syncOperatorName
     */
    public String getSyncOperatorName() {
        return syncOperatorName;
    }

    public void setSyncOperatorName(String syncOperatorName) {
        this.syncOperatorName = syncOperatorName;
    }

    public SyncJob withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 镜像版本
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public SyncJob withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * updatedAt
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncJob that = (SyncJob) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.domainID, that.domainID)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.override, that.override)
            && Objects.equals(this.remoteNamespace, that.remoteNamespace)
            && Objects.equals(this.remoteRegionId, that.remoteRegionId) && Objects.equals(this.repoName, that.repoName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.syncOperatorId, that.syncOperatorId)
            && Objects.equals(this.syncOperatorName, that.syncOperatorName) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt,
            domainID,
            domainName,
            id,
            namespace,
            override,
            remoteNamespace,
            remoteRegionId,
            repoName,
            status,
            syncOperatorId,
            syncOperatorName,
            tag,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncJob {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    domainID: ").append(toIndentedString(domainID)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
        sb.append("    remoteNamespace: ").append(toIndentedString(remoteNamespace)).append("\n");
        sb.append("    remoteRegionId: ").append(toIndentedString(remoteRegionId)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    syncOperatorId: ").append(toIndentedString(syncOperatorId)).append("\n");
        sb.append("    syncOperatorName: ").append(toIndentedString(syncOperatorName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
