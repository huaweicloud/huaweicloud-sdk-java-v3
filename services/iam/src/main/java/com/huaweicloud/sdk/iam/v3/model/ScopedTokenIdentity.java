package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ScopedTokenIdentity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "methods")

    private List<String> methods = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private ScopedToken token;

    public ScopedTokenIdentity withMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    public ScopedTokenIdentity addMethodsItem(String methodsItem) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        this.methods.add(methodsItem);
        return this;
    }

    public ScopedTokenIdentity withMethods(Consumer<List<String>> methodsSetter) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * 认证方法，该字段内容为“token”。
     * @return methods
     */
    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public ScopedTokenIdentity withToken(ScopedToken token) {
        this.token = token;
        return this;
    }

    public ScopedTokenIdentity withToken(Consumer<ScopedToken> tokenSetter) {
        if (this.token == null) {
            this.token = new ScopedToken();
            tokenSetter.accept(this.token);
        }

        return this;
    }

    /**
     * Get token
     * @return token
     */
    public ScopedToken getToken() {
        return token;
    }

    public void setToken(ScopedToken token) {
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
        ScopedTokenIdentity scopedTokenIdentity = (ScopedTokenIdentity) o;
        return Objects.equals(this.methods, scopedTokenIdentity.methods)
            && Objects.equals(this.token, scopedTokenIdentity.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(methods, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScopedTokenIdentity {\n");
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
