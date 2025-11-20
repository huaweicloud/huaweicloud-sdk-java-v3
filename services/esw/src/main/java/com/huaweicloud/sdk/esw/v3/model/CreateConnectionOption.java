package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateConnectionOption
 */
public class CreateConnectionOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_ips")

    private List<String> fixedIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_infos")

    private List<RemoteInfosOption> remoteInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public CreateConnectionOption withFixedIps(List<String> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    public CreateConnectionOption addFixedIpsItem(String fixedIpsItem) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public CreateConnectionOption withFixedIps(Consumer<List<String>> fixedIpsSetter) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    /**
     * - 参数解释：下联面网口主备IP；ESW实例在本端二层子网中占用的主备接口IP。 - 约束限制：字符串列表，只能设置两个字符串，且每个字符串内容应该是标准IPv4格式；IP必须在二层子网网段范围内。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return fixedIps
     */
    public List<String> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<String> fixedIps) {
        this.fixedIps = fixedIps;
    }

    public CreateConnectionOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 参数解释：二层连接的名称。 - 约束限制：   - 长度范围为1~64个字符。   - 名称由中文、英文字母、数字、下划线（_）、中划线（-）、点（.）组成。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateConnectionOption withRemoteInfos(List<RemoteInfosOption> remoteInfos) {
        this.remoteInfos = remoteInfos;
        return this;
    }

    public CreateConnectionOption addRemoteInfosItem(RemoteInfosOption remoteInfosItem) {
        if (this.remoteInfos == null) {
            this.remoteInfos = new ArrayList<>();
        }
        this.remoteInfos.add(remoteInfosItem);
        return this;
    }

    public CreateConnectionOption withRemoteInfos(Consumer<List<RemoteInfosOption>> remoteInfosSetter) {
        if (this.remoteInfos == null) {
            this.remoteInfos = new ArrayList<>();
        }
        remoteInfosSetter.accept(this.remoteInfos);
        return this;
    }

    /**
     * - 参数解释：远端隧道信息。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return remoteInfos
     */
    public List<RemoteInfosOption> getRemoteInfos() {
        return remoteInfos;
    }

    public void setRemoteInfos(List<RemoteInfosOption> remoteInfos) {
        this.remoteInfos = remoteInfos;
    }

    public CreateConnectionOption withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * - 参数解释：二层连接关联的二层子网ID。 - 约束限制：   - 需要使用本租户下可操作的子网资源的ID；此值即为子网详情中的“网络ID”参数值。   - 带“-”的UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public CreateConnectionOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * - 参数解释：ESW所在VPC资源ID。 - 约束限制：   - 需要使用本租户下可操作的VPC资源的ID。   - 带“-”的UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateConnectionOption that = (CreateConnectionOption) obj;
        return Objects.equals(this.fixedIps, that.fixedIps) && Objects.equals(this.name, that.name)
            && Objects.equals(this.remoteInfos, that.remoteInfos) && Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixedIps, name, remoteInfos, virsubnetId, vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConnectionOption {\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remoteInfos: ").append(toIndentedString(remoteInfos)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
