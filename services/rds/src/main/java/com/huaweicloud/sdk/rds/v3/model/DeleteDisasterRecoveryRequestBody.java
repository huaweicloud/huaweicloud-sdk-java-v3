package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 解除实例容灾关系请求体
 */
public class DeleteDisasterRecoveryRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_region")

    private String targetRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ip")

    private String targetIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_master")

    private Boolean isMaster;

    public DeleteDisasterRecoveryRequestBody withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    /**
     * 解除目标的实例id
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    public DeleteDisasterRecoveryRequestBody withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 解除目标的project id
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public DeleteDisasterRecoveryRequestBody withTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
        return this;
    }

    /**
     * 解除目标的region
     * @return targetRegion
     */
    public String getTargetRegion() {
        return targetRegion;
    }

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    public DeleteDisasterRecoveryRequestBody withTargetIp(String targetIp) {
        this.targetIp = targetIp;
        return this;
    }

    /**
     * 解除目标的数据浮动ip
     * @return targetIp
     */
    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

    public DeleteDisasterRecoveryRequestBody withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * 当前操作对象是否是主实例
     * @return isMaster
     */
    public Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDisasterRecoveryRequestBody that = (DeleteDisasterRecoveryRequestBody) obj;
        return Objects.equals(this.targetInstanceId, that.targetInstanceId)
            && Objects.equals(this.targetProjectId, that.targetProjectId)
            && Objects.equals(this.targetRegion, that.targetRegion) && Objects.equals(this.targetIp, that.targetIp)
            && Objects.equals(this.isMaster, that.isMaster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetInstanceId, targetProjectId, targetRegion, targetIp, isMaster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDisasterRecoveryRequestBody {\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    targetRegion: ").append(toIndentedString(targetRegion)).append("\n");
        sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");
        sb.append("    isMaster: ").append(toIndentedString(isMaster)).append("\n");
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
