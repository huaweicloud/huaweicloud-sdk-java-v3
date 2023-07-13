package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteLakeFormationInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_recycle_bin")

    private Boolean toRecycleBin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public DeleteLakeFormationInstanceRequest withToRecycleBin(Boolean toRecycleBin) {
        this.toRecycleBin = toRecycleBin;
        return this;
    }

    /**
     * 是否放入回收站
     * @return toRecycleBin
     */
    public Boolean getToRecycleBin() {
        return toRecycleBin;
    }

    public void setToRecycleBin(Boolean toRecycleBin) {
        this.toRecycleBin = toRecycleBin;
    }

    public DeleteLakeFormationInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * LakeFormation实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteLakeFormationInstanceRequest that = (DeleteLakeFormationInstanceRequest) obj;
        return Objects.equals(this.toRecycleBin, that.toRecycleBin) && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toRecycleBin, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLakeFormationInstanceRequest {\n");
        sb.append("    toRecycleBin: ").append(toIndentedString(toRecycleBin)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
