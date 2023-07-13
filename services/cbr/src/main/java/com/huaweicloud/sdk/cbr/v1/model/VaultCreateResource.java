package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VaultCreateResource
 */
public class VaultCreateResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing")

    private Billing billing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceResp> resources = null;

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
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_expand")

    private Boolean autoExpand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_notify")

    private Boolean smnNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errText")

    private String errText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retCode")

    private String retCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orders")

    private List<CbcOrderResult> orders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_name_prefix")

    private String backupNamePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demand_billing")

    private Boolean demandBilling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbc_delete_count")

    private Integer cbcDeleteCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen")

    private Boolean frozen;

    public VaultCreateResource withBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public VaultCreateResource withBilling(Consumer<Billing> billingSetter) {
        if (this.billing == null) {
            this.billing = new Billing();
            billingSetter.accept(this.billing);
        }

        return this;
    }

    /**
     * Get billing
     * @return billing
     */
    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public VaultCreateResource withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 存储库自定义描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VaultCreateResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存储库ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VaultCreateResource withName(String name) {
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

    public VaultCreateResource withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public VaultCreateResource withProviderId(String providerId) {
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

    public VaultCreateResource withResources(List<ResourceResp> resources) {
        this.resources = resources;
        return this;
    }

    public VaultCreateResource addResourcesItem(ResourceResp resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public VaultCreateResource withResources(Consumer<List<ResourceResp>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 存储库资源
     * @return resources
     */
    public List<ResourceResp> getResources() {
        return resources;
    }

    public void setResources(List<ResourceResp> resources) {
        this.resources = resources;
    }

    public VaultCreateResource withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public VaultCreateResource addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public VaultCreateResource withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 存储库标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public VaultCreateResource withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，默认为‘0’。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public VaultCreateResource withAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
        return this;
    }

    /**
     * 是否自动绑定，默认为false，不支持。
     * @return autoBind
     */
    public Boolean getAutoBind() {
        return autoBind;
    }

    public void setAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
    }

    public VaultCreateResource withBindRules(VaultBindRules bindRules) {
        this.bindRules = bindRules;
        return this;
    }

    public VaultCreateResource withBindRules(Consumer<VaultBindRules> bindRulesSetter) {
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

    public VaultCreateResource withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public VaultCreateResource withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间,例如:\"2020-02-05T10:38:34.209782\"
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public VaultCreateResource withAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
        return this;
    }

    /**
     * [是否开启存储库自动扩容能力（只支持按需存储库）。](tag:hws,hws_hk) [是否开启存储库自动扩容能力。](tag:dt,ocb,tlf,sbc,fcs_vm,ctc,g42,tm,cmcc,tm,hcso_dt)
     * @return autoExpand
     */
    public Boolean getAutoExpand() {
        return autoExpand;
    }

    public void setAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
    }

    public VaultCreateResource withSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
        return this;
    }

    /**
     * 存储库smn消息通知开关
     * @return smnNotify
     */
    public Boolean getSmnNotify() {
        return smnNotify;
    }

    public void setSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
    }

    public VaultCreateResource withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 存储库容量阈值，已用容量占总容量达到此百分比即发送相关通知
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

    public VaultCreateResource withErrText(String errText) {
        this.errText = errText;
        return this;
    }

    /**
     * 包周期创建错误信息
     * @return errText
     */
    public String getErrText() {
        return errText;
    }

    public void setErrText(String errText) {
        this.errText = errText;
    }

    public VaultCreateResource withRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }

    /**
     * 包周期订购结果
     * @return retCode
     */
    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public VaultCreateResource withOrders(List<CbcOrderResult> orders) {
        this.orders = orders;
        return this;
    }

    public VaultCreateResource addOrdersItem(CbcOrderResult ordersItem) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        this.orders.add(ordersItem);
        return this;
    }

    public VaultCreateResource withOrders(Consumer<List<CbcOrderResult>> ordersSetter) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        ordersSetter.accept(this.orders);
        return this;
    }

    /**
     * 包周期创建订单信息
     * @return orders
     */
    public List<CbcOrderResult> getOrders() {
        return orders;
    }

    public void setOrders(List<CbcOrderResult> orders) {
        this.orders = orders;
    }

    public VaultCreateResource withBackupNamePrefix(String backupNamePrefix) {
        this.backupNamePrefix = backupNamePrefix;
        return this;
    }

    /**
     * 备份名称前缀
     * @return backupNamePrefix
     */
    public String getBackupNamePrefix() {
        return backupNamePrefix;
    }

    public void setBackupNamePrefix(String backupNamePrefix) {
        this.backupNamePrefix = backupNamePrefix;
    }

    public VaultCreateResource withDemandBilling(Boolean demandBilling) {
        this.demandBilling = demandBilling;
        return this;
    }

    /**
     * 是否允许使用超出存储库容量
     * @return demandBilling
     */
    public Boolean getDemandBilling() {
        return demandBilling;
    }

    public void setDemandBilling(Boolean demandBilling) {
        this.demandBilling = demandBilling;
    }

    public VaultCreateResource withCbcDeleteCount(Integer cbcDeleteCount) {
        this.cbcDeleteCount = cbcDeleteCount;
        return this;
    }

    /**
     * 存储库删除次数
     * @return cbcDeleteCount
     */
    public Integer getCbcDeleteCount() {
        return cbcDeleteCount;
    }

    public void setCbcDeleteCount(Integer cbcDeleteCount) {
        this.cbcDeleteCount = cbcDeleteCount;
    }

    public VaultCreateResource withFrozen(Boolean frozen) {
        this.frozen = frozen;
        return this;
    }

    /**
     * 存储库是否冻结
     * @return frozen
     */
    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VaultCreateResource that = (VaultCreateResource) obj;
        return Objects.equals(this.billing, that.billing) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.providerId, that.providerId)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.autoBind, that.autoBind) && Objects.equals(this.bindRules, that.bindRules)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.autoExpand, that.autoExpand) && Objects.equals(this.smnNotify, that.smnNotify)
            && Objects.equals(this.threshold, that.threshold) && Objects.equals(this.errText, that.errText)
            && Objects.equals(this.retCode, that.retCode) && Objects.equals(this.orders, that.orders)
            && Objects.equals(this.backupNamePrefix, that.backupNamePrefix)
            && Objects.equals(this.demandBilling, that.demandBilling)
            && Objects.equals(this.cbcDeleteCount, that.cbcDeleteCount) && Objects.equals(this.frozen, that.frozen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billing,
            description,
            id,
            name,
            projectId,
            providerId,
            resources,
            tags,
            enterpriseProjectId,
            autoBind,
            bindRules,
            userId,
            createdAt,
            autoExpand,
            smnNotify,
            threshold,
            errText,
            retCode,
            orders,
            backupNamePrefix,
            demandBilling,
            cbcDeleteCount,
            frozen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultCreateResource {\n");
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    autoBind: ").append(toIndentedString(autoBind)).append("\n");
        sb.append("    bindRules: ").append(toIndentedString(bindRules)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    autoExpand: ").append(toIndentedString(autoExpand)).append("\n");
        sb.append("    smnNotify: ").append(toIndentedString(smnNotify)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    errText: ").append(toIndentedString(errText)).append("\n");
        sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
        sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
        sb.append("    backupNamePrefix: ").append(toIndentedString(backupNamePrefix)).append("\n");
        sb.append("    demandBilling: ").append(toIndentedString(demandBilling)).append("\n");
        sb.append("    cbcDeleteCount: ").append(toIndentedString(cbcDeleteCount)).append("\n");
        sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
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
