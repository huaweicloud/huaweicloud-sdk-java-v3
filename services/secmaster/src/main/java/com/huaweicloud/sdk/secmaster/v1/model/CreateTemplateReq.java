package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建/更新插件配置模板请求体
 */
public class CreateTemplateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_config")

    private String taskConfig;

    public CreateTemplateReq withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 插件ID
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public CreateTemplateReq withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 插件模板的名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public CreateTemplateReq withTaskConfig(String taskConfig) {
        this.taskConfig = taskConfig;
        return this;
    }

    /**
     * 插件action的配置内容
     * @return taskConfig
     */
    public String getTaskConfig() {
        return taskConfig;
    }

    public void setTaskConfig(String taskConfig) {
        this.taskConfig = taskConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTemplateReq that = (CreateTemplateReq) obj;
        return Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.templateName, that.templateName) && Objects.equals(this.taskConfig, that.taskConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, templateName, taskConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplateReq {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    taskConfig: ").append(toIndentedString(taskConfig)).append("\n");
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
