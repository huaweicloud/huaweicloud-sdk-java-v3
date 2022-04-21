package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量启动边缘实例请求体。
 */
public class BatchStartInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-start")

    private BatchStart osStart;

    public BatchStartInstanceRequestBody withOsStart(BatchStart osStart) {
        this.osStart = osStart;
        return this;
    }

    public BatchStartInstanceRequestBody withOsStart(Consumer<BatchStart> osStartSetter) {
        if (this.osStart == null) {
            this.osStart = new BatchStart();
            osStartSetter.accept(this.osStart);
        }

        return this;
    }

    /**
     * Get osStart
     * @return osStart
     */
    public BatchStart getOsStart() {
        return osStart;
    }

    public void setOsStart(BatchStart osStart) {
        this.osStart = osStart;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchStartInstanceRequestBody batchStartInstanceRequestBody = (BatchStartInstanceRequestBody) o;
        return Objects.equals(this.osStart, batchStartInstanceRequestBody.osStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osStart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStartInstanceRequestBody {\n");
        sb.append("    osStart: ").append(toIndentedString(osStart)).append("\n");
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
