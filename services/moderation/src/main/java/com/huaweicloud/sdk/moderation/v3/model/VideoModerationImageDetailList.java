package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoModerationImageDetailList
 */
public class VideoModerationImageDetailList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    /**
     * 检测结果的一级标签。 支持category列表如下： politics: 涉政  terrorism: 暴恐  porn: 色情  image_text: 图文审核
     */
    public static final class CategoryEnum {

        /**
         * Enum POLITICS for value: "politics"
         */
        public static final CategoryEnum POLITICS = new CategoryEnum("politics");

        /**
         * Enum TERRORISM for value: "terrorism"
         */
        public static final CategoryEnum TERRORISM = new CategoryEnum("terrorism");

        /**
         * Enum PORN for value: "porn"
         */
        public static final CategoryEnum PORN = new CategoryEnum("porn");

        /**
         * Enum IMAGE_TEXT for value: "image_text"
         */
        public static final CategoryEnum IMAGE_TEXT = new CategoryEnum("image_text");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("politics", POLITICS);
            map.put("terrorism", TERRORISM);
            map.put("porn", PORN);
            map.put("image_text", IMAGE_TEXT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    /**
     * 审核结果是否通过。  block：包含敏感信息，不通过  review：需要人工复检
     */
    public static final class SuggestionEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final SuggestionEnum BLOCK = new SuggestionEnum("block");

        /**
         * Enum REVIEW for value: "review"
         */
        public static final SuggestionEnum REVIEW = new SuggestionEnum("review");

        private static final Map<String, SuggestionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SuggestionEnum> createStaticFields() {
            Map<String, SuggestionEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("review", REVIEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SuggestionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SuggestionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SuggestionEnum(value));
        }

        public static SuggestionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SuggestionEnum) {
                return this.value.equals(((SuggestionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private SuggestionEnum suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_location")

    private VideoModerationImageDetailListFaceLocation faceLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qr_location")

    private VideoModerationImageDetailListQrLocation qrLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qr_content")

    private String qrContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segments")

    private List<VideoModerationDetailSegment> segments = null;

    public VideoModerationImageDetailList withConfidence(Float confidence) {
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

    public VideoModerationImageDetailList withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 检测结果的一级标签。 支持category列表如下： politics: 涉政  terrorism: 暴恐  porn: 色情  image_text: 图文审核
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public VideoModerationImageDetailList withSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 审核结果是否通过。  block：包含敏感信息，不通过  review：需要人工复检
     * @return suggestion
     */
    public SuggestionEnum getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
    }

    public VideoModerationImageDetailList withLabel(String label) {
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

    public VideoModerationImageDetailList withFaceLocation(VideoModerationImageDetailListFaceLocation faceLocation) {
        this.faceLocation = faceLocation;
        return this;
    }

    public VideoModerationImageDetailList withFaceLocation(
        Consumer<VideoModerationImageDetailListFaceLocation> faceLocationSetter) {
        if (this.faceLocation == null) {
            this.faceLocation = new VideoModerationImageDetailListFaceLocation();
            faceLocationSetter.accept(this.faceLocation);
        }

        return this;
    }

    /**
     * Get faceLocation
     * @return faceLocation
     */
    public VideoModerationImageDetailListFaceLocation getFaceLocation() {
        return faceLocation;
    }

    public void setFaceLocation(VideoModerationImageDetailListFaceLocation faceLocation) {
        this.faceLocation = faceLocation;
    }

    public VideoModerationImageDetailList withQrLocation(VideoModerationImageDetailListQrLocation qrLocation) {
        this.qrLocation = qrLocation;
        return this;
    }

    public VideoModerationImageDetailList withQrLocation(
        Consumer<VideoModerationImageDetailListQrLocation> qrLocationSetter) {
        if (this.qrLocation == null) {
            this.qrLocation = new VideoModerationImageDetailListQrLocation();
            qrLocationSetter.accept(this.qrLocation);
        }

        return this;
    }

    /**
     * Get qrLocation
     * @return qrLocation
     */
    public VideoModerationImageDetailListQrLocation getQrLocation() {
        return qrLocation;
    }

    public void setQrLocation(VideoModerationImageDetailListQrLocation qrLocation) {
        this.qrLocation = qrLocation;
    }

    public VideoModerationImageDetailList withQrContent(String qrContent) {
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

    public VideoModerationImageDetailList withSegments(List<VideoModerationDetailSegment> segments) {
        this.segments = segments;
        return this;
    }

    public VideoModerationImageDetailList addSegmentsItem(VideoModerationDetailSegment segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    public VideoModerationImageDetailList withSegments(Consumer<List<VideoModerationDetailSegment>> segmentsSetter) {
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
    public List<VideoModerationDetailSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<VideoModerationDetailSegment> segments) {
        this.segments = segments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoModerationImageDetailList that = (VideoModerationImageDetailList) obj;
        return Objects.equals(this.confidence, that.confidence) && Objects.equals(this.category, that.category)
            && Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.label, that.label)
            && Objects.equals(this.faceLocation, that.faceLocation) && Objects.equals(this.qrLocation, that.qrLocation)
            && Objects.equals(this.qrContent, that.qrContent) && Objects.equals(this.segments, that.segments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confidence, category, suggestion, label, faceLocation, qrLocation, qrContent, segments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoModerationImageDetailList {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    faceLocation: ").append(toIndentedString(faceLocation)).append("\n");
        sb.append("    qrLocation: ").append(toIndentedString(qrLocation)).append("\n");
        sb.append("    qrContent: ").append(toIndentedString(qrContent)).append("\n");
        sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
