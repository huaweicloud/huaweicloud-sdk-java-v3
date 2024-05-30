package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DerivativeIndexVO
 */
public class DerivativeIndexVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

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
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_index_id")

    private String atomicIndexId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_condition_id")

    private String timeConditionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_field_id")

    private String timeFieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_field_name")

    private String timeFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_conditions")

    private List<CommonConditionVO> commonConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_groups")

    private List<DerivativeIndexDimensionVO> dimensionGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor")

    private MetricMonitorVO monitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_index")

    private AtomicIndexVO atomicIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_condition_name")

    private String timeConditionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

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
    @JsonProperty(value = "summary_table_id")

    private String summaryTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_info")

    private ApprovalVO approvalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_biz")

    private BizVersionManageVO newBiz;

    public DerivativeIndexVO withId(String id) {
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

    public DerivativeIndexVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 字段名。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public DerivativeIndexVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 中文名。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public DerivativeIndexVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述，只读。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DerivativeIndexVO withCreateBy(String createBy) {
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

    public DerivativeIndexVO withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 字段类型。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public DerivativeIndexVO withL1Id(String l1Id) {
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

    public DerivativeIndexVO withL2Id(String l2Id) {
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

    public DerivativeIndexVO withL3Id(String l3Id) {
        this.l3Id = l3Id;
        return this;
    }

    /**
     * 业务对象guid，填写String类型替代Long类型。
     * @return l3Id
     */
    public String getL3Id() {
        return l3Id;
    }

    public void setL3Id(String l3Id) {
        this.l3Id = l3Id;
    }

    public DerivativeIndexVO withStatus(BizStatusEnum status) {
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

    public DerivativeIndexVO withAtomicIndexId(String atomicIndexId) {
        this.atomicIndexId = atomicIndexId;
        return this;
    }

    /**
     * 原子指标ID，填写String类型替代Long类型。
     * @return atomicIndexId
     */
    public String getAtomicIndexId() {
        return atomicIndexId;
    }

    public void setAtomicIndexId(String atomicIndexId) {
        this.atomicIndexId = atomicIndexId;
    }

    public DerivativeIndexVO withTimeConditionId(String timeConditionId) {
        this.timeConditionId = timeConditionId;
        return this;
    }

    /**
     * 时间限定ID，填写String类型替代Long类型。
     * @return timeConditionId
     */
    public String getTimeConditionId() {
        return timeConditionId;
    }

    public void setTimeConditionId(String timeConditionId) {
        this.timeConditionId = timeConditionId;
    }

    public DerivativeIndexVO withTimeFieldId(String timeFieldId) {
        this.timeFieldId = timeFieldId;
        return this;
    }

    /**
     * 时间限定关联字段ID，填写String类型替代Long类型。
     * @return timeFieldId
     */
    public String getTimeFieldId() {
        return timeFieldId;
    }

    public void setTimeFieldId(String timeFieldId) {
        this.timeFieldId = timeFieldId;
    }

    public DerivativeIndexVO withTimeFieldName(String timeFieldName) {
        this.timeFieldName = timeFieldName;
        return this;
    }

    /**
     * 时间限定关联字段名称，只读。
     * @return timeFieldName
     */
    public String getTimeFieldName() {
        return timeFieldName;
    }

    public void setTimeFieldName(String timeFieldName) {
        this.timeFieldName = timeFieldName;
    }

    public DerivativeIndexVO withCommonConditions(List<CommonConditionVO> commonConditions) {
        this.commonConditions = commonConditions;
        return this;
    }

    public DerivativeIndexVO addCommonConditionsItem(CommonConditionVO commonConditionsItem) {
        if (this.commonConditions == null) {
            this.commonConditions = new ArrayList<>();
        }
        this.commonConditions.add(commonConditionsItem);
        return this;
    }

    public DerivativeIndexVO withCommonConditions(Consumer<List<CommonConditionVO>> commonConditionsSetter) {
        if (this.commonConditions == null) {
            this.commonConditions = new ArrayList<>();
        }
        commonConditionsSetter.accept(this.commonConditions);
        return this;
    }

    /**
     * 通用限定信息。
     * @return commonConditions
     */
    public List<CommonConditionVO> getCommonConditions() {
        return commonConditions;
    }

    public void setCommonConditions(List<CommonConditionVO> commonConditions) {
        this.commonConditions = commonConditions;
    }

    public DerivativeIndexVO withDimensionGroups(List<DerivativeIndexDimensionVO> dimensionGroups) {
        this.dimensionGroups = dimensionGroups;
        return this;
    }

    public DerivativeIndexVO addDimensionGroupsItem(DerivativeIndexDimensionVO dimensionGroupsItem) {
        if (this.dimensionGroups == null) {
            this.dimensionGroups = new ArrayList<>();
        }
        this.dimensionGroups.add(dimensionGroupsItem);
        return this;
    }

    public DerivativeIndexVO withDimensionGroups(Consumer<List<DerivativeIndexDimensionVO>> dimensionGroupsSetter) {
        if (this.dimensionGroups == null) {
            this.dimensionGroups = new ArrayList<>();
        }
        dimensionGroupsSetter.accept(this.dimensionGroups);
        return this;
    }

    /**
     * 维度组(颗粒度)。
     * @return dimensionGroups
     */
    public List<DerivativeIndexDimensionVO> getDimensionGroups() {
        return dimensionGroups;
    }

    public void setDimensionGroups(List<DerivativeIndexDimensionVO> dimensionGroups) {
        this.dimensionGroups = dimensionGroups;
    }

    public DerivativeIndexVO withMonitor(MetricMonitorVO monitor) {
        this.monitor = monitor;
        return this;
    }

    public DerivativeIndexVO withMonitor(Consumer<MetricMonitorVO> monitorSetter) {
        if (this.monitor == null) {
            this.monitor = new MetricMonitorVO();
            monitorSetter.accept(this.monitor);
        }

        return this;
    }

    /**
     * Get monitor
     * @return monitor
     */
    public MetricMonitorVO getMonitor() {
        return monitor;
    }

    public void setMonitor(MetricMonitorVO monitor) {
        this.monitor = monitor;
    }

    public DerivativeIndexVO withAtomicIndex(AtomicIndexVO atomicIndex) {
        this.atomicIndex = atomicIndex;
        return this;
    }

    public DerivativeIndexVO withAtomicIndex(Consumer<AtomicIndexVO> atomicIndexSetter) {
        if (this.atomicIndex == null) {
            this.atomicIndex = new AtomicIndexVO();
            atomicIndexSetter.accept(this.atomicIndex);
        }

        return this;
    }

    /**
     * Get atomicIndex
     * @return atomicIndex
     */
    public AtomicIndexVO getAtomicIndex() {
        return atomicIndex;
    }

    public void setAtomicIndex(AtomicIndexVO atomicIndex) {
        this.atomicIndex = atomicIndex;
    }

    public DerivativeIndexVO withTimeConditionName(String timeConditionName) {
        this.timeConditionName = timeConditionName;
        return this;
    }

    /**
     * 时间限定名称，只读。
     * @return timeConditionName
     */
    public String getTimeConditionName() {
        return timeConditionName;
    }

    public void setTimeConditionName(String timeConditionName) {
        this.timeConditionName = timeConditionName;
    }

    public DerivativeIndexVO withCreateTime(OffsetDateTime createTime) {
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

    public DerivativeIndexVO withUpdateTime(OffsetDateTime updateTime) {
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

    public DerivativeIndexVO withL1(String l1) {
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

    public DerivativeIndexVO withL2(String l2) {
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

    public DerivativeIndexVO withL3(String l3) {
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

    public DerivativeIndexVO withSummaryTableId(String summaryTableId) {
        this.summaryTableId = summaryTableId;
        return this;
    }

    /**
     * 汇总表ID，只读，填写String类型替代Long类型。
     * @return summaryTableId
     */
    public String getSummaryTableId() {
        return summaryTableId;
    }

    public void setSummaryTableId(String summaryTableId) {
        this.summaryTableId = summaryTableId;
    }

    public DerivativeIndexVO withApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
        return this;
    }

    public DerivativeIndexVO withApprovalInfo(Consumer<ApprovalVO> approvalInfoSetter) {
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

    public DerivativeIndexVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public DerivativeIndexVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DerivativeIndexVO that = (DerivativeIndexVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.l1Id, that.l1Id) && Objects.equals(this.l2Id, that.l2Id)
            && Objects.equals(this.l3Id, that.l3Id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.atomicIndexId, that.atomicIndexId)
            && Objects.equals(this.timeConditionId, that.timeConditionId)
            && Objects.equals(this.timeFieldId, that.timeFieldId)
            && Objects.equals(this.timeFieldName, that.timeFieldName)
            && Objects.equals(this.commonConditions, that.commonConditions)
            && Objects.equals(this.dimensionGroups, that.dimensionGroups) && Objects.equals(this.monitor, that.monitor)
            && Objects.equals(this.atomicIndex, that.atomicIndex)
            && Objects.equals(this.timeConditionName, that.timeConditionName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.l1, that.l1) && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.summaryTableId, that.summaryTableId)
            && Objects.equals(this.approvalInfo, that.approvalInfo) && Objects.equals(this.newBiz, that.newBiz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            nameEn,
            nameCh,
            description,
            createBy,
            dataType,
            l1Id,
            l2Id,
            l3Id,
            status,
            atomicIndexId,
            timeConditionId,
            timeFieldId,
            timeFieldName,
            commonConditions,
            dimensionGroups,
            monitor,
            atomicIndex,
            timeConditionName,
            createTime,
            updateTime,
            l1,
            l2,
            l3,
            summaryTableId,
            approvalInfo,
            newBiz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DerivativeIndexVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    l1Id: ").append(toIndentedString(l1Id)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    l3Id: ").append(toIndentedString(l3Id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    atomicIndexId: ").append(toIndentedString(atomicIndexId)).append("\n");
        sb.append("    timeConditionId: ").append(toIndentedString(timeConditionId)).append("\n");
        sb.append("    timeFieldId: ").append(toIndentedString(timeFieldId)).append("\n");
        sb.append("    timeFieldName: ").append(toIndentedString(timeFieldName)).append("\n");
        sb.append("    commonConditions: ").append(toIndentedString(commonConditions)).append("\n");
        sb.append("    dimensionGroups: ").append(toIndentedString(dimensionGroups)).append("\n");
        sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
        sb.append("    atomicIndex: ").append(toIndentedString(atomicIndex)).append("\n");
        sb.append("    timeConditionName: ").append(toIndentedString(timeConditionName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    summaryTableId: ").append(toIndentedString(summaryTableId)).append("\n");
        sb.append("    approvalInfo: ").append(toIndentedString(approvalInfo)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
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
