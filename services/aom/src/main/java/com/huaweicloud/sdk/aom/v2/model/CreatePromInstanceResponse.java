package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePromInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prometheus")

    private List<PromInstanceEpsModel> prometheus = null;

    public CreatePromInstanceResponse withPrometheus(List<PromInstanceEpsModel> prometheus) {
        this.prometheus = prometheus;
        return this;
    }

    public CreatePromInstanceResponse addPrometheusItem(PromInstanceEpsModel prometheusItem) {
        if (this.prometheus == null) {
            this.prometheus = new ArrayList<>();
        }
        this.prometheus.add(prometheusItem);
        return this;
    }

    public CreatePromInstanceResponse withPrometheus(Consumer<List<PromInstanceEpsModel>> prometheusSetter) {
        if (this.prometheus == null) {
            this.prometheus = new ArrayList<>();
        }
        prometheusSetter.accept(this.prometheus);
        return this;
    }

    /**
     * Prometheus实例名称列表。
     * @return prometheus
     */
    public List<PromInstanceEpsModel> getPrometheus() {
        return prometheus;
    }

    public void setPrometheus(List<PromInstanceEpsModel> prometheus) {
        this.prometheus = prometheus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePromInstanceResponse that = (CreatePromInstanceResponse) obj;
        return Objects.equals(this.prometheus, that.prometheus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prometheus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePromInstanceResponse {\n");
        sb.append("    prometheus: ").append(toIndentedString(prometheus)).append("\n");
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
