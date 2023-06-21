package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchAssociateSecurityLevelToEntitiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BulkSecurityLevel body;

    public BatchAssociateSecurityLevelToEntitiesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public BatchAssociateSecurityLevelToEntitiesRequest withBody(BulkSecurityLevel body) {
        this.body = body;
        return this;
    }

    public BatchAssociateSecurityLevelToEntitiesRequest withBody(Consumer<BulkSecurityLevel> bodySetter) {
        if (this.body == null) {
            this.body = new BulkSecurityLevel();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BulkSecurityLevel getBody() {
        return body;
    }

    public void setBody(BulkSecurityLevel body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAssociateSecurityLevelToEntitiesRequest batchAssociateSecurityLevelToEntitiesRequest =
            (BatchAssociateSecurityLevelToEntitiesRequest) o;
        return Objects.equals(this.workspace, batchAssociateSecurityLevelToEntitiesRequest.workspace)
            && Objects.equals(this.body, batchAssociateSecurityLevelToEntitiesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAssociateSecurityLevelToEntitiesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
