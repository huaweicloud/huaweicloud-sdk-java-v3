package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateUserFolderAssignmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_id")

    private String storageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateUserFolderReq body;

    public CreateUserFolderAssignmentRequest withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * WKS存储ID。
     * @return storageId
     */
    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public CreateUserFolderAssignmentRequest withBody(CreateUserFolderReq body) {
        this.body = body;
        return this;
    }

    public CreateUserFolderAssignmentRequest withBody(Consumer<CreateUserFolderReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateUserFolderReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateUserFolderReq getBody() {
        return body;
    }

    public void setBody(CreateUserFolderReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUserFolderAssignmentRequest that = (CreateUserFolderAssignmentRequest) obj;
        return Objects.equals(this.storageId, that.storageId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserFolderAssignmentRequest {\n");
        sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
