package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * ComputeFlavorGroupDetail
 */
public class ComputeFlavorGroupDetail {

    /**
     * **参数解释**: 性能规格。 **取值范围**: - normal：独享型（1:8）。 - normal2：独享型（1:4）。 - armFlavors：鲲鹏独享型（1:8）。 - exclusive：独享型（1:4），仅基础版集中式实例支持。 - armExclusive：鲲鹏独享型（1:4），仅基础版集中式实例支持。 - economical：惠选型（1:4）。 - economical2：惠选型（1:8）。 - armFlavors2：鲲鹏独享型（1:4）。 - general：通用型（1:4）。
     */
    public static final class GroupTypeEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final GroupTypeEnum NORMAL = new GroupTypeEnum("normal");

        /**
         * Enum NORMAL2 for value: "normal2"
         */
        public static final GroupTypeEnum NORMAL2 = new GroupTypeEnum("normal2");

        /**
         * Enum ARMFLAVORS for value: "armFlavors"
         */
        public static final GroupTypeEnum ARMFLAVORS = new GroupTypeEnum("armFlavors");

        /**
         * Enum EXCLUSIVE for value: "exclusive"
         */
        public static final GroupTypeEnum EXCLUSIVE = new GroupTypeEnum("exclusive");

        /**
         * Enum ARMEXCLUSIVE for value: "armExclusive"
         */
        public static final GroupTypeEnum ARMEXCLUSIVE = new GroupTypeEnum("armExclusive");

        /**
         * Enum ECONOMICAL for value: "economical"
         */
        public static final GroupTypeEnum ECONOMICAL = new GroupTypeEnum("economical");

        /**
         * Enum ECONOMICAL2 for value: "economical2"
         */
        public static final GroupTypeEnum ECONOMICAL2 = new GroupTypeEnum("economical2");

        /**
         * Enum ARMFLAVORS2 for value: "armFlavors2"
         */
        public static final GroupTypeEnum ARMFLAVORS2 = new GroupTypeEnum("armFlavors2");

        /**
         * Enum GENERAL for value: "general"
         */
        public static final GroupTypeEnum GENERAL = new GroupTypeEnum("general");

        private static final Map<String, GroupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupTypeEnum> createStaticFields() {
            Map<String, GroupTypeEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("normal2", NORMAL2);
            map.put("armFlavors", ARMFLAVORS);
            map.put("exclusive", EXCLUSIVE);
            map.put("armExclusive", ARMEXCLUSIVE);
            map.put("economical", ECONOMICAL);
            map.put("economical2", ECONOMICAL2);
            map.put("armFlavors2", ARMFLAVORS2);
            map.put("general", GENERAL);
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

    private List<ComputeFlavorItemDetail> computeFlavors = null;

    public ComputeFlavorGroupDetail withGroupType(GroupTypeEnum groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * **参数解释**: 性能规格。 **取值范围**: - normal：独享型（1:8）。 - normal2：独享型（1:4）。 - armFlavors：鲲鹏独享型（1:8）。 - exclusive：独享型（1:4），仅基础版集中式实例支持。 - armExclusive：鲲鹏独享型（1:4），仅基础版集中式实例支持。 - economical：惠选型（1:4）。 - economical2：惠选型（1:8）。 - armFlavors2：鲲鹏独享型（1:4）。 - general：通用型（1:4）。
     * @return groupType
     */
    public GroupTypeEnum getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupTypeEnum groupType) {
        this.groupType = groupType;
    }

    public ComputeFlavorGroupDetail withComputeFlavors(List<ComputeFlavorItemDetail> computeFlavors) {
        this.computeFlavors = computeFlavors;
        return this;
    }

    public ComputeFlavorGroupDetail addComputeFlavorsItem(ComputeFlavorItemDetail computeFlavorsItem) {
        if (this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        this.computeFlavors.add(computeFlavorsItem);
        return this;
    }

    public ComputeFlavorGroupDetail withComputeFlavors(Consumer<List<ComputeFlavorItemDetail>> computeFlavorsSetter) {
        if (this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        computeFlavorsSetter.accept(this.computeFlavors);
        return this;
    }

    /**
     * **参数解释**: 计算规格列表。 **取值范围**: 不涉及。
     * @return computeFlavors
     */
    public List<ComputeFlavorItemDetail> getComputeFlavors() {
        return computeFlavors;
    }

    public void setComputeFlavors(List<ComputeFlavorItemDetail> computeFlavors) {
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
        ComputeFlavorGroupDetail that = (ComputeFlavorGroupDetail) obj;
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
        sb.append("class ComputeFlavorGroupDetail {\n");
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
