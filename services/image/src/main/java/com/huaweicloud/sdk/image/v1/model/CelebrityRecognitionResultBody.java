package com.huaweicloud.sdk.image.v1.model;

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
public class CelebrityRecognitionResultBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    private Float confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="face_detail")
    
    private Object faceDetail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;

    public CelebrityRecognitionResultBody withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 置信度，取值范围 0-1。
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public CelebrityRecognitionResultBody withFaceDetail(Object faceDetail) {
        this.faceDetail = faceDetail;
        return this;
    }

    


    /**
     * politics场景中的人物面部信息，包括4个值：  h：人脸区域高度  w：人脸区域宽度  x：人脸区域左上角到y轴距离  y：人脸区域左上角到x轴距离 
     * @return faceDetail
     */
    public Object getFaceDetail() {
        return faceDetail;
    }

    public void setFaceDetail(Object faceDetail) {
        this.faceDetail = faceDetail;
    }

    public CelebrityRecognitionResultBody withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * label为对应的名人信息。
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
        CelebrityRecognitionResultBody celebrityRecognitionResultBody = (CelebrityRecognitionResultBody) o;
        return Objects.equals(this.confidence, celebrityRecognitionResultBody.confidence) &&
            Objects.equals(this.faceDetail, celebrityRecognitionResultBody.faceDetail) &&
            Objects.equals(this.label, celebrityRecognitionResultBody.label);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confidence, faceDetail, label);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CelebrityRecognitionResultBody {\n");
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

