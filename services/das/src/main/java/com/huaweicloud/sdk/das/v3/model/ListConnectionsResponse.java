package com.huaweicloud.sdk.das.v3.model;

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
public class ListConnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_record")

    private Integer totalRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "das_conn_info_list")

    private List<ApiListConnectionsInfoRespDasConnInfoList> dasConnInfoList = null;

    public ListConnectionsResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    /**
     * 总记录数目
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public ListConnectionsResponse withDasConnInfoList(
        List<ApiListConnectionsInfoRespDasConnInfoList> dasConnInfoList) {
        this.dasConnInfoList = dasConnInfoList;
        return this;
    }

    public ListConnectionsResponse addDasConnInfoListItem(
        ApiListConnectionsInfoRespDasConnInfoList dasConnInfoListItem) {
        if (this.dasConnInfoList == null) {
            this.dasConnInfoList = new ArrayList<>();
        }
        this.dasConnInfoList.add(dasConnInfoListItem);
        return this;
    }

    public ListConnectionsResponse withDasConnInfoList(
        Consumer<List<ApiListConnectionsInfoRespDasConnInfoList>> dasConnInfoListSetter) {
        if (this.dasConnInfoList == null) {
            this.dasConnInfoList = new ArrayList<>();
        }
        dasConnInfoListSetter.accept(this.dasConnInfoList);
        return this;
    }

    /**
     * 连接信息列表
     * @return dasConnInfoList
     */
    public List<ApiListConnectionsInfoRespDasConnInfoList> getDasConnInfoList() {
        return dasConnInfoList;
    }

    public void setDasConnInfoList(List<ApiListConnectionsInfoRespDasConnInfoList> dasConnInfoList) {
        this.dasConnInfoList = dasConnInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionsResponse that = (ListConnectionsResponse) obj;
        return Objects.equals(this.totalRecord, that.totalRecord)
            && Objects.equals(this.dasConnInfoList, that.dasConnInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRecord, dasConnInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionsResponse {\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    dasConnInfoList: ").append(toIndentedString(dasConnInfoList)).append("\n");
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
