package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RoleAssignmentScope
 */
public class RoleAssignmentScope {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private RoleProjectAssignmentId project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private RoleDomainAssignmentId domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private RoleEnterpriseProjectAssignmentId enterpriseProject;

    public RoleAssignmentScope withProject(RoleProjectAssignmentId project) {
        this.project = project;
        return this;
    }

    public RoleAssignmentScope withProject(Consumer<RoleProjectAssignmentId> projectSetter) {
        if (this.project == null) {
            this.project = new RoleProjectAssignmentId();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public RoleProjectAssignmentId getProject() {
        return project;
    }

    public void setProject(RoleProjectAssignmentId project) {
        this.project = project;
    }

    public RoleAssignmentScope withDomain(RoleDomainAssignmentId domain) {
        this.domain = domain;
        return this;
    }

    public RoleAssignmentScope withDomain(Consumer<RoleDomainAssignmentId> domainSetter) {
        if (this.domain == null) {
            this.domain = new RoleDomainAssignmentId();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public RoleDomainAssignmentId getDomain() {
        return domain;
    }

    public void setDomain(RoleDomainAssignmentId domain) {
        this.domain = domain;
    }

    public RoleAssignmentScope withEnterpriseProject(RoleEnterpriseProjectAssignmentId enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    public RoleAssignmentScope withEnterpriseProject(
        Consumer<RoleEnterpriseProjectAssignmentId> enterpriseProjectSetter) {
        if (this.enterpriseProject == null) {
            this.enterpriseProject = new RoleEnterpriseProjectAssignmentId();
            enterpriseProjectSetter.accept(this.enterpriseProject);
        }

        return this;
    }

    /**
     * Get enterpriseProject
     * @return enterpriseProject
     */
    public RoleEnterpriseProjectAssignmentId getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(RoleEnterpriseProjectAssignmentId enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleAssignmentScope that = (RoleAssignmentScope) obj;
        return Objects.equals(this.project, that.project) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.enterpriseProject, that.enterpriseProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, domain, enterpriseProject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleAssignmentScope {\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
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
