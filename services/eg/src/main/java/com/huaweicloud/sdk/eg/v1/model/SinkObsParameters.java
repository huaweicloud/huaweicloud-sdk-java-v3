package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SinkObsParameters
 */
public class SinkObsParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    private String secretKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    /**
     * 时间目录格式
     */
    public static final class TimeFormatEnum {

        /**
         * Enum YYYY for value: "yyyy"
         */
        public static final TimeFormatEnum YYYY = new TimeFormatEnum("yyyy");

        /**
         * Enum YYYY_MM for value: "yyyy/MM"
         */
        public static final TimeFormatEnum YYYY_MM = new TimeFormatEnum("yyyy/MM");

        /**
         * Enum YYYY_MM_DD for value: "yyyy/MM/dd"
         */
        public static final TimeFormatEnum YYYY_MM_DD = new TimeFormatEnum("yyyy/MM/dd");

        /**
         * Enum YYYY_MM_DD_HH for value: "yyyy/MM/dd/HH"
         */
        public static final TimeFormatEnum YYYY_MM_DD_HH = new TimeFormatEnum("yyyy/MM/dd/HH");

        /**
         * Enum YYYY_MM_DD_HH_MM for value: "yyyy/MM/dd/HH/mm"
         */
        public static final TimeFormatEnum YYYY_MM_DD_HH_MM = new TimeFormatEnum("yyyy/MM/dd/HH/mm");

        private static final Map<String, TimeFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeFormatEnum> createStaticFields() {
            Map<String, TimeFormatEnum> map = new HashMap<>();
            map.put("yyyy", YYYY);
            map.put("yyyy/MM", YYYY_MM);
            map.put("yyyy/MM/dd", YYYY_MM_DD);
            map.put("yyyy/MM/dd/HH", YYYY_MM_DD_HH);
            map.put("yyyy/MM/dd/HH/mm", YYYY_MM_DD_HH_MM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeFormatEnum(String value) {
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
        public static TimeFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimeFormatEnum(value));
        }

        public static TimeFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeFormatEnum) {
                return this.value.equals(((TimeFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_format")

    private TimeFormatEnum timeFormat;

    public SinkObsParameters withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * AK
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public SinkObsParameters withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * SK
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public SinkObsParameters withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * 桶
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public SinkObsParameters withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * 转储目录
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public SinkObsParameters withTimeFormat(TimeFormatEnum timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * 时间目录格式
     * @return timeFormat
     */
    public TimeFormatEnum getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(TimeFormatEnum timeFormat) {
        this.timeFormat = timeFormat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SinkObsParameters that = (SinkObsParameters) obj;
        return Objects.equals(this.accessKey, that.accessKey) && Objects.equals(this.secretKey, that.secretKey)
            && Objects.equals(this.obsBucket, that.obsBucket) && Objects.equals(this.obsPath, that.obsPath)
            && Objects.equals(this.timeFormat, that.timeFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, secretKey, obsBucket, obsPath, timeFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SinkObsParameters {\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
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
