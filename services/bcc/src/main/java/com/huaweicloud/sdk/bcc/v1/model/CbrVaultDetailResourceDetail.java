package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源详情
 */
public class CbrVaultDetailResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_account")

    private Boolean crossAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private String protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_ids")

    private List<String> policyIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private String used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_rules")

    private String bindRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_resources")

    private List<String> vaultResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_account_urn")

    private String crossAccountUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_expand")

    private Boolean autoExpand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_az")

    private Boolean isMultiAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private List<String> protectStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CbrVaultDetailResourceDetail withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public CbrVaultDetailResourceDetail withCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }

    /**
     * 是否跨账号
     * @return crossAccount
     */
    public Boolean getCrossAccount() {
        return crossAccount;
    }

    public void setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
    }

    public CbrVaultDetailResourceDetail withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 创建模式，按需：post_paid，包周期：pre_paid，默认为post_paid
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CbrVaultDetailResourceDetail withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型：云服务器（server），云硬盘（disk），文件系统（turbo），云桌面（workspace），VMware（vmware），关系型数据库（rds），文件（file）
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public CbrVaultDetailResourceDetail withProtectType(String protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * 保护类型：备份（backup）、复制(replication)。
     * @return protectType
     */
    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public CbrVaultDetailResourceDetail withPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }

    public CbrVaultDetailResourceDetail addPolicyIdsItem(String policyIdsItem) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        this.policyIds.add(policyIdsItem);
        return this;
    }

    public CbrVaultDetailResourceDetail withPolicyIds(Consumer<List<String>> policyIdsSetter) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        policyIdsSetter.accept(this.policyIds);
        return this;
    }

    /**
     * 存储库关联的保护策略id
     * @return policyIds
     */
    public List<String> getPolicyIds() {
        return policyIds;
    }

    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }

    public CbrVaultDetailResourceDetail withUsed(String used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用容量，单位MB
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public CbrVaultDetailResourceDetail withBindRules(String bindRules) {
        this.bindRules = bindRules;
        return this;
    }

    /**
     * 绑定规则
     * @return bindRules
     */
    public String getBindRules() {
        return bindRules;
    }

    public void setBindRules(String bindRules) {
        this.bindRules = bindRules;
    }

    public CbrVaultDetailResourceDetail withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 容量，单位GB
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CbrVaultDetailResourceDetail withVaultResources(List<String> vaultResources) {
        this.vaultResources = vaultResources;
        return this;
    }

    public CbrVaultDetailResourceDetail addVaultResourcesItem(String vaultResourcesItem) {
        if (this.vaultResources == null) {
            this.vaultResources = new ArrayList<>();
        }
        this.vaultResources.add(vaultResourcesItem);
        return this;
    }

    public CbrVaultDetailResourceDetail withVaultResources(Consumer<List<String>> vaultResourcesSetter) {
        if (this.vaultResources == null) {
            this.vaultResources = new ArrayList<>();
        }
        vaultResourcesSetter.accept(this.vaultResources);
        return this;
    }

    /**
     * 存储库资源列表
     * @return vaultResources
     */
    public List<String> getVaultResources() {
        return vaultResources;
    }

    public void setVaultResources(List<String> vaultResources) {
        this.vaultResources = vaultResources;
    }

    public CbrVaultDetailResourceDetail withCrossAccountUrn(String crossAccountUrn) {
        this.crossAccountUrn = crossAccountUrn;
        return this;
    }

    /**
     * 跨账号URN
     * @return crossAccountUrn
     */
    public String getCrossAccountUrn() {
        return crossAccountUrn;
    }

    public void setCrossAccountUrn(String crossAccountUrn) {
        this.crossAccountUrn = crossAccountUrn;
    }

    public CbrVaultDetailResourceDetail withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 存储库资源类型id
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public CbrVaultDetailResourceDetail withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 是否已锁定
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public CbrVaultDetailResourceDetail withAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
        return this;
    }

    /**
     * 是否开启存储库自动扩容能力（只支持按需存储库）。
     * @return autoExpand
     */
    public Boolean getAutoExpand() {
        return autoExpand;
    }

    public void setAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
    }

    public CbrVaultDetailResourceDetail withIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
        return this;
    }

    /**
     * 存储库是否多az
     * @return isMultiAz
     */
    public Boolean getIsMultiAz() {
        return isMultiAz;
    }

    public void setIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
    }

    public CbrVaultDetailResourceDetail withProtectStatus(List<String> protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    public CbrVaultDetailResourceDetail addProtectStatusItem(String protectStatusItem) {
        if (this.protectStatus == null) {
            this.protectStatus = new ArrayList<>();
        }
        this.protectStatus.add(protectStatusItem);
        return this;
    }

    public CbrVaultDetailResourceDetail withProtectStatus(Consumer<List<String>> protectStatusSetter) {
        if (this.protectStatus == null) {
            this.protectStatus = new ArrayList<>();
        }
        protectStatusSetter.accept(this.protectStatus);
        return this;
    }

    /**
     * 保护状态
     * @return protectStatus
     */
    public List<String> getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(List<String> protectStatus) {
        this.protectStatus = protectStatus;
    }

    public CbrVaultDetailResourceDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CbrVaultDetailResourceDetail that = (CbrVaultDetailResourceDetail) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.crossAccount, that.crossAccount)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.protectType, that.protectType) && Objects.equals(this.policyIds, that.policyIds)
            && Objects.equals(this.used, that.used) && Objects.equals(this.bindRules, that.bindRules)
            && Objects.equals(this.size, that.size) && Objects.equals(this.vaultResources, that.vaultResources)
            && Objects.equals(this.crossAccountUrn, that.crossAccountUrn)
            && Objects.equals(this.providerId, that.providerId) && Objects.equals(this.locked, that.locked)
            && Objects.equals(this.autoExpand, that.autoExpand) && Objects.equals(this.isMultiAz, that.isMultiAz)
            && Objects.equals(this.protectStatus, that.protectStatus) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode,
            crossAccount,
            chargingMode,
            objectType,
            protectType,
            policyIds,
            used,
            bindRules,
            size,
            vaultResources,
            crossAccountUrn,
            providerId,
            locked,
            autoExpand,
            isMultiAz,
            protectStatus,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbrVaultDetailResourceDetail {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    crossAccount: ").append(toIndentedString(crossAccount)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    policyIds: ").append(toIndentedString(policyIds)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    bindRules: ").append(toIndentedString(bindRules)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    vaultResources: ").append(toIndentedString(vaultResources)).append("\n");
        sb.append("    crossAccountUrn: ").append(toIndentedString(crossAccountUrn)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    autoExpand: ").append(toIndentedString(autoExpand)).append("\n");
        sb.append("    isMultiAz: ").append(toIndentedString(isMultiAz)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
