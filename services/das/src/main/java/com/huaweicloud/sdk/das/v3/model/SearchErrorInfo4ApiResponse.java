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
public class SearchErrorInfo4ApiResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_trans_infos")

    private List<ErrorTransInfo> errorTransInfos = null;

    public SearchErrorInfo4ApiResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public SearchErrorInfo4ApiResponse withErrorTransInfos(List<ErrorTransInfo> errorTransInfos) {
        this.errorTransInfos = errorTransInfos;
        return this;
    }

    public SearchErrorInfo4ApiResponse addErrorTransInfosItem(ErrorTransInfo errorTransInfosItem) {
        if (this.errorTransInfos == null) {
            this.errorTransInfos = new ArrayList<>();
        }
        this.errorTransInfos.add(errorTransInfosItem);
        return this;
    }

    public SearchErrorInfo4ApiResponse withErrorTransInfos(Consumer<List<ErrorTransInfo>> errorTransInfosSetter) {
        if (this.errorTransInfos == null) {
            this.errorTransInfos = new ArrayList<>();
        }
        errorTransInfosSetter.accept(this.errorTransInfos);
        return this;
    }

    /**
     * binlog解析错误信息列表
     * @return errorTransInfos
     */
    public List<ErrorTransInfo> getErrorTransInfos() {
        return errorTransInfos;
    }

    public void setErrorTransInfos(List<ErrorTransInfo> errorTransInfos) {
        this.errorTransInfos = errorTransInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchErrorInfo4ApiResponse that = (SearchErrorInfo4ApiResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.errorTransInfos, that.errorTransInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, errorTransInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchErrorInfo4ApiResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    errorTransInfos: ").append(toIndentedString(errorTransInfos)).append("\n");
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
