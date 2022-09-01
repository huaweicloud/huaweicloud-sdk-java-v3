package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MonthUsageVo
 */
public class MonthUsageVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    @JacksonXmlProperty(localName = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_usages")

    @JacksonXmlProperty(localName = "flow_usages")

    private List<FlowUsageVo> flowUsages = null;

    public MonthUsageVo withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /**
     * SIM卡ID
     * minimum: 0
     * @return simCardId
     */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public MonthUsageVo withFlowUsages(List<FlowUsageVo> flowUsages) {
        this.flowUsages = flowUsages;
        return this;
    }

    public MonthUsageVo addFlowUsagesItem(FlowUsageVo flowUsagesItem) {
        if (this.flowUsages == null) {
            this.flowUsages = new ArrayList<>();
        }
        this.flowUsages.add(flowUsagesItem);
        return this;
    }

    public MonthUsageVo withFlowUsages(Consumer<List<FlowUsageVo>> flowUsagesSetter) {
        if (this.flowUsages == null) {
            this.flowUsages = new ArrayList<>();
        }
        flowUsagesSetter.accept(this.flowUsages);
        return this;
    }

    /**
     * 月用量
     * @return flowUsages
     */
    public List<FlowUsageVo> getFlowUsages() {
        return flowUsages;
    }

    public void setFlowUsages(List<FlowUsageVo> flowUsages) {
        this.flowUsages = flowUsages;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MonthUsageVo monthUsageVo = (MonthUsageVo) o;
        return Objects.equals(this.simCardId, monthUsageVo.simCardId)
            && Objects.equals(this.flowUsages, monthUsageVo.flowUsages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardId, flowUsages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonthUsageVo {\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    flowUsages: ").append(toIndentedString(flowUsages)).append("\n");
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
