package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/** NodeCert */
public class NodeCert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_num")

    private String serialNum;

    public NodeCert withId(String id) {
        this.id = id;
        return this;
    }

    /** 证书id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NodeCert withName(String name) {
        this.name = name;
        return this;
    }

    /** 证书名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeCert withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 证书的描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NodeCert withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 证书的创建时间
     * 
     * @return createdAt */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NodeCert withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /** 节点id
     * 
     * @return nodeId */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NodeCert withType(String type) {
        this.type = type;
        return this;
    }

    /** 证书类型，包含： - system：创建节点时会默认创建一套系统证书； - application：应用证书； - device：设备证书；
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NodeCert withSerialNum(String serialNum) {
        this.serialNum = serialNum;
        return this;
    }

    /** 证书序列号
     * 
     * @return serialNum */
    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeCert nodeCert = (NodeCert) o;
        return Objects.equals(this.id, nodeCert.id) && Objects.equals(this.name, nodeCert.name)
            && Objects.equals(this.description, nodeCert.description)
            && Objects.equals(this.createdAt, nodeCert.createdAt) && Objects.equals(this.nodeId, nodeCert.nodeId)
            && Objects.equals(this.type, nodeCert.type) && Objects.equals(this.serialNum, nodeCert.serialNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, createdAt, nodeId, type, serialNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeCert {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    serialNum: ").append(toIndentedString(serialNum)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
