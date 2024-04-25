package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerFormulaBlock
 */
public class SmartDocumentRecognizerFormulaBlock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula")

    private String formula;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    public SmartDocumentRecognizerFormulaBlock withFormula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * 数学公式识别结果，以latex字符串表示。
     * @return formula
     */
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public SmartDocumentRecognizerFormulaBlock withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public SmartDocumentRecognizerFormulaBlock addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public SmartDocumentRecognizerFormulaBlock withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 数学公式位置信息，列表形式，分别表示4个顶点的x, y坐标；坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerFormulaBlock that = (SmartDocumentRecognizerFormulaBlock) obj;
        return Objects.equals(this.formula, that.formula) && Objects.equals(this.location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formula, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerFormulaBlock {\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
