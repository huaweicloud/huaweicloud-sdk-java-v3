package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CheckResultDetailBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    private Double confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="face_detail")
    
    private Object faceDetail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;

    public CheckResultDetailBody withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 请参见[表2](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table663805019540)中confidence字段说明。
     * @return confidence
     */
    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public CheckResultDetailBody withFaceDetail(Object faceDetail) {
        this.faceDetail = faceDetail;
        return this;
    }

    


    /**
     * 请参见[表2](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table663805019540)中face_detail字段说明。
     * @return faceDetail
     */
    public Object getFaceDetail() {
        return faceDetail;
    }

    public void setFaceDetail(Object faceDetail) {
        this.faceDetail = faceDetail;
    }

    public CheckResultDetailBody withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * 请参见[表2](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table663805019540)中label字段说明。
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
        CheckResultDetailBody checkResultDetailBody = (CheckResultDetailBody) o;
        return Objects.equals(this.confidence, checkResultDetailBody.confidence) &&
            Objects.equals(this.faceDetail, checkResultDetailBody.faceDetail) &&
            Objects.equals(this.label, checkResultDetailBody.label);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confidence, faceDetail, label);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckResultDetailBody {\n");
            sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
            sb.append("    faceDetail: ").append(toIndentedString(faceDetail)).append("\n");
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

