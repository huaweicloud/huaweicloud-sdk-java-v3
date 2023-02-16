package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.AutoScalingPolicy;
import com.huaweicloud.sdk.mrs.v2.model.ChargeInfo;
import com.huaweicloud.sdk.mrs.v2.model.Volume;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * NodeGroupV2
 */
public class NodeGroupV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_num")
    
    
    private Integer nodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_size")
    
    
    private String nodeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="root_volume")
    
    
    private Volume rootVolume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volume")
    
    
    private Volume dataVolume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volume_count")
    
    
    private Integer dataVolumeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_info")
    
    
    private ChargeInfo chargeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_scaling_policy")
    
    
    private AutoScalingPolicy autoScalingPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assigned_roles")
    
    
    private List<String> assignedRoles = null;
    
    public NodeGroupV2 withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * 节点组名称，最大长度64，支持大小写英文、数字以及“_”。节点组配置原则如下： - master_node_default_group：Master节点组，所有集群类型均需包含该节点组。 - core_node_analysis_group：分析Core节点组，分析集群、混合集群均需包含该节点组。 - core_node_streaming_group：流式Core节点组，流式集群和混合集群均需包含该节点组。 - task_node_analysis_group：分析Task节点组，分析集群和混合集群可根据需要选择该节点组。 - task_node_streaming_group：流式Task节点组，流式集群、混合集群可根据需要选择该节点组。 - node_group{x}：自定义集群节点组，可根据需要添加多个，最多支持添加9个该节点组。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    

    public NodeGroupV2 withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    


    /**
     * 节点数量，取值范围0～500，Core与Task节点总数最大为500个。
     * minimum: 0
     * maximum: 500
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    

    public NodeGroupV2 withNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
        return this;
    }

    


    /**
     * 节点的实例规格。 例如：c3.4xlarge.2.linux.bigdata。实例规格详细说明请参见[MRS所使用的弹性云服务器规格](https://support.huaweicloud.com/api-mrs/mrs_01_9006.html)和[MRS所使用的裸金属服务器规格](https://support.huaweicloud.com/api-mrs/mrs_01_9001.html)。 该参数建议从MRS控制台的集群创建页面获取对应区域对应版本所支持的规格。
     * @return nodeSize
     */
    public String getNodeSize() {
        return nodeSize;
    }

    public void setNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
    }

    

    public NodeGroupV2 withRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public NodeGroupV2 withRootVolume(Consumer<Volume> rootVolumeSetter) {
        if(this.rootVolume == null ){
            this.rootVolume = new Volume();
            rootVolumeSetter.accept(this.rootVolume);
        }
        
        return this;
    }


    /**
     * Get rootVolume
     * @return rootVolume
     */
    public Volume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
    }

    

    public NodeGroupV2 withDataVolume(Volume dataVolume) {
        this.dataVolume = dataVolume;
        return this;
    }

    public NodeGroupV2 withDataVolume(Consumer<Volume> dataVolumeSetter) {
        if(this.dataVolume == null ){
            this.dataVolume = new Volume();
            dataVolumeSetter.accept(this.dataVolume);
        }
        
        return this;
    }


    /**
     * Get dataVolume
     * @return dataVolume
     */
    public Volume getDataVolume() {
        return dataVolume;
    }

    public void setDataVolume(Volume dataVolume) {
        this.dataVolume = dataVolume;
    }

    

    public NodeGroupV2 withDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
        return this;
    }

    


    /**
     * 节点数据磁盘存储数目，取值范围：0～10。
     * minimum: 0
     * maximum: 10
     * @return dataVolumeCount
     */
    public Integer getDataVolumeCount() {
        return dataVolumeCount;
    }

    public void setDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
    }

    

    public NodeGroupV2 withChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public NodeGroupV2 withChargeInfo(Consumer<ChargeInfo> chargeInfoSetter) {
        if(this.chargeInfo == null ){
            this.chargeInfo = new ChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }
        
        return this;
    }


    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public ChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    

    public NodeGroupV2 withAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
        return this;
    }

    public NodeGroupV2 withAutoScalingPolicy(Consumer<AutoScalingPolicy> autoScalingPolicySetter) {
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

    

    public NodeGroupV2 withAssignedRoles(List<String> assignedRoles) {
        this.assignedRoles = assignedRoles;
        return this;
    }

    
    public NodeGroupV2 addAssignedRolesItem(String assignedRolesItem) {
        if(this.assignedRoles == null) {
            this.assignedRoles = new ArrayList<>();
        }
        this.assignedRoles.add(assignedRolesItem);
        return this;
    }

    public NodeGroupV2 withAssignedRoles(Consumer<List<String>> assignedRolesSetter) {
        if(this.assignedRoles == null) {
            this.assignedRoles = new ArrayList<>();
        }
        assignedRolesSetter.accept(this.assignedRoles);
        return this;
    }

    /**
     * 当集群类型为CUSTOM时，该参数必选。可以指定节点组中部署的角色，该参数是一个字符串数组，每个字符串表示一个角色表达式。 角色表达式定义： - 当该角色在节点组所有节点部署时： {role name}，如“DataNode”。 - 当该角色在节点组指定下标节点部署时：{role name}:{index1},{index2}…,{indexN}，如“NameNode:1,2”，下标从1开始计数。 - 部分角色支持多实例部署（即在一个节点部署多个同角色的实例）：{role name}[{instance count}]，如“EsNode[9]” 可选的角色请参考[MRS支持的角色与组件对应表](https://support.huaweicloud.com/api-mrs/mrs_02_0106.html)。
     * @return assignedRoles
     */
    public List<String> getAssignedRoles() {
        return assignedRoles;
    }

    public void setAssignedRoles(List<String> assignedRoles) {
        this.assignedRoles = assignedRoles;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeGroupV2 nodeGroupV2 = (NodeGroupV2) o;
        return Objects.equals(this.groupName, nodeGroupV2.groupName) &&
            Objects.equals(this.nodeNum, nodeGroupV2.nodeNum) &&
            Objects.equals(this.nodeSize, nodeGroupV2.nodeSize) &&
            Objects.equals(this.rootVolume, nodeGroupV2.rootVolume) &&
            Objects.equals(this.dataVolume, nodeGroupV2.dataVolume) &&
            Objects.equals(this.dataVolumeCount, nodeGroupV2.dataVolumeCount) &&
            Objects.equals(this.chargeInfo, nodeGroupV2.chargeInfo) &&
            Objects.equals(this.autoScalingPolicy, nodeGroupV2.autoScalingPolicy) &&
            Objects.equals(this.assignedRoles, nodeGroupV2.assignedRoles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupName, nodeNum, nodeSize, rootVolume, dataVolume, dataVolumeCount, chargeInfo, autoScalingPolicy, assignedRoles);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeGroupV2 {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodeSize: ").append(toIndentedString(nodeSize)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolume: ").append(toIndentedString(dataVolume)).append("\n");
        sb.append("    dataVolumeCount: ").append(toIndentedString(dataVolumeCount)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    autoScalingPolicy: ").append(toIndentedString(autoScalingPolicy)).append("\n");
        sb.append("    assignedRoles: ").append(toIndentedString(assignedRoles)).append("\n");
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

