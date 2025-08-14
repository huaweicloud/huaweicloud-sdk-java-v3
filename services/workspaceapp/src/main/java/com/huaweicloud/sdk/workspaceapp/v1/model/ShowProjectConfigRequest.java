package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowProjectConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage_id")

    private String cloudStorageId;

    public ShowProjectConfigRequest withCloudStorageId(String cloudStorageId) {
        this.cloudStorageId = cloudStorageId;
        return this;
    }

    /**
     * 云存储ID。
     * @return cloudStorageId
     */
    public String getCloudStorageId() {
        return cloudStorageId;
    }

    public void setCloudStorageId(String cloudStorageId) {
        this.cloudStorageId = cloudStorageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectConfigRequest that = (ShowProjectConfigRequest) obj;
        return Objects.equals(this.cloudStorageId, that.cloudStorageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudStorageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectConfigRequest {\n");
        sb.append("    cloudStorageId: ").append(toIndentedString(cloudStorageId)).append("\n");
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
