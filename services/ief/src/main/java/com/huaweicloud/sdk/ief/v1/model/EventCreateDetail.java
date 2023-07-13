package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 系统订阅创建配置
 */
public class EventCreateDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private String events;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_resource")

    private EndpointResource targetResource;

    public EventCreateDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 系统订阅名称。只允许小写英文字符、数字、下划线、中划线，最大长度64，同一个帐号中创建的系统订阅和消息规则名唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventCreateDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。最大长度255，不允许^~#$%&*<>()[]{}'\"\\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventCreateDetail withEvents(String events) {
        this.events = events;
        return this;
    }

    /**
     * 系统订阅主题。每个主题由“{边缘资源}/{操作}”组成，多个主题使用逗号（,）进行分隔，支持如下主题： - edgeNode/offline：节点离线 - edgeNode/online：节点上线 - edgeNode/all：节点离线+节点上线 - deployment/created：容器应用创建 - deployment/updated：容器应用更新 - deployment/deleted：容器应用删除 - deployment/all：容器应用创建+更新+删除 - instance/created：应用实例创建 - instance/updated：应用实例更新 - instance/deleted：应用实例删除 - instance/all：应用实例创建+更新+删除
     * @return events
     */
    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public EventCreateDetail withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 目的端点ID
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public EventCreateDetail withTargetResource(EndpointResource targetResource) {
        this.targetResource = targetResource;
        return this;
    }

    public EventCreateDetail withTargetResource(Consumer<EndpointResource> targetResourceSetter) {
        if (this.targetResource == null) {
            this.targetResource = new EndpointResource();
            targetResourceSetter.accept(this.targetResource);
        }

        return this;
    }

    /**
     * Get targetResource
     * @return targetResource
     */
    public EndpointResource getTargetResource() {
        return targetResource;
    }

    public void setTargetResource(EndpointResource targetResource) {
        this.targetResource = targetResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventCreateDetail that = (EventCreateDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.events, that.events) && Objects.equals(this.target, that.target)
            && Objects.equals(this.targetResource, that.targetResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, events, target, targetResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventCreateDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    targetResource: ").append(toIndentedString(targetResource)).append("\n");
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
