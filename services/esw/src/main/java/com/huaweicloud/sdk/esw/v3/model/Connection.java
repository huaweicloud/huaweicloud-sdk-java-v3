package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Connection
 */
public class Connection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_ips")

    private List<String> fixedIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_infos")

    private List<RemoteInfosResult> remoteInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public Connection withFixedIps(List<String> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    public Connection addFixedIpsItem(String fixedIpsItem) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public Connection withFixedIps(Consumer<List<String>> fixedIpsSetter) {
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

    public Connection withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * - 参数解释：二层连接的唯一标识。 - 约束限制：带“-”的UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Connection withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * - 参数解释：ESW实例的唯一标识。 - 约束限制：带“-”的UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Connection withName(String name) {
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

    public Connection withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * - 参数解释：ESW实例所属项目ID。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Connection withRemoteInfos(List<RemoteInfosResult> remoteInfos) {
        this.remoteInfos = remoteInfos;
        return this;
    }

    public Connection addRemoteInfosItem(RemoteInfosResult remoteInfosItem) {
        if (this.remoteInfos == null) {
            this.remoteInfos = new ArrayList<>();
        }
        this.remoteInfos.add(remoteInfosItem);
        return this;
    }

    public Connection withRemoteInfos(Consumer<List<RemoteInfosResult>> remoteInfosSetter) {
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
    public List<RemoteInfosResult> getRemoteInfos() {
        return remoteInfos;
    }

    public void setRemoteInfos(List<RemoteInfosResult> remoteInfos) {
        this.remoteInfos = remoteInfos;
    }

    public Connection withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * - 参数解释：二层连接的状态。 - 约束限制：不涉及。 - 取值范围：   - pending：准备中   - connected：已连接   - disconnect：未连接   - failed：创建失败   - abnormal：异常 - 默认取值：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Connection withVirsubnetId(String virsubnetId) {
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

    public Connection withVpcId(String vpcId) {
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

    public Connection withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * - 参数解释：二层连接创建时间。 - 约束限制：UTC时间，格式为yyyy-MM-ddTHH:mm:ss。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Connection withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * - 参数解释：二层连接更新时间。 - 约束限制：UTC时间，格式为yyyy-MM-ddTHH:mm:ss。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Connection that = (Connection) obj;
        return Objects.equals(this.fixedIps, that.fixedIps) && Objects.equals(this.id, that.id)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.remoteInfos, that.remoteInfos)
            && Objects.equals(this.status, that.status) && Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixedIps,
            id,
            instanceId,
            name,
            projectId,
            remoteInfos,
            status,
            virsubnetId,
            vpcId,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Connection {\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    remoteInfos: ").append(toIndentedString(remoteInfos)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
