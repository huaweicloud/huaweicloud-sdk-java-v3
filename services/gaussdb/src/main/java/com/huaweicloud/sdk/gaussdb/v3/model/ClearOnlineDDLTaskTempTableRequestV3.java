package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  清理实例无锁变更任务临时表请求体。
 */
public class ClearOnlineDDLTaskTempTableRequestV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_content")

    private List<TaskContentItem> taskContent = null;

    public ClearOnlineDDLTaskTempTableRequestV3 withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**：   无锁变更任务唯一标识。  获取方法参见[查询无锁变更任务记录列表](https://support.huaweicloud.com/api-taurusdb/ListOnlineDdlTaskRecords.html)。   **约束限制**：   不涉及。   **取值范围**：   不涉及。  **默认取值**：   不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ClearOnlineDDLTaskTempTableRequestV3 withTaskContent(List<TaskContentItem> taskContent) {
        this.taskContent = taskContent;
        return this;
    }

    public ClearOnlineDDLTaskTempTableRequestV3 addTaskContentItem(TaskContentItem taskContentItem) {
        if (this.taskContent == null) {
            this.taskContent = new ArrayList<>();
        }
        this.taskContent.add(taskContentItem);
        return this;
    }

    public ClearOnlineDDLTaskTempTableRequestV3 withTaskContent(Consumer<List<TaskContentItem>> taskContentSetter) {
        if (this.taskContent == null) {
            this.taskContent = new ArrayList<>();
        }
        taskContentSetter.accept(this.taskContent);
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务详细内容，包含目标数据库和临时表名。  **约束限制**：  不涉及。
     * @return taskContent
     */
    public List<TaskContentItem> getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(List<TaskContentItem> taskContent) {
        this.taskContent = taskContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClearOnlineDDLTaskTempTableRequestV3 that = (ClearOnlineDDLTaskTempTableRequestV3) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskContent, that.taskContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClearOnlineDDLTaskTempTableRequestV3 {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskContent: ").append(toIndentedString(taskContent)).append("\n");
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
