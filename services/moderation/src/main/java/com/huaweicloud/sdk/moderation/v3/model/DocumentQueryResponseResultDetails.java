package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DocumentQueryResponseResultDetails
 */
public class DocumentQueryResponseResultDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_position")

    private Integer startPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_position")

    private Integer endPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segments")

    private List<DocumentQueryResponseResultSegments> segments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_image_details")

    private List<DocumentVideoImageDetail> videoImageDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_details")

    private List<DocumentAudioDetail> audioDetails = null;

    public DocumentQueryResponseResultDetails withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 当前内容片段的处置建议： block：包含敏感信息，不通过 review：需要人工复检
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public DocumentQueryResponseResultDetails withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 当前内容片段的类型，可取值有： text: 文本 image: 图像 video: 视频
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DocumentQueryResponseResultDetails withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 当前内容片段的风险类型： politics：涉政 terrorism：暴恐 porn：色情 sexy：性感 abuse：辱骂 ad：广告 qr_code：二维码 watermark：水印 meaningless：无意义 ban：违禁 bad_scene：不良场景 moan：娇喘
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public DocumentQueryResponseResultDetails withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 当前处理的片段索引
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public DocumentQueryResponseResultDetails withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 当前内容片段中的文本内容，仅当type为text时存在
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DocumentQueryResponseResultDetails withStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
        return this;
    }

    /**
     * 当前文本内容片段在输入中的起始位置，仅当type为text时存在
     * @return startPosition
     */
    public Integer getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }

    public DocumentQueryResponseResultDetails withEndPosition(Integer endPosition) {
        this.endPosition = endPosition;
        return this;
    }

    /**
     * 当前文本内容片段在输入中的结束位置，仅当type为text时存在
     * @return endPosition
     */
    public Integer getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Integer endPosition) {
        this.endPosition = endPosition;
    }

    public DocumentQueryResponseResultDetails withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 网页图片url，仅当type为image且文档格式为webpage时存在
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public DocumentQueryResponseResultDetails withSegments(List<DocumentQueryResponseResultSegments> segments) {
        this.segments = segments;
        return this;
    }

    public DocumentQueryResponseResultDetails addSegmentsItem(DocumentQueryResponseResultSegments segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    public DocumentQueryResponseResultDetails withSegments(
        Consumer<List<DocumentQueryResponseResultSegments>> segmentsSetter) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        segmentsSetter.accept(this.segments);
        return this;
    }

    /**
     * 命中的风险片段信息列表，仅在有命中敏感词时才返回
     * @return segments
     */
    public List<DocumentQueryResponseResultSegments> getSegments() {
        return segments;
    }

    public void setSegments(List<DocumentQueryResponseResultSegments> segments) {
        this.segments = segments;
    }

    public DocumentQueryResponseResultDetails withVideoImageDetails(List<DocumentVideoImageDetail> videoImageDetails) {
        this.videoImageDetails = videoImageDetails;
        return this;
    }

    public DocumentQueryResponseResultDetails addVideoImageDetailsItem(DocumentVideoImageDetail videoImageDetailsItem) {
        if (this.videoImageDetails == null) {
            this.videoImageDetails = new ArrayList<>();
        }
        this.videoImageDetails.add(videoImageDetailsItem);
        return this;
    }

    public DocumentQueryResponseResultDetails withVideoImageDetails(
        Consumer<List<DocumentVideoImageDetail>> videoImageDetailsSetter) {
        if (this.videoImageDetails == null) {
            this.videoImageDetails = new ArrayList<>();
        }
        videoImageDetailsSetter.accept(this.videoImageDetails);
        return this;
    }

    /**
     * 网页视频中截帧部分审核详情
     * @return videoImageDetails
     */
    public List<DocumentVideoImageDetail> getVideoImageDetails() {
        return videoImageDetails;
    }

    public void setVideoImageDetails(List<DocumentVideoImageDetail> videoImageDetails) {
        this.videoImageDetails = videoImageDetails;
    }

    public DocumentQueryResponseResultDetails withAudioDetails(List<DocumentAudioDetail> audioDetails) {
        this.audioDetails = audioDetails;
        return this;
    }

    public DocumentQueryResponseResultDetails addAudioDetailsItem(DocumentAudioDetail audioDetailsItem) {
        if (this.audioDetails == null) {
            this.audioDetails = new ArrayList<>();
        }
        this.audioDetails.add(audioDetailsItem);
        return this;
    }

    public DocumentQueryResponseResultDetails withAudioDetails(Consumer<List<DocumentAudioDetail>> audioDetailsSetter) {
        if (this.audioDetails == null) {
            this.audioDetails = new ArrayList<>();
        }
        audioDetailsSetter.accept(this.audioDetails);
        return this;
    }

    /**
     * 网页视频中音频部分审核详情
     * @return audioDetails
     */
    public List<DocumentAudioDetail> getAudioDetails() {
        return audioDetails;
    }

    public void setAudioDetails(List<DocumentAudioDetail> audioDetails) {
        this.audioDetails = audioDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentQueryResponseResultDetails that = (DocumentQueryResponseResultDetails) obj;
        return Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.type, that.type)
            && Objects.equals(this.label, that.label) && Objects.equals(this.index, that.index)
            && Objects.equals(this.text, that.text) && Objects.equals(this.startPosition, that.startPosition)
            && Objects.equals(this.endPosition, that.endPosition) && Objects.equals(this.imageUrl, that.imageUrl)
            && Objects.equals(this.segments, that.segments)
            && Objects.equals(this.videoImageDetails, that.videoImageDetails)
            && Objects.equals(this.audioDetails, that.audioDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion,
            type,
            label,
            index,
            text,
            startPosition,
            endPosition,
            imageUrl,
            segments,
            videoImageDetails,
            audioDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentQueryResponseResultDetails {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
        sb.append("    videoImageDetails: ").append(toIndentedString(videoImageDetails)).append("\n");
        sb.append("    audioDetails: ").append(toIndentedString(audioDetails)).append("\n");
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
