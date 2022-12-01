package com.huaweicloud.sdk.dws.v2.model;

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
public class ListWorkloadQueueResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_queue_name_list")

    private List<String> workloadQueueNameList = null;

    public ListWorkloadQueueResponse withWorkloadQueueNameList(List<String> workloadQueueNameList) {
        this.workloadQueueNameList = workloadQueueNameList;
        return this;
    }

    public ListWorkloadQueueResponse addWorkloadQueueNameListItem(String workloadQueueNameListItem) {
        if (this.workloadQueueNameList == null) {
            this.workloadQueueNameList = new ArrayList<>();
        }
        this.workloadQueueNameList.add(workloadQueueNameListItem);
        return this;
    }

    public ListWorkloadQueueResponse withWorkloadQueueNameList(Consumer<List<String>> workloadQueueNameListSetter) {
        if (this.workloadQueueNameList == null) {
            this.workloadQueueNameList = new ArrayList<>();
        }
        workloadQueueNameListSetter.accept(this.workloadQueueNameList);
        return this;
    }

    /**
     * 工作负载队列名称。
     * @return workloadQueueNameList
     */
    public List<String> getWorkloadQueueNameList() {
        return workloadQueueNameList;
    }

    public void setWorkloadQueueNameList(List<String> workloadQueueNameList) {
        this.workloadQueueNameList = workloadQueueNameList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkloadQueueResponse listWorkloadQueueResponse = (ListWorkloadQueueResponse) o;
        return Objects.equals(this.workloadQueueNameList, listWorkloadQueueResponse.workloadQueueNameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadQueueNameList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkloadQueueResponse {\n");
        sb.append("    workloadQueueNameList: ").append(toIndentedString(workloadQueueNameList)).append("\n");
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
