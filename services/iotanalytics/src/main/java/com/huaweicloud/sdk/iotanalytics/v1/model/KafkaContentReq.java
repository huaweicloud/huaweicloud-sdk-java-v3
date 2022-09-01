package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Kafka数据源请求内容
 */
public class KafkaContentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    @JacksonXmlProperty(localName = "connection_type")

    private String connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_infos")

    @JacksonXmlProperty(localName = "vpcep_infos")

    private List<VpcepInfo> vpcepInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_infos")

    @JacksonXmlProperty(localName = "broker_infos")

    private List<KafkaBrokerInfo> brokerInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info")

    @JacksonXmlProperty(localName = "auth_info")

    private KafkaAuthInfo authInfo;

    public KafkaContentReq withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * KAFKA连接方式
     * @return connectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public KafkaContentReq withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Kafka实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public KafkaContentReq withVpcepInfos(List<VpcepInfo> vpcepInfos) {
        this.vpcepInfos = vpcepInfos;
        return this;
    }

    public KafkaContentReq addVpcepInfosItem(VpcepInfo vpcepInfosItem) {
        if (this.vpcepInfos == null) {
            this.vpcepInfos = new ArrayList<>();
        }
        this.vpcepInfos.add(vpcepInfosItem);
        return this;
    }

    public KafkaContentReq withVpcepInfos(Consumer<List<VpcepInfo>> vpcepInfosSetter) {
        if (this.vpcepInfos == null) {
            this.vpcepInfos = new ArrayList<>();
        }
        vpcepInfosSetter.accept(this.vpcepInfos);
        return this;
    }

    /**
     * Kafka的VPCEP信息包括service_id,service_name,client_port
     * @return vpcepInfos
     */
    public List<VpcepInfo> getVpcepInfos() {
        return vpcepInfos;
    }

    public void setVpcepInfos(List<VpcepInfo> vpcepInfos) {
        this.vpcepInfos = vpcepInfos;
    }

    public KafkaContentReq withBrokerInfos(List<KafkaBrokerInfo> brokerInfos) {
        this.brokerInfos = brokerInfos;
        return this;
    }

    public KafkaContentReq addBrokerInfosItem(KafkaBrokerInfo brokerInfosItem) {
        if (this.brokerInfos == null) {
            this.brokerInfos = new ArrayList<>();
        }
        this.brokerInfos.add(brokerInfosItem);
        return this;
    }

    public KafkaContentReq withBrokerInfos(Consumer<List<KafkaBrokerInfo>> brokerInfosSetter) {
        if (this.brokerInfos == null) {
            this.brokerInfos = new ArrayList<>();
        }
        brokerInfosSetter.accept(this.brokerInfos);
        return this;
    }

    /**
     * Kafka的broker信息包括broker_ip, broker_port
     * @return brokerInfos
     */
    public List<KafkaBrokerInfo> getBrokerInfos() {
        return brokerInfos;
    }

    public void setBrokerInfos(List<KafkaBrokerInfo> brokerInfos) {
        this.brokerInfos = brokerInfos;
    }

    public KafkaContentReq withAuthInfo(KafkaAuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    public KafkaContentReq withAuthInfo(Consumer<KafkaAuthInfo> authInfoSetter) {
        if (this.authInfo == null) {
            this.authInfo = new KafkaAuthInfo();
            authInfoSetter.accept(this.authInfo);
        }

        return this;
    }

    /**
     * Get authInfo
     * @return authInfo
     */
    public KafkaAuthInfo getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(KafkaAuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KafkaContentReq kafkaContentReq = (KafkaContentReq) o;
        return Objects.equals(this.connectionType, kafkaContentReq.connectionType)
            && Objects.equals(this.instanceId, kafkaContentReq.instanceId)
            && Objects.equals(this.vpcepInfos, kafkaContentReq.vpcepInfos)
            && Objects.equals(this.brokerInfos, kafkaContentReq.brokerInfos)
            && Objects.equals(this.authInfo, kafkaContentReq.authInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionType, instanceId, vpcepInfos, brokerInfos, authInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaContentReq {\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    vpcepInfos: ").append(toIndentedString(vpcepInfos)).append("\n");
        sb.append("    brokerInfos: ").append(toIndentedString(brokerInfos)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
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
