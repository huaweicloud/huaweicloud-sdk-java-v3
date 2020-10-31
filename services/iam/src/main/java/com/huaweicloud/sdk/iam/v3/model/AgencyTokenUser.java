package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyTokenUserDomain;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class AgencyTokenUser  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private AgencyTokenUserDomain domain = null;

    public AgencyTokenUser withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 委托方A账号名/委托名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgencyTokenUser withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 委托ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AgencyTokenUser withDomain(AgencyTokenUserDomain domain) {
        this.domain = domain;
        return this;
    }

    public AgencyTokenUser withDomain(Consumer<AgencyTokenUserDomain> domainSetter) {
        if(this.domain == null ){
            this.domain = new AgencyTokenUserDomain();
            domainSetter.accept(this.domain);
        }
        
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public AgencyTokenUserDomain getDomain() {
        return domain;
    }

    public void setDomain(AgencyTokenUserDomain domain) {
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
        AgencyTokenUser agencyTokenUser = (AgencyTokenUser) o;
        return Objects.equals(this.name, agencyTokenUser.name) &&
            Objects.equals(this.id, agencyTokenUser.id) &&
            Objects.equals(this.domain, agencyTokenUser.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id, domain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyTokenUser {\n");
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

