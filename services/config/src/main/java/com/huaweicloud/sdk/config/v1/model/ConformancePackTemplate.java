package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 预定义合规规则包模板详情。
 */
public class ConformancePackTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_key")

    private String templateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_body")

    private String templateBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, TemplateParameterDefinition> parameters = null;

    public ConformancePackTemplate withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 预定义合规包模板ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConformancePackTemplate withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }

    /**
     * 预定义合规包模板名称。
     * @return templateKey
     */
    public String getTemplateKey() {
        return templateKey;
    }

    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }

    public ConformancePackTemplate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 预定义合规包模板描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConformancePackTemplate withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * 预定义合规包模板内容。
     * @return templateBody
     */
    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    public ConformancePackTemplate withParameters(Map<String, TemplateParameterDefinition> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ConformancePackTemplate putParametersItem(String key, TemplateParameterDefinition parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public ConformancePackTemplate withParameters(Consumer<Map<String, TemplateParameterDefinition>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 预定义合规包模板参数。
     * @return parameters
     */
    public Map<String, TemplateParameterDefinition> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, TemplateParameterDefinition> parameters) {
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
        ConformancePackTemplate that = (ConformancePackTemplate) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.templateKey, that.templateKey)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.templateBody, that.templateBody) && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, templateKey, description, templateBody, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConformancePackTemplate {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    templateKey: ").append(toIndentedString(templateKey)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
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
