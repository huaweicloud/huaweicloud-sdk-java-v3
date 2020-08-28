package com.huaweicloud.sdk.codehub.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.RepoDailyCodeline;
import com.huaweicloud.sdk.codehub.v3.model.RepoStatistics;
import com.huaweicloud.sdk.codehub.v3.model.RepoStatisticsEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RepoCommitStatistics
 */
public class RepoCommitStatistics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="all_branch_commits_count")
    
    private Integer allBranchCommitsCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="codeline")
    
    private List<RepoDailyCodeline> codeline = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="commits_count")
    
    private Integer commitsCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event")
    
    private RepoStatisticsEvent event = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistics")
    
    private List<RepoStatistics> statistics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public RepoCommitStatistics withAllBranchCommitsCount(Integer allBranchCommitsCount) {
        this.allBranchCommitsCount = allBranchCommitsCount;
        return this;
    }

    


    /**
     * 仓库总提交次数
     * @return allBranchCommitsCount
     */
    public Integer getAllBranchCommitsCount() {
        return allBranchCommitsCount;
    }

    public void setAllBranchCommitsCount(Integer allBranchCommitsCount) {
        this.allBranchCommitsCount = allBranchCommitsCount;
    }

    public RepoCommitStatistics withCodeline(List<RepoDailyCodeline> codeline) {
        this.codeline = codeline;
        return this;
    }

    
    public RepoCommitStatistics addCodelineItem(RepoDailyCodeline codelineItem) {
        if (this.codeline == null) {
            this.codeline = new ArrayList<>();
        }
        this.codeline.add(codelineItem);
        return this;
    }

    public RepoCommitStatistics withCodeline(Consumer<List<RepoDailyCodeline>> codelineSetter) {
        if(this.codeline == null ){
            this.codeline = new ArrayList<>();
        }
        codelineSetter.accept(this.codeline);
        return this;
    }

    /**
     * Get codeline
     * @return codeline
     */
    public List<RepoDailyCodeline> getCodeline() {
        return codeline;
    }

    public void setCodeline(List<RepoDailyCodeline> codeline) {
        this.codeline = codeline;
    }

    public RepoCommitStatistics withCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
        return this;
    }

    


    /**
     * Get commitsCount
     * @return commitsCount
     */
    public Integer getCommitsCount() {
        return commitsCount;
    }

    public void setCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
    }

    public RepoCommitStatistics withEvent(RepoStatisticsEvent event) {
        this.event = event;
        return this;
    }

    public RepoCommitStatistics withEvent(Consumer<RepoStatisticsEvent> eventSetter) {
        if(this.event == null ){
            this.event = new RepoStatisticsEvent();
            eventSetter.accept(this.event);
        }
        
        return this;
    }


    /**
     * Get event
     * @return event
     */
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
        if(this.statistics == null ){
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * 仓库统计列表
     * @return statistics
     */
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

    


    /**
     * 仓库统计次数
     * @return total
     */
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
        return Objects.equals(this.allBranchCommitsCount, repoCommitStatistics.allBranchCommitsCount) &&
            Objects.equals(this.codeline, repoCommitStatistics.codeline) &&
            Objects.equals(this.commitsCount, repoCommitStatistics.commitsCount) &&
            Objects.equals(this.event, repoCommitStatistics.event) &&
            Objects.equals(this.statistics, repoCommitStatistics.statistics) &&
            Objects.equals(this.total, repoCommitStatistics.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(allBranchCommitsCount, codeline, commitsCount, event, statistics, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoCommitStatistics {\n");
        sb.append("    allBranchCommitsCount: ").append(toIndentedString(allBranchCommitsCount)).append("\n");
        sb.append("    codeline: ").append(toIndentedString(codeline)).append("\n");
        sb.append("    commitsCount: ").append(toIndentedString(commitsCount)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

