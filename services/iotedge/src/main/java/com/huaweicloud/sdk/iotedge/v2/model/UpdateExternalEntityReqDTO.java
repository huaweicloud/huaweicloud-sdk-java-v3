package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.MqttConnectionInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新外部实体请求结构体
 */
public class UpdateExternalEntityReqDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_type")
    

    private String connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mqtt_connection_info")
    

    private MqttConnectionInfo mqttConnectionInfo;

    public UpdateExternalEntityReqDTO withProtocol(String protocol) {
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

    

    public UpdateExternalEntityReqDTO withConnectionType(String connectionType) {
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

    

    public UpdateExternalEntityReqDTO withMqttConnectionInfo(MqttConnectionInfo mqttConnectionInfo) {
        this.mqttConnectionInfo = mqttConnectionInfo;
        return this;
    }

    public UpdateExternalEntityReqDTO withMqttConnectionInfo(Consumer<MqttConnectionInfo> mqttConnectionInfoSetter) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateExternalEntityReqDTO updateExternalEntityReqDTO = (UpdateExternalEntityReqDTO) o;
        return Objects.equals(this.protocol, updateExternalEntityReqDTO.protocol) &&
            Objects.equals(this.connectionType, updateExternalEntityReqDTO.connectionType) &&
            Objects.equals(this.mqttConnectionInfo, updateExternalEntityReqDTO.mqttConnectionInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(protocol, connectionType, mqttConnectionInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExternalEntityReqDTO {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    mqttConnectionInfo: ").append(toIndentedString(mqttConnectionInfo)).append("\n");
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

