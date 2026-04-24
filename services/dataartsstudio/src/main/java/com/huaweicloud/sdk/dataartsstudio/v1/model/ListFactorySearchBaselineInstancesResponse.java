package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListFactorySearchBaselineInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_instances")

    private List<BaselineInstance> baselineInstances = null;

    public ListFactorySearchBaselineInstancesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 基线实例总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListFactorySearchBaselineInstancesResponse withBaselineInstances(List<BaselineInstance> baselineInstances) {
        this.baselineInstances = baselineInstances;
        return this;
    }

    public ListFactorySearchBaselineInstancesResponse addBaselineInstancesItem(BaselineInstance baselineInstancesItem) {
        if (this.baselineInstances == null) {
            this.baselineInstances = new ArrayList<>();
        }
        this.baselineInstances.add(baselineInstancesItem);
        return this;
    }

    public ListFactorySearchBaselineInstancesResponse withBaselineInstances(
        Consumer<List<BaselineInstance>> baselineInstancesSetter) {
        if (this.baselineInstances == null) {
            this.baselineInstances = new ArrayList<>();
        }
        baselineInstancesSetter.accept(this.baselineInstances);
        return this;
    }

    /**
     * 基线实例列表信息。
     * @return baselineInstances
     */
    public List<BaselineInstance> getBaselineInstances() {
        return baselineInstances;
    }

    public void setBaselineInstances(List<BaselineInstance> baselineInstances) {
        this.baselineInstances = baselineInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactorySearchBaselineInstancesResponse that = (ListFactorySearchBaselineInstancesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.baselineInstances, that.baselineInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, baselineInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactorySearchBaselineInstancesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    baselineInstances: ").append(toIndentedString(baselineInstances)).append("\n");
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
