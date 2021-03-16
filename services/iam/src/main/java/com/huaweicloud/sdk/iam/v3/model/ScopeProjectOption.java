package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ScopeDomainOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ScopeProjectOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private ScopeDomainOption domain;

    public ScopeProjectOption withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 项目ID，id与name二选一即可。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ScopeProjectOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 项目名，id与name二选一即可。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ScopeProjectOption withDomain(ScopeDomainOption domain) {
        this.domain = domain;
        return this;
    }

    public ScopeProjectOption withDomain(Consumer<ScopeDomainOption> domainSetter) {
        if(this.domain == null ){
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScopeProjectOption scopeProjectOption = (ScopeProjectOption) o;
        return Objects.equals(this.id, scopeProjectOption.id) &&
            Objects.equals(this.name, scopeProjectOption.name) &&
            Objects.equals(this.domain, scopeProjectOption.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, domain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScopeProjectOption {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

