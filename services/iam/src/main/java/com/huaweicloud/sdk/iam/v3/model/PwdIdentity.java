package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PwdIdentity {

    /** Gets or Sets methods */
    public static final class MethodsEnum {

        /** Enum PASSWORD for value: "password" */
        public static final MethodsEnum PASSWORD = new MethodsEnum("password");

        private static final Map<String, MethodsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodsEnum> createStaticFields() {
            Map<String, MethodsEnum> map = new HashMap<>();
            map.put("password", PASSWORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodsEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MethodsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MethodsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MethodsEnum(value);
            }
            return result;
        }

        public static MethodsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MethodsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MethodsEnum) {
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
    @JsonProperty(value = "methods")

    private List<MethodsEnum> methods = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private PwdPassword password;

    public PwdIdentity withMethods(List<MethodsEnum> methods) {
        this.methods = methods;
        return this;
    }

    public PwdIdentity addMethodsItem(MethodsEnum methodsItem) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        this.methods.add(methodsItem);
        return this;
    }

    public PwdIdentity withMethods(Consumer<List<MethodsEnum>> methodsSetter) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /** 认证方法，该字段内容为[\"password\"]。
     * 
     * @return methods */
    public List<MethodsEnum> getMethods() {
        return methods;
    }

    public void setMethods(List<MethodsEnum> methods) {
        this.methods = methods;
    }

    public PwdIdentity withPassword(PwdPassword password) {
        this.password = password;
        return this;
    }

    public PwdIdentity withPassword(Consumer<PwdPassword> passwordSetter) {
        if (this.password == null) {
            this.password = new PwdPassword();
            passwordSetter.accept(this.password);
        }

        return this;
    }

    /** Get password
     * 
     * @return password */
    public PwdPassword getPassword() {
        return password;
    }

    public void setPassword(PwdPassword password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PwdIdentity pwdIdentity = (PwdIdentity) o;
        return Objects.equals(this.methods, pwdIdentity.methods) && Objects.equals(this.password, pwdIdentity.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(methods, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PwdIdentity {\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
