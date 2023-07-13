package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddRsuDTO
 */
public class AddRsuDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "esn")

    private String esn;

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
    @JsonProperty(value = "rsu_model_id")

    private String rsuModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intersection_id")

    private String intersectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    public AddRsuDTO withName(String name) {
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

    public AddRsuDTO withDescription(String description) {
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

    public AddRsuDTO withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * **参数说明**：RSU的设备序列号。  **取值范围**：只允许字母、数字、下划线（_）的组合。
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public AddRsuDTO withIp(String ip) {
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

    public AddRsuDTO withPositionDescription(String positionDescription) {
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

    public AddRsuDTO withRelatedEdgeNum(Integer relatedEdgeNum) {
        this.relatedEdgeNum = relatedEdgeNum;
        return this;
    }

    /**
     * **参数说明**：RSU可关联的Edge的数量。
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

    public AddRsuDTO withRsuModelId(String rsuModelId) {
        this.rsuModelId = rsuModelId;
        return this;
    }

    /**
     * **参数说明**：RSU型号ID，用于唯一标识一个RSU型号，在平台创建RSU型号后由平台分配获得，获取方法可参见 [创建RSU型号](https://support.huaweicloud.com/api-v2x/v2x_04_0020.html)。  **取值范围**：长度不低于1不超过36，只允许字母、数字、连接符（-）的组合。  **该字段仅供使用MQTT协议RSU设备的用户输入。使用websocket协议RSU设备的用户需忽略此字段。**
     * @return rsuModelId
     */
    public String getRsuModelId() {
        return rsuModelId;
    }

    public void setRsuModelId(String rsuModelId) {
        this.rsuModelId = rsuModelId;
    }

    public AddRsuDTO withIntersectionId(String intersectionId) {
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

    public AddRsuDTO withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * **参数说明**：MQTT协议RSU密钥，若携带了rsu_model_id参数，则该字段必填。RSU创建后该字段无法修改，查询RSU及查询RSU列表时该字段均不返回。  **取值范围**：只允许数字、小写字母a-f、大写字母A-F的组合。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddRsuDTO that = (AddRsuDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.esn, that.esn) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.positionDescription, that.positionDescription)
            && Objects.equals(this.relatedEdgeNum, that.relatedEdgeNum)
            && Objects.equals(this.rsuModelId, that.rsuModelId)
            && Objects.equals(this.intersectionId, that.intersectionId) && Objects.equals(this.secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, esn, ip, positionDescription, relatedEdgeNum, rsuModelId, intersectionId, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRsuDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    positionDescription: ").append(toIndentedString(positionDescription)).append("\n");
        sb.append("    relatedEdgeNum: ").append(toIndentedString(relatedEdgeNum)).append("\n");
        sb.append("    rsuModelId: ").append(toIndentedString(rsuModelId)).append("\n");
        sb.append("    intersectionId: ").append(toIndentedString(intersectionId)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
