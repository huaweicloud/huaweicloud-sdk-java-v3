package com.huaweicloud.sdk.eihealth.v1.model;

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
 * 分子约束
 */
public class MoleculeConstraint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 属性约束类型
     */
    public static final class TypeEnum {

        /**
         * Enum BOOL for value: "bool"
         */
        public static final TypeEnum BOOL = new TypeEnum("bool");

        /**
         * Enum RANGE for value: "range"
         */
        public static final TypeEnum RANGE = new TypeEnum("range");

        /**
         * Enum STRUCT for value: "struct"
         */
        public static final TypeEnum STRUCT = new TypeEnum("struct");

        /**
         * Enum MINIMIZE for value: "minimize"
         */
        public static final TypeEnum MINIMIZE = new TypeEnum("minimize");

        /**
         * Enum MAXIMIZE for value: "maximize"
         */
        public static final TypeEnum MAXIMIZE = new TypeEnum("maximize");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("bool", BOOL);
            map.put("range", RANGE);
            map.put("struct", STRUCT);
            map.put("minimize", MINIMIZE);
            map.put("maximize", MAXIMIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bool")

    private Boolean bool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range")

    private List<Float> range = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "struct")

    private StructureConstraintParams struct;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quantiles")

    private List<Float> quantiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requirement")

    private Object requirement;

    public MoleculeConstraint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 属性名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MoleculeConstraint withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 属性约束类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public MoleculeConstraint withBool(Boolean bool) {
        this.bool = bool;
        return this;
    }

    /**
     * 属性约束类型bool的参数
     * @return bool
     */
    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public MoleculeConstraint withRange(List<Float> range) {
        this.range = range;
        return this;
    }

    public MoleculeConstraint addRangeItem(Float rangeItem) {
        if (this.range == null) {
            this.range = new ArrayList<>();
        }
        this.range.add(rangeItem);
        return this;
    }

    public MoleculeConstraint withRange(Consumer<List<Float>> rangeSetter) {
        if (this.range == null) {
            this.range = new ArrayList<>();
        }
        rangeSetter.accept(this.range);
        return this;
    }

    /**
     * 属性约束类型range的参数
     * @return range
     */
    public List<Float> getRange() {
        return range;
    }

    public void setRange(List<Float> range) {
        this.range = range;
    }

    public MoleculeConstraint withStruct(StructureConstraintParams struct) {
        this.struct = struct;
        return this;
    }

    public MoleculeConstraint withStruct(Consumer<StructureConstraintParams> structSetter) {
        if (this.struct == null) {
            this.struct = new StructureConstraintParams();
            structSetter.accept(this.struct);
        }

        return this;
    }

    /**
     * Get struct
     * @return struct
     */
    public StructureConstraintParams getStruct() {
        return struct;
    }

    public void setStruct(StructureConstraintParams struct) {
        this.struct = struct;
    }

    public MoleculeConstraint withQuantiles(List<Float> quantiles) {
        this.quantiles = quantiles;
        return this;
    }

    public MoleculeConstraint addQuantilesItem(Float quantilesItem) {
        if (this.quantiles == null) {
            this.quantiles = new ArrayList<>();
        }
        this.quantiles.add(quantilesItem);
        return this;
    }

    public MoleculeConstraint withQuantiles(Consumer<List<Float>> quantilesSetter) {
        if (this.quantiles == null) {
            this.quantiles = new ArrayList<>();
        }
        quantilesSetter.accept(this.quantiles);
        return this;
    }

    /**
     * 属性约束类型minimize和maximize的参数
     * @return quantiles
     */
    public List<Float> getQuantiles() {
        return quantiles;
    }

    public void setQuantiles(List<Float> quantiles) {
        this.quantiles = quantiles;
    }

    public MoleculeConstraint withRequirement(Object requirement) {
        this.requirement = requirement;
        return this;
    }

    /**
     * 属性约束参数
     * @return requirement
     */
    public Object getRequirement() {
        return requirement;
    }

    public void setRequirement(Object requirement) {
        this.requirement = requirement;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MoleculeConstraint moleculeConstraint = (MoleculeConstraint) o;
        return Objects.equals(this.name, moleculeConstraint.name) && Objects.equals(this.type, moleculeConstraint.type)
            && Objects.equals(this.bool, moleculeConstraint.bool)
            && Objects.equals(this.range, moleculeConstraint.range)
            && Objects.equals(this.struct, moleculeConstraint.struct)
            && Objects.equals(this.quantiles, moleculeConstraint.quantiles)
            && Objects.equals(this.requirement, moleculeConstraint.requirement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, bool, range, struct, quantiles, requirement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoleculeConstraint {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    struct: ").append(toIndentedString(struct)).append("\n");
        sb.append("    quantiles: ").append(toIndentedString(quantiles)).append("\n");
        sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
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
