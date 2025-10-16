package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowStatusInstanceItem
 */
public class ShowStatusInstanceItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_list")

    private List<ShowStatusInstanceItemInstanceList> instanceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Integer timestamp;

    public ShowStatusInstanceItem withInstanceList(List<ShowStatusInstanceItemInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }

    public ShowStatusInstanceItem addInstanceListItem(ShowStatusInstanceItemInstanceList instanceListItem) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        this.instanceList.add(instanceListItem);
        return this;
    }

    public ShowStatusInstanceItem withInstanceList(
        Consumer<List<ShowStatusInstanceItemInstanceList>> instanceListSetter) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        instanceListSetter.accept(this.instanceList);
        return this;
    }

    /**
     * 实例列表
     * @return instanceList
     */
    public List<ShowStatusInstanceItemInstanceList> getInstanceList() {
        return instanceList;
    }

    public void setInstanceList(List<ShowStatusInstanceItemInstanceList> instanceList) {
        this.instanceList = instanceList;
    }

    public ShowStatusInstanceItem withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 采集时间，UNIX时间戳，单位毫秒
     * @return timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatusInstanceItem that = (ShowStatusInstanceItem) obj;
        return Objects.equals(this.instanceList, that.instanceList) && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceList, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatusInstanceItem {\n");
        sb.append("    instanceList: ").append(toIndentedString(instanceList)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
