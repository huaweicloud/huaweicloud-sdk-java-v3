package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * LaunchTemplateOption
 */
public class LaunchTemplateOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_data")

    private TemplateData templateData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    public LaunchTemplateOption withTemplateData(TemplateData templateData) {
        this.templateData = templateData;
        return this;
    }

    public LaunchTemplateOption withTemplateData(Consumer<TemplateData> templateDataSetter) {
        if (this.templateData == null) {
            this.templateData = new TemplateData();
            templateDataSetter.accept(this.templateData);
        }

        return this;
    }

    /**
     * Get templateData
     * @return templateData
     */
    public TemplateData getTemplateData() {
        return templateData;
    }

    public void setTemplateData(TemplateData templateData) {
        this.templateData = templateData;
    }

    public LaunchTemplateOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LaunchTemplateOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LaunchTemplateOption withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * 初始第一个版本的版本描述
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaunchTemplateOption that = (LaunchTemplateOption) obj;
        return Objects.equals(this.templateData, that.templateData) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.versionDescription, that.versionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateData, name, description, versionDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaunchTemplateOption {\n");
        sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
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
