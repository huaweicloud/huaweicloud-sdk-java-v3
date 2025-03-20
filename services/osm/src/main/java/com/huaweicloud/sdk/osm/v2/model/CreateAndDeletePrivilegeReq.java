package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateAndDeletePrivilegeReq
 */
public class CreateAndDeletePrivilegeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    /**
     * 权限标识
     */
    public static final class PrivilegeEnum {

        /**
         * Enum EXPORT for value: "export"
         */
        public static final PrivilegeEnum EXPORT = new PrivilegeEnum("export");

        /**
         * Enum CREATECASE for value: "createCase"
         */
        public static final PrivilegeEnum CREATECASE = new PrivilegeEnum("createCase");

        private static final Map<String, PrivilegeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrivilegeEnum> createStaticFields() {
            Map<String, PrivilegeEnum> map = new HashMap<>();
            map.put("export", EXPORT);
            map.put("createCase", CREATECASE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrivilegeEnum(String value) {
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
        public static PrivilegeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PrivilegeEnum(value));
        }

        public static PrivilegeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrivilegeEnum) {
                return this.value.equals(((PrivilegeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privilege")

    private PrivilegeEnum privilege;

    public CreateAndDeletePrivilegeReq withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 执行的操作(create|delete)
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public CreateAndDeletePrivilegeReq withPrivilege(PrivilegeEnum privilege) {
        this.privilege = privilege;
        return this;
    }

    /**
     * 权限标识
     * @return privilege
     */
    public PrivilegeEnum getPrivilege() {
        return privilege;
    }

    public void setPrivilege(PrivilegeEnum privilege) {
        this.privilege = privilege;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAndDeletePrivilegeReq that = (CreateAndDeletePrivilegeReq) obj;
        return Objects.equals(this.operation, that.operation) && Objects.equals(this.privilege, that.privilege);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, privilege);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAndDeletePrivilegeReq {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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
