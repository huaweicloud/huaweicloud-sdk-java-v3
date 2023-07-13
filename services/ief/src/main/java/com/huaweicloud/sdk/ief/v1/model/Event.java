package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 系统订阅事件基本信息
 */
public class Event {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_using")

    private Boolean inUsing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private String events;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private EndpointObjResp target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_resource")

    private Map<String, String> targetResource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_messages")

    private Integer successMessages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_messages")

    private Integer failMessages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_at")

    private Integer deleteAt;

    public Event withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 系统订阅事件ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Event withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 系统订阅事件名称。只允许小写英文字符、数字、下划线、中划线，最大长度64，同一个帐号中创建的系统订阅和消息规则名唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 系统订阅事件所属项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Event withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Event withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Event withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述，最大长度255，不允许^~#$%&*<>()[]{}'\"\\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event withInUsing(Boolean inUsing) {
        this.inUsing = inUsing;
        return this;
    }

    /**
     * 是否启用系统订阅规则，默认为true（启用）
     * @return inUsing
     */
    public Boolean getInUsing() {
        return inUsing;
    }

    public void setInUsing(Boolean inUsing) {
        this.inUsing = inUsing;
    }

    public Event withEvents(String events) {
        this.events = events;
        return this;
    }

    /**
     * 系统订阅事件主题。每个主题由“{边缘资源}/{操作}”组成，多个主题使用逗号（,）进行分隔，支持如下主题： - edgeNode/offline：节点离线 - edgeNode/online：节点上线 - edgeNode/all：节点离线+节点上线 - deployment/created：容器应用创建 - deployment/updated：容器应用更新 - deployment/deleted：容器应用删除 - deployment/all：容器应用创建+更新+删除 - instance/created：应用实例创建 - instance/updated：应用实例更新 - instance/deleted：应用实例删除 - instance/all：应用实例创建+更新+删除
     * @return events
     */
    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public Event withTarget(EndpointObjResp target) {
        this.target = target;
        return this;
    }

    public Event withTarget(Consumer<EndpointObjResp> targetSetter) {
        if (this.target == null) {
            this.target = new EndpointObjResp();
            targetSetter.accept(this.target);
        }

        return this;
    }

    /**
     * Get target
     * @return target
     */
    public EndpointObjResp getTarget() {
        return target;
    }

    public void setTarget(EndpointObjResp target) {
        this.target = target;
    }

    public Event withTargetResource(Map<String, String> targetResource) {
        this.targetResource = targetResource;
        return this;
    }

    public Event putTargetResourceItem(String key, String targetResourceItem) {
        if (this.targetResource == null) {
            this.targetResource = new HashMap<>();
        }
        this.targetResource.put(key, targetResourceItem);
        return this;
    }

    public Event withTargetResource(Consumer<Map<String, String>> targetResourceSetter) {
        if (this.targetResource == null) {
            this.targetResource = new HashMap<>();
        }
        targetResourceSetter.accept(this.targetResource);
        return this;
    }

    /**
     * 目的端点资源属性
     * @return targetResource
     */
    public Map<String, String> getTargetResource() {
        return targetResource;
    }

    public void setTargetResource(Map<String, String> targetResource) {
        this.targetResource = targetResource;
    }

    public Event withSuccessMessages(Integer successMessages) {
        this.successMessages = successMessages;
        return this;
    }

    /**
     * 成功次数
     * @return successMessages
     */
    public Integer getSuccessMessages() {
        return successMessages;
    }

    public void setSuccessMessages(Integer successMessages) {
        this.successMessages = successMessages;
    }

    public Event withFailMessages(Integer failMessages) {
        this.failMessages = failMessages;
        return this;
    }

    /**
     * 失败次数
     * @return failMessages
     */
    public Integer getFailMessages() {
        return failMessages;
    }

    public void setFailMessages(Integer failMessages) {
        this.failMessages = failMessages;
    }

    public Event withDeleteAt(Integer deleteAt) {
        this.deleteAt = deleteAt;
        return this;
    }

    /**
     * 删除时间
     * @return deleteAt
     */
    public Integer getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Integer deleteAt) {
        this.deleteAt = deleteAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event that = (Event) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.description, that.description)
            && Objects.equals(this.inUsing, that.inUsing) && Objects.equals(this.events, that.events)
            && Objects.equals(this.target, that.target) && Objects.equals(this.targetResource, that.targetResource)
            && Objects.equals(this.successMessages, that.successMessages)
            && Objects.equals(this.failMessages, that.failMessages) && Objects.equals(this.deleteAt, that.deleteAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            projectId,
            createdAt,
            updatedAt,
            description,
            inUsing,
            events,
            target,
            targetResource,
            successMessages,
            failMessages,
            deleteAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    inUsing: ").append(toIndentedString(inUsing)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    targetResource: ").append(toIndentedString(targetResource)).append("\n");
        sb.append("    successMessages: ").append(toIndentedString(successMessages)).append("\n");
        sb.append("    failMessages: ").append(toIndentedString(failMessages)).append("\n");
        sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
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
