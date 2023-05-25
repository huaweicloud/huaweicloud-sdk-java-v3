package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentList
 */
public class ComponentList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<Label> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_stack")

    private RuntimeStack runtimeStack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ComponentStatusView status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_name")

    private String environmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceObject source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ComponentList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentList withLabels(List<Label> labels) {
        this.labels = labels;
        return this;
    }

    public ComponentList addLabelsItem(Label labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ComponentList withLabels(Consumer<List<Label>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public ComponentList withRuntimeStack(RuntimeStack runtimeStack) {
        this.runtimeStack = runtimeStack;
        return this;
    }

    public ComponentList withRuntimeStack(Consumer<RuntimeStack> runtimeStackSetter) {
        if (this.runtimeStack == null) {
            this.runtimeStack = new RuntimeStack();
            runtimeStackSetter.accept(this.runtimeStack);
        }

        return this;
    }

    /**
     * Get runtimeStack
     * @return runtimeStack
     */
    public RuntimeStack getRuntimeStack() {
        return runtimeStack;
    }

    public void setRuntimeStack(RuntimeStack runtimeStack) {
        this.runtimeStack = runtimeStack;
    }

    public ComponentList withStatus(ComponentStatusView status) {
        this.status = status;
        return this;
    }

    public ComponentList withStatus(Consumer<ComponentStatusView> statusSetter) {
        if (this.status == null) {
            this.status = new ComponentStatusView();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ComponentStatusView getStatus() {
        return status;
    }

    public void setStatus(ComponentStatusView status) {
        this.status = status;
    }

    public ComponentList withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * Get environmentName
     * @return environmentName
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public ComponentList withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get applicationName
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public ComponentList withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get environmentId
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public ComponentList withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get applicationId
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ComponentList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComponentList withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ComponentList withSource(SourceObject source) {
        this.source = source;
        return this;
    }

    public ComponentList withSource(Consumer<SourceObject> sourceSetter) {
        if (this.source == null) {
            this.source = new SourceObject();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public SourceObject getSource() {
        return source;
    }

    public void setSource(SourceObject source) {
        this.source = source;
    }

    public ComponentList withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentList componentList = (ComponentList) o;
        return Objects.equals(this.name, componentList.name) && Objects.equals(this.labels, componentList.labels)
            && Objects.equals(this.runtimeStack, componentList.runtimeStack)
            && Objects.equals(this.status, componentList.status)
            && Objects.equals(this.environmentName, componentList.environmentName)
            && Objects.equals(this.applicationName, componentList.applicationName)
            && Objects.equals(this.environmentId, componentList.environmentId)
            && Objects.equals(this.applicationId, componentList.applicationId)
            && Objects.equals(this.id, componentList.id) && Objects.equals(this.creator, componentList.creator)
            && Objects.equals(this.source, componentList.source) && Objects.equals(this.version, componentList.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            labels,
            runtimeStack,
            status,
            environmentName,
            applicationName,
            environmentId,
            applicationId,
            id,
            creator,
            source,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    runtimeStack: ").append(toIndentedString(runtimeStack)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
