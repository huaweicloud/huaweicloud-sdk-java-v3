package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowAgencyRequest {

    /**
     * 委托授权类型 * CBS:对话机器人服务(CBS)访客 * SIS:语音交互服务(SIS)调用
     */
    public static final class RoleTypeEnum {

        /**
         * Enum CBS for value: "CBS"
         */
        public static final RoleTypeEnum CBS = new RoleTypeEnum("CBS");

        /**
         * Enum SIS for value: "SIS"
         */
        public static final RoleTypeEnum SIS = new RoleTypeEnum("SIS");

        private static final Map<String, RoleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleTypeEnum> createStaticFields() {
            Map<String, RoleTypeEnum> map = new HashMap<>();
            map.put("CBS", CBS);
            map.put("SIS", SIS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleTypeEnum(String value) {
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
        public static RoleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoleTypeEnum(value));
        }

        public static RoleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleTypeEnum) {
                return this.value.equals(((RoleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_type")

    private RoleTypeEnum roleType;

    public ShowAgencyRequest withRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * 委托授权类型 * CBS:对话机器人服务(CBS)访客 * SIS:语音交互服务(SIS)调用
     * @return roleType
     */
    public RoleTypeEnum getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgencyRequest that = (ShowAgencyRequest) obj;
        return Objects.equals(this.roleType, that.roleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgencyRequest {\n");
        sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
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
