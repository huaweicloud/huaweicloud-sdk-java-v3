package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** GetHostGroupListRequestBody */
public class GetHostGroupListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_id_list")

    private List<String> hostGroupIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private GetHostGroupListFilter filter;

    public GetHostGroupListRequestBody withHostGroupIdList(List<String> hostGroupIdList) {
        this.hostGroupIdList = hostGroupIdList;
        return this;
    }

    public GetHostGroupListRequestBody addHostGroupIdListItem(String hostGroupIdListItem) {
        if (this.hostGroupIdList == null) {
            this.hostGroupIdList = new ArrayList<>();
        }
        this.hostGroupIdList.add(hostGroupIdListItem);
        return this;
    }

    public GetHostGroupListRequestBody withHostGroupIdList(Consumer<List<String>> hostGroupIdListSetter) {
        if (this.hostGroupIdList == null) {
            this.hostGroupIdList = new ArrayList<>();
        }
        hostGroupIdListSetter.accept(this.hostGroupIdList);
        return this;
    }

    /** 主机组ID
     * 
     * @return hostGroupIdList */
    public List<String> getHostGroupIdList() {
        return hostGroupIdList;
    }

    public void setHostGroupIdList(List<String> hostGroupIdList) {
        this.hostGroupIdList = hostGroupIdList;
    }

    public GetHostGroupListRequestBody withFilter(GetHostGroupListFilter filter) {
        this.filter = filter;
        return this;
    }

    public GetHostGroupListRequestBody withFilter(Consumer<GetHostGroupListFilter> filterSetter) {
        if (this.filter == null) {
            this.filter = new GetHostGroupListFilter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /** Get filter
     * 
     * @return filter */
    public GetHostGroupListFilter getFilter() {
        return filter;
    }

    public void setFilter(GetHostGroupListFilter filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetHostGroupListRequestBody getHostGroupListRequestBody = (GetHostGroupListRequestBody) o;
        return Objects.equals(this.hostGroupIdList, getHostGroupListRequestBody.hostGroupIdList)
            && Objects.equals(this.filter, getHostGroupListRequestBody.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostGroupIdList, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHostGroupListRequestBody {\n");
        sb.append("    hostGroupIdList: ").append(toIndentedString(hostGroupIdList)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
