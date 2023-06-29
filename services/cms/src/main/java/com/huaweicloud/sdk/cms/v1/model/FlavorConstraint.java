package com.huaweicloud.sdk.cms.v1.model;

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
 * 资源规格的筛选约束
 */
public class FlavorConstraint {

    /**
     * 
     */
    public static final class ArchitectureTypeEnum {

        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final ArchitectureTypeEnum X86_64 = new ArchitectureTypeEnum("x86_64");

        /**
         * Enum ARM64 for value: "arm64"
         */
        public static final ArchitectureTypeEnum ARM64 = new ArchitectureTypeEnum("arm64");

        private static final Map<String, ArchitectureTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchitectureTypeEnum> createStaticFields() {
            Map<String, ArchitectureTypeEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("arm64", ARM64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchitectureTypeEnum(String value) {
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
        public static ArchitectureTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchitectureTypeEnum(value));
        }

        public static ArchitectureTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchitectureTypeEnum) {
                return this.value.equals(((ArchitectureTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture_type")

    private List<ArchitectureTypeEnum> architectureType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_requirements")

    private List<FlavorRequirement> flavorRequirements = null;

    public FlavorConstraint withArchitectureType(List<ArchitectureTypeEnum> architectureType) {
        this.architectureType = architectureType;
        return this;
    }

    public FlavorConstraint addArchitectureTypeItem(ArchitectureTypeEnum architectureTypeItem) {
        if (this.architectureType == null) {
            this.architectureType = new ArrayList<>();
        }
        this.architectureType.add(architectureTypeItem);
        return this;
    }

    public FlavorConstraint withArchitectureType(Consumer<List<ArchitectureTypeEnum>> architectureTypeSetter) {
        if (this.architectureType == null) {
            this.architectureType = new ArrayList<>();
        }
        architectureTypeSetter.accept(this.architectureType);
        return this;
    }

    /**
     * 接受的体系结构描述
     * @return architectureType
     */
    public List<ArchitectureTypeEnum> getArchitectureType() {
        return architectureType;
    }

    public void setArchitectureType(List<ArchitectureTypeEnum> architectureType) {
        this.architectureType = architectureType;
    }

    public FlavorConstraint withFlavorRequirements(List<FlavorRequirement> flavorRequirements) {
        this.flavorRequirements = flavorRequirements;
        return this;
    }

    public FlavorConstraint addFlavorRequirementsItem(FlavorRequirement flavorRequirementsItem) {
        if (this.flavorRequirements == null) {
            this.flavorRequirements = new ArrayList<>();
        }
        this.flavorRequirements.add(flavorRequirementsItem);
        return this;
    }

    public FlavorConstraint withFlavorRequirements(Consumer<List<FlavorRequirement>> flavorRequirementsSetter) {
        if (this.flavorRequirements == null) {
            this.flavorRequirements = new ArrayList<>();
        }
        flavorRequirementsSetter.accept(this.flavorRequirements);
        return this;
    }

    /**
     * 资源的需求约束
     * @return flavorRequirements
     */
    public List<FlavorRequirement> getFlavorRequirements() {
        return flavorRequirements;
    }

    public void setFlavorRequirements(List<FlavorRequirement> flavorRequirements) {
        this.flavorRequirements = flavorRequirements;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorConstraint that = (FlavorConstraint) obj;
        return Objects.equals(this.architectureType, that.architectureType)
            && Objects.equals(this.flavorRequirements, that.flavorRequirements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(architectureType, flavorRequirements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorConstraint {\n");
        sb.append("    architectureType: ").append(toIndentedString(architectureType)).append("\n");
        sb.append("    flavorRequirements: ").append(toIndentedString(flavorRequirements)).append("\n");
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
