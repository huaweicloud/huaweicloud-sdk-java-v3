package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.IdentityproviderOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class KeystoneUpdateIdentityProviderRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="identity_provider")
    
    private IdentityproviderOption identityProvider;

    public KeystoneUpdateIdentityProviderRequestBody withIdentityProvider(IdentityproviderOption identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    public KeystoneUpdateIdentityProviderRequestBody withIdentityProvider(Consumer<IdentityproviderOption> identityProviderSetter) {
        if(this.identityProvider == null ){
            this.identityProvider = new IdentityproviderOption();
            identityProviderSetter.accept(this.identityProvider);
        }
        
        return this;
    }


    /**
     * Get identityProvider
     * @return identityProvider
     */
    public IdentityproviderOption getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(IdentityproviderOption identityProvider) {
        this.identityProvider = identityProvider;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneUpdateIdentityProviderRequestBody keystoneUpdateIdentityProviderRequestBody = (KeystoneUpdateIdentityProviderRequestBody) o;
        return Objects.equals(this.identityProvider, keystoneUpdateIdentityProviderRequestBody.identityProvider);
    }
    @Override
    public int hashCode() {
        return Objects.hash(identityProvider);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateIdentityProviderRequestBody {\n");
        sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
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

