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
public class ListFileHostEventDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_total_num")

    private Integer changeTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_file_num")

    private Integer changeFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_registry_num")

    private Integer changeRegistryNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<FileHostEventDetailResponseInfo> dataList = null;

    public ListFileHostEventDetailsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 文件总条数
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

    public ListFileHostEventDetailsResponse withChangeTotalNum(Integer changeTotalNum) {
        this.changeTotalNum = changeTotalNum;
        return this;
    }

    /**
     * 变更总数
     * minimum: 0
     * maximum: 2147483647
     * @return changeTotalNum
     */
    public Integer getChangeTotalNum() {
        return changeTotalNum;
    }

    public void setChangeTotalNum(Integer changeTotalNum) {
        this.changeTotalNum = changeTotalNum;
    }

    public ListFileHostEventDetailsResponse withChangeFileNum(Integer changeFileNum) {
        this.changeFileNum = changeFileNum;
        return this;
    }

    /**
     * 变更文件数量
     * minimum: 0
     * maximum: 2147483647
     * @return changeFileNum
     */
    public Integer getChangeFileNum() {
        return changeFileNum;
    }

    public void setChangeFileNum(Integer changeFileNum) {
        this.changeFileNum = changeFileNum;
    }

    public ListFileHostEventDetailsResponse withChangeRegistryNum(Integer changeRegistryNum) {
        this.changeRegistryNum = changeRegistryNum;
        return this;
    }

    /**
     * 变更注册表数量
     * minimum: 0
     * maximum: 2147483647
     * @return changeRegistryNum
     */
    public Integer getChangeRegistryNum() {
        return changeRegistryNum;
    }

    public void setChangeRegistryNum(Integer changeRegistryNum) {
        this.changeRegistryNum = changeRegistryNum;
    }

    public ListFileHostEventDetailsResponse withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListFileHostEventDetailsResponse withDataList(List<FileHostEventDetailResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListFileHostEventDetailsResponse addDataListItem(FileHostEventDetailResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListFileHostEventDetailsResponse withDataList(
        Consumer<List<FileHostEventDetailResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 变更文件信息列表
     * @return dataList
     */
    public List<FileHostEventDetailResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<FileHostEventDetailResponseInfo> dataList) {
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
        ListFileHostEventDetailsResponse that = (ListFileHostEventDetailsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.changeTotalNum, that.changeTotalNum)
            && Objects.equals(this.changeFileNum, that.changeFileNum)
            && Objects.equals(this.changeRegistryNum, that.changeRegistryNum)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, changeTotalNum, changeFileNum, changeRegistryNum, hostName, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFileHostEventDetailsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    changeTotalNum: ").append(toIndentedString(changeTotalNum)).append("\n");
        sb.append("    changeFileNum: ").append(toIndentedString(changeFileNum)).append("\n");
        sb.append("    changeRegistryNum: ").append(toIndentedString(changeRegistryNum)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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
