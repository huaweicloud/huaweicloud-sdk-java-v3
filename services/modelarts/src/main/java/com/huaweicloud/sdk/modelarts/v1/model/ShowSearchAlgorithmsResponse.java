package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ShowSearchAlgorithmsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_algo_count")

    private Integer searchAlgoCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_algo_list")

    private List<ListSearchAlgorithmsSearchAlgoList> searchAlgoList = null;

    public ShowSearchAlgorithmsResponse withSearchAlgoCount(Integer searchAlgoCount) {
        this.searchAlgoCount = searchAlgoCount;
        return this;
    }

    /**
     * 超参搜索算法的个数。
     * @return searchAlgoCount
     */
    public Integer getSearchAlgoCount() {
        return searchAlgoCount;
    }

    public void setSearchAlgoCount(Integer searchAlgoCount) {
        this.searchAlgoCount = searchAlgoCount;
    }

    public ShowSearchAlgorithmsResponse withSearchAlgoList(List<ListSearchAlgorithmsSearchAlgoList> searchAlgoList) {
        this.searchAlgoList = searchAlgoList;
        return this;
    }

    public ShowSearchAlgorithmsResponse addSearchAlgoListItem(ListSearchAlgorithmsSearchAlgoList searchAlgoListItem) {
        if (this.searchAlgoList == null) {
            this.searchAlgoList = new ArrayList<>();
        }
        this.searchAlgoList.add(searchAlgoListItem);
        return this;
    }

    public ShowSearchAlgorithmsResponse withSearchAlgoList(
        Consumer<List<ListSearchAlgorithmsSearchAlgoList>> searchAlgoListSetter) {
        if (this.searchAlgoList == null) {
            this.searchAlgoList = new ArrayList<>();
        }
        searchAlgoListSetter.accept(this.searchAlgoList);
        return this;
    }

    /**
     * 所有超参搜索算法的列表。
     * @return searchAlgoList
     */
    public List<ListSearchAlgorithmsSearchAlgoList> getSearchAlgoList() {
        return searchAlgoList;
    }

    public void setSearchAlgoList(List<ListSearchAlgorithmsSearchAlgoList> searchAlgoList) {
        this.searchAlgoList = searchAlgoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSearchAlgorithmsResponse that = (ShowSearchAlgorithmsResponse) obj;
        return Objects.equals(this.searchAlgoCount, that.searchAlgoCount)
            && Objects.equals(this.searchAlgoList, that.searchAlgoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchAlgoCount, searchAlgoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSearchAlgorithmsResponse {\n");
        sb.append("    searchAlgoCount: ").append(toIndentedString(searchAlgoCount)).append("\n");
        sb.append("    searchAlgoList: ").append(toIndentedString(searchAlgoList)).append("\n");
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
