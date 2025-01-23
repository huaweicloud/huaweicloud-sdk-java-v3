package com.huaweicloud.sdk.das.v3.model;

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
public class ListInstanceDistributionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_distribution")

    private List<InstanceEngineDistributionListEngineDistribution> engineDistribution = null;

    public ListInstanceDistributionResponse withTotal(Integer total) {
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

    public ListInstanceDistributionResponse withEngineDistribution(
        List<InstanceEngineDistributionListEngineDistribution> engineDistribution) {
        this.engineDistribution = engineDistribution;
        return this;
    }

    public ListInstanceDistributionResponse addEngineDistributionItem(
        InstanceEngineDistributionListEngineDistribution engineDistributionItem) {
        if (this.engineDistribution == null) {
            this.engineDistribution = new ArrayList<>();
        }
        this.engineDistribution.add(engineDistributionItem);
        return this;
    }

    public ListInstanceDistributionResponse withEngineDistribution(
        Consumer<List<InstanceEngineDistributionListEngineDistribution>> engineDistributionSetter) {
        if (this.engineDistribution == null) {
            this.engineDistribution = new ArrayList<>();
        }
        engineDistributionSetter.accept(this.engineDistribution);
        return this;
    }

    /**
     * 引擎分布
     * @return engineDistribution
     */
    public List<InstanceEngineDistributionListEngineDistribution> getEngineDistribution() {
        return engineDistribution;
    }

    public void setEngineDistribution(List<InstanceEngineDistributionListEngineDistribution> engineDistribution) {
        this.engineDistribution = engineDistribution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceDistributionResponse that = (ListInstanceDistributionResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.engineDistribution, that.engineDistribution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, engineDistribution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceDistributionResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    engineDistribution: ").append(toIndentedString(engineDistribution)).append("\n");
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
