package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class ImageBatchModerationResultBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suggestion")
    
    private String suggestion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private Object detail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    private BigDecimal confidence = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="face_detail")
    
    private Object faceDetail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;

    public ImageBatchModerationResultBody withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 图片的URL路径。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageBatchModerationResultBody withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    


    /**
     * 请参见[表2](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table663805019540)中suggestion字段说明。
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public ImageBatchModerationResultBody withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * 请参见[表2](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table663805019540)中detail字段说明
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public ImageBatchModerationResultBody withConfidence(BigDecimal confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 请参见[表2](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table663805019540)中confidence字段说明。
     * @return confidence
     */
    public BigDecimal getConfidence() {
        return confidence;
    }

    public void setConfidence(BigDecimal confidence) {
        this.confidence = confidence;
    }

    public ImageBatchModerationResultBody withFaceDetail(Object faceDetail) {
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

    public ImageBatchModerationResultBody withLabel(String label) {
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
        ImageBatchModerationResultBody imageBatchModerationResultBody = (ImageBatchModerationResultBody) o;
        return Objects.equals(this.url, imageBatchModerationResultBody.url) &&
            Objects.equals(this.suggestion, imageBatchModerationResultBody.suggestion) &&
            Objects.equals(this.detail, imageBatchModerationResultBody.detail) &&
            Objects.equals(this.confidence, imageBatchModerationResultBody.confidence) &&
            Objects.equals(this.faceDetail, imageBatchModerationResultBody.faceDetail) &&
            Objects.equals(this.label, imageBatchModerationResultBody.label);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, suggestion, detail, confidence, faceDetail, label);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageBatchModerationResultBody {\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
            sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

