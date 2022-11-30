package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.AutoScalingPolicy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AutoScalingPolicyV2
 */
public class AutoScalingPolicyV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_group_name")
    
    
    private String nodeGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_pool_name")
    
    
    private String resourcePoolName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_scaling_policy")
    
    
    private AutoScalingPolicy autoScalingPolicy;

    public AutoScalingPolicyV2 withNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }

    


    /**
     * 节点组名称。
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
     * 资源计划名称
     * @return resourcePoolName
     */
    public String getResourcePoolName() {
        return resourcePoolName;
    }

    public void setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
    }

    

    public AutoScalingPolicyV2 withAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
        return this;
    }

    public AutoScalingPolicyV2 withAutoScalingPolicy(Consumer<AutoScalingPolicy> autoScalingPolicySetter) {
        if(this.autoScalingPolicy == null ){
            this.autoScalingPolicy = new AutoScalingPolicy();
            autoScalingPolicySetter.accept(this.autoScalingPolicy);
        }
        
        return this;
    }


    /**
     * Get autoScalingPolicy
     * @return autoScalingPolicy
     */
    public AutoScalingPolicy getAutoScalingPolicy() {
        return autoScalingPolicy;
    }

    public void setAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoScalingPolicyV2 autoScalingPolicyV2 = (AutoScalingPolicyV2) o;
        return Objects.equals(this.nodeGroupName, autoScalingPolicyV2.nodeGroupName) &&
            Objects.equals(this.resourcePoolName, autoScalingPolicyV2.resourcePoolName) &&
            Objects.equals(this.autoScalingPolicy, autoScalingPolicyV2.autoScalingPolicy);
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

