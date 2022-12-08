package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyRsuRequestDTO
 */
public class ModifyRsuRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_description")

    private String positionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_edge_num")

    private Integer relatedEdgeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intersection_id")

    private String intersectionId;

    public ModifyRsuRequestDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：RSU的名字。  **取值范围**：长度不低于1不超过128，只允许中文、字母、数字、下划线（_）、连接符（-）的组合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModifyRsuRequestDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：RSU的描述。  **取值范围**：只允许中文、字母、数字、下划线（_）、中文分号（；）、中文冒号（：）、中文问号（？）、中文感叹号（！）中文逗号（，）、中文句号（。）、英文分号（;）、英文冒号（:）、英文逗号（,）、英文句号（.）、英文问号（?）、英文感叹号（!）、顿号（、）、连接符（-）的组合。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModifyRsuRequestDTO withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数说明**：RSU的IP。满足IP的格式，例如127.0.0.1。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ModifyRsuRequestDTO withPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
        return this;
    }

    /**
     * **参数说明**：安装位置编码，由用户自定义。  **取值范围**：长度不低于1不超过128，只允许字母、数字、下划线（_）的组合。
     * @return positionDescription
     */
    public String getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }

    public ModifyRsuRequestDTO withRelatedEdgeNum(Integer relatedEdgeNum) {
        this.relatedEdgeNum = relatedEdgeNum;
        return this;
    }

    /**
     * **参数说明**：RSU可关联的Edge的数量，修改值需大于等于当前已连接设备。
     * minimum: 0
     * maximum: 64
     * @return relatedEdgeNum
     */
    public Integer getRelatedEdgeNum() {
        return relatedEdgeNum;
    }

    public void setRelatedEdgeNum(Integer relatedEdgeNum) {
        this.relatedEdgeNum = relatedEdgeNum;
    }

    public ModifyRsuRequestDTO withIntersectionId(String intersectionId) {
        this.intersectionId = intersectionId;
        return this;
    }

    /**
     * **参数说明**：在地图中，rsu所在区域对应的路口ID，也即区域ID拼接路口ID，格式为：region-node_id。其中路网最基本的构成即节点和节点之间连接的路段。节点可以是路口，也可以是一条 路的端点。一个节点的ID在同一个区域内是唯一的。
     * @return intersectionId
     */
    public String getIntersectionId() {
        return intersectionId;
    }

    public void setIntersectionId(String intersectionId) {
        this.intersectionId = intersectionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyRsuRequestDTO modifyRsuRequestDTO = (ModifyRsuRequestDTO) o;
        return Objects.equals(this.name, modifyRsuRequestDTO.name)
            && Objects.equals(this.description, modifyRsuRequestDTO.description)
            && Objects.equals(this.ip, modifyRsuRequestDTO.ip)
            && Objects.equals(this.positionDescription, modifyRsuRequestDTO.positionDescription)
            && Objects.equals(this.relatedEdgeNum, modifyRsuRequestDTO.relatedEdgeNum)
            && Objects.equals(this.intersectionId, modifyRsuRequestDTO.intersectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, ip, positionDescription, relatedEdgeNum, intersectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyRsuRequestDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    positionDescription: ").append(toIndentedString(positionDescription)).append("\n");
        sb.append("    relatedEdgeNum: ").append(toIndentedString(relatedEdgeNum)).append("\n");
        sb.append("    intersectionId: ").append(toIndentedString(intersectionId)).append("\n");
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
