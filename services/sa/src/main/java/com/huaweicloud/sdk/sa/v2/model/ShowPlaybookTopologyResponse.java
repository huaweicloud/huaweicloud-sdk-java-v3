package com.huaweicloud.sdk.sa.v2.model;

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
public class ShowPlaybookTopologyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_instances")

    private List<ActionInstanceInfo> actionInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowPlaybookTopologyResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * tatal count
     * minimum: 0
     * maximum: 99999
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowPlaybookTopologyResponse withActionInstances(List<ActionInstanceInfo> actionInstances) {
        this.actionInstances = actionInstances;
        return this;
    }

    public ShowPlaybookTopologyResponse addActionInstancesItem(ActionInstanceInfo actionInstancesItem) {
        if (this.actionInstances == null) {
            this.actionInstances = new ArrayList<>();
        }
        this.actionInstances.add(actionInstancesItem);
        return this;
    }

    public ShowPlaybookTopologyResponse withActionInstances(Consumer<List<ActionInstanceInfo>> actionInstancesSetter) {
        if (this.actionInstances == null) {
            this.actionInstances = new ArrayList<>();
        }
        actionInstancesSetter.accept(this.actionInstances);
        return this;
    }

    /**
     * Playbook action instances list
     * @return actionInstances
     */
    public List<ActionInstanceInfo> getActionInstances() {
        return actionInstances;
    }

    public void setActionInstances(List<ActionInstanceInfo> actionInstances) {
        this.actionInstances = actionInstances;
    }

    public ShowPlaybookTopologyResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPlaybookTopologyResponse showPlaybookTopologyResponse = (ShowPlaybookTopologyResponse) o;
        return Objects.equals(this.count, showPlaybookTopologyResponse.count)
            && Objects.equals(this.actionInstances, showPlaybookTopologyResponse.actionInstances)
            && Objects.equals(this.xRequestId, showPlaybookTopologyResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, actionInstances, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlaybookTopologyResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    actionInstances: ").append(toIndentedString(actionInstances)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
