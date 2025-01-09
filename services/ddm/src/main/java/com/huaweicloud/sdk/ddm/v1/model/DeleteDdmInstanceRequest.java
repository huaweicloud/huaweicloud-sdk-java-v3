package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDdmInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_dn_data")

    private Boolean deleteDnData;

    public DeleteDdmInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DDM实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteDdmInstanceRequest withDeleteDnData(Boolean deleteDnData) {
        this.deleteDnData = deleteDnData;
        return this;
    }

    /**
     * 是否同时删除关联后端数据库实例上存储的数据。  - 取值true：删除。 - 取值为空或false：不删除。 默认值为空。
     * @return deleteDnData
     */
    public Boolean getDeleteDnData() {
        return deleteDnData;
    }

    public void setDeleteDnData(Boolean deleteDnData) {
        this.deleteDnData = deleteDnData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDdmInstanceRequest that = (DeleteDdmInstanceRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.deleteDnData, that.deleteDnData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, deleteDnData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDdmInstanceRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    deleteDnData: ").append(toIndentedString(deleteDnData)).append("\n");
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
