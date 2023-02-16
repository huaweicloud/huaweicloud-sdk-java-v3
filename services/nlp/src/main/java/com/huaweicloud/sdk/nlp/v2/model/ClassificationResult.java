package com.huaweicloud.sdk.nlp.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * result字段数据结构说明
 */
public class ClassificationResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    
    private String content;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    
    private Integer label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    
    private Float confidence;

    public ClassificationResult withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 待分析文本。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public ClassificationResult withLabel(Integer label) {
        this.label = label;
        return this;
    }

    


    /**
     * 分类标签。 1：广告 0：非广告
     * @return label
     */
    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    

    public ClassificationResult withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 标签label的置信度。
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
        ClassificationResult classificationResult = (ClassificationResult) o;
        return Objects.equals(this.content, classificationResult.content) &&
            Objects.equals(this.label, classificationResult.label) &&
            Objects.equals(this.confidence, classificationResult.confidence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, label, confidence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassificationResult {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

