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
public class ListContainerNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<ContainerNodeInfo> dataList = null;

    public ListContainerNodesResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 容器节点总数
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListContainerNodesResponse withDataList(List<ContainerNodeInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListContainerNodesResponse addDataListItem(ContainerNodeInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListContainerNodesResponse withDataList(Consumer<List<ContainerNodeInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 容器节点列表
     * @return dataList
     */
    public List<ContainerNodeInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<ContainerNodeInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListContainerNodesResponse that = (ListContainerNodesResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListContainerNodesResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
