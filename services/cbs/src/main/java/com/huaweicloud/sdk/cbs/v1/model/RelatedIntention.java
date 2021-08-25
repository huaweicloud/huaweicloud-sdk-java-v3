package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class RelatedIntention  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="intention")
    
    
    private String intention;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    
    private Double confidence;

    public RelatedIntention withIntention(String intention) {
        this.intention = intention;
        return this;
    }

    


    /**
     * 意图名称。
     * @return intention
     */
    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    

    public RelatedIntention withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 意图置信度。
     * @return confidence
     */
    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
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
        RelatedIntention relatedIntention = (RelatedIntention) o;
        return Objects.equals(this.intention, relatedIntention.intention) &&
            Objects.equals(this.confidence, relatedIntention.confidence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(intention, confidence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedIntention {\n");
        sb.append("    intention: ").append(toIndentedString(intention)).append("\n");
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

