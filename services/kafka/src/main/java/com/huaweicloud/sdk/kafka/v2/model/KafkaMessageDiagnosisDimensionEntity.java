package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 消息积压诊断维度
 */
public class KafkaMessageDiagnosisDimensionEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_num")

    private Integer abnormalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_item_list")

    private List<KafkaMessageDiagnosisItemEntity> diagnosisItemList = null;

    public KafkaMessageDiagnosisDimensionEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 诊断维度名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KafkaMessageDiagnosisDimensionEntity withAbnormalNum(Integer abnormalNum) {
        this.abnormalNum = abnormalNum;
        return this;
    }

    /**
     * 该诊断维度下，异常的诊断项总数
     * @return abnormalNum
     */
    public Integer getAbnormalNum() {
        return abnormalNum;
    }

    public void setAbnormalNum(Integer abnormalNum) {
        this.abnormalNum = abnormalNum;
    }

    public KafkaMessageDiagnosisDimensionEntity withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * 该诊断维度下，诊断失败的诊断项总和
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public KafkaMessageDiagnosisDimensionEntity withDiagnosisItemList(
        List<KafkaMessageDiagnosisItemEntity> diagnosisItemList) {
        this.diagnosisItemList = diagnosisItemList;
        return this;
    }

    public KafkaMessageDiagnosisDimensionEntity addDiagnosisItemListItem(
        KafkaMessageDiagnosisItemEntity diagnosisItemListItem) {
        if (this.diagnosisItemList == null) {
            this.diagnosisItemList = new ArrayList<>();
        }
        this.diagnosisItemList.add(diagnosisItemListItem);
        return this;
    }

    public KafkaMessageDiagnosisDimensionEntity withDiagnosisItemList(
        Consumer<List<KafkaMessageDiagnosisItemEntity>> diagnosisItemListSetter) {
        if (this.diagnosisItemList == null) {
            this.diagnosisItemList = new ArrayList<>();
        }
        diagnosisItemListSetter.accept(this.diagnosisItemList);
        return this;
    }

    /**
     * 诊断项列表
     * @return diagnosisItemList
     */
    public List<KafkaMessageDiagnosisItemEntity> getDiagnosisItemList() {
        return diagnosisItemList;
    }

    public void setDiagnosisItemList(List<KafkaMessageDiagnosisItemEntity> diagnosisItemList) {
        this.diagnosisItemList = diagnosisItemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaMessageDiagnosisDimensionEntity that = (KafkaMessageDiagnosisDimensionEntity) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.abnormalNum, that.abnormalNum)
            && Objects.equals(this.failedNum, that.failedNum)
            && Objects.equals(this.diagnosisItemList, that.diagnosisItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, abnormalNum, failedNum, diagnosisItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaMessageDiagnosisDimensionEntity {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    abnormalNum: ").append(toIndentedString(abnormalNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    diagnosisItemList: ").append(toIndentedString(diagnosisItemList)).append("\n");
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
