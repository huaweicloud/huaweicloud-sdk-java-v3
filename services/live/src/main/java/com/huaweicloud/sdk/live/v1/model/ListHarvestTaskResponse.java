package com.huaweicloud.sdk.live.v1.model;

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
public class ListHarvestTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "harvest_tasks")

    private List<HarvestTaskCreateSucRsp> harvestTasks = null;

    public ListHarvestTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总任务数
     * minimum: 1
     * maximum: 1024
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListHarvestTaskResponse withHarvestTasks(List<HarvestTaskCreateSucRsp> harvestTasks) {
        this.harvestTasks = harvestTasks;
        return this;
    }

    public ListHarvestTaskResponse addHarvestTasksItem(HarvestTaskCreateSucRsp harvestTasksItem) {
        if (this.harvestTasks == null) {
            this.harvestTasks = new ArrayList<>();
        }
        this.harvestTasks.add(harvestTasksItem);
        return this;
    }

    public ListHarvestTaskResponse withHarvestTasks(Consumer<List<HarvestTaskCreateSucRsp>> harvestTasksSetter) {
        if (this.harvestTasks == null) {
            this.harvestTasks = new ArrayList<>();
        }
        harvestTasksSetter.accept(this.harvestTasks);
        return this;
    }

    /**
     * 任务信息
     * @return harvestTasks
     */
    public List<HarvestTaskCreateSucRsp> getHarvestTasks() {
        return harvestTasks;
    }

    public void setHarvestTasks(List<HarvestTaskCreateSucRsp> harvestTasks) {
        this.harvestTasks = harvestTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHarvestTaskResponse that = (ListHarvestTaskResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.harvestTasks, that.harvestTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, harvestTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHarvestTaskResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    harvestTasks: ").append(toIndentedString(harvestTasks)).append("\n");
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
