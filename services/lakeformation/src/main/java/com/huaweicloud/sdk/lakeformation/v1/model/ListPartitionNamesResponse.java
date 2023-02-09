package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListPartitionNamesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_name_list")

    private List<String> partitionNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PagedInfo pageInfo;

    public ListPartitionNamesResponse withPartitionNameList(List<String> partitionNameList) {
        this.partitionNameList = partitionNameList;
        return this;
    }

    public ListPartitionNamesResponse addPartitionNameListItem(String partitionNameListItem) {
        if (this.partitionNameList == null) {
            this.partitionNameList = new ArrayList<>();
        }
        this.partitionNameList.add(partitionNameListItem);
        return this;
    }

    public ListPartitionNamesResponse withPartitionNameList(Consumer<List<String>> partitionNameListSetter) {
        if (this.partitionNameList == null) {
            this.partitionNameList = new ArrayList<>();
        }
        partitionNameListSetter.accept(this.partitionNameList);
        return this;
    }

    /**
     * 分区名字列表
     * @return partitionNameList
     */
    public List<String> getPartitionNameList() {
        return partitionNameList;
    }

    public void setPartitionNameList(List<String> partitionNameList) {
        this.partitionNameList = partitionNameList;
    }

    public ListPartitionNamesResponse withPageInfo(PagedInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPartitionNamesResponse withPageInfo(Consumer<PagedInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PagedInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PagedInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PagedInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPartitionNamesResponse listPartitionNamesResponse = (ListPartitionNamesResponse) o;
        return Objects.equals(this.partitionNameList, listPartitionNamesResponse.partitionNameList)
            && Objects.equals(this.pageInfo, listPartitionNamesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionNameList, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPartitionNamesResponse {\n");
        sb.append("    partitionNameList: ").append(toIndentedString(partitionNameList)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
