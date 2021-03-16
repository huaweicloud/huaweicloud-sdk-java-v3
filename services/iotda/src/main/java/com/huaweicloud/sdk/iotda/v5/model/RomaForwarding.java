package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.NetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转发roma消息结构
 */
public class RomaForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addresses")
    
    private List<NetAddress> addresses = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="username")
    
    private String username;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String password;

    public RomaForwarding withAddresses(List<NetAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    
    public RomaForwarding addAddressesItem(NetAddress addressesItem) {
        this.addresses.add(addressesItem);
        return this;
    }

    public RomaForwarding withAddresses(Consumer<List<NetAddress>> addressesSetter) {
        if(this.addresses == null ){
            this.addresses = new ArrayList<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 转发roma消息对应的地址列表
     * @return addresses
     */
    public List<NetAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<NetAddress> addresses) {
        this.addresses = addresses;
    }

    

    public RomaForwarding withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    


    /**
     * 转发roma消息关联的topic信息。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    

    public RomaForwarding withUsername(String username) {
        this.username = username;
        return this;
    }

    


    /**
     * 转发roma关联的用户名信息。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    public RomaForwarding withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 转发roma关联的密码信息。
     * @return password
     */
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
        RomaForwarding romaForwarding = (RomaForwarding) o;
        return Objects.equals(this.addresses, romaForwarding.addresses) &&
            Objects.equals(this.topic, romaForwarding.topic) &&
            Objects.equals(this.username, romaForwarding.username) &&
            Objects.equals(this.password, romaForwarding.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(addresses, topic, username, password);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RomaForwarding {\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString("******")).append("\n");
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

