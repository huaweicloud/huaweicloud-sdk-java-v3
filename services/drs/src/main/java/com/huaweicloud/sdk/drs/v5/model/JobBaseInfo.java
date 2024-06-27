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
 * 创建任务基本信息体。
 */
public class JobBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_write")

    private Boolean multiWrite;

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
     * 迁移模式。取值： - FULL_TRANS ：全量。 - FULL_INCR_TRANS：全量+增量。 - INCR_TRANS：增量。
     */
    public static final class TaskTypeEnum {

        /**
         * Enum FULL_TRANS for value: "FULL_TRANS"
         */
        public static final TaskTypeEnum FULL_TRANS = new TaskTypeEnum("FULL_TRANS");

        /**
         * Enum FULL_INCR_TRANS for value: "FULL_INCR_TRANS"
         */
        public static final TaskTypeEnum FULL_INCR_TRANS = new TaskTypeEnum("FULL_INCR_TRANS");

        /**
         * Enum INCR_TRANS for value: "INCR_TRANS"
         */
        public static final TaskTypeEnum INCR_TRANS = new TaskTypeEnum("INCR_TRANS");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("FULL_TRANS", FULL_TRANS);
            map.put("FULL_INCR_TRANS", FULL_INCR_TRANS);
            map.put("INCR_TRANS", INCR_TRANS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
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
        public static TaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskTypeEnum(value));
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private TaskTypeEnum taskType;

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
     * 计费模式，默认按需。取值： - period：包周期。 - on_demand：按需。
     */
    public static final class ChargingModeEnum {

        /**
         * Enum PERIOD for value: "period"
         */
        public static final ChargingModeEnum PERIOD = new ChargingModeEnum("period");

        /**
         * Enum ON_DEMAND for value: "on_demand"
         */
        public static final ChargingModeEnum ON_DEMAND = new ChargingModeEnum("on_demand");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("period", PERIOD);
            map.put("on_demand", ON_DEMAND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_days")

    private String expiredDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open_fast_clean")

    private Boolean isOpenFastClean;

    public JobBaseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称。 约束：任务名称在4位到50位之间，不区分大小写，可以包含字母、数字、中划线或下划线，不能包括其他特殊字符。 - 最小长度：4 - 最大长度：50
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobBaseInfo withJobType(JobTypeEnum jobType) {
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

    public JobBaseInfo withMultiWrite(Boolean multiWrite) {
        this.multiWrite = multiWrite;
        return this;
    }

    /**
     * 灾备类型是否双主灾备。说明： - job_type 是cloudDataGuard时，必填，灾备类型是双主灾备时，multi_write取值true, 否则为false。 - job_type 是其他类型时，multi_write是非必选参数。
     * @return multiWrite
     */
    public Boolean getMultiWrite() {
        return multiWrite;
    }

    public void setMultiWrite(Boolean multiWrite) {
        this.multiWrite = multiWrite;
    }

    public JobBaseInfo withEngineType(EngineTypeEnum engineType) {
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

    public JobBaseInfo withJobDirection(JobDirectionEnum jobDirection) {
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

    public JobBaseInfo withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 迁移模式。取值： - FULL_TRANS ：全量。 - FULL_INCR_TRANS：全量+增量。 - INCR_TRANS：增量。
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public JobBaseInfo withNetType(NetTypeEnum netType) {
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

    public JobBaseInfo withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式，默认按需。取值： - period：包周期。 - on_demand：按需。
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public JobBaseInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 缺省值：\"0\"，表示\"default\"企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public JobBaseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述。 约束：任务描述不能超过256位，且不能包含!<>&'\"\\特殊字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobBaseInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务定时启动时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public JobBaseInfo withExpiredDays(String expiredDays) {
        this.expiredDays = expiredDays;
        return this;
    }

    /**
     * 任务处于异常状态一段时间后，将会自动结束。单位为天。(范围14-100)，不传默认为14天。
     * @return expiredDays
     */
    public String getExpiredDays() {
        return expiredDays;
    }

    public void setExpiredDays(String expiredDays) {
        this.expiredDays = expiredDays;
    }

    public JobBaseInfo withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public JobBaseInfo addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public JobBaseInfo withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息，最多添加10个标签。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public JobBaseInfo withIsOpenFastClean(Boolean isOpenFastClean) {
        this.isOpenFastClean = isOpenFastClean;
        return this;
    }

    /**
     * 是否开启云数据库RDS for MySQL/MariaDB的binlog快速清理。
     * @return isOpenFastClean
     */
    public Boolean getIsOpenFastClean() {
        return isOpenFastClean;
    }

    public void setIsOpenFastClean(Boolean isOpenFastClean) {
        this.isOpenFastClean = isOpenFastClean;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobBaseInfo that = (JobBaseInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.multiWrite, that.multiWrite) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.jobDirection, that.jobDirection) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.netType, that.netType) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.expiredDays, that.expiredDays) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.isOpenFastClean, that.isOpenFastClean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            jobType,
            multiWrite,
            engineType,
            jobDirection,
            taskType,
            netType,
            chargingMode,
            enterpriseProjectId,
            description,
            startTime,
            expiredDays,
            tags,
            isOpenFastClean);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobBaseInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    multiWrite: ").append(toIndentedString(multiWrite)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    expiredDays: ").append(toIndentedString(expiredDays)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    isOpenFastClean: ").append(toIndentedString(isOpenFastClean)).append("\n");
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
