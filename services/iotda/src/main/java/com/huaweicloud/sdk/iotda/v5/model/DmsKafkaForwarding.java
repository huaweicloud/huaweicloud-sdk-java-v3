package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转发kafka消息结构
 */
public class DmsKafkaForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

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
    @JsonProperty(value = "mechanism")

    private String mechanism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_protocol")

    private String securityProtocol;

    public DmsKafkaForwarding withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * **参数说明**：Kafka服务对应的region区域
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public DmsKafkaForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数说明**：Kafka服务对应的projectId信息
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DmsKafkaForwarding withAddresses(List<NetAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public DmsKafkaForwarding addAddressesItem(NetAddress addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public DmsKafkaForwarding withAddresses(Consumer<List<NetAddress>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * **参数说明**：转发kafka消息对应的地址列表
     * @return addresses
     */
    public List<NetAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<NetAddress> addresses) {
        this.addresses = addresses;
    }

    public DmsKafkaForwarding withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数说明**：转发kafka消息关联的topic信息。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public DmsKafkaForwarding withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数说明**：转发kafka关联的用户名信息。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public DmsKafkaForwarding withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数说明**：转发kafka关联的密码信息。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DmsKafkaForwarding withMechanism(String mechanism) {
        this.mechanism = mechanism;
        return this;
    }

    /**
     * **参数说明**：转发kafka关联的SASL认证机制。 **取值范围**： - PAAS：明文传输，此模式下为非数据加密传输模式，数据传输不安全，建议您使用更安全的数据加密模式。 - PLAIN：SASL/PLAIN模式。需要填写对应的用户名密码信息。一种简单的用户名密码校验机制，在SASL_PLAINTEXT场景下，不建议使用。 - SCRAM-SHA-512：SASL/SCRAM-SHA-512模式。需要填写对应的用户名密码信息。采用哈希算法对用户名与密码生成凭证，进行身份校验的安全认证机制，比PLAIN机制安全性更高。
     * @return mechanism
     */
    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public DmsKafkaForwarding withSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
        return this;
    }

    /**
     * **参数说明**：kafka传输安全协议，此字段不填默认为SASL_SSL。当mechanism为PAAS或不填时，该字段不生效。 **取值范围**： - SASL_SSL：采用SSL证书进行加密传输，支持帐号密码认证，安全性更高。 - SASL_PLAINTEXT：明文传输，支持帐号密码认证，性能更好，建议mechanism使用SCRAM-SHA-512机制。
     * @return securityProtocol
     */
    public String getSecurityProtocol() {
        return securityProtocol;
    }

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DmsKafkaForwarding that = (DmsKafkaForwarding) obj;
        return Objects.equals(this.regionName, that.regionName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.addresses, that.addresses) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.username, that.username) && Objects.equals(this.password, that.password)
            && Objects.equals(this.mechanism, that.mechanism)
            && Objects.equals(this.securityProtocol, that.securityProtocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, projectId, addresses, topic, username, password, mechanism, securityProtocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DmsKafkaForwarding {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
        sb.append("    securityProtocol: ").append(toIndentedString(securityProtocol)).append("\n");
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
