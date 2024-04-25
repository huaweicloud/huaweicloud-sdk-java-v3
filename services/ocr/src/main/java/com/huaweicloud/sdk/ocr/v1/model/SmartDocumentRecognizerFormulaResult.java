package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerFormulaResult
 */
public class SmartDocumentRecognizerFormulaResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula_count")

    private Integer formulaCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula_list")

    private List<SmartDocumentRecognizerFormulaBlock> formulaList = null;

    public SmartDocumentRecognizerFormulaResult withFormulaCount(Integer formulaCount) {
        this.formulaCount = formulaCount;
        return this;
    }

    /**
     * 数学公式数量。 
     * @return formulaCount
     */
    public Integer getFormulaCount() {
        return formulaCount;
    }

    public void setFormulaCount(Integer formulaCount) {
        this.formulaCount = formulaCount;
    }

    public SmartDocumentRecognizerFormulaResult withFormulaList(List<SmartDocumentRecognizerFormulaBlock> formulaList) {
        this.formulaList = formulaList;
        return this;
    }

    public SmartDocumentRecognizerFormulaResult addFormulaListItem(
        SmartDocumentRecognizerFormulaBlock formulaListItem) {
        if (this.formulaList == null) {
            this.formulaList = new ArrayList<>();
        }
        this.formulaList.add(formulaListItem);
        return this;
    }

    public SmartDocumentRecognizerFormulaResult withFormulaList(
        Consumer<List<SmartDocumentRecognizerFormulaBlock>> formulaListSetter) {
        if (this.formulaList == null) {
            this.formulaList = new ArrayList<>();
        }
        formulaListSetter.accept(this.formulaList);
        return this;
    }

    /**
     * 数学公式识别结果列表。 
     * @return formulaList
     */
    public List<SmartDocumentRecognizerFormulaBlock> getFormulaList() {
        return formulaList;
    }

    public void setFormulaList(List<SmartDocumentRecognizerFormulaBlock> formulaList) {
        this.formulaList = formulaList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerFormulaResult that = (SmartDocumentRecognizerFormulaResult) obj;
        return Objects.equals(this.formulaCount, that.formulaCount)
            && Objects.equals(this.formulaList, that.formulaList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formulaCount, formulaList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerFormulaResult {\n");
        sb.append("    formulaCount: ").append(toIndentedString(formulaCount)).append("\n");
        sb.append("    formulaList: ").append(toIndentedString(formulaList)).append("\n");
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
