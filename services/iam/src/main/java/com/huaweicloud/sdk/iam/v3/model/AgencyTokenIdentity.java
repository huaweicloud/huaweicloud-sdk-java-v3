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
public class AgencyTokenIdentity {

    /**
     * Gets or Sets methods
     */
    public static final class MethodsEnum {

        /**
         * Enum ASSUME_ROLE for value: "assume_role"
         */
        public static final MethodsEnum ASSUME_ROLE = new MethodsEnum("assume_role");

        private static final Map<String, MethodsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodsEnum> createStaticFields() {
            Map<String, MethodsEnum> map = new HashMap<>();
            map.put("assume_role", ASSUME_ROLE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MethodsEnum(value));
        }

        public static MethodsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "assume_role")

    private AgencyTokenAssumerole assumeRole;

    public AgencyTokenIdentity withMethods(List<MethodsEnum> methods) {
        this.methods = methods;
        return this;
    }

    public AgencyTokenIdentity addMethodsItem(MethodsEnum methodsItem) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        this.methods.add(methodsItem);
        return this;
    }

    public AgencyTokenIdentity withMethods(Consumer<List<MethodsEnum>> methodsSetter) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * token的获取方式，该字段内容为[\"assume_role\"]。
     * @return methods
     */
    public List<MethodsEnum> getMethods() {
        return methods;
    }

    public void setMethods(List<MethodsEnum> methods) {
        this.methods = methods;
    }

    public AgencyTokenIdentity withAssumeRole(AgencyTokenAssumerole assumeRole) {
        this.assumeRole = assumeRole;
        return this;
    }

    public AgencyTokenIdentity withAssumeRole(Consumer<AgencyTokenAssumerole> assumeRoleSetter) {
        if (this.assumeRole == null) {
            this.assumeRole = new AgencyTokenAssumerole();
            assumeRoleSetter.accept(this.assumeRole);
        }

        return this;
    }

    /**
     * Get assumeRole
     * @return assumeRole
     */
    public AgencyTokenAssumerole getAssumeRole() {
        return assumeRole;
    }

    public void setAssumeRole(AgencyTokenAssumerole assumeRole) {
        this.assumeRole = assumeRole;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyTokenIdentity that = (AgencyTokenIdentity) obj;
        return Objects.equals(this.methods, that.methods) && Objects.equals(this.assumeRole, that.assumeRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(methods, assumeRole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyTokenIdentity {\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
        sb.append("    assumeRole: ").append(toIndentedString(assumeRole)).append("\n");
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
