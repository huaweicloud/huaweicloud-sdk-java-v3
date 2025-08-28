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
public class ListRegistryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<RegistryInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ListRegistryResponse withDataList(List<RegistryInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListRegistryResponse addDataListItem(RegistryInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListRegistryResponse withDataList(Consumer<List<RegistryInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 镜像仓列表 **取值范围**: 列表项数量0-100 
     * @return dataList
     */
    public List<RegistryInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<RegistryInfo> dataList) {
        this.dataList = dataList;
    }

    public ListRegistryResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 0-100 
     * minimum: 0
     * maximum: 100
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
        ListRegistryResponse that = (ListRegistryResponse) obj;
        return Objects.equals(this.dataList, that.dataList) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRegistryResponse {\n");
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
