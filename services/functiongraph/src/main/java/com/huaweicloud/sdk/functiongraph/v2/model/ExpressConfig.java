package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 快速模式配置项
 */
public class ExpressConfig {

    /**
     * 快速模式相关配置，仅在mode配置为EXPRESS时生效 快速模式下流程的执行日志级别，当前支持： ALL: 记录所有节点的执行日志 ERROR：仅记录异常节点执行日志 NONE：不记录日志 注意：当配置为ALL和ERROR级别时租户需要开启LTS相关权限
     */
    public static final class LogLevelEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final LogLevelEnum ALL = new LogLevelEnum("ALL");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final LogLevelEnum ERROR = new LogLevelEnum("ERROR");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final LogLevelEnum NONE = new LogLevelEnum("NONE");

        private static final Map<String, LogLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogLevelEnum> createStaticFields() {
            Map<String, LogLevelEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("ERROR", ERROR);
            map.put("NONE", NONE);
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

    public ExpressConfig withLogLevel(LogLevelEnum logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * 快速模式相关配置，仅在mode配置为EXPRESS时生效 快速模式下流程的执行日志级别，当前支持： ALL: 记录所有节点的执行日志 ERROR：仅记录异常节点执行日志 NONE：不记录日志 注意：当配置为ALL和ERROR级别时租户需要开启LTS相关权限
     * @return logLevel
     */
    public LogLevelEnum getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevelEnum logLevel) {
        this.logLevel = logLevel;
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
        return Objects.equals(this.logLevel, that.logLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpressConfig {\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
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
