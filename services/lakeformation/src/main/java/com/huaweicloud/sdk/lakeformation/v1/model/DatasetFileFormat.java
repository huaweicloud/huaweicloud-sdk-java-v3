package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * 文件类型
 */
public class DatasetFileFormat {

    /**
     * 文件格式： ROW-行存储文件, TEXT-无格式文本文件, IMAGE-图片文件, AUDIO-音频文件, VIDEO-视频文件, CUSTOM-其他文件
     */
    public static final class FormatEnum {

        /**
         * Enum ROW for value: "ROW"
         */
        public static final FormatEnum ROW = new FormatEnum("ROW");

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final FormatEnum TEXT = new FormatEnum("TEXT");

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final FormatEnum IMAGE = new FormatEnum("IMAGE");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final FormatEnum AUDIO = new FormatEnum("AUDIO");

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final FormatEnum VIDEO = new FormatEnum("VIDEO");

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final FormatEnum CUSTOM = new FormatEnum("CUSTOM");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("ROW", ROW);
            map.put("TEXT", TEXT);
            map.put("IMAGE", IMAGE);
            map.put("AUDIO", AUDIO);
            map.put("VIDEO", VIDEO);
            map.put("CUSTOM", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FormatEnum(value));
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FormatEnum format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_types")

    private List<String> contentTypes = null;

    public DatasetFileFormat withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 文件格式： ROW-行存储文件, TEXT-无格式文本文件, IMAGE-图片文件, AUDIO-音频文件, VIDEO-视频文件, CUSTOM-其他文件
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public DatasetFileFormat withContentTypes(List<String> contentTypes) {
        this.contentTypes = contentTypes;
        return this;
    }

    public DatasetFileFormat addContentTypesItem(String contentTypesItem) {
        if (this.contentTypes == null) {
            this.contentTypes = new ArrayList<>();
        }
        this.contentTypes.add(contentTypesItem);
        return this;
    }

    public DatasetFileFormat withContentTypes(Consumer<List<String>> contentTypesSetter) {
        if (this.contentTypes == null) {
            this.contentTypes = new ArrayList<>();
        }
        contentTypesSetter.accept(this.contentTypes);
        return this;
    }

    /**
     * 文件内容类型。行存文件格式,format为ROW时设置,可选值: CSV-Comma Separated Values文件,JSONL-Json对象行文件,AVRO-AVRO行存文件 图片文件格式，format为IMAGE时设置,可选值: JPG-JPG图片,PNG-PNG图片,TIFF-TIFF图片 音频文件格式，format为AUDIO时设置,可选值: WAV-WAV音频,MP3-MP3音频,FLAC-FLAC音频 视频文件格式，format为VIDEO时设置,可选值: MP4-MP4视频,MOV-MOV视频,AVI-AVI视频
     * @return contentTypes
     */
    public List<String> getContentTypes() {
        return contentTypes;
    }

    public void setContentTypes(List<String> contentTypes) {
        this.contentTypes = contentTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatasetFileFormat that = (DatasetFileFormat) obj;
        return Objects.equals(this.format, that.format) && Objects.equals(this.contentTypes, that.contentTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, contentTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatasetFileFormat {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    contentTypes: ").append(toIndentedString(contentTypes)).append("\n");
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
