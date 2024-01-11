package com.huaweicloud.sdk.drs.v5.model;

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
 * 可用链路返回体。
 */
public class JobLinkResp {

    /**
     * 任务场景。取值： - migration：实时迁移。 - sync：实时同步。 - cloudDataGuard：实时灾备。
     */
    public static final class JobTypeEnum {

        /**
         * Enum MIGRATION for value: "migration"
         */
        public static final JobTypeEnum MIGRATION = new JobTypeEnum("migration");

        /**
         * Enum SYNC for value: "sync"
         */
        public static final JobTypeEnum SYNC = new JobTypeEnum("sync");

        /**
         * Enum CLOUDDATAGUARD for value: "cloudDataGuard"
         */
        public static final JobTypeEnum CLOUDDATAGUARD = new JobTypeEnum("cloudDataGuard");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("migration", MIGRATION);
            map.put("sync", SYNC);
            map.put("cloudDataGuard", CLOUDDATAGUARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTypeEnum(value));
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobTypeEnum jobType;

    /**
     * 引擎类型。取值： - oracle-to-gaussdbv5：Oracle同步到GaussDB分布式版，实时同步场景使用。 - redis-to-gaussredis：Redis同步到GeminiDB Redis，实时迁移场景使用。 - rediscluster-to-gaussredis：Redis集群同步到GeminiDB Redis，实时迁移场景使用。
     */
    public static final class EngineTypeEnum {

        /**
         * Enum ORACLE_TO_GAUSSDBV5 for value: "oracle-to-gaussdbv5"
         */
        public static final EngineTypeEnum ORACLE_TO_GAUSSDBV5 = new EngineTypeEnum("oracle-to-gaussdbv5");

        /**
         * Enum REDIS_TO_GAUSSREDIS for value: "redis-to-gaussredis"
         */
        public static final EngineTypeEnum REDIS_TO_GAUSSREDIS = new EngineTypeEnum("redis-to-gaussredis");

        /**
         * Enum REDISCLUSTER_TO_GAUSSREDIS for value: "rediscluster-to-gaussredis"
         */
        public static final EngineTypeEnum REDISCLUSTER_TO_GAUSSREDIS =
            new EngineTypeEnum("rediscluster-to-gaussredis");

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("oracle-to-gaussdbv5", ORACLE_TO_GAUSSDBV5);
            map.put("redis-to-gaussredis", REDIS_TO_GAUSSREDIS);
            map.put("rediscluster-to-gaussredis", REDISCLUSTER_TO_GAUSSREDIS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineTypeEnum(String value) {
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
        public static EngineTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineTypeEnum(value));
        }

        public static EngineTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineTypeEnum) {
                return this.value.equals(((EngineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private EngineTypeEnum engineType;

    /**
     * 源数据库实例类型。取值： - offline：自建数据库。 - ecs：华为云ECS自建数据库。 - cloud：华为云数据库。
     */
    public static final class SourceEndpointTypeEnum {

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final SourceEndpointTypeEnum OFFLINE = new SourceEndpointTypeEnum("offline");

        /**
         * Enum ECS for value: "ecs"
         */
        public static final SourceEndpointTypeEnum ECS = new SourceEndpointTypeEnum("ecs");

        /**
         * Enum CLOUD for value: "cloud"
         */
        public static final SourceEndpointTypeEnum CLOUD = new SourceEndpointTypeEnum("cloud");

        private static final Map<String, SourceEndpointTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceEndpointTypeEnum> createStaticFields() {
            Map<String, SourceEndpointTypeEnum> map = new HashMap<>();
            map.put("offline", OFFLINE);
            map.put("ecs", ECS);
            map.put("cloud", CLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceEndpointTypeEnum(String value) {
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
        public static SourceEndpointTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceEndpointTypeEnum(value));
        }

        public static SourceEndpointTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceEndpointTypeEnum) {
                return this.value.equals(((SourceEndpointTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_endpoint_type")

    private SourceEndpointTypeEnum sourceEndpointType;

    /**
     * 目标数据库实例类型。取值： - offline：自建数据库。 - ecs：华为云ECS自建数据库。 - cloud：华为云数据库。
     */
    public static final class TargetEndpointTypeEnum {

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final TargetEndpointTypeEnum OFFLINE = new TargetEndpointTypeEnum("offline");

        /**
         * Enum ECS for value: "ecs"
         */
        public static final TargetEndpointTypeEnum ECS = new TargetEndpointTypeEnum("ecs");

        /**
         * Enum CLOUD for value: "cloud"
         */
        public static final TargetEndpointTypeEnum CLOUD = new TargetEndpointTypeEnum("cloud");

        private static final Map<String, TargetEndpointTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetEndpointTypeEnum> createStaticFields() {
            Map<String, TargetEndpointTypeEnum> map = new HashMap<>();
            map.put("offline", OFFLINE);
            map.put("ecs", ECS);
            map.put("cloud", CLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetEndpointTypeEnum(String value) {
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
        public static TargetEndpointTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetEndpointTypeEnum(value));
        }

        public static TargetEndpointTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetEndpointTypeEnum) {
                return this.value.equals(((TargetEndpointTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_endpoint_type")

    private TargetEndpointTypeEnum targetEndpointType;

    /**
     * 迁移方向。取值： - up：入云 ，灾备场景时对应本云为备。 - down：出云，灾备场景时对应本云为主。 - non-dbs：自建。
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

    /**
     * 网络类型。取值： - eip：公网网络。 - vpc：VPC网络，灾备场景不支持选择VPC网络。 - vpn：VPN、专线网络。
     */
    public static final class NetTypeEnum {

        /**
         * Enum EIP for value: "eip"
         */
        public static final NetTypeEnum EIP = new NetTypeEnum("eip");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetTypeEnum VPC = new NetTypeEnum("vpc");

        /**
         * Enum VPN for value: "vpn"
         */
        public static final NetTypeEnum VPN = new NetTypeEnum("vpn");

        private static final Map<String, NetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetTypeEnum> createStaticFields() {
            Map<String, NetTypeEnum> map = new HashMap<>();
            map.put("eip", EIP);
            map.put("vpc", VPC);
            map.put("vpn", VPN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetTypeEnum(String value) {
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
        public static NetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetTypeEnum(value));
        }

        public static NetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetTypeEnum) {
                return this.value.equals(((NetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_type")

    private NetTypeEnum netType;

    /**
     * Gets or Sets taskTypes
     */
    public static final class TaskTypesEnum {

        /**
         * Enum FULL_TRANS for value: "FULL_TRANS"
         */
        public static final TaskTypesEnum FULL_TRANS = new TaskTypesEnum("FULL_TRANS");

        /**
         * Enum FULL_INCR_TRANS for value: "FULL_INCR_TRANS"
         */
        public static final TaskTypesEnum FULL_INCR_TRANS = new TaskTypesEnum("FULL_INCR_TRANS");

        /**
         * Enum INCR_TRANS for value: "INCR_TRANS"
         */
        public static final TaskTypesEnum INCR_TRANS = new TaskTypesEnum("INCR_TRANS");

        private static final Map<String, TaskTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypesEnum> createStaticFields() {
            Map<String, TaskTypesEnum> map = new HashMap<>();
            map.put("FULL_TRANS", FULL_TRANS);
            map.put("FULL_INCR_TRANS", FULL_INCR_TRANS);
            map.put("INCR_TRANS", INCR_TRANS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypesEnum(String value) {
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
        public static TaskTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskTypesEnum(value));
        }

        public static TaskTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskTypesEnum) {
                return this.value.equals(((TaskTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_types")

    private List<TaskTypesEnum> taskTypes = null;

    /**
     * Gets or Sets clusterModes
     */
    public static final class ClusterModesEnum {

        /**
         * Enum SINGLE for value: "Single"
         */
        public static final ClusterModesEnum SINGLE = new ClusterModesEnum("Single");

        /**
         * Enum HA for value: "Ha"
         */
        public static final ClusterModesEnum HA = new ClusterModesEnum("Ha");

        /**
         * Enum CLUSTER for value: "Cluster"
         */
        public static final ClusterModesEnum CLUSTER = new ClusterModesEnum("Cluster");

        /**
         * Enum SHARDING for value: "Sharding"
         */
        public static final ClusterModesEnum SHARDING = new ClusterModesEnum("Sharding");

        /**
         * Enum INDEPENDENT for value: "Independent"
         */
        public static final ClusterModesEnum INDEPENDENT = new ClusterModesEnum("Independent");

        private static final Map<String, ClusterModesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterModesEnum> createStaticFields() {
            Map<String, ClusterModesEnum> map = new HashMap<>();
            map.put("Single", SINGLE);
            map.put("Ha", HA);
            map.put("Cluster", CLUSTER);
            map.put("Sharding", SHARDING);
            map.put("Independent", INDEPENDENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterModesEnum(String value) {
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
        public static ClusterModesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusterModesEnum(value));
        }

        public static ClusterModesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterModesEnum) {
                return this.value.equals(((ClusterModesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_modes")

    private List<ClusterModesEnum> clusterModes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public JobLinkResp withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务场景。取值： - migration：实时迁移。 - sync：实时同步。 - cloudDataGuard：实时灾备。
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public JobLinkResp withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型。取值： - oracle-to-gaussdbv5：Oracle同步到GaussDB分布式版，实时同步场景使用。 - redis-to-gaussredis：Redis同步到GeminiDB Redis，实时迁移场景使用。 - rediscluster-to-gaussredis：Redis集群同步到GeminiDB Redis，实时迁移场景使用。
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public JobLinkResp withSourceEndpointType(SourceEndpointTypeEnum sourceEndpointType) {
        this.sourceEndpointType = sourceEndpointType;
        return this;
    }

    /**
     * 源数据库实例类型。取值： - offline：自建数据库。 - ecs：华为云ECS自建数据库。 - cloud：华为云数据库。
     * @return sourceEndpointType
     */
    public SourceEndpointTypeEnum getSourceEndpointType() {
        return sourceEndpointType;
    }

    public void setSourceEndpointType(SourceEndpointTypeEnum sourceEndpointType) {
        this.sourceEndpointType = sourceEndpointType;
    }

    public JobLinkResp withTargetEndpointType(TargetEndpointTypeEnum targetEndpointType) {
        this.targetEndpointType = targetEndpointType;
        return this;
    }

    /**
     * 目标数据库实例类型。取值： - offline：自建数据库。 - ecs：华为云ECS自建数据库。 - cloud：华为云数据库。
     * @return targetEndpointType
     */
    public TargetEndpointTypeEnum getTargetEndpointType() {
        return targetEndpointType;
    }

    public void setTargetEndpointType(TargetEndpointTypeEnum targetEndpointType) {
        this.targetEndpointType = targetEndpointType;
    }

    public JobLinkResp withJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 迁移方向。取值： - up：入云 ，灾备场景时对应本云为备。 - down：出云，灾备场景时对应本云为主。 - non-dbs：自建。
     * @return jobDirection
     */
    public JobDirectionEnum getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
    }

    public JobLinkResp withNetType(NetTypeEnum netType) {
        this.netType = netType;
        return this;
    }

    /**
     * 网络类型。取值： - eip：公网网络。 - vpc：VPC网络，灾备场景不支持选择VPC网络。 - vpn：VPN、专线网络。
     * @return netType
     */
    public NetTypeEnum getNetType() {
        return netType;
    }

    public void setNetType(NetTypeEnum netType) {
        this.netType = netType;
    }

    public JobLinkResp withTaskTypes(List<TaskTypesEnum> taskTypes) {
        this.taskTypes = taskTypes;
        return this;
    }

    public JobLinkResp addTaskTypesItem(TaskTypesEnum taskTypesItem) {
        if (this.taskTypes == null) {
            this.taskTypes = new ArrayList<>();
        }
        this.taskTypes.add(taskTypesItem);
        return this;
    }

    public JobLinkResp withTaskTypes(Consumer<List<TaskTypesEnum>> taskTypesSetter) {
        if (this.taskTypes == null) {
            this.taskTypes = new ArrayList<>();
        }
        taskTypesSetter.accept(this.taskTypes);
        return this;
    }

    /**
     * 迁移模式。取值： - FULL_TRANS ：全量。 - FULL_INCR_TRANS：全量+增量。 - INCR_TRANS：增量。
     * @return taskTypes
     */
    public List<TaskTypesEnum> getTaskTypes() {
        return taskTypes;
    }

    public void setTaskTypes(List<TaskTypesEnum> taskTypes) {
        this.taskTypes = taskTypes;
    }

    public JobLinkResp withClusterModes(List<ClusterModesEnum> clusterModes) {
        this.clusterModes = clusterModes;
        return this;
    }

    public JobLinkResp addClusterModesItem(ClusterModesEnum clusterModesItem) {
        if (this.clusterModes == null) {
            this.clusterModes = new ArrayList<>();
        }
        this.clusterModes.add(clusterModesItem);
        return this;
    }

    public JobLinkResp withClusterModes(Consumer<List<ClusterModesEnum>> clusterModesSetter) {
        if (this.clusterModes == null) {
            this.clusterModes = new ArrayList<>();
        }
        clusterModesSetter.accept(this.clusterModes);
        return this;
    }

    /**
     * 引擎实例模式。取值： - Single：单机模式。 - Ha：主备模式。 - Cluster：集群模式。 - Sharding：分片模式。 - Independent：GaussDB独立部署模式。
     * @return clusterModes
     */
    public List<ClusterModesEnum> getClusterModes() {
        return clusterModes;
    }

    public void setClusterModes(List<ClusterModesEnum> clusterModes) {
        this.clusterModes = clusterModes;
    }

    public JobLinkResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 链路描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobLinkResp that = (JobLinkResp) obj;
        return Objects.equals(this.jobType, that.jobType) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.sourceEndpointType, that.sourceEndpointType)
            && Objects.equals(this.targetEndpointType, that.targetEndpointType)
            && Objects.equals(this.jobDirection, that.jobDirection) && Objects.equals(this.netType, that.netType)
            && Objects.equals(this.taskTypes, that.taskTypes) && Objects.equals(this.clusterModes, that.clusterModes)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobType,
            engineType,
            sourceEndpointType,
            targetEndpointType,
            jobDirection,
            netType,
            taskTypes,
            clusterModes,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobLinkResp {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    sourceEndpointType: ").append(toIndentedString(sourceEndpointType)).append("\n");
        sb.append("    targetEndpointType: ").append(toIndentedString(targetEndpointType)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    taskTypes: ").append(toIndentedString(taskTypes)).append("\n");
        sb.append("    clusterModes: ").append(toIndentedString(clusterModes)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
