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
 * 规格信息
 */
public class RecommendFlavor {

    /**
     * 按照实例类型查询
     */
    public static final class TypeEnum {

        /**
         * Enum HA for value: "Ha"
         */
        public static final TypeEnum HA = new TypeEnum("Ha");

        /**
         * Enum SINGLE for value: "Single"
         */
        public static final TypeEnum SINGLE = new TypeEnum("Single");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Ha", HA);
            map.put("Single", SINGLE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_flavors")

    private List<VolumeFlavor> volumeFlavors = null;

    public RecommendFlavor withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 按照实例类型查询
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RecommendFlavor withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 规格码
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public RecommendFlavor withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU大小
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public RecommendFlavor withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 内存大小（单位：GB）
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public RecommendFlavor withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 规格类型
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public RecommendFlavor withVolumeFlavors(List<VolumeFlavor> volumeFlavors) {
        this.volumeFlavors = volumeFlavors;
        return this;
    }

    public RecommendFlavor addVolumeFlavorsItem(VolumeFlavor volumeFlavorsItem) {
        if (this.volumeFlavors == null) {
            this.volumeFlavors = new ArrayList<>();
        }
        this.volumeFlavors.add(volumeFlavorsItem);
        return this;
    }

    public RecommendFlavor withVolumeFlavors(Consumer<List<VolumeFlavor>> volumeFlavorsSetter) {
        if (this.volumeFlavors == null) {
            this.volumeFlavors = new ArrayList<>();
        }
        volumeFlavorsSetter.accept(this.volumeFlavors);
        return this;
    }

    /**
     * 磁盘规格信息
     * @return volumeFlavors
     */
    public List<VolumeFlavor> getVolumeFlavors() {
        return volumeFlavors;
    }

    public void setVolumeFlavors(List<VolumeFlavor> volumeFlavors) {
        this.volumeFlavors = volumeFlavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecommendFlavor that = (RecommendFlavor) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.groupType, that.groupType) && Objects.equals(this.volumeFlavors, that.volumeFlavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, flavorRef, cpu, mem, groupType, volumeFlavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecommendFlavor {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    volumeFlavors: ").append(toIndentedString(volumeFlavors)).append("\n");
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
