package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量解绑全域公网带宽请求体对象
 */
public class BatchDetachInternetBandwidthsGlobalEipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eips")

    private List<Object> globalEips = null;

    public BatchDetachInternetBandwidthsGlobalEipRequestBody withGlobalEips(List<Object> globalEips) {
        this.globalEips = globalEips;
        return this;
    }

    public BatchDetachInternetBandwidthsGlobalEipRequestBody addGlobalEipsItem(Object globalEipsItem) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        this.globalEips.add(globalEipsItem);
        return this;
    }

    public BatchDetachInternetBandwidthsGlobalEipRequestBody withGlobalEips(Consumer<List<Object>> globalEipsSetter) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        globalEipsSetter.accept(this.globalEips);
        return this;
    }

    /**
     * 批量解绑全域公网带宽请求体对象
     * @return globalEips
     */
    public List<Object> getGlobalEips() {
        return globalEips;
    }

    public void setGlobalEips(List<Object> globalEips) {
        this.globalEips = globalEips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDetachInternetBandwidthsGlobalEipRequestBody that =
            (BatchDetachInternetBandwidthsGlobalEipRequestBody) obj;
        return Objects.equals(this.globalEips, that.globalEips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDetachInternetBandwidthsGlobalEipRequestBody {\n");
        sb.append("    globalEips: ").append(toIndentedString(globalEips)).append("\n");
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
