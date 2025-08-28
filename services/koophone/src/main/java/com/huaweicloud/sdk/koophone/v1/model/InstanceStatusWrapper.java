package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 状态查询结果包装
 */
public class InstanceStatusWrapper {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private List<InstanceStatus> statusList = null;

    public InstanceStatusWrapper withStatusList(List<InstanceStatus> statusList) {
        this.statusList = statusList;
        return this;
    }

    public InstanceStatusWrapper addStatusListItem(InstanceStatus statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public InstanceStatusWrapper withStatusList(Consumer<List<InstanceStatus>> statusListSetter) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * 实例状态列表
     * @return statusList
     */
    public List<InstanceStatus> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<InstanceStatus> statusList) {
        this.statusList = statusList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceStatusWrapper that = (InstanceStatusWrapper) obj;
        return Objects.equals(this.statusList, that.statusList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceStatusWrapper {\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
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
