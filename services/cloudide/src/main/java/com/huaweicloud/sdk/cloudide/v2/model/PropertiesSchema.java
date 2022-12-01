package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PropertiesSchema
 */
public class PropertiesSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context")

    private String context;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "docstring")

    private String docstring;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ide_type")

    private String ideType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ide_version")

    private String ideVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    public PropertiesSchema withContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * context
     * @return context
     */
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public PropertiesSchema withDocstring(String docstring) {
        this.docstring = docstring;
        return this;
    }

    /**
     * docstring
     * @return docstring
     */
    public String getDocstring() {
        return docstring;
    }

    public void setDocstring(String docstring) {
        this.docstring = docstring;
    }

    public PropertiesSchema withIdeType(String ideType) {
        this.ideType = ideType;
        return this;
    }

    /**
     * the type of ide
     * @return ideType
     */
    public String getIdeType() {
        return ideType;
    }

    public void setIdeType(String ideType) {
        this.ideType = ideType;
    }

    public PropertiesSchema withIdeVersion(String ideVersion) {
        this.ideVersion = ideVersion;
        return this;
    }

    /**
     * the version of ide
     * @return ideVersion
     */
    public String getIdeVersion() {
        return ideVersion;
    }

    public void setIdeVersion(String ideVersion) {
        this.ideVersion = ideVersion;
    }

    public PropertiesSchema withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * code language
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public PropertiesSchema withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * the version of plugin
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public PropertiesSchema withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * signature
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertiesSchema propertiesSchema = (PropertiesSchema) o;
        return Objects.equals(this.context, propertiesSchema.context)
            && Objects.equals(this.docstring, propertiesSchema.docstring)
            && Objects.equals(this.ideType, propertiesSchema.ideType)
            && Objects.equals(this.ideVersion, propertiesSchema.ideVersion)
            && Objects.equals(this.language, propertiesSchema.language)
            && Objects.equals(this.pluginVersion, propertiesSchema.pluginVersion)
            && Objects.equals(this.signature, propertiesSchema.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, docstring, ideType, ideVersion, language, pluginVersion, signature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertiesSchema {\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    docstring: ").append(toIndentedString(docstring)).append("\n");
        sb.append("    ideType: ").append(toIndentedString(ideType)).append("\n");
        sb.append("    ideVersion: ").append(toIndentedString(ideVersion)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
