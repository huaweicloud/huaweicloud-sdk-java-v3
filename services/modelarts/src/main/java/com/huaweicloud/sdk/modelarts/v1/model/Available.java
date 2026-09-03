package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源可用容量，不考虑资源已分配量，即资源总容量减去故障资源和热备节点的资源
 */
public class Available {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Value value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxValue")

    private Value maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private String timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "window")

    private String window;

    public Available withValue(Value value) {
        this.value = value;
        return this;
    }

    public Available withValue(Consumer<Value> valueSetter) {
        if (this.value == null) {
            this.value = new Value();
            valueSetter.accept(this.value);
        }

        return this;
    }

    /**
     * Get value
     * @return value
     */
    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Available withMaxValue(Value maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    public Available withMaxValue(Consumer<Value> maxValueSetter) {
        if (this.maxValue == null) {
            this.maxValue = new Value();
            maxValueSetter.accept(this.maxValue);
        }

        return this;
    }

    /**
     * Get maxValue
     * @return maxValue
     */
    public Value getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Value maxValue) {
        this.maxValue = maxValue;
    }

    public Available withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * UTC时间，格式yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Available withWindow(String window) {
        this.window = window;
        return this;
    }

    /**
     * 统计间隔，1s表示1秒，1m表示1分钟，1h为1小时。
     * @return window
     */
    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Available that = (Available) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.maxValue, that.maxValue)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.window, that.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, maxValue, timestamp, window);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Available {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
