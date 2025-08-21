package com.huaweicloud.sdk.codehub.v4.model;

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
public class ShowCommitStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits")

    private List<CommitStatisticsResultCommitDto> commits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<StatisticDto> statistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ShowCommitStatisticsResponse withCommits(List<CommitStatisticsResultCommitDto> commits) {
        this.commits = commits;
        return this;
    }

    public ShowCommitStatisticsResponse addCommitsItem(CommitStatisticsResultCommitDto commitsItem) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        this.commits.add(commitsItem);
        return this;
    }

    public ShowCommitStatisticsResponse withCommits(Consumer<List<CommitStatisticsResultCommitDto>> commitsSetter) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        commitsSetter.accept(this.commits);
        return this;
    }

    /**
     * **参数解释：** 提交统计。
     * @return commits
     */
    public List<CommitStatisticsResultCommitDto> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitStatisticsResultCommitDto> commits) {
        this.commits = commits;
    }

    public ShowCommitStatisticsResponse withStatistics(List<StatisticDto> statistics) {
        this.statistics = statistics;
        return this;
    }

    public ShowCommitStatisticsResponse addStatisticsItem(StatisticDto statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public ShowCommitStatisticsResponse withStatistics(Consumer<List<StatisticDto>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * **参数解释：** 提交人员统计。
     * @return statistics
     */
    public List<StatisticDto> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<StatisticDto> statistics) {
        this.statistics = statistics;
    }

    public ShowCommitStatisticsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 总数。
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowCommitStatisticsResponse withXTotal(String xTotal) {
        this.xTotal = xTotal;
        return this;
    }

    /**
     * Get xTotal
     * @return xTotal
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")
    public String getXTotal() {
        return xTotal;
    }

    public void setXTotal(String xTotal) {
        this.xTotal = xTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCommitStatisticsResponse that = (ShowCommitStatisticsResponse) obj;
        return Objects.equals(this.commits, that.commits) && Objects.equals(this.statistics, that.statistics)
            && Objects.equals(this.total, that.total) && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commits, statistics, total, xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCommitStatisticsResponse {\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xTotal: ").append(toIndentedString(xTotal)).append("\n");
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
