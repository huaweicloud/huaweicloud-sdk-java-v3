package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** TaskInfo */
public class TaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bench_concurrent")

    private Integer benchConcurrent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_list")

    private List<CaseInfo> caseList = null;

    public TaskInfo withBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
        return this;
    }

    /** bench_concurrent minimum: 0 maximum: 2147483647
     * 
     * @return benchConcurrent */
    public Integer getBenchConcurrent() {
        return benchConcurrent;
    }

    public void setBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
    }

    public TaskInfo withCaseList(List<CaseInfo> caseList) {
        this.caseList = caseList;
        return this;
    }

    public TaskInfo addCaseListItem(CaseInfo caseListItem) {
        if (this.caseList == null) {
            this.caseList = new ArrayList<>();
        }
        this.caseList.add(caseListItem);
        return this;
    }

    public TaskInfo withCaseList(Consumer<List<CaseInfo>> caseListSetter) {
        if (this.caseList == null) {
            this.caseList = new ArrayList<>();
        }
        caseListSetter.accept(this.caseList);
        return this;
    }

    /** case_list
     * 
     * @return caseList */
    public List<CaseInfo> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<CaseInfo> caseList) {
        this.caseList = caseList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInfo taskInfo = (TaskInfo) o;
        return Objects.equals(this.benchConcurrent, taskInfo.benchConcurrent)
            && Objects.equals(this.caseList, taskInfo.caseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(benchConcurrent, caseList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInfo {\n");
        sb.append("    benchConcurrent: ").append(toIndentedString(benchConcurrent)).append("\n");
        sb.append("    caseList: ").append(toIndentedString(caseList)).append("\n");
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
