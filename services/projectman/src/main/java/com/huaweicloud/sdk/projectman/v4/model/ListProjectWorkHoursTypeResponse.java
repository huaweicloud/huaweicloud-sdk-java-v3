package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListProjectWorkHoursTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_hours_types")

    private List<WorkHoursType> workHoursTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListProjectWorkHoursTypeResponse withWorkHoursTypes(List<WorkHoursType> workHoursTypes) {
        this.workHoursTypes = workHoursTypes;
        return this;
    }

    public ListProjectWorkHoursTypeResponse addWorkHoursTypesItem(WorkHoursType workHoursTypesItem) {
        if (this.workHoursTypes == null) {
            this.workHoursTypes = new ArrayList<>();
        }
        this.workHoursTypes.add(workHoursTypesItem);
        return this;
    }

    public ListProjectWorkHoursTypeResponse withWorkHoursTypes(Consumer<List<WorkHoursType>> workHoursTypesSetter) {
        if (this.workHoursTypes == null) {
            this.workHoursTypes = new ArrayList<>();
        }
        workHoursTypesSetter.accept(this.workHoursTypes);
        return this;
    }

    /**
     * 工时类型列表
     * @return workHoursTypes
     */
    public List<WorkHoursType> getWorkHoursTypes() {
        return workHoursTypes;
    }

    public void setWorkHoursTypes(List<WorkHoursType> workHoursTypes) {
        this.workHoursTypes = workHoursTypes;
    }

    public ListProjectWorkHoursTypeResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectWorkHoursTypeResponse that = (ListProjectWorkHoursTypeResponse) obj;
        return Objects.equals(this.workHoursTypes, that.workHoursTypes) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workHoursTypes, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectWorkHoursTypeResponse {\n");
        sb.append("    workHoursTypes: ").append(toIndentedString(workHoursTypes)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
