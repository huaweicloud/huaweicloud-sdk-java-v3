package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOpsEvaluatorFilterOptionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_options")

    private ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions filterOptions;

    public ListOpsEvaluatorFilterOptionsResponse withFilterOptions(
        ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions filterOptions) {
        this.filterOptions = filterOptions;
        return this;
    }

    public ListOpsEvaluatorFilterOptionsResponse withFilterOptions(
        Consumer<ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions> filterOptionsSetter) {
        if (this.filterOptions == null) {
            this.filterOptions = new ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions();
            filterOptionsSetter.accept(this.filterOptions);
        }

        return this;
    }

    /**
     * Get filterOptions
     * @return filterOptions
     */
    public ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions getFilterOptions() {
        return filterOptions;
    }

    public void setFilterOptions(ListOpsEvaluatorFilterOptionsResponseBodyFilterOptions filterOptions) {
        this.filterOptions = filterOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorFilterOptionsResponse that = (ListOpsEvaluatorFilterOptionsResponse) obj;
        return Objects.equals(this.filterOptions, that.filterOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorFilterOptionsResponse {\n");
        sb.append("    filterOptions: ").append(toIndentedString(filterOptions)).append("\n");
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
