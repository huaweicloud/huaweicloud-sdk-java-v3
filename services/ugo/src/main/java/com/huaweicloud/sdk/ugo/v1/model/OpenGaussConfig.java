package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * GaussDB Centralized 的特殊配置。
 */
public class OpenGaussConfig {

    /**
     * 权限检查类型。
     */
    public static final class PermissionCheckTypeEnum {

        /**
         * Enum OBJECTOWNER for value: "objectowner"
         */
        public static final PermissionCheckTypeEnum OBJECTOWNER = new PermissionCheckTypeEnum("objectowner");

        /**
         * Enum SYSADMIN for value: "sysadmin"
         */
        public static final PermissionCheckTypeEnum SYSADMIN = new PermissionCheckTypeEnum("sysadmin");

        private static final Map<String, PermissionCheckTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionCheckTypeEnum> createStaticFields() {
            Map<String, PermissionCheckTypeEnum> map = new HashMap<>();
            map.put("objectowner", OBJECTOWNER);
            map.put("sysadmin", SYSADMIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionCheckTypeEnum(String value) {
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
        public static PermissionCheckTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PermissionCheckTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PermissionCheckTypeEnum(value);
            }
            return result;
        }

        public static PermissionCheckTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PermissionCheckTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionCheckTypeEnum) {
                return this.value.equals(((PermissionCheckTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_check_type")

    private PermissionCheckTypeEnum permissionCheckType;

    public OpenGaussConfig withPermissionCheckType(PermissionCheckTypeEnum permissionCheckType) {
        this.permissionCheckType = permissionCheckType;
        return this;
    }

    /**
     * 权限检查类型。
     * @return permissionCheckType
     */
    public PermissionCheckTypeEnum getPermissionCheckType() {
        return permissionCheckType;
    }

    public void setPermissionCheckType(PermissionCheckTypeEnum permissionCheckType) {
        this.permissionCheckType = permissionCheckType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussConfig openGaussConfig = (OpenGaussConfig) o;
        return Objects.equals(this.permissionCheckType, openGaussConfig.permissionCheckType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionCheckType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussConfig {\n");
        sb.append("    permissionCheckType: ").append(toIndentedString(permissionCheckType)).append("\n");
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
