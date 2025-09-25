package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ShowRedistributionParametersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redistribution_parameters")

    private List<RedistributionParameterResult> redistributionParameters = null;

    public ShowRedistributionParametersResponse withRedistributionParameters(
        List<RedistributionParameterResult> redistributionParameters) {
        this.redistributionParameters = redistributionParameters;
        return this;
    }

    public ShowRedistributionParametersResponse addRedistributionParametersItem(
        RedistributionParameterResult redistributionParametersItem) {
        if (this.redistributionParameters == null) {
            this.redistributionParameters = new ArrayList<>();
        }
        this.redistributionParameters.add(redistributionParametersItem);
        return this;
    }

    public ShowRedistributionParametersResponse withRedistributionParameters(
        Consumer<List<RedistributionParameterResult>> redistributionParametersSetter) {
        if (this.redistributionParameters == null) {
            this.redistributionParameters = new ArrayList<>();
        }
        redistributionParametersSetter.accept(this.redistributionParameters);
        return this;
    }

    /**
     * **参数解释**: 参数列表信息。
     * @return redistributionParameters
     */
    public List<RedistributionParameterResult> getRedistributionParameters() {
        return redistributionParameters;
    }

    public void setRedistributionParameters(List<RedistributionParameterResult> redistributionParameters) {
        this.redistributionParameters = redistributionParameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRedistributionParametersResponse that = (ShowRedistributionParametersResponse) obj;
        return Objects.equals(this.redistributionParameters, that.redistributionParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redistributionParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRedistributionParametersResponse {\n");
        sb.append("    redistributionParameters: ").append(toIndentedString(redistributionParameters)).append("\n");
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
