package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import com.huaweicloud.sdk.iam.v3.model.RolePolicy;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class RoleResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flag")
    
    private String flag;


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
    
    private Links links = null;


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
    
    private RolePolicy policy = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_time")
    
    private String updatedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;

    public RoleResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 权限所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public RoleResult withFlag(String flag) {
        this.flag = flag;
        return this;
    }

    


    /**
     * 该参数值为fine_grained时，标识此权限为系统内置的策略。
     * @return flag
     */
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public RoleResult withDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
        return this;
    }

    


    /**
     * 权限的中文描述信息。
     * @return descriptionCn
     */
    public String getDescriptionCn() {
        return descriptionCn;
    }

    public void setDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
    }

    public RoleResult withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    


    /**
     * 权限所在目录。
     * @return catalog
     */
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public RoleResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 权限名。携带在用户的token中，云服务根据该名称来判断用户是否有权限访问。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleResult withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 权限描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoleResult withLinks(Links links) {
        this.links = links;
        return this;
    }

    public RoleResult withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
        }
        linksSetter.accept(this.links);
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public RoleResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 权限ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RoleResult withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 权限展示名。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public RoleResult withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 权限的显示模式。   > - AX表示在domain层显示。   > - XA表示在project层显示。   > - AA表示在domain和project层均显示。   > - XX表示在domain和project层均不显示。   > - 自定义策略的显示模式只能为AX或者XA，不能在domain层和project层都显示（AA），或者在domain层和project层都不显示（XX）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RoleResult withPolicy(RolePolicy policy) {
        this.policy = policy;
        return this;
    }

    public RoleResult withPolicy(Consumer<RolePolicy> policySetter) {
        if(this.policy == null ){
            this.policy = new RolePolicy();
        }
        policySetter.accept(this.policy);
        return this;
    }


    /**
     * Get policy
     * @return policy
     */
    public RolePolicy getPolicy() {
        return policy;
    }

    public void setPolicy(RolePolicy policy) {
        this.policy = policy;
    }

    public RoleResult withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    


    /**
     * 权限更新时间。
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public RoleResult withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 权限创建时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoleResult roleResult = (RoleResult) o;
        return Objects.equals(this.domainId, roleResult.domainId) &&
            Objects.equals(this.flag, roleResult.flag) &&
            Objects.equals(this.descriptionCn, roleResult.descriptionCn) &&
            Objects.equals(this.catalog, roleResult.catalog) &&
            Objects.equals(this.name, roleResult.name) &&
            Objects.equals(this.description, roleResult.description) &&
            Objects.equals(this.links, roleResult.links) &&
            Objects.equals(this.id, roleResult.id) &&
            Objects.equals(this.displayName, roleResult.displayName) &&
            Objects.equals(this.type, roleResult.type) &&
            Objects.equals(this.policy, roleResult.policy) &&
            Objects.equals(this.updatedTime, roleResult.updatedTime) &&
            Objects.equals(this.createdTime, roleResult.createdTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, flag, descriptionCn, catalog, name, description, links, id, displayName, type, policy, updatedTime, createdTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleResult {\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
            sb.append("    descriptionCn: ").append(toIndentedString(descriptionCn)).append("\n");
            sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
            sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
            sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

