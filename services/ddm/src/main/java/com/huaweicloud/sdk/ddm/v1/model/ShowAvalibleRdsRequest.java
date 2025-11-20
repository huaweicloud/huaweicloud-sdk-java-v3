package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAvalibleRdsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_dn_instance_id")

    private String sourceDnInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private String restoreTime;

    public ShowAvalibleRdsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例 ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowAvalibleRdsRequest withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    /**
     * 目标实例 ID。
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    public ShowAvalibleRdsRequest withSourceDnInstanceId(String sourceDnInstanceId) {
        this.sourceDnInstanceId = sourceDnInstanceId;
        return this;
    }

    /**
     * 源DN实例 ID。
     * @return sourceDnInstanceId
     */
    public String getSourceDnInstanceId() {
        return sourceDnInstanceId;
    }

    public void setSourceDnInstanceId(String sourceDnInstanceId) {
        this.sourceDnInstanceId = sourceDnInstanceId;
    }

    public ShowAvalibleRdsRequest withRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 恢复时间。
     * @return restoreTime
     */
    public String getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvalibleRdsRequest that = (ShowAvalibleRdsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.targetInstanceId, that.targetInstanceId)
            && Objects.equals(this.sourceDnInstanceId, that.sourceDnInstanceId)
            && Objects.equals(this.restoreTime, that.restoreTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, targetInstanceId, sourceDnInstanceId, restoreTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvalibleRdsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    sourceDnInstanceId: ").append(toIndentedString(sourceDnInstanceId)).append("\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
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
