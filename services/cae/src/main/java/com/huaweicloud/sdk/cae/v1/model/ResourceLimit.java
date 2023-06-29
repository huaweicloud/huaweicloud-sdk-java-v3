package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ResourceLimit
 */
public class ResourceLimit {

    /**
     * cpu限额。
     */
    public static final class CpuLimitEnum {

        /**
         * Enum _500M for value: "500m"
         */
        public static final CpuLimitEnum _500M = new CpuLimitEnum("500m");

        /**
         * Enum _1000M for value: "1000m"
         */
        public static final CpuLimitEnum _1000M = new CpuLimitEnum("1000m");

        /**
         * Enum _2000M for value: "2000m"
         */
        public static final CpuLimitEnum _2000M = new CpuLimitEnum("2000m");

        private static final Map<String, CpuLimitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CpuLimitEnum> createStaticFields() {
            Map<String, CpuLimitEnum> map = new HashMap<>();
            map.put("500m", _500M);
            map.put("1000m", _1000M);
            map.put("2000m", _2000M);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CpuLimitEnum(String value) {
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
        public static CpuLimitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CpuLimitEnum(value));
        }

        public static CpuLimitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CpuLimitEnum) {
                return this.value.equals(((CpuLimitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_limit")

    private CpuLimitEnum cpuLimit;

    /**
     * 内存限额。
     */
    public static final class MemoryLimitEnum {

        /**
         * Enum _1GI for value: "1Gi"
         */
        public static final MemoryLimitEnum _1GI = new MemoryLimitEnum("1Gi");

        /**
         * Enum _2GI for value: "2Gi"
         */
        public static final MemoryLimitEnum _2GI = new MemoryLimitEnum("2Gi");

        /**
         * Enum _4GI for value: "4Gi"
         */
        public static final MemoryLimitEnum _4GI = new MemoryLimitEnum("4Gi");

        private static final Map<String, MemoryLimitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MemoryLimitEnum> createStaticFields() {
            Map<String, MemoryLimitEnum> map = new HashMap<>();
            map.put("1Gi", _1GI);
            map.put("2Gi", _2GI);
            map.put("4Gi", _4GI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MemoryLimitEnum(String value) {
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
        public static MemoryLimitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MemoryLimitEnum(value));
        }

        public static MemoryLimitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MemoryLimitEnum) {
                return this.value.equals(((MemoryLimitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_limit")

    private MemoryLimitEnum memoryLimit;

    public ResourceLimit withCpuLimit(CpuLimitEnum cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * cpu限额。
     * @return cpuLimit
     */
    public CpuLimitEnum getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(CpuLimitEnum cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public ResourceLimit withMemoryLimit(MemoryLimitEnum memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }

    /**
     * 内存限额。
     * @return memoryLimit
     */
    public MemoryLimitEnum getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(MemoryLimitEnum memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLimit that = (ResourceLimit) obj;
        return Objects.equals(this.cpuLimit, that.cpuLimit) && Objects.equals(this.memoryLimit, that.memoryLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuLimit, memoryLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceLimit {\n");
        sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
        sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
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
