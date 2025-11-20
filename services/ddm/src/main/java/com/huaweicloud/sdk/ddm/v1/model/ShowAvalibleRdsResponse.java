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
public class ShowAvalibleRdsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_data_nodes")

    private List<TargetDn4Restore> targetDataNodes = null;

    public ShowAvalibleRdsResponse withTargetDataNodes(List<TargetDn4Restore> targetDataNodes) {
        this.targetDataNodes = targetDataNodes;
        return this;
    }

    public ShowAvalibleRdsResponse addTargetDataNodesItem(TargetDn4Restore targetDataNodesItem) {
        if (this.targetDataNodes == null) {
            this.targetDataNodes = new ArrayList<>();
        }
        this.targetDataNodes.add(targetDataNodesItem);
        return this;
    }

    public ShowAvalibleRdsResponse withTargetDataNodes(Consumer<List<TargetDn4Restore>> targetDataNodesSetter) {
        if (this.targetDataNodes == null) {
            this.targetDataNodes = new ArrayList<>();
        }
        targetDataNodesSetter.accept(this.targetDataNodes);
        return this;
    }

    /**
     * 可用目标DN。
     * @return targetDataNodes
     */
    public List<TargetDn4Restore> getTargetDataNodes() {
        return targetDataNodes;
    }

    public void setTargetDataNodes(List<TargetDn4Restore> targetDataNodes) {
        this.targetDataNodes = targetDataNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvalibleRdsResponse that = (ShowAvalibleRdsResponse) obj;
        return Objects.equals(this.targetDataNodes, that.targetDataNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetDataNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvalibleRdsResponse {\n");
        sb.append("    targetDataNodes: ").append(toIndentedString(targetDataNodes)).append("\n");
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
