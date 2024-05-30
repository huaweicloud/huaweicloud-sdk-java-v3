package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表的详情信息。
 */
public class TableModelVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_table_id")

    private String parentTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_table_name")

    private String parentTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_table_code")

    private String parentTableCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_logic_table_id")

    private String relatedLogicTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_logic_table_name")

    private String relatedLogicTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_logic_table_model_id")

    private String relatedLogicTableModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_logic_table_model_name")

    private String relatedLogicTableModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private WorkspaceVO model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_format")

    private String dataFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_location")

    private String obsLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private String configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private String tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_name")

    private String tbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_info")

    private String extendInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_guid")

    private String tbGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_id")

    private String tbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_tb_name")

    private String logicTbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_tb_guid")

    private String logicTbGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_tb_id")

    private String logicTbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_catalog_id")

    private String bizCatalogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_path")

    private String catalogPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagRecordVO> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_info")

    private ApprovalVO approvalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_biz")

    private BizVersionManageVO newBiz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private List<TableModelAttributeVO> attributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mappings")

    private List<TableMappingVO> mappings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relations")

    private List<RelationVO> relations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_name")

    private String dwName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1")

    private String l1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2")

    private String l2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3")

    private String l3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1_id")

    private String l1Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2_id")

    private String l2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3_id")

    private String l3Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_conf")

    private String partitionConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dlf_task_id")

    private String dlfTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_recently_partition")

    private Boolean useRecentlyPartition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reversed")

    private Boolean reversed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_out_switch")

    private Boolean dirtyOutSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_out_database")

    private String dirtyOutDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_out_prefix")

    private String dirtyOutPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_out_suffix")

    private String dirtyOutSuffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_owner")

    private String qualityOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_id")

    private String qualityId;

    /**
     * DISTRIBUTE BY [HASH(column)|REPLICATION]。 枚举值：   - HASH: 对指定的列进行Hash，通过映射，把数据分布到指定DN   - REPLICATION: 表的每一行存在所有数据节点（DN）中，即每个数据节点都有完整的表数据 
     */
    public static final class DistributeEnum {

        /**
         * Enum HASH for value: "HASH"
         */
        public static final DistributeEnum HASH = new DistributeEnum("HASH");

        /**
         * Enum REPLICATION for value: "REPLICATION"
         */
        public static final DistributeEnum REPLICATION = new DistributeEnum("REPLICATION");

        private static final Map<String, DistributeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DistributeEnum> createStaticFields() {
            Map<String, DistributeEnum> map = new HashMap<>();
            map.put("HASH", HASH);
            map.put("REPLICATION", REPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DistributeEnum(String value) {
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
        public static DistributeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DistributeEnum(value));
        }

        public static DistributeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DistributeEnum) {
                return this.value.equals(((DistributeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distribute")

    private DistributeEnum distribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distribute_column")

    private String distributeColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_partition")

    private Boolean isPartition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_table")

    private SyncStatusEnum physicalTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_physical_table")

    private SyncStatusEnum devPhysicalTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "technical_asset")

    private SyncStatusEnum technicalAsset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_asset")

    private SyncStatusEnum businessAsset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data_link")

    private SyncStatusEnum metaDataLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_quality")

    private SyncStatusEnum dataQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary_status")

    private SyncStatusEnum summaryStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_version")

    private String devVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prod_version")

    private String prodVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_version_name")

    private String devVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prod_version_name")

    private String prodVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_type")

    private EnvTypeEnum envType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_defined_fields")

    private List<SelfDefinedFieldVO> selfDefinedFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_related_physical_table")

    private Boolean hasRelatedPhysicalTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_related_logic_table")

    private Boolean hasRelatedLogicTable;

    public TableModelVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TableModelVO withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 所属关系建模的模型ID，填写String类型替代Long类型。
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public TableModelVO withParentTableId(String parentTableId) {
        this.parentTableId = parentTableId;
        return this;
    }

    /**
     * 父表ID，填写String类型替代Long类型。
     * @return parentTableId
     */
    public String getParentTableId() {
        return parentTableId;
    }

    public void setParentTableId(String parentTableId) {
        this.parentTableId = parentTableId;
    }

    public TableModelVO withParentTableName(String parentTableName) {
        this.parentTableName = parentTableName;
        return this;
    }

    /**
     * 父表名称，只读。
     * @return parentTableName
     */
    public String getParentTableName() {
        return parentTableName;
    }

    public void setParentTableName(String parentTableName) {
        this.parentTableName = parentTableName;
    }

    public TableModelVO withParentTableCode(String parentTableCode) {
        this.parentTableCode = parentTableCode;
        return this;
    }

    /**
     * 父表编码，只读。
     * @return parentTableCode
     */
    public String getParentTableCode() {
        return parentTableCode;
    }

    public void setParentTableCode(String parentTableCode) {
        this.parentTableCode = parentTableCode;
    }

    public TableModelVO withRelatedLogicTableId(String relatedLogicTableId) {
        this.relatedLogicTableId = relatedLogicTableId;
        return this;
    }

    /**
     * 关联逻辑实体的ID，填写String类型替代Long类型。
     * @return relatedLogicTableId
     */
    public String getRelatedLogicTableId() {
        return relatedLogicTableId;
    }

    public void setRelatedLogicTableId(String relatedLogicTableId) {
        this.relatedLogicTableId = relatedLogicTableId;
    }

    public TableModelVO withRelatedLogicTableName(String relatedLogicTableName) {
        this.relatedLogicTableName = relatedLogicTableName;
        return this;
    }

    /**
     * 关联逻辑实体的名称。
     * @return relatedLogicTableName
     */
    public String getRelatedLogicTableName() {
        return relatedLogicTableName;
    }

    public void setRelatedLogicTableName(String relatedLogicTableName) {
        this.relatedLogicTableName = relatedLogicTableName;
    }

    public TableModelVO withRelatedLogicTableModelId(String relatedLogicTableModelId) {
        this.relatedLogicTableModelId = relatedLogicTableModelId;
        return this;
    }

    /**
     * 关联逻辑实体的模型ID，填写String类型替代Long类型。
     * @return relatedLogicTableModelId
     */
    public String getRelatedLogicTableModelId() {
        return relatedLogicTableModelId;
    }

    public void setRelatedLogicTableModelId(String relatedLogicTableModelId) {
        this.relatedLogicTableModelId = relatedLogicTableModelId;
    }

    public TableModelVO withRelatedLogicTableModelName(String relatedLogicTableModelName) {
        this.relatedLogicTableModelName = relatedLogicTableModelName;
        return this;
    }

    /**
     * 关联逻辑实体的模型名称。
     * @return relatedLogicTableModelName
     */
    public String getRelatedLogicTableModelName() {
        return relatedLogicTableModelName;
    }

    public void setRelatedLogicTableModelName(String relatedLogicTableModelName) {
        this.relatedLogicTableModelName = relatedLogicTableModelName;
    }

    public TableModelVO withModel(WorkspaceVO model) {
        this.model = model;
        return this;
    }

    public TableModelVO withModel(Consumer<WorkspaceVO> modelSetter) {
        if (this.model == null) {
            this.model = new WorkspaceVO();
            modelSetter.accept(this.model);
        }

        return this;
    }

    /**
     * Get model
     * @return model
     */
    public WorkspaceVO getModel() {
        return model;
    }

    public void setModel(WorkspaceVO model) {
        this.model = model;
    }

    public TableModelVO withDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * 数据格式。
     * @return dataFormat
     */
    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public TableModelVO withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * obs桶。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public TableModelVO withObsLocation(String obsLocation) {
        this.obsLocation = obsLocation;
        return this;
    }

    /**
     * 外表路径
     * @return obsLocation
     */
    public String getObsLocation() {
        return obsLocation;
    }

    public void setObsLocation(String obsLocation) {
        this.obsLocation = obsLocation;
    }

    public TableModelVO withConfigs(String configs) {
        this.configs = configs;
        return this;
    }

    /**
     * 其他配置。
     * @return configs
     */
    public String getConfigs() {
        return configs;
    }

    public void setConfigs(String configs) {
        this.configs = configs;
    }

    public TableModelVO withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型，只读。
     * @return tableType
     */
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public TableModelVO withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 负责人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TableModelVO withTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }

    /**
     * 表名。
     * @return tbName
     */
    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName;
    }

    public TableModelVO withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接ID。
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public TableModelVO withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public TableModelVO withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * dli数据连接执行sql所需的队列，数据连接类型为DLI时必须。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public TableModelVO withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * DWS类型需要。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public TableModelVO withExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    /**
     * 扩展信息。
     * @return extendInfo
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }

    public TableModelVO withTbGuid(String tbGuid) {
        this.tbGuid = tbGuid;
        return this;
    }

    /**
     * 表物化后的guid，只读。
     * @return tbGuid
     */
    public String getTbGuid() {
        return tbGuid;
    }

    public void setTbGuid(String tbGuid) {
        this.tbGuid = tbGuid;
    }

    public TableModelVO withTbId(String tbId) {
        this.tbId = tbId;
        return this;
    }

    /**
     * 数据表ID，只读。
     * @return tbId
     */
    public String getTbId() {
        return tbId;
    }

    public void setTbId(String tbId) {
        this.tbId = tbId;
    }

    public TableModelVO withLogicTbName(String logicTbName) {
        this.logicTbName = logicTbName;
        return this;
    }

    /**
     * 逻辑实体名。
     * @return logicTbName
     */
    public String getLogicTbName() {
        return logicTbName;
    }

    public void setLogicTbName(String logicTbName) {
        this.logicTbName = logicTbName;
    }

    public TableModelVO withLogicTbGuid(String logicTbGuid) {
        this.logicTbGuid = logicTbGuid;
        return this;
    }

    /**
     * 逻辑实体的guid，只读。
     * @return logicTbGuid
     */
    public String getLogicTbGuid() {
        return logicTbGuid;
    }

    public void setLogicTbGuid(String logicTbGuid) {
        this.logicTbGuid = logicTbGuid;
    }

    public TableModelVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TableModelVO withStatus(BizStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public BizStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BizStatusEnum status) {
        this.status = status;
    }

    public TableModelVO withLogicTbId(String logicTbId) {
        this.logicTbId = logicTbId;
        return this;
    }

    /**
     * 逻辑实体的ID，填写String类型替代Long类型。
     * @return logicTbId
     */
    public String getLogicTbId() {
        return logicTbId;
    }

    public void setLogicTbId(String logicTbId) {
        this.logicTbId = logicTbId;
    }

    public TableModelVO withBizCatalogId(String bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
        return this;
    }

    /**
     * 归属的业务分类的id，填写String类型替代Long类型。
     * @return bizCatalogId
     */
    public String getBizCatalogId() {
        return bizCatalogId;
    }

    public void setBizCatalogId(String bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
    }

    public TableModelVO withCatalogPath(String catalogPath) {
        this.catalogPath = catalogPath;
        return this;
    }

    /**
     * 归属的业务分类的路径 {\"l1Id\":\"\",\"l2Id\":\"\",\"l3Id\":\"\"}。
     * @return catalogPath
     */
    public String getCatalogPath() {
        return catalogPath;
    }

    public void setCatalogPath(String catalogPath) {
        this.catalogPath = catalogPath;
    }

    public TableModelVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人，只读。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public TableModelVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人，只读。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public TableModelVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public TableModelVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public TableModelVO withTags(List<TagRecordVO> tags) {
        this.tags = tags;
        return this;
    }

    public TableModelVO addTagsItem(TagRecordVO tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TableModelVO withTags(Consumer<List<TagRecordVO>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 表标签，只读。
     * @return tags
     */
    public List<TagRecordVO> getTags() {
        return tags;
    }

    public void setTags(List<TagRecordVO> tags) {
        this.tags = tags;
    }

    public TableModelVO withApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
        return this;
    }

    public TableModelVO withApprovalInfo(Consumer<ApprovalVO> approvalInfoSetter) {
        if (this.approvalInfo == null) {
            this.approvalInfo = new ApprovalVO();
            approvalInfoSetter.accept(this.approvalInfo);
        }

        return this;
    }

    /**
     * Get approvalInfo
     * @return approvalInfo
     */
    public ApprovalVO getApprovalInfo() {
        return approvalInfo;
    }

    public void setApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
    }

    public TableModelVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public TableModelVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
        if (this.newBiz == null) {
            this.newBiz = new BizVersionManageVO();
            newBizSetter.accept(this.newBiz);
        }

        return this;
    }

    /**
     * Get newBiz
     * @return newBiz
     */
    public BizVersionManageVO getNewBiz() {
        return newBiz;
    }

    public void setNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
    }

    public TableModelVO withAttributes(List<TableModelAttributeVO> attributes) {
        this.attributes = attributes;
        return this;
    }

    public TableModelVO addAttributesItem(TableModelAttributeVO attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public TableModelVO withAttributes(Consumer<List<TableModelAttributeVO>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 表属性信息。
     * @return attributes
     */
    public List<TableModelAttributeVO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<TableModelAttributeVO> attributes) {
        this.attributes = attributes;
    }

    public TableModelVO withMappings(List<TableMappingVO> mappings) {
        this.mappings = mappings;
        return this;
    }

    public TableModelVO addMappingsItem(TableMappingVO mappingsItem) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        this.mappings.add(mappingsItem);
        return this;
    }

    public TableModelVO withMappings(Consumer<List<TableMappingVO>> mappingsSetter) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        mappingsSetter.accept(this.mappings);
        return this;
    }

    /**
     * 表映射信息。
     * @return mappings
     */
    public List<TableMappingVO> getMappings() {
        return mappings;
    }

    public void setMappings(List<TableMappingVO> mappings) {
        this.mappings = mappings;
    }

    public TableModelVO withRelations(List<RelationVO> relations) {
        this.relations = relations;
        return this;
    }

    public TableModelVO addRelationsItem(RelationVO relationsItem) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        this.relations.add(relationsItem);
        return this;
    }

    public TableModelVO withRelations(Consumer<List<RelationVO>> relationsSetter) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        relationsSetter.accept(this.relations);
        return this;
    }

    /**
     * 关系。
     * @return relations
     */
    public List<RelationVO> getRelations() {
        return relations;
    }

    public void setRelations(List<RelationVO> relations) {
        this.relations = relations;
    }

    public TableModelVO withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型，对应表所在的数仓类型，取值可以为DLI、DWS、MRS_HIVE、POSTGRESQL、MRS_SPARK、CLICKHOUSE、MYSQL、ORACLE和DORIS等。
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    public TableModelVO withDwName(String dwName) {
        this.dwName = dwName;
        return this;
    }

    /**
     * 数据连接名称，只读，创建和更新时无需填写。
     * @return dwName
     */
    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    public TableModelVO withL1(String l1) {
        this.l1 = l1;
        return this;
    }

    /**
     * 主题域分组中文名，只读，创建和更新时无需填写。
     * @return l1
     */
    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public TableModelVO withL2(String l2) {
        this.l2 = l2;
        return this;
    }

    /**
     * 主题域中文名，只读，创建和更新时无需填写。
     * @return l2
     */
    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public TableModelVO withL3(String l3) {
        this.l3 = l3;
        return this;
    }

    /**
     * 业务对象中文名，只读，创建和更新时无需填写。
     * @return l3
     */
    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public TableModelVO withL1Id(String l1Id) {
        this.l1Id = l1Id;
        return this;
    }

    /**
     * 主题域分组ID，只读，填写String类型替代Long类型。
     * @return l1Id
     */
    public String getL1Id() {
        return l1Id;
    }

    public void setL1Id(String l1Id) {
        this.l1Id = l1Id;
    }

    public TableModelVO withL2Id(String l2Id) {
        this.l2Id = l2Id;
        return this;
    }

    /**
     * 主题域ID，只读，创建和更新时无需填写。
     * @return l2Id
     */
    public String getL2Id() {
        return l2Id;
    }

    public void setL2Id(String l2Id) {
        this.l2Id = l2Id;
    }

    public TableModelVO withL3Id(String l3Id) {
        this.l3Id = l3Id;
        return this;
    }

    /**
     * 业务对象ID，只读，填写String类型替代Long类型。
     * @return l3Id
     */
    public String getL3Id() {
        return l3Id;
    }

    public void setL3Id(String l3Id) {
        this.l3Id = l3Id;
    }

    public TableModelVO withPartitionConf(String partitionConf) {
        this.partitionConf = partitionConf;
        return this;
    }

    /**
     * 分区表达式。
     * @return partitionConf
     */
    public String getPartitionConf() {
        return partitionConf;
    }

    public void setPartitionConf(String partitionConf) {
        this.partitionConf = partitionConf;
    }

    public TableModelVO withDlfTaskId(String dlfTaskId) {
        this.dlfTaskId = dlfTaskId;
        return this;
    }

    /**
     * DLF作业ID。
     * @return dlfTaskId
     */
    public String getDlfTaskId() {
        return dlfTaskId;
    }

    public void setDlfTaskId(String dlfTaskId) {
        this.dlfTaskId = dlfTaskId;
    }

    public TableModelVO withUseRecentlyPartition(Boolean useRecentlyPartition) {
        this.useRecentlyPartition = useRecentlyPartition;
        return this;
    }

    /**
     * 是否使用最新分区。
     * @return useRecentlyPartition
     */
    public Boolean getUseRecentlyPartition() {
        return useRecentlyPartition;
    }

    public void setUseRecentlyPartition(Boolean useRecentlyPartition) {
        this.useRecentlyPartition = useRecentlyPartition;
    }

    public TableModelVO withReversed(Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    /**
     * 是否是逆向的。
     * @return reversed
     */
    public Boolean getReversed() {
        return reversed;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
    }

    public TableModelVO withDirtyOutSwitch(Boolean dirtyOutSwitch) {
        this.dirtyOutSwitch = dirtyOutSwitch;
        return this;
    }

    /**
     * 异常数据输出开关。
     * @return dirtyOutSwitch
     */
    public Boolean getDirtyOutSwitch() {
        return dirtyOutSwitch;
    }

    public void setDirtyOutSwitch(Boolean dirtyOutSwitch) {
        this.dirtyOutSwitch = dirtyOutSwitch;
    }

    public TableModelVO withDirtyOutDatabase(String dirtyOutDatabase) {
        this.dirtyOutDatabase = dirtyOutDatabase;
        return this;
    }

    /**
     * 异常数据输出库。
     * @return dirtyOutDatabase
     */
    public String getDirtyOutDatabase() {
        return dirtyOutDatabase;
    }

    public void setDirtyOutDatabase(String dirtyOutDatabase) {
        this.dirtyOutDatabase = dirtyOutDatabase;
    }

    public TableModelVO withDirtyOutPrefix(String dirtyOutPrefix) {
        this.dirtyOutPrefix = dirtyOutPrefix;
        return this;
    }

    /**
     * 异常表前缀。
     * @return dirtyOutPrefix
     */
    public String getDirtyOutPrefix() {
        return dirtyOutPrefix;
    }

    public void setDirtyOutPrefix(String dirtyOutPrefix) {
        this.dirtyOutPrefix = dirtyOutPrefix;
    }

    public TableModelVO withDirtyOutSuffix(String dirtyOutSuffix) {
        this.dirtyOutSuffix = dirtyOutSuffix;
        return this;
    }

    /**
     * 异常表后缀。
     * @return dirtyOutSuffix
     */
    public String getDirtyOutSuffix() {
        return dirtyOutSuffix;
    }

    public void setDirtyOutSuffix(String dirtyOutSuffix) {
        this.dirtyOutSuffix = dirtyOutSuffix;
    }

    public TableModelVO withQualityOwner(String qualityOwner) {
        this.qualityOwner = qualityOwner;
        return this;
    }

    /**
     * 质量责任人。
     * @return qualityOwner
     */
    public String getQualityOwner() {
        return qualityOwner;
    }

    public void setQualityOwner(String qualityOwner) {
        this.qualityOwner = qualityOwner;
    }

    public TableModelVO withQualityId(String qualityId) {
        this.qualityId = qualityId;
        return this;
    }

    /**
     * 质量ID，填写String类型替代Long类型。
     * @return qualityId
     */
    public String getQualityId() {
        return qualityId;
    }

    public void setQualityId(String qualityId) {
        this.qualityId = qualityId;
    }

    public TableModelVO withDistribute(DistributeEnum distribute) {
        this.distribute = distribute;
        return this;
    }

    /**
     * DISTRIBUTE BY [HASH(column)|REPLICATION]。 枚举值：   - HASH: 对指定的列进行Hash，通过映射，把数据分布到指定DN   - REPLICATION: 表的每一行存在所有数据节点（DN）中，即每个数据节点都有完整的表数据 
     * @return distribute
     */
    public DistributeEnum getDistribute() {
        return distribute;
    }

    public void setDistribute(DistributeEnum distribute) {
        this.distribute = distribute;
    }

    public TableModelVO withDistributeColumn(String distributeColumn) {
        this.distributeColumn = distributeColumn;
        return this;
    }

    /**
     * DISTRIBUTE BY HASH column.
     * @return distributeColumn
     */
    public String getDistributeColumn() {
        return distributeColumn;
    }

    public void setDistributeColumn(String distributeColumn) {
        this.distributeColumn = distributeColumn;
    }

    public TableModelVO withIsPartition(Boolean isPartition) {
        this.isPartition = isPartition;
        return this;
    }

    /**
     * 是否分区表，只读。
     * @return isPartition
     */
    public Boolean getIsPartition() {
        return isPartition;
    }

    public void setIsPartition(Boolean isPartition) {
        this.isPartition = isPartition;
    }

    public TableModelVO withPhysicalTable(SyncStatusEnum physicalTable) {
        this.physicalTable = physicalTable;
        return this;
    }

    /**
     * Get physicalTable
     * @return physicalTable
     */
    public SyncStatusEnum getPhysicalTable() {
        return physicalTable;
    }

    public void setPhysicalTable(SyncStatusEnum physicalTable) {
        this.physicalTable = physicalTable;
    }

    public TableModelVO withDevPhysicalTable(SyncStatusEnum devPhysicalTable) {
        this.devPhysicalTable = devPhysicalTable;
        return this;
    }

    /**
     * Get devPhysicalTable
     * @return devPhysicalTable
     */
    public SyncStatusEnum getDevPhysicalTable() {
        return devPhysicalTable;
    }

    public void setDevPhysicalTable(SyncStatusEnum devPhysicalTable) {
        this.devPhysicalTable = devPhysicalTable;
    }

    public TableModelVO withTechnicalAsset(SyncStatusEnum technicalAsset) {
        this.technicalAsset = technicalAsset;
        return this;
    }

    /**
     * Get technicalAsset
     * @return technicalAsset
     */
    public SyncStatusEnum getTechnicalAsset() {
        return technicalAsset;
    }

    public void setTechnicalAsset(SyncStatusEnum technicalAsset) {
        this.technicalAsset = technicalAsset;
    }

    public TableModelVO withBusinessAsset(SyncStatusEnum businessAsset) {
        this.businessAsset = businessAsset;
        return this;
    }

    /**
     * Get businessAsset
     * @return businessAsset
     */
    public SyncStatusEnum getBusinessAsset() {
        return businessAsset;
    }

    public void setBusinessAsset(SyncStatusEnum businessAsset) {
        this.businessAsset = businessAsset;
    }

    public TableModelVO withMetaDataLink(SyncStatusEnum metaDataLink) {
        this.metaDataLink = metaDataLink;
        return this;
    }

    /**
     * Get metaDataLink
     * @return metaDataLink
     */
    public SyncStatusEnum getMetaDataLink() {
        return metaDataLink;
    }

    public void setMetaDataLink(SyncStatusEnum metaDataLink) {
        this.metaDataLink = metaDataLink;
    }

    public TableModelVO withDataQuality(SyncStatusEnum dataQuality) {
        this.dataQuality = dataQuality;
        return this;
    }

    /**
     * Get dataQuality
     * @return dataQuality
     */
    public SyncStatusEnum getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(SyncStatusEnum dataQuality) {
        this.dataQuality = dataQuality;
    }

    public TableModelVO withSummaryStatus(SyncStatusEnum summaryStatus) {
        this.summaryStatus = summaryStatus;
        return this;
    }

    /**
     * Get summaryStatus
     * @return summaryStatus
     */
    public SyncStatusEnum getSummaryStatus() {
        return summaryStatus;
    }

    public void setSummaryStatus(SyncStatusEnum summaryStatus) {
        this.summaryStatus = summaryStatus;
    }

    public TableModelVO withDevVersion(String devVersion) {
        this.devVersion = devVersion;
        return this;
    }

    /**
     * 开发环境版本，填写String类型替代Long类型。
     * @return devVersion
     */
    public String getDevVersion() {
        return devVersion;
    }

    public void setDevVersion(String devVersion) {
        this.devVersion = devVersion;
    }

    public TableModelVO withProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }

    /**
     * 生产环境版本，填写String类型替代Long类型。
     * @return prodVersion
     */
    public String getProdVersion() {
        return prodVersion;
    }

    public void setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
    }

    public TableModelVO withDevVersionName(String devVersionName) {
        this.devVersionName = devVersionName;
        return this;
    }

    /**
     * 开发环境版本名称。
     * @return devVersionName
     */
    public String getDevVersionName() {
        return devVersionName;
    }

    public void setDevVersionName(String devVersionName) {
        this.devVersionName = devVersionName;
    }

    public TableModelVO withProdVersionName(String prodVersionName) {
        this.prodVersionName = prodVersionName;
        return this;
    }

    /**
     * 生产环境版本名称。
     * @return prodVersionName
     */
    public String getProdVersionName() {
        return prodVersionName;
    }

    public void setProdVersionName(String prodVersionName) {
        this.prodVersionName = prodVersionName;
    }

    public TableModelVO withEnvType(EnvTypeEnum envType) {
        this.envType = envType;
        return this;
    }

    /**
     * Get envType
     * @return envType
     */
    public EnvTypeEnum getEnvType() {
        return envType;
    }

    public void setEnvType(EnvTypeEnum envType) {
        this.envType = envType;
    }

    public TableModelVO withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public TableModelVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public TableModelVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public TableModelVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        selfDefinedFieldsSetter.accept(this.selfDefinedFields);
        return this;
    }

    /**
     * 自定义项。
     * @return selfDefinedFields
     */
    public List<SelfDefinedFieldVO> getSelfDefinedFields() {
        return selfDefinedFields;
    }

    public void setSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
    }

    public TableModelVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public TableModelVO withHasRelatedPhysicalTable(Boolean hasRelatedPhysicalTable) {
        this.hasRelatedPhysicalTable = hasRelatedPhysicalTable;
        return this;
    }

    /**
     * 是否存在关联物理表。
     * @return hasRelatedPhysicalTable
     */
    public Boolean getHasRelatedPhysicalTable() {
        return hasRelatedPhysicalTable;
    }

    public void setHasRelatedPhysicalTable(Boolean hasRelatedPhysicalTable) {
        this.hasRelatedPhysicalTable = hasRelatedPhysicalTable;
    }

    public TableModelVO withHasRelatedLogicTable(Boolean hasRelatedLogicTable) {
        this.hasRelatedLogicTable = hasRelatedLogicTable;
        return this;
    }

    /**
     * 是否存在关联逻辑实体。
     * @return hasRelatedLogicTable
     */
    public Boolean getHasRelatedLogicTable() {
        return hasRelatedLogicTable;
    }

    public void setHasRelatedLogicTable(Boolean hasRelatedLogicTable) {
        this.hasRelatedLogicTable = hasRelatedLogicTable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableModelVO that = (TableModelVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.modelId, that.modelId)
            && Objects.equals(this.parentTableId, that.parentTableId)
            && Objects.equals(this.parentTableName, that.parentTableName)
            && Objects.equals(this.parentTableCode, that.parentTableCode)
            && Objects.equals(this.relatedLogicTableId, that.relatedLogicTableId)
            && Objects.equals(this.relatedLogicTableName, that.relatedLogicTableName)
            && Objects.equals(this.relatedLogicTableModelId, that.relatedLogicTableModelId)
            && Objects.equals(this.relatedLogicTableModelName, that.relatedLogicTableModelName)
            && Objects.equals(this.model, that.model) && Objects.equals(this.dataFormat, that.dataFormat)
            && Objects.equals(this.obsBucket, that.obsBucket) && Objects.equals(this.obsLocation, that.obsLocation)
            && Objects.equals(this.configs, that.configs) && Objects.equals(this.tableType, that.tableType)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.tbName, that.tbName)
            && Objects.equals(this.dwId, that.dwId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.queueName, that.queueName) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.extendInfo, that.extendInfo) && Objects.equals(this.tbGuid, that.tbGuid)
            && Objects.equals(this.tbId, that.tbId) && Objects.equals(this.logicTbName, that.logicTbName)
            && Objects.equals(this.logicTbGuid, that.logicTbGuid) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.logicTbId, that.logicTbId)
            && Objects.equals(this.bizCatalogId, that.bizCatalogId)
            && Objects.equals(this.catalogPath, that.catalogPath) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.approvalInfo, that.approvalInfo) && Objects.equals(this.newBiz, that.newBiz)
            && Objects.equals(this.attributes, that.attributes) && Objects.equals(this.mappings, that.mappings)
            && Objects.equals(this.relations, that.relations) && Objects.equals(this.dwType, that.dwType)
            && Objects.equals(this.dwName, that.dwName) && Objects.equals(this.l1, that.l1)
            && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.l1Id, that.l1Id) && Objects.equals(this.l2Id, that.l2Id)
            && Objects.equals(this.l3Id, that.l3Id) && Objects.equals(this.partitionConf, that.partitionConf)
            && Objects.equals(this.dlfTaskId, that.dlfTaskId)
            && Objects.equals(this.useRecentlyPartition, that.useRecentlyPartition)
            && Objects.equals(this.reversed, that.reversed) && Objects.equals(this.dirtyOutSwitch, that.dirtyOutSwitch)
            && Objects.equals(this.dirtyOutDatabase, that.dirtyOutDatabase)
            && Objects.equals(this.dirtyOutPrefix, that.dirtyOutPrefix)
            && Objects.equals(this.dirtyOutSuffix, that.dirtyOutSuffix)
            && Objects.equals(this.qualityOwner, that.qualityOwner) && Objects.equals(this.qualityId, that.qualityId)
            && Objects.equals(this.distribute, that.distribute)
            && Objects.equals(this.distributeColumn, that.distributeColumn)
            && Objects.equals(this.isPartition, that.isPartition)
            && Objects.equals(this.physicalTable, that.physicalTable)
            && Objects.equals(this.devPhysicalTable, that.devPhysicalTable)
            && Objects.equals(this.technicalAsset, that.technicalAsset)
            && Objects.equals(this.businessAsset, that.businessAsset)
            && Objects.equals(this.metaDataLink, that.metaDataLink)
            && Objects.equals(this.dataQuality, that.dataQuality)
            && Objects.equals(this.summaryStatus, that.summaryStatus)
            && Objects.equals(this.devVersion, that.devVersion) && Objects.equals(this.prodVersion, that.prodVersion)
            && Objects.equals(this.devVersionName, that.devVersionName)
            && Objects.equals(this.prodVersionName, that.prodVersionName) && Objects.equals(this.envType, that.envType)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.selfDefinedFields, that.selfDefinedFields)
            && Objects.equals(this.code, that.code)
            && Objects.equals(this.hasRelatedPhysicalTable, that.hasRelatedPhysicalTable)
            && Objects.equals(this.hasRelatedLogicTable, that.hasRelatedLogicTable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            modelId,
            parentTableId,
            parentTableName,
            parentTableCode,
            relatedLogicTableId,
            relatedLogicTableName,
            relatedLogicTableModelId,
            relatedLogicTableModelName,
            model,
            dataFormat,
            obsBucket,
            obsLocation,
            configs,
            tableType,
            owner,
            tbName,
            dwId,
            dbName,
            queueName,
            schema,
            extendInfo,
            tbGuid,
            tbId,
            logicTbName,
            logicTbGuid,
            description,
            status,
            logicTbId,
            bizCatalogId,
            catalogPath,
            createBy,
            updateBy,
            createTime,
            updateTime,
            tags,
            approvalInfo,
            newBiz,
            attributes,
            mappings,
            relations,
            dwType,
            dwName,
            l1,
            l2,
            l3,
            l1Id,
            l2Id,
            l3Id,
            partitionConf,
            dlfTaskId,
            useRecentlyPartition,
            reversed,
            dirtyOutSwitch,
            dirtyOutDatabase,
            dirtyOutPrefix,
            dirtyOutSuffix,
            qualityOwner,
            qualityId,
            distribute,
            distributeColumn,
            isPartition,
            physicalTable,
            devPhysicalTable,
            technicalAsset,
            businessAsset,
            metaDataLink,
            dataQuality,
            summaryStatus,
            devVersion,
            prodVersion,
            devVersionName,
            prodVersionName,
            envType,
            alias,
            selfDefinedFields,
            code,
            hasRelatedPhysicalTable,
            hasRelatedLogicTable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableModelVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    parentTableId: ").append(toIndentedString(parentTableId)).append("\n");
        sb.append("    parentTableName: ").append(toIndentedString(parentTableName)).append("\n");
        sb.append("    parentTableCode: ").append(toIndentedString(parentTableCode)).append("\n");
        sb.append("    relatedLogicTableId: ").append(toIndentedString(relatedLogicTableId)).append("\n");
        sb.append("    relatedLogicTableName: ").append(toIndentedString(relatedLogicTableName)).append("\n");
        sb.append("    relatedLogicTableModelId: ").append(toIndentedString(relatedLogicTableModelId)).append("\n");
        sb.append("    relatedLogicTableModelName: ").append(toIndentedString(relatedLogicTableModelName)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    obsLocation: ").append(toIndentedString(obsLocation)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    tbName: ").append(toIndentedString(tbName)).append("\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
        sb.append("    tbGuid: ").append(toIndentedString(tbGuid)).append("\n");
        sb.append("    tbId: ").append(toIndentedString(tbId)).append("\n");
        sb.append("    logicTbName: ").append(toIndentedString(logicTbName)).append("\n");
        sb.append("    logicTbGuid: ").append(toIndentedString(logicTbGuid)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    logicTbId: ").append(toIndentedString(logicTbId)).append("\n");
        sb.append("    bizCatalogId: ").append(toIndentedString(bizCatalogId)).append("\n");
        sb.append("    catalogPath: ").append(toIndentedString(catalogPath)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    approvalInfo: ").append(toIndentedString(approvalInfo)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
        sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    dwName: ").append(toIndentedString(dwName)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    l1Id: ").append(toIndentedString(l1Id)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    l3Id: ").append(toIndentedString(l3Id)).append("\n");
        sb.append("    partitionConf: ").append(toIndentedString(partitionConf)).append("\n");
        sb.append("    dlfTaskId: ").append(toIndentedString(dlfTaskId)).append("\n");
        sb.append("    useRecentlyPartition: ").append(toIndentedString(useRecentlyPartition)).append("\n");
        sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
        sb.append("    dirtyOutSwitch: ").append(toIndentedString(dirtyOutSwitch)).append("\n");
        sb.append("    dirtyOutDatabase: ").append(toIndentedString(dirtyOutDatabase)).append("\n");
        sb.append("    dirtyOutPrefix: ").append(toIndentedString(dirtyOutPrefix)).append("\n");
        sb.append("    dirtyOutSuffix: ").append(toIndentedString(dirtyOutSuffix)).append("\n");
        sb.append("    qualityOwner: ").append(toIndentedString(qualityOwner)).append("\n");
        sb.append("    qualityId: ").append(toIndentedString(qualityId)).append("\n");
        sb.append("    distribute: ").append(toIndentedString(distribute)).append("\n");
        sb.append("    distributeColumn: ").append(toIndentedString(distributeColumn)).append("\n");
        sb.append("    isPartition: ").append(toIndentedString(isPartition)).append("\n");
        sb.append("    physicalTable: ").append(toIndentedString(physicalTable)).append("\n");
        sb.append("    devPhysicalTable: ").append(toIndentedString(devPhysicalTable)).append("\n");
        sb.append("    technicalAsset: ").append(toIndentedString(technicalAsset)).append("\n");
        sb.append("    businessAsset: ").append(toIndentedString(businessAsset)).append("\n");
        sb.append("    metaDataLink: ").append(toIndentedString(metaDataLink)).append("\n");
        sb.append("    dataQuality: ").append(toIndentedString(dataQuality)).append("\n");
        sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
        sb.append("    devVersion: ").append(toIndentedString(devVersion)).append("\n");
        sb.append("    prodVersion: ").append(toIndentedString(prodVersion)).append("\n");
        sb.append("    devVersionName: ").append(toIndentedString(devVersionName)).append("\n");
        sb.append("    prodVersionName: ").append(toIndentedString(prodVersionName)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    selfDefinedFields: ").append(toIndentedString(selfDefinedFields)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    hasRelatedPhysicalTable: ").append(toIndentedString(hasRelatedPhysicalTable)).append("\n");
        sb.append("    hasRelatedLogicTable: ").append(toIndentedString(hasRelatedLogicTable)).append("\n");
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
