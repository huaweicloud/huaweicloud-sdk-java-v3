package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 审核结果
 */
public class ReviewDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    private String confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;

    public ReviewDetail withConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 置信度，取值介于0与1之间。
     * @return confidence
     */
    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    

    public ReviewDetail withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * 每个检测结果的标签化说明，在politics场景中 label为对应的政治人物信息，在terrorism场景中 label为对应的暴恐元素（枪支、刀具、火灾等） 信息，在porn场景中label为对应的涉黄元素（涉 黄、性感等）信息。 
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReviewDetail reviewDetail = (ReviewDetail) o;
        return Objects.equals(this.confidence, reviewDetail.confidence) &&
            Objects.equals(this.label, reviewDetail.label);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confidence, label);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewDetail {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

