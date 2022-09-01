package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 在线迁移任务列表信息体
 */
public class JobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    /**
     * 任务状态
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING_ for value: "CREATING：创建中"
         */
        public static final StatusEnum CREATING_ = new StatusEnum("CREATING：创建中");

        /**
         * Enum CREATE_FAILED_ for value: "CREATE_FAILED: 创建失败"
         */
        public static final StatusEnum CREATE_FAILED_ = new StatusEnum("CREATE_FAILED: 创建失败");

        /**
         * Enum CONFIGURATION_ for value: "CONFIGURATION: 配置中"
         */
        public static final StatusEnum CONFIGURATION_ = new StatusEnum("CONFIGURATION: 配置中");

        /**
         * Enum STARTJOBING_ for value: "STARTJOBING: 启动中"
         */
        public static final StatusEnum STARTJOBING_ = new StatusEnum("STARTJOBING: 启动中");

        /**
         * Enum WAITING_FOR_START_ for value: "WAITING_FOR_START：等待启动中"
         */
        public static final StatusEnum WAITING_FOR_START_ = new StatusEnum("WAITING_FOR_START：等待启动中");

        /**
         * Enum START_JOB_FAILED_ for value: "START_JOB_FAILED：任务启动失败"
         */
        public static final StatusEnum START_JOB_FAILED_ = new StatusEnum("START_JOB_FAILED：任务启动失败");

        /**
         * Enum FULL_TRANSFER_STARTED_ for value: "FULL_TRANSFER_STARTED：全量迁移中，灾备场景为初始化"
         */
        public static final StatusEnum FULL_TRANSFER_STARTED_ = new StatusEnum("FULL_TRANSFER_STARTED：全量迁移中，灾备场景为初始化");

        /**
         * Enum FULL_TRANSFER_FAILED_ for value: "FULL_TRANSFER_FAILED：全量迁移失败，灾备场景为初始化失败"
         */
        public static final StatusEnum FULL_TRANSFER_FAILED_ = new StatusEnum("FULL_TRANSFER_FAILED：全量迁移失败，灾备场景为初始化失败");

        /**
         * Enum FULL_TRANSFER_COMPLETE_ for value: "FULL_TRANSFER_COMPLETE：全量迁移完成，灾备场景为初始化完成"
         */
        public static final StatusEnum FULL_TRANSFER_COMPLETE_ =
            new StatusEnum("FULL_TRANSFER_COMPLETE：全量迁移完成，灾备场景为初始化完成");

        /**
         * Enum INCRE_TRANSFER_STARTED_ for value: "INCRE_TRANSFER_STARTED：增量迁移中，灾备场景为灾备中"
         */
        public static final StatusEnum INCRE_TRANSFER_STARTED_ =
            new StatusEnum("INCRE_TRANSFER_STARTED：增量迁移中，灾备场景为灾备中");

        /**
         * Enum INCRE_TRANSFER_FAILED_ for value: "INCRE_TRANSFER_FAILED：增量迁移失败，灾备场景为灾备异常"
         */
        public static final StatusEnum INCRE_TRANSFER_FAILED_ =
            new StatusEnum("INCRE_TRANSFER_FAILED：增量迁移失败，灾备场景为灾备异常");

        /**
         * Enum RELEASE_RESOURCE_STARTED_ for value: "RELEASE_RESOURCE_STARTED：结束任务中"
         */
        public static final StatusEnum RELEASE_RESOURCE_STARTED_ = new StatusEnum("RELEASE_RESOURCE_STARTED：结束任务中");

        /**
         * Enum RELEASE_RESOURCE_FAILED_ for value: "RELEASE_RESOURCE_FAILED：结束任务失败"
         */
        public static final StatusEnum RELEASE_RESOURCE_FAILED_ = new StatusEnum("RELEASE_RESOURCE_FAILED：结束任务失败");

        /**
         * Enum RELEASE_RESOURCE_COMPLETE_ for value: "RELEASE_RESOURCE_COMPLETE：已结束"
         */
        public static final StatusEnum RELEASE_RESOURCE_COMPLETE_ = new StatusEnum("RELEASE_RESOURCE_COMPLETE：已结束");

        /**
         * Enum CHANGE_JOB_STARTED_ for value: "CHANGE_JOB_STARTED：任务变更中"
         */
        public static final StatusEnum CHANGE_JOB_STARTED_ = new StatusEnum("CHANGE_JOB_STARTED：任务变更中");

        /**
         * Enum CHANGE_JOB_FAILED_ for value: "CHANGE_JOB_FAILED：任务变更失败"
         */
        public static final StatusEnum CHANGE_JOB_FAILED_ = new StatusEnum("CHANGE_JOB_FAILED：任务变更失败");

        /**
         * Enum CHILD_TRANSFER_STARTING_ for value: "CHILD_TRANSFER_STARTING：子任务启动中"
         */
        public static final StatusEnum CHILD_TRANSFER_STARTING_ = new StatusEnum("CHILD_TRANSFER_STARTING：子任务启动中");

        /**
         * Enum CHILD_TRANSFER_STARTED_ for value: "CHILD_TRANSFER_STARTED：子任务迁移中"
         */
        public static final StatusEnum CHILD_TRANSFER_STARTED_ = new StatusEnum("CHILD_TRANSFER_STARTED：子任务迁移中");

        /**
         * Enum CHILD_TRANSFER_COMPLETE_ for value: "CHILD_TRANSFER_COMPLETE：子任务迁移完成"
         */
        public static final StatusEnum CHILD_TRANSFER_COMPLETE_ = new StatusEnum("CHILD_TRANSFER_COMPLETE：子任务迁移完成");

        /**
         * Enum CHILD_TRANSFER_FAILED_ for value: "CHILD_TRANSFER_FAILED：子任务迁移失败"
         */
        public static final StatusEnum CHILD_TRANSFER_FAILED_ = new StatusEnum("CHILD_TRANSFER_FAILED：子任务迁移失败");

        /**
         * Enum RELEASE_CHILD_TRANSFER_STARTED_ for value: "RELEASE_CHILD_TRANSFER_STARTED：子任务结束中"
         */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_STARTED_ =
            new StatusEnum("RELEASE_CHILD_TRANSFER_STARTED：子任务结束中");

        /**
         * Enum RELEASE_CHILD_TRANSFER_COMPLETE_ for value: "RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束"
         */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_COMPLETE_ =
            new StatusEnum("RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING：创建中", CREATING_);
            map.put("CREATE_FAILED: 创建失败", CREATE_FAILED_);
            map.put("CONFIGURATION: 配置中", CONFIGURATION_);
            map.put("STARTJOBING: 启动中", STARTJOBING_);
            map.put("WAITING_FOR_START：等待启动中", WAITING_FOR_START_);
            map.put("START_JOB_FAILED：任务启动失败", START_JOB_FAILED_);
            map.put("FULL_TRANSFER_STARTED：全量迁移中，灾备场景为初始化", FULL_TRANSFER_STARTED_);
            map.put("FULL_TRANSFER_FAILED：全量迁移失败，灾备场景为初始化失败", FULL_TRANSFER_FAILED_);
            map.put("FULL_TRANSFER_COMPLETE：全量迁移完成，灾备场景为初始化完成", FULL_TRANSFER_COMPLETE_);
            map.put("INCRE_TRANSFER_STARTED：增量迁移中，灾备场景为灾备中", INCRE_TRANSFER_STARTED_);
            map.put("INCRE_TRANSFER_FAILED：增量迁移失败，灾备场景为灾备异常", INCRE_TRANSFER_FAILED_);
            map.put("RELEASE_RESOURCE_STARTED：结束任务中", RELEASE_RESOURCE_STARTED_);
            map.put("RELEASE_RESOURCE_FAILED：结束任务失败", RELEASE_RESOURCE_FAILED_);
            map.put("RELEASE_RESOURCE_COMPLETE：已结束", RELEASE_RESOURCE_COMPLETE_);
            map.put("CHANGE_JOB_STARTED：任务变更中", CHANGE_JOB_STARTED_);
            map.put("CHANGE_JOB_FAILED：任务变更失败", CHANGE_JOB_FAILED_);
            map.put("CHILD_TRANSFER_STARTING：子任务启动中", CHILD_TRANSFER_STARTING_);
            map.put("CHILD_TRANSFER_STARTED：子任务迁移中", CHILD_TRANSFER_STARTED_);
            map.put("CHILD_TRANSFER_COMPLETE：子任务迁移完成", CHILD_TRANSFER_COMPLETE_);
            map.put("CHILD_TRANSFER_FAILED：子任务迁移失败", CHILD_TRANSFER_FAILED_);
            map.put("RELEASE_CHILD_TRANSFER_STARTED：子任务结束中", RELEASE_CHILD_TRANSFER_STARTED_);
            map.put("RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束", RELEASE_CHILD_TRANSFER_COMPLETE_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    /**
     * 引擎类型
     */
    public static final class EngineTypeEnum {

        /**
         * Enum CLOUDDATAGUARD_CASSANDRA for value: "cloudDataGuard-cassandra"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_CASSANDRA = new EngineTypeEnum("cloudDataGuard-cassandra");

        /**
         * Enum CLOUDDATAGUARD_DDM for value: "cloudDataGuard-ddm"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_DDM = new EngineTypeEnum("cloudDataGuard-ddm");

        /**
         * Enum CLOUDDATAGUARD_TAURUS_TO_MYSQL for value: "cloudDataGuard-taurus-to-mysql"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_TAURUS_TO_MYSQL =
            new EngineTypeEnum("cloudDataGuard-taurus-to-mysql");

        /**
         * Enum CLOUDDATAGUARD_MYSQL for value: "cloudDataGuard-mysql"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_MYSQL = new EngineTypeEnum("cloudDataGuard-mysql");

        /**
         * Enum CLOUDDATAGUARD_MYSQL_TO_TAURUS for value: "cloudDataGuard-mysql-to-taurus"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_MYSQL_TO_TAURUS =
            new EngineTypeEnum("cloudDataGuard-mysql-to-taurus");

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("cloudDataGuard-cassandra", CLOUDDATAGUARD_CASSANDRA);
            map.put("cloudDataGuard-ddm", CLOUDDATAGUARD_DDM);
            map.put("cloudDataGuard-taurus-to-mysql", CLOUDDATAGUARD_TAURUS_TO_MYSQL);
            map.put("cloudDataGuard-mysql", CLOUDDATAGUARD_MYSQL);
            map.put("cloudDataGuard-mysql-to-taurus", CLOUDDATAGUARD_MYSQL_TO_TAURUS);
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
            EngineTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineTypeEnum(value);
            }
            return result;
        }

        public static EngineTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EngineTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "engine_type")

    private EngineTypeEnum engineType;

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
            NetTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NetTypeEnum(value);
            }
            return result;
        }

        public static NetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NetTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "net_type")

    private NetTypeEnum netType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_tag")

    @JacksonXmlProperty(localName = "billing_tag")

    private Boolean billingTag;

    /**
     * 迁移方向
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

        private static final Map<String, JobDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobDirectionEnum> createStaticFields() {
            Map<String, JobDirectionEnum> map = new HashMap<>();
            map.put("up", UP);
            map.put("down", DOWN);
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
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobDirectionEnum(value);
            }
            return result;
        }

        public static JobDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "job_direction")

    private JobDirectionEnum jobDirection;

    /**
     * 迁移场景
     */
    public static final class DbUseTypeEnum {

        /**
         * Enum MIGRATION_ for value: "migration:实时迁移"
         */
        public static final DbUseTypeEnum MIGRATION_ = new DbUseTypeEnum("migration:实时迁移");

        /**
         * Enum SYNC_ for value: "sync:实时同步"
         */
        public static final DbUseTypeEnum SYNC_ = new DbUseTypeEnum("sync:实时同步");

        /**
         * Enum CLOUDDATAGUARD_ for value: "cloudDataGuard:实时灾备"
         */
        public static final DbUseTypeEnum CLOUDDATAGUARD_ = new DbUseTypeEnum("cloudDataGuard:实时灾备");

        private static final Map<String, DbUseTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbUseTypeEnum> createStaticFields() {
            Map<String, DbUseTypeEnum> map = new HashMap<>();
            map.put("migration:实时迁移", MIGRATION_);
            map.put("sync:实时同步", SYNC_);
            map.put("cloudDataGuard:实时灾备", CLOUDDATAGUARD_);
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
            DbUseTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DbUseTypeEnum(value);
            }
            return result;
        }

        public static DbUseTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DbUseTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "db_use_type")

    private DbUseTypeEnum dbUseType;

    /**
     * 迁移模式
     */
    public static final class TaskTypeEnum {

        /**
         * Enum FULL_TRANS_ for value: "FULL_TRANS 全量"
         */
        public static final TaskTypeEnum FULL_TRANS_ = new TaskTypeEnum("FULL_TRANS 全量");

        /**
         * Enum FULL_INCR_TRANS_ for value: "FULL_INCR_TRANS 全量+增量"
         */
        public static final TaskTypeEnum FULL_INCR_TRANS_ = new TaskTypeEnum("FULL_INCR_TRANS 全量+增量");

        /**
         * Enum INCR_TRANS_ for value: "INCR_TRANS 增量"
         */
        public static final TaskTypeEnum INCR_TRANS_ = new TaskTypeEnum("INCR_TRANS 增量");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("FULL_TRANS 全量", FULL_TRANS_);
            map.put("FULL_INCR_TRANS 全量+增量", FULL_INCR_TRANS_);
            map.put("INCR_TRANS 增量", INCR_TRANS_);
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
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskTypeEnum(value);
            }
            return result;
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "task_type")

    private TaskTypeEnum taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    @JacksonXmlProperty(localName = "children")

    private List<ChildrenJobInfo> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_newFramework")

    @JacksonXmlProperty(localName = "node_newFramework")

    private Boolean nodeNewFramework;

    public JobInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public JobInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public JobInfo withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public JobInfo withNetType(NetTypeEnum netType) {
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

    public JobInfo withBillingTag(Boolean billingTag) {
        this.billingTag = billingTag;
        return this;
    }

    /**
     * 计费字段
     * @return billingTag
     */
    public Boolean getBillingTag() {
        return billingTag;
    }

    public void setBillingTag(Boolean billingTag) {
        this.billingTag = billingTag;
    }

    public JobInfo withJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 迁移方向
     * @return jobDirection
     */
    public JobDirectionEnum getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
    }

    public JobInfo withDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
        return this;
    }

    /**
     * 迁移场景
     * @return dbUseType
     */
    public DbUseTypeEnum getDbUseType() {
        return dbUseType;
    }

    public void setDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
    }

    public JobInfo withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 迁移模式
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public JobInfo withChildren(List<ChildrenJobInfo> children) {
        this.children = children;
        return this;
    }

    public JobInfo addChildrenItem(ChildrenJobInfo childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public JobInfo withChildren(Consumer<List<ChildrenJobInfo>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子任务信息体
     * @return children
     */
    public List<ChildrenJobInfo> getChildren() {
        return children;
    }

    public void setChildren(List<ChildrenJobInfo> children) {
        this.children = children;
    }

    public JobInfo withNodeNewFramework(Boolean nodeNewFramework) {
        this.nodeNewFramework = nodeNewFramework;
        return this;
    }

    /**
     * 是否新框架
     * @return nodeNewFramework
     */
    public Boolean getNodeNewFramework() {
        return nodeNewFramework;
    }

    public void setNodeNewFramework(Boolean nodeNewFramework) {
        this.nodeNewFramework = nodeNewFramework;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobInfo jobInfo = (JobInfo) o;
        return Objects.equals(this.id, jobInfo.id) && Objects.equals(this.name, jobInfo.name)
            && Objects.equals(this.status, jobInfo.status) && Objects.equals(this.description, jobInfo.description)
            && Objects.equals(this.createTime, jobInfo.createTime)
            && Objects.equals(this.engineType, jobInfo.engineType) && Objects.equals(this.netType, jobInfo.netType)
            && Objects.equals(this.billingTag, jobInfo.billingTag)
            && Objects.equals(this.jobDirection, jobInfo.jobDirection)
            && Objects.equals(this.dbUseType, jobInfo.dbUseType) && Objects.equals(this.taskType, jobInfo.taskType)
            && Objects.equals(this.children, jobInfo.children)
            && Objects.equals(this.nodeNewFramework, jobInfo.nodeNewFramework);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            description,
            createTime,
            engineType,
            netType,
            billingTag,
            jobDirection,
            dbUseType,
            taskType,
            children,
            nodeNewFramework);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    billingTag: ").append(toIndentedString(billingTag)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    dbUseType: ").append(toIndentedString(dbUseType)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    nodeNewFramework: ").append(toIndentedString(nodeNewFramework)).append("\n");
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
