package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListStatSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private List<StatSummary> summary = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Float total;

    /**
     * 统计类型。取值如下： - video_duration, 转码片源时长统计，单位：分钟。 - remux_file_duration，转封装片源时长统计，单位：分钟。 - transcode_task_number，转码次数统计，单位：次。 - transcode_duration，转码耗时时长统计，单位：分钟。 
     */
    public static final class StatTypeEnum {

        /**
         * Enum VIDEO_DURATION for value: "video_duration"
         */
        public static final StatTypeEnum VIDEO_DURATION = new StatTypeEnum("video_duration");

        /**
         * Enum REMUX_FILE_DURATION for value: "remux_file_duration"
         */
        public static final StatTypeEnum REMUX_FILE_DURATION = new StatTypeEnum("remux_file_duration");

        /**
         * Enum TRANSCODE_TASK_NUMBER for value: "transcode_task_number"
         */
        public static final StatTypeEnum TRANSCODE_TASK_NUMBER = new StatTypeEnum("transcode_task_number");

        /**
         * Enum TRANSCODE_DURATION for value: "transcode_duration"
         */
        public static final StatTypeEnum TRANSCODE_DURATION = new StatTypeEnum("transcode_duration");

        private static final Map<String, StatTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatTypeEnum> createStaticFields() {
            Map<String, StatTypeEnum> map = new HashMap<>();
            map.put("video_duration", VIDEO_DURATION);
            map.put("remux_file_duration", REMUX_FILE_DURATION);
            map.put("transcode_task_number", TRANSCODE_TASK_NUMBER);
            map.put("transcode_duration", TRANSCODE_DURATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatTypeEnum(String value) {
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
        public static StatTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatTypeEnum(value);
            }
            return result;
        }

        public static StatTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatTypeEnum) {
                return this.value.equals(((StatTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private StatTypeEnum statType;

    public ListStatSummaryResponse withSummary(List<StatSummary> summary) {
        this.summary = summary;
        return this;
    }

    public ListStatSummaryResponse addSummaryItem(StatSummary summaryItem) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        this.summary.add(summaryItem);
        return this;
    }

    public ListStatSummaryResponse withSummary(Consumer<List<StatSummary>> summarySetter) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        summarySetter.accept(this.summary);
        return this;
    }

    /**
     * 统计概览信息
     * @return summary
     */
    public List<StatSummary> getSummary() {
        return summary;
    }

    public void setSummary(List<StatSummary> summary) {
        this.summary = summary;
    }

    public ListStatSummaryResponse withTotal(Float total) {
        this.total = total;
        return this;
    }

    /**
     * 该指标的总值，精确到小数点后两位。 
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public ListStatSummaryResponse withStatType(StatTypeEnum statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 统计类型。取值如下： - video_duration, 转码片源时长统计，单位：分钟。 - remux_file_duration，转封装片源时长统计，单位：分钟。 - transcode_task_number，转码次数统计，单位：次。 - transcode_duration，转码耗时时长统计，单位：分钟。 
     * @return statType
     */
    public StatTypeEnum getStatType() {
        return statType;
    }

    public void setStatType(StatTypeEnum statType) {
        this.statType = statType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStatSummaryResponse listStatSummaryResponse = (ListStatSummaryResponse) o;
        return Objects.equals(this.summary, listStatSummaryResponse.summary)
            && Objects.equals(this.total, listStatSummaryResponse.total)
            && Objects.equals(this.statType, listStatSummaryResponse.statType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary, total, statType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatSummaryResponse {\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
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
