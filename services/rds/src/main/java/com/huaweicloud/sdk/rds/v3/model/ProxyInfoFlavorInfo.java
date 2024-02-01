package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据库代理规格信息。
 */
public class ProxyInfoFlavorInfo {

    /**
     * 规格类型。
     */
    public static final class GroupTypeEnum {

        /**
         * Enum X86 for value: "X86"
         */
        public static final GroupTypeEnum X86 = new GroupTypeEnum("X86");

        /**
         * Enum RAM for value: "RAM"
         */
        public static final GroupTypeEnum RAM = new GroupTypeEnum("RAM");

        private static final Map<String, GroupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupTypeEnum> createStaticFields() {
            Map<String, GroupTypeEnum> map = new HashMap<>();
            map.put("X86", X86);
            map.put("RAM", RAM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupTypeEnum(String value) {
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
        public static GroupTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GroupTypeEnum(value));
        }

        public static GroupTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GroupTypeEnum) {
                return this.value.equals(((GroupTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private GroupTypeEnum groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    public ProxyInfoFlavorInfo withGroupType(GroupTypeEnum groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 规格类型。
     * @return groupType
     */
    public GroupTypeEnum getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupTypeEnum groupType) {
        this.groupType = groupType;
    }

    public ProxyInfoFlavorInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 规格码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyInfoFlavorInfo that = (ProxyInfoFlavorInfo) obj;
        return Objects.equals(this.groupType, that.groupType) && Objects.equals(this.code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupType, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyInfoFlavorInfo {\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
