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
 * NodeGroupV10
 */
public class NodeGroupV10  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="GroupName")
    
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="NodeNum")
    
    
    private Integer nodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="NodeSize")
    
    
    private String nodeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="NodeSpecId")
    
    
    private String nodeSpecId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="VmProductId")
    
    
    private String vmProductId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="VmSpecCode")
    
    
    private String vmSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="NodeProductId")
    
    
    private String nodeProductId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="RootVolumeSize")
    
    
    private Integer rootVolumeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="RootVolumeProductId")
    
    
    private String rootVolumeProductId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="RootVolumeType")
    
    
    private String rootVolumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="RootVolumeResourceSpecCode")
    
    
    private String rootVolumeResourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="RootVolumeResourceType")
    
    
    private String rootVolumeResourceType;
    /**
     * 节点数据磁盘存储类别，目前支持SATA、SAS和SSD。  - SATA：普通IO - SAS：高IO - SSD：超高IO
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
    @JsonProperty(value="DataVolumeType")
    
    
    private DataVolumeTypeEnum dataVolumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="DataVolumeCount")
    
    
    private Integer dataVolumeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="DataVolumeSize")
    
    
    private Integer dataVolumeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="DataVolumeProductId")
    
    
    private String dataVolumeProductId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="DataVolumeResourceSpecCode")
    
    
    private String dataVolumeResourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="DataVolumeResourceType")
    
    
    private String dataVolumeResourceType;

    public NodeGroupV10 withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * 节点组名。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    

    public NodeGroupV10 withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    


    /**
     * 节点数量，取值范围0～500，Master节点和Core节点数量至少为1，Core与Task节点总数最大为500个。
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

    

    public NodeGroupV10 withNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
        return this;
    }

    


    /**
     * 节点的实例规格。
     * @return nodeSize
     */
    public String getNodeSize() {
        return nodeSize;
    }

    public void setNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
    }

    

    public NodeGroupV10 withNodeSpecId(String nodeSpecId) {
        this.nodeSpecId = nodeSpecId;
        return this;
    }

    


    /**
     * 节点实例规格ID。
     * @return nodeSpecId
     */
    public String getNodeSpecId() {
        return nodeSpecId;
    }

    public void setNodeSpecId(String nodeSpecId) {
        this.nodeSpecId = nodeSpecId;
    }

    

    public NodeGroupV10 withVmProductId(String vmProductId) {
        this.vmProductId = vmProductId;
        return this;
    }

    


    /**
     * 节点虚拟机产品ID。
     * @return vmProductId
     */
    public String getVmProductId() {
        return vmProductId;
    }

    public void setVmProductId(String vmProductId) {
        this.vmProductId = vmProductId;
    }

    

    public NodeGroupV10 withVmSpecCode(String vmSpecCode) {
        this.vmSpecCode = vmSpecCode;
        return this;
    }

    


    /**
     * 节点虚拟机产品规格。
     * @return vmSpecCode
     */
    public String getVmSpecCode() {
        return vmSpecCode;
    }

    public void setVmSpecCode(String vmSpecCode) {
        this.vmSpecCode = vmSpecCode;
    }

    

    public NodeGroupV10 withNodeProductId(String nodeProductId) {
        this.nodeProductId = nodeProductId;
        return this;
    }

    


    /**
     * 节点实例产品ID。
     * @return nodeProductId
     */
    public String getNodeProductId() {
        return nodeProductId;
    }

    public void setNodeProductId(String nodeProductId) {
        this.nodeProductId = nodeProductId;
    }

    

    public NodeGroupV10 withRootVolumeSize(Integer rootVolumeSize) {
        this.rootVolumeSize = rootVolumeSize;
        return this;
    }

    


    /**
     * 节点系统盘大小，不可配置，默认为40GB。
     * minimum: 40
     * maximum: 32000
     * @return rootVolumeSize
     */
    public Integer getRootVolumeSize() {
        return rootVolumeSize;
    }

    public void setRootVolumeSize(Integer rootVolumeSize) {
        this.rootVolumeSize = rootVolumeSize;
    }

    

    public NodeGroupV10 withRootVolumeProductId(String rootVolumeProductId) {
        this.rootVolumeProductId = rootVolumeProductId;
        return this;
    }

    


    /**
     * 节点系统盘的产品ID。
     * @return rootVolumeProductId
     */
    public String getRootVolumeProductId() {
        return rootVolumeProductId;
    }

    public void setRootVolumeProductId(String rootVolumeProductId) {
        this.rootVolumeProductId = rootVolumeProductId;
    }

    

    public NodeGroupV10 withRootVolumeType(String rootVolumeType) {
        this.rootVolumeType = rootVolumeType;
        return this;
    }

    


    /**
     * 节点系统盘的类型。
     * @return rootVolumeType
     */
    public String getRootVolumeType() {
        return rootVolumeType;
    }

    public void setRootVolumeType(String rootVolumeType) {
        this.rootVolumeType = rootVolumeType;
    }

    

    public NodeGroupV10 withRootVolumeResourceSpecCode(String rootVolumeResourceSpecCode) {
        this.rootVolumeResourceSpecCode = rootVolumeResourceSpecCode;
        return this;
    }

    


    /**
     * 节点系统盘产品规格。
     * @return rootVolumeResourceSpecCode
     */
    public String getRootVolumeResourceSpecCode() {
        return rootVolumeResourceSpecCode;
    }

    public void setRootVolumeResourceSpecCode(String rootVolumeResourceSpecCode) {
        this.rootVolumeResourceSpecCode = rootVolumeResourceSpecCode;
    }

    

    public NodeGroupV10 withRootVolumeResourceType(String rootVolumeResourceType) {
        this.rootVolumeResourceType = rootVolumeResourceType;
        return this;
    }

    


    /**
     * 节点系统盘产品类型。
     * @return rootVolumeResourceType
     */
    public String getRootVolumeResourceType() {
        return rootVolumeResourceType;
    }

    public void setRootVolumeResourceType(String rootVolumeResourceType) {
        this.rootVolumeResourceType = rootVolumeResourceType;
    }

    

    public NodeGroupV10 withDataVolumeType(DataVolumeTypeEnum dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
        return this;
    }

    


    /**
     * 节点数据磁盘存储类别，目前支持SATA、SAS和SSD。  - SATA：普通IO - SAS：高IO - SSD：超高IO
     * @return dataVolumeType
     */
    public DataVolumeTypeEnum getDataVolumeType() {
        return dataVolumeType;
    }

    public void setDataVolumeType(DataVolumeTypeEnum dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
    }

    

    public NodeGroupV10 withDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
        return this;
    }

    


    /**
     * 节点数据磁盘存储数目。
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

    

    public NodeGroupV10 withDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
        return this;
    }

    


    /**
     * 节点数据磁盘存储大小。
     * @return dataVolumeSize
     */
    public Integer getDataVolumeSize() {
        return dataVolumeSize;
    }

    public void setDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
    }

    

    public NodeGroupV10 withDataVolumeProductId(String dataVolumeProductId) {
        this.dataVolumeProductId = dataVolumeProductId;
        return this;
    }

    


    /**
     * 节点数据磁盘的产品ID。
     * @return dataVolumeProductId
     */
    public String getDataVolumeProductId() {
        return dataVolumeProductId;
    }

    public void setDataVolumeProductId(String dataVolumeProductId) {
        this.dataVolumeProductId = dataVolumeProductId;
    }

    

    public NodeGroupV10 withDataVolumeResourceSpecCode(String dataVolumeResourceSpecCode) {
        this.dataVolumeResourceSpecCode = dataVolumeResourceSpecCode;
        return this;
    }

    


    /**
     * 节点数据磁盘的产品规格。
     * @return dataVolumeResourceSpecCode
     */
    public String getDataVolumeResourceSpecCode() {
        return dataVolumeResourceSpecCode;
    }

    public void setDataVolumeResourceSpecCode(String dataVolumeResourceSpecCode) {
        this.dataVolumeResourceSpecCode = dataVolumeResourceSpecCode;
    }

    

    public NodeGroupV10 withDataVolumeResourceType(String dataVolumeResourceType) {
        this.dataVolumeResourceType = dataVolumeResourceType;
        return this;
    }

    


    /**
     * 节点数据磁盘的产品类型。
     * @return dataVolumeResourceType
     */
    public String getDataVolumeResourceType() {
        return dataVolumeResourceType;
    }

    public void setDataVolumeResourceType(String dataVolumeResourceType) {
        this.dataVolumeResourceType = dataVolumeResourceType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeGroupV10 nodeGroupV10 = (NodeGroupV10) o;
        return Objects.equals(this.groupName, nodeGroupV10.groupName) &&
            Objects.equals(this.nodeNum, nodeGroupV10.nodeNum) &&
            Objects.equals(this.nodeSize, nodeGroupV10.nodeSize) &&
            Objects.equals(this.nodeSpecId, nodeGroupV10.nodeSpecId) &&
            Objects.equals(this.vmProductId, nodeGroupV10.vmProductId) &&
            Objects.equals(this.vmSpecCode, nodeGroupV10.vmSpecCode) &&
            Objects.equals(this.nodeProductId, nodeGroupV10.nodeProductId) &&
            Objects.equals(this.rootVolumeSize, nodeGroupV10.rootVolumeSize) &&
            Objects.equals(this.rootVolumeProductId, nodeGroupV10.rootVolumeProductId) &&
            Objects.equals(this.rootVolumeType, nodeGroupV10.rootVolumeType) &&
            Objects.equals(this.rootVolumeResourceSpecCode, nodeGroupV10.rootVolumeResourceSpecCode) &&
            Objects.equals(this.rootVolumeResourceType, nodeGroupV10.rootVolumeResourceType) &&
            Objects.equals(this.dataVolumeType, nodeGroupV10.dataVolumeType) &&
            Objects.equals(this.dataVolumeCount, nodeGroupV10.dataVolumeCount) &&
            Objects.equals(this.dataVolumeSize, nodeGroupV10.dataVolumeSize) &&
            Objects.equals(this.dataVolumeProductId, nodeGroupV10.dataVolumeProductId) &&
            Objects.equals(this.dataVolumeResourceSpecCode, nodeGroupV10.dataVolumeResourceSpecCode) &&
            Objects.equals(this.dataVolumeResourceType, nodeGroupV10.dataVolumeResourceType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupName, nodeNum, nodeSize, nodeSpecId, vmProductId, vmSpecCode, nodeProductId, rootVolumeSize, rootVolumeProductId, rootVolumeType, rootVolumeResourceSpecCode, rootVolumeResourceType, dataVolumeType, dataVolumeCount, dataVolumeSize, dataVolumeProductId, dataVolumeResourceSpecCode, dataVolumeResourceType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeGroupV10 {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodeSize: ").append(toIndentedString(nodeSize)).append("\n");
        sb.append("    nodeSpecId: ").append(toIndentedString(nodeSpecId)).append("\n");
        sb.append("    vmProductId: ").append(toIndentedString(vmProductId)).append("\n");
        sb.append("    vmSpecCode: ").append(toIndentedString(vmSpecCode)).append("\n");
        sb.append("    nodeProductId: ").append(toIndentedString(nodeProductId)).append("\n");
        sb.append("    rootVolumeSize: ").append(toIndentedString(rootVolumeSize)).append("\n");
        sb.append("    rootVolumeProductId: ").append(toIndentedString(rootVolumeProductId)).append("\n");
        sb.append("    rootVolumeType: ").append(toIndentedString(rootVolumeType)).append("\n");
        sb.append("    rootVolumeResourceSpecCode: ").append(toIndentedString(rootVolumeResourceSpecCode)).append("\n");
        sb.append("    rootVolumeResourceType: ").append(toIndentedString(rootVolumeResourceType)).append("\n");
        sb.append("    dataVolumeType: ").append(toIndentedString(dataVolumeType)).append("\n");
        sb.append("    dataVolumeCount: ").append(toIndentedString(dataVolumeCount)).append("\n");
        sb.append("    dataVolumeSize: ").append(toIndentedString(dataVolumeSize)).append("\n");
        sb.append("    dataVolumeProductId: ").append(toIndentedString(dataVolumeProductId)).append("\n");
        sb.append("    dataVolumeResourceSpecCode: ").append(toIndentedString(dataVolumeResourceSpecCode)).append("\n");
        sb.append("    dataVolumeResourceType: ").append(toIndentedString(dataVolumeResourceType)).append("\n");
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

