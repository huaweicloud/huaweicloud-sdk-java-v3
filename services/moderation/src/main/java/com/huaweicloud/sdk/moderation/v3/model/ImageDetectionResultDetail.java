package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回结果的详细内容。
 */
public class ImageDetectionResultDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_location")

    private FaceLocationDetail faceLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qr_location")

    private QRLocationDetail qrLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qr_content")

    private String qrContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segments")

    private List<OCRTextDetail> segments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    public ImageDetectionResultDetail withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 审核结果是否通过。 block：包含敏感信息，不通过 review：需要人工复检
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public ImageDetectionResultDetail withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 检测结果的一级标签。 支持category列表如下： terrorism: 暴恐 porn: 色情 image_text: 图文审核
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ImageDetectionResultDetail withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度，可选值在0-1之间，值越大，可信度越高。
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public ImageDetectionResultDetail withFaceLocation(FaceLocationDetail faceLocation) {
        this.faceLocation = faceLocation;
        return this;
    }

    public ImageDetectionResultDetail withFaceLocation(Consumer<FaceLocationDetail> faceLocationSetter) {
        if (this.faceLocation == null) {
            this.faceLocation = new FaceLocationDetail();
            faceLocationSetter.accept(this.faceLocation);
        }

        return this;
    }

    /**
     * Get faceLocation
     * @return faceLocation
     */
    public FaceLocationDetail getFaceLocation() {
        return faceLocation;
    }

    public void setFaceLocation(FaceLocationDetail faceLocation) {
        this.faceLocation = faceLocation;
    }

    public ImageDetectionResultDetail withQrLocation(QRLocationDetail qrLocation) {
        this.qrLocation = qrLocation;
        return this;
    }

    public ImageDetectionResultDetail withQrLocation(Consumer<QRLocationDetail> qrLocationSetter) {
        if (this.qrLocation == null) {
            this.qrLocation = new QRLocationDetail();
            qrLocationSetter.accept(this.qrLocation);
        }

        return this;
    }

    /**
     * Get qrLocation
     * @return qrLocation
     */
    public QRLocationDetail getQrLocation() {
        return qrLocation;
    }

    public void setQrLocation(QRLocationDetail qrLocation) {
        this.qrLocation = qrLocation;
    }

    public ImageDetectionResultDetail withQrContent(String qrContent) {
        this.qrContent = qrContent;
        return this;
    }

    /**
     * 图片中二维码指向的链接，当请求参数categories中包含image_text时存在。
     * @return qrContent
     */
    public String getQrContent() {
        return qrContent;
    }

    public void setQrContent(String qrContent) {
        this.qrContent = qrContent;
    }

    public ImageDetectionResultDetail withSegments(List<OCRTextDetail> segments) {
        this.segments = segments;
        return this;
    }

    public ImageDetectionResultDetail addSegmentsItem(OCRTextDetail segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    public ImageDetectionResultDetail withSegments(Consumer<List<OCRTextDetail>> segmentsSetter) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        segmentsSetter.accept(this.segments);
        return this;
    }

    /**
     * image_text场景下命中的文本片段。
     * @return segments
     */
    public List<OCRTextDetail> getSegments() {
        return segments;
    }

    public void setSegments(List<OCRTextDetail> segments) {
        this.segments = segments;
    }

    public ImageDetectionResultDetail withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 识别的详细标签。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageDetectionResultDetail that = (ImageDetectionResultDetail) obj;
        return Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.category, that.category)
            && Objects.equals(this.confidence, that.confidence) && Objects.equals(this.faceLocation, that.faceLocation)
            && Objects.equals(this.qrLocation, that.qrLocation) && Objects.equals(this.qrContent, that.qrContent)
            && Objects.equals(this.segments, that.segments) && Objects.equals(this.label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion, category, confidence, faceLocation, qrLocation, qrContent, segments, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResultDetail {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    faceLocation: ").append(toIndentedString(faceLocation)).append("\n");
        sb.append("    qrLocation: ").append(toIndentedString(qrLocation)).append("\n");
        sb.append("    qrContent: ").append(toIndentedString(qrContent)).append("\n");
        sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
