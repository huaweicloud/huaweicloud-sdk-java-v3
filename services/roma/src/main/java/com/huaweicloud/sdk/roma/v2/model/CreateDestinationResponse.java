package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class CreateDestinationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_id")

    private Integer destinationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    private Integer destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_name")

    private String destinationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private String server;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqs_sasl_ssl")

    private Boolean mqsSaslSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public CreateDestinationResponse withDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /** 目标数据源ID minimum: 1 maximum: 999999999999999999
     * 
     * @return destinationId */
    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public CreateDestinationResponse withDestinationType(Integer destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /** 操作类型，枚举值:0-目标端为本ROMA实例内MQS； 7-目标端为设备 minimum: 0 maximum: 10
     * 
     * @return destinationType */
    public Integer getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(Integer destinationType) {
        this.destinationType = destinationType;
    }

    public CreateDestinationResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用ID，目标端为0时需明确对方的APP_ID
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateDestinationResponse withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /** 目标数据源名称
     * 
     * @return destinationName */
    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public CreateDestinationResponse withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** 目标数据源主题
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public CreateDestinationResponse withServer(String server) {
        this.server = server;
        return this;
    }

    /** 目标端数据源服务
     * 
     * @return server */
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public CreateDestinationResponse withToken(String token) {
        this.token = token;
        return this;
    }

    /** 目标端数据源token
     * 
     * @return token */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CreateDestinationResponse withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** 目标数据源标签
     * 
     * @return tag */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CreateDestinationResponse withMqsSaslSsl(Boolean mqsSaslSsl) {
        this.mqsSaslSsl = mqsSaslSsl;
        return this;
    }

    /** 目标端数据源MQS的SASL字段是否需要支持SSL加密
     * 
     * @return mqsSaslSsl */
    public Boolean getMqsSaslSsl() {
        return mqsSaslSsl;
    }

    public void setMqsSaslSsl(Boolean mqsSaslSsl) {
        this.mqsSaslSsl = mqsSaslSsl;
    }

    public CreateDestinationResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 目标数据源用户名
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateDestinationResponse withPassword(String password) {
        this.password = password;
        return this;
    }

    /** 目标数据源密码
     * 
     * @return password */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDestinationResponse createDestinationResponse = (CreateDestinationResponse) o;
        return Objects.equals(this.destinationId, createDestinationResponse.destinationId)
            && Objects.equals(this.destinationType, createDestinationResponse.destinationType)
            && Objects.equals(this.appId, createDestinationResponse.appId)
            && Objects.equals(this.destinationName, createDestinationResponse.destinationName)
            && Objects.equals(this.topic, createDestinationResponse.topic)
            && Objects.equals(this.server, createDestinationResponse.server)
            && Objects.equals(this.token, createDestinationResponse.token)
            && Objects.equals(this.tag, createDestinationResponse.tag)
            && Objects.equals(this.mqsSaslSsl, createDestinationResponse.mqsSaslSsl)
            && Objects.equals(this.userName, createDestinationResponse.userName)
            && Objects.equals(this.password, createDestinationResponse.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationId,
            destinationType,
            appId,
            destinationName,
            topic,
            server,
            token,
            tag,
            mqsSaslSsl,
            userName,
            password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDestinationResponse {\n");
        sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    mqsSaslSsl: ").append(toIndentedString(mqsSaslSsl)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
