package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * 纳管节点参数。集群内已有节点支持通过重置进行重新安装并接入集群。
 */
public class AddNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverID")

    private UUID serverID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ReinstallNodeSpec spec;

    public AddNode withServerID(UUID serverID) {
        this.serverID = serverID;
        return this;
    }

    /**
     * **参数解释**： 服务器ID，从ECS/BMS控制台获取。 > 获取方式:在控制台的“服务列表”中，单击“计算 > 弹性云服务器 ECS/裸金属服务器 BMS”，单击服务器的名称，在服务器详情页的“基本信息”页签下找到“ID”字段复制即可。  **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return serverID
     */
    public UUID getServerID() {
        return serverID;
    }

    public void setServerID(UUID serverID) {
        this.serverID = serverID;
    }

    public AddNode withSpec(ReinstallNodeSpec spec) {
        this.spec = spec;
        return this;
    }

    public AddNode withSpec(Consumer<ReinstallNodeSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ReinstallNodeSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ReinstallNodeSpec getSpec() {
        return spec;
    }

    public void setSpec(ReinstallNodeSpec spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddNode that = (AddNode) obj;
        return Objects.equals(this.serverID, that.serverID) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverID, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddNode {\n");
        sb.append("    serverID: ").append(toIndentedString(serverID)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
