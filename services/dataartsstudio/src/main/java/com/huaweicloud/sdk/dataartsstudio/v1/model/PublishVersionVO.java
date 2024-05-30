package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 版本信息。
 */
public class PublishVersionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_tag")

    private String versionTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private String bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_info")

    private String bizInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_info_vo")

    private Object bizInfoVo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_objs")

    private String effectObjs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_props")

    private String changeProps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_ddl")

    private String sqlDdl;

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
    @JsonProperty(value = "biz_metric")

    private SyncStatusEnum bizMetric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary_status")

    private SyncStatusEnum summaryStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_current_version")

    private Boolean isCurrentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    public PublishVersionVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 版本ID，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublishVersionVO withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 版本名称。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public PublishVersionVO withVersionTag(String versionTag) {
        this.versionTag = versionTag;
        return this;
    }

    /**
     * 版本标记，只读。
     * @return versionTag
     */
    public String getVersionTag() {
        return versionTag;
    }

    public void setVersionTag(String versionTag) {
        this.versionTag = versionTag;
    }

    public PublishVersionVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 版本描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublishVersionVO withBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 业务对象ID，填写String类型替代Long类型。
     * @return bizId
     */
    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public PublishVersionVO withBizType(BizTypeEnum bizType) {
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

    public PublishVersionVO withBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }

    /**
     * 业务详情，只读。
     * @return bizInfo
     */
    public String getBizInfo() {
        return bizInfo;
    }

    public void setBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
    }

    public PublishVersionVO withBizInfoVo(Object bizInfoVo) {
        this.bizInfoVo = bizInfoVo;
        return this;
    }

    /**
     * 业务对象。
     * @return bizInfoVo
     */
    public Object getBizInfoVo() {
        return bizInfoVo;
    }

    public void setBizInfoVo(Object bizInfoVo) {
        this.bizInfoVo = bizInfoVo;
    }

    public PublishVersionVO withEffectObjs(String effectObjs) {
        this.effectObjs = effectObjs;
        return this;
    }

    /**
     * 影响信息，只读。
     * @return effectObjs
     */
    public String getEffectObjs() {
        return effectObjs;
    }

    public void setEffectObjs(String effectObjs) {
        this.effectObjs = effectObjs;
    }

    public PublishVersionVO withChangeProps(String changeProps) {
        this.changeProps = changeProps;
        return this;
    }

    /**
     * 变化信息，只读。
     * @return changeProps
     */
    public String getChangeProps() {
        return changeProps;
    }

    public void setChangeProps(String changeProps) {
        this.changeProps = changeProps;
    }

    public PublishVersionVO withSqlDdl(String sqlDdl) {
        this.sqlDdl = sqlDdl;
        return this;
    }

    /**
     * SQL脚本，只读。
     * @return sqlDdl
     */
    public String getSqlDdl() {
        return sqlDdl;
    }

    public void setSqlDdl(String sqlDdl) {
        this.sqlDdl = sqlDdl;
    }

    public PublishVersionVO withPhysicalTable(SyncStatusEnum physicalTable) {
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

    public PublishVersionVO withDevPhysicalTable(SyncStatusEnum devPhysicalTable) {
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

    public PublishVersionVO withTechnicalAsset(SyncStatusEnum technicalAsset) {
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

    public PublishVersionVO withBusinessAsset(SyncStatusEnum businessAsset) {
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

    public PublishVersionVO withMetaDataLink(SyncStatusEnum metaDataLink) {
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

    public PublishVersionVO withDataQuality(SyncStatusEnum dataQuality) {
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

    public PublishVersionVO withDlfTask(SyncStatusEnum dlfTask) {
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

    public PublishVersionVO withMaterialization(SyncStatusEnum materialization) {
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

    public PublishVersionVO withPublishToDlm(SyncStatusEnum publishToDlm) {
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

    public PublishVersionVO withBizMetric(SyncStatusEnum bizMetric) {
        this.bizMetric = bizMetric;
        return this;
    }

    /**
     * Get bizMetric
     * @return bizMetric
     */
    public SyncStatusEnum getBizMetric() {
        return bizMetric;
    }

    public void setBizMetric(SyncStatusEnum bizMetric) {
        this.bizMetric = bizMetric;
    }

    public PublishVersionVO withSummaryStatus(SyncStatusEnum summaryStatus) {
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

    public PublishVersionVO withIsCurrentVersion(Boolean isCurrentVersion) {
        this.isCurrentVersion = isCurrentVersion;
        return this;
    }

    /**
     * 是否为当前版本，只读。
     * @return isCurrentVersion
     */
    public Boolean getIsCurrentVersion() {
        return isCurrentVersion;
    }

    public void setIsCurrentVersion(Boolean isCurrentVersion) {
        this.isCurrentVersion = isCurrentVersion;
    }

    public PublishVersionVO withCreateTime(OffsetDateTime createTime) {
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

    public PublishVersionVO withCreateBy(String createBy) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublishVersionVO that = (PublishVersionVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.versionName, that.versionName)
            && Objects.equals(this.versionTag, that.versionTag) && Objects.equals(this.description, that.description)
            && Objects.equals(this.bizId, that.bizId) && Objects.equals(this.bizType, that.bizType)
            && Objects.equals(this.bizInfo, that.bizInfo) && Objects.equals(this.bizInfoVo, that.bizInfoVo)
            && Objects.equals(this.effectObjs, that.effectObjs) && Objects.equals(this.changeProps, that.changeProps)
            && Objects.equals(this.sqlDdl, that.sqlDdl) && Objects.equals(this.physicalTable, that.physicalTable)
            && Objects.equals(this.devPhysicalTable, that.devPhysicalTable)
            && Objects.equals(this.technicalAsset, that.technicalAsset)
            && Objects.equals(this.businessAsset, that.businessAsset)
            && Objects.equals(this.metaDataLink, that.metaDataLink)
            && Objects.equals(this.dataQuality, that.dataQuality) && Objects.equals(this.dlfTask, that.dlfTask)
            && Objects.equals(this.materialization, that.materialization)
            && Objects.equals(this.publishToDlm, that.publishToDlm) && Objects.equals(this.bizMetric, that.bizMetric)
            && Objects.equals(this.summaryStatus, that.summaryStatus)
            && Objects.equals(this.isCurrentVersion, that.isCurrentVersion)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createBy, that.createBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            versionName,
            versionTag,
            description,
            bizId,
            bizType,
            bizInfo,
            bizInfoVo,
            effectObjs,
            changeProps,
            sqlDdl,
            physicalTable,
            devPhysicalTable,
            technicalAsset,
            businessAsset,
            metaDataLink,
            dataQuality,
            dlfTask,
            materialization,
            publishToDlm,
            bizMetric,
            summaryStatus,
            isCurrentVersion,
            createTime,
            createBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishVersionVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    versionTag: ").append(toIndentedString(versionTag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    bizInfo: ").append(toIndentedString(bizInfo)).append("\n");
        sb.append("    bizInfoVo: ").append(toIndentedString(bizInfoVo)).append("\n");
        sb.append("    effectObjs: ").append(toIndentedString(effectObjs)).append("\n");
        sb.append("    changeProps: ").append(toIndentedString(changeProps)).append("\n");
        sb.append("    sqlDdl: ").append(toIndentedString(sqlDdl)).append("\n");
        sb.append("    physicalTable: ").append(toIndentedString(physicalTable)).append("\n");
        sb.append("    devPhysicalTable: ").append(toIndentedString(devPhysicalTable)).append("\n");
        sb.append("    technicalAsset: ").append(toIndentedString(technicalAsset)).append("\n");
        sb.append("    businessAsset: ").append(toIndentedString(businessAsset)).append("\n");
        sb.append("    metaDataLink: ").append(toIndentedString(metaDataLink)).append("\n");
        sb.append("    dataQuality: ").append(toIndentedString(dataQuality)).append("\n");
        sb.append("    dlfTask: ").append(toIndentedString(dlfTask)).append("\n");
        sb.append("    materialization: ").append(toIndentedString(materialization)).append("\n");
        sb.append("    publishToDlm: ").append(toIndentedString(publishToDlm)).append("\n");
        sb.append("    bizMetric: ").append(toIndentedString(bizMetric)).append("\n");
        sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
        sb.append("    isCurrentVersion: ").append(toIndentedString(isCurrentVersion)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
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
