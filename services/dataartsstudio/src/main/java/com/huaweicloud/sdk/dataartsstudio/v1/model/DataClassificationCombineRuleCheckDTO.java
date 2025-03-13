package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataClassificationCombineRuleCheckDTO
 */
public class DataClassificationCombineRuleCheckDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combine_input_data")

    private DataClassificationCombineRuleCheckDTOCombineInputData combineInputData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combine")

    private Boolean combine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_rule_check_list")

    private List<DataClassificationSingleRuleDTO> singleRuleCheckList = null;

    public DataClassificationCombineRuleCheckDTO withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 条件表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public DataClassificationCombineRuleCheckDTO withCombineInputData(
        DataClassificationCombineRuleCheckDTOCombineInputData combineInputData) {
        this.combineInputData = combineInputData;
        return this;
    }

    public DataClassificationCombineRuleCheckDTO withCombineInputData(
        Consumer<DataClassificationCombineRuleCheckDTOCombineInputData> combineInputDataSetter) {
        if (this.combineInputData == null) {
            this.combineInputData = new DataClassificationCombineRuleCheckDTOCombineInputData();
            combineInputDataSetter.accept(this.combineInputData);
        }

        return this;
    }

    /**
     * Get combineInputData
     * @return combineInputData
     */
    public DataClassificationCombineRuleCheckDTOCombineInputData getCombineInputData() {
        return combineInputData;
    }

    public void setCombineInputData(DataClassificationCombineRuleCheckDTOCombineInputData combineInputData) {
        this.combineInputData = combineInputData;
    }

    public DataClassificationCombineRuleCheckDTO withCombine(Boolean combine) {
        this.combine = combine;
        return this;
    }

    /**
     * 分类ID
     * @return combine
     */
    public Boolean getCombine() {
        return combine;
    }

    public void setCombine(Boolean combine) {
        this.combine = combine;
    }

    public DataClassificationCombineRuleCheckDTO withSingleRuleCheckList(
        List<DataClassificationSingleRuleDTO> singleRuleCheckList) {
        this.singleRuleCheckList = singleRuleCheckList;
        return this;
    }

    public DataClassificationCombineRuleCheckDTO addSingleRuleCheckListItem(
        DataClassificationSingleRuleDTO singleRuleCheckListItem) {
        if (this.singleRuleCheckList == null) {
            this.singleRuleCheckList = new ArrayList<>();
        }
        this.singleRuleCheckList.add(singleRuleCheckListItem);
        return this;
    }

    public DataClassificationCombineRuleCheckDTO withSingleRuleCheckList(
        Consumer<List<DataClassificationSingleRuleDTO>> singleRuleCheckListSetter) {
        if (this.singleRuleCheckList == null) {
            this.singleRuleCheckList = new ArrayList<>();
        }
        singleRuleCheckListSetter.accept(this.singleRuleCheckList);
        return this;
    }

    /**
     * 条件单规则列表
     * @return singleRuleCheckList
     */
    public List<DataClassificationSingleRuleDTO> getSingleRuleCheckList() {
        return singleRuleCheckList;
    }

    public void setSingleRuleCheckList(List<DataClassificationSingleRuleDTO> singleRuleCheckList) {
        this.singleRuleCheckList = singleRuleCheckList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataClassificationCombineRuleCheckDTO that = (DataClassificationCombineRuleCheckDTO) obj;
        return Objects.equals(this.expression, that.expression)
            && Objects.equals(this.combineInputData, that.combineInputData)
            && Objects.equals(this.combine, that.combine)
            && Objects.equals(this.singleRuleCheckList, that.singleRuleCheckList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression, combineInputData, combine, singleRuleCheckList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataClassificationCombineRuleCheckDTO {\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    combineInputData: ").append(toIndentedString(combineInputData)).append("\n");
        sb.append("    combine: ").append(toIndentedString(combine)).append("\n");
        sb.append("    singleRuleCheckList: ").append(toIndentedString(singleRuleCheckList)).append("\n");
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
