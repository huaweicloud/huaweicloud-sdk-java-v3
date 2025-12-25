package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateDatapanelObjectsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass")

    private String dataclass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DataObjectBatchCreateForm body;

    public BatchCreateDatapanelObjectsRequest withWorkspaceId(String workspaceId) {
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

    public BatchCreateDatapanelObjectsRequest withDataclass(String dataclass) {
        this.dataclass = dataclass;
        return this;
    }

    /**
     * 数据类ID, 您可通过调用[查询数据类列表](ListDataclass.xml)接口获取数据类ID
     * @return dataclass
     */
    public String getDataclass() {
        return dataclass;
    }

    public void setDataclass(String dataclass) {
        this.dataclass = dataclass;
    }

    public BatchCreateDatapanelObjectsRequest withBody(DataObjectBatchCreateForm body) {
        this.body = body;
        return this;
    }

    public BatchCreateDatapanelObjectsRequest withBody(Consumer<DataObjectBatchCreateForm> bodySetter) {
        if (this.body == null) {
            this.body = new DataObjectBatchCreateForm();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DataObjectBatchCreateForm getBody() {
        return body;
    }

    public void setBody(DataObjectBatchCreateForm body) {
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
        BatchCreateDatapanelObjectsRequest that = (BatchCreateDatapanelObjectsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.dataclass, that.dataclass)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, dataclass, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDatapanelObjectsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataclass: ").append(toIndentedString(dataclass)).append("\n");
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
