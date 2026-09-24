package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包周期存储库订单
 */
public class PrePaidVaultOrder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing")

    private PrePaidBillingCreate billing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceCreate> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy_id")

    private String backupPolicyId;

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
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_notify")

    private Boolean smnNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private VaultCreateParameters parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_expand")

    private Boolean autoExpand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_account")

    private Boolean crossAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_encryption")

    private DataEncryption dataEncryption;

    public PrePaidVaultOrder withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 存储库名称，最大支持64字符，只能由中文、字母、数字、\"_\"、\"-\"组成。默认取值不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrePaidVaultOrder withBilling(PrePaidBillingCreate billing) {
        this.billing = billing;
        return this;
    }

    public PrePaidVaultOrder withBilling(Consumer<PrePaidBillingCreate> billingSetter) {
        if (this.billing == null) {
            this.billing = new PrePaidBillingCreate();
            billingSetter.accept(this.billing);
        }

        return this;
    }

    /**
     * Get billing
     * @return billing
     */
    public PrePaidBillingCreate getBilling() {
        return billing;
    }

    public void setBilling(PrePaidBillingCreate billing) {
        this.billing = billing;
    }

    public PrePaidVaultOrder withResources(List<ResourceCreate> resources) {
        this.resources = resources;
        return this;
    }

    public PrePaidVaultOrder addResourcesItem(ResourceCreate resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public PrePaidVaultOrder withResources(Consumer<List<ResourceCreate>> resourcesSetter) {
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

    public PrePaidVaultOrder withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 存储库描述，取值范围：最小长度：0，最大长度：255。默认取值不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PrePaidVaultOrder withBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
        return this;
    }

    /**
     * 备份策略ID，默认值为null，不自动备份。 [获取方法请参见\"[获取备份策略ID](https://support.huaweicloud.com/api-cbr/ListPolicies.html)\"。](tag:hws) [获取方法请参见\"[获取备份策略ID](https://support.huaweicloud.com/intl/zh-cn/api-cbr/ListPolicies.html)\"。](tag:hws_hk)
     * @return backupPolicyId
     */
    public String getBackupPolicyId() {
        return backupPolicyId;
    }

    public void setBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
    }

    public PrePaidVaultOrder withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public PrePaidVaultOrder addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PrePaidVaultOrder withTags(Consumer<List<Tag>> tagsSetter) {
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

    public PrePaidVaultOrder withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认为'0'。 [获取方法请参见\"[获取企业项目ID](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)\"。](tag:hws) [获取方法请参见\"[获取企业项目ID](https://support.huaweicloud.com/intl/zh-cn/usermanual-em/zh-cn_topic_0126101490.html)\"。](tag:hws_hk)
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PrePaidVaultOrder withAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
        return this;
    }

    /**
     * 功能说明：是否支持自动挂载。默认为false。 取值范围： - true：支持自动挂载 - false：不支持自动挂载
     * @return autoBind
     */
    public Boolean getAutoBind() {
        return autoBind;
    }

    public void setAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
    }

    public PrePaidVaultOrder withBindRules(VaultBindRules bindRules) {
        this.bindRules = bindRules;
        return this;
    }

    public PrePaidVaultOrder withBindRules(Consumer<VaultBindRules> bindRulesSetter) {
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

    public PrePaidVaultOrder withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 功能说明：存储库容量阈值，存储库已用容量和总容量的百分比超过该值，如果smn_notify为开，将发送相关通知。 取值范围：[1, 100]，默认值为80。
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public PrePaidVaultOrder withSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
        return this;
    }

    /**
     * 功能说明：是否发送smn通知开关，默认为true 取值范围： - true：发送smn通知 - false：不发送smn通知
     * @return smnNotify
     */
    public Boolean getSmnNotify() {
        return smnNotify;
    }

    public void setSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
    }

    public PrePaidVaultOrder withParameters(VaultCreateParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public PrePaidVaultOrder withParameters(Consumer<VaultCreateParameters> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new VaultCreateParameters();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public VaultCreateParameters getParameters() {
        return parameters;
    }

    public void setParameters(VaultCreateParameters parameters) {
        this.parameters = parameters;
    }

    public PrePaidVaultOrder withAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
        return this;
    }

    /**
     * 功能说明：是否开启存储库自动扩容能力（只支持按需存储库），默认为false。 取值范围： - true：支持自动扩容； - false：不支持自动扩容。
     * @return autoExpand
     */
    public Boolean getAutoExpand() {
        return autoExpand;
    }

    public void setAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
    }

    public PrePaidVaultOrder withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 功能说明：用于标识当前存储库是否已锁定，锁定的存储库不支持解锁。默认值为false。 [关于备份锁定的详细信息，请参考\"[开启备份锁定](https://support.huaweicloud.com/usermanual-cbr/cbr_01_0035.html)\"。](tag:hws) [关于备份锁定的详细信息，请参考\"[开启备份锁定](https://support.huaweicloud.com/intl/zh-cn/usermanual-cbr/cbr_01_0035.html)\"。](tag:hws_hk) 取值范围： - true：锁定存储库 - false：不锁定存储库
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public PrePaidVaultOrder withCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }

    /**
     * 功能说明：是否为跨账号复制存储库，默认值为false，只有创建跨账号复制存储库时才允许该值为true。 取值范围： - false: 非跨账号复制存储库 - true: 跨账号复制存储库
     * @return crossAccount
     */
    public Boolean getCrossAccount() {
        return crossAccount;
    }

    public void setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
    }

    public PrePaidVaultOrder withDataEncryption(DataEncryption dataEncryption) {
        this.dataEncryption = dataEncryption;
        return this;
    }

    public PrePaidVaultOrder withDataEncryption(Consumer<DataEncryption> dataEncryptionSetter) {
        if (this.dataEncryption == null) {
            this.dataEncryption = new DataEncryption();
            dataEncryptionSetter.accept(this.dataEncryption);
        }

        return this;
    }

    /**
     * Get dataEncryption
     * @return dataEncryption
     */
    public DataEncryption getDataEncryption() {
        return dataEncryption;
    }

    public void setDataEncryption(DataEncryption dataEncryption) {
        this.dataEncryption = dataEncryption;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrePaidVaultOrder that = (PrePaidVaultOrder) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.billing, that.billing)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.description, that.description)
            && Objects.equals(this.backupPolicyId, that.backupPolicyId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.autoBind, that.autoBind) && Objects.equals(this.bindRules, that.bindRules)
            && Objects.equals(this.threshold, that.threshold) && Objects.equals(this.smnNotify, that.smnNotify)
            && Objects.equals(this.parameters, that.parameters) && Objects.equals(this.autoExpand, that.autoExpand)
            && Objects.equals(this.locked, that.locked) && Objects.equals(this.crossAccount, that.crossAccount)
            && Objects.equals(this.dataEncryption, that.dataEncryption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            billing,
            resources,
            description,
            backupPolicyId,
            tags,
            enterpriseProjectId,
            autoBind,
            bindRules,
            threshold,
            smnNotify,
            parameters,
            autoExpand,
            locked,
            crossAccount,
            dataEncryption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidVaultOrder {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    backupPolicyId: ").append(toIndentedString(backupPolicyId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    autoBind: ").append(toIndentedString(autoBind)).append("\n");
        sb.append("    bindRules: ").append(toIndentedString(bindRules)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    smnNotify: ").append(toIndentedString(smnNotify)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    autoExpand: ").append(toIndentedString(autoExpand)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    crossAccount: ").append(toIndentedString(crossAccount)).append("\n");
        sb.append("    dataEncryption: ").append(toIndentedString(dataEncryption)).append("\n");
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
