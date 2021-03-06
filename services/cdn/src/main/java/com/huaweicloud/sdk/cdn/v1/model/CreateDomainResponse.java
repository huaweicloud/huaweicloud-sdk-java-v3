package com.huaweicloud.sdk.cdn.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.CreateDomainResponseBodyContent;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateDomainResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private CreateDomainResponseBodyContent domain;

    public CreateDomainResponse withDomain(CreateDomainResponseBodyContent domain) {
        this.domain = domain;
        return this;
    }

    public CreateDomainResponse withDomain(Consumer<CreateDomainResponseBodyContent> domainSetter) {
        if(this.domain == null ){
            this.domain = new CreateDomainResponseBodyContent();
            domainSetter.accept(this.domain);
        }
        
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public CreateDomainResponseBodyContent getDomain() {
        return domain;
    }

    public void setDomain(CreateDomainResponseBodyContent domain) {
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
        CreateDomainResponse createDomainResponse = (CreateDomainResponse) o;
        return Objects.equals(this.domain, createDomainResponse.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDomainResponse {\n");
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

