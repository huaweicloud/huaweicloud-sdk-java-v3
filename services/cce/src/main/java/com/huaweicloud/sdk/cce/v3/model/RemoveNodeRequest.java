package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RemoveNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removeNodeSystemSecurityGroup")

    private Boolean removeNodeSystemSecurityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RemoveNodesTask body;

    public RemoveNodeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RemoveNodeRequest withRemoveNodeSystemSecurityGroup(Boolean removeNodeSystemSecurityGroup) {
        this.removeNodeSystemSecurityGroup = removeNodeSystemSecurityGroup;
        return this;
    }

    /**
     * **参数解释**： 移除节点时是否解绑节点默认安全组。 **约束限制**： 不涉及 **取值范围**： - false：移除节点时保留节点默认安全组 - true：移除节点时解绑节点默认安全组  **默认取值**： false
     * @return removeNodeSystemSecurityGroup
     */
    public Boolean getRemoveNodeSystemSecurityGroup() {
        return removeNodeSystemSecurityGroup;
    }

    public void setRemoveNodeSystemSecurityGroup(Boolean removeNodeSystemSecurityGroup) {
        this.removeNodeSystemSecurityGroup = removeNodeSystemSecurityGroup;
    }

    public RemoveNodeRequest withBody(RemoveNodesTask body) {
        this.body = body;
        return this;
    }

    public RemoveNodeRequest withBody(Consumer<RemoveNodesTask> bodySetter) {
        if (this.body == null) {
            this.body = new RemoveNodesTask();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RemoveNodesTask getBody() {
        return body;
    }

    public void setBody(RemoveNodesTask body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveNodeRequest that = (RemoveNodeRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.removeNodeSystemSecurityGroup, that.removeNodeSystemSecurityGroup)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, removeNodeSystemSecurityGroup, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveNodeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    removeNodeSystemSecurityGroup: ")
            .append(toIndentedString(removeNodeSystemSecurityGroup))
            .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
