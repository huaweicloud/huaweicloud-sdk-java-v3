package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowScheduledTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_execute")

    private Boolean forceExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_type")

    private String scheduledType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "life_cycle_type")

    private String lifeCycleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_interval")

    private Integer dayInterval;

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
    @JsonProperty(value = "scheduled_date")

    private String scheduledDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_time")

    private String scheduledTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_params")

    private String extraParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_objects")

    private List<ApplyObject> applyObjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_count")

    private Integer grayCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_desktop_ids")

    private List<String> grayDesktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_fail_threshold")

    private Integer grayFailThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_time")

    private Integer waitTime;

    public ShowScheduledTasksResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowScheduledTasksResponse withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型。START：开机，STOP：关机，REBOOT：重启，HIBERNATE：休眠，REBUILD：重建系统盘，EXECUTE_SCRIPT：执行脚本。scheduled_type为LIFE_CYCLE时，不支持START、REBUILD。
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ShowScheduledTasksResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ShowScheduledTasksResponse withForceExecute(Boolean forceExecute) {
        this.forceExecute = forceExecute;
        return this;
    }

    /**
     * 是否强制执行。
     * @return forceExecute
     */
    public Boolean getForceExecute() {
        return forceExecute;
    }

    public void setForceExecute(Boolean forceExecute) {
        this.forceExecute = forceExecute;
    }

    public ShowScheduledTasksResponse withScheduledType(String scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * 执行周期类型。FIXED_TIME：指定时间，DAY：按天，WEEK：按周，MONTH：按月，LIFE_CYCLE：指定场景下触发。
     * @return scheduledType
     */
    public String getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(String scheduledType) {
        this.scheduledType = scheduledType;
    }

    public ShowScheduledTasksResponse withLifeCycleType(String lifeCycleType) {
        this.lifeCycleType = lifeCycleType;
        return this;
    }

    /**
     * 触发场景类型。仅当scheduled_type为LIFE_CYCLE时，生效。POST_CREATE_DESKTOP_SUCCESS：创建桌面成功后，POST_REBUILD_DESKTOP_SUCCESS：重建桌面成功后，POST_REATTACH_DESKTOP_SUCCESS：触发重建的分配用户任务成功后。
     * @return lifeCycleType
     */
    public String getLifeCycleType() {
        return lifeCycleType;
    }

    public void setLifeCycleType(String lifeCycleType) {
        this.lifeCycleType = lifeCycleType;
    }

    public ShowScheduledTasksResponse withDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
        return this;
    }

    /**
     * 周期按天时：按x天间隔执行。
     * @return dayInterval
     */
    public Integer getDayInterval() {
        return dayInterval;
    }

    public void setDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
    }

    public ShowScheduledTasksResponse withWeekList(String weekList) {
        this.weekList = weekList;
        return this;
    }

    /**
     * 周期按周时：取值1~7，分别对应周日~周六，英文逗号分隔，如1,2,7。
     * @return weekList
     */
    public String getWeekList() {
        return weekList;
    }

    public void setWeekList(String weekList) {
        this.weekList = weekList;
    }

    public ShowScheduledTasksResponse withMonthList(String monthList) {
        this.monthList = monthList;
        return this;
    }

    /**
     * 周期按月时：取值1~12，英文逗号分隔，如1,3,12。
     * @return monthList
     */
    public String getMonthList() {
        return monthList;
    }

    public void setMonthList(String monthList) {
        this.monthList = monthList;
    }

    public ShowScheduledTasksResponse withDateList(String dateList) {
        this.dateList = dateList;
        return this;
    }

    /**
     * 周期按月时：取值1~31及L(代表当月最后一天)，英文逗号分隔，如1,2,28,L。
     * @return dateList
     */
    public String getDateList() {
        return dateList;
    }

    public void setDateList(String dateList) {
        this.dateList = dateList;
    }

    public ShowScheduledTasksResponse withScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
        return this;
    }

    /**
     * 周期指定时间时：表示指定的日期，格式为yyyy-MM-dd。
     * @return scheduledDate
     */
    public String getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public ShowScheduledTasksResponse withScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }

    /**
     * 指定的执行时间点，格式为HH:mm:ss。
     * @return scheduledTime
     */
    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public ShowScheduledTasksResponse withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 到期时间，格式为yyyy-MM-dd HH:mm:ss。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ShowScheduledTasksResponse withDescription(String description) {
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

    public ShowScheduledTasksResponse withExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }

    /**
     * 扩展参数，json格式。
     * @return extraParams
     */
    public String getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(String extraParams) {
        this.extraParams = extraParams;
    }

    public ShowScheduledTasksResponse withApplyObjects(List<ApplyObject> applyObjects) {
        this.applyObjects = applyObjects;
        return this;
    }

    public ShowScheduledTasksResponse addApplyObjectsItem(ApplyObject applyObjectsItem) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        this.applyObjects.add(applyObjectsItem);
        return this;
    }

    public ShowScheduledTasksResponse withApplyObjects(Consumer<List<ApplyObject>> applyObjectsSetter) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        applyObjectsSetter.accept(this.applyObjects);
        return this;
    }

    /**
     * 定时任务应用的对象列表。
     * @return applyObjects
     */
    public List<ApplyObject> getApplyObjects() {
        return applyObjects;
    }

    public void setApplyObjects(List<ApplyObject> applyObjects) {
        this.applyObjects = applyObjects;
    }

    public ShowScheduledTasksResponse withGrayCount(Integer grayCount) {
        this.grayCount = grayCount;
        return this;
    }

    /**
     * 灰度对象数量，优先级高于gray_desktop_ids。
     * @return grayCount
     */
    public Integer getGrayCount() {
        return grayCount;
    }

    public void setGrayCount(Integer grayCount) {
        this.grayCount = grayCount;
    }

    public ShowScheduledTasksResponse withGrayDesktopIds(List<String> grayDesktopIds) {
        this.grayDesktopIds = grayDesktopIds;
        return this;
    }

    public ShowScheduledTasksResponse addGrayDesktopIdsItem(String grayDesktopIdsItem) {
        if (this.grayDesktopIds == null) {
            this.grayDesktopIds = new ArrayList<>();
        }
        this.grayDesktopIds.add(grayDesktopIdsItem);
        return this;
    }

    public ShowScheduledTasksResponse withGrayDesktopIds(Consumer<List<String>> grayDesktopIdsSetter) {
        if (this.grayDesktopIds == null) {
            this.grayDesktopIds = new ArrayList<>();
        }
        grayDesktopIdsSetter.accept(this.grayDesktopIds);
        return this;
    }

    /**
     * 灰度执行的桌面id列表，优先级低于gray_count。
     * @return grayDesktopIds
     */
    public List<String> getGrayDesktopIds() {
        return grayDesktopIds;
    }

    public void setGrayDesktopIds(List<String> grayDesktopIds) {
        this.grayDesktopIds = grayDesktopIds;
    }

    public ShowScheduledTasksResponse withGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
        return this;
    }

    /**
     * 灰度失败阈值，灰度执行失败次数达到该值时，不执行下一批任务。
     * @return grayFailThreshold
     */
    public Integer getGrayFailThreshold() {
        return grayFailThreshold;
    }

    public void setGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
    }

    public ShowScheduledTasksResponse withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public ShowScheduledTasksResponse withWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
        return this;
    }

    /**
     * 触发式任务触发后，等待时长。
     * @return waitTime
     */
    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowScheduledTasksResponse that = (ShowScheduledTasksResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.forceExecute, that.forceExecute)
            && Objects.equals(this.scheduledType, that.scheduledType)
            && Objects.equals(this.lifeCycleType, that.lifeCycleType)
            && Objects.equals(this.dayInterval, that.dayInterval) && Objects.equals(this.weekList, that.weekList)
            && Objects.equals(this.monthList, that.monthList) && Objects.equals(this.dateList, that.dateList)
            && Objects.equals(this.scheduledDate, that.scheduledDate)
            && Objects.equals(this.scheduledTime, that.scheduledTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.extraParams, that.extraParams)
            && Objects.equals(this.applyObjects, that.applyObjects) && Objects.equals(this.grayCount, that.grayCount)
            && Objects.equals(this.grayDesktopIds, that.grayDesktopIds)
            && Objects.equals(this.grayFailThreshold, that.grayFailThreshold)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.waitTime, that.waitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            taskType,
            taskName,
            forceExecute,
            scheduledType,
            lifeCycleType,
            dayInterval,
            weekList,
            monthList,
            dateList,
            scheduledDate,
            scheduledTime,
            expireTime,
            description,
            extraParams,
            applyObjects,
            grayCount,
            grayDesktopIds,
            grayFailThreshold,
            timeZone,
            waitTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScheduledTasksResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    forceExecute: ").append(toIndentedString(forceExecute)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    lifeCycleType: ").append(toIndentedString(lifeCycleType)).append("\n");
        sb.append("    dayInterval: ").append(toIndentedString(dayInterval)).append("\n");
        sb.append("    weekList: ").append(toIndentedString(weekList)).append("\n");
        sb.append("    monthList: ").append(toIndentedString(monthList)).append("\n");
        sb.append("    dateList: ").append(toIndentedString(dateList)).append("\n");
        sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
        sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    extraParams: ").append(toIndentedString(extraParams)).append("\n");
        sb.append("    applyObjects: ").append(toIndentedString(applyObjects)).append("\n");
        sb.append("    grayCount: ").append(toIndentedString(grayCount)).append("\n");
        sb.append("    grayDesktopIds: ").append(toIndentedString(grayDesktopIds)).append("\n");
        sb.append("    grayFailThreshold: ").append(toIndentedString(grayFailThreshold)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
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
