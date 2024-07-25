package com.huaweicloud.sdk.apig.v2.model;

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
public class ListOrchestrationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestrations")

    private List<OrchestrationBaseResp> orchestrations = null;

    public ListOrchestrationsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListOrchestrationsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListOrchestrationsResponse withOrchestrations(List<OrchestrationBaseResp> orchestrations) {
        this.orchestrations = orchestrations;
        return this;
    }

    public ListOrchestrationsResponse addOrchestrationsItem(OrchestrationBaseResp orchestrationsItem) {
        if (this.orchestrations == null) {
            this.orchestrations = new ArrayList<>();
        }
        this.orchestrations.add(orchestrationsItem);
        return this;
    }

    public ListOrchestrationsResponse withOrchestrations(Consumer<List<OrchestrationBaseResp>> orchestrationsSetter) {
        if (this.orchestrations == null) {
            this.orchestrations = new ArrayList<>();
        }
        orchestrationsSetter.accept(this.orchestrations);
        return this;
    }

    /**
     * 本次查询到的编排规则列表。
     * @return orchestrations
     */
    public List<OrchestrationBaseResp> getOrchestrations() {
        return orchestrations;
    }

    public void setOrchestrations(List<OrchestrationBaseResp> orchestrations) {
        this.orchestrations = orchestrations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOrchestrationsResponse that = (ListOrchestrationsResponse) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total)
            && Objects.equals(this.orchestrations, that.orchestrations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, orchestrations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrchestrationsResponse {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    orchestrations: ").append(toIndentedString(orchestrations)).append("\n");
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
