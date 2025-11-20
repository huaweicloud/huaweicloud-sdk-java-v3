package com.huaweicloud.sdk.ddm.v1.model;

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
public class ListAvailableRdsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_nodes")

    private List<AvailableDnInstance> dataNodes = null;

    public ListAvailableRdsResponse withDataNodes(List<AvailableDnInstance> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }

    public ListAvailableRdsResponse addDataNodesItem(AvailableDnInstance dataNodesItem) {
        if (this.dataNodes == null) {
            this.dataNodes = new ArrayList<>();
        }
        this.dataNodes.add(dataNodesItem);
        return this;
    }

    public ListAvailableRdsResponse withDataNodes(Consumer<List<AvailableDnInstance>> dataNodesSetter) {
        if (this.dataNodes == null) {
            this.dataNodes = new ArrayList<>();
        }
        dataNodesSetter.accept(this.dataNodes);
        return this;
    }

    /**
     * 可用后端DN信息。
     * @return dataNodes
     */
    public List<AvailableDnInstance> getDataNodes() {
        return dataNodes;
    }

    public void setDataNodes(List<AvailableDnInstance> dataNodes) {
        this.dataNodes = dataNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAvailableRdsResponse that = (ListAvailableRdsResponse) obj;
        return Objects.equals(this.dataNodes, that.dataNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableRdsResponse {\n");
        sb.append("    dataNodes: ").append(toIndentedString(dataNodes)).append("\n");
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
