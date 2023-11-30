package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CompoundMetricVO
 */
public class CompoundMetricVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

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
    @JsonProperty(value = "dimension_group")

    private String dimensionGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_code")

    private String groupCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_ids")

    private List<Long> metricIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_names")

    private List<String> metricNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cal_fn_ids")

    private List<Long> calFnIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cal_exp")

    private String calExp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1_id")

    private Long l1Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2_id")

    private String l2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3_id")

    private Long l3Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

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
    @JsonProperty(value = "monitor")

    private MetricMonitorVO monitor;

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

    private Long summaryTableId;

    public CompoundMetricVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 编码
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompoundMetricVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 字段名
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public CompoundMetricVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 业务属性
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public CompoundMetricVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CompoundMetricVO withDimensionGroup(String dimensionGroup) {
        this.dimensionGroup = dimensionGroup;
        return this;
    }

    /**
     * 颗粒度id
     * @return dimensionGroup
     */
    public String getDimensionGroup() {
        return dimensionGroup;
    }

    public void setDimensionGroup(String dimensionGroup) {
        this.dimensionGroup = dimensionGroup;
    }

    public CompoundMetricVO withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 颗粒度名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public CompoundMetricVO withGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }

    /**
     * 颗粒度编码
     * @return groupCode
     */
    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public CompoundMetricVO withMetricIds(List<Long> metricIds) {
        this.metricIds = metricIds;
        return this;
    }

    public CompoundMetricVO addMetricIdsItem(Long metricIdsItem) {
        if (this.metricIds == null) {
            this.metricIds = new ArrayList<>();
        }
        this.metricIds.add(metricIdsItem);
        return this;
    }

    public CompoundMetricVO withMetricIds(Consumer<List<Long>> metricIdsSetter) {
        if (this.metricIds == null) {
            this.metricIds = new ArrayList<>();
        }
        metricIdsSetter.accept(this.metricIds);
        return this;
    }

    /**
     * 指标信息
     * @return metricIds
     */
    public List<Long> getMetricIds() {
        return metricIds;
    }

    public void setMetricIds(List<Long> metricIds) {
        this.metricIds = metricIds;
    }

    public CompoundMetricVO withMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public CompoundMetricVO addMetricNamesItem(String metricNamesItem) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        this.metricNames.add(metricNamesItem);
        return this;
    }

    public CompoundMetricVO withMetricNames(Consumer<List<String>> metricNamesSetter) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        metricNamesSetter.accept(this.metricNames);
        return this;
    }

    /**
     * 指标名称信息
     * @return metricNames
     */
    public List<String> getMetricNames() {
        return metricNames;
    }

    public void setMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
    }

    public CompoundMetricVO withCalFnIds(List<Long> calFnIds) {
        this.calFnIds = calFnIds;
        return this;
    }

    public CompoundMetricVO addCalFnIdsItem(Long calFnIdsItem) {
        if (this.calFnIds == null) {
            this.calFnIds = new ArrayList<>();
        }
        this.calFnIds.add(calFnIdsItem);
        return this;
    }

    public CompoundMetricVO withCalFnIds(Consumer<List<Long>> calFnIdsSetter) {
        if (this.calFnIds == null) {
            this.calFnIds = new ArrayList<>();
        }
        calFnIdsSetter.accept(this.calFnIds);
        return this;
    }

    /**
     * 引用函数id
     * @return calFnIds
     */
    public List<Long> getCalFnIds() {
        return calFnIds;
    }

    public void setCalFnIds(List<Long> calFnIds) {
        this.calFnIds = calFnIds;
    }

    public CompoundMetricVO withCalExp(String calExp) {
        this.calExp = calExp;
        return this;
    }

    /**
     * 计算表达式, ${index_id} + ${index_id}
     * @return calExp
     */
    public String getCalExp() {
        return calExp;
    }

    public void setCalExp(String calExp) {
        this.calExp = calExp;
    }

    public CompoundMetricVO withL1Id(Long l1Id) {
        this.l1Id = l1Id;
        return this;
    }

    /**
     * 主题域分组id
     * @return l1Id
     */
    public Long getL1Id() {
        return l1Id;
    }

    public void setL1Id(Long l1Id) {
        this.l1Id = l1Id;
    }

    public CompoundMetricVO withL2Id(String l2Id) {
        this.l2Id = l2Id;
        return this;
    }

    /**
     * Get l2Id
     * @return l2Id
     */
    public String getL2Id() {
        return l2Id;
    }

    public void setL2Id(String l2Id) {
        this.l2Id = l2Id;
    }

    public CompoundMetricVO withL3Id(Long l3Id) {
        this.l3Id = l3Id;
        return this;
    }

    /**
     * 业务对象id
     * @return l3Id
     */
    public Long getL3Id() {
        return l3Id;
    }

    public void setL3Id(Long l3Id) {
        this.l3Id = l3Id;
    }

    public CompoundMetricVO withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 字段类型
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public CompoundMetricVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public CompoundMetricVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public CompoundMetricVO withStatus(BizStatusEnum status) {
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

    public CompoundMetricVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CompoundMetricVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public CompoundMetricVO withApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
        return this;
    }

    public CompoundMetricVO withApprovalInfo(Consumer<ApprovalVO> approvalInfoSetter) {
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

    public CompoundMetricVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public CompoundMetricVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
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

    public CompoundMetricVO withMonitor(MetricMonitorVO monitor) {
        this.monitor = monitor;
        return this;
    }

    public CompoundMetricVO withMonitor(Consumer<MetricMonitorVO> monitorSetter) {
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

    public CompoundMetricVO withL1(String l1) {
        this.l1 = l1;
        return this;
    }

    /**
     * 主题域分组中文名
     * @return l1
     */
    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public CompoundMetricVO withL2(String l2) {
        this.l2 = l2;
        return this;
    }

    /**
     * 主题域中文名
     * @return l2
     */
    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public CompoundMetricVO withL3(String l3) {
        this.l3 = l3;
        return this;
    }

    /**
     * 业务对象中文名
     * @return l3
     */
    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public CompoundMetricVO withSummaryTableId(Long summaryTableId) {
        this.summaryTableId = summaryTableId;
        return this;
    }

    /**
     * 汇总表id
     * @return summaryTableId
     */
    public Long getSummaryTableId() {
        return summaryTableId;
    }

    public void setSummaryTableId(Long summaryTableId) {
        this.summaryTableId = summaryTableId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompoundMetricVO that = (CompoundMetricVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.description, that.description)
            && Objects.equals(this.dimensionGroup, that.dimensionGroup)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupCode, that.groupCode)
            && Objects.equals(this.metricIds, that.metricIds) && Objects.equals(this.metricNames, that.metricNames)
            && Objects.equals(this.calFnIds, that.calFnIds) && Objects.equals(this.calExp, that.calExp)
            && Objects.equals(this.l1Id, that.l1Id) && Objects.equals(this.l2Id, that.l2Id)
            && Objects.equals(this.l3Id, that.l3Id) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.approvalInfo, that.approvalInfo)
            && Objects.equals(this.newBiz, that.newBiz) && Objects.equals(this.monitor, that.monitor)
            && Objects.equals(this.l1, that.l1) && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.summaryTableId, that.summaryTableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            nameEn,
            nameCh,
            description,
            dimensionGroup,
            groupName,
            groupCode,
            metricIds,
            metricNames,
            calFnIds,
            calExp,
            l1Id,
            l2Id,
            l3Id,
            dataType,
            createBy,
            updateBy,
            status,
            createTime,
            updateTime,
            approvalInfo,
            newBiz,
            monitor,
            l1,
            l2,
            l3,
            summaryTableId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompoundMetricVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dimensionGroup: ").append(toIndentedString(dimensionGroup)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupCode: ").append(toIndentedString(groupCode)).append("\n");
        sb.append("    metricIds: ").append(toIndentedString(metricIds)).append("\n");
        sb.append("    metricNames: ").append(toIndentedString(metricNames)).append("\n");
        sb.append("    calFnIds: ").append(toIndentedString(calFnIds)).append("\n");
        sb.append("    calExp: ").append(toIndentedString(calExp)).append("\n");
        sb.append("    l1Id: ").append(toIndentedString(l1Id)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    l3Id: ").append(toIndentedString(l3Id)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    approvalInfo: ").append(toIndentedString(approvalInfo)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
        sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    summaryTableId: ").append(toIndentedString(summaryTableId)).append("\n");
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
