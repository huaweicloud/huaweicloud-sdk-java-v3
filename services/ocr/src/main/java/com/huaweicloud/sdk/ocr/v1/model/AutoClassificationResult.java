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
public class AutoClassificationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AutoClassificationResultStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private Object content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    public AutoClassificationResult withStatus(AutoClassificationResultStatus status) {
        this.status = status;
        return this;
    }

    public AutoClassificationResult withStatus(Consumer<AutoClassificationResultStatus> statusSetter) {
        if (this.status == null) {
            this.status = new AutoClassificationResultStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /** Get status
     * 
     * @return status */
    public AutoClassificationResultStatus getStatus() {
        return status;
    }

    public void setStatus(AutoClassificationResultStatus status) {
        this.status = status;
    }

    public AutoClassificationResult withContent(Object content) {
        this.content = content;
        return this;
    }

    /** 对应票证具体结构化识别的结果。
     * 
     * @return content */
    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public AutoClassificationResult withType(String type) {
        this.type = type;
        return this;
    }

    /** 对应票证的类别。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AutoClassificationResult withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public AutoClassificationResult addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public AutoClassificationResult withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /** 文字块的区域位置信息，列表形式，包含文字区域四个顶点的二维坐标（x,y）;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。
     * 
     * @return location */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoClassificationResult autoClassificationResult = (AutoClassificationResult) o;
        return Objects.equals(this.status, autoClassificationResult.status)
            && Objects.equals(this.content, autoClassificationResult.content)
            && Objects.equals(this.type, autoClassificationResult.type)
            && Objects.equals(this.location, autoClassificationResult.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, content, type, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoClassificationResult {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
