package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 文件数据。
 */
public class FileExtraMeta {

    /**
     * 视频转码状态。 * WAITING：等待 * TRANSCODING：转码中 * FAILED：失败 * SUCCEEDED：成功
     */
    public static final class VideoTranscodingStatusEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final VideoTranscodingStatusEnum WAITING = new VideoTranscodingStatusEnum("WAITING");

        /**
         * Enum TRANSCODING for value: "TRANSCODING"
         */
        public static final VideoTranscodingStatusEnum TRANSCODING = new VideoTranscodingStatusEnum("TRANSCODING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final VideoTranscodingStatusEnum FAILED = new VideoTranscodingStatusEnum("FAILED");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final VideoTranscodingStatusEnum SUCCEEDED = new VideoTranscodingStatusEnum("SUCCEEDED");

        private static final Map<String, VideoTranscodingStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoTranscodingStatusEnum> createStaticFields() {
            Map<String, VideoTranscodingStatusEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("TRANSCODING", TRANSCODING);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VideoTranscodingStatusEnum(String value) {
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
        public static VideoTranscodingStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new VideoTranscodingStatusEnum(value));
        }

        public static VideoTranscodingStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VideoTranscodingStatusEnum) {
                return this.value.equals(((VideoTranscodingStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_transcoding_status")

    private VideoTranscodingStatusEnum videoTranscodingStatus;

    public FileExtraMeta withVideoTranscodingStatus(VideoTranscodingStatusEnum videoTranscodingStatus) {
        this.videoTranscodingStatus = videoTranscodingStatus;
        return this;
    }

    /**
     * 视频转码状态。 * WAITING：等待 * TRANSCODING：转码中 * FAILED：失败 * SUCCEEDED：成功
     * @return videoTranscodingStatus
     */
    public VideoTranscodingStatusEnum getVideoTranscodingStatus() {
        return videoTranscodingStatus;
    }

    public void setVideoTranscodingStatus(VideoTranscodingStatusEnum videoTranscodingStatus) {
        this.videoTranscodingStatus = videoTranscodingStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileExtraMeta that = (FileExtraMeta) obj;
        return Objects.equals(this.videoTranscodingStatus, that.videoTranscodingStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoTranscodingStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileExtraMeta {\n");
        sb.append("    videoTranscodingStatus: ").append(toIndentedString(videoTranscodingStatus)).append("\n");
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
