package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class TokenSocpeOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private ScopeDomainOption domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private ScopeProjectOption project;

    public TokenSocpeOption withDomain(ScopeDomainOption domain) {
        this.domain = domain;
        return this;
    }

    public TokenSocpeOption withDomain(Consumer<ScopeDomainOption> domainSetter) {
        if (this.domain == null) {
            this.domain = new ScopeDomainOption();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public ScopeDomainOption getDomain() {
        return domain;
    }

    public void setDomain(ScopeDomainOption domain) {
        this.domain = domain;
    }

    public TokenSocpeOption withProject(ScopeProjectOption project) {
        this.project = project;
        return this;
    }

    public TokenSocpeOption withProject(Consumer<ScopeProjectOption> projectSetter) {
        if (this.project == null) {
            this.project = new ScopeProjectOption();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public ScopeProjectOption getProject() {
        return project;
    }

    public void setProject(ScopeProjectOption project) {
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
        TokenSocpeOption tokenSocpeOption = (TokenSocpeOption) o;
        return Objects.equals(this.domain, tokenSocpeOption.domain)
            && Objects.equals(this.project, tokenSocpeOption.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, project);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenSocpeOption {\n");
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
