package com.huaweicloud.sdk.mrs.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.AutoScalingPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AutoScalingPolicyReqV11
 */
public class AutoScalingPolicyReqV11  {

    /**
     * 弹性伸缩规则适用的节点类型，当前只支持task节点。
     */
    public static final class NodeGroupEnum {

        
        /**
         * Enum TASK_NODE_DEFAULT_GROUP for value: "task_node_default_group"
         */
        public static final NodeGroupEnum TASK_NODE_DEFAULT_GROUP = new NodeGroupEnum("task_node_default_group");
        

        private static final Map<String, NodeGroupEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeGroupEnum> createStaticFields() {
            Map<String, NodeGroupEnum> map = new HashMap<>();
            map.put("task_node_default_group", TASK_NODE_DEFAULT_GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeGroupEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NodeGroupEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NodeGroupEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NodeGroupEnum(value);
            }
            return result;
        }

        public static NodeGroupEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NodeGroupEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodeGroupEnum) {
                return this.value.equals(((NodeGroupEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_group")
    
    
    private NodeGroupEnum nodeGroup;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_scaling_policy")
    
    
    private AutoScalingPolicy autoScalingPolicy;

    public AutoScalingPolicyReqV11 withNodeGroup(NodeGroupEnum nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }

    


    /**
     * 弹性伸缩规则适用的节点类型，当前只支持task节点。
     * @return nodeGroup
     */
    public NodeGroupEnum getNodeGroup() {
        return nodeGroup;
    }

    public void setNodeGroup(NodeGroupEnum nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    

    public AutoScalingPolicyReqV11 withAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
        return this;
    }

    public AutoScalingPolicyReqV11 withAutoScalingPolicy(Consumer<AutoScalingPolicy> autoScalingPolicySetter) {
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
        AutoScalingPolicyReqV11 autoScalingPolicyReqV11 = (AutoScalingPolicyReqV11) o;
        return Objects.equals(this.nodeGroup, autoScalingPolicyReqV11.nodeGroup) &&
            Objects.equals(this.autoScalingPolicy, autoScalingPolicyReqV11.autoScalingPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeGroup, autoScalingPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoScalingPolicyReqV11 {\n");
        sb.append("    nodeGroup: ").append(toIndentedString(nodeGroup)).append("\n");
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

