package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 访问信任区域内资源的外部主体。
 */
public class FindingPrincipal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    /**
     * 外部主体身份的类型。
     */
    public static final class TypeEnum {

        /**
         * Enum ALL_PRINCIPAL for value: "all_principal"
         */
        public static final TypeEnum ALL_PRINCIPAL = new TypeEnum("all_principal");

        /**
         * Enum ACCOUNT for value: "account"
         */
        public static final TypeEnum ACCOUNT = new TypeEnum("account");

        /**
         * Enum ALL_USER_IN_ACCOUNT for value: "all_user_in_account"
         */
        public static final TypeEnum ALL_USER_IN_ACCOUNT = new TypeEnum("all_user_in_account");

        /**
         * Enum ALL_AGENCY_IN_ACCOUNT for value: "all_agency_in_account"
         */
        public static final TypeEnum ALL_AGENCY_IN_ACCOUNT = new TypeEnum("all_agency_in_account");

        /**
         * Enum ALL_IDENTITY_PROVIDER_IN_ACCOUNT for value: "all_identity_provider_in_account"
         */
        public static final TypeEnum ALL_IDENTITY_PROVIDER_IN_ACCOUNT =
            new TypeEnum("all_identity_provider_in_account");

        /**
         * Enum SPECIFIC_USER for value: "specific_user"
         */
        public static final TypeEnum SPECIFIC_USER = new TypeEnum("specific_user");

        /**
         * Enum SPECIFIC_AGENCY for value: "specific_agency"
         */
        public static final TypeEnum SPECIFIC_AGENCY = new TypeEnum("specific_agency");

        /**
         * Enum SPECIFIC_GROUP for value: "specific_group"
         */
        public static final TypeEnum SPECIFIC_GROUP = new TypeEnum("specific_group");

        /**
         * Enum SPECIFIC_IDENTITY_PROVIDER for value: "specific_identity_provider"
         */
        public static final TypeEnum SPECIFIC_IDENTITY_PROVIDER = new TypeEnum("specific_identity_provider");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("all_principal", ALL_PRINCIPAL);
            map.put("account", ACCOUNT);
            map.put("all_user_in_account", ALL_USER_IN_ACCOUNT);
            map.put("all_agency_in_account", ALL_AGENCY_IN_ACCOUNT);
            map.put("all_identity_provider_in_account", ALL_IDENTITY_PROVIDER_IN_ACCOUNT);
            map.put("specific_user", SPECIFIC_USER);
            map.put("specific_agency", SPECIFIC_AGENCY);
            map.put("specific_group", SPECIFIC_GROUP);
            map.put("specific_identity_provider", SPECIFIC_IDENTITY_PROVIDER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public FindingPrincipal withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 外部主体身份的标识符。
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public FindingPrincipal withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 外部主体身份的类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FindingPrincipal that = (FindingPrincipal) obj;
        return Objects.equals(this.identifier, that.identifier) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FindingPrincipal {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
