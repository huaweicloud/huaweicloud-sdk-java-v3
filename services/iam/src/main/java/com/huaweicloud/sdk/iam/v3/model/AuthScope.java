package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AuthScope {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private AuthScopeDomain domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private AuthScopeProject project;

    public AuthScope withDomain(AuthScopeDomain domain) {
        this.domain = domain;
        return this;
    }

    public AuthScope withDomain(Consumer<AuthScopeDomain> domainSetter) {
        if (this.domain == null) {
            this.domain = new AuthScopeDomain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public AuthScopeDomain getDomain() {
        return domain;
    }

    public void setDomain(AuthScopeDomain domain) {
        this.domain = domain;
    }

    public AuthScope withProject(AuthScopeProject project) {
        this.project = project;
        return this;
    }

    public AuthScope withProject(Consumer<AuthScopeProject> projectSetter) {
        if (this.project == null) {
            this.project = new AuthScopeProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public AuthScopeProject getProject() {
        return project;
    }

    public void setProject(AuthScopeProject project) {
        this.project = project;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthScope that = (AuthScope) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, project);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthScope {\n");
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
