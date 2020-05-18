package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class KeystoneGroupResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;

    public KeystoneGroupResult withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 用户组描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public KeystoneGroupResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 用户组ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KeystoneGroupResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 用户组所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoneGroupResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 用户组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeystoneGroupResult withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneGroupResult withLinks(Consumer<Links> linksSetter) {
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

    public KeystoneGroupResult withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 用户组创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneGroupResult keystoneGroupResult = (KeystoneGroupResult) o;
        return Objects.equals(this.description, keystoneGroupResult.description) &&
            Objects.equals(this.id, keystoneGroupResult.id) &&
            Objects.equals(this.domainId, keystoneGroupResult.domainId) &&
            Objects.equals(this.name, keystoneGroupResult.name) &&
            Objects.equals(this.links, keystoneGroupResult.links) &&
            Objects.equals(this.createTime, keystoneGroupResult.createTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, id, domainId, name, links, createTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneGroupResult {\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

