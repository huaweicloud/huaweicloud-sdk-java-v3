package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * rocketMQ服务配置信息
 */
public class DmsRocketMQForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private List<NetAddress> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    public DmsRocketMQForwarding withAddresses(List<NetAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public DmsRocketMQForwarding addAddressesItem(NetAddress addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public DmsRocketMQForwarding withAddresses(Consumer<List<NetAddress>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * **参数说明**：转发rocketMQ消息对应的地址列表
     * @return addresses
     */
    public List<NetAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<NetAddress> addresses) {
        this.addresses = addresses;
    }

    public DmsRocketMQForwarding withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数说明**：转发rocketMQ消息关联的topic信息。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public DmsRocketMQForwarding withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数说明**：转发rocketMQ关联的用户名信息。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public DmsRocketMQForwarding withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数说明**：转发rocketMQ关联的密码信息。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DmsRocketMQForwarding withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * 是否开启SSL，默认为true。
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DmsRocketMQForwarding dmsRocketMQForwarding = (DmsRocketMQForwarding) o;
        return Objects.equals(this.addresses, dmsRocketMQForwarding.addresses)
            && Objects.equals(this.topic, dmsRocketMQForwarding.topic)
            && Objects.equals(this.username, dmsRocketMQForwarding.username)
            && Objects.equals(this.password, dmsRocketMQForwarding.password)
            && Objects.equals(this.enableSsl, dmsRocketMQForwarding.enableSsl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses, topic, username, password, enableSsl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DmsRocketMQForwarding {\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
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
