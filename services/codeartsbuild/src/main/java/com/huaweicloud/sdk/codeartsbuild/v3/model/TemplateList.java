package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模板列表
 */
public class TemplateList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favourite")

    private Boolean favourite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Double weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public")

    private Boolean _public;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_type")

    private String toolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private QueryTemplate template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<Parameter> parameters = null;

    public TemplateList withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 模版支持的语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public TemplateList withFavourite(Boolean favourite) {
        this.favourite = favourite;
        return this;
    }

    /**
     * 是否收藏模板
     * @return favourite
     */
    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public TemplateList withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * uuid
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public TemplateList withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 模板类别
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TemplateList withName(String name) {
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

    public TemplateList withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 权重
     * @return weight
     */
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public TemplateList withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 模板范围，自定义模板默认为：custom,官方模版为：official
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public TemplateList withDescription(String description) {
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

    public TemplateList withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public TemplateList withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * 模板是否公开
     * @return _public
     */
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public TemplateList withToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * 构建工具类型，mono、npm、maven等
     * @return toolType
     */
    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public TemplateList withTemplate(QueryTemplate template) {
        this.template = template;
        return this;
    }

    public TemplateList withTemplate(Consumer<QueryTemplate> templateSetter) {
        if (this.template == null) {
            this.template = new QueryTemplate();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public QueryTemplate getTemplate() {
        return template;
    }

    public void setTemplate(QueryTemplate template) {
        this.template = template;
    }

    public TemplateList withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public TemplateList addParametersItem(Parameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public TemplateList withParameters(Consumer<List<Parameter>> parametersSetter) {
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
    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
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
        TemplateList that = (TemplateList) obj;
        return Objects.equals(this.language, that.language) && Objects.equals(this.favourite, that.favourite)
            && Objects.equals(this.uuid, that.uuid) && Objects.equals(this.type, that.type)
            && Objects.equals(this.name, that.name) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.scope, that.scope) && Objects.equals(this.description, that.description)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this._public, that._public)
            && Objects.equals(this.toolType, that.toolType) && Objects.equals(this.template, that.template)
            && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language,
            favourite,
            uuid,
            type,
            name,
            weight,
            scope,
            description,
            nickName,
            _public,
            toolType,
            template,
            parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateList {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    toolType: ").append(toIndentedString(toolType)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
