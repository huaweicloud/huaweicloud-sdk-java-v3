package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 恢复集群对象信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 快照ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 恢复时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 原始集群ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestorePoint that = (RestorePoint) obj;
        return Objects.equals(this.backRef, that.backRef) && Objects.equals(this.restoreTime, that.restoreTime)
            && Objects.equals(this.clusterId, that.clusterId);
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
