package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AutoIdDocClassificationResult
 */
public class AutoIdDocClassificationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_result")

    private AutoIdDocClassificationAlarmResult alarmResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_confidence")

    private AutoIdDocClassificationAlarmConfidence alarmConfidence;

    public AutoIdDocClassificationResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 证件的类型，支持的证件类型如表1所示：   **表1* 支持的证件类型 | 证件类型               | 类型描述                 | | ---------------------- | ------------------------ | | peru_id_card           | 秘鲁身份证               | | cambodian_id_card      | 柬文身份证               | | hongkong_id_card       | 香港身份证               | | macao_id_card          | 澳门身份证               | | myanmar_driver_license | 缅文驾驶证               | | myanmar_id_card        | 缅文身份证               | | passport               | 护照                     | | thailand_id_card       | 泰文身份证               | | id_card                | 中华人民共和国居民身份证 | 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AutoIdDocClassificationResult withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public AutoIdDocClassificationResult addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public AutoIdDocClassificationResult withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 证件的位置。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public AutoIdDocClassificationResult withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 证件位置的置信度。 
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public AutoIdDocClassificationResult withAlarmResult(AutoIdDocClassificationAlarmResult alarmResult) {
        this.alarmResult = alarmResult;
        return this;
    }

    public AutoIdDocClassificationResult withAlarmResult(
        Consumer<AutoIdDocClassificationAlarmResult> alarmResultSetter) {
        if (this.alarmResult == null) {
            this.alarmResult = new AutoIdDocClassificationAlarmResult();
            alarmResultSetter.accept(this.alarmResult);
        }

        return this;
    }

    /**
     * Get alarmResult
     * @return alarmResult
     */
    public AutoIdDocClassificationAlarmResult getAlarmResult() {
        return alarmResult;
    }

    public void setAlarmResult(AutoIdDocClassificationAlarmResult alarmResult) {
        this.alarmResult = alarmResult;
    }

    public AutoIdDocClassificationResult withAlarmConfidence(AutoIdDocClassificationAlarmConfidence alarmConfidence) {
        this.alarmConfidence = alarmConfidence;
        return this;
    }

    public AutoIdDocClassificationResult withAlarmConfidence(
        Consumer<AutoIdDocClassificationAlarmConfidence> alarmConfidenceSetter) {
        if (this.alarmConfidence == null) {
            this.alarmConfidence = new AutoIdDocClassificationAlarmConfidence();
            alarmConfidenceSetter.accept(this.alarmConfidence);
        }

        return this;
    }

    /**
     * Get alarmConfidence
     * @return alarmConfidence
     */
    public AutoIdDocClassificationAlarmConfidence getAlarmConfidence() {
        return alarmConfidence;
    }

    public void setAlarmConfidence(AutoIdDocClassificationAlarmConfidence alarmConfidence) {
        this.alarmConfidence = alarmConfidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoIdDocClassificationResult that = (AutoIdDocClassificationResult) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.location, that.location)
            && Objects.equals(this.confidence, that.confidence) && Objects.equals(this.alarmResult, that.alarmResult)
            && Objects.equals(this.alarmConfidence, that.alarmConfidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, location, confidence, alarmResult, alarmConfidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoIdDocClassificationResult {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    alarmResult: ").append(toIndentedString(alarmResult)).append("\n");
        sb.append("    alarmConfidence: ").append(toIndentedString(alarmConfidence)).append("\n");
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
