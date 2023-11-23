package com.huaweicloud.sdk.dataartsinsight.v1.model;

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
public class ListAuthedResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_data")

    private List<CooperateAuthorizationRuleVO> pageData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAuthedResponse withPageData(List<CooperateAuthorizationRuleVO> pageData) {
        this.pageData = pageData;
        return this;
    }

    public ListAuthedResponse addPageDataItem(CooperateAuthorizationRuleVO pageDataItem) {
        if (this.pageData == null) {
            this.pageData = new ArrayList<>();
        }
        this.pageData.add(pageDataItem);
        return this;
    }

    public ListAuthedResponse withPageData(Consumer<List<CooperateAuthorizationRuleVO>> pageDataSetter) {
        if (this.pageData == null) {
            this.pageData = new ArrayList<>();
        }
        pageDataSetter.accept(this.pageData);
        return this;
    }

    /**
     * 分页列表内容。
     * @return pageData
     */
    public List<CooperateAuthorizationRuleVO> getPageData() {
        return pageData;
    }

    public void setPageData(List<CooperateAuthorizationRuleVO> pageData) {
        this.pageData = pageData;
    }

    public ListAuthedResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总条数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthedResponse that = (ListAuthedResponse) obj;
        return Objects.equals(this.pageData, that.pageData) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageData, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthedResponse {\n");
        sb.append("    pageData: ").append(toIndentedString(pageData)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
