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
 * 修改任务描述信息、名称，设置异常通知信息、限速等。
 */
public class ModifyJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify")

    private AlarmNotifyInfo alarmNotify;

    /**
     * 任务模式，FULL_TRANS：全量；FULL_INCR_TRANS：全量+增量；INCR_TRANS：增量。
     */
    public static final class TaskTypeEnum {

        /**
         * Enum FULL_TRANS for value: "FULL_TRANS"
         */
        public static final TaskTypeEnum FULL_TRANS = new TaskTypeEnum("FULL_TRANS");

        /**
         * Enum INCR_TRANS for value: "INCR_TRANS"
         */
        public static final TaskTypeEnum INCR_TRANS = new TaskTypeEnum("INCR_TRANS");

        /**
         * Enum FULL_INCR_TRANS for value: "FULL_INCR_TRANS"
         */
        public static final TaskTypeEnum FULL_INCR_TRANS = new TaskTypeEnum("FULL_INCR_TRANS");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("FULL_TRANS", FULL_TRANS);
            map.put("INCR_TRANS", INCR_TRANS);
            map.put("FULL_INCR_TRANS", FULL_INCR_TRANS);
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
    @JsonProperty(value = "source_endpoint")

    private Endpoint sourceEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_endpoint")

    private Endpoint targetEndpoint;

    /**
     * node规格类型，测试连接之后修改调用时必填。取值： - micro：极小规格。 - small：小规格。 - medium：中规格。 - high：大规格。 - xlarge：超大规格。 - 2xlarge：极大规格。
     */
    public static final class NodeTypeEnum {

        /**
         * Enum MICRO for value: "micro"
         */
        public static final NodeTypeEnum MICRO = new NodeTypeEnum("micro");

        /**
         * Enum SMALL for value: "small"
         */
        public static final NodeTypeEnum SMALL = new NodeTypeEnum("small");

        /**
         * Enum MEDIUM for value: "medium"
         */
        public static final NodeTypeEnum MEDIUM = new NodeTypeEnum("medium");

        /**
         * Enum HIGH for value: "high"
         */
        public static final NodeTypeEnum HIGH = new NodeTypeEnum("high");

        /**
         * Enum XLARGE for value: "xlarge"
         */
        public static final NodeTypeEnum XLARGE = new NodeTypeEnum("xlarge");

        /**
         * Enum _2XLARGE for value: "2xlarge"
         */
        public static final NodeTypeEnum _2XLARGE = new NodeTypeEnum("2xlarge");

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("micro", MICRO);
            map.put("small", SMALL);
            map.put("medium", MEDIUM);
            map.put("high", HIGH);
            map.put("xlarge", XLARGE);
            map.put("2xlarge", _2XLARGE);
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

    /**
     * 引擎类型，测试连接之后修改调用时必填。mysql：迁移，同步使用。mongodb：迁移使用。cloudDataGuard-mysql：灾备使用
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

    /**
     * 网络类型，测试连接之后修改调用时必填。
     */
    public static final class NetTypeEnum {

        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetTypeEnum VPC = new NetTypeEnum("vpc");

        /**
         * Enum VPN for value: "vpn"
         */
        public static final NetTypeEnum VPN = new NetTypeEnum("vpn");

        /**
         * Enum EIP for value: "eip"
         */
        public static final NetTypeEnum EIP = new NetTypeEnum("eip");

        private static final Map<String, NetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetTypeEnum> createStaticFields() {
            Map<String, NetTypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("vpn", VPN);
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
    @JsonProperty(value = "store_db_info")

    private Boolean storeDbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_recreate")

    private Boolean isRecreate;

    /**
     * 迁移方向,up 入云 灾备场景时对应本云为备,down 出云 灾备场景时对应本云为主,non-dbs 自建
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
    @JsonProperty(value = "is_target_readonly")

    private Boolean isTargetReadonly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replace_definer")

    private Boolean replaceDefiner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    /**
     * 迁移类型，migration-实时迁移,sync-实时同步,cloudDataGuard-实时灾备
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
    @JsonProperty(value = "product_id")

    private String productId;

    public ModifyJobReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ModifyJobReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述，修改任务描述时必填。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModifyJobReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称，修改任务名称时必填
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModifyJobReq withAlarmNotify(AlarmNotifyInfo alarmNotify) {
        this.alarmNotify = alarmNotify;
        return this;
    }

    public ModifyJobReq withAlarmNotify(Consumer<AlarmNotifyInfo> alarmNotifySetter) {
        if (this.alarmNotify == null) {
            this.alarmNotify = new AlarmNotifyInfo();
            alarmNotifySetter.accept(this.alarmNotify);
        }

        return this;
    }

    /**
     * Get alarmNotify
     * @return alarmNotify
     */
    public AlarmNotifyInfo getAlarmNotify() {
        return alarmNotify;
    }

    public void setAlarmNotify(AlarmNotifyInfo alarmNotify) {
        this.alarmNotify = alarmNotify;
    }

    public ModifyJobReq withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务模式，FULL_TRANS：全量；FULL_INCR_TRANS：全量+增量；INCR_TRANS：增量。
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ModifyJobReq withSourceEndpoint(Endpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    public ModifyJobReq withSourceEndpoint(Consumer<Endpoint> sourceEndpointSetter) {
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

    public ModifyJobReq withTargetEndpoint(Endpoint targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
        return this;
    }

    public ModifyJobReq withTargetEndpoint(Consumer<Endpoint> targetEndpointSetter) {
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

    public ModifyJobReq withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * node规格类型，测试连接之后修改调用时必填。取值： - micro：极小规格。 - small：小规格。 - medium：中规格。 - high：大规格。 - xlarge：超大规格。 - 2xlarge：极大规格。
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public ModifyJobReq withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型，测试连接之后修改调用时必填。mysql：迁移，同步使用。mongodb：迁移使用。cloudDataGuard-mysql：灾备使用
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public ModifyJobReq withNetType(NetTypeEnum netType) {
        this.netType = netType;
        return this;
    }

    /**
     * 网络类型，测试连接之后修改调用时必填。
     * @return netType
     */
    public NetTypeEnum getNetType() {
        return netType;
    }

    public void setNetType(NetTypeEnum netType) {
        this.netType = netType;
    }

    public ModifyJobReq withStoreDbInfo(Boolean storeDbInfo) {
        this.storeDbInfo = storeDbInfo;
        return this;
    }

    /**
     * 保存数据库信息，测试连接之后修改调用时必填为true。
     * @return storeDbInfo
     */
    public Boolean getStoreDbInfo() {
        return storeDbInfo;
    }

    public void setStoreDbInfo(Boolean storeDbInfo) {
        this.storeDbInfo = storeDbInfo;
    }

    public ModifyJobReq withIsRecreate(Boolean isRecreate) {
        this.isRecreate = isRecreate;
        return this;
    }

    /**
     * 是否为重建任务。
     * @return isRecreate
     */
    public Boolean getIsRecreate() {
        return isRecreate;
    }

    public void setIsRecreate(Boolean isRecreate) {
        this.isRecreate = isRecreate;
    }

    public ModifyJobReq withJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 迁移方向,up 入云 灾备场景时对应本云为备,down 出云 灾备场景时对应本云为主,non-dbs 自建
     * @return jobDirection
     */
    public JobDirectionEnum getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
    }

    public ModifyJobReq withIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
        return this;
    }

    /**
     * 目标实例是否限制为只读。
     * @return isTargetReadonly
     */
    public Boolean getIsTargetReadonly() {
        return isTargetReadonly;
    }

    public void setIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
    }

    public ModifyJobReq withReplaceDefiner(Boolean replaceDefiner) {
        this.replaceDefiner = replaceDefiner;
        return this;
    }

    /**
     * 所有Definer是否迁移到该用户下，MySQL数据库支持该设置，测试连接之后修改调用时必填。 - true：迁移后，所有源数据库对象的Definer都会迁移至该用户下，其他用户需要授权后才具有数据库对象权限 - false：迁移后，将保持源数据库对象Definer定义不变，选择此选项，需要配合下一步用户权限迁移功能，将源数据库的用户全部迁移，这样才能保持源数据库的权限体系完全不变。
     * @return replaceDefiner
     */
    public Boolean getReplaceDefiner() {
        return replaceDefiner;
    }

    public void setReplaceDefiner(Boolean replaceDefiner) {
        this.replaceDefiner = replaceDefiner;
    }

    public ModifyJobReq withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ModifyJobReq addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ModifyJobReq withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ModifyJobReq withDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
        return this;
    }

    /**
     * 迁移类型，migration-实时迁移,sync-实时同步,cloudDataGuard-实时灾备
     * @return dbUseType
     */
    public DbUseTypeEnum getDbUseType() {
        return dbUseType;
    }

    public void setDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
    }

    public ModifyJobReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyJobReq that = (ModifyJobReq) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.alarmNotify, that.alarmNotify)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.sourceEndpoint, that.sourceEndpoint)
            && Objects.equals(this.targetEndpoint, that.targetEndpoint) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.engineType, that.engineType) && Objects.equals(this.netType, that.netType)
            && Objects.equals(this.storeDbInfo, that.storeDbInfo) && Objects.equals(this.isRecreate, that.isRecreate)
            && Objects.equals(this.jobDirection, that.jobDirection)
            && Objects.equals(this.isTargetReadonly, that.isTargetReadonly)
            && Objects.equals(this.replaceDefiner, that.replaceDefiner) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.dbUseType, that.dbUseType) && Objects.equals(this.productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            description,
            name,
            alarmNotify,
            taskType,
            sourceEndpoint,
            targetEndpoint,
            nodeType,
            engineType,
            netType,
            storeDbInfo,
            isRecreate,
            jobDirection,
            isTargetReadonly,
            replaceDefiner,
            tags,
            dbUseType,
            productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyJobReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alarmNotify: ").append(toIndentedString(alarmNotify)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
        sb.append("    targetEndpoint: ").append(toIndentedString(targetEndpoint)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    storeDbInfo: ").append(toIndentedString(storeDbInfo)).append("\n");
        sb.append("    isRecreate: ").append(toIndentedString(isRecreate)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    isTargetReadonly: ").append(toIndentedString(isTargetReadonly)).append("\n");
        sb.append("    replaceDefiner: ").append(toIndentedString(replaceDefiner)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    dbUseType: ").append(toIndentedString(dbUseType)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
