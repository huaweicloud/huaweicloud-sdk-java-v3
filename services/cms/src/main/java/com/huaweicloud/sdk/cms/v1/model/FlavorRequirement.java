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
 * 对规格的资源需求约束
 */
public class FlavorRequirement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpu_count")

    private IntegerRange vcpuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_mb")

    private IntegerRange memoryMb;

    /**
     * 
     */
    public static final class CpuManufacturersEnum {

        /**
         * Enum INTEL for value: "INTEL"
         */
        public static final CpuManufacturersEnum INTEL = new CpuManufacturersEnum("INTEL");

        /**
         * Enum AMD for value: "AMD"
         */
        public static final CpuManufacturersEnum AMD = new CpuManufacturersEnum("AMD");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final CpuManufacturersEnum OTHER = new CpuManufacturersEnum("OTHER");

        private static final Map<String, CpuManufacturersEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CpuManufacturersEnum> createStaticFields() {
            Map<String, CpuManufacturersEnum> map = new HashMap<>();
            map.put("INTEL", INTEL);
            map.put("AMD", AMD);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CpuManufacturersEnum(String value) {
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
        public static CpuManufacturersEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CpuManufacturersEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CpuManufacturersEnum(value);
            }
            return result;
        }

        public static CpuManufacturersEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CpuManufacturersEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CpuManufacturersEnum) {
                return this.value.equals(((CpuManufacturersEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_manufacturers")

    private List<CpuManufacturersEnum> cpuManufacturers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_gb_per_vcpu")

    private DoubleRange memoryGbPerVcpu;

    /**
     * 
     */
    public static final class InstanceGenerationsEnum {

        /**
         * Enum CURRENT for value: "CURRENT"
         */
        public static final InstanceGenerationsEnum CURRENT = new InstanceGenerationsEnum("CURRENT");

        /**
         * Enum PREVIOUS for value: "PREVIOUS"
         */
        public static final InstanceGenerationsEnum PREVIOUS = new InstanceGenerationsEnum("PREVIOUS");

        private static final Map<String, InstanceGenerationsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceGenerationsEnum> createStaticFields() {
            Map<String, InstanceGenerationsEnum> map = new HashMap<>();
            map.put("CURRENT", CURRENT);
            map.put("PREVIOUS", PREVIOUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceGenerationsEnum(String value) {
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
        public static InstanceGenerationsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InstanceGenerationsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstanceGenerationsEnum(value);
            }
            return result;
        }

        public static InstanceGenerationsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InstanceGenerationsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceGenerationsEnum) {
                return this.value.equals(((InstanceGenerationsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_generations")

    private List<InstanceGenerationsEnum> instanceGenerations = null;

    public FlavorRequirement withVcpuCount(IntegerRange vcpuCount) {
        this.vcpuCount = vcpuCount;
        return this;
    }

    public FlavorRequirement withVcpuCount(Consumer<IntegerRange> vcpuCountSetter) {
        if (this.vcpuCount == null) {
            this.vcpuCount = new IntegerRange();
            vcpuCountSetter.accept(this.vcpuCount);
        }

        return this;
    }

    /**
     * Get vcpuCount
     * @return vcpuCount
     */
    public IntegerRange getVcpuCount() {
        return vcpuCount;
    }

    public void setVcpuCount(IntegerRange vcpuCount) {
        this.vcpuCount = vcpuCount;
    }

    public FlavorRequirement withMemoryMb(IntegerRange memoryMb) {
        this.memoryMb = memoryMb;
        return this;
    }

    public FlavorRequirement withMemoryMb(Consumer<IntegerRange> memoryMbSetter) {
        if (this.memoryMb == null) {
            this.memoryMb = new IntegerRange();
            memoryMbSetter.accept(this.memoryMb);
        }

        return this;
    }

    /**
     * Get memoryMb
     * @return memoryMb
     */
    public IntegerRange getMemoryMb() {
        return memoryMb;
    }

    public void setMemoryMb(IntegerRange memoryMb) {
        this.memoryMb = memoryMb;
    }

    public FlavorRequirement withCpuManufacturers(List<CpuManufacturersEnum> cpuManufacturers) {
        this.cpuManufacturers = cpuManufacturers;
        return this;
    }

    public FlavorRequirement addCpuManufacturersItem(CpuManufacturersEnum cpuManufacturersItem) {
        if (this.cpuManufacturers == null) {
            this.cpuManufacturers = new ArrayList<>();
        }
        this.cpuManufacturers.add(cpuManufacturersItem);
        return this;
    }

    public FlavorRequirement withCpuManufacturers(Consumer<List<CpuManufacturersEnum>> cpuManufacturersSetter) {
        if (this.cpuManufacturers == null) {
            this.cpuManufacturers = new ArrayList<>();
        }
        cpuManufacturersSetter.accept(this.cpuManufacturers);
        return this;
    }

    /**
     * 可选CPU制造商，不填表示接受所有
     * @return cpuManufacturers
     */
    public List<CpuManufacturersEnum> getCpuManufacturers() {
        return cpuManufacturers;
    }

    public void setCpuManufacturers(List<CpuManufacturersEnum> cpuManufacturers) {
        this.cpuManufacturers = cpuManufacturers;
    }

    public FlavorRequirement withMemoryGbPerVcpu(DoubleRange memoryGbPerVcpu) {
        this.memoryGbPerVcpu = memoryGbPerVcpu;
        return this;
    }

    public FlavorRequirement withMemoryGbPerVcpu(Consumer<DoubleRange> memoryGbPerVcpuSetter) {
        if (this.memoryGbPerVcpu == null) {
            this.memoryGbPerVcpu = new DoubleRange();
            memoryGbPerVcpuSetter.accept(this.memoryGbPerVcpu);
        }

        return this;
    }

    /**
     * Get memoryGbPerVcpu
     * @return memoryGbPerVcpu
     */
    public DoubleRange getMemoryGbPerVcpu() {
        return memoryGbPerVcpu;
    }

    public void setMemoryGbPerVcpu(DoubleRange memoryGbPerVcpu) {
        this.memoryGbPerVcpu = memoryGbPerVcpu;
    }

    public FlavorRequirement withInstanceGenerations(List<InstanceGenerationsEnum> instanceGenerations) {
        this.instanceGenerations = instanceGenerations;
        return this;
    }

    public FlavorRequirement addInstanceGenerationsItem(InstanceGenerationsEnum instanceGenerationsItem) {
        if (this.instanceGenerations == null) {
            this.instanceGenerations = new ArrayList<>();
        }
        this.instanceGenerations.add(instanceGenerationsItem);
        return this;
    }

    public FlavorRequirement withInstanceGenerations(
        Consumer<List<InstanceGenerationsEnum>> instanceGenerationsSetter) {
        if (this.instanceGenerations == null) {
            this.instanceGenerations = new ArrayList<>();
        }
        instanceGenerationsSetter.accept(this.instanceGenerations);
        return this;
    }

    /**
     * 接受的资源代系，不填表示接受所有
     * @return instanceGenerations
     */
    public List<InstanceGenerationsEnum> getInstanceGenerations() {
        return instanceGenerations;
    }

    public void setInstanceGenerations(List<InstanceGenerationsEnum> instanceGenerations) {
        this.instanceGenerations = instanceGenerations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlavorRequirement flavorRequirement = (FlavorRequirement) o;
        return Objects.equals(this.vcpuCount, flavorRequirement.vcpuCount)
            && Objects.equals(this.memoryMb, flavorRequirement.memoryMb)
            && Objects.equals(this.cpuManufacturers, flavorRequirement.cpuManufacturers)
            && Objects.equals(this.memoryGbPerVcpu, flavorRequirement.memoryGbPerVcpu)
            && Objects.equals(this.instanceGenerations, flavorRequirement.instanceGenerations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vcpuCount, memoryMb, cpuManufacturers, memoryGbPerVcpu, instanceGenerations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorRequirement {\n");
        sb.append("    vcpuCount: ").append(toIndentedString(vcpuCount)).append("\n");
        sb.append("    memoryMb: ").append(toIndentedString(memoryMb)).append("\n");
        sb.append("    cpuManufacturers: ").append(toIndentedString(cpuManufacturers)).append("\n");
        sb.append("    memoryGbPerVcpu: ").append(toIndentedString(memoryGbPerVcpu)).append("\n");
        sb.append("    instanceGenerations: ").append(toIndentedString(instanceGenerations)).append("\n");
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
