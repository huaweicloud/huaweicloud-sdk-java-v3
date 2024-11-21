package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结合口袋，包含口袋中心位置和尺寸大小。
 */
public class BoundBoxDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "center")

    private List<Double> center = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private List<Float> size = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "padding")

    private Float padding;

    public BoundBoxDto withCenter(List<Double> center) {
        this.center = center;
        return this;
    }

    public BoundBoxDto addCenterItem(Double centerItem) {
        if (this.center == null) {
            this.center = new ArrayList<>();
        }
        this.center.add(centerItem);
        return this;
    }

    public BoundBoxDto withCenter(Consumer<List<Double>> centerSetter) {
        if (this.center == null) {
            this.center = new ArrayList<>();
        }
        centerSetter.accept(this.center);
        return this;
    }

    /**
     * 口袋中心坐标，x、y、z轴的坐标。
     * @return center
     */
    public List<Double> getCenter() {
        return center;
    }

    public void setCenter(List<Double> center) {
        this.center = center;
    }

    public BoundBoxDto withSize(List<Float> size) {
        this.size = size;
        return this;
    }

    public BoundBoxDto addSizeItem(Float sizeItem) {
        if (this.size == null) {
            this.size = new ArrayList<>();
        }
        this.size.add(sizeItem);
        return this;
    }

    public BoundBoxDto withSize(Consumer<List<Float>> sizeSetter) {
        if (this.size == null) {
            this.size = new ArrayList<>();
        }
        sizeSetter.accept(this.size);
        return this;
    }

    /**
     * 口袋尺寸大小，x、y、z轴的大小。
     * @return size
     */
    public List<Float> getSize() {
        return size;
    }

    public void setSize(List<Float> size) {
        this.size = size;
    }

    public BoundBoxDto withPadding(Float padding) {
        this.padding = padding;
        return this;
    }

    /**
     * 填充。
     * minimum: 0
     * maximum: 2E+1
     * @return padding
     */
    public Float getPadding() {
        return padding;
    }

    public void setPadding(Float padding) {
        this.padding = padding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BoundBoxDto that = (BoundBoxDto) obj;
        return Objects.equals(this.center, that.center) && Objects.equals(this.size, that.size)
            && Objects.equals(this.padding, that.padding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, size, padding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoundBoxDto {\n");
        sb.append("    center: ").append(toIndentedString(center)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
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
