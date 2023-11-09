package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListInstanceConfigurationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private ParameterConfigurationInfo configurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_values")

    private List<ParameterValuesInfo> parameterValues = null;

    public ListInstanceConfigurationsResponse withConfigurations(ParameterConfigurationInfo configurations) {
        this.configurations = configurations;
        return this;
    }

    public ListInstanceConfigurationsResponse withConfigurations(
        Consumer<ParameterConfigurationInfo> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ParameterConfigurationInfo();
            configurationsSetter.accept(this.configurations);
        }

        return this;
    }

    /**
     * Get configurations
     * @return configurations
     */
    public ParameterConfigurationInfo getConfigurations() {
        return configurations;
    }

    public void setConfigurations(ParameterConfigurationInfo configurations) {
        this.configurations = configurations;
    }

    public ListInstanceConfigurationsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 参数信息的总数。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListInstanceConfigurationsResponse withParameterValues(List<ParameterValuesInfo> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    public ListInstanceConfigurationsResponse addParameterValuesItem(ParameterValuesInfo parameterValuesItem) {
        if (this.parameterValues == null) {
            this.parameterValues = new ArrayList<>();
        }
        this.parameterValues.add(parameterValuesItem);
        return this;
    }

    public ListInstanceConfigurationsResponse withParameterValues(
        Consumer<List<ParameterValuesInfo>> parameterValuesSetter) {
        if (this.parameterValues == null) {
            this.parameterValues = new ArrayList<>();
        }
        parameterValuesSetter.accept(this.parameterValues);
        return this;
    }

    /**
     * 参数对象。
     * @return parameterValues
     */
    public List<ParameterValuesInfo> getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(List<ParameterValuesInfo> parameterValues) {
        this.parameterValues = parameterValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceConfigurationsResponse that = (ListInstanceConfigurationsResponse) obj;
        return Objects.equals(this.configurations, that.configurations)
            && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.parameterValues, that.parameterValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations, totalCount, parameterValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceConfigurationsResponse {\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
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
