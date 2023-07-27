package com.huaweicloud.sdk.lts.v2.model;

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
 * 创建日志流参数。
 */
public class CreateLogStreamParams {

    /**
     * 需要创建的日志流名称。
     */
    public static final class LogStreamNameEnum {

        /**
         * Enum LTS_STREAM_13CI for value: "lts-stream-13ci"
         */
        public static final LogStreamNameEnum LTS_STREAM_13CI = new LogStreamNameEnum("lts-stream-13ci");

        private static final Map<String, LogStreamNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogStreamNameEnum> createStaticFields() {
            Map<String, LogStreamNameEnum> map = new HashMap<>();
            map.put("lts-stream-13ci", LTS_STREAM_13CI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogStreamNameEnum(String value) {
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
        public static LogStreamNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogStreamNameEnum(value));
        }

        public static LogStreamNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogStreamNameEnum) {
                return this.value.equals(((LogStreamNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private LogStreamNameEnum logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    /**
     * 日志存储时间  最小值：1 最大值：365 说明： 该参数仅对华东-上海一、华北-北京四、华南-广州用户开放。
     */
    public static final class TtlInDaysEnum {

        /**
         * Enum _7 for value: "7"
         */
        public static final TtlInDaysEnum _7 = new TtlInDaysEnum("7");

        private static final Map<String, TtlInDaysEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TtlInDaysEnum> createStaticFields() {
            Map<String, TtlInDaysEnum> map = new HashMap<>();
            map.put("7", _7);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TtlInDaysEnum(String value) {
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
        public static TtlInDaysEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TtlInDaysEnum(value));
        }

        public static TtlInDaysEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TtlInDaysEnum) {
                return this.value.equals(((TtlInDaysEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    private TtlInDaysEnum ttlInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsBody> tags = null;

    public CreateLogStreamParams withLogStreamName(LogStreamNameEnum logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 需要创建的日志流名称。
     * @return logStreamName
     */
    public LogStreamNameEnum getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(LogStreamNameEnum logStreamName) {
        this.logStreamName = logStreamName;
    }

    public CreateLogStreamParams withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称。
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public CreateLogStreamParams withTtlInDays(TtlInDaysEnum ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 日志存储时间  最小值：1 最大值：365 说明： 该参数仅对华东-上海一、华北-北京四、华南-广州用户开放。
     * @return ttlInDays
     */
    public TtlInDaysEnum getTtlInDays() {
        return ttlInDays;
    }

    public void setTtlInDays(TtlInDaysEnum ttlInDays) {
        this.ttlInDays = ttlInDays;
    }

    public CreateLogStreamParams withTags(List<TagsBody> tags) {
        this.tags = tags;
        return this;
    }

    public CreateLogStreamParams addTagsItem(TagsBody tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateLogStreamParams withTags(Consumer<List<TagsBody>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签字段信息
     * @return tags
     */
    public List<TagsBody> getTags() {
        return tags;
    }

    public void setTags(List<TagsBody> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLogStreamParams that = (CreateLogStreamParams) obj;
        return Objects.equals(this.logStreamName, that.logStreamName)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.ttlInDays, that.ttlInDays) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStreamName, enterpriseProjectName, ttlInDays, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogStreamParams {\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
