package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AgencyTokenProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private AgencyTokenProjectDomain domain;

    public AgencyTokenProject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 委托方A的项目名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgencyTokenProject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 委托方A的项目ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AgencyTokenProject withDomain(AgencyTokenProjectDomain domain) {
        this.domain = domain;
        return this;
    }

    public AgencyTokenProject withDomain(Consumer<AgencyTokenProjectDomain> domainSetter) {
        if (this.domain == null) {
            this.domain = new AgencyTokenProjectDomain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public AgencyTokenProjectDomain getDomain() {
        return domain;
    }

    public void setDomain(AgencyTokenProjectDomain domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyTokenProject agencyTokenProject = (AgencyTokenProject) o;
        return Objects.equals(this.name, agencyTokenProject.name) && Objects.equals(this.id, agencyTokenProject.id)
            && Objects.equals(this.domain, agencyTokenProject.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyTokenProject {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
