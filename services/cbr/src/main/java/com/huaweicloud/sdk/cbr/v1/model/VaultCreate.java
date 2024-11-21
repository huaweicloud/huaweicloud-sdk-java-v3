package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VaultCreate
 */
public class VaultCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy_id")

    private String backupPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing")

    private BillingCreate billing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceCreate> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_bind")

    private Boolean autoBind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_rules")

    private VaultBindRules bindRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_expand")

    private Boolean autoExpand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_notify")

    private Boolean smnNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_name_prefix")

    private String backupNamePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demand_billing")

    private Boolean demandBilling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_lock_source_service")

    private String sysLockSourceService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    public VaultCreate withBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
        return this;
    }

    /**
     * 备份策略ID，不设置时为null，不自动备份。
     * @return backupPolicyId
     */
    public String getBackupPolicyId() {
        return backupPolicyId;
    }

    public void setBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
    }

    public VaultCreate withBilling(BillingCreate billing) {
        this.billing = billing;
        return this;
    }

    public VaultCreate withBilling(Consumer<BillingCreate> billingSetter) {
        if (this.billing == null) {
            this.billing = new BillingCreate();
            billingSetter.accept(this.billing);
        }

        return this;
    }

    /**
     * Get billing
     * @return billing
     */
    public BillingCreate getBilling() {
        return billing;
    }

    public void setBilling(BillingCreate billing) {
        this.billing = billing;
    }

    public VaultCreate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VaultCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 存储库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VaultCreate withResources(List<ResourceCreate> resources) {
        this.resources = resources;
        return this;
    }

    public VaultCreate addResourcesItem(ResourceCreate resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public VaultCreate withResources(Consumer<List<ResourceCreate>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 绑定的备份资源，未在创建时绑定资源填[]
     * @return resources
     */
    public List<ResourceCreate> getResources() {
        return resources;
    }

    public void setResources(List<ResourceCreate> resources) {
        this.resources = resources;
    }

    public VaultCreate withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public VaultCreate addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public VaultCreate withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表 tags不允许为空列表。 tags中最多包含10个key。 tags中key不允许重复。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public VaultCreate withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认为‘0’。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public VaultCreate withAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
        return this;
    }

    /**
     * 是否支持自动挂载。
     * @return autoBind
     */
    public Boolean getAutoBind() {
        return autoBind;
    }

    public void setAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
    }

    public VaultCreate withBindRules(VaultBindRules bindRules) {
        this.bindRules = bindRules;
        return this;
    }

    public VaultCreate withBindRules(Consumer<VaultBindRules> bindRulesSetter) {
        if (this.bindRules == null) {
            this.bindRules = new VaultBindRules();
            bindRulesSetter.accept(this.bindRules);
        }

        return this;
    }

    /**
     * Get bindRules
     * @return bindRules
     */
    public VaultBindRules getBindRules() {
        return bindRules;
    }

    public void setBindRules(VaultBindRules bindRules) {
        this.bindRules = bindRules;
    }

    public VaultCreate withAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
        return this;
    }

    /**
     * [是否开启存储库自动扩容能力（只支持按需存储库）。](tag:hws,hws_hk) [是否开启存储库自动扩容能力。](tag:dt,ocb,tlf,sbc,fcs_vm,ctc,g42,tm,cmcc,hcso_dt)
     * @return autoExpand
     */
    public Boolean getAutoExpand() {
        return autoExpand;
    }

    public void setAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
    }

    public VaultCreate withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 存储库容量阈值，已用容量占总容量达到此百分比，将根据 smn_notify 参数设置选择是否发送相关通知。 默认值为：80 最大值：100 最小值：1
     * minimum: 1
     * maximum: 100
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public VaultCreate withSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
        return this;
    }

    /**
     * 存储库smn消息通知开关。 默认值为 true。
     * @return smnNotify
     */
    public Boolean getSmnNotify() {
        return smnNotify;
    }

    public void setSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
    }

    public VaultCreate withBackupNamePrefix(String backupNamePrefix) {
        this.backupNamePrefix = backupNamePrefix;
        return this;
    }

    /**
     * 备份名称前缀，设置后该存储库自动备份产生的备份副本都将携带该备份名称前缀
     * @return backupNamePrefix
     */
    public String getBackupNamePrefix() {
        return backupNamePrefix;
    }

    public void setBackupNamePrefix(String backupNamePrefix) {
        this.backupNamePrefix = backupNamePrefix;
    }

    public VaultCreate withDemandBilling(Boolean demandBilling) {
        this.demandBilling = demandBilling;
        return this;
    }

    /**
     * 存储库使用是否允许超出容量，只有创建包周期存储库时才允许该值为 true
     * @return demandBilling
     */
    public Boolean getDemandBilling() {
        return demandBilling;
    }

    public void setDemandBilling(Boolean demandBilling) {
        this.demandBilling = demandBilling;
    }

    public VaultCreate withSysLockSourceService(String sysLockSourceService) {
        this.sysLockSourceService = sysLockSourceService;
        return this;
    }

    /**
     * 用于标识SMB服务，您可以设置为SMB或者空
     * @return sysLockSourceService
     */
    public String getSysLockSourceService() {
        return sysLockSourceService;
    }

    public void setSysLockSourceService(String sysLockSourceService) {
        this.sysLockSourceService = sysLockSourceService;
    }

    public VaultCreate withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 用于标识该存储库是否已锁定
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VaultCreate that = (VaultCreate) obj;
        return Objects.equals(this.backupPolicyId, that.backupPolicyId) && Objects.equals(this.billing, that.billing)
            && Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.autoBind, that.autoBind) && Objects.equals(this.bindRules, that.bindRules)
            && Objects.equals(this.autoExpand, that.autoExpand) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.smnNotify, that.smnNotify)
            && Objects.equals(this.backupNamePrefix, that.backupNamePrefix)
            && Objects.equals(this.demandBilling, that.demandBilling)
            && Objects.equals(this.sysLockSourceService, that.sysLockSourceService)
            && Objects.equals(this.locked, that.locked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupPolicyId,
            billing,
            description,
            name,
            resources,
            tags,
            enterpriseProjectId,
            autoBind,
            bindRules,
            autoExpand,
            threshold,
            smnNotify,
            backupNamePrefix,
            demandBilling,
            sysLockSourceService,
            locked);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultCreate {\n");
        sb.append("    backupPolicyId: ").append(toIndentedString(backupPolicyId)).append("\n");
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    autoBind: ").append(toIndentedString(autoBind)).append("\n");
        sb.append("    bindRules: ").append(toIndentedString(bindRules)).append("\n");
        sb.append("    autoExpand: ").append(toIndentedString(autoExpand)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    smnNotify: ").append(toIndentedString(smnNotify)).append("\n");
        sb.append("    backupNamePrefix: ").append(toIndentedString(backupNamePrefix)).append("\n");
        sb.append("    demandBilling: ").append(toIndentedString(demandBilling)).append("\n");
        sb.append("    sysLockSourceService: ").append(toIndentedString(sysLockSourceService)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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
