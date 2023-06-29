package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CharListIem
 */
public class CharListIem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "char")

    private String _char;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "char_confidence")

    private Float charConfidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "char_location")

    private List<List<Integer>> charLocation = null;

    public CharListIem withChar(String _char) {
        this._char = _char;
        return this;
    }

    /**
     * 单字符识别结果。 
     * @return _char
     */
    public String getChar() {
        return _char;
    }

    public void setChar(String _char) {
        this._char = _char;
    }

    public CharListIem withCharConfidence(Float charConfidence) {
        this.charConfidence = charConfidence;
        return this;
    }

    /**
     * 单字符的置信度，置信度越大，表示本次识别的文字的可靠性越高，在统计意义上，置信度越大，准确率越高。置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return charConfidence
     */
    public Float getCharConfidence() {
        return charConfidence;
    }

    public void setCharConfidence(Float charConfidence) {
        this.charConfidence = charConfidence;
    }

    public CharListIem withCharLocation(List<List<Integer>> charLocation) {
        this.charLocation = charLocation;
        return this;
    }

    public CharListIem addCharLocationItem(List<Integer> charLocationItem) {
        if (this.charLocation == null) {
            this.charLocation = new ArrayList<>();
        }
        this.charLocation.add(charLocationItem);
        return this;
    }

    public CharListIem withCharLocation(Consumer<List<List<Integer>>> charLocationSetter) {
        if (this.charLocation == null) {
            this.charLocation = new ArrayList<>();
        }
        charLocationSetter.accept(this.charLocation);
        return this;
    }

    /**
     * 单字符的位置信息，列表形式，分别表示文字块4个顶点的x, y坐标;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return charLocation
     */
    public List<List<Integer>> getCharLocation() {
        return charLocation;
    }

    public void setCharLocation(List<List<Integer>> charLocation) {
        this.charLocation = charLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CharListIem that = (CharListIem) obj;
        return Objects.equals(this._char, that._char) && Objects.equals(this.charConfidence, that.charConfidence)
            && Objects.equals(this.charLocation, that.charLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_char, charConfidence, charLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharListIem {\n");
        sb.append("    _char: ").append(toIndentedString(_char)).append("\n");
        sb.append("    charConfidence: ").append(toIndentedString(charConfidence)).append("\n");
        sb.append("    charLocation: ").append(toIndentedString(charLocation)).append("\n");
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
