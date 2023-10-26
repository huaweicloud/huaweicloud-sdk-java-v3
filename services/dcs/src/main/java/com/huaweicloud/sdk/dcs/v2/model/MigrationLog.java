package com.huaweicloud.sdk.dcs.v2.model;

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
 * 数据迁移进度日志信息
 */
public class MigrationLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    /**
     * 日志级别
     */
    public static final class LogLevelEnum {

        /**
         * Enum INFO for value: "INFO"
         */
        public static final LogLevelEnum INFO = new LogLevelEnum("INFO");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final LogLevelEnum ERROR = new LogLevelEnum("ERROR");

        private static final Map<String, LogLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogLevelEnum> createStaticFields() {
            Map<String, LogLevelEnum> map = new HashMap<>();
            map.put("INFO", INFO);
            map.put("ERROR", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogLevelEnum(String value) {
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
        public static LogLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogLevelEnum(value));
        }

        public static LogLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogLevelEnum) {
                return this.value.equals(((LogLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_level")

    private LogLevelEnum logLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_code")

    private String logCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private List<String> keyword = null;

    public MigrationLog withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 迁移日志生成时间，形如：2023-05-15T09:11:25.449Z
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public MigrationLog withLogLevel(LogLevelEnum logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * 日志级别
     * @return logLevel
     */
    public LogLevelEnum getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevelEnum logLevel) {
        this.logLevel = logLevel;
    }

    public MigrationLog withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 日志信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MigrationLog withLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }

    /**
     * 日志的编码
     * @return logCode
     */
    public String getLogCode() {
        return logCode;
    }

    public void setLogCode(String logCode) {
        this.logCode = logCode;
    }

    public MigrationLog withKeyword(List<String> keyword) {
        this.keyword = keyword;
        return this;
    }

    public MigrationLog addKeywordItem(String keywordItem) {
        if (this.keyword == null) {
            this.keyword = new ArrayList<>();
        }
        this.keyword.add(keywordItem);
        return this;
    }

    public MigrationLog withKeyword(Consumer<List<String>> keywordSetter) {
        if (this.keyword == null) {
            this.keyword = new ArrayList<>();
        }
        keywordSetter.accept(this.keyword);
        return this;
    }

    /**
     * 日志中的关键字
     * @return keyword
     */
    public List<String> getKeyword() {
        return keyword;
    }

    public void setKeyword(List<String> keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrationLog that = (MigrationLog) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.logLevel, that.logLevel)
            && Objects.equals(this.message, that.message) && Objects.equals(this.logCode, that.logCode)
            && Objects.equals(this.keyword, that.keyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, logLevel, message, logCode, keyword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationLog {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    logCode: ").append(toIndentedString(logCode)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
