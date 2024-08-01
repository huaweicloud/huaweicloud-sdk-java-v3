package com.huaweicloud.sdk.ddm.v1.model;

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
public class ShowPhysicalProcessesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_processes")

    private List<PhysicalProcessInfo> physicalProcesses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowPhysicalProcessesResponse withPhysicalProcesses(List<PhysicalProcessInfo> physicalProcesses) {
        this.physicalProcesses = physicalProcesses;
        return this;
    }

    public ShowPhysicalProcessesResponse addPhysicalProcessesItem(PhysicalProcessInfo physicalProcessesItem) {
        if (this.physicalProcesses == null) {
            this.physicalProcesses = new ArrayList<>();
        }
        this.physicalProcesses.add(physicalProcessesItem);
        return this;
    }

    public ShowPhysicalProcessesResponse withPhysicalProcesses(
        Consumer<List<PhysicalProcessInfo>> physicalProcessesSetter) {
        if (this.physicalProcesses == null) {
            this.physicalProcesses = new ArrayList<>();
        }
        physicalProcessesSetter.accept(this.physicalProcesses);
        return this;
    }

    /**
     * 物理会话信息列表
     * @return physicalProcesses
     */
    public List<PhysicalProcessInfo> getPhysicalProcesses() {
        return physicalProcesses;
    }

    public void setPhysicalProcesses(List<PhysicalProcessInfo> physicalProcesses) {
        this.physicalProcesses = physicalProcesses;
    }

    public ShowPhysicalProcessesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
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
        ShowPhysicalProcessesResponse that = (ShowPhysicalProcessesResponse) obj;
        return Objects.equals(this.physicalProcesses, that.physicalProcesses)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicalProcesses, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPhysicalProcessesResponse {\n");
        sb.append("    physicalProcesses: ").append(toIndentedString(physicalProcesses)).append("\n");
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
