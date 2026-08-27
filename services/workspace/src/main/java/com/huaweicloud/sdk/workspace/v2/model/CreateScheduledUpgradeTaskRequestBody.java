package com.huaweicloud.sdk.workspace.v2.model;

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
 * 新增升级任务请求
 */
public class CreateScheduledUpgradeTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private Integer taskType;

    /**
     * 执行周期类型：FIXED_TIME-指定时间 DAY-按天 WEEK-按周 MONTH-按月
     */
    public static final class ScheduledTypeEnum {

        /**
         * Enum FIXED_TIME for value: "FIXED_TIME"
         */
        public static final ScheduledTypeEnum FIXED_TIME = new ScheduledTypeEnum("FIXED_TIME");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final ScheduledTypeEnum DAY = new ScheduledTypeEnum("DAY");

        /**
         * Enum WEEK for value: "WEEK"
         */
        public static final ScheduledTypeEnum WEEK = new ScheduledTypeEnum("WEEK");

        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final ScheduledTypeEnum MONTH = new ScheduledTypeEnum("MONTH");

        private static final Map<String, ScheduledTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScheduledTypeEnum> createStaticFields() {
            Map<String, ScheduledTypeEnum> map = new HashMap<>();
            map.put("FIXED_TIME", FIXED_TIME);
            map.put("DAY", DAY);
            map.put("WEEK", WEEK);
            map.put("MONTH", MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScheduledTypeEnum(String value) {
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
        public static ScheduledTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduledTypeEnum(value));
        }

        public static ScheduledTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScheduledTypeEnum) {
                return this.value.equals(((ScheduledTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_type")

    private ScheduledTypeEnum scheduledType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_list")

    private String weekList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month_list")

    private String monthList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_list")

    private String dateList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_interval")

    private Integer dayInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_date")

    private String scheduledDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_time")

    private String scheduledTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force_execute")

    private Integer isForceExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_version")

    private String minVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_enable")

    private Integer expireEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_notify")

    private Integer isNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_params")

    private String extraParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_strategy")

    private Integer executeStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grayscale_rule")

    private Integer grayscaleRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "random_first_batch_count")

    private Integer randomFirstBatchCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_object_ids")

    private String grayObjectIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_fail_threshold")

    private Integer grayFailThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_end_time")

    private String scheduledEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable")

    private Integer isEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_objects")

    private List<TaskApplyObjectInfo> applyObjects = null;

    public CreateScheduledUpgradeTaskRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateScheduledUpgradeTaskRequestBody withTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型：0-云桌面 1-应用服务器 2-镜像
     * minimum: 0
     * maximum: 2
     * @return taskType
     */
    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public CreateScheduledUpgradeTaskRequestBody withScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * 执行周期类型：FIXED_TIME-指定时间 DAY-按天 WEEK-按周 MONTH-按月
     * @return scheduledType
     */
    public ScheduledTypeEnum getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
    }

    public CreateScheduledUpgradeTaskRequestBody withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 时区
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CreateScheduledUpgradeTaskRequestBody withWeekList(String weekList) {
        this.weekList = weekList;
        return this;
    }

    /**
     * 周期按周时：取值1~7，英文逗号分隔，如1,2,7
     * @return weekList
     */
    public String getWeekList() {
        return weekList;
    }

    public void setWeekList(String weekList) {
        this.weekList = weekList;
    }

    public CreateScheduledUpgradeTaskRequestBody withMonthList(String monthList) {
        this.monthList = monthList;
        return this;
    }

    /**
     * 周期按月时：取值1~12，英文逗号分隔
     * @return monthList
     */
    public String getMonthList() {
        return monthList;
    }

    public void setMonthList(String monthList) {
        this.monthList = monthList;
    }

    public CreateScheduledUpgradeTaskRequestBody withDateList(String dateList) {
        this.dateList = dateList;
        return this;
    }

    /**
     * 周期按月时：取值1~31及L(代表当月最后一天)
     * @return dateList
     */
    public String getDateList() {
        return dateList;
    }

    public void setDateList(String dateList) {
        this.dateList = dateList;
    }

    public CreateScheduledUpgradeTaskRequestBody withDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
        return this;
    }

    /**
     * 按天跳过天数
     * minimum: 1
     * maximum: 31
     * @return dayInterval
     */
    public Integer getDayInterval() {
        return dayInterval;
    }

    public void setDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
    }

    public CreateScheduledUpgradeTaskRequestBody withScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
        return this;
    }

    /**
     * 周期指定时间时：表示指定的日期
     * @return scheduledDate
     */
    public String getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public CreateScheduledUpgradeTaskRequestBody withScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }

    /**
     * 指定的执行时间点
     * @return scheduledTime
     */
    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public CreateScheduledUpgradeTaskRequestBody withIsForceExecute(Integer isForceExecute) {
        this.isForceExecute = isForceExecute;
        return this;
    }

    /**
     * 是否强制升级：0-否 1-是
     * minimum: 0
     * maximum: 1
     * @return isForceExecute
     */
    public Integer getIsForceExecute() {
        return isForceExecute;
    }

    public void setIsForceExecute(Integer isForceExecute) {
        this.isForceExecute = isForceExecute;
    }

    public CreateScheduledUpgradeTaskRequestBody withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /**
     * 低于此版本升级
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    public CreateScheduledUpgradeTaskRequestBody withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 升级目标版本
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public CreateScheduledUpgradeTaskRequestBody withExpireEnable(Integer expireEnable) {
        this.expireEnable = expireEnable;
        return this;
    }

    /**
     * 过期时间开启：0-未开启 1-开启
     * minimum: 0
     * maximum: 1
     * @return expireEnable
     */
    public Integer getExpireEnable() {
        return expireEnable;
    }

    public void setExpireEnable(Integer expireEnable) {
        this.expireEnable = expireEnable;
    }

    public CreateScheduledUpgradeTaskRequestBody withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CreateScheduledUpgradeTaskRequestBody withIsNotify(Integer isNotify) {
        this.isNotify = isNotify;
        return this;
    }

    /**
     * 是否通知：0-不通知 1-通知
     * minimum: 0
     * maximum: 1
     * @return isNotify
     */
    public Integer getIsNotify() {
        return isNotify;
    }

    public void setIsNotify(Integer isNotify) {
        this.isNotify = isNotify;
    }

    public CreateScheduledUpgradeTaskRequestBody withExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }

    /**
     * 扩展参数（JSON格式）
     * @return extraParams
     */
    public String getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(String extraParams) {
        this.extraParams = extraParams;
    }

    public CreateScheduledUpgradeTaskRequestBody withExecuteStrategy(Integer executeStrategy) {
        this.executeStrategy = executeStrategy;
        return this;
    }

    /**
     * 执行策略：0-全量下发 1-灰度下发
     * minimum: 0
     * maximum: 1
     * @return executeStrategy
     */
    public Integer getExecuteStrategy() {
        return executeStrategy;
    }

    public void setExecuteStrategy(Integer executeStrategy) {
        this.executeStrategy = executeStrategy;
    }

    public CreateScheduledUpgradeTaskRequestBody withGrayscaleRule(Integer grayscaleRule) {
        this.grayscaleRule = grayscaleRule;
        return this;
    }

    /**
     * 灰度规则：0-确定 1-随机（execute_strategy=1时使用）
     * minimum: 0
     * maximum: 1
     * @return grayscaleRule
     */
    public Integer getGrayscaleRule() {
        return grayscaleRule;
    }

    public void setGrayscaleRule(Integer grayscaleRule) {
        this.grayscaleRule = grayscaleRule;
    }

    public CreateScheduledUpgradeTaskRequestBody withRandomFirstBatchCount(Integer randomFirstBatchCount) {
        this.randomFirstBatchCount = randomFirstBatchCount;
        return this;
    }

    /**
     * 随机首批执行数
     * minimum: 0
     * maximum: 2147483647
     * @return randomFirstBatchCount
     */
    public Integer getRandomFirstBatchCount() {
        return randomFirstBatchCount;
    }

    public void setRandomFirstBatchCount(Integer randomFirstBatchCount) {
        this.randomFirstBatchCount = randomFirstBatchCount;
    }

    public CreateScheduledUpgradeTaskRequestBody withGrayObjectIds(String grayObjectIds) {
        this.grayObjectIds = grayObjectIds;
        return this;
    }

    /**
     * 灰度对象id列表（JSON数组格式）
     * @return grayObjectIds
     */
    public String getGrayObjectIds() {
        return grayObjectIds;
    }

    public void setGrayObjectIds(String grayObjectIds) {
        this.grayObjectIds = grayObjectIds;
    }

    public CreateScheduledUpgradeTaskRequestBody withGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
        return this;
    }

    /**
     * 首批执行失败阈值
     * minimum: 0
     * maximum: 2147483647
     * @return grayFailThreshold
     */
    public Integer getGrayFailThreshold() {
        return grayFailThreshold;
    }

    public void setGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
    }

    public CreateScheduledUpgradeTaskRequestBody withScheduledEndTime(String scheduledEndTime) {
        this.scheduledEndTime = scheduledEndTime;
        return this;
    }

    /**
     * 时间窗结束时间
     * @return scheduledEndTime
     */
    public String getScheduledEndTime() {
        return scheduledEndTime;
    }

    public void setScheduledEndTime(String scheduledEndTime) {
        this.scheduledEndTime = scheduledEndTime;
    }

    public CreateScheduledUpgradeTaskRequestBody withIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    /**
     * 是否启用
     * minimum: 0
     * maximum: 1
     * @return isEnable
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public CreateScheduledUpgradeTaskRequestBody withDescription(String description) {
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

    public CreateScheduledUpgradeTaskRequestBody withApplyObjects(List<TaskApplyObjectInfo> applyObjects) {
        this.applyObjects = applyObjects;
        return this;
    }

    public CreateScheduledUpgradeTaskRequestBody addApplyObjectsItem(TaskApplyObjectInfo applyObjectsItem) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        this.applyObjects.add(applyObjectsItem);
        return this;
    }

    public CreateScheduledUpgradeTaskRequestBody withApplyObjects(
        Consumer<List<TaskApplyObjectInfo>> applyObjectsSetter) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        applyObjectsSetter.accept(this.applyObjects);
        return this;
    }

    /**
     * 应用对象列表
     * @return applyObjects
     */
    public List<TaskApplyObjectInfo> getApplyObjects() {
        return applyObjects;
    }

    public void setApplyObjects(List<TaskApplyObjectInfo> applyObjects) {
        this.applyObjects = applyObjects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateScheduledUpgradeTaskRequestBody that = (CreateScheduledUpgradeTaskRequestBody) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.scheduledType, that.scheduledType) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.weekList, that.weekList) && Objects.equals(this.monthList, that.monthList)
            && Objects.equals(this.dateList, that.dateList) && Objects.equals(this.dayInterval, that.dayInterval)
            && Objects.equals(this.scheduledDate, that.scheduledDate)
            && Objects.equals(this.scheduledTime, that.scheduledTime)
            && Objects.equals(this.isForceExecute, that.isForceExecute)
            && Objects.equals(this.minVersion, that.minVersion)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.expireEnable, that.expireEnable) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.isNotify, that.isNotify) && Objects.equals(this.extraParams, that.extraParams)
            && Objects.equals(this.executeStrategy, that.executeStrategy)
            && Objects.equals(this.grayscaleRule, that.grayscaleRule)
            && Objects.equals(this.randomFirstBatchCount, that.randomFirstBatchCount)
            && Objects.equals(this.grayObjectIds, that.grayObjectIds)
            && Objects.equals(this.grayFailThreshold, that.grayFailThreshold)
            && Objects.equals(this.scheduledEndTime, that.scheduledEndTime)
            && Objects.equals(this.isEnable, that.isEnable) && Objects.equals(this.description, that.description)
            && Objects.equals(this.applyObjects, that.applyObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            taskType,
            scheduledType,
            timezone,
            weekList,
            monthList,
            dateList,
            dayInterval,
            scheduledDate,
            scheduledTime,
            isForceExecute,
            minVersion,
            targetVersion,
            expireEnable,
            expireTime,
            isNotify,
            extraParams,
            executeStrategy,
            grayscaleRule,
            randomFirstBatchCount,
            grayObjectIds,
            grayFailThreshold,
            scheduledEndTime,
            isEnable,
            description,
            applyObjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScheduledUpgradeTaskRequestBody {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    weekList: ").append(toIndentedString(weekList)).append("\n");
        sb.append("    monthList: ").append(toIndentedString(monthList)).append("\n");
        sb.append("    dateList: ").append(toIndentedString(dateList)).append("\n");
        sb.append("    dayInterval: ").append(toIndentedString(dayInterval)).append("\n");
        sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
        sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
        sb.append("    isForceExecute: ").append(toIndentedString(isForceExecute)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    expireEnable: ").append(toIndentedString(expireEnable)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    isNotify: ").append(toIndentedString(isNotify)).append("\n");
        sb.append("    extraParams: ").append(toIndentedString(extraParams)).append("\n");
        sb.append("    executeStrategy: ").append(toIndentedString(executeStrategy)).append("\n");
        sb.append("    grayscaleRule: ").append(toIndentedString(grayscaleRule)).append("\n");
        sb.append("    randomFirstBatchCount: ").append(toIndentedString(randomFirstBatchCount)).append("\n");
        sb.append("    grayObjectIds: ").append(toIndentedString(grayObjectIds)).append("\n");
        sb.append("    grayFailThreshold: ").append(toIndentedString(grayFailThreshold)).append("\n");
        sb.append("    scheduledEndTime: ").append(toIndentedString(scheduledEndTime)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    applyObjects: ").append(toIndentedString(applyObjects)).append("\n");
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
