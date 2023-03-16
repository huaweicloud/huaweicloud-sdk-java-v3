package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ProcessingConfigDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新点位表请求结构体
 */
public class UpdateDcPointReqDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

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
    @JsonProperty(value="data_type")
    

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="processing_config")
    

    private ProcessingConfigDTO processingConfig;

    public UpdateDcPointReqDTO withName(String name) {
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

    

    public UpdateDcPointReqDTO withCollectionConfig(Object collectionConfig) {
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

    

    public UpdateDcPointReqDTO withDeviceId(String deviceId) {
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

    

    public UpdateDcPointReqDTO withProperty(String property) {
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

    

    public UpdateDcPointReqDTO withDataType(String dataType) {
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

    

    public UpdateDcPointReqDTO withProcessingConfig(ProcessingConfigDTO processingConfig) {
        this.processingConfig = processingConfig;
        return this;
    }

    public UpdateDcPointReqDTO withProcessingConfig(Consumer<ProcessingConfigDTO> processingConfigSetter) {
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
        UpdateDcPointReqDTO updateDcPointReqDTO = (UpdateDcPointReqDTO) o;
        return Objects.equals(this.name, updateDcPointReqDTO.name) &&
            Objects.equals(this.collectionConfig, updateDcPointReqDTO.collectionConfig) &&
            Objects.equals(this.deviceId, updateDcPointReqDTO.deviceId) &&
            Objects.equals(this.property, updateDcPointReqDTO.property) &&
            Objects.equals(this.dataType, updateDcPointReqDTO.dataType) &&
            Objects.equals(this.processingConfig, updateDcPointReqDTO.processingConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, collectionConfig, deviceId, property, dataType, processingConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDcPointReqDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    collectionConfig: ").append(toIndentedString(collectionConfig)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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

