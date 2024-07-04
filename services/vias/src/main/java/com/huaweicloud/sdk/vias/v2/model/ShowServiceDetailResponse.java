package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowServiceDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo")

    private String logo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_version")

    private String functionVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_flag")

    private Boolean releaseFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_at")

    private Long releaseAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api")

    private String api;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_name")

    private String algName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_id")

    private String algId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_mode")

    private String requestMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_version")

    private String algVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_versions")

    private List<String> algVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagram")

    private String diagram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_api_list")

    private List<ServiceApiDto> serviceApiList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_constraints")

    private DeploymentConstraintsDto deploymentConstraints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company")

    private String company;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_class")

    private String algClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_status")

    private String algStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ShowServiceDetailResponse withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务ID
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ShowServiceDetailResponse withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ShowServiceDetailResponse withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * 算法图标，Base64编码格式的字符串，非空时返回
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ShowServiceDetailResponse withFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
        return this;
    }

    /**
     * 功能版本
     * @return functionVersion
     */
    public String getFunctionVersion() {
        return functionVersion;
    }

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    public ShowServiceDetailResponse withReleaseFlag(Boolean releaseFlag) {
        this.releaseFlag = releaseFlag;
        return this;
    }

    /**
     * 是否已发布，取值为“true”或者“false”
     * @return releaseFlag
     */
    public Boolean getReleaseFlag() {
        return releaseFlag;
    }

    public void setReleaseFlag(Boolean releaseFlag) {
        this.releaseFlag = releaseFlag;
    }

    public ShowServiceDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 算法描述，非空时返回
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowServiceDetailResponse withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public ShowServiceDetailResponse withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowServiceDetailResponse withReleaseAt(Long releaseAt) {
        this.releaseAt = releaseAt;
        return this;
    }

    /**
     * 发布时间
     * @return releaseAt
     */
    public Long getReleaseAt() {
        return releaseAt;
    }

    public void setReleaseAt(Long releaseAt) {
        this.releaseAt = releaseAt;
    }

    public ShowServiceDetailResponse withApi(String api) {
        this.api = api;
        return this;
    }

    /**
     * API
     * @return api
     */
    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public ShowServiceDetailResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 资源池ID
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ShowServiceDetailResponse withAlgName(String algName) {
        this.algName = algName;
        return this;
    }

    /**
     * 算法名称
     * @return algName
     */
    public String getAlgName() {
        return algName;
    }

    public void setAlgName(String algName) {
        this.algName = algName;
    }

    public ShowServiceDetailResponse withAlgId(String algId) {
        this.algId = algId;
        return this;
    }

    /**
     * 算法ID
     * @return algId
     */
    public String getAlgId() {
        return algId;
    }

    public void setAlgId(String algId) {
        this.algId = algId;
    }

    public ShowServiceDetailResponse withRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }

    /**
     * 请求模式，取值为“sync”或者“async”
     * @return requestMode
     */
    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public ShowServiceDetailResponse withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 算法包名称
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public ShowServiceDetailResponse withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 算法包ID
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public ShowServiceDetailResponse withAlgVersion(String algVersion) {
        this.algVersion = algVersion;
        return this;
    }

    /**
     * 算法版本
     * @return algVersion
     */
    public String getAlgVersion() {
        return algVersion;
    }

    public void setAlgVersion(String algVersion) {
        this.algVersion = algVersion;
    }

    public ShowServiceDetailResponse withAlgVersions(List<String> algVersions) {
        this.algVersions = algVersions;
        return this;
    }

    public ShowServiceDetailResponse addAlgVersionsItem(String algVersionsItem) {
        if (this.algVersions == null) {
            this.algVersions = new ArrayList<>();
        }
        this.algVersions.add(algVersionsItem);
        return this;
    }

    public ShowServiceDetailResponse withAlgVersions(Consumer<List<String>> algVersionsSetter) {
        if (this.algVersions == null) {
            this.algVersions = new ArrayList<>();
        }
        algVersionsSetter.accept(this.algVersions);
        return this;
    }

    /**
     * 算法历史版本
     * @return algVersions
     */
    public List<String> getAlgVersions() {
        return algVersions;
    }

    public void setAlgVersions(List<String> algVersions) {
        this.algVersions = algVersions;
    }

    public ShowServiceDetailResponse withDiagram(String diagram) {
        this.diagram = diagram;
        return this;
    }

    /**
     * 算法场景图，Base64编码格式的字符串，非空时返回
     * @return diagram
     */
    public String getDiagram() {
        return diagram;
    }

    public void setDiagram(String diagram) {
        this.diagram = diagram;
    }

    public ShowServiceDetailResponse withServiceApiList(List<ServiceApiDto> serviceApiList) {
        this.serviceApiList = serviceApiList;
        return this;
    }

    public ShowServiceDetailResponse addServiceApiListItem(ServiceApiDto serviceApiListItem) {
        if (this.serviceApiList == null) {
            this.serviceApiList = new ArrayList<>();
        }
        this.serviceApiList.add(serviceApiListItem);
        return this;
    }

    public ShowServiceDetailResponse withServiceApiList(Consumer<List<ServiceApiDto>> serviceApiListSetter) {
        if (this.serviceApiList == null) {
            this.serviceApiList = new ArrayList<>();
        }
        serviceApiListSetter.accept(this.serviceApiList);
        return this;
    }

    /**
     * 服务API列表
     * @return serviceApiList
     */
    public List<ServiceApiDto> getServiceApiList() {
        return serviceApiList;
    }

    public void setServiceApiList(List<ServiceApiDto> serviceApiList) {
        this.serviceApiList = serviceApiList;
    }

    public ShowServiceDetailResponse withDeploymentConstraints(DeploymentConstraintsDto deploymentConstraints) {
        this.deploymentConstraints = deploymentConstraints;
        return this;
    }

    public ShowServiceDetailResponse withDeploymentConstraints(
        Consumer<DeploymentConstraintsDto> deploymentConstraintsSetter) {
        if (this.deploymentConstraints == null) {
            this.deploymentConstraints = new DeploymentConstraintsDto();
            deploymentConstraintsSetter.accept(this.deploymentConstraints);
        }

        return this;
    }

    /**
     * Get deploymentConstraints
     * @return deploymentConstraints
     */
    public DeploymentConstraintsDto getDeploymentConstraints() {
        return deploymentConstraints;
    }

    public void setDeploymentConstraints(DeploymentConstraintsDto deploymentConstraints) {
        this.deploymentConstraints = deploymentConstraints;
    }

    public ShowServiceDetailResponse withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * 厂商名称
     * @return company
     */
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ShowServiceDetailResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ShowServiceDetailResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowServiceDetailResponse withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 应用场景标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ShowServiceDetailResponse withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * 部署类型，取值为“cloud”或者“edge”
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public ShowServiceDetailResponse withAlgClass(String algClass) {
        this.algClass = algClass;
        return this;
    }

    /**
     * 算法类别，取值为“self”或者“partner”
     * @return algClass
     */
    public String getAlgClass() {
        return algClass;
    }

    public void setAlgClass(String algClass) {
        this.algClass = algClass;
    }

    public ShowServiceDetailResponse withAlgStatus(String algStatus) {
        this.algStatus = algStatus;
        return this;
    }

    /**
     * 算法状态，取值为“service_running”、“service_deploying”、“service_failed”、“service_stopping”、“service_stopped”、“service_upgrading”、“service_finished”、“service_concerning”或者“not_deployed”
     * @return algStatus
     */
    public String getAlgStatus() {
        return algStatus;
    }

    public void setAlgStatus(String algStatus) {
        this.algStatus = algStatus;
    }

    public ShowServiceDetailResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 服务异常信息，非空时返回
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServiceDetailResponse that = (ShowServiceDetailResponse) obj;
        return Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.logo, that.logo) && Objects.equals(this.functionVersion, that.functionVersion)
            && Objects.equals(this.releaseFlag, that.releaseFlag) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.releaseAt, that.releaseAt) && Objects.equals(this.api, that.api)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.algName, that.algName)
            && Objects.equals(this.algId, that.algId) && Objects.equals(this.requestMode, that.requestMode)
            && Objects.equals(this.packageName, that.packageName) && Objects.equals(this.packageId, that.packageId)
            && Objects.equals(this.algVersion, that.algVersion) && Objects.equals(this.algVersions, that.algVersions)
            && Objects.equals(this.diagram, that.diagram) && Objects.equals(this.serviceApiList, that.serviceApiList)
            && Objects.equals(this.deploymentConstraints, that.deploymentConstraints)
            && Objects.equals(this.company, that.company) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.deployType, that.deployType) && Objects.equals(this.algClass, that.algClass)
            && Objects.equals(this.algStatus, that.algStatus) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId,
            serviceName,
            logo,
            functionVersion,
            releaseFlag,
            description,
            createdAt,
            updatedAt,
            releaseAt,
            api,
            poolId,
            algName,
            algId,
            requestMode,
            packageName,
            packageId,
            algVersion,
            algVersions,
            diagram,
            serviceApiList,
            deploymentConstraints,
            company,
            tags,
            deployType,
            algClass,
            algStatus,
            errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServiceDetailResponse {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    functionVersion: ").append(toIndentedString(functionVersion)).append("\n");
        sb.append("    releaseFlag: ").append(toIndentedString(releaseFlag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    releaseAt: ").append(toIndentedString(releaseAt)).append("\n");
        sb.append("    api: ").append(toIndentedString(api)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    algName: ").append(toIndentedString(algName)).append("\n");
        sb.append("    algId: ").append(toIndentedString(algId)).append("\n");
        sb.append("    requestMode: ").append(toIndentedString(requestMode)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    algVersion: ").append(toIndentedString(algVersion)).append("\n");
        sb.append("    algVersions: ").append(toIndentedString(algVersions)).append("\n");
        sb.append("    diagram: ").append(toIndentedString(diagram)).append("\n");
        sb.append("    serviceApiList: ").append(toIndentedString(serviceApiList)).append("\n");
        sb.append("    deploymentConstraints: ").append(toIndentedString(deploymentConstraints)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    algClass: ").append(toIndentedString(algClass)).append("\n");
        sb.append("    algStatus: ").append(toIndentedString(algStatus)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
