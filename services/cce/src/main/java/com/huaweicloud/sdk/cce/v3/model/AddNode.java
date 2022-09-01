package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * 纳管节点参数。集群内已有节点支持通过重置进行重新安装并接入集群。
 */
public class AddNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverID")

    @JacksonXmlProperty(localName = "serverID")

    private UUID serverID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    @JacksonXmlProperty(localName = "spec")

    private ReinstallNodeSpec spec;

    public AddNode withServerID(UUID serverID) {
        this.serverID = serverID;
        return this;
    }

    /**
     * 服务器ID，获取方式请参见ECS/BMS相关资料。
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddNode addNode = (AddNode) o;
        return Objects.equals(this.serverID, addNode.serverID) && Objects.equals(this.spec, addNode.spec);
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
