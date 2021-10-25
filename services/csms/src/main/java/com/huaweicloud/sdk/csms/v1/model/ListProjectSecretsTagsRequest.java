package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListProjectSecretsTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    public ListProjectSecretsTagsRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /** API版本号
     * 
     * @return versionId */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectSecretsTagsRequest listProjectSecretsTagsRequest = (ListProjectSecretsTagsRequest) o;
        return Objects.equals(this.versionId, listProjectSecretsTagsRequest.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectSecretsTagsRequest {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
