package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * GcbAdminState
 */
public class GcbAdminState {

    /**
     * 功能说明: 全域互联带宽状态。 取值范围：     NORMAL-正常     FREEZED-冻结状态
     */
    public static final class AdminStateEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final AdminStateEnum NORMAL = new AdminStateEnum("NORMAL");

        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final AdminStateEnum FREEZED = new AdminStateEnum("FREEZED");

        private static final Map<String, AdminStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AdminStateEnum> createStaticFields() {
            Map<String, AdminStateEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("FREEZED", FREEZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AdminStateEnum(String value) {
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
        public static AdminStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AdminStateEnum(value));
        }

        public static AdminStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AdminStateEnum) {
                return this.value.equals(((AdminStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state")

    private AdminStateEnum adminState;

    public GcbAdminState withAdminState(AdminStateEnum adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * 功能说明: 全域互联带宽状态。 取值范围：     NORMAL-正常     FREEZED-冻结状态
     * @return adminState
     */
    public AdminStateEnum getAdminState() {
        return adminState;
    }

    public void setAdminState(AdminStateEnum adminState) {
        this.adminState = adminState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GcbAdminState that = (GcbAdminState) obj;
        return Objects.equals(this.adminState, that.adminState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GcbAdminState {\n");
        sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
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
