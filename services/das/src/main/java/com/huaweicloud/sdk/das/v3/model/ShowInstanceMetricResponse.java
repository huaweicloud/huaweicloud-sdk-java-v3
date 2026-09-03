package com.huaweicloud.sdk.das.v3.model;

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
public class ShowInstanceMetricResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "das_metric_infos")

    private List<DasMetricInfo> dasMetricInfos = null;

    public ShowInstanceMetricResponse withDasMetricInfos(List<DasMetricInfo> dasMetricInfos) {
        this.dasMetricInfos = dasMetricInfos;
        return this;
    }

    public ShowInstanceMetricResponse addDasMetricInfosItem(DasMetricInfo dasMetricInfosItem) {
        if (this.dasMetricInfos == null) {
            this.dasMetricInfos = new ArrayList<>();
        }
        this.dasMetricInfos.add(dasMetricInfosItem);
        return this;
    }

    public ShowInstanceMetricResponse withDasMetricInfos(Consumer<List<DasMetricInfo>> dasMetricInfosSetter) {
        if (this.dasMetricInfos == null) {
            this.dasMetricInfos = new ArrayList<>();
        }
        dasMetricInfosSetter.accept(this.dasMetricInfos);
        return this;
    }

    /**
     * 实例指标信息列表
     * @return dasMetricInfos
     */
    public List<DasMetricInfo> getDasMetricInfos() {
        return dasMetricInfos;
    }

    public void setDasMetricInfos(List<DasMetricInfo> dasMetricInfos) {
        this.dasMetricInfos = dasMetricInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceMetricResponse that = (ShowInstanceMetricResponse) obj;
        return Objects.equals(this.dasMetricInfos, that.dasMetricInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dasMetricInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceMetricResponse {\n");
        sb.append("    dasMetricInfos: ").append(toIndentedString(dasMetricInfos)).append("\n");
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
