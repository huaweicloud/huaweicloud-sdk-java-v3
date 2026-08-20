package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求结果。
 */
public class ShowIpdProcessInstancesResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_instances")

    private List<ShowIpdProcessInstancesResponseResultProcessInstances> processInstances = null;

    public ShowIpdProcessInstancesResponseResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowIpdProcessInstancesResponseResult withProcessInstances(
        List<ShowIpdProcessInstancesResponseResultProcessInstances> processInstances) {
        this.processInstances = processInstances;
        return this;
    }

    public ShowIpdProcessInstancesResponseResult addProcessInstancesItem(
        ShowIpdProcessInstancesResponseResultProcessInstances processInstancesItem) {
        if (this.processInstances == null) {
            this.processInstances = new ArrayList<>();
        }
        this.processInstances.add(processInstancesItem);
        return this;
    }

    public ShowIpdProcessInstancesResponseResult withProcessInstances(
        Consumer<List<ShowIpdProcessInstancesResponseResultProcessInstances>> processInstancesSetter) {
        if (this.processInstances == null) {
            this.processInstances = new ArrayList<>();
        }
        processInstancesSetter.accept(this.processInstances);
        return this;
    }

    /**
     * 评审单列表。
     * @return processInstances
     */
    public List<ShowIpdProcessInstancesResponseResultProcessInstances> getProcessInstances() {
        return processInstances;
    }

    public void setProcessInstances(List<ShowIpdProcessInstancesResponseResultProcessInstances> processInstances) {
        this.processInstances = processInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIpdProcessInstancesResponseResult that = (ShowIpdProcessInstancesResponseResult) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.processInstances, that.processInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, processInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpdProcessInstancesResponseResult {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    processInstances: ").append(toIndentedString(processInstances)).append("\n");
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
