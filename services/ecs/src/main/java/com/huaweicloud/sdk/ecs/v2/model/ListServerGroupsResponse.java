package com.huaweicloud.sdk.ecs.v2.model;

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
public class ListServerGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_groups")

    private List<ListServerGroupsResult> serverGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListServerGroupsPageInfoResult pageInfo;

    public ListServerGroupsResponse withServerGroups(List<ListServerGroupsResult> serverGroups) {
        this.serverGroups = serverGroups;
        return this;
    }

    public ListServerGroupsResponse addServerGroupsItem(ListServerGroupsResult serverGroupsItem) {
        if (this.serverGroups == null) {
            this.serverGroups = new ArrayList<>();
        }
        this.serverGroups.add(serverGroupsItem);
        return this;
    }

    public ListServerGroupsResponse withServerGroups(Consumer<List<ListServerGroupsResult>> serverGroupsSetter) {
        if (this.serverGroups == null) {
            this.serverGroups = new ArrayList<>();
        }
        serverGroupsSetter.accept(this.serverGroups);
        return this;
    }

    /**
     * 弹性云服务器组信息
     * @return serverGroups
     */
    public List<ListServerGroupsResult> getServerGroups() {
        return serverGroups;
    }

    public void setServerGroups(List<ListServerGroupsResult> serverGroups) {
        this.serverGroups = serverGroups;
    }

    public ListServerGroupsResponse withPageInfo(ListServerGroupsPageInfoResult pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListServerGroupsResponse withPageInfo(Consumer<ListServerGroupsPageInfoResult> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ListServerGroupsPageInfoResult();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ListServerGroupsPageInfoResult getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ListServerGroupsPageInfoResult pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServerGroupsResponse listServerGroupsResponse = (ListServerGroupsResponse) o;
        return Objects.equals(this.serverGroups, listServerGroupsResponse.serverGroups)
            && Objects.equals(this.pageInfo, listServerGroupsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroups, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerGroupsResponse {\n");
        sb.append("    serverGroups: ").append(toIndentedString(serverGroups)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
