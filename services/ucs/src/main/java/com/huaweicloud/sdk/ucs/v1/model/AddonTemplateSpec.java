package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddonTemplateSpec
 */
public class AddonTemplateSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "require")

    private Boolean require;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logoURL")

    private String logoURL;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readmeURL")

    private String readmeURL;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<AddonVersion> versions = null;

    public AddonTemplateSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 插件的安装类型，支持helm安装或static安装
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AddonTemplateSpec withRequire(Boolean require) {
        this.require = require;
        return this;
    }

    /**
     * 该插件是否为必装
     * @return require
     */
    public Boolean getRequire() {
        return require;
    }

    public void setRequire(Boolean require) {
        this.require = require;
    }

    public AddonTemplateSpec withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public AddonTemplateSpec addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public AddonTemplateSpec withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 插件的标签列表
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public AddonTemplateSpec withLogoURL(String logoURL) {
        this.logoURL = logoURL;
        return this;
    }

    /**
     * Logo链接
     * @return logoURL
     */
    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public AddonTemplateSpec withReadmeURL(String readmeURL) {
        this.readmeURL = readmeURL;
        return this;
    }

    /**
     * README文档链接
     * @return readmeURL
     */
    public String getReadmeURL() {
        return readmeURL;
    }

    public void setReadmeURL(String readmeURL) {
        this.readmeURL = readmeURL;
    }

    public AddonTemplateSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddonTemplateSpec withVersions(List<AddonVersion> versions) {
        this.versions = versions;
        return this;
    }

    public AddonTemplateSpec addVersionsItem(AddonVersion versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public AddonTemplateSpec withVersions(Consumer<List<AddonVersion>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 插件的版本列表
     * @return versions
     */
    public List<AddonVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<AddonVersion> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddonTemplateSpec that = (AddonTemplateSpec) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.require, that.require)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.logoURL, that.logoURL)
            && Objects.equals(this.readmeURL, that.readmeURL) && Objects.equals(this.description, that.description)
            && Objects.equals(this.versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, require, labels, logoURL, readmeURL, description, versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonTemplateSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    require: ").append(toIndentedString(require)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    logoURL: ").append(toIndentedString(logoURL)).append("\n");
        sb.append("    readmeURL: ").append(toIndentedString(readmeURL)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
