package com.huaweicloud.sdk.osm.v2.model;

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
public class ListDiagnoseResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<DiagnoseResourceVo> result = null;

    public ListDiagnoseResourcesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 65535
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListDiagnoseResourcesResponse withResult(List<DiagnoseResourceVo> result) {
        this.result = result;
        return this;
    }

    public ListDiagnoseResourcesResponse addResultItem(DiagnoseResourceVo resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ListDiagnoseResourcesResponse withResult(Consumer<List<DiagnoseResourceVo>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 诊断记录列表
     * @return result
     */
    public List<DiagnoseResourceVo> getResult() {
        return result;
    }

    public void setResult(List<DiagnoseResourceVo> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDiagnoseResourcesResponse listDiagnoseResourcesResponse = (ListDiagnoseResourcesResponse) o;
        return Objects.equals(this.totalCount, listDiagnoseResourcesResponse.totalCount)
            && Objects.equals(this.result, listDiagnoseResourcesResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDiagnoseResourcesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
