package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 总览统计数据
 */
public class OverviewStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_request_count")

    private Long textRequestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_request_count")

    private Long imageRequestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type_stats")

    private List<AccessTypeStatistics> accessTypeStats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_stats")

    private List<CategoryStatistics> categoryStats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_stats")

    private List<ActionStatistics> actionStats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private TimeRange timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_app_count")

    private Long activeAppCount;

    public OverviewStatistics withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public OverviewStatistics withTextRequestCount(Long textRequestCount) {
        this.textRequestCount = textRequestCount;
        return this;
    }

    /**
     * 用户输入请求数
     * @return textRequestCount
     */
    public Long getTextRequestCount() {
        return textRequestCount;
    }

    public void setTextRequestCount(Long textRequestCount) {
        this.textRequestCount = textRequestCount;
    }

    public OverviewStatistics withImageRequestCount(Long imageRequestCount) {
        this.imageRequestCount = imageRequestCount;
        return this;
    }

    /**
     * 用户输出请求数
     * @return imageRequestCount
     */
    public Long getImageRequestCount() {
        return imageRequestCount;
    }

    public void setImageRequestCount(Long imageRequestCount) {
        this.imageRequestCount = imageRequestCount;
    }

    public OverviewStatistics withAccessTypeStats(List<AccessTypeStatistics> accessTypeStats) {
        this.accessTypeStats = accessTypeStats;
        return this;
    }

    public OverviewStatistics addAccessTypeStatsItem(AccessTypeStatistics accessTypeStatsItem) {
        if (this.accessTypeStats == null) {
            this.accessTypeStats = new ArrayList<>();
        }
        this.accessTypeStats.add(accessTypeStatsItem);
        return this;
    }

    public OverviewStatistics withAccessTypeStats(Consumer<List<AccessTypeStatistics>> accessTypeStatsSetter) {
        if (this.accessTypeStats == null) {
            this.accessTypeStats = new ArrayList<>();
        }
        accessTypeStatsSetter.accept(this.accessTypeStats);
        return this;
    }

    /**
     * 按接入类型统计
     * @return accessTypeStats
     */
    public List<AccessTypeStatistics> getAccessTypeStats() {
        return accessTypeStats;
    }

    public void setAccessTypeStats(List<AccessTypeStatistics> accessTypeStats) {
        this.accessTypeStats = accessTypeStats;
    }

    public OverviewStatistics withCategoryStats(List<CategoryStatistics> categoryStats) {
        this.categoryStats = categoryStats;
        return this;
    }

    public OverviewStatistics addCategoryStatsItem(CategoryStatistics categoryStatsItem) {
        if (this.categoryStats == null) {
            this.categoryStats = new ArrayList<>();
        }
        this.categoryStats.add(categoryStatsItem);
        return this;
    }

    public OverviewStatistics withCategoryStats(Consumer<List<CategoryStatistics>> categoryStatsSetter) {
        if (this.categoryStats == null) {
            this.categoryStats = new ArrayList<>();
        }
        categoryStatsSetter.accept(this.categoryStats);
        return this;
    }

    /**
     * 分类别统计数据
     * @return categoryStats
     */
    public List<CategoryStatistics> getCategoryStats() {
        return categoryStats;
    }

    public void setCategoryStats(List<CategoryStatistics> categoryStats) {
        this.categoryStats = categoryStats;
    }

    public OverviewStatistics withActionStats(List<ActionStatistics> actionStats) {
        this.actionStats = actionStats;
        return this;
    }

    public OverviewStatistics addActionStatsItem(ActionStatistics actionStatsItem) {
        if (this.actionStats == null) {
            this.actionStats = new ArrayList<>();
        }
        this.actionStats.add(actionStatsItem);
        return this;
    }

    public OverviewStatistics withActionStats(Consumer<List<ActionStatistics>> actionStatsSetter) {
        if (this.actionStats == null) {
            this.actionStats = new ArrayList<>();
        }
        actionStatsSetter.accept(this.actionStats);
        return this;
    }

    /**
     * 处置动作统计数据
     * @return actionStats
     */
    public List<ActionStatistics> getActionStats() {
        return actionStats;
    }

    public void setActionStats(List<ActionStatistics> actionStats) {
        this.actionStats = actionStats;
    }

    public OverviewStatistics withTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public OverviewStatistics withTimeRange(Consumer<TimeRange> timeRangeSetter) {
        if (this.timeRange == null) {
            this.timeRange = new TimeRange();
            timeRangeSetter.accept(this.timeRange);
        }

        return this;
    }

    /**
     * Get timeRange
     * @return timeRange
     */
    public TimeRange getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    public OverviewStatistics withActiveAppCount(Long activeAppCount) {
        this.activeAppCount = activeAppCount;
        return this;
    }

    /**
     * 已开启的AI应用数量
     * @return activeAppCount
     */
    public Long getActiveAppCount() {
        return activeAppCount;
    }

    public void setActiveAppCount(Long activeAppCount) {
        this.activeAppCount = activeAppCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OverviewStatistics that = (OverviewStatistics) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.textRequestCount, that.textRequestCount)
            && Objects.equals(this.imageRequestCount, that.imageRequestCount)
            && Objects.equals(this.accessTypeStats, that.accessTypeStats)
            && Objects.equals(this.categoryStats, that.categoryStats)
            && Objects.equals(this.actionStats, that.actionStats) && Objects.equals(this.timeRange, that.timeRange)
            && Objects.equals(this.activeAppCount, that.activeAppCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            textRequestCount,
            imageRequestCount,
            accessTypeStats,
            categoryStats,
            actionStats,
            timeRange,
            activeAppCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverviewStatistics {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    textRequestCount: ").append(toIndentedString(textRequestCount)).append("\n");
        sb.append("    imageRequestCount: ").append(toIndentedString(imageRequestCount)).append("\n");
        sb.append("    accessTypeStats: ").append(toIndentedString(accessTypeStats)).append("\n");
        sb.append("    categoryStats: ").append(toIndentedString(categoryStats)).append("\n");
        sb.append("    actionStats: ").append(toIndentedString(actionStats)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    activeAppCount: ").append(toIndentedString(activeAppCount)).append("\n");
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
