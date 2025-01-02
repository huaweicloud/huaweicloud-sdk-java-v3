package com.huaweicloud.sdk.config.v1.model;

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
public class CreateOrUpdateRemediationConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automatic")

    private Boolean automatic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_region_id")

    private String targetRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_parameter")

    private List<RemediationStaticParameter> staticParameter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_parameter")

    private RemediationResourceParameter resourceParameter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_attempts")

    private Integer maximumAttempts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_attempt_seconds")

    private Integer retryAttemptSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_value")

    private String authValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    public CreateOrUpdateRemediationConfigurationResponse withAutomatic(Boolean automatic) {
        this.automatic = automatic;
        return this;
    }

    /**
     * 是否为自动修正。
     * @return automatic
     */
    public Boolean getAutomatic() {
        return automatic;
    }

    public void setAutomatic(Boolean automatic) {
        this.automatic = automatic;
    }

    public CreateOrUpdateRemediationConfigurationResponse withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 合规规则修正执行的方式。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public CreateOrUpdateRemediationConfigurationResponse withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 修正执行的目标ID。如果修正方式为fgs，则该值为函数工作流的函数urn；如果修正方式为rfs，则该值为资源编排服务的模板name与版本号，两者以/分割，如果没有指定默认V1。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public CreateOrUpdateRemediationConfigurationResponse withTargetRegionId(String targetRegionId) {
        this.targetRegionId = targetRegionId;
        return this;
    }

    /**
     * 修正执行的目标的regionId。如果修正方式为RFS，该字段为空则Config服务会默认配置北京四（中国站）或香港一（国际站）的regionId；如果修正方式为FGS，该字段为空则Config服务会根据实例urn自动配置。指定target_project_id字段则该字段必选。
     * @return targetRegionId
     */
    public String getTargetRegionId() {
        return targetRegionId;
    }

    public void setTargetRegionId(String targetRegionId) {
        this.targetRegionId = targetRegionId;
    }

    public CreateOrUpdateRemediationConfigurationResponse withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 修正执行的目标的projectId。如果修正方式为RFS，该字段为空则Config服务会默认配置北京四（中国站）或香港一（国际站）的主projectId；如果修正方式为FGS，该字段为空则Config服务会根据实例urn自动配置。指定target_region_id字段则该字段必选。
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public CreateOrUpdateRemediationConfigurationResponse withStaticParameter(
        List<RemediationStaticParameter> staticParameter) {
        this.staticParameter = staticParameter;
        return this;
    }

    public CreateOrUpdateRemediationConfigurationResponse addStaticParameterItem(
        RemediationStaticParameter staticParameterItem) {
        if (this.staticParameter == null) {
            this.staticParameter = new ArrayList<>();
        }
        this.staticParameter.add(staticParameterItem);
        return this;
    }

    public CreateOrUpdateRemediationConfigurationResponse withStaticParameter(
        Consumer<List<RemediationStaticParameter>> staticParameterSetter) {
        if (this.staticParameter == null) {
            this.staticParameter = new ArrayList<>();
        }
        staticParameterSetter.accept(this.staticParameter);
        return this;
    }

    /**
     * 修正执行的参数。
     * @return staticParameter
     */
    public List<RemediationStaticParameter> getStaticParameter() {
        return staticParameter;
    }

    public void setStaticParameter(List<RemediationStaticParameter> staticParameter) {
        this.staticParameter = staticParameter;
    }

    public CreateOrUpdateRemediationConfigurationResponse withResourceParameter(
        RemediationResourceParameter resourceParameter) {
        this.resourceParameter = resourceParameter;
        return this;
    }

    public CreateOrUpdateRemediationConfigurationResponse withResourceParameter(
        Consumer<RemediationResourceParameter> resourceParameterSetter) {
        if (this.resourceParameter == null) {
            this.resourceParameter = new RemediationResourceParameter();
            resourceParameterSetter.accept(this.resourceParameter);
        }

        return this;
    }

    /**
     * Get resourceParameter
     * @return resourceParameter
     */
    public RemediationResourceParameter getResourceParameter() {
        return resourceParameter;
    }

    public void setResourceParameter(RemediationResourceParameter resourceParameter) {
        this.resourceParameter = resourceParameter;
    }

    public CreateOrUpdateRemediationConfigurationResponse withMaximumAttempts(Integer maximumAttempts) {
        this.maximumAttempts = maximumAttempts;
        return this;
    }

    /**
     * 指定时间内修正的最大尝试次数。
     * minimum: 1
     * maximum: 25
     * @return maximumAttempts
     */
    public Integer getMaximumAttempts() {
        return maximumAttempts;
    }

    public void setMaximumAttempts(Integer maximumAttempts) {
        this.maximumAttempts = maximumAttempts;
    }

    public CreateOrUpdateRemediationConfigurationResponse withRetryAttemptSeconds(Integer retryAttemptSeconds) {
        this.retryAttemptSeconds = retryAttemptSeconds;
        return this;
    }

    /**
     * 用于防止循环修正的时间窗口，如果在指定时间内进行了自动修正的最大尝试次数，则将资源添加至修正例外。
     * minimum: 60
     * maximum: 3600
     * @return retryAttemptSeconds
     */
    public Integer getRetryAttemptSeconds() {
        return retryAttemptSeconds;
    }

    public void setRetryAttemptSeconds(Integer retryAttemptSeconds) {
        this.retryAttemptSeconds = retryAttemptSeconds;
    }

    public CreateOrUpdateRemediationConfigurationResponse withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 合规规则修正配置的权限方式。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public CreateOrUpdateRemediationConfigurationResponse withAuthValue(String authValue) {
        this.authValue = authValue;
        return this;
    }

    /**
     * 合规规则修正配置的权限信息。
     * @return authValue
     */
    public String getAuthValue() {
        return authValue;
    }

    public void setAuthValue(String authValue) {
        this.authValue = authValue;
    }

    public CreateOrUpdateRemediationConfigurationResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 修正配置的创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreateOrUpdateRemediationConfigurationResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 修正配置的更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreateOrUpdateRemediationConfigurationResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建者。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOrUpdateRemediationConfigurationResponse that = (CreateOrUpdateRemediationConfigurationResponse) obj;
        return Objects.equals(this.automatic, that.automatic) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.targetId, that.targetId) && Objects.equals(this.targetRegionId, that.targetRegionId)
            && Objects.equals(this.targetProjectId, that.targetProjectId)
            && Objects.equals(this.staticParameter, that.staticParameter)
            && Objects.equals(this.resourceParameter, that.resourceParameter)
            && Objects.equals(this.maximumAttempts, that.maximumAttempts)
            && Objects.equals(this.retryAttemptSeconds, that.retryAttemptSeconds)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.authValue, that.authValue)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.createdBy, that.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(automatic,
            targetType,
            targetId,
            targetRegionId,
            targetProjectId,
            staticParameter,
            resourceParameter,
            maximumAttempts,
            retryAttemptSeconds,
            authType,
            authValue,
            createdAt,
            updatedAt,
            createdBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrUpdateRemediationConfigurationResponse {\n");
        sb.append("    automatic: ").append(toIndentedString(automatic)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetRegionId: ").append(toIndentedString(targetRegionId)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    staticParameter: ").append(toIndentedString(staticParameter)).append("\n");
        sb.append("    resourceParameter: ").append(toIndentedString(resourceParameter)).append("\n");
        sb.append("    maximumAttempts: ").append(toIndentedString(maximumAttempts)).append("\n");
        sb.append("    retryAttemptSeconds: ").append(toIndentedString(retryAttemptSeconds)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authValue: ").append(toIndentedString(authValue)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
