package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 查询可用的AZ请求
 */
public class QueryAvailableNodeTypeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    /**
     * 迁移场景 migration实时迁移，sync实时同步，dataGuard实时灾备，subscription实时订阅，replay流量回放
     */
    public static final class DbUseTypeEnum {

        /**
         * Enum MIGRATION for value: "migration"
         */
        public static final DbUseTypeEnum MIGRATION = new DbUseTypeEnum("migration");

        /**
         * Enum SYNC for value: "sync"
         */
        public static final DbUseTypeEnum SYNC = new DbUseTypeEnum("sync");

        /**
         * Enum CLOUDDATAGUARD for value: "cloudDataGuard"
         */
        public static final DbUseTypeEnum CLOUDDATAGUARD = new DbUseTypeEnum("cloudDataGuard");

        private static final Map<String, DbUseTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbUseTypeEnum> createStaticFields() {
            Map<String, DbUseTypeEnum> map = new HashMap<>();
            map.put("migration", MIGRATION);
            map.put("sync", SYNC);
            map.put("cloudDataGuard", CLOUDDATAGUARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DbUseTypeEnum(String value) {
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
        public static DbUseTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DbUseTypeEnum(value));
        }

        public static DbUseTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DbUseTypeEnum) {
                return this.value.equals(((DbUseTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_use_type")

    private DbUseTypeEnum dbUseType;

    /**
     * 迁移方向，up ：入云 ，灾备场景时对应本云为备，down：出云，灾备场景时对应本云为主，non-dbs：自建
     */
    public static final class JobDirectionEnum {

        /**
         * Enum UP for value: "up"
         */
        public static final JobDirectionEnum UP = new JobDirectionEnum("up");

        /**
         * Enum DOWN for value: "down"
         */
        public static final JobDirectionEnum DOWN = new JobDirectionEnum("down");

        /**
         * Enum NON_DBS for value: "non-dbs"
         */
        public static final JobDirectionEnum NON_DBS = new JobDirectionEnum("non-dbs");

        private static final Map<String, JobDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobDirectionEnum> createStaticFields() {
            Map<String, JobDirectionEnum> map = new HashMap<>();
            map.put("up", UP);
            map.put("down", DOWN);
            map.put("non-dbs", NON_DBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobDirectionEnum(String value) {
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
        public static JobDirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobDirectionEnum(value));
        }

        public static JobDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobDirectionEnum) {
                return this.value.equals(((JobDirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_direction")

    private JobDirectionEnum jobDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_write")

    private String multiWrite;

    public QueryAvailableNodeTypeReq withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public QueryAvailableNodeTypeReq withDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
        return this;
    }

    /**
     * 迁移场景 migration实时迁移，sync实时同步，dataGuard实时灾备，subscription实时订阅，replay流量回放
     * @return dbUseType
     */
    public DbUseTypeEnum getDbUseType() {
        return dbUseType;
    }

    public void setDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
    }

    public QueryAvailableNodeTypeReq withJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 迁移方向，up ：入云 ，灾备场景时对应本云为备，down：出云，灾备场景时对应本云为主，non-dbs：自建
     * @return jobDirection
     */
    public JobDirectionEnum getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
    }

    public QueryAvailableNodeTypeReq withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 规格类型。 micro：极小，small：小，medium：中，high：高，xlarge：超高，2xlarge：极高
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public QueryAvailableNodeTypeReq withMultiWrite(String multiWrite) {
        this.multiWrite = multiWrite;
        return this;
    }

    /**
     * 是否是双主灾备，不填默认为false
     * @return multiWrite
     */
    public String getMultiWrite() {
        return multiWrite;
    }

    public void setMultiWrite(String multiWrite) {
        this.multiWrite = multiWrite;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryAvailableNodeTypeReq that = (QueryAvailableNodeTypeReq) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.dbUseType, that.dbUseType)
            && Objects.equals(this.jobDirection, that.jobDirection) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.multiWrite, that.multiWrite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, dbUseType, jobDirection, nodeType, multiWrite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAvailableNodeTypeReq {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    dbUseType: ").append(toIndentedString(dbUseType)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    multiWrite: ").append(toIndentedString(multiWrite)).append("\n");
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
