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
 * 转发kafka消息结构
 */
public class ActionKafkaForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_name")
    
    private String regionName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_addresses")
    
    private List<NetAddress> kafkaAddresses = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_topic")
    
    private String kafkaTopic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_username")
    
    private String kafkaUsername;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_password")
    
    private String kafkaPassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_mechanism")
    
    private String kafkaMechanism;

    public ActionKafkaForwarding withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    


    /**
     * 转发kafka消息对应的region区域
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    

    public ActionKafkaForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 转发kafka消息对应的projectId信息
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public ActionKafkaForwarding withKafkaAddresses(List<NetAddress> kafkaAddresses) {
        this.kafkaAddresses = kafkaAddresses;
        return this;
    }

    
    public ActionKafkaForwarding addKafkaAddressesItem(NetAddress kafkaAddressesItem) {
        if(this.kafkaAddresses == null) {
            this.kafkaAddresses = new ArrayList<>();
        }
        this.kafkaAddresses.add(kafkaAddressesItem);
        return this;
    }

    public ActionKafkaForwarding withKafkaAddresses(Consumer<List<NetAddress>> kafkaAddressesSetter) {
        if(this.kafkaAddresses == null) {
            this.kafkaAddresses = new ArrayList<>();
        }
        kafkaAddressesSetter.accept(this.kafkaAddresses);
        return this;
    }

    /**
     * 转发kafka消息对应的地址列表
     * @return kafkaAddresses
     */
    public List<NetAddress> getKafkaAddresses() {
        return kafkaAddresses;
    }

    public void setKafkaAddresses(List<NetAddress> kafkaAddresses) {
        this.kafkaAddresses = kafkaAddresses;
    }

    

    public ActionKafkaForwarding withKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }

    


    /**
     * 转发kafka消息关联的topic信息。
     * @return kafkaTopic
     */
    public String getKafkaTopic() {
        return kafkaTopic;
    }

    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    

    public ActionKafkaForwarding withKafkaUsername(String kafkaUsername) {
        this.kafkaUsername = kafkaUsername;
        return this;
    }

    


    /**
     * 转发kafka关联的用户名信息。
     * @return kafkaUsername
     */
    public String getKafkaUsername() {
        return kafkaUsername;
    }

    public void setKafkaUsername(String kafkaUsername) {
        this.kafkaUsername = kafkaUsername;
    }

    

    public ActionKafkaForwarding withKafkaPassword(String kafkaPassword) {
        this.kafkaPassword = kafkaPassword;
        return this;
    }

    


    /**
     * 转发kafka关联的密码信息。
     * @return kafkaPassword
     */
    public String getKafkaPassword() {
        return kafkaPassword;
    }

    public void setKafkaPassword(String kafkaPassword) {
        this.kafkaPassword = kafkaPassword;
    }

    

    public ActionKafkaForwarding withKafkaMechanism(String kafkaMechanism) {
        this.kafkaMechanism = kafkaMechanism;
        return this;
    }

    


    /**
     * 转发kafka关联的鉴权机制。 类型说明： PAAS：非SASL鉴权。 PLAIN：SASL/PLAIN模式。需要填写对应的用户名密码信息。 
     * @return kafkaMechanism
     */
    public String getKafkaMechanism() {
        return kafkaMechanism;
    }

    public void setKafkaMechanism(String kafkaMechanism) {
        this.kafkaMechanism = kafkaMechanism;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionKafkaForwarding actionKafkaForwarding = (ActionKafkaForwarding) o;
        return Objects.equals(this.regionName, actionKafkaForwarding.regionName) &&
            Objects.equals(this.projectId, actionKafkaForwarding.projectId) &&
            Objects.equals(this.kafkaAddresses, actionKafkaForwarding.kafkaAddresses) &&
            Objects.equals(this.kafkaTopic, actionKafkaForwarding.kafkaTopic) &&
            Objects.equals(this.kafkaUsername, actionKafkaForwarding.kafkaUsername) &&
            Objects.equals(this.kafkaPassword, actionKafkaForwarding.kafkaPassword) &&
            Objects.equals(this.kafkaMechanism, actionKafkaForwarding.kafkaMechanism);
    }
    @Override
    public int hashCode() {
        return Objects.hash(regionName, projectId, kafkaAddresses, kafkaTopic, kafkaUsername, kafkaPassword, kafkaMechanism);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionKafkaForwarding {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    kafkaAddresses: ").append(toIndentedString(kafkaAddresses)).append("\n");
        sb.append("    kafkaTopic: ").append(toIndentedString(kafkaTopic)).append("\n");
        sb.append("    kafkaUsername: ").append(toIndentedString(kafkaUsername)).append("\n");
        sb.append("    kafkaPassword: ").append(toIndentedString(kafkaPassword)).append("\n");
        sb.append("    kafkaMechanism: ").append(toIndentedString(kafkaMechanism)).append("\n");
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

