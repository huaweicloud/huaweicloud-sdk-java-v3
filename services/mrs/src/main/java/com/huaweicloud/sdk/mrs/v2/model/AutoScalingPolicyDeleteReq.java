package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 删除弹性伸缩策略请求。
 */
public class AutoScalingPolicyDeleteReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_group_name")

    private String nodeGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_name")

    private String resourcePoolName;

    public AutoScalingPolicyDeleteReq withNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }

    /**
     * 节点组名称。如果resource_pool_name为default，则删除节点组维度的弹性伸缩策略。如果resource_pool_name不为default，则在该节点组下删除对应资源池维度的策略。
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return nodeGroupName;
    }

    public void setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
    }

    public AutoScalingPolicyDeleteReq withResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }

    /**
     * 资源池名称。当集群版本不支持按指定资源池进行弹性伸缩时，需要填写为default资源池。不为default时删除指定资源池维度的弹性伸缩策略。
     * @return resourcePoolName
     */
    public String getResourcePoolName() {
        return resourcePoolName;
    }

    public void setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoScalingPolicyDeleteReq that = (AutoScalingPolicyDeleteReq) obj;
        return Objects.equals(this.nodeGroupName, that.nodeGroupName)
            && Objects.equals(this.resourcePoolName, that.resourcePoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeGroupName, resourcePoolName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoScalingPolicyDeleteReq {\n");
        sb.append("    nodeGroupName: ").append(toIndentedString(nodeGroupName)).append("\n");
        sb.append("    resourcePoolName: ").append(toIndentedString(resourcePoolName)).append("\n");
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
