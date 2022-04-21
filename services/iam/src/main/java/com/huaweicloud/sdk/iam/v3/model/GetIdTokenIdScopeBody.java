package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * scope信息
 */
public class GetIdTokenIdScopeBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private GetIdTokenScopeDomainOrProjectBody domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private GetIdTokenScopeDomainOrProjectBody project;

    public GetIdTokenIdScopeBody withDomain(GetIdTokenScopeDomainOrProjectBody domain) {
        this.domain = domain;
        return this;
    }

    public GetIdTokenIdScopeBody withDomain(Consumer<GetIdTokenScopeDomainOrProjectBody> domainSetter) {
        if (this.domain == null) {
            this.domain = new GetIdTokenScopeDomainOrProjectBody();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public GetIdTokenScopeDomainOrProjectBody getDomain() {
        return domain;
    }

    public void setDomain(GetIdTokenScopeDomainOrProjectBody domain) {
        this.domain = domain;
    }

    public GetIdTokenIdScopeBody withProject(GetIdTokenScopeDomainOrProjectBody project) {
        this.project = project;
        return this;
    }

    public GetIdTokenIdScopeBody withProject(Consumer<GetIdTokenScopeDomainOrProjectBody> projectSetter) {
        if (this.project == null) {
            this.project = new GetIdTokenScopeDomainOrProjectBody();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public GetIdTokenScopeDomainOrProjectBody getProject() {
        return project;
    }

    public void setProject(GetIdTokenScopeDomainOrProjectBody project) {
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
        GetIdTokenIdScopeBody getIdTokenIdScopeBody = (GetIdTokenIdScopeBody) o;
        return Objects.equals(this.domain, getIdTokenIdScopeBody.domain)
            && Objects.equals(this.project, getIdTokenIdScopeBody.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, project);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetIdTokenIdScopeBody {\n");
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
