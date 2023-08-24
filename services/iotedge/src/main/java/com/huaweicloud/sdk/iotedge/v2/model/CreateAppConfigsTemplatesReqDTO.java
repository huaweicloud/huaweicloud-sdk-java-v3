package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建应用配置模板请求体
 */
public class CreateAppConfigsTemplatesReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_tabs")

    private Object configTabs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_values")

    private Object defaultValues;

    public CreateAppConfigsTemplatesReqDTO withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 模板id
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public CreateAppConfigsTemplatesReqDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称，允许中、数字、英文大小写、下划线、中划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAppConfigsTemplatesReqDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAppConfigsTemplatesReqDTO withConfigTabs(Object configTabs) {
        this.configTabs = configTabs;
        return this;
    }

    /**
     * 配置项元数据
     * @return configTabs
     */
    public Object getConfigTabs() {
        return configTabs;
    }

    public void setConfigTabs(Object configTabs) {
        this.configTabs = configTabs;
    }

    public CreateAppConfigsTemplatesReqDTO withDefaultValues(Object defaultValues) {
        this.defaultValues = defaultValues;
        return this;
    }

    /**
     * 默认配置数据
     * @return defaultValues
     */
    public Object getDefaultValues() {
        return defaultValues;
    }

    public void setDefaultValues(Object defaultValues) {
        this.defaultValues = defaultValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAppConfigsTemplatesReqDTO that = (CreateAppConfigsTemplatesReqDTO) obj;
        return Objects.equals(this.tplId, that.tplId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.configTabs, that.configTabs)
            && Objects.equals(this.defaultValues, that.defaultValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId, name, description, configTabs, defaultValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppConfigsTemplatesReqDTO {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    configTabs: ").append(toIndentedString(configTabs)).append("\n");
        sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
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
