package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HouseholdRegisterResult
 */
public class HouseholdRegisterResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private HouseholdRegisterContent content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Map<String, Float> confidence = null;

    public HouseholdRegisterResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型。参数为“首页”或“登记页”。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HouseholdRegisterResult withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public HouseholdRegisterResult addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public HouseholdRegisterResult withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 户口本证件位置信息，列表形式，包含证件位置四个顶点的二维坐标（x,y）;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public HouseholdRegisterResult withContent(HouseholdRegisterContent content) {
        this.content = content;
        return this;
    }

    public HouseholdRegisterResult withContent(Consumer<HouseholdRegisterContent> contentSetter) {
        if (this.content == null) {
            this.content = new HouseholdRegisterContent();
            contentSetter.accept(this.content);
        }

        return this;
    }

    /**
     * Get content
     * @return content
     */
    public HouseholdRegisterContent getContent() {
        return content;
    }

    public void setContent(HouseholdRegisterContent content) {
        this.content = content;
    }

    public HouseholdRegisterResult withConfidence(Map<String, Float> confidence) {
        this.confidence = confidence;
        return this;
    }

    public HouseholdRegisterResult putConfidenceItem(String key, Float confidenceItem) {
        if (this.confidence == null) {
            this.confidence = new HashMap<>();
        }
        this.confidence.put(key, confidenceItem);
        return this;
    }

    public HouseholdRegisterResult withConfidence(Consumer<Map<String, Float>> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new HashMap<>();
        }
        confidenceSetter.accept(this.confidence);
        return this;
    }

    /**
     * content中各个字段的置信度，取值范围0~1。置信度越大，本次识别的字段的可靠性越高，在统计意义上，置信度越大，准确率越高。置信度由算法给出，不直接等价于字段的准确率。 
     * @return confidence
     */
    public Map<String, Float> getConfidence() {
        return confidence;
    }

    public void setConfidence(Map<String, Float> confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HouseholdRegisterResult that = (HouseholdRegisterResult) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.location, that.location)
            && Objects.equals(this.content, that.content) && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, location, content, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HouseholdRegisterResult {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
