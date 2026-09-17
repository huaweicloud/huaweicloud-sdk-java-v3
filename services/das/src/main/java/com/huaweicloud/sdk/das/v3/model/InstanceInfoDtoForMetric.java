package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息
 */
public class InstanceInfoDtoForMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_infos")

    private List<NodeInfoForMetric> nodeInfos = null;

    public InstanceInfoDtoForMetric withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public InstanceInfoDtoForMetric withNodeInfos(List<NodeInfoForMetric> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }

    public InstanceInfoDtoForMetric addNodeInfosItem(NodeInfoForMetric nodeInfosItem) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        this.nodeInfos.add(nodeInfosItem);
        return this;
    }

    public InstanceInfoDtoForMetric withNodeInfos(Consumer<List<NodeInfoForMetric>> nodeInfosSetter) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        nodeInfosSetter.accept(this.nodeInfos);
        return this;
    }

    /**
     * 实例信息列表
     * @return nodeInfos
     */
    public List<NodeInfoForMetric> getNodeInfos() {
        return nodeInfos;
    }

    public void setNodeInfos(List<NodeInfoForMetric> nodeInfos) {
        this.nodeInfos = nodeInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceInfoDtoForMetric that = (InstanceInfoDtoForMetric) obj;
        return Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.nodeInfos, that.nodeInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, nodeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceInfoDtoForMetric {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    nodeInfos: ").append(toIndentedString(nodeInfos)).append("\n");
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
