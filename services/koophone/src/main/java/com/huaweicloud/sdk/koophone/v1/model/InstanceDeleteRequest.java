package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 退订入参
 */
public class InstanceDeleteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceIdList")

    private List<String> instanceIdList = null;

    public InstanceDeleteRequest withInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

    public InstanceDeleteRequest addInstanceIdListItem(String instanceIdListItem) {
        if (this.instanceIdList == null) {
            this.instanceIdList = new ArrayList<>();
        }
        this.instanceIdList.add(instanceIdListItem);
        return this;
    }

    public InstanceDeleteRequest withInstanceIdList(Consumer<List<String>> instanceIdListSetter) {
        if (this.instanceIdList == null) {
            this.instanceIdList = new ArrayList<>();
        }
        instanceIdListSetter.accept(this.instanceIdList);
        return this;
    }

    /**
     * 实例id
     * @return instanceIdList
     */
    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    public void setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDeleteRequest that = (InstanceDeleteRequest) obj;
        return Objects.equals(this.instanceIdList, that.instanceIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDeleteRequest {\n");
        sb.append("    instanceIdList: ").append(toIndentedString(instanceIdList)).append("\n");
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
