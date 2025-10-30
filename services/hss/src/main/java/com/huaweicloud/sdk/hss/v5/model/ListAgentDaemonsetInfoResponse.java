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
public class ListAgentDaemonsetInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<ClusterInfoResponse> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradeful_num")

    private Integer upgradefulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_running_num")

    private Integer errRunningNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_access_num")

    private Integer errAccessNum;

    public ListAgentDaemonsetInfoResponse withDataList(List<ClusterInfoResponse> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListAgentDaemonsetInfoResponse addDataListItem(ClusterInfoResponse dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListAgentDaemonsetInfoResponse withDataList(Consumer<List<ClusterInfoResponse>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 数据列表 **取值范围**: 取值0-200 
     * @return dataList
     */
    public List<ClusterInfoResponse> getDataList() {
        return dataList;
    }

    public void setDataList(List<ClusterInfoResponse> dataList) {
        this.dataList = dataList;
    }

    public ListAgentDaemonsetInfoResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释** 已接入集群总数 **取值范围** 取值0-65535
     * minimum: 0
     * maximum: 65535
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListAgentDaemonsetInfoResponse withUpgradefulNum(Integer upgradefulNum) {
        this.upgradefulNum = upgradefulNum;
        return this;
    }

    /**
     * **参数解释** 待升级集群总数 **取值范围** 取值0-65535
     * minimum: 0
     * maximum: 65535
     * @return upgradefulNum
     */
    public Integer getUpgradefulNum() {
        return upgradefulNum;
    }

    public void setUpgradefulNum(Integer upgradefulNum) {
        this.upgradefulNum = upgradefulNum;
    }

    public ListAgentDaemonsetInfoResponse withErrRunningNum(Integer errRunningNum) {
        this.errRunningNum = errRunningNum;
        return this;
    }

    /**
     * **参数解释** 运行异常集群总数 **取值范围** 取值0-65535
     * minimum: 0
     * maximum: 65535
     * @return errRunningNum
     */
    public Integer getErrRunningNum() {
        return errRunningNum;
    }

    public void setErrRunningNum(Integer errRunningNum) {
        this.errRunningNum = errRunningNum;
    }

    public ListAgentDaemonsetInfoResponse withErrAccessNum(Integer errAccessNum) {
        this.errAccessNum = errAccessNum;
        return this;
    }

    /**
     * **参数解释** 接入异常集群总数 **取值范围** 取值0-65535
     * minimum: 0
     * maximum: 65535
     * @return errAccessNum
     */
    public Integer getErrAccessNum() {
        return errAccessNum;
    }

    public void setErrAccessNum(Integer errAccessNum) {
        this.errAccessNum = errAccessNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgentDaemonsetInfoResponse that = (ListAgentDaemonsetInfoResponse) obj;
        return Objects.equals(this.dataList, that.dataList) && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.upgradefulNum, that.upgradefulNum)
            && Objects.equals(this.errRunningNum, that.errRunningNum)
            && Objects.equals(this.errAccessNum, that.errAccessNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList, totalNum, upgradefulNum, errRunningNum, errAccessNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentDaemonsetInfoResponse {\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    upgradefulNum: ").append(toIndentedString(upgradefulNum)).append("\n");
        sb.append("    errRunningNum: ").append(toIndentedString(errRunningNum)).append("\n");
        sb.append("    errAccessNum: ").append(toIndentedString(errAccessNum)).append("\n");
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
