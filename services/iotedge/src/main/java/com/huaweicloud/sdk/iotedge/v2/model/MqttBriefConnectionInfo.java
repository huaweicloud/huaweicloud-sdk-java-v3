package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 边缘hub与外部实体的mqtt连接信息返回结构体
 */
public class MqttBriefConnectionInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_address")
    
    
    private String serverAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_id")
    
    
    private String clientId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_type")
    
    
    private String authType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qos")
    
    
    private Integer qos;

    public MqttBriefConnectionInfo withServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
        return this;
    }

    


    /**
     * 采用cleint方式连接时，mqtt服务器地址
     * @return serverAddress
     */
    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    

    public MqttBriefConnectionInfo withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    


    /**
     * mqtt连接时，client_id
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    

    public MqttBriefConnectionInfo withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    


    /**
     * 鉴权类型。支持密钥认证接入(SECRET)和证书认证接入(CERTIFICATES)两种方式。使用密钥认证接入方式(SECRET)填写user_name和user_name字段，使用证书认证接入方式(CERTIFICATES)填写privateKey和certificate字段
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    

    public MqttBriefConnectionInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public MqttBriefConnectionInfo withQos(Integer qos) {
        this.qos = qos;
        return this;
    }

    


    /**
     * 服务质量,默认为0,表示最多一次的传输,1表示至少一次,2表示仅一次.
     * @return qos
     */
    public Integer getQos() {
        return qos;
    }

    public void setQos(Integer qos) {
        this.qos = qos;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MqttBriefConnectionInfo mqttBriefConnectionInfo = (MqttBriefConnectionInfo) o;
        return Objects.equals(this.serverAddress, mqttBriefConnectionInfo.serverAddress) &&
            Objects.equals(this.clientId, mqttBriefConnectionInfo.clientId) &&
            Objects.equals(this.authType, mqttBriefConnectionInfo.authType) &&
            Objects.equals(this.userName, mqttBriefConnectionInfo.userName) &&
            Objects.equals(this.qos, mqttBriefConnectionInfo.qos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverAddress, clientId, authType, userName, qos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MqttBriefConnectionInfo {\n");
        sb.append("    serverAddress: ").append(toIndentedString(serverAddress)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
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

