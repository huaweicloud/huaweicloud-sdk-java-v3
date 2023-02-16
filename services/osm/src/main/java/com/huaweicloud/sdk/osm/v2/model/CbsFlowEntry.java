package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CbsFlowEntry
 */
public class CbsFlowEntry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_flow_id")

    private String qaFlowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_node_id")

    private String startNodeId;

    public CbsFlowEntry withQaFlowId(String qaFlowId) {
        this.qaFlowId = qaFlowId;
        return this;
    }

    /**
     * 问题流程id
     * @return qaFlowId
     */
    public String getQaFlowId() {
        return qaFlowId;
    }

    public void setQaFlowId(String qaFlowId) {
        this.qaFlowId = qaFlowId;
    }

    public CbsFlowEntry withStartNodeId(String startNodeId) {
        this.startNodeId = startNodeId;
        return this;
    }

    /**
     * 开始节点id
     * @return startNodeId
     */
    public String getStartNodeId() {
        return startNodeId;
    }

    public void setStartNodeId(String startNodeId) {
        this.startNodeId = startNodeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CbsFlowEntry cbsFlowEntry = (CbsFlowEntry) o;
        return Objects.equals(this.qaFlowId, cbsFlowEntry.qaFlowId)
            && Objects.equals(this.startNodeId, cbsFlowEntry.startNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qaFlowId, startNodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbsFlowEntry {\n");
        sb.append("    qaFlowId: ").append(toIndentedString(qaFlowId)).append("\n");
        sb.append("    startNodeId: ").append(toIndentedString(startNodeId)).append("\n");
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
