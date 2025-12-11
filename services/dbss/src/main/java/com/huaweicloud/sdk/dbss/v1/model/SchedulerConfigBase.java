package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 调度配置
 */
public class SchedulerConfigBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ids")

    private String dbIds;

    /**
     * 文件类型
     */
    public static final class FormatEnum {

        /**
         * Enum PDF for value: "PDF"
         */
        public static final FormatEnum PDF = new FormatEnum("PDF");

        /**
         * Enum ZIP for value: "ZIP"
         */
        public static final FormatEnum ZIP = new FormatEnum("ZIP");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("PDF", PDF);
            map.put("ZIP", ZIP);
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

    /**
     * 周期 - AUDIT_REPORT_DAY: 天 - AUDIT_REPORT_WEEK：周 - AUDIT_REPORT_MONTH：月 - AUDIT_REPORT_YEAR：年 - AUDIT_REPORT_REAL_TIME：实时
     */
    public static final class FrequencyEnum {

        /**
         * Enum AUDIT_REPORT_DAY for value: "AUDIT_REPORT_DAY"
         */
        public static final FrequencyEnum AUDIT_REPORT_DAY = new FrequencyEnum("AUDIT_REPORT_DAY");

        /**
         * Enum AUDIT_REPORT_WEEK for value: "AUDIT_REPORT_WEEK"
         */
        public static final FrequencyEnum AUDIT_REPORT_WEEK = new FrequencyEnum("AUDIT_REPORT_WEEK");

        /**
         * Enum AUDIT_REPORT_MONTH for value: "AUDIT_REPORT_MONTH"
         */
        public static final FrequencyEnum AUDIT_REPORT_MONTH = new FrequencyEnum("AUDIT_REPORT_MONTH");

        /**
         * Enum AUDIT_REPORT_YEAR for value: "AUDIT_REPORT_YEAR"
         */
        public static final FrequencyEnum AUDIT_REPORT_YEAR = new FrequencyEnum("AUDIT_REPORT_YEAR");

        /**
         * Enum AUDIT_REPORT_REAL_TIME for value: "AUDIT_REPORT_REAL_TIME"
         */
        public static final FrequencyEnum AUDIT_REPORT_REAL_TIME = new FrequencyEnum("AUDIT_REPORT_REAL_TIME");

        private static final Map<String, FrequencyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FrequencyEnum> createStaticFields() {
            Map<String, FrequencyEnum> map = new HashMap<>();
            map.put("AUDIT_REPORT_DAY", AUDIT_REPORT_DAY);
            map.put("AUDIT_REPORT_WEEK", AUDIT_REPORT_WEEK);
            map.put("AUDIT_REPORT_MONTH", AUDIT_REPORT_MONTH);
            map.put("AUDIT_REPORT_YEAR", AUDIT_REPORT_YEAR);
            map.put("AUDIT_REPORT_REAL_TIME", AUDIT_REPORT_REAL_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FrequencyEnum(String value) {
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
        public static FrequencyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FrequencyEnum(value));
        }

        public static FrequencyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FrequencyEnum) {
                return this.value.equals(((FrequencyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private FrequencyEnum frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 调度方式
     */
    public static final class ModeEnum {

        /**
         * Enum ONCE for value: "ONCE"
         */
        public static final ModeEnum ONCE = new ModeEnum("ONCE");

        /**
         * Enum CYCLE for value: "CYCLE"
         */
        public static final ModeEnum CYCLE = new ModeEnum("CYCLE");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("ONCE", ONCE);
            map.put("CYCLE", CYCLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    /**
     * 是否通知  - OFF：不通知  - ON：通知
     */
    public static final class NoticeEnum {

        /**
         * Enum OFF for value: "OFF"
         */
        public static final NoticeEnum OFF = new NoticeEnum("OFF");

        /**
         * Enum ON for value: "ON"
         */
        public static final NoticeEnum ON = new NoticeEnum("ON");

        private static final Map<String, NoticeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NoticeEnum> createStaticFields() {
            Map<String, NoticeEnum> map = new HashMap<>();
            map.put("OFF", OFF);
            map.put("ON", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NoticeEnum(String value) {
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
        public static NoticeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NoticeEnum(value));
        }

        public static NoticeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NoticeEnum) {
                return this.value.equals(((NoticeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice")

    private NoticeEnum notice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    /**
     * 模板状态 - ON: 开启 - OFF：关闭
     */
    public static final class StatusEnum {

        /**
         * Enum OFF for value: "OFF"
         */
        public static final StatusEnum OFF = new StatusEnum("OFF");

        /**
         * Enum ON for value: "ON"
         */
        public static final StatusEnum ON = new StatusEnum("ON");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("OFF", OFF);
            map.put("ON", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    public SchedulerConfigBase withDbIds(String dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    /**
     * 数据库ID
     * @return dbIds
     */
    public String getDbIds() {
        return dbIds;
    }

    public void setDbIds(String dbIds) {
        this.dbIds = dbIds;
    }

    public SchedulerConfigBase withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 文件类型
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public SchedulerConfigBase withFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 周期 - AUDIT_REPORT_DAY: 天 - AUDIT_REPORT_WEEK：周 - AUDIT_REPORT_MONTH：月 - AUDIT_REPORT_YEAR：年 - AUDIT_REPORT_REAL_TIME：实时
     * @return frequency
     */
    public FrequencyEnum getFrequency() {
        return frequency;
    }

    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    public SchedulerConfigBase withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 报表模板ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SchedulerConfigBase withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 调度方式
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public SchedulerConfigBase withNotice(NoticeEnum notice) {
        this.notice = notice;
        return this;
    }

    /**
     * 是否通知  - OFF：不通知  - ON：通知
     * @return notice
     */
    public NoticeEnum getNotice() {
        return notice;
    }

    public void setNotice(NoticeEnum notice) {
        this.notice = notice;
    }

    public SchedulerConfigBase withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SchedulerConfigBase withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 模板状态 - ON: 开启 - OFF：关闭
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public SchedulerConfigBase withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题URN
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchedulerConfigBase that = (SchedulerConfigBase) obj;
        return Objects.equals(this.dbIds, that.dbIds) && Objects.equals(this.format, that.format)
            && Objects.equals(this.frequency, that.frequency) && Objects.equals(this.id, that.id)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.notice, that.notice)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.topicUrn, that.topicUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbIds, format, frequency, id, mode, notice, startTime, status, topicUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchedulerConfigBase {\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
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
