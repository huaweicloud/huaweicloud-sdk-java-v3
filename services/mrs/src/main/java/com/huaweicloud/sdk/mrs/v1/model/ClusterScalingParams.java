package com.huaweicloud.sdk.mrs.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.TaskNodeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ClusterScalingParams
 */
public class ClusterScalingParams  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    

    private String orderId;
    /**
     * - scale_in：缩容 - scale_out：扩容
     */
    public static final class ScaleTypeEnum {

        
        /**
         * Enum SCALE_IN for value: "scale_in"
         */
        public static final ScaleTypeEnum SCALE_IN = new ScaleTypeEnum("scale_in");
        
        /**
         * Enum SCALE_OUT for value: "scale_out"
         */
        public static final ScaleTypeEnum SCALE_OUT = new ScaleTypeEnum("scale_out");
        

        private static final Map<String, ScaleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScaleTypeEnum> createStaticFields() {
            Map<String, ScaleTypeEnum> map = new HashMap<>();
            map.put("scale_in", SCALE_IN);
            map.put("scale_out", SCALE_OUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScaleTypeEnum(String value) {
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
        public static ScaleTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ScaleTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScaleTypeEnum(value);
            }
            return result;
        }

        public static ScaleTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScaleTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScaleTypeEnum) {
                return this.value.equals(((ScaleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scale_type")
    

    private ScaleTypeEnum scaleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_group")
    

    private String nodeGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="skip_bootstrap_scripts")
    

    private String skipBootstrapScripts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scale_without_start")
    

    private Boolean scaleWithoutStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_ids")
    
    private List<String> serverIds = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    

    private Integer instances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_node_info")
    

    private TaskNodeInfo taskNodeInfo;

    public ClusterScalingParams withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 扩容/缩容时系统获取的订单号，用户不需要配置。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    public ClusterScalingParams withScaleType(ScaleTypeEnum scaleType) {
        this.scaleType = scaleType;
        return this;
    }

    


    /**
     * - scale_in：缩容 - scale_out：扩容
     * @return scaleType
     */
    public ScaleTypeEnum getScaleType() {
        return scaleType;
    }

    public void setScaleType(ScaleTypeEnum scaleType) {
        this.scaleType = scaleType;
    }

    

    public ClusterScalingParams withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 扩容/缩容时新增或者减少节点的ID标识,参数值固定为node_orderadd。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public ClusterScalingParams withNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }

    


    /**
     * 扩容或缩容的节点组。 - 如果node_group为core_node_default_group，表示Core节点组。 - 如果node_group为task_node_default_group，表示Task节点组。  该字段可以为空，为空时，系统默认值为core_node_default_group。
     * @return nodeGroup
     */
    public String getNodeGroup() {
        return nodeGroup;
    }

    public void setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    

    public ClusterScalingParams withSkipBootstrapScripts(String skipBootstrapScripts) {
        this.skipBootstrapScripts = skipBootstrapScripts;
        return this;
    }

    


    /**
     * 是否跳过引导操作，默认为false，即执行引导操作。 仅在创建集群时配置了引导操作且扩容时有意义，表示扩容时是否在新增节点上执行创建集群时指定的引导操作。
     * @return skipBootstrapScripts
     */
    public String getSkipBootstrapScripts() {
        return skipBootstrapScripts;
    }

    public void setSkipBootstrapScripts(String skipBootstrapScripts) {
        this.skipBootstrapScripts = skipBootstrapScripts;
    }

    

    public ClusterScalingParams withScaleWithoutStart(Boolean scaleWithoutStart) {
        this.scaleWithoutStart = scaleWithoutStart;
        return this;
    }

    


    /**
     * 扩容后是否启动扩容节点上的组件。  - true：扩容后不启动组件。 - false：扩容后启动组件。
     * @return scaleWithoutStart
     */
    public Boolean getScaleWithoutStart() {
        return scaleWithoutStart;
    }

    public void setScaleWithoutStart(Boolean scaleWithoutStart) {
        this.scaleWithoutStart = scaleWithoutStart;
    }

    

    public ClusterScalingParams withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    
    public ClusterScalingParams addServerIdsItem(String serverIdsItem) {
        if(this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public ClusterScalingParams withServerIds(Consumer<List<String>> serverIdsSetter) {
        if(this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 缩容Task节点时指定待删除Task节点的ID列表。  - 当scale_type为扩容时，该参数不生效。 - 当scale_type为缩容且该参数不为空时，删除指定的Task节点。 - 当scale_type为缩容且server_ids为空时，按照系统规则自动选择删除Task节点。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    

    public ClusterScalingParams withInstances(Integer instances) {
        this.instances = instances;
        return this;
    }

    


    /**
     * 扩容或缩容的节点数。  - 扩容时的最大节点数为（500 - 集群Core/Task节点数）。例如，当前集群Core节点数为3，此处扩容的节点数必须小于等于497。     Core和Task节点总数最大值为500，如果用户需要的Core/Task节点数大于500，可以联系技术支持人员或者调用后台接口修改数据库。   - 缩容时Core节点数大于3或者Task节点数大于0可以进行节点删除。例如，当前集群Core节点和Task节点数均为5，Core节点可缩容的节点数为2（5减去3），Task节点可缩容节点数为小于等于5。
     * minimum: 1
     * @return instances
     */
    public Integer getInstances() {
        return instances;
    }

    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    

    public ClusterScalingParams withTaskNodeInfo(TaskNodeInfo taskNodeInfo) {
        this.taskNodeInfo = taskNodeInfo;
        return this;
    }

    public ClusterScalingParams withTaskNodeInfo(Consumer<TaskNodeInfo> taskNodeInfoSetter) {
        if(this.taskNodeInfo == null ){
            this.taskNodeInfo = new TaskNodeInfo();
            taskNodeInfoSetter.accept(this.taskNodeInfo);
        }
        
        return this;
    }


    /**
     * Get taskNodeInfo
     * @return taskNodeInfo
     */
    public TaskNodeInfo getTaskNodeInfo() {
        return taskNodeInfo;
    }

    public void setTaskNodeInfo(TaskNodeInfo taskNodeInfo) {
        this.taskNodeInfo = taskNodeInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterScalingParams clusterScalingParams = (ClusterScalingParams) o;
        return Objects.equals(this.orderId, clusterScalingParams.orderId) &&
            Objects.equals(this.scaleType, clusterScalingParams.scaleType) &&
            Objects.equals(this.nodeId, clusterScalingParams.nodeId) &&
            Objects.equals(this.nodeGroup, clusterScalingParams.nodeGroup) &&
            Objects.equals(this.skipBootstrapScripts, clusterScalingParams.skipBootstrapScripts) &&
            Objects.equals(this.scaleWithoutStart, clusterScalingParams.scaleWithoutStart) &&
            Objects.equals(this.serverIds, clusterScalingParams.serverIds) &&
            Objects.equals(this.instances, clusterScalingParams.instances) &&
            Objects.equals(this.taskNodeInfo, clusterScalingParams.taskNodeInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderId, scaleType, nodeId, nodeGroup, skipBootstrapScripts, scaleWithoutStart, serverIds, instances, taskNodeInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterScalingParams {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    scaleType: ").append(toIndentedString(scaleType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeGroup: ").append(toIndentedString(nodeGroup)).append("\n");
        sb.append("    skipBootstrapScripts: ").append(toIndentedString(skipBootstrapScripts)).append("\n");
        sb.append("    scaleWithoutStart: ").append(toIndentedString(scaleWithoutStart)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    taskNodeInfo: ").append(toIndentedString(taskNodeInfo)).append("\n");
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

