package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除消息积压诊断报告请求
 */
public class BatchDeleteMessageDiagnosisReportsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id_list")

    private List<String> reportIdList = null;

    public BatchDeleteMessageDiagnosisReportsReq withReportIdList(List<String> reportIdList) {
        this.reportIdList = reportIdList;
        return this;
    }

    public BatchDeleteMessageDiagnosisReportsReq addReportIdListItem(String reportIdListItem) {
        if (this.reportIdList == null) {
            this.reportIdList = new ArrayList<>();
        }
        this.reportIdList.add(reportIdListItem);
        return this;
    }

    public BatchDeleteMessageDiagnosisReportsReq withReportIdList(Consumer<List<String>> reportIdListSetter) {
        if (this.reportIdList == null) {
            this.reportIdList = new ArrayList<>();
        }
        reportIdListSetter.accept(this.reportIdList);
        return this;
    }

    /**
     * 待删除report id列表
     * @return reportIdList
     */
    public List<String> getReportIdList() {
        return reportIdList;
    }

    public void setReportIdList(List<String> reportIdList) {
        this.reportIdList = reportIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteMessageDiagnosisReportsReq that = (BatchDeleteMessageDiagnosisReportsReq) obj;
        return Objects.equals(this.reportIdList, that.reportIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteMessageDiagnosisReportsReq {\n");
        sb.append("    reportIdList: ").append(toIndentedString(reportIdList)).append("\n");
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
