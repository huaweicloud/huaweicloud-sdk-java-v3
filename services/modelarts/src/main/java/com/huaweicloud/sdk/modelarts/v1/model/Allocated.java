package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源已分配量。
 */
public class Allocated {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Value value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private String timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "window")

    private String window;

    public Allocated withValue(Value value) {
        this.value = value;
        return this;
    }

    public Allocated withValue(Consumer<Value> valueSetter) {
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

    public Allocated withTimestamp(String timestamp) {
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

    public Allocated withWindow(String window) {
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
        Allocated that = (Allocated) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.window, that.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, timestamp, window);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Allocated {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
