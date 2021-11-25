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
 * TaskNodeGroups
 */
public class TaskNodeGroups  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_num")
    
    
    private Integer nodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_size")
    
    
    private String nodeSize;
    /**
     * Task节点数据磁盘存储类别，目前支持SATA、SAS和SSD。 - SATA：普通IO - SAS：高IO - SSD：超高IO - GPSSD：通用型SSD
     */
    public static final class DataVolumeTypeEnum {

        
        /**
         * Enum SATA for value: "SATA"
         */
        public static final DataVolumeTypeEnum SATA = new DataVolumeTypeEnum("SATA");
        
        /**
         * Enum SAS for value: "SAS"
         */
        public static final DataVolumeTypeEnum SAS = new DataVolumeTypeEnum("SAS");
        
        /**
         * Enum SSD for value: "SSD"
         */
        public static final DataVolumeTypeEnum SSD = new DataVolumeTypeEnum("SSD");
        
        /**
         * Enum GPSSD for value: "GPSSD"
         */
        public static final DataVolumeTypeEnum GPSSD = new DataVolumeTypeEnum("GPSSD");
        

        private static final Map<String, DataVolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataVolumeTypeEnum> createStaticFields() {
            Map<String, DataVolumeTypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("GPSSD", GPSSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataVolumeTypeEnum(String value) {
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
        public static DataVolumeTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DataVolumeTypeEnum(value);
            }
            return result;
        }

        public static DataVolumeTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataVolumeTypeEnum) {
                return this.value.equals(((DataVolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volume_type")
    
    
    private DataVolumeTypeEnum dataVolumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volume_count")
    
    
    private Integer dataVolumeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volume_size")
    
    
    private Integer dataVolumeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_scaling_policy")
    
    
    private AutoScalingPolicy autoScalingPolicy;

    public TaskNodeGroups withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    


    /**
     * Task节点节点数量，取值范围0～500，Core与Task节点总数最大为500个。
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

    

    public TaskNodeGroups withNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
        return this;
    }

    


    /**
     * Task节点的实例规格，例如：c3.4xlarge.2.linux.bigdata。实例规格详细说明请参见[MRS所使用的弹性云服务器规格](https://support.huaweicloud.com/api-mrs/mrs_01_9006.html)和[MRS所使用的裸金属服务器规格](https://support.huaweicloud.com/api-mrs/mrs_01_9001.html)。 该参数建议从MRS控制台的集群创建页面获取对应区域对应版本所支持的规格。
     * @return nodeSize
     */
    public String getNodeSize() {
        return nodeSize;
    }

    public void setNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
    }

    

    public TaskNodeGroups withDataVolumeType(DataVolumeTypeEnum dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
        return this;
    }

    


    /**
     * Task节点数据磁盘存储类别，目前支持SATA、SAS和SSD。 - SATA：普通IO - SAS：高IO - SSD：超高IO - GPSSD：通用型SSD
     * @return dataVolumeType
     */
    public DataVolumeTypeEnum getDataVolumeType() {
        return dataVolumeType;
    }

    public void setDataVolumeType(DataVolumeTypeEnum dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
    }

    

    public TaskNodeGroups withDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
        return this;
    }

    


    /**
     * Task节点数据磁盘存储数目，取值范围：0～10。
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

    

    public TaskNodeGroups withDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
        return this;
    }

    


    /**
     * Task节点数据磁盘存储大小。  取值范围：100GB～32000GB，传值只需填数字，不需要带单位GB。
     * minimum: 100
     * maximum: 32000
     * @return dataVolumeSize
     */
    public Integer getDataVolumeSize() {
        return dataVolumeSize;
    }

    public void setDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
    }

    

    public TaskNodeGroups withAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
        return this;
    }

    public TaskNodeGroups withAutoScalingPolicy(Consumer<AutoScalingPolicy> autoScalingPolicySetter) {
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
        TaskNodeGroups taskNodeGroups = (TaskNodeGroups) o;
        return Objects.equals(this.nodeNum, taskNodeGroups.nodeNum) &&
            Objects.equals(this.nodeSize, taskNodeGroups.nodeSize) &&
            Objects.equals(this.dataVolumeType, taskNodeGroups.dataVolumeType) &&
            Objects.equals(this.dataVolumeCount, taskNodeGroups.dataVolumeCount) &&
            Objects.equals(this.dataVolumeSize, taskNodeGroups.dataVolumeSize) &&
            Objects.equals(this.autoScalingPolicy, taskNodeGroups.autoScalingPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeNum, nodeSize, dataVolumeType, dataVolumeCount, dataVolumeSize, autoScalingPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskNodeGroups {\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodeSize: ").append(toIndentedString(nodeSize)).append("\n");
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

