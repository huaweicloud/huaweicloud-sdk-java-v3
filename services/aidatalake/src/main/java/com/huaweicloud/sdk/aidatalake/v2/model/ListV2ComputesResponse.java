package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListV2ComputesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computes")

    private List<V2ComputeInfo> computes = null;

    public ListV2ComputesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：总记录数。 **取值范围**：0~10000。 
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListV2ComputesResponse withComputes(List<V2ComputeInfo> computes) {
        this.computes = computes;
        return this;
    }

    public ListV2ComputesResponse addComputesItem(V2ComputeInfo computesItem) {
        if (this.computes == null) {
            this.computes = new ArrayList<>();
        }
        this.computes.add(computesItem);
        return this;
    }

    public ListV2ComputesResponse withComputes(Consumer<List<V2ComputeInfo>> computesSetter) {
        if (this.computes == null) {
            this.computes = new ArrayList<>();
        }
        computesSetter.accept(this.computes);
        return this;
    }

    /**
     * **参数解释**：计算资源列表，每个元素为一个V2ComputeInfo对象，包含计算资源ID、名称、计费模式、容量配置、标签等详细信息。 
     * @return computes
     */
    public List<V2ComputeInfo> getComputes() {
        return computes;
    }

    public void setComputes(List<V2ComputeInfo> computes) {
        this.computes = computes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2ComputesResponse that = (ListV2ComputesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.computes, that.computes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, computes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2ComputesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    computes: ").append(toIndentedString(computes)).append("\n");
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
