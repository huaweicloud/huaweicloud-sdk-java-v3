package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 域名对象
 */
public class CreateDomainRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private DomainBody domain;

    public CreateDomainRequestBody withDomain(DomainBody domain) {
        this.domain = domain;
        return this;
    }

    public CreateDomainRequestBody withDomain(Consumer<DomainBody> domainSetter) {
        if (this.domain == null) {
            this.domain = new DomainBody();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public DomainBody getDomain() {
        return domain;
    }

    public void setDomain(DomainBody domain) {
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
        CreateDomainRequestBody createDomainRequestBody = (CreateDomainRequestBody) o;
        return Objects.equals(this.domain, createDomainRequestBody.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDomainRequestBody {\n");
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
