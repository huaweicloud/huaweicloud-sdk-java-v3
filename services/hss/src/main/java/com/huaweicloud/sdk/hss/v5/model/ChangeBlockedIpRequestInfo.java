package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 解除拦截的IP详情
 */
public class ChangeBlockedIpRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<BlockedIpRequestInfo> dataList = null;

    public ChangeBlockedIpRequestInfo withDataList(List<BlockedIpRequestInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ChangeBlockedIpRequestInfo addDataListItem(BlockedIpRequestInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ChangeBlockedIpRequestInfo withDataList(Consumer<List<BlockedIpRequestInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 需要解除拦截的IP列表
     * @return dataList
     */
    public List<BlockedIpRequestInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<BlockedIpRequestInfo> dataList) {
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
        ChangeBlockedIpRequestInfo that = (ChangeBlockedIpRequestInfo) obj;
        return Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeBlockedIpRequestInfo {\n");
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
