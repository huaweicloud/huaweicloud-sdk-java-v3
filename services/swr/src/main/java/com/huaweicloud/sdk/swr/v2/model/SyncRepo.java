package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SyncRepo
 */
public class SyncRepo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdAt")

    @JacksonXmlProperty(localName = "createdAt")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainID")

    @JacksonXmlProperty(localName = "domainID")

    private String domainID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainName")

    @JacksonXmlProperty(localName = "domainName")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    @JacksonXmlProperty(localName = "override")

    private Boolean override;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteNamespace")

    @JacksonXmlProperty(localName = "remoteNamespace")

    private String remoteNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteRegionId")

    @JacksonXmlProperty(localName = "remoteRegionId")

    private String remoteRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoName")

    @JacksonXmlProperty(localName = "repoName")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncAuto")

    @JacksonXmlProperty(localName = "syncAuto")

    private Boolean syncAuto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updatedAt")

    @JacksonXmlProperty(localName = "updatedAt")

    private String updatedAt;

    public SyncRepo withCreatedAt(String createdAt) {
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

    public SyncRepo withDomainID(String domainID) {
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

    public SyncRepo withDomainName(String domainName) {
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

    public SyncRepo withId(Integer id) {
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

    public SyncRepo withNamespace(String namespace) {
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

    public SyncRepo withOverride(Boolean override) {
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

    public SyncRepo withRemoteNamespace(String remoteNamespace) {
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

    public SyncRepo withRemoteRegionId(String remoteRegionId) {
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

    public SyncRepo withRepoName(String repoName) {
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

    public SyncRepo withSyncAuto(Boolean syncAuto) {
        this.syncAuto = syncAuto;
        return this;
    }

    /**
     * 自动同步
     * @return syncAuto
     */
    public Boolean getSyncAuto() {
        return syncAuto;
    }

    public void setSyncAuto(Boolean syncAuto) {
        this.syncAuto = syncAuto;
    }

    public SyncRepo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间，UTC日期格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncRepo syncRepo = (SyncRepo) o;
        return Objects.equals(this.createdAt, syncRepo.createdAt) && Objects.equals(this.domainID, syncRepo.domainID)
            && Objects.equals(this.domainName, syncRepo.domainName) && Objects.equals(this.id, syncRepo.id)
            && Objects.equals(this.namespace, syncRepo.namespace) && Objects.equals(this.override, syncRepo.override)
            && Objects.equals(this.remoteNamespace, syncRepo.remoteNamespace)
            && Objects.equals(this.remoteRegionId, syncRepo.remoteRegionId)
            && Objects.equals(this.repoName, syncRepo.repoName) && Objects.equals(this.syncAuto, syncRepo.syncAuto)
            && Objects.equals(this.updatedAt, syncRepo.updatedAt);
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
            syncAuto,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncRepo {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    domainID: ").append(toIndentedString(domainID)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
        sb.append("    remoteNamespace: ").append(toIndentedString(remoteNamespace)).append("\n");
        sb.append("    remoteRegionId: ").append(toIndentedString(remoteRegionId)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    syncAuto: ").append(toIndentedString(syncAuto)).append("\n");
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
