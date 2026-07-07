package com.huaweicloud.sdk.modelarts.v1.model;

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
public class CreateDevServerJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<DevServerJobItem> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<DevServerTaskResponse> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_count")

    private Integer abnormalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateDevServerJobResponse withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**：创建时间。  **取值范围**：不涉及。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public CreateDevServerJobResponse withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释**：更新时间。  **取值范围**：不涉及。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public CreateDevServerJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：任务ID。  **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateDevServerJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：任务名称。  **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDevServerJobResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：任务模板类型。  **取值范围**：- COMMON  -SERVICE_DEPLOY 等。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateDevServerJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：状态。  **取值范围**：- ACTIVE。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateDevServerJobResponse withItems(List<DevServerJobItem> items) {
        this.items = items;
        return this;
    }

    public CreateDevServerJobResponse addItemsItem(DevServerJobItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public CreateDevServerJobResponse withItems(Consumer<List<DevServerJobItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释**：任务实例列表信息。
     * @return items
     */
    public List<DevServerJobItem> getItems() {
        return items;
    }

    public void setItems(List<DevServerJobItem> items) {
        this.items = items;
    }

    public CreateDevServerJobResponse withTasks(List<DevServerTaskResponse> tasks) {
        this.tasks = tasks;
        return this;
    }

    public CreateDevServerJobResponse addTasksItem(DevServerTaskResponse tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public CreateDevServerJobResponse withTasks(Consumer<List<DevServerTaskResponse>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * **参数解释**：task详情列表。
     * @return tasks
     */
    public List<DevServerTaskResponse> getTasks() {
        return tasks;
    }

    public void setTasks(List<DevServerTaskResponse> tasks) {
        this.tasks = tasks;
    }

    public CreateDevServerJobResponse withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释**：任务模板ID。  **取值范围**：不涉及。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public CreateDevServerJobResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**：下发任务的用户信息。  **取值范围**：不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateDevServerJobResponse withAbnormalCount(Integer abnormalCount) {
        this.abnormalCount = abnormalCount;
        return this;
    }

    /**
     * **参数解释**：task失败的节点数量。  **取值范围**：不涉及。
     * @return abnormalCount
     */
    public Integer getAbnormalCount() {
        return abnormalCount;
    }

    public void setAbnormalCount(Integer abnormalCount) {
        this.abnormalCount = abnormalCount;
    }

    public CreateDevServerJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：描述。  **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDevServerJobResponse that = (CreateDevServerJobResponse) obj;
        return Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.items, that.items) && Objects.equals(this.tasks, that.tasks)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.abnormalCount, that.abnormalCount)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createAt,
            updateAt,
            id,
            name,
            type,
            status,
            items,
            tasks,
            templateId,
            userName,
            abnormalCount,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDevServerJobResponse {\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    abnormalCount: ").append(toIndentedString(abnormalCount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
