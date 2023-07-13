package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转发MRS Kafka消息结构
 */
public class MrsKafkaForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private List<NetAddress> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kerberos_authentication")

    private Boolean kerberosAuthentication;

    public MrsKafkaForwarding withAddresses(List<NetAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public MrsKafkaForwarding addAddressesItem(NetAddress addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public MrsKafkaForwarding withAddresses(Consumer<List<NetAddress>> addressesSetter) {
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

    public MrsKafkaForwarding withTopic(String topic) {
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

    public MrsKafkaForwarding withKerberosAuthentication(Boolean kerberosAuthentication) {
        this.kerberosAuthentication = kerberosAuthentication;
        return this;
    }

    /**
     * 是否Kerberos认证，默认为false。
     * @return kerberosAuthentication
     */
    public Boolean getKerberosAuthentication() {
        return kerberosAuthentication;
    }

    public void setKerberosAuthentication(Boolean kerberosAuthentication) {
        this.kerberosAuthentication = kerberosAuthentication;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MrsKafkaForwarding that = (MrsKafkaForwarding) obj;
        return Objects.equals(this.addresses, that.addresses) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.kerberosAuthentication, that.kerberosAuthentication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses, topic, kerberosAuthentication);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MrsKafkaForwarding {\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    kerberosAuthentication: ").append(toIndentedString(kerberosAuthentication)).append("\n");
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
