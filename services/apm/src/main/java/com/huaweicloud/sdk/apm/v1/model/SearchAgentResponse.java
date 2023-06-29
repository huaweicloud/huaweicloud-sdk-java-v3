package com.huaweicloud.sdk.apm.v1.model;

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
public class SearchAgentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_page")

    private Integer totalPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_count")

    private Integer onlineCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_count")

    private Integer offlineCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_count")

    private Integer disableCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_info_list")

    private List<InstanceInfo> agentInfoList = null;

    public SearchAgentResponse withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * 总页数。
     * @return totalPage
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public SearchAgentResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总个数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public SearchAgentResponse withOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
        return this;
    }

    /**
     * 正常个数。
     * @return onlineCount
     */
    public Integer getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    public SearchAgentResponse withOfflineCount(Integer offlineCount) {
        this.offlineCount = offlineCount;
        return this;
    }

    /**
     * 心跳异常个数。
     * @return offlineCount
     */
    public Integer getOfflineCount() {
        return offlineCount;
    }

    public void setOfflineCount(Integer offlineCount) {
        this.offlineCount = offlineCount;
    }

    public SearchAgentResponse withDisableCount(Integer disableCount) {
        this.disableCount = disableCount;
        return this;
    }

    /**
     * 被关闭的个数。
     * @return disableCount
     */
    public Integer getDisableCount() {
        return disableCount;
    }

    public void setDisableCount(Integer disableCount) {
        this.disableCount = disableCount;
    }

    public SearchAgentResponse withAgentInfoList(List<InstanceInfo> agentInfoList) {
        this.agentInfoList = agentInfoList;
        return this;
    }

    public SearchAgentResponse addAgentInfoListItem(InstanceInfo agentInfoListItem) {
        if (this.agentInfoList == null) {
            this.agentInfoList = new ArrayList<>();
        }
        this.agentInfoList.add(agentInfoListItem);
        return this;
    }

    public SearchAgentResponse withAgentInfoList(Consumer<List<InstanceInfo>> agentInfoListSetter) {
        if (this.agentInfoList == null) {
            this.agentInfoList = new ArrayList<>();
        }
        agentInfoListSetter.accept(this.agentInfoList);
        return this;
    }

    /**
     * agent地址列表。
     * @return agentInfoList
     */
    public List<InstanceInfo> getAgentInfoList() {
        return agentInfoList;
    }

    public void setAgentInfoList(List<InstanceInfo> agentInfoList) {
        this.agentInfoList = agentInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchAgentResponse that = (SearchAgentResponse) obj;
        return Objects.equals(this.totalPage, that.totalPage) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.onlineCount, that.onlineCount)
            && Objects.equals(this.offlineCount, that.offlineCount)
            && Objects.equals(this.disableCount, that.disableCount)
            && Objects.equals(this.agentInfoList, that.agentInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPage, totalCount, onlineCount, offlineCount, disableCount, agentInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchAgentResponse {\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    onlineCount: ").append(toIndentedString(onlineCount)).append("\n");
        sb.append("    offlineCount: ").append(toIndentedString(offlineCount)).append("\n");
        sb.append("    disableCount: ").append(toIndentedString(disableCount)).append("\n");
        sb.append("    agentInfoList: ").append(toIndentedString(agentInfoList)).append("\n");
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
