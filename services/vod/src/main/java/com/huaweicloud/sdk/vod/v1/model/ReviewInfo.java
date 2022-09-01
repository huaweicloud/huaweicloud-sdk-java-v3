package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 审核信息数组。  &gt; 仅当审核成功后才能查询到此信息，未审核、正在审核以及审核失败时，无此字段信息。
 */
public class ReviewInfo {

    /**
     * 检测结果是否通过。  取值如下： - block：包含敏感信息，不通过。 - pass：不包含敏感信息，通过。 - review：需要人工复检。  > 当同时检测多个场景时，suggestion的值以最可能包含敏感信息的场景为准。即任一场景出现了block则总的suggestion为block，所有场景都pass时suggestion为pass，这两种情况之外则一定有场景需要review，此时suggestion为review。
     */
    public static final class SuggestionEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final SuggestionEnum BLOCK = new SuggestionEnum("block");

        /**
         * Enum PASS for value: "pass"
         */
        public static final SuggestionEnum PASS = new SuggestionEnum("pass");

        /**
         * Enum REVIEW for value: "review"
         */
        public static final SuggestionEnum REVIEW = new SuggestionEnum("review");

        private static final Map<String, SuggestionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SuggestionEnum> createStaticFields() {
            Map<String, SuggestionEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("pass", PASS);
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
            SuggestionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SuggestionEnum(value);
            }
            return result;
        }

        public static SuggestionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SuggestionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "suggestion")

    private SuggestionEnum suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    @JacksonXmlProperty(localName = "text")

    private TextReviewRet text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover")

    @JacksonXmlProperty(localName = "cover")

    private List<PictureReviewRet> cover = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    @JacksonXmlProperty(localName = "video")

    private List<PictureReviewRet> video = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_desc")

    @JacksonXmlProperty(localName = "exec_desc")

    private String execDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_status")

    @JacksonXmlProperty(localName = "review_status")

    private String reviewStatus;

    public ReviewInfo withSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 检测结果是否通过。  取值如下： - block：包含敏感信息，不通过。 - pass：不包含敏感信息，通过。 - review：需要人工复检。  > 当同时检测多个场景时，suggestion的值以最可能包含敏感信息的场景为准。即任一场景出现了block则总的suggestion为block，所有场景都pass时suggestion为pass，这两种情况之外则一定有场景需要review，此时suggestion为review。
     * @return suggestion
     */
    public SuggestionEnum getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
    }

    public ReviewInfo withText(TextReviewRet text) {
        this.text = text;
        return this;
    }

    public ReviewInfo withText(Consumer<TextReviewRet> textSetter) {
        if (this.text == null) {
            this.text = new TextReviewRet();
            textSetter.accept(this.text);
        }

        return this;
    }

    /**
     * Get text
     * @return text
     */
    public TextReviewRet getText() {
        return text;
    }

    public void setText(TextReviewRet text) {
        this.text = text;
    }

    public ReviewInfo withCover(List<PictureReviewRet> cover) {
        this.cover = cover;
        return this;
    }

    public ReviewInfo addCoverItem(PictureReviewRet coverItem) {
        if (this.cover == null) {
            this.cover = new ArrayList<>();
        }
        this.cover.add(coverItem);
        return this;
    }

    public ReviewInfo withCover(Consumer<List<PictureReviewRet>> coverSetter) {
        if (this.cover == null) {
            this.cover = new ArrayList<>();
        }
        coverSetter.accept(this.cover);
        return this;
    }

    /**
     * 封面检测结果。
     * @return cover
     */
    public List<PictureReviewRet> getCover() {
        return cover;
    }

    public void setCover(List<PictureReviewRet> cover) {
        this.cover = cover;
    }

    public ReviewInfo withVideo(List<PictureReviewRet> video) {
        this.video = video;
        return this;
    }

    public ReviewInfo addVideoItem(PictureReviewRet videoItem) {
        if (this.video == null) {
            this.video = new ArrayList<>();
        }
        this.video.add(videoItem);
        return this;
    }

    public ReviewInfo withVideo(Consumer<List<PictureReviewRet>> videoSetter) {
        if (this.video == null) {
            this.video = new ArrayList<>();
        }
        videoSetter.accept(this.video);
        return this;
    }

    /**
     * 视频检测结果。
     * @return video
     */
    public List<PictureReviewRet> getVideo() {
        return video;
    }

    public void setVideo(List<PictureReviewRet> video) {
        this.video = video;
    }

    public ReviewInfo withExecDesc(String execDesc) {
        this.execDesc = execDesc;
        return this;
    }

    /**
     * 执行情况描述。
     * @return execDesc
     */
    public String getExecDesc() {
        return execDesc;
    }

    public void setExecDesc(String execDesc) {
        this.execDesc = execDesc;
    }

    public ReviewInfo withReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }

    /**
     * 审核状态。  取值如下： - UN_REVIEW：未审核 - REVIEWING：审核中 - REVIEW_SUSPICIOUS：审核可疑，需要人工审核 - REVIEW_PASSED：审核通过 - REVIEW_FAILED：审核失败。 - REVIEW_BLOCKED：已屏蔽。
     * @return reviewStatus
     */
    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReviewInfo reviewInfo = (ReviewInfo) o;
        return Objects.equals(this.suggestion, reviewInfo.suggestion) && Objects.equals(this.text, reviewInfo.text)
            && Objects.equals(this.cover, reviewInfo.cover) && Objects.equals(this.video, reviewInfo.video)
            && Objects.equals(this.execDesc, reviewInfo.execDesc)
            && Objects.equals(this.reviewStatus, reviewInfo.reviewStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion, text, cover, video, execDesc, reviewStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewInfo {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    execDesc: ").append(toIndentedString(execDesc)).append("\n");
        sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
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
