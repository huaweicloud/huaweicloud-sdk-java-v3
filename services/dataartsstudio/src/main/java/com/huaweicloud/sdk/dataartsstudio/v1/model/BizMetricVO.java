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
 * 业务指标信息。
 */
public class BizMetricVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_alias")

    private String nameAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_catalog_id")

    private String bizCatalogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_catalog_path")

    private String bizCatalogPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_origin")

    private String dataOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_filters")

    private String timeFilters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private String dimensions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "general_filters")

    private String generalFilters;

    /**
     * 刷新频率。 枚举值：   - MINUTE: 每分钟   - HOUR: 每小时   - DAY: 每天   - WEEK: 每周   - MONTH: 每月   - YEAR: 每年   - REAL_TIME: 实时   - HALF_HOUR: 每半小时   - QUART: 每15分钟   - DOUBLE_WEEK: 每两周   - HALF_YEAR: 每半年   - HALF_DAY: 每半天 
     */
    public static final class IntervalTypeEnum {

        /**
         * Enum MINUTE for value: "MINUTE"
         */
        public static final IntervalTypeEnum MINUTE = new IntervalTypeEnum("MINUTE");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final IntervalTypeEnum HOUR = new IntervalTypeEnum("HOUR");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final IntervalTypeEnum DAY = new IntervalTypeEnum("DAY");

        /**
         * Enum WEEK for value: "WEEK"
         */
        public static final IntervalTypeEnum WEEK = new IntervalTypeEnum("WEEK");

        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final IntervalTypeEnum MONTH = new IntervalTypeEnum("MONTH");

        /**
         * Enum YEAR for value: "YEAR"
         */
        public static final IntervalTypeEnum YEAR = new IntervalTypeEnum("YEAR");

        /**
         * Enum REAL_TIME for value: "REAL_TIME"
         */
        public static final IntervalTypeEnum REAL_TIME = new IntervalTypeEnum("REAL_TIME");

        /**
         * Enum HALF_HOUR for value: "HALF_HOUR"
         */
        public static final IntervalTypeEnum HALF_HOUR = new IntervalTypeEnum("HALF_HOUR");

        /**
         * Enum QUART for value: "QUART"
         */
        public static final IntervalTypeEnum QUART = new IntervalTypeEnum("QUART");

        /**
         * Enum DOUBLE_WEEK for value: "DOUBLE_WEEK"
         */
        public static final IntervalTypeEnum DOUBLE_WEEK = new IntervalTypeEnum("DOUBLE_WEEK");

        /**
         * Enum HALF_YEAR for value: "HALF_YEAR"
         */
        public static final IntervalTypeEnum HALF_YEAR = new IntervalTypeEnum("HALF_YEAR");

        /**
         * Enum HALF_DAY for value: "HALF_DAY"
         */
        public static final IntervalTypeEnum HALF_DAY = new IntervalTypeEnum("HALF_DAY");

        private static final Map<String, IntervalTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IntervalTypeEnum> createStaticFields() {
            Map<String, IntervalTypeEnum> map = new HashMap<>();
            map.put("MINUTE", MINUTE);
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            map.put("WEEK", WEEK);
            map.put("MONTH", MONTH);
            map.put("YEAR", YEAR);
            map.put("REAL_TIME", REAL_TIME);
            map.put("HALF_HOUR", HALF_HOUR);
            map.put("QUART", QUART);
            map.put("DOUBLE_WEEK", DOUBLE_WEEK);
            map.put("HALF_YEAR", HALF_YEAR);
            map.put("HALF_DAY", HALF_DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IntervalTypeEnum(String value) {
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
        public static IntervalTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IntervalTypeEnum(value));
        }

        public static IntervalTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IntervalTypeEnum) {
                return this.value.equals(((IntervalTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_type")

    private IntervalTypeEnum intervalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_scenario")

    private String applyScenario;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "technical_metric")

    private String technicalMetric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "technical_metric_name")

    private String technicalMetricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "technical_metric_type")

    private BizTypeEnum technicalMetricType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure")

    private String measure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_department")

    private String ownerDepartment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private String definition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_info")

    private ApprovalVO approvalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_biz")

    private BizVersionManageVO newBiz;

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
    @JsonProperty(value = "biz_metric")

    private SyncStatusEnum bizMetric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary_status")

    private SyncStatusEnum summaryStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_defined_fields")

    private List<SelfDefinedFieldVO> selfDefinedFields = null;

    public BizMetricVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码，更新时必填，创建时为空，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BizMetricVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指标名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BizMetricVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 指标编码，只读。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BizMetricVO withNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
        return this;
    }

    /**
     * 指标别名。
     * @return nameAlias
     */
    public String getNameAlias() {
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public BizMetricVO withBizType(BizTypeEnum bizType) {
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

    public BizMetricVO withStatus(BizStatusEnum status) {
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

    public BizMetricVO withBizCatalogId(String bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
        return this;
    }

    /**
     * 归属的流程架构的ID，填写String类型替代Long类型。
     * @return bizCatalogId
     */
    public String getBizCatalogId() {
        return bizCatalogId;
    }

    public void setBizCatalogId(String bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
    }

    public BizMetricVO withBizCatalogPath(String bizCatalogPath) {
        this.bizCatalogPath = bizCatalogPath;
        return this;
    }

    /**
     * 归属的流程架构路径，只读。
     * @return bizCatalogPath
     */
    public String getBizCatalogPath() {
        return bizCatalogPath;
    }

    public void setBizCatalogPath(String bizCatalogPath) {
        this.bizCatalogPath = bizCatalogPath;
    }

    public BizMetricVO withCreateBy(String createBy) {
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

    public BizMetricVO withUpdateBy(String updateBy) {
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

    public BizMetricVO withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    /**
     * 数据来源。
     * @return dataOrigin
     */
    public String getDataOrigin() {
        return dataOrigin;
    }

    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public BizMetricVO withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 计量单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BizMetricVO withTimeFilters(String timeFilters) {
        this.timeFilters = timeFilters;
        return this;
    }

    /**
     * 统计周期(时间限定)。
     * @return timeFilters
     */
    public String getTimeFilters() {
        return timeFilters;
    }

    public void setTimeFilters(String timeFilters) {
        this.timeFilters = timeFilters;
    }

    public BizMetricVO withDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * 统计维度。
     * @return dimensions
     */
    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public BizMetricVO withGeneralFilters(String generalFilters) {
        this.generalFilters = generalFilters;
        return this;
    }

    /**
     * 统计口径和修饰词。
     * @return generalFilters
     */
    public String getGeneralFilters() {
        return generalFilters;
    }

    public void setGeneralFilters(String generalFilters) {
        this.generalFilters = generalFilters;
    }

    public BizMetricVO withIntervalType(IntervalTypeEnum intervalType) {
        this.intervalType = intervalType;
        return this;
    }

    /**
     * 刷新频率。 枚举值：   - MINUTE: 每分钟   - HOUR: 每小时   - DAY: 每天   - WEEK: 每周   - MONTH: 每月   - YEAR: 每年   - REAL_TIME: 实时   - HALF_HOUR: 每半小时   - QUART: 每15分钟   - DOUBLE_WEEK: 每两周   - HALF_YEAR: 每半年   - HALF_DAY: 每半天 
     * @return intervalType
     */
    public IntervalTypeEnum getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(IntervalTypeEnum intervalType) {
        this.intervalType = intervalType;
    }

    public BizMetricVO withApplyScenario(String applyScenario) {
        this.applyScenario = applyScenario;
        return this;
    }

    /**
     * 应用场景。
     * @return applyScenario
     */
    public String getApplyScenario() {
        return applyScenario;
    }

    public void setApplyScenario(String applyScenario) {
        this.applyScenario = applyScenario;
    }

    public BizMetricVO withTechnicalMetric(String technicalMetric) {
        this.technicalMetric = technicalMetric;
        return this;
    }

    /**
     * 关联技术指标，填写String类型替代Long类型。
     * @return technicalMetric
     */
    public String getTechnicalMetric() {
        return technicalMetric;
    }

    public void setTechnicalMetric(String technicalMetric) {
        this.technicalMetric = technicalMetric;
    }

    public BizMetricVO withTechnicalMetricName(String technicalMetricName) {
        this.technicalMetricName = technicalMetricName;
        return this;
    }

    /**
     * 关联技术指标名称，只读。
     * @return technicalMetricName
     */
    public String getTechnicalMetricName() {
        return technicalMetricName;
    }

    public void setTechnicalMetricName(String technicalMetricName) {
        this.technicalMetricName = technicalMetricName;
    }

    public BizMetricVO withTechnicalMetricType(BizTypeEnum technicalMetricType) {
        this.technicalMetricType = technicalMetricType;
        return this;
    }

    /**
     * Get technicalMetricType
     * @return technicalMetricType
     */
    public BizTypeEnum getTechnicalMetricType() {
        return technicalMetricType;
    }

    public void setTechnicalMetricType(BizTypeEnum technicalMetricType) {
        this.technicalMetricType = technicalMetricType;
    }

    public BizMetricVO withMeasure(String measure) {
        this.measure = measure;
        return this;
    }

    /**
     * 度量对象。
     * @return measure
     */
    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public BizMetricVO withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 指标责任人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BizMetricVO withOwnerDepartment(String ownerDepartment) {
        this.ownerDepartment = ownerDepartment;
        return this;
    }

    /**
     * 指标管理部门。
     * @return ownerDepartment
     */
    public String getOwnerDepartment() {
        return ownerDepartment;
    }

    public void setOwnerDepartment(String ownerDepartment) {
        this.ownerDepartment = ownerDepartment;
    }

    public BizMetricVO withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 设置目的。
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BizMetricVO withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 资产同步后的guid，只读。
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public BizMetricVO withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * 指标定义。
     * @return definition
     */
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public BizMetricVO withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 计算公式。
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public BizMetricVO withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BizMetricVO withApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
        return this;
    }

    public BizMetricVO withApprovalInfo(Consumer<ApprovalVO> approvalInfoSetter) {
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

    public BizMetricVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public BizMetricVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
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

    public BizMetricVO withCreateTime(OffsetDateTime createTime) {
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

    public BizMetricVO withUpdateTime(OffsetDateTime updateTime) {
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

    public BizMetricVO withL1(String l1) {
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

    public BizMetricVO withL2(String l2) {
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

    public BizMetricVO withL3(String l3) {
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

    public BizMetricVO withBizMetric(SyncStatusEnum bizMetric) {
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

    public BizMetricVO withSummaryStatus(SyncStatusEnum summaryStatus) {
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

    public BizMetricVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public BizMetricVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public BizMetricVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        selfDefinedFieldsSetter.accept(this.selfDefinedFields);
        return this;
    }

    /**
     * 自定义项
     * @return selfDefinedFields
     */
    public List<SelfDefinedFieldVO> getSelfDefinedFields() {
        return selfDefinedFields;
    }

    public void setSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BizMetricVO that = (BizMetricVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.code, that.code) && Objects.equals(this.nameAlias, that.nameAlias)
            && Objects.equals(this.bizType, that.bizType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.bizCatalogId, that.bizCatalogId)
            && Objects.equals(this.bizCatalogPath, that.bizCatalogPath) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.dataOrigin, that.dataOrigin)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.timeFilters, that.timeFilters)
            && Objects.equals(this.dimensions, that.dimensions)
            && Objects.equals(this.generalFilters, that.generalFilters)
            && Objects.equals(this.intervalType, that.intervalType)
            && Objects.equals(this.applyScenario, that.applyScenario)
            && Objects.equals(this.technicalMetric, that.technicalMetric)
            && Objects.equals(this.technicalMetricName, that.technicalMetricName)
            && Objects.equals(this.technicalMetricType, that.technicalMetricType)
            && Objects.equals(this.measure, that.measure) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.ownerDepartment, that.ownerDepartment)
            && Objects.equals(this.destination, that.destination) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.definition, that.definition) && Objects.equals(this.expression, that.expression)
            && Objects.equals(this.remark, that.remark) && Objects.equals(this.approvalInfo, that.approvalInfo)
            && Objects.equals(this.newBiz, that.newBiz) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.l1, that.l1)
            && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.bizMetric, that.bizMetric) && Objects.equals(this.summaryStatus, that.summaryStatus)
            && Objects.equals(this.selfDefinedFields, that.selfDefinedFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            code,
            nameAlias,
            bizType,
            status,
            bizCatalogId,
            bizCatalogPath,
            createBy,
            updateBy,
            dataOrigin,
            unit,
            timeFilters,
            dimensions,
            generalFilters,
            intervalType,
            applyScenario,
            technicalMetric,
            technicalMetricName,
            technicalMetricType,
            measure,
            owner,
            ownerDepartment,
            destination,
            guid,
            definition,
            expression,
            remark,
            approvalInfo,
            newBiz,
            createTime,
            updateTime,
            l1,
            l2,
            l3,
            bizMetric,
            summaryStatus,
            selfDefinedFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BizMetricVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    nameAlias: ").append(toIndentedString(nameAlias)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bizCatalogId: ").append(toIndentedString(bizCatalogId)).append("\n");
        sb.append("    bizCatalogPath: ").append(toIndentedString(bizCatalogPath)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    dataOrigin: ").append(toIndentedString(dataOrigin)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    timeFilters: ").append(toIndentedString(timeFilters)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    generalFilters: ").append(toIndentedString(generalFilters)).append("\n");
        sb.append("    intervalType: ").append(toIndentedString(intervalType)).append("\n");
        sb.append("    applyScenario: ").append(toIndentedString(applyScenario)).append("\n");
        sb.append("    technicalMetric: ").append(toIndentedString(technicalMetric)).append("\n");
        sb.append("    technicalMetricName: ").append(toIndentedString(technicalMetricName)).append("\n");
        sb.append("    technicalMetricType: ").append(toIndentedString(technicalMetricType)).append("\n");
        sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerDepartment: ").append(toIndentedString(ownerDepartment)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    approvalInfo: ").append(toIndentedString(approvalInfo)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    bizMetric: ").append(toIndentedString(bizMetric)).append("\n");
        sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
        sb.append("    selfDefinedFields: ").append(toIndentedString(selfDefinedFields)).append("\n");
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
