package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建作业模板接口请求体
 */
public class CreateTemplatesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private CreateTemplate template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_type")

    private String toolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<CreateBuildJobParameter> parameters = null;

    public CreateTemplatesRequestBody withTemplate(CreateTemplate template) {
        this.template = template;
        return this;
    }

    public CreateTemplatesRequestBody withTemplate(Consumer<CreateTemplate> templateSetter) {
        if (this.template == null) {
            this.template = new CreateTemplate();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public CreateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(CreateTemplate template) {
        this.template = template;
    }

    public CreateTemplatesRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板命名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateTemplatesRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板说明
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTemplatesRequestBody withToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * 工具类型
     * @return toolType
     */
    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public CreateTemplatesRequestBody withParameters(List<CreateBuildJobParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public CreateTemplatesRequestBody addParametersItem(CreateBuildJobParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public CreateTemplatesRequestBody withParameters(Consumer<List<CreateBuildJobParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 构建执行参数列表
     * @return parameters
     */
    public List<CreateBuildJobParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<CreateBuildJobParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTemplatesRequestBody that = (CreateTemplatesRequestBody) obj;
        return Objects.equals(this.template, that.template) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.toolType, that.toolType)
            && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template, name, description, toolType, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplatesRequestBody {\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    toolType: ").append(toIndentedString(toolType)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
