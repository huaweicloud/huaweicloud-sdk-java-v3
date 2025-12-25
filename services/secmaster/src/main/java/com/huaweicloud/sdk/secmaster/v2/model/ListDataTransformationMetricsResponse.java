package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDataTransformationMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Object1Map status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private Object2Map usage;

    public ListDataTransformationMetricsResponse withStatus(Object1Map status) {
        this.status = status;
        return this;
    }

    public ListDataTransformationMetricsResponse withStatus(Consumer<Object1Map> statusSetter) {
        if (this.status == null) {
            this.status = new Object1Map();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public Object1Map getStatus() {
        return status;
    }

    public void setStatus(Object1Map status) {
        this.status = status;
    }

    public ListDataTransformationMetricsResponse withUsage(Object2Map usage) {
        this.usage = usage;
        return this;
    }

    public ListDataTransformationMetricsResponse withUsage(Consumer<Object2Map> usageSetter) {
        if (this.usage == null) {
            this.usage = new Object2Map();
            usageSetter.accept(this.usage);
        }

        return this;
    }

    /**
     * Get usage
     * @return usage
     */
    public Object2Map getUsage() {
        return usage;
    }

    public void setUsage(Object2Map usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataTransformationMetricsResponse that = (ListDataTransformationMetricsResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.usage, that.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataTransformationMetricsResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
