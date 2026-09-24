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
    @JsonProperty(value = "queue_list")

    private List<PlanStageQueue> queueList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_queue_name_list")

    private List<String> workloadQueueNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_code")

    private Integer workloadResCode;

    public ListWorkloadQueueResponse withQueueList(List<PlanStageQueue> queueList) {
        this.queueList = queueList;
        return this;
    }

    public ListWorkloadQueueResponse addQueueListItem(PlanStageQueue queueListItem) {
        if (this.queueList == null) {
            this.queueList = new ArrayList<>();
        }
        this.queueList.add(queueListItem);
        return this;
    }

    public ListWorkloadQueueResponse withQueueList(Consumer<List<PlanStageQueue>> queueListSetter) {
        if (this.queueList == null) {
            this.queueList = new ArrayList<>();
        }
        queueListSetter.accept(this.queueList);
        return this;
    }

    /**
     * 资源池队列详情
     * @return queueList
     */
    public List<PlanStageQueue> getQueueList() {
        return queueList;
    }

    public void setQueueList(List<PlanStageQueue> queueList) {
        this.queueList = queueList;
    }

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
     * 资源池名称队列
     * @return workloadQueueNameList
     */
    public List<String> getWorkloadQueueNameList() {
        return workloadQueueNameList;
    }

    public void setWorkloadQueueNameList(List<String> workloadQueueNameList) {
        this.workloadQueueNameList = workloadQueueNameList;
    }

    public ListWorkloadQueueResponse withWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
        return this;
    }

    /**
     * 资源池队列查询返回码
     * @return workloadResCode
     */
    public Integer getWorkloadResCode() {
        return workloadResCode;
    }

    public void setWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkloadQueueResponse that = (ListWorkloadQueueResponse) obj;
        return Objects.equals(this.queueList, that.queueList)
            && Objects.equals(this.workloadQueueNameList, that.workloadQueueNameList)
            && Objects.equals(this.workloadResCode, that.workloadResCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueList, workloadQueueNameList, workloadResCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkloadQueueResponse {\n");
        sb.append("    queueList: ").append(toIndentedString(queueList)).append("\n");
        sb.append("    workloadQueueNameList: ").append(toIndentedString(workloadQueueNameList)).append("\n");
        sb.append("    workloadResCode: ").append(toIndentedString(workloadResCode)).append("\n");
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
