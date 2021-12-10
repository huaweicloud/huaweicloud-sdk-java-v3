package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class DeleteAccessConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<AccessConfigInfo> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public DeleteAccessConfigResponse withResult(List<AccessConfigInfo> result) {
        this.result = result;
        return this;
    }

    public DeleteAccessConfigResponse addResultItem(AccessConfigInfo resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public DeleteAccessConfigResponse withResult(Consumer<List<AccessConfigInfo>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /** 日志接入列表
     * 
     * @return result */
    public List<AccessConfigInfo> getResult() {
        return result;
    }

    public void setResult(List<AccessConfigInfo> result) {
        this.result = result;
    }

    public DeleteAccessConfigResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /** 日志接入总数 minimum: 0 maximum: 1000
     * 
     * @return total */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAccessConfigResponse deleteAccessConfigResponse = (DeleteAccessConfigResponse) o;
        return Objects.equals(this.result, deleteAccessConfigResponse.result)
            && Objects.equals(this.total, deleteAccessConfigResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAccessConfigResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
