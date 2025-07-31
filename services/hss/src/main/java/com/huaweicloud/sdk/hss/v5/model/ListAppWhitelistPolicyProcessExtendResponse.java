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
public class ListAppWhitelistPolicyProcessExtendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<AppWhitelistPolicyProcessExtendResponseInfo> dataList = null;

    public ListAppWhitelistPolicyProcessExtendResponse withDataList(
        List<AppWhitelistPolicyProcessExtendResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListAppWhitelistPolicyProcessExtendResponse addDataListItem(
        AppWhitelistPolicyProcessExtendResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListAppWhitelistPolicyProcessExtendResponse withDataList(
        Consumer<List<AppWhitelistPolicyProcessExtendResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * data list
     * @return dataList
     */
    public List<AppWhitelistPolicyProcessExtendResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<AppWhitelistPolicyProcessExtendResponseInfo> dataList) {
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
        ListAppWhitelistPolicyProcessExtendResponse that = (ListAppWhitelistPolicyProcessExtendResponse) obj;
        return Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppWhitelistPolicyProcessExtendResponse {\n");
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
