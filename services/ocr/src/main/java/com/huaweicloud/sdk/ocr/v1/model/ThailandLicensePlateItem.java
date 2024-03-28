package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThailandLicensePlateItem
 */
public class ThailandLicensePlateItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plate_number")

    private String plateNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plate_location")

    private List<List<Integer>> plateLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    public ThailandLicensePlateItem withPlateNumber(String plateNumber) {
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

    public ThailandLicensePlateItem withPlateLocation(List<List<Integer>> plateLocation) {
        this.plateLocation = plateLocation;
        return this;
    }

    public ThailandLicensePlateItem addPlateLocationItem(List<Integer> plateLocationItem) {
        if (this.plateLocation == null) {
            this.plateLocation = new ArrayList<>();
        }
        this.plateLocation.add(plateLocationItem);
        return this;
    }

    public ThailandLicensePlateItem withPlateLocation(Consumer<List<List<Integer>>> plateLocationSetter) {
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

    public ThailandLicensePlateItem withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。注：置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public ThailandLicensePlateItem withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 车牌所属府 
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThailandLicensePlateItem that = (ThailandLicensePlateItem) obj;
        return Objects.equals(this.plateNumber, that.plateNumber)
            && Objects.equals(this.plateLocation, that.plateLocation)
            && Objects.equals(this.confidence, that.confidence) && Objects.equals(this.province, that.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber, plateLocation, confidence, province);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThailandLicensePlateItem {\n");
        sb.append("    plateNumber: ").append(toIndentedString(plateNumber)).append("\n");
        sb.append("    plateLocation: ").append(toIndentedString(plateLocation)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
