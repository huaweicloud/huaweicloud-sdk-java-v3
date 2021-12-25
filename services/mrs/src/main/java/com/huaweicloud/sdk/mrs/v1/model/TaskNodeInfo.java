package com.huaweicloud.sdk.mrs.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TaskNodeInfo
 */
public class TaskNodeInfo  {



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

    public TaskNodeInfo withNodeSize(String nodeSize) {
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

    

    public TaskNodeInfo withDataVolumeType(DataVolumeTypeEnum dataVolumeType) {
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

    

    public TaskNodeInfo withDataVolumeCount(Integer dataVolumeCount) {
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

    

    public TaskNodeInfo withDataVolumeSize(Integer dataVolumeSize) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskNodeInfo taskNodeInfo = (TaskNodeInfo) o;
        return Objects.equals(this.nodeSize, taskNodeInfo.nodeSize) &&
            Objects.equals(this.dataVolumeType, taskNodeInfo.dataVolumeType) &&
            Objects.equals(this.dataVolumeCount, taskNodeInfo.dataVolumeCount) &&
            Objects.equals(this.dataVolumeSize, taskNodeInfo.dataVolumeSize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeSize, dataVolumeType, dataVolumeCount, dataVolumeSize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskNodeInfo {\n");
        sb.append("    nodeSize: ").append(toIndentedString(nodeSize)).append("\n");
        sb.append("    dataVolumeType: ").append(toIndentedString(dataVolumeType)).append("\n");
        sb.append("    dataVolumeCount: ").append(toIndentedString(dataVolumeCount)).append("\n");
        sb.append("    dataVolumeSize: ").append(toIndentedString(dataVolumeSize)).append("\n");
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

