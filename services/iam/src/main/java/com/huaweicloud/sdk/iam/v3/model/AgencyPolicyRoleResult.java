package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyPolicy;
import com.huaweicloud.sdk.iam.v3.model.LinksSelf;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class AgencyPolicyRoleResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="catalog")
    
    private String catalog;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private LinksSelf links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy")
    
    private AgencyPolicy policy = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description_cn")
    
    private String descriptionCn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_time")
    
    private String updatedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="references")
    
    private String references;

    public AgencyPolicyRoleResult withCatalog(String catalog) {
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

    public AgencyPolicyRoleResult withDisplayName(String displayName) {
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

    public AgencyPolicyRoleResult withDescription(String description) {
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

    public AgencyPolicyRoleResult withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public AgencyPolicyRoleResult withLinks(Consumer<LinksSelf> linksSetter) {
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

    public AgencyPolicyRoleResult withPolicy(AgencyPolicy policy) {
        this.policy = policy;
        return this;
    }

    public AgencyPolicyRoleResult withPolicy(Consumer<AgencyPolicy> policySetter) {
        if(this.policy == null ){
            this.policy = new AgencyPolicy();
            policySetter.accept(this.policy);
        }
        
        return this;
    }


    /**
     * Get policy
     * @return policy
     */
    public AgencyPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(AgencyPolicy policy) {
        this.policy = policy;
    }

    public AgencyPolicyRoleResult withDescriptionCn(String descriptionCn) {
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

    public AgencyPolicyRoleResult withDomainId(String domainId) {
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

    public AgencyPolicyRoleResult withType(String type) {
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

    public AgencyPolicyRoleResult withId(String id) {
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

    public AgencyPolicyRoleResult withName(String name) {
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

    public AgencyPolicyRoleResult withUpdatedTime(String updatedTime) {
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

    public AgencyPolicyRoleResult withCreatedTime(String createdTime) {
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

    public AgencyPolicyRoleResult withReferences(String references) {
        this.references = references;
        return this;
    }

    


    /**
     * 自定义策略的引用次数。
     * @return references
     */
    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyPolicyRoleResult agencyPolicyRoleResult = (AgencyPolicyRoleResult) o;
        return Objects.equals(this.catalog, agencyPolicyRoleResult.catalog) &&
            Objects.equals(this.displayName, agencyPolicyRoleResult.displayName) &&
            Objects.equals(this.description, agencyPolicyRoleResult.description) &&
            Objects.equals(this.links, agencyPolicyRoleResult.links) &&
            Objects.equals(this.policy, agencyPolicyRoleResult.policy) &&
            Objects.equals(this.descriptionCn, agencyPolicyRoleResult.descriptionCn) &&
            Objects.equals(this.domainId, agencyPolicyRoleResult.domainId) &&
            Objects.equals(this.type, agencyPolicyRoleResult.type) &&
            Objects.equals(this.id, agencyPolicyRoleResult.id) &&
            Objects.equals(this.name, agencyPolicyRoleResult.name) &&
            Objects.equals(this.updatedTime, agencyPolicyRoleResult.updatedTime) &&
            Objects.equals(this.createdTime, agencyPolicyRoleResult.createdTime) &&
            Objects.equals(this.references, agencyPolicyRoleResult.references);
    }
    @Override
    public int hashCode() {
        return Objects.hash(catalog, displayName, description, links, policy, descriptionCn, domainId, type, id, name, updatedTime, createdTime, references);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyPolicyRoleResult {\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    descriptionCn: ").append(toIndentedString(descriptionCn)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
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

