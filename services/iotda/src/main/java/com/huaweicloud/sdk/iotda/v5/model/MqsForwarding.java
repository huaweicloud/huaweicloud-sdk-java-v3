package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 服务配置信息
 */
public class MqsForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypt_transport")
    
    private Boolean encryptTransport;

    public MqsForwarding withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * MQS服务的URL
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public MqsForwarding withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 用于登录MQS的用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public MqsForwarding withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 用于登录MQS的密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public MqsForwarding withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    


    /**
     * 订阅的MQS主题
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    

    public MqsForwarding withEncryptTransport(Boolean encryptTransport) {
        this.encryptTransport = encryptTransport;
        return this;
    }

    


    /**
     * 是否加密传输
     * @return encryptTransport
     */
    public Boolean getEncryptTransport() {
        return encryptTransport;
    }

    public void setEncryptTransport(Boolean encryptTransport) {
        this.encryptTransport = encryptTransport;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MqsForwarding mqsForwarding = (MqsForwarding) o;
        return Objects.equals(this.url, mqsForwarding.url) &&
            Objects.equals(this.userName, mqsForwarding.userName) &&
            Objects.equals(this.password, mqsForwarding.password) &&
            Objects.equals(this.topic, mqsForwarding.topic) &&
            Objects.equals(this.encryptTransport, mqsForwarding.encryptTransport);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, userName, password, topic, encryptTransport);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MqsForwarding {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString("******")).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    encryptTransport: ").append(toIndentedString(encryptTransport)).append("\n");
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

