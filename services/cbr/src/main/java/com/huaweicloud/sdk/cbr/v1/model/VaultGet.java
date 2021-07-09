package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.Billing;
import com.huaweicloud.sdk.cbr.v1.model.TagsResp;
import com.huaweicloud.sdk.cbr.v1.model.Vault;
import com.huaweicloud.sdk.cbr.v1.model.VaultBindRules;
import com.huaweicloud.sdk.cbr.v1.model.VaultResourceIntancesResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VaultGet
 */
public class VaultGet  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billing")
    
    private Billing billing;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider_id")
    
    private String providerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<VaultResourceIntancesResp> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagsResp> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_bind")
    
    private Boolean autoBind;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_rules")
    
    private VaultBindRules bindRules;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_expand")
    
    private Boolean autoExpand;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_notify")
    
    private Boolean smnNotify;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threshold")
    
    private Integer threshold;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;

    public VaultGet withBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public VaultGet withBilling(Consumer<Billing> billingSetter) {
        if(this.billing == null ){
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

    

    public VaultGet withDescription(String description) {
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

    

    public VaultGet withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 保管库id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public VaultGet withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 保管库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public VaultGet withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public VaultGet withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    


    /**
     * 
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    

    public VaultGet withResources(List<VaultResourceIntancesResp> resources) {
        this.resources = resources;
        return this;
    }

    
    public VaultGet addResourcesItem(VaultResourceIntancesResp resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public VaultGet withResources(Consumer<List<VaultResourceIntancesResp>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源
     * @return resources
     */
    public List<VaultResourceIntancesResp> getResources() {
        return resources;
    }

    public void setResources(List<VaultResourceIntancesResp> resources) {
        this.resources = resources;
    }

    

    public VaultGet withTags(List<TagsResp> tags) {
        this.tags = tags;
        return this;
    }

    
    public VaultGet addTagsItem(TagsResp tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public VaultGet withTags(Consumer<List<TagsResp>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<TagsResp> getTags() {
        return tags;
    }

    public void setTags(List<TagsResp> tags) {
        this.tags = tags;
    }

    

    public VaultGet withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public VaultGet withAutoBind(Boolean autoBind) {
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

    

    public VaultGet withBindRules(VaultBindRules bindRules) {
        this.bindRules = bindRules;
        return this;
    }

    public VaultGet withBindRules(Consumer<VaultBindRules> bindRulesSetter) {
        if(this.bindRules == null ){
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

    

    public VaultGet withAutoExpand(Boolean autoExpand) {
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

    

    public VaultGet withSmnNotify(Boolean smnNotify) {
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

    

    public VaultGet withThreshold(Integer threshold) {
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

    

    public VaultGet withUserId(String userId) {
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

    

    public VaultGet withCreatedAt(String createdAt) {
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

    

    public VaultGet withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 更新时间,例如:\"2020-02-05T10:38:34.209782\"
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    public VaultGet withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultGet vaultGet = (VaultGet) o;
        return Objects.equals(this.billing, vaultGet.billing) &&
            Objects.equals(this.description, vaultGet.description) &&
            Objects.equals(this.id, vaultGet.id) &&
            Objects.equals(this.name, vaultGet.name) &&
            Objects.equals(this.projectId, vaultGet.projectId) &&
            Objects.equals(this.providerId, vaultGet.providerId) &&
            Objects.equals(this.resources, vaultGet.resources) &&
            Objects.equals(this.tags, vaultGet.tags) &&
            Objects.equals(this.enterpriseProjectId, vaultGet.enterpriseProjectId) &&
            Objects.equals(this.autoBind, vaultGet.autoBind) &&
            Objects.equals(this.bindRules, vaultGet.bindRules) &&
            Objects.equals(this.autoExpand, vaultGet.autoExpand) &&
            Objects.equals(this.smnNotify, vaultGet.smnNotify) &&
            Objects.equals(this.threshold, vaultGet.threshold) &&
            Objects.equals(this.userId, vaultGet.userId) &&
            Objects.equals(this.createdAt, vaultGet.createdAt) &&
            Objects.equals(this.updatedAt, vaultGet.updatedAt) &&
            Objects.equals(this.version, vaultGet.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(billing, description, id, name, projectId, providerId, resources, tags, enterpriseProjectId, autoBind, bindRules, autoExpand, smnNotify, threshold, userId, createdAt, updatedAt, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultGet {\n");
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
        sb.append("    autoExpand: ").append(toIndentedString(autoExpand)).append("\n");
        sb.append("    smnNotify: ").append(toIndentedString(smnNotify)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

