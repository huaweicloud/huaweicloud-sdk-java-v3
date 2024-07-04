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
 * ComponentInstanceOverView
 */
public class ComponentInstanceOverView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private InstancePlatformType platformType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private FlavorId flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private Map<String, Object> artifacts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private Object _configuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_accesses")

    private List<ExternalAccesses> externalAccesses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refer_resources")

    private List<ReferResources> referResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_detail")

    private InstanceStatusView statusDetail;

    public ComponentInstanceOverView withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 应用组件实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ComponentInstanceOverView withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 应用组件实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ComponentInstanceOverView withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComponentInstanceOverView withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * 应用组件环境ID。
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public ComponentInstanceOverView withPlatformType(InstancePlatformType platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * Get platformType
     * @return platformType
     */
    public InstancePlatformType getPlatformType() {
        return platformType;
    }

    public void setPlatformType(InstancePlatformType platformType) {
        this.platformType = platformType;
    }

    public ComponentInstanceOverView withFlavorId(FlavorId flavorId) {
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

    public ComponentInstanceOverView withArtifacts(Map<String, Object> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public ComponentInstanceOverView putArtifactsItem(String key, Object artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new HashMap<>();
        }
        this.artifacts.put(key, artifactsItem);
        return this;
    }

    public ComponentInstanceOverView withArtifacts(Consumer<Map<String, Object>> artifactsSetter) {
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

    public ComponentInstanceOverView withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用组件版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ComponentInstanceOverView withConfiguration(Object _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * 应用组件配置，如环境变量。
     * @return _configuration
     */
    public Object getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(Object _configuration) {
        this._configuration = _configuration;
    }

    public ComponentInstanceOverView withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ComponentInstanceOverView withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ComponentInstanceOverView withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ComponentInstanceOverView withExternalAccesses(List<ExternalAccesses> externalAccesses) {
        this.externalAccesses = externalAccesses;
        return this;
    }

    public ComponentInstanceOverView addExternalAccessesItem(ExternalAccesses externalAccessesItem) {
        if (this.externalAccesses == null) {
            this.externalAccesses = new ArrayList<>();
        }
        this.externalAccesses.add(externalAccessesItem);
        return this;
    }

    public ComponentInstanceOverView withExternalAccesses(Consumer<List<ExternalAccesses>> externalAccessesSetter) {
        if (this.externalAccesses == null) {
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

    public ComponentInstanceOverView withReferResources(List<ReferResources> referResources) {
        this.referResources = referResources;
        return this;
    }

    public ComponentInstanceOverView addReferResourcesItem(ReferResources referResourcesItem) {
        if (this.referResources == null) {
            this.referResources = new ArrayList<>();
        }
        this.referResources.add(referResourcesItem);
        return this;
    }

    public ComponentInstanceOverView withReferResources(Consumer<List<ReferResources>> referResourcesSetter) {
        if (this.referResources == null) {
            this.referResources = new ArrayList<>();
        }
        referResourcesSetter.accept(this.referResources);
        return this;
    }

    /**
     * 部署资源列表。
     * @return referResources
     */
    public List<ReferResources> getReferResources() {
        return referResources;
    }

    public void setReferResources(List<ReferResources> referResources) {
        this.referResources = referResources;
    }

    public ComponentInstanceOverView withStatusDetail(InstanceStatusView statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    public ComponentInstanceOverView withStatusDetail(Consumer<InstanceStatusView> statusDetailSetter) {
        if (this.statusDetail == null) {
            this.statusDetail = new InstanceStatusView();
            statusDetailSetter.accept(this.statusDetail);
        }

        return this;
    }

    /**
     * Get statusDetail
     * @return statusDetail
     */
    public InstanceStatusView getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(InstanceStatusView statusDetail) {
        this.statusDetail = statusDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentInstanceOverView that = (ComponentInstanceOverView) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.environmentId, that.environmentId)
            && Objects.equals(this.platformType, that.platformType) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.artifacts, that.artifacts) && Objects.equals(this.version, that.version)
            && Objects.equals(this._configuration, that._configuration) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.externalAccesses, that.externalAccesses)
            && Objects.equals(this.referResources, that.referResources)
            && Objects.equals(this.statusDetail, that.statusDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            instanceName,
            description,
            environmentId,
            platformType,
            flavorId,
            artifacts,
            version,
            _configuration,
            creator,
            createTime,
            updateTime,
            externalAccesses,
            referResources,
            statusDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentInstanceOverView {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    externalAccesses: ").append(toIndentedString(externalAccesses)).append("\n");
        sb.append("    referResources: ").append(toIndentedString(referResources)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
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
