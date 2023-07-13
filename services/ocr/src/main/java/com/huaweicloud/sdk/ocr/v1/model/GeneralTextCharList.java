package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GeneralTextCharList
 */
public class GeneralTextCharList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "char")

    private String _char;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "char_location")

    private List<List<Integer>> charLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "char_confidence")

    private Float charConfidence;

    public GeneralTextCharList withChar(String _char) {
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

    public GeneralTextCharList withCharLocation(List<List<Integer>> charLocation) {
        this.charLocation = charLocation;
        return this;
    }

    public GeneralTextCharList addCharLocationItem(List<Integer> charLocationItem) {
        if (this.charLocation == null) {
            this.charLocation = new ArrayList<>();
        }
        this.charLocation.add(charLocationItem);
        return this;
    }

    public GeneralTextCharList withCharLocation(Consumer<List<List<Integer>>> charLocationSetter) {
        if (this.charLocation == null) {
            this.charLocation = new ArrayList<>();
        }
        charLocationSetter.accept(this.charLocation);
        return this;
    }

    /**
     * 单字符的区域位置信息，列表形式，包含字符区域四个顶点的二维坐标（x,y）;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return charLocation
     */
    public List<List<Integer>> getCharLocation() {
        return charLocation;
    }

    public void setCharLocation(List<List<Integer>> charLocation) {
        this.charLocation = charLocation;
    }

    public GeneralTextCharList withCharConfidence(Float charConfidence) {
        this.charConfidence = charConfidence;
        return this;
    }

    /**
     * 单字符识别结果的置信度。 
     * @return charConfidence
     */
    public Float getCharConfidence() {
        return charConfidence;
    }

    public void setCharConfidence(Float charConfidence) {
        this.charConfidence = charConfidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeneralTextCharList that = (GeneralTextCharList) obj;
        return Objects.equals(this._char, that._char) && Objects.equals(this.charLocation, that.charLocation)
            && Objects.equals(this.charConfidence, that.charConfidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_char, charLocation, charConfidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralTextCharList {\n");
        sb.append("    _char: ").append(toIndentedString(_char)).append("\n");
        sb.append("    charLocation: ").append(toIndentedString(charLocation)).append("\n");
        sb.append("    charConfidence: ").append(toIndentedString(charConfidence)).append("\n");
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
