package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServicesListInfoDto
 */
public class ServicesListInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_id")

    private String algId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company")

    private String company;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_version")

    private String algVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_version")

    private String functionVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_status")

    private String algStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_class")

    private String algClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_mode")

    private String requestMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_update")

    private Boolean canUpdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_alg_id")

    private String newAlgId;

    public ServicesListInfoDto withAlgId(String algId) {
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

    public ServicesListInfoDto withServiceId(String serviceId) {
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

    public ServicesListInfoDto withServiceName(String serviceName) {
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

    public ServicesListInfoDto withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 算法服务包ID
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public ServicesListInfoDto withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 算法服务包名称
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public ServicesListInfoDto withCompany(String company) {
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

    public ServicesListInfoDto withAlgVersion(String algVersion) {
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

    public ServicesListInfoDto withFunctionVersion(String functionVersion) {
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

    public ServicesListInfoDto withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ServicesListInfoDto addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ServicesListInfoDto withTags(Consumer<List<String>> tagsSetter) {
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

    public ServicesListInfoDto withCreatedAt(Long createdAt) {
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

    public ServicesListInfoDto withAlgStatus(String algStatus) {
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

    public ServicesListInfoDto withDeployType(String deployType) {
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

    public ServicesListInfoDto withAlgClass(String algClass) {
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

    public ServicesListInfoDto withRequestMode(String requestMode) {
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

    public ServicesListInfoDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 算法描述，信息非空时返回
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServicesListInfoDto withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 服务异常信息，信息非空时返回
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ServicesListInfoDto withCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
        return this;
    }

    /**
     * 是否可升级，值为true时返回
     * @return canUpdate
     */
    public Boolean getCanUpdate() {
        return canUpdate;
    }

    public void setCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
    }

    public ServicesListInfoDto withNewAlgId(String newAlgId) {
        this.newAlgId = newAlgId;
        return this;
    }

    /**
     * 升级后的算法ID，可升级时返回
     * @return newAlgId
     */
    public String getNewAlgId() {
        return newAlgId;
    }

    public void setNewAlgId(String newAlgId) {
        this.newAlgId = newAlgId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServicesListInfoDto that = (ServicesListInfoDto) obj;
        return Objects.equals(this.algId, that.algId) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.packageId, that.packageId)
            && Objects.equals(this.packageName, that.packageName) && Objects.equals(this.company, that.company)
            && Objects.equals(this.algVersion, that.algVersion)
            && Objects.equals(this.functionVersion, that.functionVersion) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.algStatus, that.algStatus)
            && Objects.equals(this.deployType, that.deployType) && Objects.equals(this.algClass, that.algClass)
            && Objects.equals(this.requestMode, that.requestMode) && Objects.equals(this.description, that.description)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.canUpdate, that.canUpdate)
            && Objects.equals(this.newAlgId, that.newAlgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algId,
            serviceId,
            serviceName,
            packageId,
            packageName,
            company,
            algVersion,
            functionVersion,
            tags,
            createdAt,
            algStatus,
            deployType,
            algClass,
            requestMode,
            description,
            errorMsg,
            canUpdate,
            newAlgId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicesListInfoDto {\n");
        sb.append("    algId: ").append(toIndentedString(algId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    algVersion: ").append(toIndentedString(algVersion)).append("\n");
        sb.append("    functionVersion: ").append(toIndentedString(functionVersion)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    algStatus: ").append(toIndentedString(algStatus)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    algClass: ").append(toIndentedString(algClass)).append("\n");
        sb.append("    requestMode: ").append(toIndentedString(requestMode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    canUpdate: ").append(toIndentedString(canUpdate)).append("\n");
        sb.append("    newAlgId: ").append(toIndentedString(newAlgId)).append("\n");
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
