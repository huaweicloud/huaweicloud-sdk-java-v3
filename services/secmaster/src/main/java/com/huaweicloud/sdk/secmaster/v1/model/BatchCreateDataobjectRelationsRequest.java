package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateDataobjectRelationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_type")

    private String dataclassType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_dataclass_type")

    private String relatedDataclassType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateDataobjectRelationsRequestBody body;

    public BatchCreateDataobjectRelationsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间id。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public BatchCreateDataobjectRelationsRequest withDataclassType(String dataclassType) {
        this.dataclassType = dataclassType;
        return this;
    }

    /**
     * 关联主体数据对象所属数据类，小写复数，如告警为alerts，事件为incidents
     * @return dataclassType
     */
    public String getDataclassType() {
        return dataclassType;
    }

    public void setDataclassType(String dataclassType) {
        this.dataclassType = dataclassType;
    }

    public BatchCreateDataobjectRelationsRequest withRelatedDataclassType(String relatedDataclassType) {
        this.relatedDataclassType = relatedDataclassType;
        return this;
    }

    /**
     * 被关联的数据对象所属数据类，小写复数，如告警为alerts，事件为incidents
     * @return relatedDataclassType
     */
    public String getRelatedDataclassType() {
        return relatedDataclassType;
    }

    public void setRelatedDataclassType(String relatedDataclassType) {
        this.relatedDataclassType = relatedDataclassType;
    }

    public BatchCreateDataobjectRelationsRequest withBody(BatchCreateDataobjectRelationsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateDataobjectRelationsRequest withBody(
        Consumer<BatchCreateDataobjectRelationsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateDataobjectRelationsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateDataobjectRelationsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateDataobjectRelationsRequestBody body) {
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
        BatchCreateDataobjectRelationsRequest that = (BatchCreateDataobjectRelationsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.dataclassType, that.dataclassType)
            && Objects.equals(this.relatedDataclassType, that.relatedDataclassType)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, dataclassType, relatedDataclassType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDataobjectRelationsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataclassType: ").append(toIndentedString(dataclassType)).append("\n");
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
