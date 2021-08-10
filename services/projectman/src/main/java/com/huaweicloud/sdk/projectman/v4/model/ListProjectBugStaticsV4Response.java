package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListProjectBugStaticsV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bug_statistics")

    private List<BugStatisticResponseV4> bugStatistics = null;

    public ListProjectBugStaticsV4Response withBugStatistics(List<BugStatisticResponseV4> bugStatistics) {
        this.bugStatistics = bugStatistics;
        return this;
    }

    public ListProjectBugStaticsV4Response addBugStatisticsItem(BugStatisticResponseV4 bugStatisticsItem) {
        if (this.bugStatistics == null) {
            this.bugStatistics = new ArrayList<>();
        }
        this.bugStatistics.add(bugStatisticsItem);
        return this;
    }

    public ListProjectBugStaticsV4Response withBugStatistics(
        Consumer<List<BugStatisticResponseV4>> bugStatisticsSetter) {
        if (this.bugStatistics == null) {
            this.bugStatistics = new ArrayList<>();
        }
        bugStatisticsSetter.accept(this.bugStatistics);
        return this;
    }

    /** bug统计
     * 
     * @return bugStatistics */
    public List<BugStatisticResponseV4> getBugStatistics() {
        return bugStatistics;
    }

    public void setBugStatistics(List<BugStatisticResponseV4> bugStatistics) {
        this.bugStatistics = bugStatistics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectBugStaticsV4Response listProjectBugStaticsV4Response = (ListProjectBugStaticsV4Response) o;
        return Objects.equals(this.bugStatistics, listProjectBugStaticsV4Response.bugStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectBugStaticsV4Response {\n");
        sb.append("    bugStatistics: ").append(toIndentedString(bugStatistics)).append("\n");
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
