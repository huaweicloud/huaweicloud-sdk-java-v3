package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新模型组请求。
 */
public class UpdateModelGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_model_id")

    private String defaultModelId;

    public UpdateModelGroupReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateModelGroupReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 分组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateModelGroupReq withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 分组优先级，最小值为1。
     * minimum: 1
     * maximum: 9999
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public UpdateModelGroupReq withDefaultModelId(String defaultModelId) {
        this.defaultModelId = defaultModelId;
        return this;
    }

    /**
     * 默认模型ID。
     * @return defaultModelId
     */
    public String getDefaultModelId() {
        return defaultModelId;
    }

    public void setDefaultModelId(String defaultModelId) {
        this.defaultModelId = defaultModelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateModelGroupReq that = (UpdateModelGroupReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.defaultModelId, that.defaultModelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, priority, defaultModelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateModelGroupReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    defaultModelId: ").append(toIndentedString(defaultModelId)).append("\n");
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
