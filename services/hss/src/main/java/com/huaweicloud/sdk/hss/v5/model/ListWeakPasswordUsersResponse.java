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
public class ListWeakPasswordUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<WeakPwdListInfoResponseInfo> dataList = null;

    public ListWeakPasswordUsersResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 弱口令总数 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public ListWeakPasswordUsersResponse withDataList(List<WeakPwdListInfoResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListWeakPasswordUsersResponse addDataListItem(WeakPwdListInfoResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListWeakPasswordUsersResponse withDataList(Consumer<List<WeakPwdListInfoResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 弱口令列表 **取值范围**: 不涉及 
     * @return dataList
     */
    public List<WeakPwdListInfoResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<WeakPwdListInfoResponseInfo> dataList) {
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
        ListWeakPasswordUsersResponse that = (ListWeakPasswordUsersResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWeakPasswordUsersResponse {\n");
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
