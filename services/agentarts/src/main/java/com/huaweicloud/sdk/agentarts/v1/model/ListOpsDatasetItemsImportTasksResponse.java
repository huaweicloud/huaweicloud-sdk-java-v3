package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOpsDatasetItemsImportTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_tasks")

    private List<OpsImportTaskOutput> importTasks = null;

    public ListOpsDatasetItemsImportTasksResponse withImportTasks(List<OpsImportTaskOutput> importTasks) {
        this.importTasks = importTasks;
        return this;
    }

    public ListOpsDatasetItemsImportTasksResponse addImportTasksItem(OpsImportTaskOutput importTasksItem) {
        if (this.importTasks == null) {
            this.importTasks = new ArrayList<>();
        }
        this.importTasks.add(importTasksItem);
        return this;
    }

    public ListOpsDatasetItemsImportTasksResponse withImportTasks(
        Consumer<List<OpsImportTaskOutput>> importTasksSetter) {
        if (this.importTasks == null) {
            this.importTasks = new ArrayList<>();
        }
        importTasksSetter.accept(this.importTasks);
        return this;
    }

    /**
     * **参数解释：** 包含多个导入任务详细执行状态的集合。 **取值范围：** 符合 OpsImportTaskOutput 结构的对象数组。 
     * @return importTasks
     */
    public List<OpsImportTaskOutput> getImportTasks() {
        return importTasks;
    }

    public void setImportTasks(List<OpsImportTaskOutput> importTasks) {
        this.importTasks = importTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsDatasetItemsImportTasksResponse that = (ListOpsDatasetItemsImportTasksResponse) obj;
        return Objects.equals(this.importTasks, that.importTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsDatasetItemsImportTasksResponse {\n");
        sb.append("    importTasks: ").append(toIndentedString(importTasks)).append("\n");
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
