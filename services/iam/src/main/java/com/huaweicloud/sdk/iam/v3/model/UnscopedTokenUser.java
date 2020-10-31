package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.TokenDomainResult;
import com.huaweicloud.sdk.iam.v3.model.TokenUserOsfederation;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UnscopedTokenUser  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private TokenDomainResult domain = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-FEDERATION")
    
    private TokenUserOsfederation osFederation = null;

    public UnscopedTokenUser withDomain(TokenDomainResult domain) {
        this.domain = domain;
        return this;
    }

    public UnscopedTokenUser withDomain(Consumer<TokenDomainResult> domainSetter) {
        if(this.domain == null ){
            this.domain = new TokenDomainResult();
            domainSetter.accept(this.domain);
        }
        
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public TokenDomainResult getDomain() {
        return domain;
    }

    public void setDomain(TokenDomainResult domain) {
        this.domain = domain;
    }

    public UnscopedTokenUser withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UnscopedTokenUser withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 用户名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnscopedTokenUser withOsFederation(TokenUserOsfederation osFederation) {
        this.osFederation = osFederation;
        return this;
    }

    public UnscopedTokenUser withOsFederation(Consumer<TokenUserOsfederation> osFederationSetter) {
        if(this.osFederation == null ){
            this.osFederation = new TokenUserOsfederation();
            osFederationSetter.accept(this.osFederation);
        }
        
        return this;
    }


    /**
     * Get osFederation
     * @return osFederation
     */
    public TokenUserOsfederation getOsFederation() {
        return osFederation;
    }

    public void setOsFederation(TokenUserOsfederation osFederation) {
        this.osFederation = osFederation;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnscopedTokenUser unscopedTokenUser = (UnscopedTokenUser) o;
        return Objects.equals(this.domain, unscopedTokenUser.domain) &&
            Objects.equals(this.id, unscopedTokenUser.id) &&
            Objects.equals(this.name, unscopedTokenUser.name) &&
            Objects.equals(this.osFederation, unscopedTokenUser.osFederation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, id, name, osFederation);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnscopedTokenUser {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    osFederation: ").append(toIndentedString(osFederation)).append("\n");
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

