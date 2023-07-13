package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceCreate
 */
public class InstanceCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private FlavorId flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private Map<String, Object> artifacts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private InstanceConfiguration _configuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_accesses")

    private List<ExternalAccessesCreate> externalAccesses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refer_resources")

    private List<ReferResourceCreate> referResources = null;

    public InstanceCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用组件实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceCreate withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * 环境ID。
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public InstanceCreate withFlavorId(FlavorId flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * Get flavorId
     * @return flavorId
     */
    public FlavorId getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(FlavorId flavorId) {
        this.flavorId = flavorId;
    }

    public InstanceCreate withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * 实例副本数。
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public InstanceCreate withArtifacts(Map<String, Object> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public InstanceCreate putArtifactsItem(String key, Object artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new HashMap<>();
        }
        this.artifacts.put(key, artifactsItem);
        return this;
    }

    public InstanceCreate withArtifacts(Consumer<Map<String, Object>> artifactsSetter) {
        if (this.artifacts == null) {
            this.artifacts = new HashMap<>();
        }
        artifactsSetter.accept(this.artifacts);
        return this;
    }

    /**
     * 组件部署件。key为组件component_name，对于Docker多容器场景，key为容器名称。
     * @return artifacts
     */
    public Map<String, Object> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(Map<String, Object> artifacts) {
        this.artifacts = artifacts;
    }

    public InstanceCreate withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用组件版本号，满足版本语义，如1.0.0。。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public InstanceCreate withConfiguration(InstanceConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public InstanceCreate withConfiguration(Consumer<InstanceConfiguration> _configurationSetter) {
        if (this._configuration == null) {
            this._configuration = new InstanceConfiguration();
            _configurationSetter.accept(this._configuration);
        }

        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    public InstanceConfiguration getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(InstanceConfiguration _configuration) {
        this._configuration = _configuration;
    }

    public InstanceCreate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InstanceCreate withExternalAccesses(List<ExternalAccessesCreate> externalAccesses) {
        this.externalAccesses = externalAccesses;
        return this;
    }

    public InstanceCreate addExternalAccessesItem(ExternalAccessesCreate externalAccessesItem) {
        if (this.externalAccesses == null) {
            this.externalAccesses = new ArrayList<>();
        }
        this.externalAccesses.add(externalAccessesItem);
        return this;
    }

    public InstanceCreate withExternalAccesses(Consumer<List<ExternalAccessesCreate>> externalAccessesSetter) {
        if (this.externalAccesses == null) {
            this.externalAccesses = new ArrayList<>();
        }
        externalAccessesSetter.accept(this.externalAccesses);
        return this;
    }

    /**
     * 访问方式。
     * @return externalAccesses
     */
    public List<ExternalAccessesCreate> getExternalAccesses() {
        return externalAccesses;
    }

    public void setExternalAccesses(List<ExternalAccessesCreate> externalAccesses) {
        this.externalAccesses = externalAccesses;
    }

    public InstanceCreate withReferResources(List<ReferResourceCreate> referResources) {
        this.referResources = referResources;
        return this;
    }

    public InstanceCreate addReferResourcesItem(ReferResourceCreate referResourcesItem) {
        if (this.referResources == null) {
            this.referResources = new ArrayList<>();
        }
        this.referResources.add(referResourcesItem);
        return this;
    }

    public InstanceCreate withReferResources(Consumer<List<ReferResourceCreate>> referResourcesSetter) {
        if (this.referResources == null) {
            this.referResources = new ArrayList<>();
        }
        referResourcesSetter.accept(this.referResources);
        return this;
    }

    /**
     * 部署资源。
     * @return referResources
     */
    public List<ReferResourceCreate> getReferResources() {
        return referResources;
    }

    public void setReferResources(List<ReferResourceCreate> referResources) {
        this.referResources = referResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceCreate that = (InstanceCreate) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.environmentId, that.environmentId)
            && Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.replica, that.replica)
            && Objects.equals(this.artifacts, that.artifacts) && Objects.equals(this.version, that.version)
            && Objects.equals(this._configuration, that._configuration)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.externalAccesses, that.externalAccesses)
            && Objects.equals(this.referResources, that.referResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            environmentId,
            flavorId,
            replica,
            artifacts,
            version,
            _configuration,
            description,
            externalAccesses,
            referResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceCreate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    externalAccesses: ").append(toIndentedString(externalAccesses)).append("\n");
        sb.append("    referResources: ").append(toIndentedString(referResources)).append("\n");
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
