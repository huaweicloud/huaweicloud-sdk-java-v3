package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩展模块属性信息
 */
public class ExtensionModuleProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_manifestVersion")

    private String buildManifestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operationSystem")

    private String operationSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageSource")

    private String imageSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environmentVariables")

    private Map<String, Map<String, String>> environmentVariables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution")

    private ExtensionExecution execution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<ExtensionParameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public ExtensionModuleProperties withBuildManifestVersion(String buildManifestVersion) {
        this.buildManifestVersion = buildManifestVersion;
        return this;
    }

    /**
     * 构建清单版本
     * @return buildManifestVersion
     */
    public String getBuildManifestVersion() {
        return buildManifestVersion;
    }

    public void setBuildManifestVersion(String buildManifestVersion) {
        this.buildManifestVersion = buildManifestVersion;
    }

    public ExtensionModuleProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtensionModuleProperties withDescription(String description) {
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

    public ExtensionModuleProperties withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 任务uuid
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ExtensionModuleProperties withOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }

    /**
     * 操作系统
     * @return operationSystem
     */
    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public ExtensionModuleProperties withImageSource(String imageSource) {
        this.imageSource = imageSource;
        return this;
    }

    /**
     * 镜像来源
     * @return imageSource
     */
    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public ExtensionModuleProperties withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 镜像名
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ExtensionModuleProperties withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 图标路径
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ExtensionModuleProperties withEnvironmentVariables(Map<String, Map<String, String>> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    public ExtensionModuleProperties putEnvironmentVariablesItem(String key,
        Map<String, String> environmentVariablesItem) {
        if (this.environmentVariables == null) {
            this.environmentVariables = new HashMap<>();
        }
        this.environmentVariables.put(key, environmentVariablesItem);
        return this;
    }

    public ExtensionModuleProperties withEnvironmentVariables(
        Consumer<Map<String, Map<String, String>>> environmentVariablesSetter) {
        if (this.environmentVariables == null) {
            this.environmentVariables = new HashMap<>();
        }
        environmentVariablesSetter.accept(this.environmentVariables);
        return this;
    }

    /**
     * 环境变量，按region映射。键为变量类别(如registry/mirror)，值为region到配置命令的映射。
     * @return environmentVariables
     */
    public Map<String, Map<String, String>> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(Map<String, Map<String, String>> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public ExtensionModuleProperties withExecution(ExtensionExecution execution) {
        this.execution = execution;
        return this;
    }

    public ExtensionModuleProperties withExecution(Consumer<ExtensionExecution> executionSetter) {
        if (this.execution == null) {
            this.execution = new ExtensionExecution();
            executionSetter.accept(this.execution);
        }

        return this;
    }

    /**
     * Get execution
     * @return execution
     */
    public ExtensionExecution getExecution() {
        return execution;
    }

    public void setExecution(ExtensionExecution execution) {
        this.execution = execution;
    }

    public ExtensionModuleProperties withParameters(List<ExtensionParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ExtensionModuleProperties addParametersItem(ExtensionParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public ExtensionModuleProperties withParameters(Consumer<List<ExtensionParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 用户可配置参数列表。
     * @return parameters
     */
    public List<ExtensionParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<ExtensionParameter> parameters) {
        this.parameters = parameters;
    }

    public ExtensionModuleProperties withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ExtensionModuleProperties addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ExtensionModuleProperties withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 内部标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionModuleProperties that = (ExtensionModuleProperties) obj;
        return Objects.equals(this.buildManifestVersion, that.buildManifestVersion)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.uuid, that.uuid) && Objects.equals(this.operationSystem, that.operationSystem)
            && Objects.equals(this.imageSource, that.imageSource) && Objects.equals(this.image, that.image)
            && Objects.equals(this.icon, that.icon)
            && Objects.equals(this.environmentVariables, that.environmentVariables)
            && Objects.equals(this.execution, that.execution) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildManifestVersion,
            name,
            description,
            uuid,
            operationSystem,
            imageSource,
            image,
            icon,
            environmentVariables,
            execution,
            parameters,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionModuleProperties {\n");
        sb.append("    buildManifestVersion: ").append(toIndentedString(buildManifestVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    operationSystem: ").append(toIndentedString(operationSystem)).append("\n");
        sb.append("    imageSource: ").append(toIndentedString(imageSource)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
        sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
