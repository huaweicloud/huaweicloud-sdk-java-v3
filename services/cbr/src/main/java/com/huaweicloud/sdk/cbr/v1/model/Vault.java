package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Vault
 */
public class Vault {

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
    @JsonProperty(value = "sys_lock_source_service")

    private String sysLockSourceService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    public Vault withBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public Vault withBilling(Consumer<Billing> billingSetter) {
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

    public Vault withDescription(String description) {
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

    public Vault withId(String id) {
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

    public Vault withName(String name) {
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

    public Vault withProjectId(String projectId) {
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

    public Vault withProviderId(String providerId) {
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

    public Vault withResources(List<ResourceResp> resources) {
        this.resources = resources;
        return this;
    }

    public Vault addResourcesItem(ResourceResp resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public Vault withResources(Consumer<List<ResourceResp>> resourcesSetter) {
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

    public Vault withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public Vault addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Vault withTags(Consumer<List<Tag>> tagsSetter) {
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

    public Vault withEnterpriseProjectId(String enterpriseProjectId) {
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

    public Vault withAutoBind(Boolean autoBind) {
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

    public Vault withBindRules(VaultBindRules bindRules) {
        this.bindRules = bindRules;
        return this;
    }

    public Vault withBindRules(Consumer<VaultBindRules> bindRulesSetter) {
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

    public Vault withUserId(String userId) {
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

    public Vault withCreatedAt(String createdAt) {
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

    public Vault withAutoExpand(Boolean autoExpand) {
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

    public Vault withSmnNotify(Boolean smnNotify) {
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

    public Vault withThreshold(Integer threshold) {
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

    public Vault withSysLockSourceService(String sysLockSourceService) {
        this.sysLockSourceService = sysLockSourceService;
        return this;
    }

    /**
     * 用于标识SMB服务
     * @return sysLockSourceService
     */
    public String getSysLockSourceService() {
        return sysLockSourceService;
    }

    public void setSysLockSourceService(String sysLockSourceService) {
        this.sysLockSourceService = sysLockSourceService;
    }

    public Vault withLocked(Boolean locked) {
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

    public Vault withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 存储库可用区信息，最大支持32字符。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vault that = (Vault) obj;
        return Objects.equals(this.billing, that.billing) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.providerId, that.providerId)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.autoBind, that.autoBind) && Objects.equals(this.bindRules, that.bindRules)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.autoExpand, that.autoExpand) && Objects.equals(this.smnNotify, that.smnNotify)
            && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.sysLockSourceService, that.sysLockSourceService)
            && Objects.equals(this.locked, that.locked) && Objects.equals(this.availabilityZone, that.availabilityZone);
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
            sysLockSourceService,
            locked,
            availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vault {\n");
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
        sb.append("    sysLockSourceService: ").append(toIndentedString(sysLockSourceService)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
