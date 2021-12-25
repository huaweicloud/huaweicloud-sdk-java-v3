package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 仓库统计信息 */
public class RepoCommitStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_branch_commits_count")

    private Integer allBranchCommitsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codelines")

    private List<RepoDailyCodeline> codelines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private RepoStatisticsEvent event;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<RepoStatistics> statistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public RepoCommitStatistics withAllBranchCommitsCount(Integer allBranchCommitsCount) {
        this.allBranchCommitsCount = allBranchCommitsCount;
        return this;
    }

    /** 仓库总提交次数
     * 
     * @return allBranchCommitsCount */
    public Integer getAllBranchCommitsCount() {
        return allBranchCommitsCount;
    }

    public void setAllBranchCommitsCount(Integer allBranchCommitsCount) {
        this.allBranchCommitsCount = allBranchCommitsCount;
    }

    public RepoCommitStatistics withCodelines(List<RepoDailyCodeline> codelines) {
        this.codelines = codelines;
        return this;
    }

    public RepoCommitStatistics addCodelinesItem(RepoDailyCodeline codelinesItem) {
        if (this.codelines == null) {
            this.codelines = new ArrayList<>();
        }
        this.codelines.add(codelinesItem);
        return this;
    }

    public RepoCommitStatistics withCodelines(Consumer<List<RepoDailyCodeline>> codelinesSetter) {
        if (this.codelines == null) {
            this.codelines = new ArrayList<>();
        }
        codelinesSetter.accept(this.codelines);
        return this;
    }

    /** 近15日每日代码提交行数
     * 
     * @return codelines */
    public List<RepoDailyCodeline> getCodelines() {
        return codelines;
    }

    public void setCodelines(List<RepoDailyCodeline> codelines) {
        this.codelines = codelines;
    }

    public RepoCommitStatistics withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 对应分支仓库总提交次数
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public RepoCommitStatistics withEvent(RepoStatisticsEvent event) {
        this.event = event;
        return this;
    }

    public RepoCommitStatistics withEvent(Consumer<RepoStatisticsEvent> eventSetter) {
        if (this.event == null) {
            this.event = new RepoStatisticsEvent();
            eventSetter.accept(this.event);
        }

        return this;
    }

    /** Get event
     * 
     * @return event */
    public RepoStatisticsEvent getEvent() {
        return event;
    }

    public void setEvent(RepoStatisticsEvent event) {
        this.event = event;
    }

    public RepoCommitStatistics withStatistics(List<RepoStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }

    public RepoCommitStatistics addStatisticsItem(RepoStatistics statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public RepoCommitStatistics withStatistics(Consumer<List<RepoStatistics>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /** 仓库统计列表
     * 
     * @return statistics */
    public List<RepoStatistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<RepoStatistics> statistics) {
        this.statistics = statistics;
    }

    public RepoCommitStatistics withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 仓库统计次数
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoCommitStatistics repoCommitStatistics = (RepoCommitStatistics) o;
        return Objects.equals(this.allBranchCommitsCount, repoCommitStatistics.allBranchCommitsCount)
            && Objects.equals(this.codelines, repoCommitStatistics.codelines)
            && Objects.equals(this.count, repoCommitStatistics.count)
            && Objects.equals(this.event, repoCommitStatistics.event)
            && Objects.equals(this.statistics, repoCommitStatistics.statistics)
            && Objects.equals(this.total, repoCommitStatistics.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allBranchCommitsCount, codelines, count, event, statistics, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoCommitStatistics {\n");
        sb.append("    allBranchCommitsCount: ").append(toIndentedString(allBranchCommitsCount)).append("\n");
        sb.append("    codelines: ").append(toIndentedString(codelines)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
