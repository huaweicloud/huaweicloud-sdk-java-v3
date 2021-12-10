package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 日志接入主机组ID列表 */
public class AccessConfigHostGroupIdList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_id_list")

    private List<String> hostGroupIdList = null;

    public AccessConfigHostGroupIdList withHostGroupIdList(List<String> hostGroupIdList) {
        this.hostGroupIdList = hostGroupIdList;
        return this;
    }

    public AccessConfigHostGroupIdList addHostGroupIdListItem(String hostGroupIdListItem) {
        if (this.hostGroupIdList == null) {
            this.hostGroupIdList = new ArrayList<>();
        }
        this.hostGroupIdList.add(hostGroupIdListItem);
        return this;
    }

    public AccessConfigHostGroupIdList withHostGroupIdList(Consumer<List<String>> hostGroupIdListSetter) {
        if (this.hostGroupIdList == null) {
            this.hostGroupIdList = new ArrayList<>();
        }
        hostGroupIdListSetter.accept(this.hostGroupIdList);
        return this;
    }

    /** 主机组ID列表
     * 
     * @return hostGroupIdList */
    public List<String> getHostGroupIdList() {
        return hostGroupIdList;
    }

    public void setHostGroupIdList(List<String> hostGroupIdList) {
        this.hostGroupIdList = hostGroupIdList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessConfigHostGroupIdList accessConfigHostGroupIdList = (AccessConfigHostGroupIdList) o;
        return Objects.equals(this.hostGroupIdList, accessConfigHostGroupIdList.hostGroupIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostGroupIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigHostGroupIdList {\n");
        sb.append("    hostGroupIdList: ").append(toIndentedString(hostGroupIdList)).append("\n");
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
