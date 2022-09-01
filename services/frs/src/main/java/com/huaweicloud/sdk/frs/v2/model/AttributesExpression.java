package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 人脸表情，包括中性、高兴、害怕、惊讶、伤心、生气、厌恶。
 */
public class AttributesExpression {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "probability")

    @JacksonXmlProperty(localName = "probability")

    private Double probability;

    public AttributesExpression withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 人脸表情类型： • neutral：中性 • happy：高兴 • fear：害怕 • surprise：惊讶 • sad：伤心 • angry：生气 • disgust：厌恶 • unknown：图片质量问题导致未识别
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AttributesExpression withProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    /**
     * 表情置信度，取值范围[0-1]。
     * @return probability
     */
    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttributesExpression attributesExpression = (AttributesExpression) o;
        return Objects.equals(this.type, attributesExpression.type)
            && Objects.equals(this.probability, attributesExpression.probability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, probability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttributesExpression {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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
