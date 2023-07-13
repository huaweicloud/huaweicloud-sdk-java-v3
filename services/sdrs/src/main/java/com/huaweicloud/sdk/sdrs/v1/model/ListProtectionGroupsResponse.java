package com.huaweicloud.sdk.sdrs.v1.model;

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
public class ListProtectionGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_groups")

    private List<ShowProtectionGroupParams> serverGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListProtectionGroupsResponse withServerGroups(List<ShowProtectionGroupParams> serverGroups) {
        this.serverGroups = serverGroups;
        return this;
    }

    public ListProtectionGroupsResponse addServerGroupsItem(ShowProtectionGroupParams serverGroupsItem) {
        if (this.serverGroups == null) {
            this.serverGroups = new ArrayList<>();
        }
        this.serverGroups.add(serverGroupsItem);
        return this;
    }

    public ListProtectionGroupsResponse withServerGroups(Consumer<List<ShowProtectionGroupParams>> serverGroupsSetter) {
        if (this.serverGroups == null) {
            this.serverGroups = new ArrayList<>();
        }
        serverGroupsSetter.accept(this.serverGroups);
        return this;
    }

    /**
     * 保护组的信息列表。
     * @return serverGroups
     */
    public List<ShowProtectionGroupParams> getServerGroups() {
        return serverGroups;
    }

    public void setServerGroups(List<ShowProtectionGroupParams> serverGroups) {
        this.serverGroups = serverGroups;
    }

    public ListProtectionGroupsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 此参数为满足过滤条件的列表中包含的保护组个数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProtectionGroupsResponse that = (ListProtectionGroupsResponse) obj;
        return Objects.equals(this.serverGroups, that.serverGroups) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroups, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProtectionGroupsResponse {\n");
        sb.append("    serverGroups: ").append(toIndentedString(serverGroups)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
