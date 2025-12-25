package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentConfigurationInfo
 */
public class ComponentConfigurationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_status")

    private String configurationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<ComponentConfigurationParamVo> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_status")

    private String nodeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    public ComponentConfigurationInfo withConfigurationStatus(String configurationStatus) {
        this.configurationStatus = configurationStatus;
        return this;
    }

    /**
     * 节点配置状态 UN_SAVED 未保存 SAVE_AND_UN_DEPLOY 保存未部署 DEPLOYING正在部署 MOVE_AND_UN_DEPLOY 移除未应用 FAIL_DEPLOY部署失败 DEPLOYED已部署
     * @return configurationStatus
     */
    public String getConfigurationStatus() {
        return configurationStatus;
    }

    public void setConfigurationStatus(String configurationStatus) {
        this.configurationStatus = configurationStatus;
    }

    public ComponentConfigurationInfo withList(List<ComponentConfigurationParamVo> list) {
        this.list = list;
        return this;
    }

    public ComponentConfigurationInfo addListItem(ComponentConfigurationParamVo listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ComponentConfigurationInfo withList(Consumer<List<ComponentConfigurationParamVo>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 文件参数信息
     * @return list
     */
    public List<ComponentConfigurationParamVo> getList() {
        return list;
    }

    public void setList(List<ComponentConfigurationParamVo> list) {
        this.list = list;
    }

    public ComponentConfigurationInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ComponentConfigurationInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ComponentConfigurationInfo withNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    /**
     * 枚举 节点状态 NORMAL正常 ANOMALIES异常 FAULTS 故障 LOST_CONTACT 失联
     * @return nodeStatus
     */
    public String getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public ComponentConfigurationInfo withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 节点规格
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentConfigurationInfo that = (ComponentConfigurationInfo) obj;
        return Objects.equals(this.configurationStatus, that.configurationStatus)
            && Objects.equals(this.list, that.list) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.nodeStatus, that.nodeStatus)
            && Objects.equals(this.specification, that.specification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationStatus, list, nodeId, nodeName, nodeStatus, specification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentConfigurationInfo {\n");
        sb.append("    configurationStatus: ").append(toIndentedString(configurationStatus)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    nodeStatus: ").append(toIndentedString(nodeStatus)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
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
