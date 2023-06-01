package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class LicensePlateResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plate_number")

    private String plateNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plate_color")

    private String plateColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plate_location")

    private List<List<Integer>> plateLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    public LicensePlateResult withPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
        return this;
    }

    /**
     * 车牌内容。 
     * @return plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public LicensePlateResult withPlateColor(String plateColor) {
        this.plateColor = plateColor;
        return this;
    }

    /**
     * 当前版本支持的车牌底色类型：  - blue: 蓝色  - green: 绿色（小型新能源车牌）  - black: 黑色  - white: 白色  - yellow: 黄色  - yellow_green: 黄绿（大型新能源车牌） 
     * @return plateColor
     */
    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public LicensePlateResult withPlateLocation(List<List<Integer>> plateLocation) {
        this.plateLocation = plateLocation;
        return this;
    }

    public LicensePlateResult addPlateLocationItem(List<Integer> plateLocationItem) {
        if (this.plateLocation == null) {
            this.plateLocation = new ArrayList<>();
        }
        this.plateLocation.add(plateLocationItem);
        return this;
    }

    public LicensePlateResult withPlateLocation(Consumer<List<List<Integer>>> plateLocationSetter) {
        if (this.plateLocation == null) {
            this.plateLocation = new ArrayList<>();
        }
        plateLocationSetter.accept(this.plateLocation);
        return this;
    }

    /**
     * 车牌的区域位置信息，列表形式，包含文字区域四个顶点的二维坐标（x,y）;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return plateLocation
     */
    public List<List<Integer>> getPlateLocation() {
        return plateLocation;
    }

    public void setPlateLocation(List<List<Integer>> plateLocation) {
        this.plateLocation = plateLocation;
    }

    public LicensePlateResult withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LicensePlateResult licensePlateResult = (LicensePlateResult) o;
        return Objects.equals(this.plateNumber, licensePlateResult.plateNumber)
            && Objects.equals(this.plateColor, licensePlateResult.plateColor)
            && Objects.equals(this.plateLocation, licensePlateResult.plateLocation)
            && Objects.equals(this.confidence, licensePlateResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber, plateColor, plateLocation, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LicensePlateResult {\n");
        sb.append("    plateNumber: ").append(toIndentedString(plateNumber)).append("\n");
        sb.append("    plateColor: ").append(toIndentedString(plateColor)).append("\n");
        sb.append("    plateLocation: ").append(toIndentedString(plateLocation)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
