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
public class ListCloudDbaInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_list")

    private List<DASInstanceInfo> instanceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListCloudDbaInstancesResponse withInstanceList(List<DASInstanceInfo> instanceList) {
        this.instanceList = instanceList;
        return this;
    }

    public ListCloudDbaInstancesResponse addInstanceListItem(DASInstanceInfo instanceListItem) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        this.instanceList.add(instanceListItem);
        return this;
    }

    public ListCloudDbaInstancesResponse withInstanceList(Consumer<List<DASInstanceInfo>> instanceListSetter) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        instanceListSetter.accept(this.instanceList);
        return this;
    }

    /**
     * 实例列表。
     * @return instanceList
     */
    public List<DASInstanceInfo> getInstanceList() {
        return instanceList;
    }

    public void setInstanceList(List<DASInstanceInfo> instanceList) {
        this.instanceList = instanceList;
    }

    public ListCloudDbaInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * minimum: 0
     * maximum: 10000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudDbaInstancesResponse that = (ListCloudDbaInstancesResponse) obj;
        return Objects.equals(this.instanceList, that.instanceList) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudDbaInstancesResponse {\n");
        sb.append("    instanceList: ").append(toIndentedString(instanceList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
