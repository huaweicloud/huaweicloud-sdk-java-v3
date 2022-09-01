package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGroupReplicationInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_list")

    @JacksonXmlProperty(localName = "group_list")

    private List<InstanceGroupListInfo> groupList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_count")

    @JacksonXmlProperty(localName = "group_count")

    private Integer groupCount;

    public ListGroupReplicationInfoResponse withGroupList(List<InstanceGroupListInfo> groupList) {
        this.groupList = groupList;
        return this;
    }

    public ListGroupReplicationInfoResponse addGroupListItem(InstanceGroupListInfo groupListItem) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        this.groupList.add(groupListItem);
        return this;
    }

    public ListGroupReplicationInfoResponse withGroupList(Consumer<List<InstanceGroupListInfo>> groupListSetter) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        groupListSetter.accept(this.groupList);
        return this;
    }

    /**
     * 分片列表
     * @return groupList
     */
    public List<InstanceGroupListInfo> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<InstanceGroupListInfo> groupList) {
        this.groupList = groupList;
    }

    public ListGroupReplicationInfoResponse withGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }

    /**
     * 实例分片总数。
     * @return groupCount
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGroupReplicationInfoResponse listGroupReplicationInfoResponse = (ListGroupReplicationInfoResponse) o;
        return Objects.equals(this.groupList, listGroupReplicationInfoResponse.groupList)
            && Objects.equals(this.groupCount, listGroupReplicationInfoResponse.groupCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupList, groupCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupReplicationInfoResponse {\n");
        sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
        sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
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
