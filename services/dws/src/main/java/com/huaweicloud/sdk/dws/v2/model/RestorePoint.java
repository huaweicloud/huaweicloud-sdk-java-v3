package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 恢复集群
 */
public class RestorePoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_ref")

    private String backRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private Long restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public RestorePoint withBackRef(String backRef) {
        this.backRef = backRef;
        return this;
    }

    /**
     * 快照ID
     * @return backRef
     */
    public String getBackRef() {
        return backRef;
    }

    public void setBackRef(String backRef) {
        this.backRef = backRef;
    }

    public RestorePoint withRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 恢复时间
     * @return restoreTime
     */
    public Long getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
    }

    public RestorePoint withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestorePoint restorePoint = (RestorePoint) o;
        return Objects.equals(this.backRef, restorePoint.backRef)
            && Objects.equals(this.restoreTime, restorePoint.restoreTime)
            && Objects.equals(this.clusterId, restorePoint.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backRef, restoreTime, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestorePoint {\n");
        sb.append("    backRef: ").append(toIndentedString(backRef)).append("\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
