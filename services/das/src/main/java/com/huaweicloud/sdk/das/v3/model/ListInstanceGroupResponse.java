package com.huaweicloud.sdk.das.v3.model;

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
public class ListInstanceGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_group_list")

    private List<InstanceGroup> instanceGroupList = null;

    public ListInstanceGroupResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInstanceGroupResponse withInstanceGroupList(List<InstanceGroup> instanceGroupList) {
        this.instanceGroupList = instanceGroupList;
        return this;
    }

    public ListInstanceGroupResponse addInstanceGroupListItem(InstanceGroup instanceGroupListItem) {
        if (this.instanceGroupList == null) {
            this.instanceGroupList = new ArrayList<>();
        }
        this.instanceGroupList.add(instanceGroupListItem);
        return this;
    }

    public ListInstanceGroupResponse withInstanceGroupList(Consumer<List<InstanceGroup>> instanceGroupListSetter) {
        if (this.instanceGroupList == null) {
            this.instanceGroupList = new ArrayList<>();
        }
        instanceGroupListSetter.accept(this.instanceGroupList);
        return this;
    }

    /**
     * 实例组列表
     * @return instanceGroupList
     */
    public List<InstanceGroup> getInstanceGroupList() {
        return instanceGroupList;
    }

    public void setInstanceGroupList(List<InstanceGroup> instanceGroupList) {
        this.instanceGroupList = instanceGroupList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceGroupResponse that = (ListInstanceGroupResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.instanceGroupList, that.instanceGroupList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, instanceGroupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceGroupResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    instanceGroupList: ").append(toIndentedString(instanceGroupList)).append("\n");
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
