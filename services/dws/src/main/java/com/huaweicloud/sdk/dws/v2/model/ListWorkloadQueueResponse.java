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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_code")

    private Integer workloadResCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_str")

    private String workloadResStr;

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

    public ListWorkloadQueueResponse withWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
        return this;
    }

    /**
     * 结果状态码。
     * @return workloadResCode
     */
    public Integer getWorkloadResCode() {
        return workloadResCode;
    }

    public void setWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
    }

    public ListWorkloadQueueResponse withWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
        return this;
    }

    /**
     * 结果描述。
     * @return workloadResStr
     */
    public String getWorkloadResStr() {
        return workloadResStr;
    }

    public void setWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
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
        return Objects.equals(this.workloadQueueNameList, that.workloadQueueNameList)
            && Objects.equals(this.workloadResCode, that.workloadResCode)
            && Objects.equals(this.workloadResStr, that.workloadResStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadQueueNameList, workloadResCode, workloadResStr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkloadQueueResponse {\n");
        sb.append("    workloadQueueNameList: ").append(toIndentedString(workloadQueueNameList)).append("\n");
        sb.append("    workloadResCode: ").append(toIndentedString(workloadResCode)).append("\n");
        sb.append("    workloadResStr: ").append(toIndentedString(workloadResStr)).append("\n");
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
