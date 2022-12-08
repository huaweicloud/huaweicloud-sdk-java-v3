package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 纳管节点参数。满足条件的已有服务器，支持通过纳管节点方式安装并接入集群，重置过程将清理节点上系统盘、数据盘数据，并作为新节点接入Kuberntes集群，请提前备份迁移关键数据。其中节点池内节点重置时不支持外部指定配置，将以节点池配置进行校验并重装，以保证同节点池节点一致性。 
 */
public class ResetNodeList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeList")

    private List<ResetNode> nodeList = null;

    public ResetNodeList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本，固定值“v3”。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ResetNodeList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * API类型，固定值“List”。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ResetNodeList withNodeList(List<ResetNode> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public ResetNodeList addNodeListItem(ResetNode nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public ResetNodeList withNodeList(Consumer<List<ResetNode>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * 重置节点列表
     * @return nodeList
     */
    public List<ResetNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<ResetNode> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetNodeList resetNodeList = (ResetNodeList) o;
        return Objects.equals(this.apiVersion, resetNodeList.apiVersion)
            && Objects.equals(this.kind, resetNodeList.kind) && Objects.equals(this.nodeList, resetNodeList.nodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, nodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetNodeList {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
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
