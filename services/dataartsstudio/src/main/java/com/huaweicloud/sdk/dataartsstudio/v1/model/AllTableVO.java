package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 总览表。
 */
public class AllTableVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_logic_guid")

    private String tbLogicGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_id")

    private String qualityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reversed")

    private Boolean reversed;

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
    @JsonProperty(value = "tb_guid")

    private String tbGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

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
    @JsonProperty(value = "new_biz")

    private BizVersionManageVO newBiz;

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
    @JsonProperty(value = "materialization")

    private SyncStatusEnum materialization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_to_dlm")

    private SyncStatusEnum publishToDlm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary_status")

    private SyncStatusEnum summaryStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard_count")

    private String standardCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

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

    public AllTableVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * l1的ID，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AllTableVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * l1名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AllTableVO withTbLogicGuid(String tbLogicGuid) {
        this.tbLogicGuid = tbLogicGuid;
        return this;
    }

    /**
     * 表发布后对应的逻辑实体guid。
     * @return tbLogicGuid
     */
    public String getTbLogicGuid() {
        return tbLogicGuid;
    }

    public void setTbLogicGuid(String tbLogicGuid) {
        this.tbLogicGuid = tbLogicGuid;
    }

    public AllTableVO withQualityId(String qualityId) {
        this.qualityId = qualityId;
        return this;
    }

    /**
     * 质量ID。
     * @return qualityId
     */
    public String getQualityId() {
        return qualityId;
    }

    public void setQualityId(String qualityId) {
        this.qualityId = qualityId;
    }

    public AllTableVO withReversed(Boolean reversed) {
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

    public AllTableVO withPartitionConf(String partitionConf) {
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

    public AllTableVO withDirtyOutSwitch(Boolean dirtyOutSwitch) {
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

    public AllTableVO withDirtyOutDatabase(String dirtyOutDatabase) {
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

    public AllTableVO withDirtyOutPrefix(String dirtyOutPrefix) {
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

    public AllTableVO withDirtyOutSuffix(String dirtyOutSuffix) {
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

    public AllTableVO withTbGuid(String tbGuid) {
        this.tbGuid = tbGuid;
        return this;
    }

    /**
     * 表发布后对应的物理表guid。
     * @return tbGuid
     */
    public String getTbGuid() {
        return tbGuid;
    }

    public void setTbGuid(String tbGuid) {
        this.tbGuid = tbGuid;
    }

    public AllTableVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 编码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AllTableVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public AllTableVO withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public AllTableVO withDescription(String description) {
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

    public AllTableVO withStatus(BizStatusEnum status) {
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

    public AllTableVO withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * Get bizType
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public AllTableVO withCreateTime(OffsetDateTime createTime) {
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

    public AllTableVO withUpdateTime(OffsetDateTime updateTime) {
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

    public AllTableVO withDbName(String dbName) {
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

    public AllTableVO withDwType(String dwType) {
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

    public AllTableVO withQueueName(String queueName) {
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

    public AllTableVO withSchema(String schema) {
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

    public AllTableVO withL1(String l1) {
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

    public AllTableVO withL2(String l2) {
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

    public AllTableVO withL3(String l3) {
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

    public AllTableVO withL1Id(String l1Id) {
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

    public AllTableVO withL2Id(String l2Id) {
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

    public AllTableVO withL3Id(String l3Id) {
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

    public AllTableVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public AllTableVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
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

    public AllTableVO withPhysicalTable(SyncStatusEnum physicalTable) {
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

    public AllTableVO withDevPhysicalTable(SyncStatusEnum devPhysicalTable) {
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

    public AllTableVO withTechnicalAsset(SyncStatusEnum technicalAsset) {
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

    public AllTableVO withBusinessAsset(SyncStatusEnum businessAsset) {
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

    public AllTableVO withMetaDataLink(SyncStatusEnum metaDataLink) {
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

    public AllTableVO withDataQuality(SyncStatusEnum dataQuality) {
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

    public AllTableVO withDlfTask(SyncStatusEnum dlfTask) {
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

    public AllTableVO withMaterialization(SyncStatusEnum materialization) {
        this.materialization = materialization;
        return this;
    }

    /**
     * Get materialization
     * @return materialization
     */
    public SyncStatusEnum getMaterialization() {
        return materialization;
    }

    public void setMaterialization(SyncStatusEnum materialization) {
        this.materialization = materialization;
    }

    public AllTableVO withPublishToDlm(SyncStatusEnum publishToDlm) {
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

    public AllTableVO withSummaryStatus(SyncStatusEnum summaryStatus) {
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

    public AllTableVO withStandardCount(String standardCount) {
        this.standardCount = standardCount;
        return this;
    }

    /**
     * 标准数量，只读，填写String类型替代Long类型。
     * @return standardCount
     */
    public String getStandardCount() {
        return standardCount;
    }

    public void setStandardCount(String standardCount) {
        this.standardCount = standardCount;
    }

    public AllTableVO withAlias(String alias) {
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

    public AllTableVO withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * 汇总表API ID。
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public AllTableVO withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public AllTableVO withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 工作空间名称。
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public AllTableVO withDevVersion(String devVersion) {
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

    public AllTableVO withProdVersion(String prodVersion) {
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

    public AllTableVO withDevVersionName(String devVersionName) {
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

    public AllTableVO withProdVersionName(String prodVersionName) {
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

    public AllTableVO withEnvType(EnvTypeEnum envType) {
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
        AllTableVO that = (AllTableVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.tbLogicGuid, that.tbLogicGuid) && Objects.equals(this.qualityId, that.qualityId)
            && Objects.equals(this.reversed, that.reversed) && Objects.equals(this.partitionConf, that.partitionConf)
            && Objects.equals(this.dirtyOutSwitch, that.dirtyOutSwitch)
            && Objects.equals(this.dirtyOutDatabase, that.dirtyOutDatabase)
            && Objects.equals(this.dirtyOutPrefix, that.dirtyOutPrefix)
            && Objects.equals(this.dirtyOutSuffix, that.dirtyOutSuffix) && Objects.equals(this.tbGuid, that.tbGuid)
            && Objects.equals(this.code, that.code) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.bizType, that.bizType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.dwType, that.dwType)
            && Objects.equals(this.queueName, that.queueName) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.l1, that.l1) && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.l1Id, that.l1Id) && Objects.equals(this.l2Id, that.l2Id)
            && Objects.equals(this.l3Id, that.l3Id) && Objects.equals(this.newBiz, that.newBiz)
            && Objects.equals(this.physicalTable, that.physicalTable)
            && Objects.equals(this.devPhysicalTable, that.devPhysicalTable)
            && Objects.equals(this.technicalAsset, that.technicalAsset)
            && Objects.equals(this.businessAsset, that.businessAsset)
            && Objects.equals(this.metaDataLink, that.metaDataLink)
            && Objects.equals(this.dataQuality, that.dataQuality) && Objects.equals(this.dlfTask, that.dlfTask)
            && Objects.equals(this.materialization, that.materialization)
            && Objects.equals(this.publishToDlm, that.publishToDlm)
            && Objects.equals(this.summaryStatus, that.summaryStatus)
            && Objects.equals(this.standardCount, that.standardCount) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.apiId, that.apiId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.workspaceName, that.workspaceName)
            && Objects.equals(this.devVersion, that.devVersion) && Objects.equals(this.prodVersion, that.prodVersion)
            && Objects.equals(this.devVersionName, that.devVersionName)
            && Objects.equals(this.prodVersionName, that.prodVersionName) && Objects.equals(this.envType, that.envType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            tbLogicGuid,
            qualityId,
            reversed,
            partitionConf,
            dirtyOutSwitch,
            dirtyOutDatabase,
            dirtyOutPrefix,
            dirtyOutSuffix,
            tbGuid,
            code,
            createBy,
            tenantId,
            description,
            status,
            bizType,
            createTime,
            updateTime,
            dbName,
            dwType,
            queueName,
            schema,
            l1,
            l2,
            l3,
            l1Id,
            l2Id,
            l3Id,
            newBiz,
            physicalTable,
            devPhysicalTable,
            technicalAsset,
            businessAsset,
            metaDataLink,
            dataQuality,
            dlfTask,
            materialization,
            publishToDlm,
            summaryStatus,
            standardCount,
            alias,
            apiId,
            workspaceId,
            workspaceName,
            devVersion,
            prodVersion,
            devVersionName,
            prodVersionName,
            envType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllTableVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tbLogicGuid: ").append(toIndentedString(tbLogicGuid)).append("\n");
        sb.append("    qualityId: ").append(toIndentedString(qualityId)).append("\n");
        sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
        sb.append("    partitionConf: ").append(toIndentedString(partitionConf)).append("\n");
        sb.append("    dirtyOutSwitch: ").append(toIndentedString(dirtyOutSwitch)).append("\n");
        sb.append("    dirtyOutDatabase: ").append(toIndentedString(dirtyOutDatabase)).append("\n");
        sb.append("    dirtyOutPrefix: ").append(toIndentedString(dirtyOutPrefix)).append("\n");
        sb.append("    dirtyOutSuffix: ").append(toIndentedString(dirtyOutSuffix)).append("\n");
        sb.append("    tbGuid: ").append(toIndentedString(tbGuid)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    l1Id: ").append(toIndentedString(l1Id)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    l3Id: ").append(toIndentedString(l3Id)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
        sb.append("    physicalTable: ").append(toIndentedString(physicalTable)).append("\n");
        sb.append("    devPhysicalTable: ").append(toIndentedString(devPhysicalTable)).append("\n");
        sb.append("    technicalAsset: ").append(toIndentedString(technicalAsset)).append("\n");
        sb.append("    businessAsset: ").append(toIndentedString(businessAsset)).append("\n");
        sb.append("    metaDataLink: ").append(toIndentedString(metaDataLink)).append("\n");
        sb.append("    dataQuality: ").append(toIndentedString(dataQuality)).append("\n");
        sb.append("    dlfTask: ").append(toIndentedString(dlfTask)).append("\n");
        sb.append("    materialization: ").append(toIndentedString(materialization)).append("\n");
        sb.append("    publishToDlm: ").append(toIndentedString(publishToDlm)).append("\n");
        sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
        sb.append("    standardCount: ").append(toIndentedString(standardCount)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
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
