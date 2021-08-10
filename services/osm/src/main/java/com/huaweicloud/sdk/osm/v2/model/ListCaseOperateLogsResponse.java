package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListCaseOperateLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_operate_log_list")

    private List<IncidentOperateLogV2> incidentOperateLogList = null;

    public ListCaseOperateLogsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 总数 minimum: 0 maximum: 65535
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListCaseOperateLogsResponse withIncidentOperateLogList(List<IncidentOperateLogV2> incidentOperateLogList) {
        this.incidentOperateLogList = incidentOperateLogList;
        return this;
    }

    public ListCaseOperateLogsResponse addIncidentOperateLogListItem(IncidentOperateLogV2 incidentOperateLogListItem) {
        if (this.incidentOperateLogList == null) {
            this.incidentOperateLogList = new ArrayList<>();
        }
        this.incidentOperateLogList.add(incidentOperateLogListItem);
        return this;
    }

    public ListCaseOperateLogsResponse withIncidentOperateLogList(
        Consumer<List<IncidentOperateLogV2>> incidentOperateLogListSetter) {
        if (this.incidentOperateLogList == null) {
            this.incidentOperateLogList = new ArrayList<>();
        }
        incidentOperateLogListSetter.accept(this.incidentOperateLogList);
        return this;
    }

    /** 工单操作日志列表
     * 
     * @return incidentOperateLogList */
    public List<IncidentOperateLogV2> getIncidentOperateLogList() {
        return incidentOperateLogList;
    }

    public void setIncidentOperateLogList(List<IncidentOperateLogV2> incidentOperateLogList) {
        this.incidentOperateLogList = incidentOperateLogList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCaseOperateLogsResponse listCaseOperateLogsResponse = (ListCaseOperateLogsResponse) o;
        return Objects.equals(this.totalCount, listCaseOperateLogsResponse.totalCount)
            && Objects.equals(this.incidentOperateLogList, listCaseOperateLogsResponse.incidentOperateLogList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incidentOperateLogList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCaseOperateLogsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    incidentOperateLogList: ").append(toIndentedString(incidentOperateLogList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
