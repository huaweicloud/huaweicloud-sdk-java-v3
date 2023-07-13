package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AddProtectAccessLevel
 */
public class AddProtectAccessLevel {

    /**
     * 提交权限 0:任何人不允许提交，30:开发者及管理员可提交，40:管理员可提交
     */
    public static final class PushAccessLevelEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final PushAccessLevelEnum NUMBER_0 = new PushAccessLevelEnum(0);

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final PushAccessLevelEnum NUMBER_30 = new PushAccessLevelEnum(30);

        /**
         * Enum NUMBER_40 for value: 40
         */
        public static final PushAccessLevelEnum NUMBER_40 = new PushAccessLevelEnum(40);

        private static final Map<Integer, PushAccessLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PushAccessLevelEnum> createStaticFields() {
            Map<Integer, PushAccessLevelEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(30, NUMBER_30);
            map.put(40, NUMBER_40);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PushAccessLevelEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PushAccessLevelEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PushAccessLevelEnum(value));
        }

        public static PushAccessLevelEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PushAccessLevelEnum) {
                return this.value.equals(((PushAccessLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_access_level")

    private PushAccessLevelEnum pushAccessLevel;

    /**
     * 合并权限 0:任何人不允许合并，30:开发者及管理员可合并，40:管理员可合并,合并权限必须大于等于提交权限
     */
    public static final class MergeAccessLevelEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final MergeAccessLevelEnum NUMBER_0 = new MergeAccessLevelEnum(0);

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final MergeAccessLevelEnum NUMBER_30 = new MergeAccessLevelEnum(30);

        /**
         * Enum NUMBER_40 for value: 40
         */
        public static final MergeAccessLevelEnum NUMBER_40 = new MergeAccessLevelEnum(40);

        private static final Map<Integer, MergeAccessLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, MergeAccessLevelEnum> createStaticFields() {
            Map<Integer, MergeAccessLevelEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(30, NUMBER_30);
            map.put(40, NUMBER_40);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        MergeAccessLevelEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MergeAccessLevelEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MergeAccessLevelEnum(value));
        }

        public static MergeAccessLevelEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MergeAccessLevelEnum) {
                return this.value.equals(((MergeAccessLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_access_level")

    private MergeAccessLevelEnum mergeAccessLevel;

    public AddProtectAccessLevel withPushAccessLevel(PushAccessLevelEnum pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }

    /**
     * 提交权限 0:任何人不允许提交，30:开发者及管理员可提交，40:管理员可提交
     * @return pushAccessLevel
     */
    public PushAccessLevelEnum getPushAccessLevel() {
        return pushAccessLevel;
    }

    public void setPushAccessLevel(PushAccessLevelEnum pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
    }

    public AddProtectAccessLevel withMergeAccessLevel(MergeAccessLevelEnum mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }

    /**
     * 合并权限 0:任何人不允许合并，30:开发者及管理员可合并，40:管理员可合并,合并权限必须大于等于提交权限
     * @return mergeAccessLevel
     */
    public MergeAccessLevelEnum getMergeAccessLevel() {
        return mergeAccessLevel;
    }

    public void setMergeAccessLevel(MergeAccessLevelEnum mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddProtectAccessLevel that = (AddProtectAccessLevel) obj;
        return Objects.equals(this.pushAccessLevel, that.pushAccessLevel)
            && Objects.equals(this.mergeAccessLevel, that.mergeAccessLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pushAccessLevel, mergeAccessLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddProtectAccessLevel {\n");
        sb.append("    pushAccessLevel: ").append(toIndentedString(pushAccessLevel)).append("\n");
        sb.append("    mergeAccessLevel: ").append(toIndentedString(mergeAccessLevel)).append("\n");
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
