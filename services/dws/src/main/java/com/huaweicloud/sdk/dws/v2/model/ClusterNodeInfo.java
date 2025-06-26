package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 集群节点信息。 **取值范围**： 不涉及。
 */
public class ClusterNodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_status")

    private String subStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private String spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_create_type")

    private String instCreateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_name")

    private String aliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    public ClusterNodeInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 节点ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterNodeInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 节点名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterNodeInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 节点状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterNodeInfo withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /**
     * **参数解释**： 节点子状态。 **取值范围**： 不涉及。
     * @return subStatus
     */
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public ClusterNodeInfo withSpec(String spec) {
        this.spec = spec;
        return this;
    }

    /**
     * **参数解释**： 节点规格。 **取值范围**： 不涉及。
     * @return spec
     */
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public ClusterNodeInfo withInstCreateType(String instCreateType) {
        this.instCreateType = instCreateType;
        return this;
    }

    /**
     * **参数解释**： 实例创建类型。 **取值范围**： - INST：已使用 - NODE：空闲节点
     * @return instCreateType
     */
    public String getInstCreateType() {
        return instCreateType;
    }

    public void setInstCreateType(String instCreateType) {
        this.instCreateType = instCreateType;
    }

    public ClusterNodeInfo withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * **参数解释**： 节点别名。 **取值范围**： 不涉及。
     * @return aliasName
     */
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public ClusterNodeInfo withAzCode(String azCode) {
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
        ClusterNodeInfo that = (ClusterNodeInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.subStatus, that.subStatus)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.instCreateType, that.instCreateType)
            && Objects.equals(this.aliasName, that.aliasName) && Objects.equals(this.azCode, that.azCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, subStatus, spec, instCreateType, aliasName, azCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterNodeInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    instCreateType: ").append(toIndentedString(instCreateType)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
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
