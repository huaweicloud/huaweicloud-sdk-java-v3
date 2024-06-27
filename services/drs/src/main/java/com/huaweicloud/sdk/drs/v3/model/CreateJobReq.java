package com.huaweicloud.sdk.drs.v3.model;

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
 * 创建任务请求体
 */
public class CreateJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_eip")

    private Boolean bindEip;

    /**
     * 迁移场景，migration-实时迁移,sync-实时同步,cloudDataGuard-实时灾备
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 引擎类型 - mysql：MySQL到MySQL迁移，MySQL到MySQL同步 - mongodb：MongoDB到DDS迁移 - cloudDataGuard-mysql：MySQL到MySQL灾备 - gaussdbv5：GaussDB同步 - mysql-to-kafka：MySQL到Kafka同步 - taurus-to-kafka：GaussDB(for MySQL)到Kafka同步 - gaussdbv5ha-to-kafka：GaussDB主备版到Kafka同步 - postgresql：PostgreSQL到PostgreSQL同步
     */
    public static final class EngineTypeEnum {

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EngineTypeEnum MYSQL = new EngineTypeEnum("mysql");

        /**
         * Enum MONGODB for value: "mongodb"
         */
        public static final EngineTypeEnum MONGODB = new EngineTypeEnum("mongodb");

        /**
         * Enum CLOUDDATAGUARD_MYSQL for value: "cloudDataGuard-mysql"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_MYSQL = new EngineTypeEnum("cloudDataGuard-mysql");

        /**
         * Enum GAUSSDBV5 for value: "gaussdbv5"
         */
        public static final EngineTypeEnum GAUSSDBV5 = new EngineTypeEnum("gaussdbv5");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final EngineTypeEnum POSTGRESQL = new EngineTypeEnum("postgresql");

        /**
         * Enum MYSQL_TO_KAFKA for value: "mysql-to-kafka"
         */
        public static final EngineTypeEnum MYSQL_TO_KAFKA = new EngineTypeEnum("mysql-to-kafka");

        /**
         * Enum TAURUS_TO_KAFKA for value: "taurus-to-kafka"
         */
        public static final EngineTypeEnum TAURUS_TO_KAFKA = new EngineTypeEnum("taurus-to-kafka");

        /**
         * Enum GAUSSDBV5HA_TO_KAFKA for value: "gaussdbv5ha-to-kafka"
         */
        public static final EngineTypeEnum GAUSSDBV5HA_TO_KAFKA = new EngineTypeEnum("gaussdbv5ha-to-kafka");

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("mongodb", MONGODB);
            map.put("cloudDataGuard-mysql", CLOUDDATAGUARD_MYSQL);
            map.put("gaussdbv5", GAUSSDBV5);
            map.put("postgresql", POSTGRESQL);
            map.put("mysql-to-kafka", MYSQL_TO_KAFKA);
            map.put("taurus-to-kafka", TAURUS_TO_KAFKA);
            map.put("gaussdbv5ha-to-kafka", GAUSSDBV5HA_TO_KAFKA);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_target_readonly")

    private Boolean isTargetReadonly;

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
    @JsonProperty(value = "multi_write")

    private Boolean multiWrite;

    /**
     * 网络类型
     */
    public static final class NetTypeEnum {

        /**
         * Enum VPN for value: "vpn"
         */
        public static final NetTypeEnum VPN = new NetTypeEnum("vpn");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetTypeEnum VPC = new NetTypeEnum("vpc");

        /**
         * Enum EIP for value: "eip"
         */
        public static final NetTypeEnum EIP = new NetTypeEnum("eip");

        private static final Map<String, NetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetTypeEnum> createStaticFields() {
            Map<String, NetTypeEnum> map = new HashMap<>();
            map.put("vpn", VPN);
            map.put("vpc", VPC);
            map.put("eip", EIP);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    /**
     * 规格类型。
     */
    public static final class NodeTypeEnum {

        /**
         * Enum HIGH for value: "high"
         */
        public static final NodeTypeEnum HIGH = new NodeTypeEnum("high");

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("high", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeTypeEnum(String value) {
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
        public static NodeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeTypeEnum(value));
        }

        public static NodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodeTypeEnum) {
                return this.value.equals(((NodeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private NodeTypeEnum nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_endpoint")

    private Endpoint sourceEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_endpoint")

    private Endpoint targetEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    /**
     * 迁移模式，FULL_TRANS 全量,FULL_INCR_TRANS 全量+增量,INCR_TRANS 增量，灾备场景单主灾备仅支持全量加增量（FULL_INCR_TRANS）
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customize_sutnet_id")

    private String customizeSutnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<ResourceTag> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_days")

    private String expiredDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_az")

    private String masterAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_az")

    private String slaveAz;

    /**
     * 计费模式，不填默认为按需计费。 取值范围： - period：包年包月。 - on_demand：按需计费。
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
    @JsonProperty(value = "period_order")

    private PeriodOrderInfo periodOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_list")

    private List<PublicIpConfig> publicIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open_fast_clean")

    private Boolean isOpenFastClean;

    public CreateJobReq withBindEip(Boolean bindEip) {
        this.bindEip = bindEip;
        return this;
    }

    /**
     * 是否绑定eip，网络类型为eip时必填且为true
     * @return bindEip
     */
    public Boolean getBindEip() {
        return bindEip;
    }

    public void setBindEip(Boolean bindEip) {
        this.bindEip = bindEip;
    }

    public CreateJobReq withDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
        return this;
    }

    /**
     * 迁移场景，migration-实时迁移,sync-实时同步,cloudDataGuard-实时灾备
     * @return dbUseType
     */
    public DbUseTypeEnum getDbUseType() {
        return dbUseType;
    }

    public void setDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
    }

    public CreateJobReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称，约束：任务名称在4位到50位之间，不区分大小写，可以包含字母、数字、中划线或下划线，不能包括其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateJobReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述。  **约束**：任务描述不能超过256位，且不能包含!<>&'\"\\特殊字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateJobReq withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型 - mysql：MySQL到MySQL迁移，MySQL到MySQL同步 - mongodb：MongoDB到DDS迁移 - cloudDataGuard-mysql：MySQL到MySQL灾备 - gaussdbv5：GaussDB同步 - mysql-to-kafka：MySQL到Kafka同步 - taurus-to-kafka：GaussDB(for MySQL)到Kafka同步 - gaussdbv5ha-to-kafka：GaussDB主备版到Kafka同步 - postgresql：PostgreSQL到PostgreSQL同步
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public CreateJobReq withIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
        return this;
    }

    /**
     * 指定目标实例是否限制为只读，MySQL迁移和灾备，且job_direction为up时设置有效。（灾备场景下，单主灾备且本云为备为必填且为true，不填默认设置为true）。
     * @return isTargetReadonly
     */
    public Boolean getIsTargetReadonly() {
        return isTargetReadonly;
    }

    public void setIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
    }

    public CreateJobReq withJobDirection(JobDirectionEnum jobDirection) {
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

    public CreateJobReq withMultiWrite(Boolean multiWrite) {
        this.multiWrite = multiWrite;
        return this;
    }

    /**
     * - db_use_type 是cloudDataGuard时，必填，灾备类型是双主灾备时 muti_write取值true, 否则为false。 - db_use_type 是其他类型时，muti_write是非必选参数
     * @return multiWrite
     */
    public Boolean getMultiWrite() {
        return multiWrite;
    }

    public void setMultiWrite(Boolean multiWrite) {
        this.multiWrite = multiWrite;
    }

    public CreateJobReq withNetType(NetTypeEnum netType) {
        this.netType = netType;
        return this;
    }

    /**
     * 网络类型
     * @return netType
     */
    public NetTypeEnum getNetType() {
        return netType;
    }

    public void setNetType(NetTypeEnum netType) {
        this.netType = netType;
    }

    public CreateJobReq withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点个数。MongoDB数据库时对应源端分片个数，源库为集群时必填，[1-32]，MySQL双主灾备时会默认设置为2。
     * minimum: 1
     * maximum: 32
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public CreateJobReq withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 规格类型。
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public CreateJobReq withSourceEndpoint(Endpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    public CreateJobReq withSourceEndpoint(Consumer<Endpoint> sourceEndpointSetter) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new Endpoint();
            sourceEndpointSetter.accept(this.sourceEndpoint);
        }

        return this;
    }

    /**
     * Get sourceEndpoint
     * @return sourceEndpoint
     */
    public Endpoint getSourceEndpoint() {
        return sourceEndpoint;
    }

    public void setSourceEndpoint(Endpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
    }

    public CreateJobReq withTargetEndpoint(Endpoint targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
        return this;
    }

    public CreateJobReq withTargetEndpoint(Consumer<Endpoint> targetEndpointSetter) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new Endpoint();
            targetEndpointSetter.accept(this.targetEndpoint);
        }

        return this;
    }

    /**
     * Get targetEndpoint
     * @return targetEndpoint
     */
    public Endpoint getTargetEndpoint() {
        return targetEndpoint;
    }

    public void setTargetEndpoint(Endpoint targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
    }

    public CreateJobReq withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateJobReq addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateJobReq withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public CreateJobReq withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 迁移模式，FULL_TRANS 全量,FULL_INCR_TRANS 全量+增量,INCR_TRANS 增量，灾备场景单主灾备仅支持全量加增量（FULL_INCR_TRANS）
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public CreateJobReq withCustomizeSutnetId(String customizeSutnetId) {
        this.customizeSutnetId = customizeSutnetId;
        return this;
    }

    /**
     * DRS实例所在子网ID，对应目标库相同VPC下已创建的子网（subnet）的网络ID，UUID格式。
     * @return customizeSutnetId
     */
    public String getCustomizeSutnetId() {
        return customizeSutnetId;
    }

    public void setCustomizeSutnetId(String customizeSutnetId) {
        this.customizeSutnetId = customizeSutnetId;
    }

    public CreateJobReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品id。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateJobReq withSysTags(List<ResourceTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public CreateJobReq addSysTagsItem(ResourceTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public CreateJobReq withSysTags(Consumer<List<ResourceTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 企业项目，不填默认为default，key值必须为_sys_enterprise_project_id，value为企业项目ID，只能填一个企业项目。
     * @return sysTags
     */
    public List<ResourceTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<ResourceTag> sysTags) {
        this.sysTags = sysTags;
    }

    public CreateJobReq withExpiredDays(String expiredDays) {
        this.expiredDays = expiredDays;
        return this;
    }

    /**
     * 任务处于异常状态一段时间后，将会自动结束，单位为天。(范围14-100)，不传默认为14天。
     * @return expiredDays
     */
    public String getExpiredDays() {
        return expiredDays;
    }

    public void setExpiredDays(String expiredDays) {
        this.expiredDays = expiredDays;
    }

    public CreateJobReq withMasterAz(String masterAz) {
        this.masterAz = masterAz;
        return this;
    }

    /**
     * 主备任务主任务所在可用区code，可以通过查询规格未售罄的可用区接口获取 - master_az和slave_az同时填写时生效 - 目前支持mysql，gaussdbv5ha-to-kafka
     * @return masterAz
     */
    public String getMasterAz() {
        return masterAz;
    }

    public void setMasterAz(String masterAz) {
        this.masterAz = masterAz;
    }

    public CreateJobReq withSlaveAz(String slaveAz) {
        this.slaveAz = slaveAz;
        return this;
    }

    /**
     * 主备任务备任务所在可用区code，可以通过查询规格未售罄的可用区接口获取 - master_az和slave_az同时填写时生效 - 目前支持mysql，gaussdbv5ha-to-kafka
     * @return slaveAz
     */
    public String getSlaveAz() {
        return slaveAz;
    }

    public void setSlaveAz(String slaveAz) {
        this.slaveAz = slaveAz;
    }

    public CreateJobReq withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式，不填默认为按需计费。 取值范围： - period：包年包月。 - on_demand：按需计费。
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CreateJobReq withPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
        return this;
    }

    public CreateJobReq withPeriodOrder(Consumer<PeriodOrderInfo> periodOrderSetter) {
        if (this.periodOrder == null) {
            this.periodOrder = new PeriodOrderInfo();
            periodOrderSetter.accept(this.periodOrder);
        }

        return this;
    }

    /**
     * Get periodOrder
     * @return periodOrder
     */
    public PeriodOrderInfo getPeriodOrder() {
        return periodOrder;
    }

    public void setPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
    }

    public CreateJobReq withPublicIpList(List<PublicIpConfig> publicIpList) {
        this.publicIpList = publicIpList;
        return this;
    }

    public CreateJobReq addPublicIpListItem(PublicIpConfig publicIpListItem) {
        if (this.publicIpList == null) {
            this.publicIpList = new ArrayList<>();
        }
        this.publicIpList.add(publicIpListItem);
        return this;
    }

    public CreateJobReq withPublicIpList(Consumer<List<PublicIpConfig>> publicIpListSetter) {
        if (this.publicIpList == null) {
            this.publicIpList = new ArrayList<>();
        }
        publicIpListSetter.accept(this.publicIpList);
        return this;
    }

    /**
     * 指定公网IP的信息。
     * @return publicIpList
     */
    public List<PublicIpConfig> getPublicIpList() {
        return publicIpList;
    }

    public void setPublicIpList(List<PublicIpConfig> publicIpList) {
        this.publicIpList = publicIpList;
    }

    public CreateJobReq withIsOpenFastClean(Boolean isOpenFastClean) {
        this.isOpenFastClean = isOpenFastClean;
        return this;
    }

    /**
     * 是否开启云数据库RDS for MySQL/MariaDB的binlog快速清理。不传默认为false，不开启快速清理。
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
        CreateJobReq that = (CreateJobReq) obj;
        return Objects.equals(this.bindEip, that.bindEip) && Objects.equals(this.dbUseType, that.dbUseType)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.isTargetReadonly, that.isTargetReadonly)
            && Objects.equals(this.jobDirection, that.jobDirection) && Objects.equals(this.multiWrite, that.multiWrite)
            && Objects.equals(this.netType, that.netType) && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.sourceEndpoint, that.sourceEndpoint)
            && Objects.equals(this.targetEndpoint, that.targetEndpoint) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.customizeSutnetId, that.customizeSutnetId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.expiredDays, that.expiredDays) && Objects.equals(this.masterAz, that.masterAz)
            && Objects.equals(this.slaveAz, that.slaveAz) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.periodOrder, that.periodOrder)
            && Objects.equals(this.publicIpList, that.publicIpList)
            && Objects.equals(this.isOpenFastClean, that.isOpenFastClean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindEip,
            dbUseType,
            name,
            description,
            engineType,
            isTargetReadonly,
            jobDirection,
            multiWrite,
            netType,
            nodeNum,
            nodeType,
            sourceEndpoint,
            targetEndpoint,
            tags,
            taskType,
            customizeSutnetId,
            productId,
            sysTags,
            expiredDays,
            masterAz,
            slaveAz,
            chargingMode,
            periodOrder,
            publicIpList,
            isOpenFastClean);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateJobReq {\n");
        sb.append("    bindEip: ").append(toIndentedString(bindEip)).append("\n");
        sb.append("    dbUseType: ").append(toIndentedString(dbUseType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    isTargetReadonly: ").append(toIndentedString(isTargetReadonly)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    multiWrite: ").append(toIndentedString(multiWrite)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
        sb.append("    targetEndpoint: ").append(toIndentedString(targetEndpoint)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    customizeSutnetId: ").append(toIndentedString(customizeSutnetId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    expiredDays: ").append(toIndentedString(expiredDays)).append("\n");
        sb.append("    masterAz: ").append(toIndentedString(masterAz)).append("\n");
        sb.append("    slaveAz: ").append(toIndentedString(slaveAz)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    periodOrder: ").append(toIndentedString(periodOrder)).append("\n");
        sb.append("    publicIpList: ").append(toIndentedString(publicIpList)).append("\n");
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
