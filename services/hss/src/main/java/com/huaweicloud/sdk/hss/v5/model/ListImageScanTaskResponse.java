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
public class ListImageScanTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<ImageScanTaskInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ListImageScanTaskResponse withDataList(List<ImageScanTaskInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListImageScanTaskResponse addDataListItem(ImageScanTaskInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListImageScanTaskResponse withDataList(Consumer<List<ImageScanTaskInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: task任务列表 **取值范围**: 最小值0，最大值1000 
     * @return dataList
     */
    public List<ImageScanTaskInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<ImageScanTaskInfo> dataList) {
        this.dataList = dataList;
    }

    public ListImageScanTaskResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 任务总数 **取值范围**: 最小值0，最大值1000 
     * minimum: 0
     * maximum: 1000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageScanTaskResponse that = (ListImageScanTaskResponse) obj;
        return Objects.equals(this.dataList, that.dataList) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageScanTaskResponse {\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
