package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ProcessingConfigDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建点位表配置请求结构体
 */
public class CreateDcPointReqDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="point_id")
    

    private String pointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_type")
    

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="collection_config")
    

    private Object collectionConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="property")
    

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="processing_config")
    

    private ProcessingConfigDTO processingConfig;

    public CreateDcPointReqDTO withPointId(String pointId) {
        this.pointId = pointId;
        return this;
    }

    


    /**
     * 点位表id，数据源下唯一
     * @return pointId
     */
    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    

    public CreateDcPointReqDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 点位名称，允许中、数字、英文大小写、下划线、中划线、#%()*特殊字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateDcPointReqDTO withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    


    /**
     * 点位数据类型
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    

    public CreateDcPointReqDTO withCollectionConfig(Object collectionConfig) {
        this.collectionConfig = collectionConfig;
        return this;
    }

    


    /**
     * 点位采集配置
     * @return collectionConfig
     */
    public Object getCollectionConfig() {
        return collectionConfig;
    }

    public void setCollectionConfig(Object collectionConfig) {
        this.collectionConfig = collectionConfig;
    }

    

    public CreateDcPointReqDTO withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 设备id
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    

    public CreateDcPointReqDTO withProperty(String property) {
        this.property = property;
        return this;
    }

    


    /**
     * 属性，允许中、数字、英文大小写、下划线、中划线
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    

    public CreateDcPointReqDTO withProcessingConfig(ProcessingConfigDTO processingConfig) {
        this.processingConfig = processingConfig;
        return this;
    }

    public CreateDcPointReqDTO withProcessingConfig(Consumer<ProcessingConfigDTO> processingConfigSetter) {
        if(this.processingConfig == null ){
            this.processingConfig = new ProcessingConfigDTO();
            processingConfigSetter.accept(this.processingConfig);
        }
        
        return this;
    }


    /**
     * Get processingConfig
     * @return processingConfig
     */
    public ProcessingConfigDTO getProcessingConfig() {
        return processingConfig;
    }

    public void setProcessingConfig(ProcessingConfigDTO processingConfig) {
        this.processingConfig = processingConfig;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDcPointReqDTO createDcPointReqDTO = (CreateDcPointReqDTO) o;
        return Objects.equals(this.pointId, createDcPointReqDTO.pointId) &&
            Objects.equals(this.name, createDcPointReqDTO.name) &&
            Objects.equals(this.dataType, createDcPointReqDTO.dataType) &&
            Objects.equals(this.collectionConfig, createDcPointReqDTO.collectionConfig) &&
            Objects.equals(this.deviceId, createDcPointReqDTO.deviceId) &&
            Objects.equals(this.property, createDcPointReqDTO.property) &&
            Objects.equals(this.processingConfig, createDcPointReqDTO.processingConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pointId, name, dataType, collectionConfig, deviceId, property, processingConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDcPointReqDTO {\n");
        sb.append("    pointId: ").append(toIndentedString(pointId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    collectionConfig: ").append(toIndentedString(collectionConfig)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    processingConfig: ").append(toIndentedString(processingConfig)).append("\n");
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

