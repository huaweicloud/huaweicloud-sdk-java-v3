package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 重分布进度信息。 **取值范围**： 不涉及。
 */
public class RedisProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bytes_done")

    private Long bytesDone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "byte_left")

    private Long byteLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables_done")

    private Integer tablesDone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables_left")

    private Integer tablesLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_progress")

    private Integer tableProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_progress")

    private Integer totalProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_rate")

    private String redisRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_time")

    private String estimatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed")

    private Boolean completed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initialed")

    private Boolean initialed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_count")

    private Integer failCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redistributing")

    private Boolean redistributing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pause_by_user")

    private Boolean pauseByUser;

    public RedisProgress withBytesDone(Long bytesDone) {
        this.bytesDone = bytesDone;
        return this;
    }

    /**
     * **参数解释**： 已完成字节数。 **取值范围**： 不涉及。
     * @return bytesDone
     */
    public Long getBytesDone() {
        return bytesDone;
    }

    public void setBytesDone(Long bytesDone) {
        this.bytesDone = bytesDone;
    }

    public RedisProgress withByteLeft(Long byteLeft) {
        this.byteLeft = byteLeft;
        return this;
    }

    /**
     * **参数解释**： 剩余字节数。 **取值范围**： 不涉及。
     * @return byteLeft
     */
    public Long getByteLeft() {
        return byteLeft;
    }

    public void setByteLeft(Long byteLeft) {
        this.byteLeft = byteLeft;
    }

    public RedisProgress withTablesDone(Integer tablesDone) {
        this.tablesDone = tablesDone;
        return this;
    }

    /**
     * **参数解释**： 完成表数量。 **取值范围**： 不涉及。
     * @return tablesDone
     */
    public Integer getTablesDone() {
        return tablesDone;
    }

    public void setTablesDone(Integer tablesDone) {
        this.tablesDone = tablesDone;
    }

    public RedisProgress withTablesLeft(Integer tablesLeft) {
        this.tablesLeft = tablesLeft;
        return this;
    }

    /**
     * **参数解释**： 剩余表数量。 **取值范围**： 不涉及。
     * @return tablesLeft
     */
    public Integer getTablesLeft() {
        return tablesLeft;
    }

    public void setTablesLeft(Integer tablesLeft) {
        this.tablesLeft = tablesLeft;
    }

    public RedisProgress withTableProgress(Integer tableProgress) {
        this.tableProgress = tableProgress;
        return this;
    }

    /**
     * **参数解释**： 表重分布进度。 **取值范围**： 1~100。
     * @return tableProgress
     */
    public Integer getTableProgress() {
        return tableProgress;
    }

    public void setTableProgress(Integer tableProgress) {
        this.tableProgress = tableProgress;
    }

    public RedisProgress withTotalProgress(Integer totalProgress) {
        this.totalProgress = totalProgress;
        return this;
    }

    /**
     * **参数解释**： 总进度。 **取值范围**： 1~100。
     * @return totalProgress
     */
    public Integer getTotalProgress() {
        return totalProgress;
    }

    public void setTotalProgress(Integer totalProgress) {
        this.totalProgress = totalProgress;
    }

    public RedisProgress withRedisRate(String redisRate) {
        this.redisRate = redisRate;
        return this;
    }

    /**
     * **参数解释**： 重分布速度。 **取值范围**： 不涉及。
     * @return redisRate
     */
    public String getRedisRate() {
        return redisRate;
    }

    public void setRedisRate(String redisRate) {
        this.redisRate = redisRate;
    }

    public RedisProgress withEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
        return this;
    }

    /**
     * **参数解释**： 预估时间。 **取值范围**： 不涉及。
     * @return estimatedTime
     */
    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public RedisProgress withCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }

    /**
     * **参数解释**： 是否已完成。 **取值范围**： 不涉及。
     * @return completed
     */
    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public RedisProgress withInitialed(Boolean initialed) {
        this.initialed = initialed;
        return this;
    }

    /**
     * **参数解释**： 是否完成初始化。 **取值范围**： 不涉及。
     * @return initialed
     */
    public Boolean getInitialed() {
        return initialed;
    }

    public void setInitialed(Boolean initialed) {
        this.initialed = initialed;
    }

    public RedisProgress withFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }

    /**
     * **参数解释**： 失败次数。 **取值范围**： 不涉及。
     * @return failCount
     */
    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public RedisProgress withRedistributing(Boolean redistributing) {
        this.redistributing = redistributing;
        return this;
    }

    /**
     * **参数解释**： cm_ctl查询的重分布结果。 **取值范围**： 不涉及。
     * @return redistributing
     */
    public Boolean getRedistributing() {
        return redistributing;
    }

    public void setRedistributing(Boolean redistributing) {
        this.redistributing = redistributing;
    }

    public RedisProgress withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RedisProgress withPauseByUser(Boolean pauseByUser) {
        this.pauseByUser = pauseByUser;
        return this;
    }

    /**
     * **参数解释**： 是否用户暂停。 **取值范围**： 不涉及。
     * @return pauseByUser
     */
    public Boolean getPauseByUser() {
        return pauseByUser;
    }

    public void setPauseByUser(Boolean pauseByUser) {
        this.pauseByUser = pauseByUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedisProgress that = (RedisProgress) obj;
        return Objects.equals(this.bytesDone, that.bytesDone) && Objects.equals(this.byteLeft, that.byteLeft)
            && Objects.equals(this.tablesDone, that.tablesDone) && Objects.equals(this.tablesLeft, that.tablesLeft)
            && Objects.equals(this.tableProgress, that.tableProgress)
            && Objects.equals(this.totalProgress, that.totalProgress) && Objects.equals(this.redisRate, that.redisRate)
            && Objects.equals(this.estimatedTime, that.estimatedTime) && Objects.equals(this.completed, that.completed)
            && Objects.equals(this.initialed, that.initialed) && Objects.equals(this.failCount, that.failCount)
            && Objects.equals(this.redistributing, that.redistributing) && Objects.equals(this.status, that.status)
            && Objects.equals(this.pauseByUser, that.pauseByUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bytesDone,
            byteLeft,
            tablesDone,
            tablesLeft,
            tableProgress,
            totalProgress,
            redisRate,
            estimatedTime,
            completed,
            initialed,
            failCount,
            redistributing,
            status,
            pauseByUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisProgress {\n");
        sb.append("    bytesDone: ").append(toIndentedString(bytesDone)).append("\n");
        sb.append("    byteLeft: ").append(toIndentedString(byteLeft)).append("\n");
        sb.append("    tablesDone: ").append(toIndentedString(tablesDone)).append("\n");
        sb.append("    tablesLeft: ").append(toIndentedString(tablesLeft)).append("\n");
        sb.append("    tableProgress: ").append(toIndentedString(tableProgress)).append("\n");
        sb.append("    totalProgress: ").append(toIndentedString(totalProgress)).append("\n");
        sb.append("    redisRate: ").append(toIndentedString(redisRate)).append("\n");
        sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    initialed: ").append(toIndentedString(initialed)).append("\n");
        sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
        sb.append("    redistributing: ").append(toIndentedString(redistributing)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    pauseByUser: ").append(toIndentedString(pauseByUser)).append("\n");
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
