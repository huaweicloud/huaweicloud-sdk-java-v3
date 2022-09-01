package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class TokenProjectResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private TokenProjectDomainResult domain;

    public TokenProjectResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TokenProjectResult withId(String id) {
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

    public TokenProjectResult withDomain(TokenProjectDomainResult domain) {
        this.domain = domain;
        return this;
    }

    public TokenProjectResult withDomain(Consumer<TokenProjectDomainResult> domainSetter) {
        if (this.domain == null) {
            this.domain = new TokenProjectDomainResult();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public TokenProjectDomainResult getDomain() {
        return domain;
    }

    public void setDomain(TokenProjectDomainResult domain) {
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
        TokenProjectResult tokenProjectResult = (TokenProjectResult) o;
        return Objects.equals(this.name, tokenProjectResult.name) && Objects.equals(this.id, tokenProjectResult.id)
            && Objects.equals(this.domain, tokenProjectResult.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenProjectResult {\n");
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
