package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QualityTaskOverviewVO
 */
public class QualityTaskOverviewVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Long categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_status")

    private String scheduleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_period")

    private String schedulePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_interval")

    private String scheduleInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_run_time")

    private Long lastRunTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    public QualityTaskOverviewVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QualityTaskOverviewVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QualityTaskOverviewVO withCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 目录ID
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public QualityTaskOverviewVO withScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }

    /**
     * 调度状态 UNKNOWN:未知,NOT_START:未启动,SCHEDULING:调度中,FINISH_SUCCESS:正常结束,KILL:手动停止,RUNNING_EXCEPTION:运行失败
     * @return scheduleStatus
     */
    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public QualityTaskOverviewVO withSchedulePeriod(String schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
        return this;
    }

    /**
     * 调度周期 MINUTE:按分钟调度,HOUR:按小时调度,DAY:按天调度,WEEK:按周调度
     * @return schedulePeriod
     */
    public String getSchedulePeriod() {
        return schedulePeriod;
    }

    public void setSchedulePeriod(String schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
    }

    public QualityTaskOverviewVO withScheduleInterval(String scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
        return this;
    }

    /**
     * 调度间隔 当调度周期为分钟、小时、天时，返回数值字符串，当调度周期为周时，返回具体的调度星期信息如（MONDAY,THURSDAY）
     * @return scheduleInterval
     */
    public String getScheduleInterval() {
        return scheduleInterval;
    }

    public void setScheduleInterval(String scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
    }

    public QualityTaskOverviewVO withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间,13位时间戳(精确到毫秒)
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public QualityTaskOverviewVO withLastRunTime(Long lastRunTime) {
        this.lastRunTime = lastRunTime;
        return this;
    }

    /**
     * 最近运行时间,13位时间戳(精确到毫秒)
     * @return lastRunTime
     */
    public Long getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(Long lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public QualityTaskOverviewVO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualityTaskOverviewVO qualityTaskOverviewVO = (QualityTaskOverviewVO) o;
        return Objects.equals(this.id, qualityTaskOverviewVO.id)
            && Objects.equals(this.name, qualityTaskOverviewVO.name)
            && Objects.equals(this.categoryId, qualityTaskOverviewVO.categoryId)
            && Objects.equals(this.scheduleStatus, qualityTaskOverviewVO.scheduleStatus)
            && Objects.equals(this.schedulePeriod, qualityTaskOverviewVO.schedulePeriod)
            && Objects.equals(this.scheduleInterval, qualityTaskOverviewVO.scheduleInterval)
            && Objects.equals(this.createTime, qualityTaskOverviewVO.createTime)
            && Objects.equals(this.lastRunTime, qualityTaskOverviewVO.lastRunTime)
            && Objects.equals(this.creator, qualityTaskOverviewVO.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            categoryId,
            scheduleStatus,
            schedulePeriod,
            scheduleInterval,
            createTime,
            lastRunTime,
            creator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityTaskOverviewVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
        sb.append("    schedulePeriod: ").append(toIndentedString(schedulePeriod)).append("\n");
        sb.append("    scheduleInterval: ").append(toIndentedString(scheduleInterval)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastRunTime: ").append(toIndentedString(lastRunTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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
