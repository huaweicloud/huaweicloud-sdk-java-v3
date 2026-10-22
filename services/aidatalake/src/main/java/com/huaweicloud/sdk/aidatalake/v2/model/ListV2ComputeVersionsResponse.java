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
public class ListV2ComputeVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_versions")

    private List<ShowV2ComputeVersionResponseBody> computeVersions = null;

    public ListV2ComputeVersionsResponse withTotal(Integer total) {
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

    public ListV2ComputeVersionsResponse withComputeVersions(List<ShowV2ComputeVersionResponseBody> computeVersions) {
        this.computeVersions = computeVersions;
        return this;
    }

    public ListV2ComputeVersionsResponse addComputeVersionsItem(ShowV2ComputeVersionResponseBody computeVersionsItem) {
        if (this.computeVersions == null) {
            this.computeVersions = new ArrayList<>();
        }
        this.computeVersions.add(computeVersionsItem);
        return this;
    }

    public ListV2ComputeVersionsResponse withComputeVersions(
        Consumer<List<ShowV2ComputeVersionResponseBody>> computeVersionsSetter) {
        if (this.computeVersions == null) {
            this.computeVersions = new ArrayList<>();
        }
        computeVersionsSetter.accept(this.computeVersions);
        return this;
    }

    /**
     * **参数解释**：计算资源操作历史列表，列表元素为计算资源操作历史详情对象。 
     * @return computeVersions
     */
    public List<ShowV2ComputeVersionResponseBody> getComputeVersions() {
        return computeVersions;
    }

    public void setComputeVersions(List<ShowV2ComputeVersionResponseBody> computeVersions) {
        this.computeVersions = computeVersions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2ComputeVersionsResponse that = (ListV2ComputeVersionsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.computeVersions, that.computeVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, computeVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2ComputeVersionsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    computeVersions: ").append(toIndentedString(computeVersions)).append("\n");
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
