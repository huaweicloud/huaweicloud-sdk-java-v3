package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AutoScalingPolicyV2
 */
public class AutoScalingPolicyV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_group_name")

    private String nodeGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_name")

    private String resourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scaling_policy")

    private AutoScalingPolicyInfo autoScalingPolicy;

    public AutoScalingPolicyV2 withNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }

    /**
     * 节点组名称。必填参数。如果resource_pool_name为default，则创建节点组维度的弹性伸缩策略。如果resource_pool_name不为default，则在该节点组下创建对应资源池维度的策略。
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return nodeGroupName;
    }

    public void setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
    }

    public AutoScalingPolicyV2 withResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }

    /**
     * 资源池名称。必填参数。当集群版本不支持按指定资源池进行弹性伸缩时，需要填写为default资源池。不为default时删除指定资源池维度的弹性伸缩策略。
     * @return resourcePoolName
     */
    public String getResourcePoolName() {
        return resourcePoolName;
    }

    public void setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
    }

    public AutoScalingPolicyV2 withAutoScalingPolicy(AutoScalingPolicyInfo autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
        return this;
    }

    public AutoScalingPolicyV2 withAutoScalingPolicy(Consumer<AutoScalingPolicyInfo> autoScalingPolicySetter) {
        if (this.autoScalingPolicy == null) {
            this.autoScalingPolicy = new AutoScalingPolicyInfo();
            autoScalingPolicySetter.accept(this.autoScalingPolicy);
        }

        return this;
    }

    /**
     * Get autoScalingPolicy
     * @return autoScalingPolicy
     */
    public AutoScalingPolicyInfo getAutoScalingPolicy() {
        return autoScalingPolicy;
    }

    public void setAutoScalingPolicy(AutoScalingPolicyInfo autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoScalingPolicyV2 that = (AutoScalingPolicyV2) obj;
        return Objects.equals(this.nodeGroupName, that.nodeGroupName)
            && Objects.equals(this.resourcePoolName, that.resourcePoolName)
            && Objects.equals(this.autoScalingPolicy, that.autoScalingPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeGroupName, resourcePoolName, autoScalingPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoScalingPolicyV2 {\n");
        sb.append("    nodeGroupName: ").append(toIndentedString(nodeGroupName)).append("\n");
        sb.append("    resourcePoolName: ").append(toIndentedString(resourcePoolName)).append("\n");
        sb.append("    autoScalingPolicy: ").append(toIndentedString(autoScalingPolicy)).append("\n");
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
