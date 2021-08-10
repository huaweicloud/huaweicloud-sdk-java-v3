package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListDiagnosisTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_report_list")

    private List<DiagnosisReportInfo> diagnosisReportList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ListDiagnosisTasksResponse withDiagnosisReportList(List<DiagnosisReportInfo> diagnosisReportList) {
        this.diagnosisReportList = diagnosisReportList;
        return this;
    }

    public ListDiagnosisTasksResponse addDiagnosisReportListItem(DiagnosisReportInfo diagnosisReportListItem) {
        if (this.diagnosisReportList == null) {
            this.diagnosisReportList = new ArrayList<>();
        }
        this.diagnosisReportList.add(diagnosisReportListItem);
        return this;
    }

    public ListDiagnosisTasksResponse withDiagnosisReportList(
        Consumer<List<DiagnosisReportInfo>> diagnosisReportListSetter) {
        if (this.diagnosisReportList == null) {
            this.diagnosisReportList = new ArrayList<>();
        }
        diagnosisReportListSetter.accept(this.diagnosisReportList);
        return this;
    }

    /** 诊断报告列表
     * 
     * @return diagnosisReportList */
    public List<DiagnosisReportInfo> getDiagnosisReportList() {
        return diagnosisReportList;
    }

    public void setDiagnosisReportList(List<DiagnosisReportInfo> diagnosisReportList) {
        this.diagnosisReportList = diagnosisReportList;
    }

    public ListDiagnosisTasksResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /** 诊断报告总数
     * 
     * @return totalNum */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDiagnosisTasksResponse listDiagnosisTasksResponse = (ListDiagnosisTasksResponse) o;
        return Objects.equals(this.diagnosisReportList, listDiagnosisTasksResponse.diagnosisReportList)
            && Objects.equals(this.totalNum, listDiagnosisTasksResponse.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagnosisReportList, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDiagnosisTasksResponse {\n");
        sb.append("    diagnosisReportList: ").append(toIndentedString(diagnosisReportList)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
