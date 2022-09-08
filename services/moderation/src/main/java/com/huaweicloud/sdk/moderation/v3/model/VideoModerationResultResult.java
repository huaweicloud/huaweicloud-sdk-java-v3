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
 * 作业审核结果，当作业状态为succeeded时存在
 */
public class VideoModerationResultResult {

    /**
     * 视频审核结果是否通过。 block：包含敏感信息，不通过  review：需要人工复检 pass：不包含敏感信息，通过
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

    private SuggestionEnum suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_detail")

    private List<VideoModerationImageDetail> imageDetail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_detail")

    private List<VideoModerationVideoDetail> audioDetail = null;

    public VideoModerationResultResult withSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 视频审核结果是否通过。 block：包含敏感信息，不通过  review：需要人工复检 pass：不包含敏感信息，通过
     * @return suggestion
     */
    public SuggestionEnum getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
    }

    public VideoModerationResultResult withImageDetail(List<VideoModerationImageDetail> imageDetail) {
        this.imageDetail = imageDetail;
        return this;
    }

    public VideoModerationResultResult addImageDetailItem(VideoModerationImageDetail imageDetailItem) {
        if (this.imageDetail == null) {
            this.imageDetail = new ArrayList<>();
        }
        this.imageDetail.add(imageDetailItem);
        return this;
    }

    public VideoModerationResultResult withImageDetail(Consumer<List<VideoModerationImageDetail>> imageDetailSetter) {
        if (this.imageDetail == null) {
            this.imageDetail = new ArrayList<>();
        }
        imageDetailSetter.accept(this.imageDetail);
        return this;
    }

    /**
     * 图像审核详情
     * @return imageDetail
     */
    public List<VideoModerationImageDetail> getImageDetail() {
        return imageDetail;
    }

    public void setImageDetail(List<VideoModerationImageDetail> imageDetail) {
        this.imageDetail = imageDetail;
    }

    public VideoModerationResultResult withAudioDetail(List<VideoModerationVideoDetail> audioDetail) {
        this.audioDetail = audioDetail;
        return this;
    }

    public VideoModerationResultResult addAudioDetailItem(VideoModerationVideoDetail audioDetailItem) {
        if (this.audioDetail == null) {
            this.audioDetail = new ArrayList<>();
        }
        this.audioDetail.add(audioDetailItem);
        return this;
    }

    public VideoModerationResultResult withAudioDetail(Consumer<List<VideoModerationVideoDetail>> audioDetailSetter) {
        if (this.audioDetail == null) {
            this.audioDetail = new ArrayList<>();
        }
        audioDetailSetter.accept(this.audioDetail);
        return this;
    }

    /**
     * 音频审核详情
     * @return audioDetail
     */
    public List<VideoModerationVideoDetail> getAudioDetail() {
        return audioDetail;
    }

    public void setAudioDetail(List<VideoModerationVideoDetail> audioDetail) {
        this.audioDetail = audioDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoModerationResultResult videoModerationResultResult = (VideoModerationResultResult) o;
        return Objects.equals(this.suggestion, videoModerationResultResult.suggestion)
            && Objects.equals(this.imageDetail, videoModerationResultResult.imageDetail)
            && Objects.equals(this.audioDetail, videoModerationResultResult.audioDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion, imageDetail, audioDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoModerationResultResult {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    imageDetail: ").append(toIndentedString(imageDetail)).append("\n");
        sb.append("    audioDetail: ").append(toIndentedString(audioDetail)).append("\n");
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
