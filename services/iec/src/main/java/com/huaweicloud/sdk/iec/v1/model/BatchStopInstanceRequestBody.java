package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量关闭边缘实例请求体。
 */
public class BatchStopInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-stop")

    private BatchStop osStop;

    public BatchStopInstanceRequestBody withOsStop(BatchStop osStop) {
        this.osStop = osStop;
        return this;
    }

    public BatchStopInstanceRequestBody withOsStop(Consumer<BatchStop> osStopSetter) {
        if (this.osStop == null) {
            this.osStop = new BatchStop();
            osStopSetter.accept(this.osStop);
        }

        return this;
    }

    /**
     * Get osStop
     * @return osStop
     */
    public BatchStop getOsStop() {
        return osStop;
    }

    public void setOsStop(BatchStop osStop) {
        this.osStop = osStop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchStopInstanceRequestBody that = (BatchStopInstanceRequestBody) obj;
        return Objects.equals(this.osStop, that.osStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osStop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStopInstanceRequestBody {\n");
        sb.append("    osStop: ").append(toIndentedString(osStop)).append("\n");
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
