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
public class ShowBatchOperationTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_count")

    private Integer errorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_items")

    private List<ShowBatchOperationTaskErrorItem> errorItems = null;

    public ShowBatchOperationTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 批量操作任务的ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowBatchOperationTaskResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 任务类型。 **取值范围：** - batch_create_zone：批量添加域名 - create：批量添加记录集 - import_recordset：批量导入记录集 - delete：批量删除记录集 - batch_update_rs：批量修改记录集 - transfer：批量转移域名
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowBatchOperationTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 任务状态。 **取值范围：** - PENDING：执行中 - DONE：已完成
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowBatchOperationTaskResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 任务的创建时间。 格式：yyyy-MM-dd HH:mm:ss。 **取值范围：** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowBatchOperationTaskResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * **参数解释：** 批量操作成功的数量。 **取值范围：** 不涉及。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public ShowBatchOperationTaskResponse withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * **参数解释：** 批量操作失败的数量。 **取值范围：** 不涉及。
     * @return errorCount
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public ShowBatchOperationTaskResponse withErrorItems(List<ShowBatchOperationTaskErrorItem> errorItems) {
        this.errorItems = errorItems;
        return this;
    }

    public ShowBatchOperationTaskResponse addErrorItemsItem(ShowBatchOperationTaskErrorItem errorItemsItem) {
        if (this.errorItems == null) {
            this.errorItems = new ArrayList<>();
        }
        this.errorItems.add(errorItemsItem);
        return this;
    }

    public ShowBatchOperationTaskResponse withErrorItems(
        Consumer<List<ShowBatchOperationTaskErrorItem>> errorItemsSetter) {
        if (this.errorItems == null) {
            this.errorItems = new ArrayList<>();
        }
        errorItemsSetter.accept(this.errorItems);
        return this;
    }

    /**
     * 批量操作任务列表。
     * @return errorItems
     */
    public List<ShowBatchOperationTaskErrorItem> getErrorItems() {
        return errorItems;
    }

    public void setErrorItems(List<ShowBatchOperationTaskErrorItem> errorItems) {
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
        ShowBatchOperationTaskResponse that = (ShowBatchOperationTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.successCount, that.successCount) && Objects.equals(this.errorCount, that.errorCount)
            && Objects.equals(this.errorItems, that.errorItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, status, createdAt, successCount, errorCount, errorItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchOperationTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
