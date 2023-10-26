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
 * Request Object
 */
public class ListInstancesInfoDiagnosisRequest {

    /**
     * 引擎类型
     */
    public static final class EngineEnum {

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EngineEnum MYSQL = new EngineEnum("mysql");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final EngineEnum POSTGRESQL = new EngineEnum("postgresql");

        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final EngineEnum SQLSERVER = new EngineEnum("sqlserver");

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("postgresql", POSTGRESQL);
            map.put("sqlserver", SQLSERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineEnum(String value) {
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
        public static EngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineEnum(value));
        }

        public static EngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private EngineEnum engine;

    /**
     * 诊断项
     */
    public static final class DiagnosisEnum {

        /**
         * Enum HIGH_PRESSURE for value: "high_pressure"
         */
        public static final DiagnosisEnum HIGH_PRESSURE = new DiagnosisEnum("high_pressure");

        /**
         * Enum LOCK_WAIT for value: "lock_wait"
         */
        public static final DiagnosisEnum LOCK_WAIT = new DiagnosisEnum("lock_wait");

        /**
         * Enum INSUFFICIENT_CAPACITY for value: "insufficient_capacity"
         */
        public static final DiagnosisEnum INSUFFICIENT_CAPACITY = new DiagnosisEnum("insufficient_capacity");

        /**
         * Enum SLOW_SQL_FREQUENCY for value: "slow_sql_frequency"
         */
        public static final DiagnosisEnum SLOW_SQL_FREQUENCY = new DiagnosisEnum("slow_sql_frequency");

        /**
         * Enum DISK_PERFORMANCE_CAP for value: "disk_performance_cap"
         */
        public static final DiagnosisEnum DISK_PERFORMANCE_CAP = new DiagnosisEnum("disk_performance_cap");

        /**
         * Enum MEM_OVERRUN for value: "mem_overrun"
         */
        public static final DiagnosisEnum MEM_OVERRUN = new DiagnosisEnum("mem_overrun");

        /**
         * Enum AGE_EXCEED for value: "age_exceed"
         */
        public static final DiagnosisEnum AGE_EXCEED = new DiagnosisEnum("age_exceed");

        /**
         * Enum CONNECTIONS_EXCEED for value: "connections_exceed"
         */
        public static final DiagnosisEnum CONNECTIONS_EXCEED = new DiagnosisEnum("connections_exceed");

        private static final Map<String, DiagnosisEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DiagnosisEnum> createStaticFields() {
            Map<String, DiagnosisEnum> map = new HashMap<>();
            map.put("high_pressure", HIGH_PRESSURE);
            map.put("lock_wait", LOCK_WAIT);
            map.put("insufficient_capacity", INSUFFICIENT_CAPACITY);
            map.put("slow_sql_frequency", SLOW_SQL_FREQUENCY);
            map.put("disk_performance_cap", DISK_PERFORMANCE_CAP);
            map.put("mem_overrun", MEM_OVERRUN);
            map.put("age_exceed", AGE_EXCEED);
            map.put("connections_exceed", CONNECTIONS_EXCEED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DiagnosisEnum(String value) {
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
        public static DiagnosisEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DiagnosisEnum(value));
        }

        public static DiagnosisEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DiagnosisEnum) {
                return this.value.equals(((DiagnosisEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis")

    private DiagnosisEnum diagnosis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListInstancesInfoDiagnosisRequest withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 引擎类型
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public ListInstancesInfoDiagnosisRequest withDiagnosis(DiagnosisEnum diagnosis) {
        this.diagnosis = diagnosis;
        return this;
    }

    /**
     * 诊断项
     * @return diagnosis
     */
    public DiagnosisEnum getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(DiagnosisEnum diagnosis) {
        this.diagnosis = diagnosis;
    }

    public ListInstancesInfoDiagnosisRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListInstancesInfoDiagnosisRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesInfoDiagnosisRequest that = (ListInstancesInfoDiagnosisRequest) obj;
        return Objects.equals(this.engine, that.engine) && Objects.equals(this.diagnosis, that.diagnosis)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, diagnosis, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesInfoDiagnosisRequest {\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    diagnosis: ").append(toIndentedString(diagnosis)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
