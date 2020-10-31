package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AuthScope;
import com.huaweicloud.sdk.iam.v3.model.MfaIdentity;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class MfaAuth  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="identity")
    
    private MfaIdentity identity = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scope")
    
    private AuthScope scope = null;

    public MfaAuth withIdentity(MfaIdentity identity) {
        this.identity = identity;
        return this;
    }

    public MfaAuth withIdentity(Consumer<MfaIdentity> identitySetter) {
        if(this.identity == null ){
            this.identity = new MfaIdentity();
            identitySetter.accept(this.identity);
        }
        
        return this;
    }


    /**
     * Get identity
     * @return identity
     */
    public MfaIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(MfaIdentity identity) {
        this.identity = identity;
    }

    public MfaAuth withScope(AuthScope scope) {
        this.scope = scope;
        return this;
    }

    public MfaAuth withScope(Consumer<AuthScope> scopeSetter) {
        if(this.scope == null ){
            this.scope = new AuthScope();
            scopeSetter.accept(this.scope);
        }
        
        return this;
    }


    /**
     * Get scope
     * @return scope
     */
    public AuthScope getScope() {
        return scope;
    }

    public void setScope(AuthScope scope) {
        this.scope = scope;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MfaAuth mfaAuth = (MfaAuth) o;
        return Objects.equals(this.identity, mfaAuth.identity) &&
            Objects.equals(this.scope, mfaAuth.scope);
    }
    @Override
    public int hashCode() {
        return Objects.hash(identity, scope);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MfaAuth {\n");
        sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

