package com.huaweicloud.sdk.moderation.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ImageDetectionResultDetailPorn
 */
public class ImageDetectionResultDetailPorn  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    private Object confidence = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;

    public ImageDetectionResultDetailPorn withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * Get confidence
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    public ImageDetectionResultDetailPorn withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * Get label
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
        ImageDetectionResultDetailPorn imageDetectionResultDetailPorn = (ImageDetectionResultDetailPorn) o;
        return Objects.equals(this.confidence, imageDetectionResultDetailPorn.confidence) &&
            Objects.equals(this.label, imageDetectionResultDetailPorn.label);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confidence, label);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResultDetailPorn {\n");
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

