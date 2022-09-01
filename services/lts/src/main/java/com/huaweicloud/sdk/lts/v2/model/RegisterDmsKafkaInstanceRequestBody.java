package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RegisterDmsKafkaInstanceRequestBody
 */
public class RegisterDmsKafkaInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_name")

    @JacksonXmlProperty(localName = "kafka_name")

    private String kafkaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_info")

    @JacksonXmlProperty(localName = "connect_info")

    private RegisterDmsKafkaInstanceRequestBodyConnectInfo connectInfo;

    public RegisterDmsKafkaInstanceRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * kafka ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RegisterDmsKafkaInstanceRequestBody withKafkaName(String kafkaName) {
        this.kafkaName = kafkaName;
        return this;
    }

    /**
     * kafka 名称
     * @return kafkaName
     */
    public String getKafkaName() {
        return kafkaName;
    }

    public void setKafkaName(String kafkaName) {
        this.kafkaName = kafkaName;
    }

    public RegisterDmsKafkaInstanceRequestBody withConnectInfo(
        RegisterDmsKafkaInstanceRequestBodyConnectInfo connectInfo) {
        this.connectInfo = connectInfo;
        return this;
    }

    public RegisterDmsKafkaInstanceRequestBody withConnectInfo(
        Consumer<RegisterDmsKafkaInstanceRequestBodyConnectInfo> connectInfoSetter) {
        if (this.connectInfo == null) {
            this.connectInfo = new RegisterDmsKafkaInstanceRequestBodyConnectInfo();
            connectInfoSetter.accept(this.connectInfo);
        }

        return this;
    }

    /**
     * Get connectInfo
     * @return connectInfo
     */
    public RegisterDmsKafkaInstanceRequestBodyConnectInfo getConnectInfo() {
        return connectInfo;
    }

    public void setConnectInfo(RegisterDmsKafkaInstanceRequestBodyConnectInfo connectInfo) {
        this.connectInfo = connectInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterDmsKafkaInstanceRequestBody registerDmsKafkaInstanceRequestBody =
            (RegisterDmsKafkaInstanceRequestBody) o;
        return Objects.equals(this.instanceId, registerDmsKafkaInstanceRequestBody.instanceId)
            && Objects.equals(this.kafkaName, registerDmsKafkaInstanceRequestBody.kafkaName)
            && Objects.equals(this.connectInfo, registerDmsKafkaInstanceRequestBody.connectInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, kafkaName, connectInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterDmsKafkaInstanceRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    kafkaName: ").append(toIndentedString(kafkaName)).append("\n");
        sb.append("    connectInfo: ").append(toIndentedString(connectInfo)).append("\n");
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
