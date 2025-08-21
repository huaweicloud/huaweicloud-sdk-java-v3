package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 控制策略。
 */
public class Control {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guidance")

    private String guidance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private List<String> resource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "framework")

    private List<String> framework = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "implementation")

    private String implementation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior")

    private String behavior;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_objective")

    private String controlObjective;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_date")

    private OffsetDateTime releaseDate;

    public Control withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 控制策略ID。
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Control withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 控制策略名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Control withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 控制策略描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Control withGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }

    /**
     * 控制策略必须性。
     * @return guidance
     */
    public String getGuidance() {
        return guidance;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    public Control withResource(List<String> resource) {
        this.resource = resource;
        return this;
    }

    public Control addResourceItem(String resourceItem) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        this.resource.add(resourceItem);
        return this;
    }

    public Control withResource(Consumer<List<String>> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        resourceSetter.accept(this.resource);
        return this;
    }

    /**
     * 治理资源。
     * @return resource
     */
    public List<String> getResource() {
        return resource;
    }

    public void setResource(List<String> resource) {
        this.resource = resource;
    }

    public Control withFramework(List<String> framework) {
        this.framework = framework;
        return this;
    }

    public Control addFrameworkItem(String frameworkItem) {
        if (this.framework == null) {
            this.framework = new ArrayList<>();
        }
        this.framework.add(frameworkItem);
        return this;
    }

    public Control withFramework(Consumer<List<String>> frameworkSetter) {
        if (this.framework == null) {
            this.framework = new ArrayList<>();
        }
        frameworkSetter.accept(this.framework);
        return this;
    }

    /**
     * 治理策略来自的框架。
     * @return framework
     */
    public List<String> getFramework() {
        return framework;
    }

    public void setFramework(List<String> framework) {
        this.framework = framework;
    }

    public Control withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 控制策略所属服务。
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Control withImplementation(String implementation) {
        this.implementation = implementation;
        return this;
    }

    /**
     * 策略类别。
     * @return implementation
     */
    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    public Control withBehavior(String behavior) {
        this.behavior = behavior;
        return this;
    }

    /**
     * 控制策略类型。包括主动性控制策略Proactive、检测性控制策略Detective、预防性控制策略Preventive。
     * @return behavior
     */
    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public Control withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 控制策略来源。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Control withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 控制策略严重性。
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Control withControlObjective(String controlObjective) {
        this.controlObjective = controlObjective;
        return this;
    }

    /**
     * 控制策略目标。
     * @return controlObjective
     */
    public String getControlObjective() {
        return controlObjective;
    }

    public void setControlObjective(String controlObjective) {
        this.controlObjective = controlObjective;
    }

    public Control withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 控制策略版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Control withReleaseDate(OffsetDateTime releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * 控制策略发布时间。
     * @return releaseDate
     */
    public OffsetDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(OffsetDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Control that = (Control) obj;
        return Objects.equals(this.identifier, that.identifier) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.guidance, that.guidance)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.framework, that.framework)
            && Objects.equals(this.service, that.service) && Objects.equals(this.implementation, that.implementation)
            && Objects.equals(this.behavior, that.behavior) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.controlObjective, that.controlObjective)
            && Objects.equals(this.version, that.version) && Objects.equals(this.releaseDate, that.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier,
            name,
            description,
            guidance,
            resource,
            framework,
            service,
            implementation,
            behavior,
            owner,
            severity,
            controlObjective,
            version,
            releaseDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Control {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    guidance: ").append(toIndentedString(guidance)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    implementation: ").append(toIndentedString(implementation)).append("\n");
        sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    controlObjective: ").append(toIndentedString(controlObjective)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
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
