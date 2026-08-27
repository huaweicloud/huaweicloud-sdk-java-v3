package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源总容量。
 */
public class Capacity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Value value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxValue")

    private Value maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allValue")

    private Value allValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allMaxValue")

    private Value allMaxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private String timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "window")

    private String window;

    public Capacity withValue(Value value) {
        this.value = value;
        return this;
    }

    public Capacity withValue(Consumer<Value> valueSetter) {
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

    public Capacity withMaxValue(Value maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    public Capacity withMaxValue(Consumer<Value> maxValueSetter) {
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

    public Capacity withAllValue(Value allValue) {
        this.allValue = allValue;
        return this;
    }

    public Capacity withAllValue(Consumer<Value> allValueSetter) {
        if (this.allValue == null) {
            this.allValue = new Value();
            allValueSetter.accept(this.allValue);
        }

        return this;
    }

    /**
     * Get allValue
     * @return allValue
     */
    public Value getAllValue() {
        return allValue;
    }

    public void setAllValue(Value allValue) {
        this.allValue = allValue;
    }

    public Capacity withAllMaxValue(Value allMaxValue) {
        this.allMaxValue = allMaxValue;
        return this;
    }

    public Capacity withAllMaxValue(Consumer<Value> allMaxValueSetter) {
        if (this.allMaxValue == null) {
            this.allMaxValue = new Value();
            allMaxValueSetter.accept(this.allMaxValue);
        }

        return this;
    }

    /**
     * Get allMaxValue
     * @return allMaxValue
     */
    public Value getAllMaxValue() {
        return allMaxValue;
    }

    public void setAllMaxValue(Value allMaxValue) {
        this.allMaxValue = allMaxValue;
    }

    public Capacity withTimestamp(String timestamp) {
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

    public Capacity withWindow(String window) {
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
        Capacity that = (Capacity) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.maxValue, that.maxValue)
            && Objects.equals(this.allValue, that.allValue) && Objects.equals(this.allMaxValue, that.allMaxValue)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.window, that.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, maxValue, allValue, allMaxValue, timestamp, window);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Capacity {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    allValue: ").append(toIndentedString(allValue)).append("\n");
        sb.append("    allMaxValue: ").append(toIndentedString(allMaxValue)).append("\n");
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
