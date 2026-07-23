package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsAgentObservationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_info_list")

    private List<AgentInfo> appInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListOpsAgentObservationResponse withAppInfoList(List<AgentInfo> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }

    public ListOpsAgentObservationResponse addAppInfoListItem(AgentInfo appInfoListItem) {
        if (this.appInfoList == null) {
            this.appInfoList = new ArrayList<>();
        }
        this.appInfoList.add(appInfoListItem);
        return this;
    }

    public ListOpsAgentObservationResponse withAppInfoList(Consumer<List<AgentInfo>> appInfoListSetter) {
        if (this.appInfoList == null) {
            this.appInfoList = new ArrayList<>();
        }
        appInfoListSetter.accept(this.appInfoList);
        return this;
    }

    /**
     * 智能体详情
     * @return appInfoList
     */
    public List<AgentInfo> getAppInfoList() {
        return appInfoList;
    }

    public void setAppInfoList(List<AgentInfo> appInfoList) {
        this.appInfoList = appInfoList;
    }

    public ListOpsAgentObservationResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 1000000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAgentObservationResponse that = (ListOpsAgentObservationResponse) obj;
        return Objects.equals(this.appInfoList, that.appInfoList) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appInfoList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAgentObservationResponse {\n");
        sb.append("    appInfoList: ").append(toIndentedString(appInfoList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
