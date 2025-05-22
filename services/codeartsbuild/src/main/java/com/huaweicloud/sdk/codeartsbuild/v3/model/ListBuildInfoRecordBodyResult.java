package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class ListBuildInfoRecordBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_score")

    private String healthScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_index")

    private String pageIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_page")

    private String totalPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_record")

    private String totalRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_build_states")

    private List<BuildInfoRecord> jobBuildStates = null;

    public ListBuildInfoRecordBodyResult withHealthScore(String healthScore) {
        this.healthScore = healthScore;
        return this;
    }

    /**
     * 健康度
     * @return healthScore
     */
    public String getHealthScore() {
        return healthScore;
    }

    public void setHealthScore(String healthScore) {
        this.healthScore = healthScore;
    }

    public ListBuildInfoRecordBodyResult withPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * 分页页数
     * @return pageIndex
     */
    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public ListBuildInfoRecordBodyResult withTotalPage(String totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * 总页数
     * @return totalPage
     */
    public String getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(String totalPage) {
        this.totalPage = totalPage;
    }

    public ListBuildInfoRecordBodyResult withTotalRecord(String totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    /**
     * 总条数
     * @return totalRecord
     */
    public String getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(String totalRecord) {
        this.totalRecord = totalRecord;
    }

    public ListBuildInfoRecordBodyResult withJobBuildStates(List<BuildInfoRecord> jobBuildStates) {
        this.jobBuildStates = jobBuildStates;
        return this;
    }

    public ListBuildInfoRecordBodyResult addJobBuildStatesItem(BuildInfoRecord jobBuildStatesItem) {
        if (this.jobBuildStates == null) {
            this.jobBuildStates = new ArrayList<>();
        }
        this.jobBuildStates.add(jobBuildStatesItem);
        return this;
    }

    public ListBuildInfoRecordBodyResult withJobBuildStates(Consumer<List<BuildInfoRecord>> jobBuildStatesSetter) {
        if (this.jobBuildStates == null) {
            this.jobBuildStates = new ArrayList<>();
        }
        jobBuildStatesSetter.accept(this.jobBuildStates);
        return this;
    }

    /**
     * 构建历史详情列表
     * @return jobBuildStates
     */
    public List<BuildInfoRecord> getJobBuildStates() {
        return jobBuildStates;
    }

    public void setJobBuildStates(List<BuildInfoRecord> jobBuildStates) {
        this.jobBuildStates = jobBuildStates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBuildInfoRecordBodyResult that = (ListBuildInfoRecordBodyResult) obj;
        return Objects.equals(this.healthScore, that.healthScore) && Objects.equals(this.pageIndex, that.pageIndex)
            && Objects.equals(this.totalPage, that.totalPage) && Objects.equals(this.totalRecord, that.totalRecord)
            && Objects.equals(this.jobBuildStates, that.jobBuildStates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthScore, pageIndex, totalPage, totalRecord, jobBuildStates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBuildInfoRecordBodyResult {\n");
        sb.append("    healthScore: ").append(toIndentedString(healthScore)).append("\n");
        sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    jobBuildStates: ").append(toIndentedString(jobBuildStates)).append("\n");
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
