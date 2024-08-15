package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改脚本
 */
public class EditScriptModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private ScriptPropertiesModel properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_params")

    private List<ScriptParamDefine> scriptParams = null;

    public EditScriptModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 脚本描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EditScriptModel withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 脚本内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditScriptModel withProperties(ScriptPropertiesModel properties) {
        this.properties = properties;
        return this;
    }

    public EditScriptModel withProperties(Consumer<ScriptPropertiesModel> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ScriptPropertiesModel();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public ScriptPropertiesModel getProperties() {
        return properties;
    }

    public void setProperties(ScriptPropertiesModel properties) {
        this.properties = properties;
    }

    public EditScriptModel withScriptParams(List<ScriptParamDefine> scriptParams) {
        this.scriptParams = scriptParams;
        return this;
    }

    public EditScriptModel addScriptParamsItem(ScriptParamDefine scriptParamsItem) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        this.scriptParams.add(scriptParamsItem);
        return this;
    }

    public EditScriptModel withScriptParams(Consumer<List<ScriptParamDefine>> scriptParamsSetter) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        scriptParamsSetter.accept(this.scriptParams);
        return this;
    }

    /**
     * 脚本入参
     * @return scriptParams
     */
    public List<ScriptParamDefine> getScriptParams() {
        return scriptParams;
    }

    public void setScriptParams(List<ScriptParamDefine> scriptParams) {
        this.scriptParams = scriptParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditScriptModel that = (EditScriptModel) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.content, that.content)
            && Objects.equals(this.properties, that.properties) && Objects.equals(this.scriptParams, that.scriptParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, content, properties, scriptParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditScriptModel {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
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
