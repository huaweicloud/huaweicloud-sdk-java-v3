package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BccPolicy
 */
public class BccPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_type")

    private String protectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cyber")

    private String cyber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private String policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbr_policy_detail")

    private CbrPolicyDetail cbrPolicyDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_policy_detail")

    private DbPolicyDetail dbPolicyDetail;

    public BccPolicy withProtectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * 保护类型
     * @return protectionType
     */
    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public BccPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BccPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用策略
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public BccPolicy withCyber(String cyber) {
        this.cyber = cyber;
        return this;
    }

    /**
     * 是否启用加密
     * @return cyber
     */
    public String getCyber() {
        return cyber;
    }

    public void setCyber(String cyber) {
        this.cyber = cyber;
    }

    public BccPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 区域名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BccPolicy withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public BccPolicy withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型，默认obs
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public BccPolicy withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 策略类型
     * @return policyType
     */
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public BccPolicy withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 保护服务类型
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public BccPolicy withCbrPolicyDetail(CbrPolicyDetail cbrPolicyDetail) {
        this.cbrPolicyDetail = cbrPolicyDetail;
        return this;
    }

    public BccPolicy withCbrPolicyDetail(Consumer<CbrPolicyDetail> cbrPolicyDetailSetter) {
        if (this.cbrPolicyDetail == null) {
            this.cbrPolicyDetail = new CbrPolicyDetail();
            cbrPolicyDetailSetter.accept(this.cbrPolicyDetail);
        }

        return this;
    }

    /**
     * Get cbrPolicyDetail
     * @return cbrPolicyDetail
     */
    public CbrPolicyDetail getCbrPolicyDetail() {
        return cbrPolicyDetail;
    }

    public void setCbrPolicyDetail(CbrPolicyDetail cbrPolicyDetail) {
        this.cbrPolicyDetail = cbrPolicyDetail;
    }

    public BccPolicy withDbPolicyDetail(DbPolicyDetail dbPolicyDetail) {
        this.dbPolicyDetail = dbPolicyDetail;
        return this;
    }

    public BccPolicy withDbPolicyDetail(Consumer<DbPolicyDetail> dbPolicyDetailSetter) {
        if (this.dbPolicyDetail == null) {
            this.dbPolicyDetail = new DbPolicyDetail();
            dbPolicyDetailSetter.accept(this.dbPolicyDetail);
        }

        return this;
    }

    /**
     * Get dbPolicyDetail
     * @return dbPolicyDetail
     */
    public DbPolicyDetail getDbPolicyDetail() {
        return dbPolicyDetail;
    }

    public void setDbPolicyDetail(DbPolicyDetail dbPolicyDetail) {
        this.dbPolicyDetail = dbPolicyDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BccPolicy that = (BccPolicy) obj;
        return Objects.equals(this.protectionType, that.protectionType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.cyber, that.cyber)
            && Objects.equals(this.name, that.name) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.storageType, that.storageType) && Objects.equals(this.policyType, that.policyType)
            && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.cbrPolicyDetail, that.cbrPolicyDetail)
            && Objects.equals(this.dbPolicyDetail, that.dbPolicyDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectionType,
            id,
            enabled,
            cyber,
            name,
            regionId,
            storageType,
            policyType,
            serviceType,
            cbrPolicyDetail,
            dbPolicyDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BccPolicy {\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    cyber: ").append(toIndentedString(cyber)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    cbrPolicyDetail: ").append(toIndentedString(cbrPolicyDetail)).append("\n");
        sb.append("    dbPolicyDetail: ").append(toIndentedString(dbPolicyDetail)).append("\n");
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
