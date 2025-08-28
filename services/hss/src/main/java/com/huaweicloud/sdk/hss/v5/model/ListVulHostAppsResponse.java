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
public class ListVulHostAppsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<VulHostAppsResponseInfoDataList> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ListVulHostAppsResponse withDataList(List<VulHostAppsResponseInfoDataList> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListVulHostAppsResponse addDataListItem(VulHostAppsResponseInfoDataList dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListVulHostAppsResponse withDataList(Consumer<List<VulHostAppsResponseInfoDataList>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 软件信息列表 **取值范围**: 不涉及 
     * @return dataList
     */
    public List<VulHostAppsResponseInfoDataList> getDataList() {
        return dataList;
    }

    public void setDataList(List<VulHostAppsResponseInfoDataList> dataList) {
        this.dataList = dataList;
    }

    public ListVulHostAppsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 取值0-2147483647 
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVulHostAppsResponse that = (ListVulHostAppsResponse) obj;
        return Objects.equals(this.dataList, that.dataList) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVulHostAppsResponse {\n");
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
