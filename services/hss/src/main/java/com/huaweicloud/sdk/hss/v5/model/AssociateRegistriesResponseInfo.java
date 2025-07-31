package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AssociateRegistriesResponseInfo
 */
public class AssociateRegistriesResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_id")

    private String registryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_status")

    private String syncStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    public AssociateRegistriesResponseInfo withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * 镜像仓库ID
     * @return registryId
     */
    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public AssociateRegistriesResponseInfo withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * 镜像仓库名称
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public AssociateRegistriesResponseInfo withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * **参数解释**: 镜像仓库类型 **取值范围**: - SwrPrivate：swr私有。 - SwrShared：swr共享。 - SwrEnterprise：swr企业。 - Harbor：harbor仓库。 - Jfrog：jfrog仓库。 - Other：其他仓库。 
     * @return registryType
     */
    public String getRegistryType() {
        return registryType;
    }

    public void setRegistryType(String registryType) {
        this.registryType = registryType;
    }

    public AssociateRegistriesResponseInfo withSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * 同步状态，包含如下3种。   - finished ：同步完成。   - running ：正在同步。   - failed ：同步失败。
     * @return syncStatus
     */
    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public AssociateRegistriesResponseInfo withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateRegistriesResponseInfo that = (AssociateRegistriesResponseInfo) obj;
        return Objects.equals(this.registryId, that.registryId) && Objects.equals(this.registryName, that.registryName)
            && Objects.equals(this.registryType, that.registryType) && Objects.equals(this.syncStatus, that.syncStatus)
            && Objects.equals(this.failedReason, that.failedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryId, registryName, registryType, syncStatus, failedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateRegistriesResponseInfo {\n");
        sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
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
