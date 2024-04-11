package com.huaweicloud.sdk.drs.v3.model;

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
public class ListContentCompareDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_result_infos")

    private List<NodeContentCompareDetailResult> contentCompareResultInfos = null;

    public ListContentCompareDetailResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 对比数量
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListContentCompareDetailResponse withContentCompareResultInfos(
        List<NodeContentCompareDetailResult> contentCompareResultInfos) {
        this.contentCompareResultInfos = contentCompareResultInfos;
        return this;
    }

    public ListContentCompareDetailResponse addContentCompareResultInfosItem(
        NodeContentCompareDetailResult contentCompareResultInfosItem) {
        if (this.contentCompareResultInfos == null) {
            this.contentCompareResultInfos = new ArrayList<>();
        }
        this.contentCompareResultInfos.add(contentCompareResultInfosItem);
        return this;
    }

    public ListContentCompareDetailResponse withContentCompareResultInfos(
        Consumer<List<NodeContentCompareDetailResult>> contentCompareResultInfosSetter) {
        if (this.contentCompareResultInfos == null) {
            this.contentCompareResultInfos = new ArrayList<>();
        }
        contentCompareResultInfosSetter.accept(this.contentCompareResultInfos);
        return this;
    }

    /**
     * 对比信息列表
     * @return contentCompareResultInfos
     */
    public List<NodeContentCompareDetailResult> getContentCompareResultInfos() {
        return contentCompareResultInfos;
    }

    public void setContentCompareResultInfos(List<NodeContentCompareDetailResult> contentCompareResultInfos) {
        this.contentCompareResultInfos = contentCompareResultInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListContentCompareDetailResponse that = (ListContentCompareDetailResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.contentCompareResultInfos, that.contentCompareResultInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, contentCompareResultInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListContentCompareDetailResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    contentCompareResultInfos: ").append(toIndentedString(contentCompareResultInfos)).append("\n");
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
