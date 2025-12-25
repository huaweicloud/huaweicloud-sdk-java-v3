package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建和更新操作连接的请求体
 */
public class CreateAssetsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_version_id")

    private String componentVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private String config;

    public CreateAssetsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 操作连接的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAssetsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 操作连接的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAssetsRequestBody withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 操作连接所属的插件id
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public CreateAssetsRequestBody withComponentVersionId(String componentVersionId) {
        this.componentVersionId = componentVersionId;
        return this;
    }

    /**
     * 操作连接所属的插件版本id
     * @return componentVersionId
     */
    public String getComponentVersionId() {
        return componentVersionId;
    }

    public void setComponentVersionId(String componentVersionId) {
        this.componentVersionId = componentVersionId;
    }

    public CreateAssetsRequestBody withConfig(String config) {
        this.config = config;
        return this;
    }

    /**
     * 具体的操作连接配置字符串，根据插件的操作连接schema配置对应字段值
     * @return config
     */
    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAssetsRequestBody that = (CreateAssetsRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.componentVersionId, that.componentVersionId)
            && Objects.equals(this.config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, componentId, componentVersionId, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetsRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    componentVersionId: ").append(toIndentedString(componentVersionId)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
