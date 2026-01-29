package com.huaweicloud.sdk.rocketmq.v2.model;

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
public class ListDiagnosisReportsForRocketMqResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_report_list")

    private List<DiagnosisReportResp> diagnosisReportList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Long totalNum;

    public ListDiagnosisReportsForRocketMqResponse withDiagnosisReportList(
        List<DiagnosisReportResp> diagnosisReportList) {
        this.diagnosisReportList = diagnosisReportList;
        return this;
    }

    public ListDiagnosisReportsForRocketMqResponse addDiagnosisReportListItem(
        DiagnosisReportResp diagnosisReportListItem) {
        if (this.diagnosisReportList == null) {
            this.diagnosisReportList = new ArrayList<>();
        }
        this.diagnosisReportList.add(diagnosisReportListItem);
        return this;
    }

    public ListDiagnosisReportsForRocketMqResponse withDiagnosisReportList(
        Consumer<List<DiagnosisReportResp>> diagnosisReportListSetter) {
        if (this.diagnosisReportList == null) {
            this.diagnosisReportList = new ArrayList<>();
        }
        diagnosisReportListSetter.accept(this.diagnosisReportList);
        return this;
    }

    /**
     * **参数解释**： 诊断报告列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return diagnosisReportList
     */
    public List<DiagnosisReportResp> getDiagnosisReportList() {
        return diagnosisReportList;
    }

    public void setDiagnosisReportList(List<DiagnosisReportResp> diagnosisReportList) {
        this.diagnosisReportList = diagnosisReportList;
    }

    public ListDiagnosisReportsForRocketMqResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**： 报告数量。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
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
        ListDiagnosisReportsForRocketMqResponse that = (ListDiagnosisReportsForRocketMqResponse) obj;
        return Objects.equals(this.diagnosisReportList, that.diagnosisReportList)
            && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagnosisReportList, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDiagnosisReportsForRocketMqResponse {\n");
        sb.append("    diagnosisReportList: ").append(toIndentedString(diagnosisReportList)).append("\n");
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
