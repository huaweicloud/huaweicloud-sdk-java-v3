package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 增量组件详情。
 */
public class IncreComponentDetail {

    /**
     * 组件类型 - capture：抓取 - apply：回放
     */
    public static final class TypeEnum {

        /**
         * Enum CAPTURE for value: "capture"
         */
        public static final TypeEnum CAPTURE = new TypeEnum("capture");

        /**
         * Enum APPLY for value: "apply"
         */
        public static final TypeEnum APPLY = new TypeEnum("apply");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("capture", CAPTURE);
            map.put("apply", APPLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_point")

    private String startPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_point")

    private String currentPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution_time")

    private String resolutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private String delay;

    public IncreComponentDetail withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 组件类型 - capture：抓取 - apply：回放
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public IncreComponentDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。 - STOPPED：停止 - STARTED：运行中 - STOPPING：停止中 - STARTING：启动中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IncreComponentDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 启动时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public IncreComponentDetail withStartPoint(String startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    /**
     * 启动位点
     * @return startPoint
     */
    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public IncreComponentDetail withCurrentPoint(String currentPoint) {
        this.currentPoint = currentPoint;
        return this;
    }

    /**
     * 当前位点
     * @return currentPoint
     */
    public String getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(String currentPoint) {
        this.currentPoint = currentPoint;
    }

    public IncreComponentDetail withResolutionTime(String resolutionTime) {
        this.resolutionTime = resolutionTime;
        return this;
    }

    /**
     * 解析时间
     * @return resolutionTime
     */
    public String getResolutionTime() {
        return resolutionTime;
    }

    public void setResolutionTime(String resolutionTime) {
        this.resolutionTime = resolutionTime;
    }

    public IncreComponentDetail withDelay(String delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 时延，单位：秒
     * @return delay
     */
    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncreComponentDetail that = (IncreComponentDetail) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.startPoint, that.startPoint)
            && Objects.equals(this.currentPoint, that.currentPoint)
            && Objects.equals(this.resolutionTime, that.resolutionTime) && Objects.equals(this.delay, that.delay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, startTime, startPoint, currentPoint, resolutionTime, delay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncreComponentDetail {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    startPoint: ").append(toIndentedString(startPoint)).append("\n");
        sb.append("    currentPoint: ").append(toIndentedString(currentPoint)).append("\n");
        sb.append("    resolutionTime: ").append(toIndentedString(resolutionTime)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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
