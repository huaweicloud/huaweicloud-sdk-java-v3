package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowControlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "implementation")

    private String implementation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guidance")

    private String guidance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private List<String> resource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior")

    private String behavior;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_objective")

    private String controlObjective;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "framework")

    private List<String> framework = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private List<Artifact> artifacts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aliases")

    private List<String> aliases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_date")

    private OffsetDateTime releaseDate;

    public ShowControlResponse withIdentifier(String identifier) {
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

    public ShowControlResponse withImplementation(String implementation) {
        this.implementation = implementation;
        return this;
    }

    /**
     * 服务控制策略（SCP），配置规则。
     * @return implementation
     */
    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    public ShowControlResponse withGuidance(String guidance) {
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

    public ShowControlResponse withResource(List<String> resource) {
        this.resource = resource;
        return this;
    }

    public ShowControlResponse addResourceItem(String resourceItem) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        this.resource.add(resourceItem);
        return this;
    }

    public ShowControlResponse withResource(Consumer<List<String>> resourceSetter) {
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

    public ShowControlResponse withService(String service) {
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

    public ShowControlResponse withBehavior(String behavior) {
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

    public ShowControlResponse withControlObjective(String controlObjective) {
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

    public ShowControlResponse withFramework(List<String> framework) {
        this.framework = framework;
        return this;
    }

    public ShowControlResponse addFrameworkItem(String frameworkItem) {
        if (this.framework == null) {
            this.framework = new ArrayList<>();
        }
        this.framework.add(frameworkItem);
        return this;
    }

    public ShowControlResponse withFramework(Consumer<List<String>> frameworkSetter) {
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

    public ShowControlResponse withArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public ShowControlResponse addArtifactsItem(Artifact artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    public ShowControlResponse withArtifacts(Consumer<List<Artifact>> artifactsSetter) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        artifactsSetter.accept(this.artifacts);
        return this;
    }

    /**
     * 控制策略内容。
     * @return artifacts
     */
    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public ShowControlResponse withAliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public ShowControlResponse addAliasesItem(String aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    public ShowControlResponse withAliases(Consumer<List<String>> aliasesSetter) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        aliasesSetter.accept(this.aliases);
        return this;
    }

    /**
     * 控制策略别名。
     * @return aliases
     */
    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public ShowControlResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 纳管账号的创建来源，包括CUSTOM和RGC。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowControlResponse withSeverity(String severity) {
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

    public ShowControlResponse withVersion(String version) {
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

    public ShowControlResponse withReleaseDate(OffsetDateTime releaseDate) {
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
        ShowControlResponse that = (ShowControlResponse) obj;
        return Objects.equals(this.identifier, that.identifier)
            && Objects.equals(this.implementation, that.implementation) && Objects.equals(this.guidance, that.guidance)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.service, that.service)
            && Objects.equals(this.behavior, that.behavior)
            && Objects.equals(this.controlObjective, that.controlObjective)
            && Objects.equals(this.framework, that.framework) && Objects.equals(this.artifacts, that.artifacts)
            && Objects.equals(this.aliases, that.aliases) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.version, that.version)
            && Objects.equals(this.releaseDate, that.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier,
            implementation,
            guidance,
            resource,
            service,
            behavior,
            controlObjective,
            framework,
            artifacts,
            aliases,
            owner,
            severity,
            version,
            releaseDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowControlResponse {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    implementation: ").append(toIndentedString(implementation)).append("\n");
        sb.append("    guidance: ").append(toIndentedString(guidance)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
        sb.append("    controlObjective: ").append(toIndentedString(controlObjective)).append("\n");
        sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
