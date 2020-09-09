package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneListProjectsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private String parentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_domain")
    
    private Boolean isDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="per_page")
    
    private Integer perPage;

    public KeystoneListProjectsRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * Get domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoneListProjectsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeystoneListProjectsRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    


    /**
     * Get parentId
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public KeystoneListProjectsRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * Get enabled
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public KeystoneListProjectsRequest withIsDomain(Boolean isDomain) {
        this.isDomain = isDomain;
        return this;
    }

    


    /**
     * Get isDomain
     * @return isDomain
     */
    public Boolean getIsDomain() {
        return isDomain;
    }

    public void setIsDomain(Boolean isDomain) {
        this.isDomain = isDomain;
    }

    public KeystoneListProjectsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * Get page
     * minimum: 1
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public KeystoneListProjectsRequest withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    


    /**
     * Get perPage
     * minimum: 1
     * maximum: 5000
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListProjectsRequest keystoneListProjectsRequest = (KeystoneListProjectsRequest) o;
        return Objects.equals(this.domainId, keystoneListProjectsRequest.domainId) &&
            Objects.equals(this.name, keystoneListProjectsRequest.name) &&
            Objects.equals(this.parentId, keystoneListProjectsRequest.parentId) &&
            Objects.equals(this.enabled, keystoneListProjectsRequest.enabled) &&
            Objects.equals(this.isDomain, keystoneListProjectsRequest.isDomain) &&
            Objects.equals(this.page, keystoneListProjectsRequest.page) &&
            Objects.equals(this.perPage, keystoneListProjectsRequest.perPage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, name, parentId, enabled, isDomain, page, perPage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListProjectsRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    isDomain: ").append(toIndentedString(isDomain)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

