package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取已恢复库表信息请求体
 */
public class ShowRestoreTablesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_name")

    private String workflowName;

    public ShowRestoreTablesRequestBody withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * **参数解释**：  任务流ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public ShowRestoreTablesRequestBody withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * **参数解释**：  任务名称。  **约束限制**：  不涉及。  **取值范围**：  - RestoreTableMysql - RestoreDatabaseMysql  **默认取值**：  不涉及。
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRestoreTablesRequestBody that = (ShowRestoreTablesRequestBody) obj;
        return Objects.equals(this.workflowId, that.workflowId) && Objects.equals(this.workflowName, that.workflowName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId, workflowName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRestoreTablesRequestBody {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
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
