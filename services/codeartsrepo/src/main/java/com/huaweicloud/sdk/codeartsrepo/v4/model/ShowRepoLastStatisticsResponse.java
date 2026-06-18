package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class ShowRepoLastStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private StatisticEventsDto event;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<StatisticDto> statistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codelines")

    private List<CodelineDto> codelines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_branch_commits_count")

    private Integer allBranchCommitsCount;

    public ShowRepoLastStatisticsResponse withEvent(StatisticEventsDto event) {
        this.event = event;
        return this;
    }

    public ShowRepoLastStatisticsResponse withEvent(Consumer<StatisticEventsDto> eventSetter) {
        if (this.event == null) {
            this.event = new StatisticEventsDto();
            eventSetter.accept(this.event);
        }

        return this;
    }

    /**
     * Get event
     * @return event
     */
    public StatisticEventsDto getEvent() {
        return event;
    }

    public void setEvent(StatisticEventsDto event) {
        this.event = event;
    }

    public ShowRepoLastStatisticsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 统计信息数量 **取值范围：** 最小0 **默认取值：** 0
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

    public ShowRepoLastStatisticsResponse withStatistics(List<StatisticDto> statistics) {
        this.statistics = statistics;
        return this;
    }

    public ShowRepoLastStatisticsResponse addStatisticsItem(StatisticDto statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public ShowRepoLastStatisticsResponse withStatistics(Consumer<List<StatisticDto>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * 统计信息
     * @return statistics
     */
    public List<StatisticDto> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<StatisticDto> statistics) {
        this.statistics = statistics;
    }

    public ShowRepoLastStatisticsResponse withCodelines(List<CodelineDto> codelines) {
        this.codelines = codelines;
        return this;
    }

    public ShowRepoLastStatisticsResponse addCodelinesItem(CodelineDto codelinesItem) {
        if (this.codelines == null) {
            this.codelines = new ArrayList<>();
        }
        this.codelines.add(codelinesItem);
        return this;
    }

    public ShowRepoLastStatisticsResponse withCodelines(Consumer<List<CodelineDto>> codelinesSetter) {
        if (this.codelines == null) {
            this.codelines = new ArrayList<>();
        }
        codelinesSetter.accept(this.codelines);
        return this;
    }

    /**
     * 仓库近15日每日代码提交增减行数信息。
     * @return codelines
     */
    public List<CodelineDto> getCodelines() {
        return codelines;
    }

    public void setCodelines(List<CodelineDto> codelines) {
        this.codelines = codelines;
    }

    public ShowRepoLastStatisticsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 分支提交总数。 **取值范围：** 最小0 **默认取值：** 0
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowRepoLastStatisticsResponse withAllBranchCommitsCount(Integer allBranchCommitsCount) {
        this.allBranchCommitsCount = allBranchCommitsCount;
        return this;
    }

    /**
     * **参数解释：** 仓库提交总数。 **取值范围：** 最小0 **默认取值：** 0
     * minimum: 0
     * maximum: 2147483647
     * @return allBranchCommitsCount
     */
    public Integer getAllBranchCommitsCount() {
        return allBranchCommitsCount;
    }

    public void setAllBranchCommitsCount(Integer allBranchCommitsCount) {
        this.allBranchCommitsCount = allBranchCommitsCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepoLastStatisticsResponse that = (ShowRepoLastStatisticsResponse) obj;
        return Objects.equals(this.event, that.event) && Objects.equals(this.total, that.total)
            && Objects.equals(this.statistics, that.statistics) && Objects.equals(this.codelines, that.codelines)
            && Objects.equals(this.count, that.count)
            && Objects.equals(this.allBranchCommitsCount, that.allBranchCommitsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, total, statistics, codelines, count, allBranchCommitsCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepoLastStatisticsResponse {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    codelines: ").append(toIndentedString(codelines)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    allBranchCommitsCount: ").append(toIndentedString(allBranchCommitsCount)).append("\n");
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
