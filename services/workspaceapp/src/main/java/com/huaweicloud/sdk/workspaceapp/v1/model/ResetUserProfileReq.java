package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重置userprofile参数。
 */
public class ResetUserProfileReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage_assignment_id")

    private String cloudStorageAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ori_name")

    private String oriName;

    public ResetUserProfileReq withCloudStorageAssignmentId(String cloudStorageAssignmentId) {
        this.cloudStorageAssignmentId = cloudStorageAssignmentId;
        return this;
    }

    /**
     * id。
     * @return cloudStorageAssignmentId
     */
    public String getCloudStorageAssignmentId() {
        return cloudStorageAssignmentId;
    }

    public void setCloudStorageAssignmentId(String cloudStorageAssignmentId) {
        this.cloudStorageAssignmentId = cloudStorageAssignmentId;
    }

    public ResetUserProfileReq withOriName(String oriName) {
        this.oriName = oriName;
        return this;
    }

    /**
     * 重置文件名称
     * @return oriName
     */
    public String getOriName() {
        return oriName;
    }

    public void setOriName(String oriName) {
        this.oriName = oriName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetUserProfileReq that = (ResetUserProfileReq) obj;
        return Objects.equals(this.cloudStorageAssignmentId, that.cloudStorageAssignmentId)
            && Objects.equals(this.oriName, that.oriName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudStorageAssignmentId, oriName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetUserProfileReq {\n");
        sb.append("    cloudStorageAssignmentId: ").append(toIndentedString(cloudStorageAssignmentId)).append("\n");
        sb.append("    oriName: ").append(toIndentedString(oriName)).append("\n");
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
