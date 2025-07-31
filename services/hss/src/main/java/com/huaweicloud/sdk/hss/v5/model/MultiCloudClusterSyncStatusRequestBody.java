package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 多云集群的同步接入状态请求
 */
public class MultiCloudClusterSyncStatusRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<MultiCloudClusterIdInfo> dataList = null;

    public MultiCloudClusterSyncStatusRequestBody withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 集群总数
     * minimum: 0
     * maximum: 32
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public MultiCloudClusterSyncStatusRequestBody withDataList(List<MultiCloudClusterIdInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public MultiCloudClusterSyncStatusRequestBody addDataListItem(MultiCloudClusterIdInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public MultiCloudClusterSyncStatusRequestBody withDataList(Consumer<List<MultiCloudClusterIdInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 多云集群的集群id列表
     * @return dataList
     */
    public List<MultiCloudClusterIdInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<MultiCloudClusterIdInfo> dataList) {
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
        MultiCloudClusterSyncStatusRequestBody that = (MultiCloudClusterSyncStatusRequestBody) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiCloudClusterSyncStatusRequestBody {\n");
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
