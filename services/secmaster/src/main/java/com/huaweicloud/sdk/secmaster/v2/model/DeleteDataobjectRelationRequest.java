package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteDataobjectRelationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_type")

    private String dataclassType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object_id")

    private String dataObjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_dataclass_type")

    private String relatedDataclassType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateRelation body;

    public DeleteDataobjectRelationRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * ID of workspace
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public DeleteDataobjectRelationRequest withDataclassType(String dataclassType) {
        this.dataclassType = dataclassType;
        return this;
    }

    /**
     * type of dataclass
     * @return dataclassType
     */
    public String getDataclassType() {
        return dataclassType;
    }

    public void setDataclassType(String dataclassType) {
        this.dataclassType = dataclassType;
    }

    public DeleteDataobjectRelationRequest withDataObjectId(String dataObjectId) {
        this.dataObjectId = dataObjectId;
        return this;
    }

    /**
     * ID of dataobject
     * @return dataObjectId
     */
    public String getDataObjectId() {
        return dataObjectId;
    }

    public void setDataObjectId(String dataObjectId) {
        this.dataObjectId = dataObjectId;
    }

    public DeleteDataobjectRelationRequest withRelatedDataclassType(String relatedDataclassType) {
        this.relatedDataclassType = relatedDataclassType;
        return this;
    }

    /**
     * type of related dataclass
     * @return relatedDataclassType
     */
    public String getRelatedDataclassType() {
        return relatedDataclassType;
    }

    public void setRelatedDataclassType(String relatedDataclassType) {
        this.relatedDataclassType = relatedDataclassType;
    }

    public DeleteDataobjectRelationRequest withBody(CreateRelation body) {
        this.body = body;
        return this;
    }

    public DeleteDataobjectRelationRequest withBody(Consumer<CreateRelation> bodySetter) {
        if (this.body == null) {
            this.body = new CreateRelation();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateRelation getBody() {
        return body;
    }

    public void setBody(CreateRelation body) {
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
        DeleteDataobjectRelationRequest that = (DeleteDataobjectRelationRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.dataclassType, that.dataclassType)
            && Objects.equals(this.dataObjectId, that.dataObjectId)
            && Objects.equals(this.relatedDataclassType, that.relatedDataclassType)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, dataclassType, dataObjectId, relatedDataclassType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDataobjectRelationRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataclassType: ").append(toIndentedString(dataclassType)).append("\n");
        sb.append("    dataObjectId: ").append(toIndentedString(dataObjectId)).append("\n");
        sb.append("    relatedDataclassType: ").append(toIndentedString(relatedDataclassType)).append("\n");
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
