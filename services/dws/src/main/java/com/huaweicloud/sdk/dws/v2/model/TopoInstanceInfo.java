package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 集群实例信息。 **取值范围**： 不涉及。
 */
public class TopoInstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_ip")

    private String manageIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_ip")

    private String trafficIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_ip")

    private String internalIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_mgnt_ip")

    private String internalMgntIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private String eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb")

    private String elb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    public TopoInstanceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 实例ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TopoInstanceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 实例名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TopoInstanceInfo withManageIp(String manageIp) {
        this.manageIp = manageIp;
        return this;
    }

    /**
     * **参数解释**： 实例管理IP。 **取值范围**： 不涉及。
     * @return manageIp
     */
    public String getManageIp() {
        return manageIp;
    }

    public void setManageIp(String manageIp) {
        this.manageIp = manageIp;
    }

    public TopoInstanceInfo withTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
        return this;
    }

    /**
     * **参数解释**： 业务IP。 **取值范围**： 不涉及。
     * @return trafficIp
     */
    public String getTrafficIp() {
        return trafficIp;
    }

    public void setTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
    }

    public TopoInstanceInfo withInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    /**
     * **参数解释**： 内部通信IP。 **取值范围**： 不涉及。
     * @return internalIp
     */
    public String getInternalIp() {
        return internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    public TopoInstanceInfo withInternalMgntIp(String internalMgntIp) {
        this.internalMgntIp = internalMgntIp;
        return this;
    }

    /**
     * **参数解释**： 内部管理IP。 **取值范围**： 不涉及。
     * @return internalMgntIp
     */
    public String getInternalMgntIp() {
        return internalMgntIp;
    }

    public void setInternalMgntIp(String internalMgntIp) {
        this.internalMgntIp = internalMgntIp;
    }

    public TopoInstanceInfo withEip(String eip) {
        this.eip = eip;
        return this;
    }

    /**
     * **参数解释**： 公网IP信息。 **取值范围**： 不涉及。
     * @return eip
     */
    public String getEip() {
        return eip;
    }

    public void setEip(String eip) {
        this.eip = eip;
    }

    public TopoInstanceInfo withElb(String elb) {
        this.elb = elb;
        return this;
    }

    /**
     * **参数解释**： elb地址。 **取值范围**： 不涉及。
     * @return elb
     */
    public String getElb() {
        return elb;
    }

    public void setElb(String elb) {
        this.elb = elb;
    }

    public TopoInstanceInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 节点状态。 **取值范围**： - 100：创建中 - 200：可用 - 300：不可用 - 400：已删除 - 303：创建失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TopoInstanceInfo withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * **参数解释**： 可用区编码。 **取值范围**： 不涉及。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopoInstanceInfo that = (TopoInstanceInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.manageIp, that.manageIp) && Objects.equals(this.trafficIp, that.trafficIp)
            && Objects.equals(this.internalIp, that.internalIp)
            && Objects.equals(this.internalMgntIp, that.internalMgntIp) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.elb, that.elb) && Objects.equals(this.status, that.status)
            && Objects.equals(this.azCode, that.azCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manageIp, trafficIp, internalIp, internalMgntIp, eip, elb, status, azCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopoInstanceInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    manageIp: ").append(toIndentedString(manageIp)).append("\n");
        sb.append("    trafficIp: ").append(toIndentedString(trafficIp)).append("\n");
        sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
        sb.append("    internalMgntIp: ").append(toIndentedString(internalMgntIp)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    elb: ").append(toIndentedString(elb)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
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
