package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteDataobjectRelationsRequest {

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

    private CreateDataobjectRelationsRequestBody body;

    public DeleteDataobjectRelationsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public DeleteDataobjectRelationsRequest withDataclassType(String dataclassType) {
        this.dataclassType = dataclassType;
        return this;
    }

    /**
     * 关联主体dataobject所属数据类，小写复数，如告警为alerts，事件为incidents
     * @return dataclassType
     */
    public String getDataclassType() {
        return dataclassType;
    }

    public void setDataclassType(String dataclassType) {
        this.dataclassType = dataclassType;
    }

    public DeleteDataobjectRelationsRequest withDataObjectId(String dataObjectId) {
        this.dataObjectId = dataObjectId;
        return this;
    }

    /**
     * 关联主体dataobject的id
     * @return dataObjectId
     */
    public String getDataObjectId() {
        return dataObjectId;
    }

    public void setDataObjectId(String dataObjectId) {
        this.dataObjectId = dataObjectId;
    }

    public DeleteDataobjectRelationsRequest withRelatedDataclassType(String relatedDataclassType) {
        this.relatedDataclassType = relatedDataclassType;
        return this;
    }

    /**
     * 被关联的dataobject所属数据类，小写复数，如告警为alerts，事件为incidents
     * @return relatedDataclassType
     */
    public String getRelatedDataclassType() {
        return relatedDataclassType;
    }

    public void setRelatedDataclassType(String relatedDataclassType) {
        this.relatedDataclassType = relatedDataclassType;
    }

    public DeleteDataobjectRelationsRequest withBody(CreateDataobjectRelationsRequestBody body) {
        this.body = body;
        return this;
    }

    public DeleteDataobjectRelationsRequest withBody(Consumer<CreateDataobjectRelationsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateDataobjectRelationsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateDataobjectRelationsRequestBody getBody() {
        return body;
    }

    public void setBody(CreateDataobjectRelationsRequestBody body) {
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
        DeleteDataobjectRelationsRequest that = (DeleteDataobjectRelationsRequest) obj;
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
        sb.append("class DeleteDataobjectRelationsRequest {\n");
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
