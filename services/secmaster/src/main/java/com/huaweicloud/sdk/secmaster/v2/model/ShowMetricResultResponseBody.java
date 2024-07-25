package com.huaweicloud.sdk.secmaster.v2.model;

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
 * ShowMetricResultResponseBody
 */
public class ShowMetricResultResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_id")

    private String metricId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ShowMetricResultResponseBodyResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_format")

    private List<MetricFormat> metricFormat = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_msg")

    private String logMsg;

    /**
     * 查询结果状态，SUCCESS：查询成功，FAILED：查询失败，FALLBACK：使用默认值
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum FALLBACK for value: "FALLBACK"
         */
        public static final StatusEnum FALLBACK = new StatusEnum("FALLBACK");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            map.put("FALLBACK", FALLBACK);
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

    public ShowMetricResultResponseBody withMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }

    /**
     * 指标ID
     * @return metricId
     */
    public String getMetricId() {
        return metricId;
    }

    public void setMetricId(String metricId) {
        this.metricId = metricId;
    }

    public ShowMetricResultResponseBody withResult(ShowMetricResultResponseBodyResult result) {
        this.result = result;
        return this;
    }

    public ShowMetricResultResponseBody withResult(Consumer<ShowMetricResultResponseBodyResult> resultSetter) {
        if (this.result == null) {
            this.result = new ShowMetricResultResponseBodyResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public ShowMetricResultResponseBodyResult getResult() {
        return result;
    }

    public void setResult(ShowMetricResultResponseBodyResult result) {
        this.result = result;
    }

    public ShowMetricResultResponseBody withMetricFormat(List<MetricFormat> metricFormat) {
        this.metricFormat = metricFormat;
        return this;
    }

    public ShowMetricResultResponseBody addMetricFormatItem(MetricFormat metricFormatItem) {
        if (this.metricFormat == null) {
            this.metricFormat = new ArrayList<>();
        }
        this.metricFormat.add(metricFormatItem);
        return this;
    }

    public ShowMetricResultResponseBody withMetricFormat(Consumer<List<MetricFormat>> metricFormatSetter) {
        if (this.metricFormat == null) {
            this.metricFormat = new ArrayList<>();
        }
        metricFormatSetter.accept(this.metricFormat);
        return this;
    }

    /**
     * 指标显示格式，根据不同指标固定返回。
     * @return metricFormat
     */
    public List<MetricFormat> getMetricFormat() {
        return metricFormat;
    }

    public void setMetricFormat(List<MetricFormat> metricFormat) {
        this.metricFormat = metricFormat;
    }

    public ShowMetricResultResponseBody withLogMsg(String logMsg) {
        this.logMsg = logMsg;
        return this;
    }

    /**
     * 结果日志信息
     * @return logMsg
     */
    public String getLogMsg() {
        return logMsg;
    }

    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg;
    }

    public ShowMetricResultResponseBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 查询结果状态，SUCCESS：查询成功，FAILED：查询失败，FALLBACK：使用默认值
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMetricResultResponseBody that = (ShowMetricResultResponseBody) obj;
        return Objects.equals(this.metricId, that.metricId) && Objects.equals(this.result, that.result)
            && Objects.equals(this.metricFormat, that.metricFormat) && Objects.equals(this.logMsg, that.logMsg)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricId, result, metricFormat, logMsg, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetricResultResponseBody {\n");
        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    metricFormat: ").append(toIndentedString(metricFormat)).append("\n");
        sb.append("    logMsg: ").append(toIndentedString(logMsg)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
