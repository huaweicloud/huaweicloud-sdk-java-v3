package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeGroupV11
 */
public class NodeGroupV11 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_size")

    private String nodeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume_size")

    private String rootVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume_type")

    private String rootVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_type")

    private String dataVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_count")

    private Integer dataVolumeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_size")

    private Integer dataVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scaling_policy")

    private AutoScalingPolicy autoScalingPolicy;

    public NodeGroupV11 withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 节点组名。 - master_node_default_group - core_node_analysis_group - core_node_streaming_group - task_node_analysis_group - task_node_streaming_group
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public NodeGroupV11 withNodeNum(Integer nodeNum) {
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

    public NodeGroupV11 withNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
        return this;
    }

    /**
     * 节点的实例规格，例如：c3.4xlarge.2.linux.bigdata。MRS当前支持主机规格的配型由CPU+内存+Disk共同决定。实例规格详细说明请参见[MRS所使用的弹性云服务器规格](https://support.huaweicloud.com/api-mrs/mrs_01_9006.html)和[MRS所使用的裸金属服务器规格](https://support.huaweicloud.com/api-mrs/mrs_01_9001.html)。 该参数建议从MRS控制台的集群创建页面获取对应区域对应版本所支持的规格。
     * @return nodeSize
     */
    public String getNodeSize() {
        return nodeSize;
    }

    public void setNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
    }

    public NodeGroupV11 withRootVolumeSize(String rootVolumeSize) {
        this.rootVolumeSize = rootVolumeSize;
        return this;
    }

    /**
     * 节点系统磁盘存储大小。
     * @return rootVolumeSize
     */
    public String getRootVolumeSize() {
        return rootVolumeSize;
    }

    public void setRootVolumeSize(String rootVolumeSize) {
        this.rootVolumeSize = rootVolumeSize;
    }

    public NodeGroupV11 withRootVolumeType(String rootVolumeType) {
        this.rootVolumeType = rootVolumeType;
        return this;
    }

    /**
     * 节点系统磁盘存储类别，目前支持SATA、SAS和SSD。 - SATA：普通IO - SAS：高IO - SSD：超高IO - GPSSD：通用型SSD
     * @return rootVolumeType
     */
    public String getRootVolumeType() {
        return rootVolumeType;
    }

    public void setRootVolumeType(String rootVolumeType) {
        this.rootVolumeType = rootVolumeType;
    }

    public NodeGroupV11 withDataVolumeType(String dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
        return this;
    }

    /**
     * 节点数据磁盘存储类别，目前支持SATA、SAS和SSD。 - SATA：普通IO - SAS：高IO - SSD：超高IO - GPSSD：通用型SSD
     * @return dataVolumeType
     */
    public String getDataVolumeType() {
        return dataVolumeType;
    }

    public void setDataVolumeType(String dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
    }

    public NodeGroupV11 withDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
        return this;
    }

    /**
     * 节点数据磁盘存储数目 取值范围：0～10。
     * @return dataVolumeCount
     */
    public Integer getDataVolumeCount() {
        return dataVolumeCount;
    }

    public void setDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
    }

    public NodeGroupV11 withDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
        return this;
    }

    /**
     * 节点数据磁盘存储大小 取值范围：100GB～32000GB。
     * @return dataVolumeSize
     */
    public Integer getDataVolumeSize() {
        return dataVolumeSize;
    }

    public void setDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
    }

    public NodeGroupV11 withAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
        return this;
    }

    public NodeGroupV11 withAutoScalingPolicy(Consumer<AutoScalingPolicy> autoScalingPolicySetter) {
        if (this.autoScalingPolicy == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeGroupV11 that = (NodeGroupV11) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.nodeSize, that.nodeSize) && Objects.equals(this.rootVolumeSize, that.rootVolumeSize)
            && Objects.equals(this.rootVolumeType, that.rootVolumeType)
            && Objects.equals(this.dataVolumeType, that.dataVolumeType)
            && Objects.equals(this.dataVolumeCount, that.dataVolumeCount)
            && Objects.equals(this.dataVolumeSize, that.dataVolumeSize)
            && Objects.equals(this.autoScalingPolicy, that.autoScalingPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName,
            nodeNum,
            nodeSize,
            rootVolumeSize,
            rootVolumeType,
            dataVolumeType,
            dataVolumeCount,
            dataVolumeSize,
            autoScalingPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeGroupV11 {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodeSize: ").append(toIndentedString(nodeSize)).append("\n");
        sb.append("    rootVolumeSize: ").append(toIndentedString(rootVolumeSize)).append("\n");
        sb.append("    rootVolumeType: ").append(toIndentedString(rootVolumeType)).append("\n");
        sb.append("    dataVolumeType: ").append(toIndentedString(dataVolumeType)).append("\n");
        sb.append("    dataVolumeCount: ").append(toIndentedString(dataVolumeCount)).append("\n");
        sb.append("    dataVolumeSize: ").append(toIndentedString(dataVolumeSize)).append("\n");
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
