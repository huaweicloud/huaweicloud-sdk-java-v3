package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyTokenScopeDomain;
import com.huaweicloud.sdk.iam.v3.model.AgencyTokenScopeProject;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class AgencyTokenScope  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private AgencyTokenScopeDomain domain = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project")
    
    private AgencyTokenScopeProject project = null;

    public AgencyTokenScope withDomain(AgencyTokenScopeDomain domain) {
        this.domain = domain;
        return this;
    }

    public AgencyTokenScope withDomain(Consumer<AgencyTokenScopeDomain> domainSetter) {
        if(this.domain == null ){
            this.domain = new AgencyTokenScopeDomain();
            domainSetter.accept(this.domain);
        }
        
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public AgencyTokenScopeDomain getDomain() {
        return domain;
    }

    public void setDomain(AgencyTokenScopeDomain domain) {
        this.domain = domain;
    }

    public AgencyTokenScope withProject(AgencyTokenScopeProject project) {
        this.project = project;
        return this;
    }

    public AgencyTokenScope withProject(Consumer<AgencyTokenScopeProject> projectSetter) {
        if(this.project == null ){
            this.project = new AgencyTokenScopeProject();
            projectSetter.accept(this.project);
        }
        
        return this;
    }


    /**
     * Get project
     * @return project
     */
    public AgencyTokenScopeProject getProject() {
        return project;
    }

    public void setProject(AgencyTokenScopeProject project) {
        this.project = project;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyTokenScope agencyTokenScope = (AgencyTokenScope) o;
        return Objects.equals(this.domain, agencyTokenScope.domain) &&
            Objects.equals(this.project, agencyTokenScope.project);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, project);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyTokenScope {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

