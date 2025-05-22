package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 快照跨区域配置信息
 */
public class CrossRegionSnapshotConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_region")

    private String sourceRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_keep_day")

    private Integer backKeepDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Long totalSize;

    public CrossRegionSnapshotConfig withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。 **取值范围**： 36位UUID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CrossRegionSnapshotConfig withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CrossRegionSnapshotConfig withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * 源区域
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    public CrossRegionSnapshotConfig withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源项目ID
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public CrossRegionSnapshotConfig withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 目的区域
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public CrossRegionSnapshotConfig withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    /**
     * 目的项目ID
     * @return destinationProjectId
     */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public CrossRegionSnapshotConfig withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public CrossRegionSnapshotConfig withBackKeepDay(Integer backKeepDay) {
        this.backKeepDay = backKeepDay;
        return this;
    }

    /**
     * 保存时间
     * @return backKeepDay
     */
    public Integer getBackKeepDay() {
        return backKeepDay;
    }

    public void setBackKeepDay(Integer backKeepDay) {
        this.backKeepDay = backKeepDay;
    }

    public CrossRegionSnapshotConfig withTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 总大小
     * @return totalSize
     */
    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrossRegionSnapshotConfig that = (CrossRegionSnapshotConfig) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.sourceRegion, that.sourceRegion)
            && Objects.equals(this.sourceProjectId, that.sourceProjectId)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.destinationProjectId, that.destinationProjectId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.backKeepDay, that.backKeepDay)
            && Objects.equals(this.totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            clusterName,
            sourceRegion,
            sourceProjectId,
            destinationRegion,
            destinationProjectId,
            status,
            backKeepDay,
            totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CrossRegionSnapshotConfig {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    backKeepDay: ").append(toIndentedString(backKeepDay)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
