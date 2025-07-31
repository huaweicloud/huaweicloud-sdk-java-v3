package com.huaweicloud.sdk.hss.v5.model;

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
public class ListBaselineWhiteListsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<BaselineWhiteListsResponseInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<String> tagList = null;

    public ListBaselineWhiteListsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 基线白名单总数
     * minimum: 0
     * maximum: 2147483547
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListBaselineWhiteListsResponse withDataList(List<BaselineWhiteListsResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListBaselineWhiteListsResponse addDataListItem(BaselineWhiteListsResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListBaselineWhiteListsResponse withDataList(Consumer<List<BaselineWhiteListsResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 基线白名单列表
     * @return dataList
     */
    public List<BaselineWhiteListsResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<BaselineWhiteListsResponseInfo> dataList) {
        this.dataList = dataList;
    }

    public ListBaselineWhiteListsResponse withTagList(List<String> tagList) {
        this.tagList = tagList;
        return this;
    }

    public ListBaselineWhiteListsResponse addTagListItem(String tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public ListBaselineWhiteListsResponse withTagList(Consumer<List<String>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /**
     * 基线检查中检查项的检查类型列表
     * @return tagList
     */
    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBaselineWhiteListsResponse that = (ListBaselineWhiteListsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.dataList, that.dataList)
            && Objects.equals(this.tagList, that.tagList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, dataList, tagList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBaselineWhiteListsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
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
