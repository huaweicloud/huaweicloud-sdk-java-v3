package com.huaweicloud.sdk.rds.v3.model;

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
 * MysqlProxyFlavorsResponseComputeFlavorGroups
 */
public class MysqlProxyFlavorsResponseComputeFlavorGroups {

    /**
     * 规格组类型，如x86、arm。
     */
    public static final class GroupTypeEnum {

        /**
         * Enum X86 for value: "x86"
         */
        public static final GroupTypeEnum X86 = new GroupTypeEnum("x86");

        /**
         * Enum ARM for value: "arm"
         */
        public static final GroupTypeEnum ARM = new GroupTypeEnum("arm");

        private static final Map<String, GroupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupTypeEnum> createStaticFields() {
            Map<String, GroupTypeEnum> map = new HashMap<>();
            map.put("x86", X86);
            map.put("arm", ARM);
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
    @JsonProperty(value = "compute_flavors")

    private List<MysqlProxyFlavorsResponseComputeFlavors> computeFlavors = null;

    public MysqlProxyFlavorsResponseComputeFlavorGroups withGroupType(GroupTypeEnum groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 规格组类型，如x86、arm。
     * @return groupType
     */
    public GroupTypeEnum getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupTypeEnum groupType) {
        this.groupType = groupType;
    }

    public MysqlProxyFlavorsResponseComputeFlavorGroups withComputeFlavors(
        List<MysqlProxyFlavorsResponseComputeFlavors> computeFlavors) {
        this.computeFlavors = computeFlavors;
        return this;
    }

    public MysqlProxyFlavorsResponseComputeFlavorGroups addComputeFlavorsItem(
        MysqlProxyFlavorsResponseComputeFlavors computeFlavorsItem) {
        if (this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        this.computeFlavors.add(computeFlavorsItem);
        return this;
    }

    public MysqlProxyFlavorsResponseComputeFlavorGroups withComputeFlavors(
        Consumer<List<MysqlProxyFlavorsResponseComputeFlavors>> computeFlavorsSetter) {
        if (this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        computeFlavorsSetter.accept(this.computeFlavors);
        return this;
    }

    /**
     * 规格信息。
     * @return computeFlavors
     */
    public List<MysqlProxyFlavorsResponseComputeFlavors> getComputeFlavors() {
        return computeFlavors;
    }

    public void setComputeFlavors(List<MysqlProxyFlavorsResponseComputeFlavors> computeFlavors) {
        this.computeFlavors = computeFlavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlProxyFlavorsResponseComputeFlavorGroups that = (MysqlProxyFlavorsResponseComputeFlavorGroups) obj;
        return Objects.equals(this.groupType, that.groupType)
            && Objects.equals(this.computeFlavors, that.computeFlavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupType, computeFlavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxyFlavorsResponseComputeFlavorGroups {\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    computeFlavors: ").append(toIndentedString(computeFlavors)).append("\n");
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
