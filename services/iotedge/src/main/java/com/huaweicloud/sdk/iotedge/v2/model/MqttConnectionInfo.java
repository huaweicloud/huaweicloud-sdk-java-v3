package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 边缘hub与外部实体的mqtt连接信息
 */
public class MqttConnectionInfo  {


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
    @JsonProperty(value="private_key")
    

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate")
    

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qos")
    

    private Integer qos;

    public MqttConnectionInfo withServerAddress(String serverAddress) {
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

    

    public MqttConnectionInfo withClientId(String clientId) {
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

    

    public MqttConnectionInfo withAuthType(String authType) {
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

    

    public MqttConnectionInfo withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    


    /**
     * 证书秘钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    

    public MqttConnectionInfo withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    


    /**
     * 证书
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    

    public MqttConnectionInfo withUserName(String userName) {
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

    

    public MqttConnectionInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public MqttConnectionInfo withQos(Integer qos) {
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
        MqttConnectionInfo mqttConnectionInfo = (MqttConnectionInfo) o;
        return Objects.equals(this.serverAddress, mqttConnectionInfo.serverAddress) &&
            Objects.equals(this.clientId, mqttConnectionInfo.clientId) &&
            Objects.equals(this.authType, mqttConnectionInfo.authType) &&
            Objects.equals(this.privateKey, mqttConnectionInfo.privateKey) &&
            Objects.equals(this.certificate, mqttConnectionInfo.certificate) &&
            Objects.equals(this.userName, mqttConnectionInfo.userName) &&
            Objects.equals(this.password, mqttConnectionInfo.password) &&
            Objects.equals(this.qos, mqttConnectionInfo.qos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverAddress, clientId, authType, privateKey, certificate, userName, password, qos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MqttConnectionInfo {\n");
        sb.append("    serverAddress: ").append(toIndentedString(serverAddress)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

