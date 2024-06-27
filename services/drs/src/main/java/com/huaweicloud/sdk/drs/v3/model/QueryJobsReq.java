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
 * 查询任务列表请求体
 */
public class QueryJobsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private Integer curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    /**
     * 迁移场景，migration:实时迁移,sync:实时同步,cloudDataGuard:实时灾备
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
     * 引擎类型,mysql：迁移，同步使用。mongodb：迁移使用。cloudDataGuard-mysql：灾备使用。
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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "service_name")

    private String serviceName;

    /**
     * 任务状态。 - CREATING：创建中 - CREATE_FAILED：创建失败 - CONFIGURATION：配置中 - STARTJOBING：启动中 - WAITING_FOR_START：等待启动中 - START_JOB_FAILED：启动失败 - PAUSING：已暂停 - FULL_TRANSFER_STARTED：全量开始，灾备场景下为初始化 - FULL_TRANSFER_FAILED：全量失败，灾备场景下为初始化失败 - FULL_TRANSFER_COMPLETE：全量完成，灾备场景下为初始化完成 - INCRE_TRANSFER_STARTED：增量开始，灾备场景下为灾备中 - INCRE_TRANSFER_FAILED：增量失败，灾备场景下为灾备异常 - RELEASE_RESOURCE_STARTED：结束任务中 - RELEASE_RESOURCE_FAILED：结束任务失败 - RELEASE_RESOURCE_COMPLETE：已结束 - REBUILD_NODE_STARTED：故障恢复中 - REBUILD_NODE_FAILED：故障恢复失败 - CHANGE_JOB_STARTED：任务变更中 - CHANGE_JOB_FAILED：任务变更失败 - DELETED：已删除 - CHILD_TRANSFER_STARTING：再编辑子任务启动中 - CHILD_TRANSFER_STARTED：再编辑子任务迁移中 - CHILD_TRANSFER_COMPLETE：再编辑子任务迁移完成 - CHILD_TRANSFER_FAILED：再编辑子任务迁移失败 - RELEASE_CHILD_TRANSFER_STARTED：再编辑子任务结束中 - RELEASE_CHILD_TRANSFER_COMPLETE：再编辑子任务已结束 - NODE_UPGRADE_START：升级开始 - NODE_UPGRADE_COMPLETE：升级完成 - NODE_UPGRADE_FAILED：升级失败
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum CONFIGURATION for value: "CONFIGURATION"
         */
        public static final StatusEnum CONFIGURATION = new StatusEnum("CONFIGURATION");

        /**
         * Enum STARTJOBING for value: "STARTJOBING"
         */
        public static final StatusEnum STARTJOBING = new StatusEnum("STARTJOBING");

        /**
         * Enum WAITING_FOR_START for value: "WAITING_FOR_START"
         */
        public static final StatusEnum WAITING_FOR_START = new StatusEnum("WAITING_FOR_START");

        /**
         * Enum START_JOB_FAILED for value: "START_JOB_FAILED"
         */
        public static final StatusEnum START_JOB_FAILED = new StatusEnum("START_JOB_FAILED");

        /**
         * Enum PAUSING for value: "PAUSING"
         */
        public static final StatusEnum PAUSING = new StatusEnum("PAUSING");

        /**
         * Enum FULL_TRANSFER_STARTED for value: "FULL_TRANSFER_STARTED"
         */
        public static final StatusEnum FULL_TRANSFER_STARTED = new StatusEnum("FULL_TRANSFER_STARTED");

        /**
         * Enum FULL_TRANSFER_FAILED for value: "FULL_TRANSFER_FAILED"
         */
        public static final StatusEnum FULL_TRANSFER_FAILED = new StatusEnum("FULL_TRANSFER_FAILED");

        /**
         * Enum FULL_TRANSFER_COMPLETE for value: "FULL_TRANSFER_COMPLETE"
         */
        public static final StatusEnum FULL_TRANSFER_COMPLETE = new StatusEnum("FULL_TRANSFER_COMPLETE");

        /**
         * Enum INCRE_TRANSFER_STARTED for value: "INCRE_TRANSFER_STARTED"
         */
        public static final StatusEnum INCRE_TRANSFER_STARTED = new StatusEnum("INCRE_TRANSFER_STARTED");

        /**
         * Enum INCRE_TRANSFER_FAILED for value: "INCRE_TRANSFER_FAILED"
         */
        public static final StatusEnum INCRE_TRANSFER_FAILED = new StatusEnum("INCRE_TRANSFER_FAILED");

        /**
         * Enum RELEASE_RESOURCE_STARTED for value: "RELEASE_RESOURCE_STARTED"
         */
        public static final StatusEnum RELEASE_RESOURCE_STARTED = new StatusEnum("RELEASE_RESOURCE_STARTED");

        /**
         * Enum RELEASE_RESOURCE_FAILED for value: "RELEASE_RESOURCE_FAILED"
         */
        public static final StatusEnum RELEASE_RESOURCE_FAILED = new StatusEnum("RELEASE_RESOURCE_FAILED");

        /**
         * Enum RELEASE_RESOURCE_COMPLETE for value: "RELEASE_RESOURCE_COMPLETE"
         */
        public static final StatusEnum RELEASE_RESOURCE_COMPLETE = new StatusEnum("RELEASE_RESOURCE_COMPLETE");

        /**
         * Enum REBUILD_NODE_STARTED for value: "REBUILD_NODE_STARTED"
         */
        public static final StatusEnum REBUILD_NODE_STARTED = new StatusEnum("REBUILD_NODE_STARTED");

        /**
         * Enum REBUILD_NODE_FAILED for value: "REBUILD_NODE_FAILED"
         */
        public static final StatusEnum REBUILD_NODE_FAILED = new StatusEnum("REBUILD_NODE_FAILED");

        /**
         * Enum CHANGE_JOB_STARTED for value: "CHANGE_JOB_STARTED"
         */
        public static final StatusEnum CHANGE_JOB_STARTED = new StatusEnum("CHANGE_JOB_STARTED");

        /**
         * Enum CHANGE_JOB_FAILED for value: "CHANGE_JOB_FAILED"
         */
        public static final StatusEnum CHANGE_JOB_FAILED = new StatusEnum("CHANGE_JOB_FAILED");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum CHILD_TRANSFER_STARTING for value: "CHILD_TRANSFER_STARTING"
         */
        public static final StatusEnum CHILD_TRANSFER_STARTING = new StatusEnum("CHILD_TRANSFER_STARTING");

        /**
         * Enum CHILD_TRANSFER_STARTED for value: "CHILD_TRANSFER_STARTED"
         */
        public static final StatusEnum CHILD_TRANSFER_STARTED = new StatusEnum("CHILD_TRANSFER_STARTED");

        /**
         * Enum CHILD_TRANSFER_COMPLETE for value: "CHILD_TRANSFER_COMPLETE"
         */
        public static final StatusEnum CHILD_TRANSFER_COMPLETE = new StatusEnum("CHILD_TRANSFER_COMPLETE");

        /**
         * Enum CHILD_TRANSFER_FAILED for value: "CHILD_TRANSFER_FAILED"
         */
        public static final StatusEnum CHILD_TRANSFER_FAILED = new StatusEnum("CHILD_TRANSFER_FAILED");

        /**
         * Enum RELEASE_CHILD_TRANSFER_STARTED for value: "RELEASE_CHILD_TRANSFER_STARTED"
         */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_STARTED =
            new StatusEnum("RELEASE_CHILD_TRANSFER_STARTED");

        /**
         * Enum RELEASE_CHILD_TRANSFER_COMPLETE for value: "RELEASE_CHILD_TRANSFER_COMPLETE"
         */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_COMPLETE =
            new StatusEnum("RELEASE_CHILD_TRANSFER_COMPLETE");

        /**
         * Enum NODE_UPGRADE_START for value: "NODE_UPGRADE_START"
         */
        public static final StatusEnum NODE_UPGRADE_START = new StatusEnum("NODE_UPGRADE_START");

        /**
         * Enum NODE_UPGRADE_COMPLETE for value: "NODE_UPGRADE_COMPLETE"
         */
        public static final StatusEnum NODE_UPGRADE_COMPLETE = new StatusEnum("NODE_UPGRADE_COMPLETE");

        /**
         * Enum NODE_UPGRADE_FAILED for value: "NODE_UPGRADE_FAILED"
         */
        public static final StatusEnum NODE_UPGRADE_FAILED = new StatusEnum("NODE_UPGRADE_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("CONFIGURATION", CONFIGURATION);
            map.put("STARTJOBING", STARTJOBING);
            map.put("WAITING_FOR_START", WAITING_FOR_START);
            map.put("START_JOB_FAILED", START_JOB_FAILED);
            map.put("PAUSING", PAUSING);
            map.put("FULL_TRANSFER_STARTED", FULL_TRANSFER_STARTED);
            map.put("FULL_TRANSFER_FAILED", FULL_TRANSFER_FAILED);
            map.put("FULL_TRANSFER_COMPLETE", FULL_TRANSFER_COMPLETE);
            map.put("INCRE_TRANSFER_STARTED", INCRE_TRANSFER_STARTED);
            map.put("INCRE_TRANSFER_FAILED", INCRE_TRANSFER_FAILED);
            map.put("RELEASE_RESOURCE_STARTED", RELEASE_RESOURCE_STARTED);
            map.put("RELEASE_RESOURCE_FAILED", RELEASE_RESOURCE_FAILED);
            map.put("RELEASE_RESOURCE_COMPLETE", RELEASE_RESOURCE_COMPLETE);
            map.put("REBUILD_NODE_STARTED", REBUILD_NODE_STARTED);
            map.put("REBUILD_NODE_FAILED", REBUILD_NODE_FAILED);
            map.put("CHANGE_JOB_STARTED", CHANGE_JOB_STARTED);
            map.put("CHANGE_JOB_FAILED", CHANGE_JOB_FAILED);
            map.put("DELETED", DELETED);
            map.put("CHILD_TRANSFER_STARTING", CHILD_TRANSFER_STARTING);
            map.put("CHILD_TRANSFER_STARTED", CHILD_TRANSFER_STARTED);
            map.put("CHILD_TRANSFER_COMPLETE", CHILD_TRANSFER_COMPLETE);
            map.put("CHILD_TRANSFER_FAILED", CHILD_TRANSFER_FAILED);
            map.put("RELEASE_CHILD_TRANSFER_STARTED", RELEASE_CHILD_TRANSFER_STARTED);
            map.put("RELEASE_CHILD_TRANSFER_COMPLETE", RELEASE_CHILD_TRANSFER_COMPLETE);
            map.put("NODE_UPGRADE_START", NODE_UPGRADE_START);
            map.put("NODE_UPGRADE_COMPLETE", NODE_UPGRADE_COMPLETE);
            map.put("NODE_UPGRADE_FAILED", NODE_UPGRADE_FAILED);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ip")

    private String instanceIp;

    public QueryJobsReq withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 第几页
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public QueryJobsReq withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 每页记录数
     * minimum: 0
     * maximum: 100
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public QueryJobsReq withDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
        return this;
    }

    /**
     * 迁移场景，migration:实时迁移,sync:实时同步,cloudDataGuard:实时灾备
     * @return dbUseType
     */
    public DbUseTypeEnum getDbUseType() {
        return dbUseType;
    }

    public void setDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
    }

    public QueryJobsReq withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型,mysql：迁移，同步使用。mongodb：迁移使用。cloudDataGuard-mysql：灾备使用。
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public QueryJobsReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public QueryJobsReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name或ID。支持传入多个任务ID，逗号分隔，最多100个。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryJobsReq withNetType(NetTypeEnum netType) {
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

    public QueryJobsReq withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 开启EPS时使用，值为eps
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public QueryJobsReq withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。 - CREATING：创建中 - CREATE_FAILED：创建失败 - CONFIGURATION：配置中 - STARTJOBING：启动中 - WAITING_FOR_START：等待启动中 - START_JOB_FAILED：启动失败 - PAUSING：已暂停 - FULL_TRANSFER_STARTED：全量开始，灾备场景下为初始化 - FULL_TRANSFER_FAILED：全量失败，灾备场景下为初始化失败 - FULL_TRANSFER_COMPLETE：全量完成，灾备场景下为初始化完成 - INCRE_TRANSFER_STARTED：增量开始，灾备场景下为灾备中 - INCRE_TRANSFER_FAILED：增量失败，灾备场景下为灾备异常 - RELEASE_RESOURCE_STARTED：结束任务中 - RELEASE_RESOURCE_FAILED：结束任务失败 - RELEASE_RESOURCE_COMPLETE：已结束 - REBUILD_NODE_STARTED：故障恢复中 - REBUILD_NODE_FAILED：故障恢复失败 - CHANGE_JOB_STARTED：任务变更中 - CHANGE_JOB_FAILED：任务变更失败 - DELETED：已删除 - CHILD_TRANSFER_STARTING：再编辑子任务启动中 - CHILD_TRANSFER_STARTED：再编辑子任务迁移中 - CHILD_TRANSFER_COMPLETE：再编辑子任务迁移完成 - CHILD_TRANSFER_FAILED：再编辑子任务迁移失败 - RELEASE_CHILD_TRANSFER_STARTED：再编辑子任务结束中 - RELEASE_CHILD_TRANSFER_COMPLETE：再编辑子任务已结束 - NODE_UPGRADE_START：升级开始 - NODE_UPGRADE_COMPLETE：升级完成 - NODE_UPGRADE_FAILED：升级失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public QueryJobsReq withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public QueryJobsReq putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public QueryJobsReq withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public QueryJobsReq withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public QueryJobsReq addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public QueryJobsReq withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 数据库实例ID列表，最多支持10个
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public QueryJobsReq withInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }

    /**
     * DRS绑定数据库实例IP
     * @return instanceIp
     */
    public String getInstanceIp() {
        return instanceIp;
    }

    public void setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryJobsReq that = (QueryJobsReq) obj;
        return Objects.equals(this.curPage, that.curPage) && Objects.equals(this.perPage, that.perPage)
            && Objects.equals(this.dbUseType, that.dbUseType) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.netType, that.netType)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.instanceIp, that.instanceIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curPage,
            perPage,
            dbUseType,
            engineType,
            enterpriseProjectId,
            name,
            netType,
            serviceName,
            status,
            tags,
            instanceIds,
            instanceIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryJobsReq {\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    dbUseType: ").append(toIndentedString(dbUseType)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    instanceIp: ").append(toIndentedString(instanceIp)).append("\n");
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
