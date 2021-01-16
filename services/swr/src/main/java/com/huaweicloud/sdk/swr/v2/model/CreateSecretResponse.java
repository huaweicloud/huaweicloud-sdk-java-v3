package com.huaweicloud.sdk.swr.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.Certification;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateSecretResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auths")
    
    private Certification auths = null;

    public CreateSecretResponse withAuths(Certification auths) {
        this.auths = auths;
        return this;
    }

    public CreateSecretResponse withAuths(Consumer<Certification> authsSetter) {
        if(this.auths == null ){
            this.auths = new Certification();
            authsSetter.accept(this.auths);
        }
        
        return this;
    }


    /**
     * Get auths
     * @return auths
     */
    public Certification getAuths() {
        return auths;
    }

    public void setAuths(Certification auths) {
        this.auths = auths;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecretResponse createSecretResponse = (CreateSecretResponse) o;
        return Objects.equals(this.auths, createSecretResponse.auths);
    }
    @Override
    public int hashCode() {
        return Objects.hash(auths);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretResponse {\n");
        sb.append("    auths: ").append(toIndentedString(auths)).append("\n");
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

