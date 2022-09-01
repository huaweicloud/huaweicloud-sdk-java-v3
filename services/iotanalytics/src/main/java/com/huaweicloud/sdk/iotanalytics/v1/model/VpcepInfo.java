package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * VPCEP信息
 */
public class VpcepInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_broker_ip")

    @JacksonXmlProperty(localName = "kafka_broker_ip")

    private String kafkaBrokerIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_service_id")

    @JacksonXmlProperty(localName = "vpcep_service_id")

    private String vpcepServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_service_name")

    @JacksonXmlProperty(localName = "vpcep_service_name")

    private String vpcepServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_client_port")

    @JacksonXmlProperty(localName = "vpcep_client_port")

    private Integer vpcepClientPort;

    public VpcepInfo withKafkaBrokerIp(String kafkaBrokerIp) {
        this.kafkaBrokerIp = kafkaBrokerIp;
        return this;
    }

    /**
     * Kafka的Broker ip
     * @return kafkaBrokerIp
     */
    public String getKafkaBrokerIp() {
        return kafkaBrokerIp;
    }

    public void setKafkaBrokerIp(String kafkaBrokerIp) {
        this.kafkaBrokerIp = kafkaBrokerIp;
    }

    public VpcepInfo withVpcepServiceId(String vpcepServiceId) {
        this.vpcepServiceId = vpcepServiceId;
        return this;
    }

    /**
     * Kafka的VPCEP的service id
     * @return vpcepServiceId
     */
    public String getVpcepServiceId() {
        return vpcepServiceId;
    }

    public void setVpcepServiceId(String vpcepServiceId) {
        this.vpcepServiceId = vpcepServiceId;
    }

    public VpcepInfo withVpcepServiceName(String vpcepServiceName) {
        this.vpcepServiceName = vpcepServiceName;
        return this;
    }

    /**
     * Kafka的VPCEP的service name
     * @return vpcepServiceName
     */
    public String getVpcepServiceName() {
        return vpcepServiceName;
    }

    public void setVpcepServiceName(String vpcepServiceName) {
        this.vpcepServiceName = vpcepServiceName;
    }

    public VpcepInfo withVpcepClientPort(Integer vpcepClientPort) {
        this.vpcepClientPort = vpcepClientPort;
        return this;
    }

    /**
     * Kafka的VPCEP的client port
     * minimum: 0
     * maximum: 65536
     * @return vpcepClientPort
     */
    public Integer getVpcepClientPort() {
        return vpcepClientPort;
    }

    public void setVpcepClientPort(Integer vpcepClientPort) {
        this.vpcepClientPort = vpcepClientPort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcepInfo vpcepInfo = (VpcepInfo) o;
        return Objects.equals(this.kafkaBrokerIp, vpcepInfo.kafkaBrokerIp)
            && Objects.equals(this.vpcepServiceId, vpcepInfo.vpcepServiceId)
            && Objects.equals(this.vpcepServiceName, vpcepInfo.vpcepServiceName)
            && Objects.equals(this.vpcepClientPort, vpcepInfo.vpcepClientPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kafkaBrokerIp, vpcepServiceId, vpcepServiceName, vpcepClientPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcepInfo {\n");
        sb.append("    kafkaBrokerIp: ").append(toIndentedString(kafkaBrokerIp)).append("\n");
        sb.append("    vpcepServiceId: ").append(toIndentedString(vpcepServiceId)).append("\n");
        sb.append("    vpcepServiceName: ").append(toIndentedString(vpcepServiceName)).append("\n");
        sb.append("    vpcepClientPort: ").append(toIndentedString(vpcepClientPort)).append("\n");
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
