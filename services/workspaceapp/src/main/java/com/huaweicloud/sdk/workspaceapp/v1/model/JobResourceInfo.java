package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 具体的资源信息。
 */
public class JobResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_type")

    private Map<String, Object> specType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_size")

    private Double specSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure")

    private Integer measure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processed_time")

    private OffsetDateTime processedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_main_resource")

    private Integer isMainResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_resources")

    private List<RelativeResource> mainResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_params")

    private String extendParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_resource_id")

    private String oldResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_cloud_service_type")

    private String oldCloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_resource_type")

    private String oldResourceType;

    public JobResourceInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 客户在云服务Console上可见的资源实例Id，全局唯一，且不可更改，最大64个字符。  注：“规格变更”场景下（包括升降配），是对某个资源实例的规格进行调整，  该资源实例其他信息（比如资源Id、资源名称）和运行的业务数据不变化。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public JobResourceInfo withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称；创建、有最新资源名称场景，必填。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public JobResourceInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型编码；新购、规格变更场景，必填： - hws.service.type.vdi - hws.service.type.marketplace
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public JobResourceInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型编码；新购、规格变更场景，必填: -hws.resource.type.workspace.volume： 云办公桌面磁盘 -hws.resource.type.workspace.desktop： 云办公桌面 -hws.resource.type.workspace.appstream： 云应用 -hws.resource.type.workspace.appstreamsession： 云应用多会话
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public JobResourceInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码；新购、规格变更场景，必填。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public JobResourceInfo withSpecType(Map<String, Object> specType) {
        this.specType = specType;
        return this;
    }

    public JobResourceInfo putSpecTypeItem(String key, Object specTypeItem) {
        if (this.specType == null) {
            this.specType = new HashMap<>();
        }
        this.specType.put(key, specTypeItem);
        return this;
    }

    public JobResourceInfo withSpecType(Consumer<Map<String, Object>> specTypeSetter) {
        if (this.specType == null) {
            this.specType = new HashMap<>();
        }
        specTypeSetter.accept(this.specType);
        return this;
    }

    /**
     * 规格类型，运营上需要呈现和使用的一些规格属性，多个使用K:V格式。 比如带宽的共享/独享(shareable:true/false)，数据盘的系统盘/数据盘类型(root:true/false)。 当前针对共享带宽、共享盘使用，必填。
     * @return specType
     */
    public Map<String, Object> getSpecType() {
        return specType;
    }

    public void setSpecType(Map<String, Object> specType) {
        this.specType = specType;
    }

    public JobResourceInfo withSpecSize(Double specSize) {
        this.specSize = specSize;
        return this;
    }

    /**
     * 某些规格属性大小：比如带宽大小、数据盘大小。
     * @return specSize
     */
    public Double getSpecSize() {
        return specSize;
    }

    public void setSpecSize(Double specSize) {
        this.specSize = specSize;
    }

    public JobResourceInfo withMeasure(Integer measure) {
        this.measure = measure;
        return this;
    }

    /**
     * specSize的单位编码，比如GB、M，有specSize时，此字段必填。
     * @return measure
     */
    public Integer getMeasure() {
        return measure;
    }

    public void setMeasure(Integer measure) {
        this.measure = measure;
    }

    public JobResourceInfo withProcessedTime(OffsetDateTime processedTime) {
        this.processedTime = processedTime;
        return this;
    }

    /**
     * 处理时间。
     * @return processedTime
     */
    public OffsetDateTime getProcessedTime() {
        return processedTime;
    }

    public void setProcessedTime(OffsetDateTime processedTime) {
        this.processedTime = processedTime;
    }

    public JobResourceInfo withIsMainResource(Integer isMainResource) {
        this.isMainResource = isMainResource;
        return this;
    }

    /**
     * 该resourceId是否是主资源（仅开通场景使用，其他场景为空）。 * `1` - 是 * `0` - 否
     * @return isMainResource
     */
    public Integer getIsMainResource() {
        return isMainResource;
    }

    public void setIsMainResource(Integer isMainResource) {
        this.isMainResource = isMainResource;
    }

    public JobResourceInfo withMainResources(List<RelativeResource> mainResources) {
        this.mainResources = mainResources;
        return this;
    }

    public JobResourceInfo addMainResourcesItem(RelativeResource mainResourcesItem) {
        if (this.mainResources == null) {
            this.mainResources = new ArrayList<>();
        }
        this.mainResources.add(mainResourcesItem);
        return this;
    }

    public JobResourceInfo withMainResources(Consumer<List<RelativeResource>> mainResourcesSetter) {
        if (this.mainResources == null) {
            this.mainResources = new ArrayList<>();
        }
        mainResourcesSetter.accept(this.mainResources);
        return this;
    }

    /**
     * resourceId的主资源。  是挂载到/绑定到/依附到/包含于/关联到资源，比如IP的主资源‘云主机’、数据盘的主资源‘云主机’。  如果resourceId是依附在多个资源上，则有多个主资源，比如共享盘挂载到多个云主机上。  无关联主资源，则空，比如独立未挂载的数据盘。
     * @return mainResources
     */
    public List<RelativeResource> getMainResources() {
        return mainResources;
    }

    public void setMainResources(List<RelativeResource> mainResources) {
        this.mainResources = mainResources;
    }

    public JobResourceInfo withExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    /**
     * expireTime：到期时间，域名注册服务使用。  UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ（2016-06-28T00:00:00Z）。
     * @return extendParams
     */
    public String getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(String extendParams) {
        this.extendParams = extendParams;
    }

    public JobResourceInfo withOldResourceId(String oldResourceId) {
        this.oldResourceId = oldResourceId;
        return this;
    }

    /**
     * 仅针对ECS/BMS云服务的“切换操作系统”场景使用。 云主机切换操作系统的资源id会变化场景。 填写变更前老的资源Id。资源Id未变化，无此字段。
     * @return oldResourceId
     */
    public String getOldResourceId() {
        return oldResourceId;
    }

    public void setOldResourceId(String oldResourceId) {
        this.oldResourceId = oldResourceId;
    }

    public JobResourceInfo withOldCloudServiceType(String oldCloudServiceType) {
        this.oldCloudServiceType = oldCloudServiceType;
        return this;
    }

    /**
     * 仅针对ECS/BMS云服务的“切换操作系统”场景使用：云主机切换操作系统的云服务类型编码会变化场景。 填写变更前老的云服务类型编码。云服务类型未变化，无此字段。
     * @return oldCloudServiceType
     */
    public String getOldCloudServiceType() {
        return oldCloudServiceType;
    }

    public void setOldCloudServiceType(String oldCloudServiceType) {
        this.oldCloudServiceType = oldCloudServiceType;
    }

    public JobResourceInfo withOldResourceType(String oldResourceType) {
        this.oldResourceType = oldResourceType;
        return this;
    }

    /**
     * 仅针对ECS/BMS云服务“切换操作系统”场景使用。 云主机切换操作系统的资源类型编码会变化场景。 填写变更前老的资源类型编码。资源类型未变化，无此字段。
     * @return oldResourceType
     */
    public String getOldResourceType() {
        return oldResourceType;
    }

    public void setOldResourceType(String oldResourceType) {
        this.oldResourceType = oldResourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobResourceInfo that = (JobResourceInfo) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.specType, that.specType) && Objects.equals(this.specSize, that.specSize)
            && Objects.equals(this.measure, that.measure) && Objects.equals(this.processedTime, that.processedTime)
            && Objects.equals(this.isMainResource, that.isMainResource)
            && Objects.equals(this.mainResources, that.mainResources)
            && Objects.equals(this.extendParams, that.extendParams)
            && Objects.equals(this.oldResourceId, that.oldResourceId)
            && Objects.equals(this.oldCloudServiceType, that.oldCloudServiceType)
            && Objects.equals(this.oldResourceType, that.oldResourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            resourceName,
            cloudServiceType,
            resourceType,
            resourceSpecCode,
            specType,
            specSize,
            measure,
            processedTime,
            isMainResource,
            mainResources,
            extendParams,
            oldResourceId,
            oldCloudServiceType,
            oldResourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobResourceInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    specSize: ").append(toIndentedString(specSize)).append("\n");
        sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
        sb.append("    processedTime: ").append(toIndentedString(processedTime)).append("\n");
        sb.append("    isMainResource: ").append(toIndentedString(isMainResource)).append("\n");
        sb.append("    mainResources: ").append(toIndentedString(mainResources)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
        sb.append("    oldResourceId: ").append(toIndentedString(oldResourceId)).append("\n");
        sb.append("    oldCloudServiceType: ").append(toIndentedString(oldCloudServiceType)).append("\n");
        sb.append("    oldResourceType: ").append(toIndentedString(oldResourceType)).append("\n");
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
