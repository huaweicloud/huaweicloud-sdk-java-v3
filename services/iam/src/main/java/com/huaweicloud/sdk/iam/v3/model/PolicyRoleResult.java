package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LinksSelf;
import com.huaweicloud.sdk.iam.v3.model.ServicePolicy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class PolicyRoleResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="references")
    
    private Integer references;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_time")
    
    private String updatedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description_cn")
    
    private String descriptionCn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="catalog")
    
    private String catalog;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private LinksSelf links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy")
    
    private ServicePolicy policy = null;

    public PolicyRoleResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 自定义策略所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public PolicyRoleResult withReferences(Integer references) {
        this.references = references;
        return this;
    }

    


    /**
     * 自定义策略的引用次数。
     * @return references
     */
    public Integer getReferences() {
        return references;
    }

    public void setReferences(Integer references) {
        this.references = references;
    }

    public PolicyRoleResult withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    


    /**
     * 自定义策略更新时间。
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public PolicyRoleResult withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 自定义策略创建时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public PolicyRoleResult withDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
        return this;
    }

    


    /**
     * 自定义策略的中文描述信息。
     * @return descriptionCn
     */
    public String getDescriptionCn() {
        return descriptionCn;
    }

    public void setDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
    }

    public PolicyRoleResult withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    


    /**
     * 自定义策略所在目录。
     * @return catalog
     */
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public PolicyRoleResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 自定义策略名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PolicyRoleResult withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 自定义策略的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicyRoleResult withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public PolicyRoleResult withLinks(Consumer<LinksSelf> linksSetter) {
        if(this.links == null ){
            this.links = new LinksSelf();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    public PolicyRoleResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 自定义策略ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PolicyRoleResult withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 自定义策略展示名。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PolicyRoleResult withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 自定义策略的显示模式。   > - AX表示在domain层显示。   > - XA表示在project层显示。   > - 自定义策略的显示模式只能为AX或者XA，不能在domain层和project层都显示（AA），或者在domain层和project层都不显示（XX）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PolicyRoleResult withPolicy(ServicePolicy policy) {
        this.policy = policy;
        return this;
    }

    public PolicyRoleResult withPolicy(Consumer<ServicePolicy> policySetter) {
        if(this.policy == null ){
            this.policy = new ServicePolicy();
            policySetter.accept(this.policy);
        }
        
        return this;
    }


    /**
     * Get policy
     * @return policy
     */
    public ServicePolicy getPolicy() {
        return policy;
    }

    public void setPolicy(ServicePolicy policy) {
        this.policy = policy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyRoleResult policyRoleResult = (PolicyRoleResult) o;
        return Objects.equals(this.domainId, policyRoleResult.domainId) &&
            Objects.equals(this.references, policyRoleResult.references) &&
            Objects.equals(this.updatedTime, policyRoleResult.updatedTime) &&
            Objects.equals(this.createdTime, policyRoleResult.createdTime) &&
            Objects.equals(this.descriptionCn, policyRoleResult.descriptionCn) &&
            Objects.equals(this.catalog, policyRoleResult.catalog) &&
            Objects.equals(this.name, policyRoleResult.name) &&
            Objects.equals(this.description, policyRoleResult.description) &&
            Objects.equals(this.links, policyRoleResult.links) &&
            Objects.equals(this.id, policyRoleResult.id) &&
            Objects.equals(this.displayName, policyRoleResult.displayName) &&
            Objects.equals(this.type, policyRoleResult.type) &&
            Objects.equals(this.policy, policyRoleResult.policy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, references, updatedTime, createdTime, descriptionCn, catalog, name, description, links, id, displayName, type, policy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyRoleResult {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    descriptionCn: ").append(toIndentedString(descriptionCn)).append("\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

