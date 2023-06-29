package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ExpressConfig
 */
public class ExpressConfig {

    /**
     * 同步工作流执行时记录LTS的日志级别，NONE、ERROR\\ALL，默认NONE
     */
    public static final class LogLevelEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final LogLevelEnum NONE = new LogLevelEnum("NONE");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final LogLevelEnum ERROR = new LogLevelEnum("ERROR");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final LogLevelEnum ALL = new LogLevelEnum("ALL");

        private static final Map<String, LogLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogLevelEnum> createStaticFields() {
            Map<String, LogLevelEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("ERROR", ERROR);
            map.put("ALL", ALL);
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
    @JsonProperty(value = "support_anonymous")

    private Boolean supportAnonymous;

    public ExpressConfig withLogLevel(LogLevelEnum logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * 同步工作流执行时记录LTS的日志级别，NONE、ERROR\\ALL，默认NONE
     * @return logLevel
     */
    public LogLevelEnum getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevelEnum logLevel) {
        this.logLevel = logLevel;
    }

    public ExpressConfig withSupportAnonymous(Boolean supportAnonymous) {
        this.supportAnonymous = supportAnonymous;
        return this;
    }

    /**
     * 同步工作流是否支持匿名访问
     * @return supportAnonymous
     */
    public Boolean getSupportAnonymous() {
        return supportAnonymous;
    }

    public void setSupportAnonymous(Boolean supportAnonymous) {
        this.supportAnonymous = supportAnonymous;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpressConfig that = (ExpressConfig) obj;
        return Objects.equals(this.logLevel, that.logLevel)
            && Objects.equals(this.supportAnonymous, that.supportAnonymous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logLevel, supportAnonymous);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpressConfig {\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    supportAnonymous: ").append(toIndentedString(supportAnonymous)).append("\n");
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
