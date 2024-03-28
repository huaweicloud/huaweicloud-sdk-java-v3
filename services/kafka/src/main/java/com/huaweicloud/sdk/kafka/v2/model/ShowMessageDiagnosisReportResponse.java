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
public class ShowMessageDiagnosisReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_item_num")

    private Integer abnormalItemNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_item_num")

    private Integer failedItemNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_item_num")

    private Integer normalItemNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_dimension_list")

    private List<KafkaMessageDiagnosisDimensionEntity> diagnosisDimensionList = null;

    public ShowMessageDiagnosisReportResponse withAbnormalItemNum(Integer abnormalItemNum) {
        this.abnormalItemNum = abnormalItemNum;
        return this;
    }

    /**
     * 诊断异常的诊断项总和
     * @return abnormalItemNum
     */
    public Integer getAbnormalItemNum() {
        return abnormalItemNum;
    }

    public void setAbnormalItemNum(Integer abnormalItemNum) {
        this.abnormalItemNum = abnormalItemNum;
    }

    public ShowMessageDiagnosisReportResponse withFailedItemNum(Integer failedItemNum) {
        this.failedItemNum = failedItemNum;
        return this;
    }

    /**
     * 诊断失败的诊断项总和
     * @return failedItemNum
     */
    public Integer getFailedItemNum() {
        return failedItemNum;
    }

    public void setFailedItemNum(Integer failedItemNum) {
        this.failedItemNum = failedItemNum;
    }

    public ShowMessageDiagnosisReportResponse withNormalItemNum(Integer normalItemNum) {
        this.normalItemNum = normalItemNum;
        return this;
    }

    /**
     * 诊断正常的诊断项总和
     * @return normalItemNum
     */
    public Integer getNormalItemNum() {
        return normalItemNum;
    }

    public void setNormalItemNum(Integer normalItemNum) {
        this.normalItemNum = normalItemNum;
    }

    public ShowMessageDiagnosisReportResponse withDiagnosisDimensionList(
        List<KafkaMessageDiagnosisDimensionEntity> diagnosisDimensionList) {
        this.diagnosisDimensionList = diagnosisDimensionList;
        return this;
    }

    public ShowMessageDiagnosisReportResponse addDiagnosisDimensionListItem(
        KafkaMessageDiagnosisDimensionEntity diagnosisDimensionListItem) {
        if (this.diagnosisDimensionList == null) {
            this.diagnosisDimensionList = new ArrayList<>();
        }
        this.diagnosisDimensionList.add(diagnosisDimensionListItem);
        return this;
    }

    public ShowMessageDiagnosisReportResponse withDiagnosisDimensionList(
        Consumer<List<KafkaMessageDiagnosisDimensionEntity>> diagnosisDimensionListSetter) {
        if (this.diagnosisDimensionList == null) {
            this.diagnosisDimensionList = new ArrayList<>();
        }
        diagnosisDimensionListSetter.accept(this.diagnosisDimensionList);
        return this;
    }

    /**
     * 诊断维度列表
     * @return diagnosisDimensionList
     */
    public List<KafkaMessageDiagnosisDimensionEntity> getDiagnosisDimensionList() {
        return diagnosisDimensionList;
    }

    public void setDiagnosisDimensionList(List<KafkaMessageDiagnosisDimensionEntity> diagnosisDimensionList) {
        this.diagnosisDimensionList = diagnosisDimensionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMessageDiagnosisReportResponse that = (ShowMessageDiagnosisReportResponse) obj;
        return Objects.equals(this.abnormalItemNum, that.abnormalItemNum)
            && Objects.equals(this.failedItemNum, that.failedItemNum)
            && Objects.equals(this.normalItemNum, that.normalItemNum)
            && Objects.equals(this.diagnosisDimensionList, that.diagnosisDimensionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalItemNum, failedItemNum, normalItemNum, diagnosisDimensionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMessageDiagnosisReportResponse {\n");
        sb.append("    abnormalItemNum: ").append(toIndentedString(abnormalItemNum)).append("\n");
        sb.append("    failedItemNum: ").append(toIndentedString(failedItemNum)).append("\n");
        sb.append("    normalItemNum: ").append(toIndentedString(normalItemNum)).append("\n");
        sb.append("    diagnosisDimensionList: ").append(toIndentedString(diagnosisDimensionList)).append("\n");
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
