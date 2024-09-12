package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SimCardFlowPerDayRsp
 */
public class SimCardFlowPerDayRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_flow")

    private List<SimCardFlowItem> simFlow = null;

    public SimCardFlowPerDayRsp withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 日期
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public SimCardFlowPerDayRsp withSimFlow(List<SimCardFlowItem> simFlow) {
        this.simFlow = simFlow;
        return this;
    }

    public SimCardFlowPerDayRsp addSimFlowItem(SimCardFlowItem simFlowItem) {
        if (this.simFlow == null) {
            this.simFlow = new ArrayList<>();
        }
        this.simFlow.add(simFlowItem);
        return this;
    }

    public SimCardFlowPerDayRsp withSimFlow(Consumer<List<SimCardFlowItem>> simFlowSetter) {
        if (this.simFlow == null) {
            this.simFlow = new ArrayList<>();
        }
        simFlowSetter.accept(this.simFlow);
        return this;
    }

    /**
     * Get simFlow
     * @return simFlow
     */
    public List<SimCardFlowItem> getSimFlow() {
        return simFlow;
    }

    public void setSimFlow(List<SimCardFlowItem> simFlow) {
        this.simFlow = simFlow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimCardFlowPerDayRsp that = (SimCardFlowPerDayRsp) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.simFlow, that.simFlow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, simFlow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimCardFlowPerDayRsp {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    simFlow: ").append(toIndentedString(simFlow)).append("\n");
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
