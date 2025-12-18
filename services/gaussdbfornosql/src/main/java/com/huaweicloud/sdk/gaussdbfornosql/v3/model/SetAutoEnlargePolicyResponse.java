package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class SetAutoEnlargePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_results")

    private List<SetAutoPolicyErrorResults> errorResults = null;

    public SetAutoEnlargePolicyResponse withErrorResults(List<SetAutoPolicyErrorResults> errorResults) {
        this.errorResults = errorResults;
        return this;
    }

    public SetAutoEnlargePolicyResponse addErrorResultsItem(SetAutoPolicyErrorResults errorResultsItem) {
        if (this.errorResults == null) {
            this.errorResults = new ArrayList<>();
        }
        this.errorResults.add(errorResultsItem);
        return this;
    }

    public SetAutoEnlargePolicyResponse withErrorResults(Consumer<List<SetAutoPolicyErrorResults>> errorResultsSetter) {
        if (this.errorResults == null) {
            this.errorResults = new ArrayList<>();
        }
        errorResultsSetter.accept(this.errorResults);
        return this;
    }

    /**
     * **参数解释：** 设置磁盘自动扩容策略失败的实例信息列表。 **取值范围：** 不涉及
     * @return errorResults
     */
    public List<SetAutoPolicyErrorResults> getErrorResults() {
        return errorResults;
    }

    public void setErrorResults(List<SetAutoPolicyErrorResults> errorResults) {
        this.errorResults = errorResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAutoEnlargePolicyResponse that = (SetAutoEnlargePolicyResponse) obj;
        return Objects.equals(this.errorResults, that.errorResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAutoEnlargePolicyResponse {\n");
        sb.append("    errorResults: ").append(toIndentedString(errorResults)).append("\n");
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
