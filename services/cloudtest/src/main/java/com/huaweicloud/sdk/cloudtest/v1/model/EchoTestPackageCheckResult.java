package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * EchoTestPackageCheckResult
 */
public class EchoTestPackageCheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private OffsetDateTime expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_license")

    private Boolean hasLicense;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_amount")

    private Double originalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_user")

    private Boolean packageUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_status")

    private String resourceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_used")

    private Double resourceUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    public EchoTestPackageCheckResult withExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 到期时间
     * @return expirationTime
     */
    public OffsetDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    public EchoTestPackageCheckResult withHasLicense(Boolean hasLicense) {
        this.hasLicense = hasLicense;
        return this;
    }

    /**
     * 是否拥有license
     * @return hasLicense
     */
    public Boolean getHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(Boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public EchoTestPackageCheckResult withOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    /**
     * 总量
     * @return originalAmount
     */
    public Double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
    }

    public EchoTestPackageCheckResult withPackageUser(Boolean packageUser) {
        this.packageUser = packageUser;
        return this;
    }

    /**
     * 是否跨租户
     * @return packageUser
     */
    public Boolean getPackageUser() {
        return packageUser;
    }

    public void setPackageUser(Boolean packageUser) {
        this.packageUser = packageUser;
    }

    public EchoTestPackageCheckResult withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源记录id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public EchoTestPackageCheckResult withResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }

    /**
     * 套餐状态
     * @return resourceStatus
     */
    public String getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    public EchoTestPackageCheckResult withResourceUsed(Double resourceUsed) {
        this.resourceUsed = resourceUsed;
        return this;
    }

    /**
     * 用量使用量
     * @return resourceUsed
     */
    public Double getResourceUsed() {
        return resourceUsed;
    }

    public void setResourceUsed(Double resourceUsed) {
        this.resourceUsed = resourceUsed;
    }

    public EchoTestPackageCheckResult withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 套餐名称
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public EchoTestPackageCheckResult withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public EchoTestPackageCheckResult withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EchoTestPackageCheckResult that = (EchoTestPackageCheckResult) obj;
        return Objects.equals(this.expirationTime, that.expirationTime)
            && Objects.equals(this.hasLicense, that.hasLicense)
            && Objects.equals(this.originalAmount, that.originalAmount)
            && Objects.equals(this.packageUser, that.packageUser) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceStatus, that.resourceStatus)
            && Objects.equals(this.resourceUsed, that.resourceUsed) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.tenantId, that.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirationTime,
            hasLicense,
            originalAmount,
            packageUser,
            resourceId,
            resourceStatus,
            resourceUsed,
            specCode,
            startTime,
            tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EchoTestPackageCheckResult {\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    hasLicense: ").append(toIndentedString(hasLicense)).append("\n");
        sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
        sb.append("    packageUser: ").append(toIndentedString(packageUser)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
        sb.append("    resourceUsed: ").append(toIndentedString(resourceUsed)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
