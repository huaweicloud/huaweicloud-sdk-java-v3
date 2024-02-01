package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 全域互联带宽绑定实例详细信息。
 */
public class AssociateGlobalConnectionBandwidthInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcbandwidths")

    private List<AssociateGlobalConnectionBandwidthInstanceRequestInfo> gcbandwidths = null;

    public AssociateGlobalConnectionBandwidthInstanceRequestBody withGcbandwidths(
        List<AssociateGlobalConnectionBandwidthInstanceRequestInfo> gcbandwidths) {
        this.gcbandwidths = gcbandwidths;
        return this;
    }

    public AssociateGlobalConnectionBandwidthInstanceRequestBody addGcbandwidthsItem(
        AssociateGlobalConnectionBandwidthInstanceRequestInfo gcbandwidthsItem) {
        if (this.gcbandwidths == null) {
            this.gcbandwidths = new ArrayList<>();
        }
        this.gcbandwidths.add(gcbandwidthsItem);
        return this;
    }

    public AssociateGlobalConnectionBandwidthInstanceRequestBody withGcbandwidths(
        Consumer<List<AssociateGlobalConnectionBandwidthInstanceRequestInfo>> gcbandwidthsSetter) {
        if (this.gcbandwidths == null) {
            this.gcbandwidths = new ArrayList<>();
        }
        gcbandwidthsSetter.accept(this.gcbandwidths);
        return this;
    }

    /**
     * 全域互联带宽绑定实例详细信息。
     * @return gcbandwidths
     */
    public List<AssociateGlobalConnectionBandwidthInstanceRequestInfo> getGcbandwidths() {
        return gcbandwidths;
    }

    public void setGcbandwidths(List<AssociateGlobalConnectionBandwidthInstanceRequestInfo> gcbandwidths) {
        this.gcbandwidths = gcbandwidths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateGlobalConnectionBandwidthInstanceRequestBody that =
            (AssociateGlobalConnectionBandwidthInstanceRequestBody) obj;
        return Objects.equals(this.gcbandwidths, that.gcbandwidths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gcbandwidths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateGlobalConnectionBandwidthInstanceRequestBody {\n");
        sb.append("    gcbandwidths: ").append(toIndentedString(gcbandwidths)).append("\n");
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
