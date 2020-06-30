package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.IdentityToken;
import com.huaweicloud.sdk.iam.v3.model.ServicePolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class TokenAuthIdentity  {

    /**
     * Gets or Sets methods
     */
    public static class MethodsEnum {

        
        /**
         * Enum TOKEN for value: "token"
         */
        public static final MethodsEnum TOKEN = new MethodsEnum("token");
        

        public static final Map<String, MethodsEnum> staticFields = new HashMap<String, MethodsEnum>() {
            { 
                put("token", TOKEN);
            }
        };

        private String value;

        MethodsEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MethodsEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MethodsEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new MethodsEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static MethodsEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MethodsEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MethodsEnum) {
                return this.value.equals(((MethodsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="methods")
    
    private List<MethodsEnum> methods = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="token")
    
    private IdentityToken token = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy")
    
    private ServicePolicy policy = null;

    public TokenAuthIdentity withMethods(List<MethodsEnum> methods) {
        this.methods = methods;
        return this;
    }

    
    public TokenAuthIdentity addMethodsItem(MethodsEnum methodsItem) {
        this.methods.add(methodsItem);
        return this;
    }

    public TokenAuthIdentity withMethods(Consumer<List<MethodsEnum>> methodsSetter) {
        if(this.methods == null ){
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * 认证方法，该字段内容为[\"token\"]。
     * @return methods
     */
    public List<MethodsEnum> getMethods() {
        return methods;
    }

    public void setMethods(List<MethodsEnum> methods) {
        this.methods = methods;
    }

    public TokenAuthIdentity withToken(IdentityToken token) {
        this.token = token;
        return this;
    }

    public TokenAuthIdentity withToken(Consumer<IdentityToken> tokenSetter) {
        if(this.token == null ){
            this.token = new IdentityToken();
            tokenSetter.accept(this.token);
        }
        
        return this;
    }


    /**
     * Get token
     * @return token
     */
    public IdentityToken getToken() {
        return token;
    }

    public void setToken(IdentityToken token) {
        this.token = token;
    }

    public TokenAuthIdentity withPolicy(ServicePolicy policy) {
        this.policy = policy;
        return this;
    }

    public TokenAuthIdentity withPolicy(Consumer<ServicePolicy> policySetter) {
        if(this.policy == null ){
            this.policy = new ServicePolicy();
            policySetter.accept(this.policy);
        }
        
        return this;
    }


    /**
     * Get policy
     * @return policy
     */
    public ServicePolicy getPolicy() {
        return policy;
    }

    public void setPolicy(ServicePolicy policy) {
        this.policy = policy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenAuthIdentity tokenAuthIdentity = (TokenAuthIdentity) o;
        return Objects.equals(this.methods, tokenAuthIdentity.methods) &&
            Objects.equals(this.token, tokenAuthIdentity.token) &&
            Objects.equals(this.policy, tokenAuthIdentity.policy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(methods, token, policy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenAuthIdentity {\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

