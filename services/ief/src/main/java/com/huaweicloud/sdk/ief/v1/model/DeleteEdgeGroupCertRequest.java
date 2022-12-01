package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEdgeGroupCertRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_cert_id")

    private String groupCertId;

    public DeleteEdgeGroupCertRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，专业版实例为空值
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public DeleteEdgeGroupCertRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 边缘节点组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DeleteEdgeGroupCertRequest withGroupCertId(String groupCertId) {
        this.groupCertId = groupCertId;
        return this;
    }

    /**
     * 边缘节点组证书ID
     * @return groupCertId
     */
    public String getGroupCertId() {
        return groupCertId;
    }

    public void setGroupCertId(String groupCertId) {
        this.groupCertId = groupCertId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteEdgeGroupCertRequest deleteEdgeGroupCertRequest = (DeleteEdgeGroupCertRequest) o;
        return Objects.equals(this.iefInstanceId, deleteEdgeGroupCertRequest.iefInstanceId)
            && Objects.equals(this.groupId, deleteEdgeGroupCertRequest.groupId)
            && Objects.equals(this.groupCertId, deleteEdgeGroupCertRequest.groupCertId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, groupId, groupCertId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEdgeGroupCertRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupCertId: ").append(toIndentedString(groupCertId)).append("\n");
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
