package com.huaweicloud.sdk.dns.v2.model;

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
public class ShowBatchCreateRecordSetsTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_count")

    private Integer errorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_items")

    private List<ShowBatchCreateRecordSetsTaskErrorItem> errorItems = null;

    public ShowBatchCreateRecordSetsTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 批量创建记录集任务的ID。 **取值范围：** 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowBatchCreateRecordSetsTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 任务状态。 **取值范围：** - PENDING：处理中 - DONE：已完成
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowBatchCreateRecordSetsTaskResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 任务的创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。 **取值范围：** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowBatchCreateRecordSetsTaskResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 任务的更新时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。 **取值范围：** 不涉及。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowBatchCreateRecordSetsTaskResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释：** 批量创建记录集的总数。 **取值范围：** 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowBatchCreateRecordSetsTaskResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * **参数解释：** 记录集创建成功的数量。 **取值范围：** 不涉及。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public ShowBatchCreateRecordSetsTaskResponse withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * **参数解释：** 记录集创建失败的数量。 **取值范围：** 不涉及。
     * @return errorCount
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public ShowBatchCreateRecordSetsTaskResponse withErrorItems(
        List<ShowBatchCreateRecordSetsTaskErrorItem> errorItems) {
        this.errorItems = errorItems;
        return this;
    }

    public ShowBatchCreateRecordSetsTaskResponse addErrorItemsItem(
        ShowBatchCreateRecordSetsTaskErrorItem errorItemsItem) {
        if (this.errorItems == null) {
            this.errorItems = new ArrayList<>();
        }
        this.errorItems.add(errorItemsItem);
        return this;
    }

    public ShowBatchCreateRecordSetsTaskResponse withErrorItems(
        Consumer<List<ShowBatchCreateRecordSetsTaskErrorItem>> errorItemsSetter) {
        if (this.errorItems == null) {
            this.errorItems = new ArrayList<>();
        }
        errorItemsSetter.accept(this.errorItems);
        return this;
    }

    /**
     * **参数解释：** 记录集创建失败的条目。 **取值范围：** 不涉及。
     * @return errorItems
     */
    public List<ShowBatchCreateRecordSetsTaskErrorItem> getErrorItems() {
        return errorItems;
    }

    public void setErrorItems(List<ShowBatchCreateRecordSetsTaskErrorItem> errorItems) {
        this.errorItems = errorItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBatchCreateRecordSetsTaskResponse that = (ShowBatchCreateRecordSetsTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.errorCount, that.errorCount) && Objects.equals(this.errorItems, that.errorItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, createdAt, updatedAt, totalCount, successCount, errorCount, errorItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchCreateRecordSetsTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
        sb.append("    errorItems: ").append(toIndentedString(errorItems)).append("\n");
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
