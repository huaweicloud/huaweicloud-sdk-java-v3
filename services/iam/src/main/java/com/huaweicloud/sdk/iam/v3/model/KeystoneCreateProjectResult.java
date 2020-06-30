package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class KeystoneCreateProjectResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_domain")
    
    private Boolean isDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra")
    
    private Object extra = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private String parentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public KeystoneCreateProjectResult withIsDomain(Boolean isDomain) {
        this.isDomain = isDomain;
        return this;
    }

    


    /**
     * false.
     * @return isDomain
     */
    public Boolean getIsDomain() {
        return isDomain;
    }

    public void setIsDomain(Boolean isDomain) {
        this.isDomain = isDomain;
    }

    public KeystoneCreateProjectResult withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 项目描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public KeystoneCreateProjectResult withExtra(Object extra) {
        this.extra = extra;
        return this;
    }

    


    /**
     * 项目的其他信息。
     * @return extra
     */
    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public KeystoneCreateProjectResult withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneCreateProjectResult withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
            linksSetter.accept(this.links);
        }
        
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

    public KeystoneCreateProjectResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * 项目是否可用。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public KeystoneCreateProjectResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 项目ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KeystoneCreateProjectResult withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    


    /**
     * 区域对应的项目ID，例如区域“华北-北京一”区域对应的项目ID为：04dd42abe48026ad2fa3c01ad7fa.....。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public KeystoneCreateProjectResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 项目所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoneCreateProjectResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 项目名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateProjectResult keystoneCreateProjectResult = (KeystoneCreateProjectResult) o;
        return Objects.equals(this.isDomain, keystoneCreateProjectResult.isDomain) &&
            Objects.equals(this.description, keystoneCreateProjectResult.description) &&
            Objects.equals(this.extra, keystoneCreateProjectResult.extra) &&
            Objects.equals(this.links, keystoneCreateProjectResult.links) &&
            Objects.equals(this.enabled, keystoneCreateProjectResult.enabled) &&
            Objects.equals(this.id, keystoneCreateProjectResult.id) &&
            Objects.equals(this.parentId, keystoneCreateProjectResult.parentId) &&
            Objects.equals(this.domainId, keystoneCreateProjectResult.domainId) &&
            Objects.equals(this.name, keystoneCreateProjectResult.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isDomain, description, extra, links, enabled, id, parentId, domainId, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateProjectResult {\n");
        sb.append("    isDomain: ").append(toIndentedString(isDomain)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

