package com.huaweicloud.sdk.kms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.Secret;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RestoreSecretResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret")
    
    private Secret secret;

    public RestoreSecretResponse withSecret(Secret secret) {
        this.secret = secret;
        return this;
    }

    public RestoreSecretResponse withSecret(Consumer<Secret> secretSetter) {
        if(this.secret == null ){
            this.secret = new Secret();
            secretSetter.accept(this.secret);
        }
        
        return this;
    }


    /**
     * Get secret
     * @return secret
     */
    public Secret getSecret() {
        return secret;
    }

    public void setSecret(Secret secret) {
        this.secret = secret;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreSecretResponse restoreSecretResponse = (RestoreSecretResponse) o;
        return Objects.equals(this.secret, restoreSecretResponse.secret);
    }
    @Override
    public int hashCode() {
        return Objects.hash(secret);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreSecretResponse {\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

