package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetServiceLinkedAgencyDeletionStatusV5Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletion_task_id")

    private String deletionTaskId;

    public GetServiceLinkedAgencyDeletionStatusV5Request withDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
        return this;
    }

    /**
     * 删除任务ID。
     * @return deletionTaskId
     */
    public String getDeletionTaskId() {
        return deletionTaskId;
    }

    public void setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetServiceLinkedAgencyDeletionStatusV5Request that = (GetServiceLinkedAgencyDeletionStatusV5Request) obj;
        return Objects.equals(this.deletionTaskId, that.deletionTaskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deletionTaskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetServiceLinkedAgencyDeletionStatusV5Request {\n");
        sb.append("    deletionTaskId: ").append(toIndentedString(deletionTaskId)).append("\n");
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
