package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEcnWithVpcRequestBody
 */
public class UpdateEcnWithVpcRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subnet_list")

    private List<String> localSubnetList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_remote_subnet_route")

    private Boolean refreshRemoteSubnetRoute;

    public UpdateEcnWithVpcRequestBody withLocalSubnetList(List<String> localSubnetList) {
        this.localSubnetList = localSubnetList;
        return this;
    }

    public UpdateEcnWithVpcRequestBody addLocalSubnetListItem(String localSubnetListItem) {
        if (this.localSubnetList == null) {
            this.localSubnetList = new ArrayList<>();
        }
        this.localSubnetList.add(localSubnetListItem);
        return this;
    }

    public UpdateEcnWithVpcRequestBody withLocalSubnetList(Consumer<List<String>> localSubnetListSetter) {
        if (this.localSubnetList == null) {
            this.localSubnetList = new ArrayList<>();
        }
        localSubnetListSetter.accept(this.localSubnetList);
        return this;
    }

    /**
     * 本端子网列表
     * @return localSubnetList
     */
    public List<String> getLocalSubnetList() {
        return localSubnetList;
    }

    public void setLocalSubnetList(List<String> localSubnetList) {
        this.localSubnetList = localSubnetList;
    }

    public UpdateEcnWithVpcRequestBody withRefreshRemoteSubnetRoute(Boolean refreshRemoteSubnetRoute) {
        this.refreshRemoteSubnetRoute = refreshRemoteSubnetRoute;
        return this;
    }

    /**
     * 是否刷新对端子网路由
     * @return refreshRemoteSubnetRoute
     */
    public Boolean getRefreshRemoteSubnetRoute() {
        return refreshRemoteSubnetRoute;
    }

    public void setRefreshRemoteSubnetRoute(Boolean refreshRemoteSubnetRoute) {
        this.refreshRemoteSubnetRoute = refreshRemoteSubnetRoute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEcnWithVpcRequestBody that = (UpdateEcnWithVpcRequestBody) obj;
        return Objects.equals(this.localSubnetList, that.localSubnetList)
            && Objects.equals(this.refreshRemoteSubnetRoute, that.refreshRemoteSubnetRoute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localSubnetList, refreshRemoteSubnetRoute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEcnWithVpcRequestBody {\n");
        sb.append("    localSubnetList: ").append(toIndentedString(localSubnetList)).append("\n");
        sb.append("    refreshRemoteSubnetRoute: ").append(toIndentedString(refreshRemoteSubnetRoute)).append("\n");
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
