package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则配置
 */
public class RuleResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_messages")

    private Integer failMessages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief_instance_id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_using")

    private Boolean inUsing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private EndpointObjResp source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_resource")

    private Map<String, String> sourceResource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private EndpointObjResp target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_resource")

    private Map<String, String> targetResource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_messages")

    private Integer successMessages;

    public RuleResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述，最大长度255，不允许^~#$%&*<>()[]{}'\"\\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RuleResponse withFailMessages(Integer failMessages) {
        this.failMessages = failMessages;
        return this;
    }

    /**
     * 转发失败的消息数
     * @return failMessages
     */
    public Integer getFailMessages() {
        return failMessages;
    }

    public void setFailMessages(Integer failMessages) {
        this.failMessages = failMessages;
    }

    public RuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RuleResponse withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，如果为空则表示是专业版实例。
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public RuleResponse withInUsing(Boolean inUsing) {
        this.inUsing = inUsing;
        return this;
    }

    /**
     * 是否启用规则，默认为true（启用）
     * @return inUsing
     */
    public Boolean getInUsing() {
        return inUsing;
    }

    public void setInUsing(Boolean inUsing) {
        this.inUsing = inUsing;
    }

    public RuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称，只允许中文字符、英文字符、数字、下划线、中划线，最大长度64 同一个帐号中创建的规则名唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RuleResponse withSource(EndpointObjResp source) {
        this.source = source;
        return this;
    }

    public RuleResponse withSource(Consumer<EndpointObjResp> sourceSetter) {
        if (this.source == null) {
            this.source = new EndpointObjResp();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public EndpointObjResp getSource() {
        return source;
    }

    public void setSource(EndpointObjResp source) {
        this.source = source;
    }

    public RuleResponse withSourceResource(Map<String, String> sourceResource) {
        this.sourceResource = sourceResource;
        return this;
    }

    public RuleResponse putSourceResourceItem(String key, String sourceResourceItem) {
        if (this.sourceResource == null) {
            this.sourceResource = new HashMap<>();
        }
        this.sourceResource.put(key, sourceResourceItem);
        return this;
    }

    public RuleResponse withSourceResource(Consumer<Map<String, String>> sourceResourceSetter) {
        if (this.sourceResource == null) {
            this.sourceResource = new HashMap<>();
        }
        sourceResourceSetter.accept(this.sourceResource);
        return this;
    }

    /**
     * 源端点资源。 示例： - rest: path取值需要为标准URI格式。 {\"path\":\"/a/b/c\"} - eventbus: {\"topic\": \"<project id>/nodes/<node id>/user/<租户自定义且满足eventbus topic要求的字符串>\",\"node_id\":\"<node id>\"}
     * @return sourceResource
     */
    public Map<String, String> getSourceResource() {
        return sourceResource;
    }

    public void setSourceResource(Map<String, String> sourceResource) {
        this.sourceResource = sourceResource;
    }

    public RuleResponse withTarget(EndpointObjResp target) {
        this.target = target;
        return this;
    }

    public RuleResponse withTarget(Consumer<EndpointObjResp> targetSetter) {
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

    public RuleResponse withTargetResource(Map<String, String> targetResource) {
        this.targetResource = targetResource;
        return this;
    }

    public RuleResponse putTargetResourceItem(String key, String targetResourceItem) {
        if (this.targetResource == null) {
            this.targetResource = new HashMap<>();
        }
        this.targetResource.put(key, targetResourceItem);
        return this;
    }

    public RuleResponse withTargetResource(Consumer<Map<String, String>> targetResourceSetter) {
        if (this.targetResource == null) {
            this.targetResource = new HashMap<>();
        }
        targetResourceSetter.accept(this.targetResource);
        return this;
    }

    /**
     * 目的端点资源，示例： - dis: {\"channel\": \"dis channel name\"} - servicebus: {\"path\": \"/request path\"} - apigw: {\"resource\": \"http://ssss.com\"} - eventbus: {\"topic\": \"/xxxx\"}
     * @return targetResource
     */
    public Map<String, String> getTargetResource() {
        return targetResource;
    }

    public void setTargetResource(Map<String, String> targetResource) {
        this.targetResource = targetResource;
    }

    public RuleResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RuleResponse withSuccessMessages(Integer successMessages) {
        this.successMessages = successMessages;
        return this;
    }

    /**
     * 转发成功的消息数
     * @return successMessages
     */
    public Integer getSuccessMessages() {
        return successMessages;
    }

    public void setSuccessMessages(Integer successMessages) {
        this.successMessages = successMessages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleResponse that = (RuleResponse) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.description, that.description)
            && Objects.equals(this.failMessages, that.failMessages) && Objects.equals(this.id, that.id)
            && Objects.equals(this.iefInstanceId, that.iefInstanceId) && Objects.equals(this.inUsing, that.inUsing)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.source, that.source) && Objects.equals(this.sourceResource, that.sourceResource)
            && Objects.equals(this.target, that.target) && Objects.equals(this.targetResource, that.targetResource)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.successMessages, that.successMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt,
            description,
            failMessages,
            id,
            iefInstanceId,
            inUsing,
            name,
            projectId,
            source,
            sourceResource,
            target,
            targetResource,
            updatedAt,
            successMessages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleResponse {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    failMessages: ").append(toIndentedString(failMessages)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    inUsing: ").append(toIndentedString(inUsing)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceResource: ").append(toIndentedString(sourceResource)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    targetResource: ").append(toIndentedString(targetResource)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    successMessages: ").append(toIndentedString(successMessages)).append("\n");
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
