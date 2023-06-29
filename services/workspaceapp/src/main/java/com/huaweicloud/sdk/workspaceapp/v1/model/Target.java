package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Target
 */
public class Target {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_name")

    private String targetName;

    /**
     * 对象类型。 - USER：表示用户。   target_id：为用户ID。   target_name：为用户name。 - USERGROUP：表示用户组。   target_id：为用户组ID。   target_name：为用户组name。 - APPGROUP：应用组。   target_id：应用组id。   target_name：应用组名称。 - OU：组织单元。   target_id：OUID。   target_name：OU名称。 - ALL：表示所有。   target_id：default-apply-all-targets。   target_name：All-Targets。
     */
    public static final class TargetTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final TargetTypeEnum USER = new TargetTypeEnum("USER");

        /**
         * Enum USERGROUP for value: "USERGROUP"
         */
        public static final TargetTypeEnum USERGROUP = new TargetTypeEnum("USERGROUP");

        /**
         * Enum APPGROUP for value: "APPGROUP"
         */
        public static final TargetTypeEnum APPGROUP = new TargetTypeEnum("APPGROUP");

        /**
         * Enum OU for value: "OU"
         */
        public static final TargetTypeEnum OU = new TargetTypeEnum("OU");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final TargetTypeEnum ALL = new TargetTypeEnum("ALL");

        private static final Map<String, TargetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetTypeEnum> createStaticFields() {
            Map<String, TargetTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("USERGROUP", USERGROUP);
            map.put("APPGROUP", APPGROUP);
            map.put("OU", OU);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetTypeEnum(String value) {
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
        public static TargetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetTypeEnum(value));
        }

        public static TargetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetTypeEnum) {
                return this.value.equals(((TargetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private TargetTypeEnum targetType;

    public Target withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 对象ID。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public Target withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * 对象名称。
     * @return targetName
     */
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public Target withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 对象类型。 - USER：表示用户。   target_id：为用户ID。   target_name：为用户name。 - USERGROUP：表示用户组。   target_id：为用户组ID。   target_name：为用户组name。 - APPGROUP：应用组。   target_id：应用组id。   target_name：应用组名称。 - OU：组织单元。   target_id：OUID。   target_name：OU名称。 - ALL：表示所有。   target_id：default-apply-all-targets。   target_name：All-Targets。
     * @return targetType
     */
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Target that = (Target) obj;
        return Objects.equals(this.targetId, that.targetId) && Objects.equals(this.targetName, that.targetName)
            && Objects.equals(this.targetType, that.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, targetName, targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Target {\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
