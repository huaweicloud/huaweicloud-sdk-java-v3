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
public class ShowExpansionParametersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expansion_parameters")

    private List<ExpansionParameterResult> expansionParameters = null;

    public ShowExpansionParametersResponse withExpansionParameters(List<ExpansionParameterResult> expansionParameters) {
        this.expansionParameters = expansionParameters;
        return this;
    }

    public ShowExpansionParametersResponse addExpansionParametersItem(
        ExpansionParameterResult expansionParametersItem) {
        if (this.expansionParameters == null) {
            this.expansionParameters = new ArrayList<>();
        }
        this.expansionParameters.add(expansionParametersItem);
        return this;
    }

    public ShowExpansionParametersResponse withExpansionParameters(
        Consumer<List<ExpansionParameterResult>> expansionParametersSetter) {
        if (this.expansionParameters == null) {
            this.expansionParameters = new ArrayList<>();
        }
        expansionParametersSetter.accept(this.expansionParameters);
        return this;
    }

    /**
     * **参数解释**: 参数信息。
     * @return expansionParameters
     */
    public List<ExpansionParameterResult> getExpansionParameters() {
        return expansionParameters;
    }

    public void setExpansionParameters(List<ExpansionParameterResult> expansionParameters) {
        this.expansionParameters = expansionParameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExpansionParametersResponse that = (ShowExpansionParametersResponse) obj;
        return Objects.equals(this.expansionParameters, that.expansionParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expansionParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExpansionParametersResponse {\n");
        sb.append("    expansionParameters: ").append(toIndentedString(expansionParameters)).append("\n");
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
