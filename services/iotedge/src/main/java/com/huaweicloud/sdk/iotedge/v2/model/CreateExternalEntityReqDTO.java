package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.MqttConnectionInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建外部实体请求结构体
 */
public class CreateExternalEntityReqDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="external_id")
    
    
    private String externalId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_type")
    
    
    private String connectionType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mqtt_connection_info")
    
    
    private MqttConnectionInfo mqttConnectionInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="space_id")
    
    
    private String spaceId;

    public CreateExternalEntityReqDTO withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    


    /**
     * 外部实体Id，节点下唯一
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    

    public CreateExternalEntityReqDTO withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 连接外部实体的协议类型
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public CreateExternalEntityReqDTO withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    


    /**
     * 连接类型
     * @return connectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    

    public CreateExternalEntityReqDTO withMqttConnectionInfo(MqttConnectionInfo mqttConnectionInfo) {
        this.mqttConnectionInfo = mqttConnectionInfo;
        return this;
    }

    public CreateExternalEntityReqDTO withMqttConnectionInfo(Consumer<MqttConnectionInfo> mqttConnectionInfoSetter) {
        if(this.mqttConnectionInfo == null ){
            this.mqttConnectionInfo = new MqttConnectionInfo();
            mqttConnectionInfoSetter.accept(this.mqttConnectionInfo);
        }
        
        return this;
    }


    /**
     * Get mqttConnectionInfo
     * @return mqttConnectionInfo
     */
    public MqttConnectionInfo getMqttConnectionInfo() {
        return mqttConnectionInfo;
    }

    public void setMqttConnectionInfo(MqttConnectionInfo mqttConnectionInfo) {
        this.mqttConnectionInfo = mqttConnectionInfo;
    }

    

    public CreateExternalEntityReqDTO withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    


    /**
     * 资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的外部实体归属到IoDA哪个资源空间下的边缘节点设备下，否则创建的外部实体将会归属到默认资源空间下对应的边缘节点下,对应于IoDA的app_id.
     * @return spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateExternalEntityReqDTO createExternalEntityReqDTO = (CreateExternalEntityReqDTO) o;
        return Objects.equals(this.externalId, createExternalEntityReqDTO.externalId) &&
            Objects.equals(this.protocol, createExternalEntityReqDTO.protocol) &&
            Objects.equals(this.connectionType, createExternalEntityReqDTO.connectionType) &&
            Objects.equals(this.mqttConnectionInfo, createExternalEntityReqDTO.mqttConnectionInfo) &&
            Objects.equals(this.spaceId, createExternalEntityReqDTO.spaceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(externalId, protocol, connectionType, mqttConnectionInfo, spaceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExternalEntityReqDTO {\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    mqttConnectionInfo: ").append(toIndentedString(mqttConnectionInfo)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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

