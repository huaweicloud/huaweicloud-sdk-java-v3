package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ScopedTokenIdentity;
import com.huaweicloud.sdk.iam.v3.model.TokenSocpeOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ScopedTokenAuth  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="identity")
    
    private ScopedTokenIdentity identity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scope")
    
    private TokenSocpeOption scope;

    public ScopedTokenAuth withIdentity(ScopedTokenIdentity identity) {
        this.identity = identity;
        return this;
    }

    public ScopedTokenAuth withIdentity(Consumer<ScopedTokenIdentity> identitySetter) {
        if(this.identity == null ){
            this.identity = new ScopedTokenIdentity();
            identitySetter.accept(this.identity);
        }
        
        return this;
    }


    /**
     * Get identity
     * @return identity
     */
    public ScopedTokenIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(ScopedTokenIdentity identity) {
        this.identity = identity;
    }

    

    public ScopedTokenAuth withScope(TokenSocpeOption scope) {
        this.scope = scope;
        return this;
    }

    public ScopedTokenAuth withScope(Consumer<TokenSocpeOption> scopeSetter) {
        if(this.scope == null ){
            this.scope = new TokenSocpeOption();
            scopeSetter.accept(this.scope);
        }
        
        return this;
    }


    /**
     * Get scope
     * @return scope
     */
    public TokenSocpeOption getScope() {
        return scope;
    }

    public void setScope(TokenSocpeOption scope) {
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
        ScopedTokenAuth scopedTokenAuth = (ScopedTokenAuth) o;
        return Objects.equals(this.identity, scopedTokenAuth.identity) &&
            Objects.equals(this.scope, scopedTokenAuth.scope);
    }
    @Override
    public int hashCode() {
        return Objects.hash(identity, scope);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScopedTokenAuth {\n");
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

