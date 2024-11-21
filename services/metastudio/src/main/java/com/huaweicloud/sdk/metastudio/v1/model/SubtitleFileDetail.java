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
 * SubtitleFileDetail
 */
public class SubtitleFileDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_no")

    private Integer sequenceNo;

    /**
     * 字幕文件生成状态。 * GENERATING：字幕文件生成中。 * GENERATE_SUCCEED：字幕文件生成成功。 * GENERATE_FAILED：字幕文件生成失败。
     */
    public static final class SubtitleFileStateEnum {

        /**
         * Enum GENERATE_SUCCEED for value: "GENERATE_SUCCEED"
         */
        public static final SubtitleFileStateEnum GENERATE_SUCCEED = new SubtitleFileStateEnum("GENERATE_SUCCEED");

        /**
         * Enum GENERATE_FAILED for value: "GENERATE_FAILED"
         */
        public static final SubtitleFileStateEnum GENERATE_FAILED = new SubtitleFileStateEnum("GENERATE_FAILED");

        /**
         * Enum GENERATING for value: "GENERATING"
         */
        public static final SubtitleFileStateEnum GENERATING = new SubtitleFileStateEnum("GENERATING");

        private static final Map<String, SubtitleFileStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SubtitleFileStateEnum> createStaticFields() {
            Map<String, SubtitleFileStateEnum> map = new HashMap<>();
            map.put("GENERATE_SUCCEED", GENERATE_SUCCEED);
            map.put("GENERATE_FAILED", GENERATE_FAILED);
            map.put("GENERATING", GENERATING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SubtitleFileStateEnum(String value) {
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
        public static SubtitleFileStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SubtitleFileStateEnum(value));
        }

        public static SubtitleFileStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubtitleFileStateEnum) {
                return this.value.equals(((SubtitleFileStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_file_state")

    private SubtitleFileStateEnum subtitleFileState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_file_download_url")

    private String subtitleFileDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_file_upload_url")

    private String subtitleFileUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_time")

    private String generateTime;

    public SubtitleFileDetail withSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
        return this;
    }

    /**
     * 剧本序号。
     * minimum: 0
     * maximum: 2147483647
     * @return sequenceNo
     */
    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public SubtitleFileDetail withSubtitleFileState(SubtitleFileStateEnum subtitleFileState) {
        this.subtitleFileState = subtitleFileState;
        return this;
    }

    /**
     * 字幕文件生成状态。 * GENERATING：字幕文件生成中。 * GENERATE_SUCCEED：字幕文件生成成功。 * GENERATE_FAILED：字幕文件生成失败。
     * @return subtitleFileState
     */
    public SubtitleFileStateEnum getSubtitleFileState() {
        return subtitleFileState;
    }

    public void setSubtitleFileState(SubtitleFileStateEnum subtitleFileState) {
        this.subtitleFileState = subtitleFileState;
    }

    public SubtitleFileDetail withSubtitleFileDownloadUrl(String subtitleFileDownloadUrl) {
        this.subtitleFileDownloadUrl = subtitleFileDownloadUrl;
        return this;
    }

    /**
     * 字幕文件下载链接。
     * @return subtitleFileDownloadUrl
     */
    public String getSubtitleFileDownloadUrl() {
        return subtitleFileDownloadUrl;
    }

    public void setSubtitleFileDownloadUrl(String subtitleFileDownloadUrl) {
        this.subtitleFileDownloadUrl = subtitleFileDownloadUrl;
    }

    public SubtitleFileDetail withSubtitleFileUploadUrl(String subtitleFileUploadUrl) {
        this.subtitleFileUploadUrl = subtitleFileUploadUrl;
        return this;
    }

    /**
     * 字幕文件上传链接。
     * @return subtitleFileUploadUrl
     */
    public String getSubtitleFileUploadUrl() {
        return subtitleFileUploadUrl;
    }

    public void setSubtitleFileUploadUrl(String subtitleFileUploadUrl) {
        this.subtitleFileUploadUrl = subtitleFileUploadUrl;
    }

    public SubtitleFileDetail withGenerateTime(String generateTime) {
        this.generateTime = generateTime;
        return this;
    }

    /**
     * 字幕文件生成时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return generateTime
     */
    public String getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(String generateTime) {
        this.generateTime = generateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubtitleFileDetail that = (SubtitleFileDetail) obj;
        return Objects.equals(this.sequenceNo, that.sequenceNo)
            && Objects.equals(this.subtitleFileState, that.subtitleFileState)
            && Objects.equals(this.subtitleFileDownloadUrl, that.subtitleFileDownloadUrl)
            && Objects.equals(this.subtitleFileUploadUrl, that.subtitleFileUploadUrl)
            && Objects.equals(this.generateTime, that.generateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sequenceNo, subtitleFileState, subtitleFileDownloadUrl, subtitleFileUploadUrl, generateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubtitleFileDetail {\n");
        sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
        sb.append("    subtitleFileState: ").append(toIndentedString(subtitleFileState)).append("\n");
        sb.append("    subtitleFileDownloadUrl: ").append(toIndentedString(subtitleFileDownloadUrl)).append("\n");
        sb.append("    subtitleFileUploadUrl: ").append(toIndentedString(subtitleFileUploadUrl)).append("\n");
        sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
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
