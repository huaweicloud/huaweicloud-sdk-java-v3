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
 * 实例参数。
 */
public class InstanceListView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_name")

    private String environmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private String platformType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_accesses")

    private List<ExternalAccesses> externalAccesses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private Map<String, Object> artifacts = null;

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
    @JsonProperty(value = "status_detail")

    private InstanceStatusView statusDetail;

    public InstanceListView withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用组件实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstanceListView withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用ID。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public InstanceListView withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * 应用名称。
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public InstanceListView withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件ID。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public InstanceListView withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 组件名称。
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public InstanceListView withName(String name) {
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

    public InstanceListView withEnvironmentId(String environmentId) {
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

    public InstanceListView withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * 环境名称。
     * @return environmentName
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public InstanceListView withPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * 运行平台类型。 应用可以在不同的平台上运行，可选用的平台的类型有以下几种：cce、vmapp。 
     * @return platformType
     */
    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public InstanceListView withVersion(String version) {
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

    public InstanceListView withExternalAccesses(List<ExternalAccesses> externalAccesses) {
        this.externalAccesses = externalAccesses;
        return this;
    }

    public InstanceListView addExternalAccessesItem(ExternalAccesses externalAccessesItem) {
        if (this.externalAccesses == null) {
            this.externalAccesses = new ArrayList<>();
        }
        this.externalAccesses.add(externalAccessesItem);
        return this;
    }

    public InstanceListView withExternalAccesses(Consumer<List<ExternalAccesses>> externalAccessesSetter) {
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
    public List<ExternalAccesses> getExternalAccesses() {
        return externalAccesses;
    }

    public void setExternalAccesses(List<ExternalAccesses> externalAccesses) {
        this.externalAccesses = externalAccesses;
    }

    public InstanceListView withArtifacts(Map<String, Object> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public InstanceListView putArtifactsItem(String key, Object artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new HashMap<>();
        }
        this.artifacts.put(key, artifactsItem);
        return this;
    }

    public InstanceListView withArtifacts(Consumer<Map<String, Object>> artifactsSetter) {
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

    public InstanceListView withCreator(String creator) {
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

    public InstanceListView withCreateTime(Long createTime) {
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

    public InstanceListView withUpdateTime(Long updateTime) {
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

    public InstanceListView withStatusDetail(InstanceStatusView statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    public InstanceListView withStatusDetail(Consumer<InstanceStatusView> statusDetailSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceListView instanceListView = (InstanceListView) o;
        return Objects.equals(this.id, instanceListView.id)
            && Objects.equals(this.applicationId, instanceListView.applicationId)
            && Objects.equals(this.applicationName, instanceListView.applicationName)
            && Objects.equals(this.componentId, instanceListView.componentId)
            && Objects.equals(this.componentName, instanceListView.componentName)
            && Objects.equals(this.name, instanceListView.name)
            && Objects.equals(this.environmentId, instanceListView.environmentId)
            && Objects.equals(this.environmentName, instanceListView.environmentName)
            && Objects.equals(this.platformType, instanceListView.platformType)
            && Objects.equals(this.version, instanceListView.version)
            && Objects.equals(this.externalAccesses, instanceListView.externalAccesses)
            && Objects.equals(this.artifacts, instanceListView.artifacts)
            && Objects.equals(this.creator, instanceListView.creator)
            && Objects.equals(this.createTime, instanceListView.createTime)
            && Objects.equals(this.updateTime, instanceListView.updateTime)
            && Objects.equals(this.statusDetail, instanceListView.statusDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            applicationId,
            applicationName,
            componentId,
            componentName,
            name,
            environmentId,
            environmentName,
            platformType,
            version,
            externalAccesses,
            artifacts,
            creator,
            createTime,
            updateTime,
            statusDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceListView {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    externalAccesses: ").append(toIndentedString(externalAccesses)).append("\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
