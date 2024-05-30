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
 * 汇总表值对象（VO）。
 */
public class AggregationLogicTableVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_name")

    private String tbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_logic_name")

    private String tbLogicName;

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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private SecretTypeEnum secretType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_bg")

    private ApplyBgEnum applyBg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_id")

    private String tbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_name")

    private String dwName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_guid")

    private String tbGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_logic_guid")

    private String tbLogicGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

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
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_info")

    private ApprovalVO approvalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_biz")

    private BizVersionManageVO newBiz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_group")

    private String dimensionGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_code")

    private String groupCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_period")

    private AggregationLogicTableAttributeVO timePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_attributes")

    private List<AggregationLogicTableAttributeVO> tableAttributes = null;

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
    @JsonProperty(value = "dlf_task")

    private SyncStatusEnum dlfTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_to_dlm")

    private SyncStatusEnum publishToDlm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary_status")

    private SyncStatusEnum summaryStatus;

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

    /**
     * DWS数据压缩等级，列压缩等级为no/low/middle/high，行压缩等级为no/yes。 枚举值：   - \"NO\": 不压缩   - \"YES\": 压缩   - \"LOW\": 低等级压缩   - \"MIDDLE\": 中等级压缩   - \"HIGH\": 高等级压缩 
     */
    public static final class CompressionEnum {

        /**
         * Enum NO for value: "NO"
         */
        public static final CompressionEnum NO = new CompressionEnum("NO");

        /**
         * Enum YES for value: "YES"
         */
        public static final CompressionEnum YES = new CompressionEnum("YES");

        /**
         * Enum LOW for value: "LOW"
         */
        public static final CompressionEnum LOW = new CompressionEnum("LOW");

        /**
         * Enum MIDDLE for value: "MIDDLE"
         */
        public static final CompressionEnum MIDDLE = new CompressionEnum("MIDDLE");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final CompressionEnum HIGH = new CompressionEnum("HIGH");

        private static final Map<String, CompressionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompressionEnum> createStaticFields() {
            Map<String, CompressionEnum> map = new HashMap<>();
            map.put("NO", NO);
            map.put("YES", YES);
            map.put("LOW", LOW);
            map.put("MIDDLE", MIDDLE);
            map.put("HIGH", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompressionEnum(String value) {
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
        public static CompressionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CompressionEnum(value));
        }

        public static CompressionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompressionEnum) {
                return this.value.equals(((CompressionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compression")

    private CompressionEnum compression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_location")

    private String obsLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_combine_field")

    private String preCombineField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private String tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dlf_task_id")

    private String dlfTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_id")

    private String qualityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reversed")

    private Boolean reversed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_version")

    private Integer tableVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_conf")

    private String partitionConf;

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
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private String configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_defined_fields")

    private List<SelfDefinedFieldVO> selfDefinedFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

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

    public AggregationLogicTableVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 汇总表的唯一系统ID，更新时必填，创建时不须填写，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AggregationLogicTableVO withTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }

    /**
     * 汇总表英文名称，对应实际的物理表名。
     * @return tbName
     */
    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName;
    }

    public AggregationLogicTableVO withTbLogicName(String tbLogicName) {
        this.tbLogicName = tbLogicName;
        return this;
    }

    /**
     * 汇总表的中文名，用于展示使用。
     * @return tbLogicName
     */
    public String getTbLogicName() {
        return tbLogicName;
    }

    public void setTbLogicName(String tbLogicName) {
        this.tbLogicName = tbLogicName;
    }

    public AggregationLogicTableVO withL1Id(String l1Id) {
        this.l1Id = l1Id;
        return this;
    }

    /**
     * 主题域分组ID，只读，创建和更新时无需填写，填写String类型替代Long类型。
     * @return l1Id
     */
    public String getL1Id() {
        return l1Id;
    }

    public void setL1Id(String l1Id) {
        this.l1Id = l1Id;
    }

    public AggregationLogicTableVO withL2Id(String l2Id) {
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

    public AggregationLogicTableVO withL3Id(String l3Id) {
        this.l3Id = l3Id;
        return this;
    }

    /**
     * 汇总表所属主题的ID，必填，填写String类型替代Long类型。
     * @return l3Id
     */
    public String getL3Id() {
        return l3Id;
    }

    public void setL3Id(String l3Id) {
        this.l3Id = l3Id;
    }

    public AggregationLogicTableVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 汇总表描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AggregationLogicTableVO withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 汇总表的资产责任人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public AggregationLogicTableVO withSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * Get secretType
     * @return secretType
     */
    public SecretTypeEnum getSecretType() {
        return secretType;
    }

    public void setSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
    }

    public AggregationLogicTableVO withApplyBg(ApplyBgEnum applyBg) {
        this.applyBg = applyBg;
        return this;
    }

    /**
     * Get applyBg
     * @return applyBg
     */
    public ApplyBgEnum getApplyBg() {
        return applyBg;
    }

    public void setApplyBg(ApplyBgEnum applyBg) {
        this.applyBg = applyBg;
    }

    public AggregationLogicTableVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 汇总表的创建人，只读，创建和更新时无需填写。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public AggregationLogicTableVO withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * dli数据连接执行sql所需的队列，数据连接类型为DLI时必须填写。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public AggregationLogicTableVO withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 汇总表所在的数据连接ID，为32位十六进制数字。
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public AggregationLogicTableVO withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 汇总表所在的数据库名。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public AggregationLogicTableVO withTbId(String tbId) {
        this.tbId = tbId;
        return this;
    }

    /**
     * 汇总表创建的表ID，是服务内部ID，只读，创建和更新时无需填写
     * @return tbId
     */
    public String getTbId() {
        return tbId;
    }

    public void setTbId(String tbId) {
        this.tbId = tbId;
    }

    public AggregationLogicTableVO withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 汇总表所在的Schema名，DWS类型必须填写。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public AggregationLogicTableVO withDwName(String dwName) {
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

    public AggregationLogicTableVO withStatus(BizStatusEnum status) {
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

    public AggregationLogicTableVO withTbGuid(String tbGuid) {
        this.tbGuid = tbGuid;
        return this;
    }

    /**
     * 表发布后，创建的数据目录技术资产guid，只读，创建和更新时无需填写。
     * @return tbGuid
     */
    public String getTbGuid() {
        return tbGuid;
    }

    public void setTbGuid(String tbGuid) {
        this.tbGuid = tbGuid;
    }

    public AggregationLogicTableVO withTbLogicGuid(String tbLogicGuid) {
        this.tbLogicGuid = tbLogicGuid;
        return this;
    }

    /**
     * 表发布后，创建的数据目录业务资产guid，只读，创建和更新时无需填写。
     * @return tbLogicGuid
     */
    public String getTbLogicGuid() {
        return tbLogicGuid;
    }

    public void setTbLogicGuid(String tbLogicGuid) {
        this.tbLogicGuid = tbLogicGuid;
    }

    public AggregationLogicTableVO withDwType(String dwType) {
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

    public AggregationLogicTableVO withL1(String l1) {
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

    public AggregationLogicTableVO withL2(String l2) {
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

    public AggregationLogicTableVO withL3(String l3) {
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

    public AggregationLogicTableVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，只读，创建和更新时无需填写。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public AggregationLogicTableVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，只读，创建和更新时无需填写。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public AggregationLogicTableVO withApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
        return this;
    }

    public AggregationLogicTableVO withApprovalInfo(Consumer<ApprovalVO> approvalInfoSetter) {
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

    public AggregationLogicTableVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public AggregationLogicTableVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
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

    public AggregationLogicTableVO withDimensionGroup(String dimensionGroup) {
        this.dimensionGroup = dimensionGroup;
        return this;
    }

    /**
     * 颗粒度ID。
     * @return dimensionGroup
     */
    public String getDimensionGroup() {
        return dimensionGroup;
    }

    public void setDimensionGroup(String dimensionGroup) {
        this.dimensionGroup = dimensionGroup;
    }

    public AggregationLogicTableVO withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 颗粒度名称，只读。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public AggregationLogicTableVO withGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }

    /**
     * 颗粒度编码，只读。
     * @return groupCode
     */
    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public AggregationLogicTableVO withTimePeriod(AggregationLogicTableAttributeVO timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    public AggregationLogicTableVO withTimePeriod(Consumer<AggregationLogicTableAttributeVO> timePeriodSetter) {
        if (this.timePeriod == null) {
            this.timePeriod = new AggregationLogicTableAttributeVO();
            timePeriodSetter.accept(this.timePeriod);
        }

        return this;
    }

    /**
     * Get timePeriod
     * @return timePeriod
     */
    public AggregationLogicTableAttributeVO getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(AggregationLogicTableAttributeVO timePeriod) {
        this.timePeriod = timePeriod;
    }

    public AggregationLogicTableVO withTableAttributes(List<AggregationLogicTableAttributeVO> tableAttributes) {
        this.tableAttributes = tableAttributes;
        return this;
    }

    public AggregationLogicTableVO addTableAttributesItem(AggregationLogicTableAttributeVO tableAttributesItem) {
        if (this.tableAttributes == null) {
            this.tableAttributes = new ArrayList<>();
        }
        this.tableAttributes.add(tableAttributesItem);
        return this;
    }

    public AggregationLogicTableVO withTableAttributes(
        Consumer<List<AggregationLogicTableAttributeVO>> tableAttributesSetter) {
        if (this.tableAttributes == null) {
            this.tableAttributes = new ArrayList<>();
        }
        tableAttributesSetter.accept(this.tableAttributes);
        return this;
    }

    /**
     * 汇总表属性信息，依据attribute_type判断类型。
     * @return tableAttributes
     */
    public List<AggregationLogicTableAttributeVO> getTableAttributes() {
        return tableAttributes;
    }

    public void setTableAttributes(List<AggregationLogicTableAttributeVO> tableAttributes) {
        this.tableAttributes = tableAttributes;
    }

    public AggregationLogicTableVO withPhysicalTable(SyncStatusEnum physicalTable) {
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

    public AggregationLogicTableVO withDevPhysicalTable(SyncStatusEnum devPhysicalTable) {
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

    public AggregationLogicTableVO withTechnicalAsset(SyncStatusEnum technicalAsset) {
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

    public AggregationLogicTableVO withBusinessAsset(SyncStatusEnum businessAsset) {
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

    public AggregationLogicTableVO withMetaDataLink(SyncStatusEnum metaDataLink) {
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

    public AggregationLogicTableVO withDataQuality(SyncStatusEnum dataQuality) {
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

    public AggregationLogicTableVO withDlfTask(SyncStatusEnum dlfTask) {
        this.dlfTask = dlfTask;
        return this;
    }

    /**
     * Get dlfTask
     * @return dlfTask
     */
    public SyncStatusEnum getDlfTask() {
        return dlfTask;
    }

    public void setDlfTask(SyncStatusEnum dlfTask) {
        this.dlfTask = dlfTask;
    }

    public AggregationLogicTableVO withPublishToDlm(SyncStatusEnum publishToDlm) {
        this.publishToDlm = publishToDlm;
        return this;
    }

    /**
     * Get publishToDlm
     * @return publishToDlm
     */
    public SyncStatusEnum getPublishToDlm() {
        return publishToDlm;
    }

    public void setPublishToDlm(SyncStatusEnum publishToDlm) {
        this.publishToDlm = publishToDlm;
    }

    public AggregationLogicTableVO withSummaryStatus(SyncStatusEnum summaryStatus) {
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

    public AggregationLogicTableVO withDistribute(DistributeEnum distribute) {
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

    public AggregationLogicTableVO withDistributeColumn(String distributeColumn) {
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

    public AggregationLogicTableVO withCompression(CompressionEnum compression) {
        this.compression = compression;
        return this;
    }

    /**
     * DWS数据压缩等级，列压缩等级为no/low/middle/high，行压缩等级为no/yes。 枚举值：   - \"NO\": 不压缩   - \"YES\": 压缩   - \"LOW\": 低等级压缩   - \"MIDDLE\": 中等级压缩   - \"HIGH\": 高等级压缩 
     * @return compression
     */
    public CompressionEnum getCompression() {
        return compression;
    }

    public void setCompression(CompressionEnum compression) {
        this.compression = compression;
    }

    public AggregationLogicTableVO withObsLocation(String obsLocation) {
        this.obsLocation = obsLocation;
        return this;
    }

    /**
     * 外表路径。
     * @return obsLocation
     */
    public String getObsLocation() {
        return obsLocation;
    }

    public void setObsLocation(String obsLocation) {
        this.obsLocation = obsLocation;
    }

    public AggregationLogicTableVO withPreCombineField(String preCombineField) {
        this.preCombineField = preCombineField;
        return this;
    }

    /**
     * 版本字段。
     * @return preCombineField
     */
    public String getPreCombineField() {
        return preCombineField;
    }

    public void setPreCombineField(String preCombineField) {
        this.preCombineField = preCombineField;
    }

    public AggregationLogicTableVO withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型。
     * @return tableType
     */
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public AggregationLogicTableVO withDlfTaskId(String dlfTaskId) {
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

    public AggregationLogicTableVO withQualityId(String qualityId) {
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

    public AggregationLogicTableVO withReversed(Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    /**
     * 是否是逆向的，只读。
     * @return reversed
     */
    public Boolean getReversed() {
        return reversed;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
    }

    public AggregationLogicTableVO withTableVersion(Integer tableVersion) {
        this.tableVersion = tableVersion;
        return this;
    }

    /**
     * 为2时，表示汇总表是汇总生成的，只读。
     * @return tableVersion
     */
    public Integer getTableVersion() {
        return tableVersion;
    }

    public void setTableVersion(Integer tableVersion) {
        this.tableVersion = tableVersion;
    }

    public AggregationLogicTableVO withPartitionConf(String partitionConf) {
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

    public AggregationLogicTableVO withDirtyOutSwitch(Boolean dirtyOutSwitch) {
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

    public AggregationLogicTableVO withDirtyOutDatabase(String dirtyOutDatabase) {
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

    public AggregationLogicTableVO withDirtyOutPrefix(String dirtyOutPrefix) {
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

    public AggregationLogicTableVO withDirtyOutSuffix(String dirtyOutSuffix) {
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

    public AggregationLogicTableVO withAlias(String alias) {
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

    public AggregationLogicTableVO withConfigs(String configs) {
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

    public AggregationLogicTableVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public AggregationLogicTableVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public AggregationLogicTableVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
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

    public AggregationLogicTableVO withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * API ID。
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public AggregationLogicTableVO withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 汇总表绑定的SQL。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public AggregationLogicTableVO withDevVersion(String devVersion) {
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

    public AggregationLogicTableVO withProdVersion(String prodVersion) {
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

    public AggregationLogicTableVO withDevVersionName(String devVersionName) {
        this.devVersionName = devVersionName;
        return this;
    }

    /**
     * 开发环境版本名称
     * @return devVersionName
     */
    public String getDevVersionName() {
        return devVersionName;
    }

    public void setDevVersionName(String devVersionName) {
        this.devVersionName = devVersionName;
    }

    public AggregationLogicTableVO withProdVersionName(String prodVersionName) {
        this.prodVersionName = prodVersionName;
        return this;
    }

    /**
     * 生产环境版本名称
     * @return prodVersionName
     */
    public String getProdVersionName() {
        return prodVersionName;
    }

    public void setProdVersionName(String prodVersionName) {
        this.prodVersionName = prodVersionName;
    }

    public AggregationLogicTableVO withEnvType(EnvTypeEnum envType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AggregationLogicTableVO that = (AggregationLogicTableVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tbName, that.tbName)
            && Objects.equals(this.tbLogicName, that.tbLogicName) && Objects.equals(this.l1Id, that.l1Id)
            && Objects.equals(this.l2Id, that.l2Id) && Objects.equals(this.l3Id, that.l3Id)
            && Objects.equals(this.description, that.description) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.secretType, that.secretType) && Objects.equals(this.applyBg, that.applyBg)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.dwId, that.dwId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.tbId, that.tbId) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.dwName, that.dwName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tbGuid, that.tbGuid) && Objects.equals(this.tbLogicGuid, that.tbLogicGuid)
            && Objects.equals(this.dwType, that.dwType) && Objects.equals(this.l1, that.l1)
            && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.approvalInfo, that.approvalInfo) && Objects.equals(this.newBiz, that.newBiz)
            && Objects.equals(this.dimensionGroup, that.dimensionGroup)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupCode, that.groupCode)
            && Objects.equals(this.timePeriod, that.timePeriod)
            && Objects.equals(this.tableAttributes, that.tableAttributes)
            && Objects.equals(this.physicalTable, that.physicalTable)
            && Objects.equals(this.devPhysicalTable, that.devPhysicalTable)
            && Objects.equals(this.technicalAsset, that.technicalAsset)
            && Objects.equals(this.businessAsset, that.businessAsset)
            && Objects.equals(this.metaDataLink, that.metaDataLink)
            && Objects.equals(this.dataQuality, that.dataQuality) && Objects.equals(this.dlfTask, that.dlfTask)
            && Objects.equals(this.publishToDlm, that.publishToDlm)
            && Objects.equals(this.summaryStatus, that.summaryStatus)
            && Objects.equals(this.distribute, that.distribute)
            && Objects.equals(this.distributeColumn, that.distributeColumn)
            && Objects.equals(this.compression, that.compression) && Objects.equals(this.obsLocation, that.obsLocation)
            && Objects.equals(this.preCombineField, that.preCombineField)
            && Objects.equals(this.tableType, that.tableType) && Objects.equals(this.dlfTaskId, that.dlfTaskId)
            && Objects.equals(this.qualityId, that.qualityId) && Objects.equals(this.reversed, that.reversed)
            && Objects.equals(this.tableVersion, that.tableVersion)
            && Objects.equals(this.partitionConf, that.partitionConf)
            && Objects.equals(this.dirtyOutSwitch, that.dirtyOutSwitch)
            && Objects.equals(this.dirtyOutDatabase, that.dirtyOutDatabase)
            && Objects.equals(this.dirtyOutPrefix, that.dirtyOutPrefix)
            && Objects.equals(this.dirtyOutSuffix, that.dirtyOutSuffix) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.configs, that.configs)
            && Objects.equals(this.selfDefinedFields, that.selfDefinedFields) && Objects.equals(this.apiId, that.apiId)
            && Objects.equals(this.sql, that.sql) && Objects.equals(this.devVersion, that.devVersion)
            && Objects.equals(this.prodVersion, that.prodVersion)
            && Objects.equals(this.devVersionName, that.devVersionName)
            && Objects.equals(this.prodVersionName, that.prodVersionName) && Objects.equals(this.envType, that.envType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tbName,
            tbLogicName,
            l1Id,
            l2Id,
            l3Id,
            description,
            owner,
            secretType,
            applyBg,
            createBy,
            queueName,
            dwId,
            dbName,
            tbId,
            schema,
            dwName,
            status,
            tbGuid,
            tbLogicGuid,
            dwType,
            l1,
            l2,
            l3,
            createTime,
            updateTime,
            approvalInfo,
            newBiz,
            dimensionGroup,
            groupName,
            groupCode,
            timePeriod,
            tableAttributes,
            physicalTable,
            devPhysicalTable,
            technicalAsset,
            businessAsset,
            metaDataLink,
            dataQuality,
            dlfTask,
            publishToDlm,
            summaryStatus,
            distribute,
            distributeColumn,
            compression,
            obsLocation,
            preCombineField,
            tableType,
            dlfTaskId,
            qualityId,
            reversed,
            tableVersion,
            partitionConf,
            dirtyOutSwitch,
            dirtyOutDatabase,
            dirtyOutPrefix,
            dirtyOutSuffix,
            alias,
            configs,
            selfDefinedFields,
            apiId,
            sql,
            devVersion,
            prodVersion,
            devVersionName,
            prodVersionName,
            envType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregationLogicTableVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tbName: ").append(toIndentedString(tbName)).append("\n");
        sb.append("    tbLogicName: ").append(toIndentedString(tbLogicName)).append("\n");
        sb.append("    l1Id: ").append(toIndentedString(l1Id)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    l3Id: ").append(toIndentedString(l3Id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    applyBg: ").append(toIndentedString(applyBg)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tbId: ").append(toIndentedString(tbId)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    dwName: ").append(toIndentedString(dwName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tbGuid: ").append(toIndentedString(tbGuid)).append("\n");
        sb.append("    tbLogicGuid: ").append(toIndentedString(tbLogicGuid)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    approvalInfo: ").append(toIndentedString(approvalInfo)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
        sb.append("    dimensionGroup: ").append(toIndentedString(dimensionGroup)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupCode: ").append(toIndentedString(groupCode)).append("\n");
        sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
        sb.append("    tableAttributes: ").append(toIndentedString(tableAttributes)).append("\n");
        sb.append("    physicalTable: ").append(toIndentedString(physicalTable)).append("\n");
        sb.append("    devPhysicalTable: ").append(toIndentedString(devPhysicalTable)).append("\n");
        sb.append("    technicalAsset: ").append(toIndentedString(technicalAsset)).append("\n");
        sb.append("    businessAsset: ").append(toIndentedString(businessAsset)).append("\n");
        sb.append("    metaDataLink: ").append(toIndentedString(metaDataLink)).append("\n");
        sb.append("    dataQuality: ").append(toIndentedString(dataQuality)).append("\n");
        sb.append("    dlfTask: ").append(toIndentedString(dlfTask)).append("\n");
        sb.append("    publishToDlm: ").append(toIndentedString(publishToDlm)).append("\n");
        sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
        sb.append("    distribute: ").append(toIndentedString(distribute)).append("\n");
        sb.append("    distributeColumn: ").append(toIndentedString(distributeColumn)).append("\n");
        sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
        sb.append("    obsLocation: ").append(toIndentedString(obsLocation)).append("\n");
        sb.append("    preCombineField: ").append(toIndentedString(preCombineField)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    dlfTaskId: ").append(toIndentedString(dlfTaskId)).append("\n");
        sb.append("    qualityId: ").append(toIndentedString(qualityId)).append("\n");
        sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
        sb.append("    tableVersion: ").append(toIndentedString(tableVersion)).append("\n");
        sb.append("    partitionConf: ").append(toIndentedString(partitionConf)).append("\n");
        sb.append("    dirtyOutSwitch: ").append(toIndentedString(dirtyOutSwitch)).append("\n");
        sb.append("    dirtyOutDatabase: ").append(toIndentedString(dirtyOutDatabase)).append("\n");
        sb.append("    dirtyOutPrefix: ").append(toIndentedString(dirtyOutPrefix)).append("\n");
        sb.append("    dirtyOutSuffix: ").append(toIndentedString(dirtyOutSuffix)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    selfDefinedFields: ").append(toIndentedString(selfDefinedFields)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    devVersion: ").append(toIndentedString(devVersion)).append("\n");
        sb.append("    prodVersion: ").append(toIndentedString(prodVersion)).append("\n");
        sb.append("    devVersionName: ").append(toIndentedString(devVersionName)).append("\n");
        sb.append("    prodVersionName: ").append(toIndentedString(prodVersionName)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
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
