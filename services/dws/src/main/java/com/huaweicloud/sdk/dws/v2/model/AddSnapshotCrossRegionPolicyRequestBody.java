package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置快照跨区域策略请求信息
 */
public class AddSnapshotCrossRegionPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_keep_day")

    private Integer backKeepDay;

    public AddSnapshotCrossRegionPolicyRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。获取方式方法请参见[获取集群ID](dws_02_00068.xml)。 **约束限制**： 必须是有效的dws集群ID。 **取值范围**： 36位UUID。 **默认取值**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public AddSnapshotCrossRegionPolicyRequestBody withDestinationProjectId(String destinationProjectId) {
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

    public AddSnapshotCrossRegionPolicyRequestBody withDestinationRegion(String destinationRegion) {
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

    public AddSnapshotCrossRegionPolicyRequestBody withStatus(Boolean status) {
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

    public AddSnapshotCrossRegionPolicyRequestBody withBackKeepDay(Integer backKeepDay) {
        this.backKeepDay = backKeepDay;
        return this;
    }

    /**
     * 保留天数
     * @return backKeepDay
     */
    public Integer getBackKeepDay() {
        return backKeepDay;
    }

    public void setBackKeepDay(Integer backKeepDay) {
        this.backKeepDay = backKeepDay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddSnapshotCrossRegionPolicyRequestBody that = (AddSnapshotCrossRegionPolicyRequestBody) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.destinationProjectId, that.destinationProjectId)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.status, that.status) && Objects.equals(this.backKeepDay, that.backKeepDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, destinationProjectId, destinationRegion, status, backKeepDay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSnapshotCrossRegionPolicyRequestBody {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    backKeepDay: ").append(toIndentedString(backKeepDay)).append("\n");
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
