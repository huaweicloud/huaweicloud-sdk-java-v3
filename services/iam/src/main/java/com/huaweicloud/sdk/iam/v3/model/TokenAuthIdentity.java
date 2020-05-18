package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.IdentityToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

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

        

        public static Map<String, MethodsEnum> staticFields =
                new HashMap<String, MethodsEnum>() {
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
        }
        tokenSetter.accept(this.token);
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
            Objects.equals(this.token, tokenAuthIdentity.token);
    }
    @Override
    public int hashCode() {
        return Objects.hash(methods, token);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenAuthIdentity {\n");
            sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
            sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

