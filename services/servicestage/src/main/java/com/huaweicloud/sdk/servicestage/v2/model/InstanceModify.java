package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ExternalAccesses;
import com.huaweicloud.sdk.servicestage.v2.model.FlavorId;
import com.huaweicloud.sdk.servicestage.v2.model.ReferResourceCreate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * InstanceModify
 */
public class InstanceModify  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_id")
    
    private FlavorId flavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="artifacts")
    
    private Map<String, Object> artifacts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration")
    
    private Map<String, Object> _configuration = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="external_accesses")
    
    private List<ExternalAccesses> externalAccesses = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="refer_resources")
    
    private List<ReferResourceCreate> referResources = null;
    
    public InstanceModify withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 应用组件版本号，满足版本语义，如1.0.1。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public InstanceModify withFlavorId(FlavorId flavorId) {
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

    

    public InstanceModify withArtifacts(Map<String, Object> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    

    public InstanceModify putArtifactsItem(String key, Object artifactsItem) {
        this.artifacts.put(key, artifactsItem);
        return this;
    }

    public InstanceModify withArtifacts(Consumer<Map<String, Object>> artifactsSetter) {
        if(this.artifacts == null ){
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

    

    public InstanceModify withConfiguration(Map<String, Object> _configuration) {
        this._configuration = _configuration;
        return this;
    }

    

    public InstanceModify putConfigurationItem(String key, Object _configurationItem) {
        this._configuration.put(key, _configurationItem);
        return this;
    }

    public InstanceModify withConfiguration(Consumer<Map<String, Object>> _configurationSetter) {
        if(this._configuration == null ){
            this._configuration = new HashMap<>();
        }
        _configurationSetter.accept(this._configuration);
        return this;
    }
    /**
     * 应用配置，如环境变量。
     * @return _configuration
     */
    public Map<String, Object> getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(Map<String, Object> _configuration) {
        this._configuration = _configuration;
    }

    

    public InstanceModify withDescription(String description) {
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

    

    public InstanceModify withExternalAccesses(List<ExternalAccesses> externalAccesses) {
        this.externalAccesses = externalAccesses;
        return this;
    }

    
    public InstanceModify addExternalAccessesItem(ExternalAccesses externalAccessesItem) {
        this.externalAccesses.add(externalAccessesItem);
        return this;
    }

    public InstanceModify withExternalAccesses(Consumer<List<ExternalAccesses>> externalAccessesSetter) {
        if(this.externalAccesses == null ){
            this.externalAccesses = new ArrayList<>();
        }
        externalAccessesSetter.accept(this.externalAccesses);
        return this;
    }

    /**
     * 访问方式列表。
     * @return externalAccesses
     */
    public List<ExternalAccesses> getExternalAccesses() {
        return externalAccesses;
    }

    public void setExternalAccesses(List<ExternalAccesses> externalAccesses) {
        this.externalAccesses = externalAccesses;
    }

    

    public InstanceModify withReferResources(List<ReferResourceCreate> referResources) {
        this.referResources = referResources;
        return this;
    }

    
    public InstanceModify addReferResourcesItem(ReferResourceCreate referResourcesItem) {
        this.referResources.add(referResourcesItem);
        return this;
    }

    public InstanceModify withReferResources(Consumer<List<ReferResourceCreate>> referResourcesSetter) {
        if(this.referResources == null ){
            this.referResources = new ArrayList<>();
        }
        referResourcesSetter.accept(this.referResources);
        return this;
    }

    /**
     * 部署资源列表。
     * @return referResources
     */
    public List<ReferResourceCreate> getReferResources() {
        return referResources;
    }

    public void setReferResources(List<ReferResourceCreate> referResources) {
        this.referResources = referResources;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceModify instanceModify = (InstanceModify) o;
        return Objects.equals(this.version, instanceModify.version) &&
            Objects.equals(this.flavorId, instanceModify.flavorId) &&
            Objects.equals(this.artifacts, instanceModify.artifacts) &&
            Objects.equals(this._configuration, instanceModify._configuration) &&
            Objects.equals(this.description, instanceModify.description) &&
            Objects.equals(this.externalAccesses, instanceModify.externalAccesses) &&
            Objects.equals(this.referResources, instanceModify.referResources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(version, flavorId, artifacts, _configuration, description, externalAccesses, referResources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceModify {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
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

