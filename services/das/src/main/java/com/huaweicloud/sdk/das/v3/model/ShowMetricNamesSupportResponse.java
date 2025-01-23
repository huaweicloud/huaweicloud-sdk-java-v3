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
public class ShowMetricNamesSupportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_metric_names")

    private List<SupportMetricNameListSupportMetricNames> supportMetricNames = null;

    public ShowMetricNamesSupportResponse withSupportMetricNames(
        List<SupportMetricNameListSupportMetricNames> supportMetricNames) {
        this.supportMetricNames = supportMetricNames;
        return this;
    }

    public ShowMetricNamesSupportResponse addSupportMetricNamesItem(
        SupportMetricNameListSupportMetricNames supportMetricNamesItem) {
        if (this.supportMetricNames == null) {
            this.supportMetricNames = new ArrayList<>();
        }
        this.supportMetricNames.add(supportMetricNamesItem);
        return this;
    }

    public ShowMetricNamesSupportResponse withSupportMetricNames(
        Consumer<List<SupportMetricNameListSupportMetricNames>> supportMetricNamesSetter) {
        if (this.supportMetricNames == null) {
            this.supportMetricNames = new ArrayList<>();
        }
        supportMetricNamesSetter.accept(this.supportMetricNames);
        return this;
    }

    /**
     * 支持指标名称列表
     * @return supportMetricNames
     */
    public List<SupportMetricNameListSupportMetricNames> getSupportMetricNames() {
        return supportMetricNames;
    }

    public void setSupportMetricNames(List<SupportMetricNameListSupportMetricNames> supportMetricNames) {
        this.supportMetricNames = supportMetricNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMetricNamesSupportResponse that = (ShowMetricNamesSupportResponse) obj;
        return Objects.equals(this.supportMetricNames, that.supportMetricNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportMetricNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetricNamesSupportResponse {\n");
        sb.append("    supportMetricNames: ").append(toIndentedString(supportMetricNames)).append("\n");
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
