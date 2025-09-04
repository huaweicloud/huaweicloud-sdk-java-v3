package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DomainStatuses
 */
public class DomainStatuses {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_quota")

    private Boolean freeQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_package_quota")

    private Boolean freePackageQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_federation")

    private Integer isFederation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_whitelist")

    private Integer isWhitelist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private Integer domainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_business_type")

    private String domainBusinessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_malicious_docker_args")

    private String domainMaliciousDockerArgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_custom_env")

    private Integer allowCustomEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_threshold")

    private String specThreshold;

    public DomainStatuses withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * **参数解释**： 服务名。 **约束限制**： 不涉及。 **取值范围**： 默认CodeCI。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public DomainStatuses withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 租户id。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DomainStatuses withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释**： 租户名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainStatuses withFreeQuota(Boolean freeQuota) {
        this.freeQuota = freeQuota;
        return this;
    }

    /**
     * **参数解释**： freeQuota。 **约束限制**： 不涉及。 **取值范围**： true或false。
     * @return freeQuota
     */
    public Boolean getFreeQuota() {
        return freeQuota;
    }

    public void setFreeQuota(Boolean freeQuota) {
        this.freeQuota = freeQuota;
    }

    public DomainStatuses withFreePackageQuota(Boolean freePackageQuota) {
        this.freePackageQuota = freePackageQuota;
        return this;
    }

    /**
     * **参数解释**： freePackageQuota。 **约束限制**： 不涉及。 **取值范围**： true或false。
     * @return freePackageQuota
     */
    public Boolean getFreePackageQuota() {
        return freePackageQuota;
    }

    public void setFreePackageQuota(Boolean freePackageQuota) {
        this.freePackageQuota = freePackageQuota;
    }

    public DomainStatuses withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DomainStatuses withIsFederation(Integer isFederation) {
        this.isFederation = isFederation;
        return this;
    }

    /**
     * **参数解释**： isFederation。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return isFederation
     */
    public Integer getIsFederation() {
        return isFederation;
    }

    public void setIsFederation(Integer isFederation) {
        this.isFederation = isFederation;
    }

    public DomainStatuses withIsWhitelist(Integer isWhitelist) {
        this.isWhitelist = isWhitelist;
        return this;
    }

    /**
     * **参数解释**： 白名单标识。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return isWhitelist
     */
    public Integer getIsWhitelist() {
        return isWhitelist;
    }

    public void setIsWhitelist(Integer isWhitelist) {
        this.isWhitelist = isWhitelist;
    }

    public DomainStatuses withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 地区。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DomainStatuses withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * **参数解释**： 包类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public DomainStatuses withDomainType(Integer domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * **参数解释**： 租户类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return domainType
     */
    public Integer getDomainType() {
        return domainType;
    }

    public void setDomainType(Integer domainType) {
        this.domainType = domainType;
    }

    public DomainStatuses withDomainBusinessType(String domainBusinessType) {
        this.domainBusinessType = domainBusinessType;
        return this;
    }

    /**
     * **参数解释**： 租户业务类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return domainBusinessType
     */
    public String getDomainBusinessType() {
        return domainBusinessType;
    }

    public void setDomainBusinessType(String domainBusinessType) {
        this.domainBusinessType = domainBusinessType;
    }

    public DomainStatuses withDomainMaliciousDockerArgs(String domainMaliciousDockerArgs) {
        this.domainMaliciousDockerArgs = domainMaliciousDockerArgs;
        return this;
    }

    /**
     * **参数解释**： domainMaliciousDockerArgs。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return domainMaliciousDockerArgs
     */
    public String getDomainMaliciousDockerArgs() {
        return domainMaliciousDockerArgs;
    }

    public void setDomainMaliciousDockerArgs(String domainMaliciousDockerArgs) {
        this.domainMaliciousDockerArgs = domainMaliciousDockerArgs;
    }

    public DomainStatuses withAllowCustomEnv(Integer allowCustomEnv) {
        this.allowCustomEnv = allowCustomEnv;
        return this;
    }

    /**
     * **参数解释**： 允许自定义环境数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return allowCustomEnv
     */
    public Integer getAllowCustomEnv() {
        return allowCustomEnv;
    }

    public void setAllowCustomEnv(Integer allowCustomEnv) {
        this.allowCustomEnv = allowCustomEnv;
    }

    public DomainStatuses withSpecThreshold(String specThreshold) {
        this.specThreshold = specThreshold;
        return this;
    }

    /**
     * **参数解释**： 默认的加速阈值注入。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return specThreshold
     */
    public String getSpecThreshold() {
        return specThreshold;
    }

    public void setSpecThreshold(String specThreshold) {
        this.specThreshold = specThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainStatuses that = (DomainStatuses) obj;
        return Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.freeQuota, that.freeQuota)
            && Objects.equals(this.freePackageQuota, that.freePackageQuota) && Objects.equals(this.status, that.status)
            && Objects.equals(this.isFederation, that.isFederation)
            && Objects.equals(this.isWhitelist, that.isWhitelist) && Objects.equals(this.region, that.region)
            && Objects.equals(this.packageType, that.packageType) && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.domainBusinessType, that.domainBusinessType)
            && Objects.equals(this.domainMaliciousDockerArgs, that.domainMaliciousDockerArgs)
            && Objects.equals(this.allowCustomEnv, that.allowCustomEnv)
            && Objects.equals(this.specThreshold, that.specThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName,
            domainId,
            domainName,
            freeQuota,
            freePackageQuota,
            status,
            isFederation,
            isWhitelist,
            region,
            packageType,
            domainType,
            domainBusinessType,
            domainMaliciousDockerArgs,
            allowCustomEnv,
            specThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainStatuses {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    freeQuota: ").append(toIndentedString(freeQuota)).append("\n");
        sb.append("    freePackageQuota: ").append(toIndentedString(freePackageQuota)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isFederation: ").append(toIndentedString(isFederation)).append("\n");
        sb.append("    isWhitelist: ").append(toIndentedString(isWhitelist)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    domainBusinessType: ").append(toIndentedString(domainBusinessType)).append("\n");
        sb.append("    domainMaliciousDockerArgs: ").append(toIndentedString(domainMaliciousDockerArgs)).append("\n");
        sb.append("    allowCustomEnv: ").append(toIndentedString(allowCustomEnv)).append("\n");
        sb.append("    specThreshold: ").append(toIndentedString(specThreshold)).append("\n");
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
