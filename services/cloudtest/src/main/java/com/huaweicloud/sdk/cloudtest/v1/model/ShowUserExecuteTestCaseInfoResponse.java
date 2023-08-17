package com.huaweicloud.sdk.cloudtest.v1.model;

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
public class ShowUserExecuteTestCaseInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<ExternalUserExecuteInfo> values = null;

    public ShowUserExecuteTestCaseInfoResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 起始记录数大于实际总条数时，值为0。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowUserExecuteTestCaseInfoResponse withValues(List<ExternalUserExecuteInfo> values) {
        this.values = values;
        return this;
    }

    public ShowUserExecuteTestCaseInfoResponse addValuesItem(ExternalUserExecuteInfo valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ShowUserExecuteTestCaseInfoResponse withValues(Consumer<List<ExternalUserExecuteInfo>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 时段内用例的执行情况
     * @return values
     */
    public List<ExternalUserExecuteInfo> getValues() {
        return values;
    }

    public void setValues(List<ExternalUserExecuteInfo> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserExecuteTestCaseInfoResponse that = (ShowUserExecuteTestCaseInfoResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserExecuteTestCaseInfoResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
