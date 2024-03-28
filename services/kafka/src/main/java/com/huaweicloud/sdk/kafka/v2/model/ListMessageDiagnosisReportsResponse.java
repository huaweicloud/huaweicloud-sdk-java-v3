package com.huaweicloud.sdk.kafka.v2.model;

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
public class ListMessageDiagnosisReportsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_list")

    private List<KafkaMessageDiagnosisReportInfoEntity> reportList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ListMessageDiagnosisReportsResponse withReportList(List<KafkaMessageDiagnosisReportInfoEntity> reportList) {
        this.reportList = reportList;
        return this;
    }

    public ListMessageDiagnosisReportsResponse addReportListItem(KafkaMessageDiagnosisReportInfoEntity reportListItem) {
        if (this.reportList == null) {
            this.reportList = new ArrayList<>();
        }
        this.reportList.add(reportListItem);
        return this;
    }

    public ListMessageDiagnosisReportsResponse withReportList(
        Consumer<List<KafkaMessageDiagnosisReportInfoEntity>> reportListSetter) {
        if (this.reportList == null) {
            this.reportList = new ArrayList<>();
        }
        reportListSetter.accept(this.reportList);
        return this;
    }

    /**
     * 诊断报告列表
     * @return reportList
     */
    public List<KafkaMessageDiagnosisReportInfoEntity> getReportList() {
        return reportList;
    }

    public void setReportList(List<KafkaMessageDiagnosisReportInfoEntity> reportList) {
        this.reportList = reportList;
    }

    public ListMessageDiagnosisReportsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 诊断报告总数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMessageDiagnosisReportsResponse that = (ListMessageDiagnosisReportsResponse) obj;
        return Objects.equals(this.reportList, that.reportList) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportList, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMessageDiagnosisReportsResponse {\n");
        sb.append("    reportList: ").append(toIndentedString(reportList)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
