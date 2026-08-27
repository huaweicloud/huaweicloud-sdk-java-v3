package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  开启无锁变更任务请求体。
 */
public class StartOnlineDDLTaskRequestV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_clear")

    private Boolean autoClear;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_content")

    private List<StartOnlineTaskContentItem> taskContent = null;

    public StartOnlineDDLTaskRequestV3 withAutoClear(Boolean autoClear) {
        this.autoClear = autoClear;
        return this;
    }

    /**
     * **参数解释**：  是否开启自动清理临时表。  **约束限制**：  不涉及。  **取值范围**： - true：开启自动清理临时表。 - false：关闭自动清理临时表。  **默认取值**：  false。
     * @return autoClear
     */
    public Boolean getAutoClear() {
        return autoClear;
    }

    public void setAutoClear(Boolean autoClear) {
        this.autoClear = autoClear;
    }

    public StartOnlineDDLTaskRequestV3 withTaskContent(List<StartOnlineTaskContentItem> taskContent) {
        this.taskContent = taskContent;
        return this;
    }

    public StartOnlineDDLTaskRequestV3 addTaskContentItem(StartOnlineTaskContentItem taskContentItem) {
        if (this.taskContent == null) {
            this.taskContent = new ArrayList<>();
        }
        this.taskContent.add(taskContentItem);
        return this;
    }

    public StartOnlineDDLTaskRequestV3 withTaskContent(Consumer<List<StartOnlineTaskContentItem>> taskContentSetter) {
        if (this.taskContent == null) {
            this.taskContent = new ArrayList<>();
        }
        taskContentSetter.accept(this.taskContent);
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务详细内容。  **约束限制**：  不涉及。
     * @return taskContent
     */
    public List<StartOnlineTaskContentItem> getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(List<StartOnlineTaskContentItem> taskContent) {
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
        StartOnlineDDLTaskRequestV3 that = (StartOnlineDDLTaskRequestV3) obj;
        return Objects.equals(this.autoClear, that.autoClear) && Objects.equals(this.taskContent, that.taskContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoClear, taskContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartOnlineDDLTaskRequestV3 {\n");
        sb.append("    autoClear: ").append(toIndentedString(autoClear)).append("\n");
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
