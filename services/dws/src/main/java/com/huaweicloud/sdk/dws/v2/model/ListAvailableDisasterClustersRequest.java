package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAvailableDisasterClustersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_id")

    private String primaryClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_spec_id")

    private String primarySpecId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_dn_num")

    private String primaryClusterDnNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_region")

    private String standbyRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_project_id")

    private String standbyProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_az_code")

    private String standbyAzCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_type")

    private String drType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    public ListAvailableDisasterClustersRequest withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * 主集群ID
     * @return primaryClusterId
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }

    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    public ListAvailableDisasterClustersRequest withPrimarySpecId(String primarySpecId) {
        this.primarySpecId = primarySpecId;
        return this;
    }

    /**
     * 主集群规格ID
     * @return primarySpecId
     */
    public String getPrimarySpecId() {
        return primarySpecId;
    }

    public void setPrimarySpecId(String primarySpecId) {
        this.primarySpecId = primarySpecId;
    }

    public ListAvailableDisasterClustersRequest withPrimaryClusterDnNum(String primaryClusterDnNum) {
        this.primaryClusterDnNum = primaryClusterDnNum;
        return this;
    }

    /**
     * 主集群DN数量
     * @return primaryClusterDnNum
     */
    public String getPrimaryClusterDnNum() {
        return primaryClusterDnNum;
    }

    public void setPrimaryClusterDnNum(String primaryClusterDnNum) {
        this.primaryClusterDnNum = primaryClusterDnNum;
    }

    public ListAvailableDisasterClustersRequest withStandbyRegion(String standbyRegion) {
        this.standbyRegion = standbyRegion;
        return this;
    }

    /**
     * 备集群所在region
     * @return standbyRegion
     */
    public String getStandbyRegion() {
        return standbyRegion;
    }

    public void setStandbyRegion(String standbyRegion) {
        this.standbyRegion = standbyRegion;
    }

    public ListAvailableDisasterClustersRequest withStandbyProjectId(String standbyProjectId) {
        this.standbyProjectId = standbyProjectId;
        return this;
    }

    /**
     * 备集群项目ID
     * @return standbyProjectId
     */
    public String getStandbyProjectId() {
        return standbyProjectId;
    }

    public void setStandbyProjectId(String standbyProjectId) {
        this.standbyProjectId = standbyProjectId;
    }

    public ListAvailableDisasterClustersRequest withStandbyAzCode(String standbyAzCode) {
        this.standbyAzCode = standbyAzCode;
        return this;
    }

    /**
     * 备集群所在AZ
     * @return standbyAzCode
     */
    public String getStandbyAzCode() {
        return standbyAzCode;
    }

    public void setStandbyAzCode(String standbyAzCode) {
        this.standbyAzCode = standbyAzCode;
    }

    public ListAvailableDisasterClustersRequest withDrType(String drType) {
        this.drType = drType;
        return this;
    }

    /**
     * 容灾类型
     * @return drType
     */
    public String getDrType() {
        return drType;
    }

    public void setDrType(String drType) {
        this.drType = drType;
    }

    public ListAvailableDisasterClustersRequest withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数仓类型
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ListAvailableDisasterClustersRequest withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * 数仓版本
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailableDisasterClustersRequest listAvailableDisasterClustersRequest =
            (ListAvailableDisasterClustersRequest) o;
        return Objects.equals(this.primaryClusterId, listAvailableDisasterClustersRequest.primaryClusterId)
            && Objects.equals(this.primarySpecId, listAvailableDisasterClustersRequest.primarySpecId)
            && Objects.equals(this.primaryClusterDnNum, listAvailableDisasterClustersRequest.primaryClusterDnNum)
            && Objects.equals(this.standbyRegion, listAvailableDisasterClustersRequest.standbyRegion)
            && Objects.equals(this.standbyProjectId, listAvailableDisasterClustersRequest.standbyProjectId)
            && Objects.equals(this.standbyAzCode, listAvailableDisasterClustersRequest.standbyAzCode)
            && Objects.equals(this.drType, listAvailableDisasterClustersRequest.drType)
            && Objects.equals(this.datastoreType, listAvailableDisasterClustersRequest.datastoreType)
            && Objects.equals(this.datastoreVersion, listAvailableDisasterClustersRequest.datastoreVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryClusterId,
            primarySpecId,
            primaryClusterDnNum,
            standbyRegion,
            standbyProjectId,
            standbyAzCode,
            drType,
            datastoreType,
            datastoreVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableDisasterClustersRequest {\n");
        sb.append("    primaryClusterId: ").append(toIndentedString(primaryClusterId)).append("\n");
        sb.append("    primarySpecId: ").append(toIndentedString(primarySpecId)).append("\n");
        sb.append("    primaryClusterDnNum: ").append(toIndentedString(primaryClusterDnNum)).append("\n");
        sb.append("    standbyRegion: ").append(toIndentedString(standbyRegion)).append("\n");
        sb.append("    standbyProjectId: ").append(toIndentedString(standbyProjectId)).append("\n");
        sb.append("    standbyAzCode: ").append(toIndentedString(standbyAzCode)).append("\n");
        sb.append("    drType: ").append(toIndentedString(drType)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
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
