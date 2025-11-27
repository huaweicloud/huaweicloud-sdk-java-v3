package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 物联网平台转发数据的通道配置参数。
 */
public class ChannelDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_forwarding")

    private HttpForwarding httpForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_forwarding")

    private DisForwarding disForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_forwarding")

    private ObsForwarding obsForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amqp_forwarding")

    private AmqpForwarding amqpForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dms_kafka_forwarding")

    private DmsKafkaForwarding dmsKafkaForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_forwarding")

    private RomaForwarding romaForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_forwarding")

    private MysqlForwarding mysqlForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "influxdb_forwarding")

    private InfluxDBForwarding influxdbForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functiongraph_forwarding")

    private FunctionGraphForwarding functiongraphForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mrs_kafka_forwarding")

    private MrsKafkaForwarding mrsKafkaForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dms_rocketmq_forwarding")

    private DmsRocketMQForwarding dmsRocketmqForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqtt_device_forwarding")

    private MqttDeviceForwarding mqttDeviceForwarding;

    public ChannelDetail withHttpForwarding(HttpForwarding httpForwarding) {
        this.httpForwarding = httpForwarding;
        return this;
    }

    public ChannelDetail withHttpForwarding(Consumer<HttpForwarding> httpForwardingSetter) {
        if (this.httpForwarding == null) {
            this.httpForwarding = new HttpForwarding();
            httpForwardingSetter.accept(this.httpForwarding);
        }

        return this;
    }

    /**
     * Get httpForwarding
     * @return httpForwarding
     */
    public HttpForwarding getHttpForwarding() {
        return httpForwarding;
    }

    public void setHttpForwarding(HttpForwarding httpForwarding) {
        this.httpForwarding = httpForwarding;
    }

    public ChannelDetail withDisForwarding(DisForwarding disForwarding) {
        this.disForwarding = disForwarding;
        return this;
    }

    public ChannelDetail withDisForwarding(Consumer<DisForwarding> disForwardingSetter) {
        if (this.disForwarding == null) {
            this.disForwarding = new DisForwarding();
            disForwardingSetter.accept(this.disForwarding);
        }

        return this;
    }

    /**
     * Get disForwarding
     * @return disForwarding
     */
    public DisForwarding getDisForwarding() {
        return disForwarding;
    }

    public void setDisForwarding(DisForwarding disForwarding) {
        this.disForwarding = disForwarding;
    }

    public ChannelDetail withObsForwarding(ObsForwarding obsForwarding) {
        this.obsForwarding = obsForwarding;
        return this;
    }

    public ChannelDetail withObsForwarding(Consumer<ObsForwarding> obsForwardingSetter) {
        if (this.obsForwarding == null) {
            this.obsForwarding = new ObsForwarding();
            obsForwardingSetter.accept(this.obsForwarding);
        }

        return this;
    }

    /**
     * Get obsForwarding
     * @return obsForwarding
     */
    public ObsForwarding getObsForwarding() {
        return obsForwarding;
    }

    public void setObsForwarding(ObsForwarding obsForwarding) {
        this.obsForwarding = obsForwarding;
    }

    public ChannelDetail withAmqpForwarding(AmqpForwarding amqpForwarding) {
        this.amqpForwarding = amqpForwarding;
        return this;
    }

    public ChannelDetail withAmqpForwarding(Consumer<AmqpForwarding> amqpForwardingSetter) {
        if (this.amqpForwarding == null) {
            this.amqpForwarding = new AmqpForwarding();
            amqpForwardingSetter.accept(this.amqpForwarding);
        }

        return this;
    }

    /**
     * Get amqpForwarding
     * @return amqpForwarding
     */
    public AmqpForwarding getAmqpForwarding() {
        return amqpForwarding;
    }

    public void setAmqpForwarding(AmqpForwarding amqpForwarding) {
        this.amqpForwarding = amqpForwarding;
    }

    public ChannelDetail withDmsKafkaForwarding(DmsKafkaForwarding dmsKafkaForwarding) {
        this.dmsKafkaForwarding = dmsKafkaForwarding;
        return this;
    }

    public ChannelDetail withDmsKafkaForwarding(Consumer<DmsKafkaForwarding> dmsKafkaForwardingSetter) {
        if (this.dmsKafkaForwarding == null) {
            this.dmsKafkaForwarding = new DmsKafkaForwarding();
            dmsKafkaForwardingSetter.accept(this.dmsKafkaForwarding);
        }

        return this;
    }

    /**
     * Get dmsKafkaForwarding
     * @return dmsKafkaForwarding
     */
    public DmsKafkaForwarding getDmsKafkaForwarding() {
        return dmsKafkaForwarding;
    }

    public void setDmsKafkaForwarding(DmsKafkaForwarding dmsKafkaForwarding) {
        this.dmsKafkaForwarding = dmsKafkaForwarding;
    }

    public ChannelDetail withRomaForwarding(RomaForwarding romaForwarding) {
        this.romaForwarding = romaForwarding;
        return this;
    }

    public ChannelDetail withRomaForwarding(Consumer<RomaForwarding> romaForwardingSetter) {
        if (this.romaForwarding == null) {
            this.romaForwarding = new RomaForwarding();
            romaForwardingSetter.accept(this.romaForwarding);
        }

        return this;
    }

    /**
     * Get romaForwarding
     * @return romaForwarding
     */
    public RomaForwarding getRomaForwarding() {
        return romaForwarding;
    }

    public void setRomaForwarding(RomaForwarding romaForwarding) {
        this.romaForwarding = romaForwarding;
    }

    public ChannelDetail withMysqlForwarding(MysqlForwarding mysqlForwarding) {
        this.mysqlForwarding = mysqlForwarding;
        return this;
    }

    public ChannelDetail withMysqlForwarding(Consumer<MysqlForwarding> mysqlForwardingSetter) {
        if (this.mysqlForwarding == null) {
            this.mysqlForwarding = new MysqlForwarding();
            mysqlForwardingSetter.accept(this.mysqlForwarding);
        }

        return this;
    }

    /**
     * Get mysqlForwarding
     * @return mysqlForwarding
     */
    public MysqlForwarding getMysqlForwarding() {
        return mysqlForwarding;
    }

    public void setMysqlForwarding(MysqlForwarding mysqlForwarding) {
        this.mysqlForwarding = mysqlForwarding;
    }

    public ChannelDetail withInfluxdbForwarding(InfluxDBForwarding influxdbForwarding) {
        this.influxdbForwarding = influxdbForwarding;
        return this;
    }

    public ChannelDetail withInfluxdbForwarding(Consumer<InfluxDBForwarding> influxdbForwardingSetter) {
        if (this.influxdbForwarding == null) {
            this.influxdbForwarding = new InfluxDBForwarding();
            influxdbForwardingSetter.accept(this.influxdbForwarding);
        }

        return this;
    }

    /**
     * Get influxdbForwarding
     * @return influxdbForwarding
     */
    public InfluxDBForwarding getInfluxdbForwarding() {
        return influxdbForwarding;
    }

    public void setInfluxdbForwarding(InfluxDBForwarding influxdbForwarding) {
        this.influxdbForwarding = influxdbForwarding;
    }

    public ChannelDetail withFunctiongraphForwarding(FunctionGraphForwarding functiongraphForwarding) {
        this.functiongraphForwarding = functiongraphForwarding;
        return this;
    }

    public ChannelDetail withFunctiongraphForwarding(Consumer<FunctionGraphForwarding> functiongraphForwardingSetter) {
        if (this.functiongraphForwarding == null) {
            this.functiongraphForwarding = new FunctionGraphForwarding();
            functiongraphForwardingSetter.accept(this.functiongraphForwarding);
        }

        return this;
    }

    /**
     * Get functiongraphForwarding
     * @return functiongraphForwarding
     */
    public FunctionGraphForwarding getFunctiongraphForwarding() {
        return functiongraphForwarding;
    }

    public void setFunctiongraphForwarding(FunctionGraphForwarding functiongraphForwarding) {
        this.functiongraphForwarding = functiongraphForwarding;
    }

    public ChannelDetail withMrsKafkaForwarding(MrsKafkaForwarding mrsKafkaForwarding) {
        this.mrsKafkaForwarding = mrsKafkaForwarding;
        return this;
    }

    public ChannelDetail withMrsKafkaForwarding(Consumer<MrsKafkaForwarding> mrsKafkaForwardingSetter) {
        if (this.mrsKafkaForwarding == null) {
            this.mrsKafkaForwarding = new MrsKafkaForwarding();
            mrsKafkaForwardingSetter.accept(this.mrsKafkaForwarding);
        }

        return this;
    }

    /**
     * Get mrsKafkaForwarding
     * @return mrsKafkaForwarding
     */
    public MrsKafkaForwarding getMrsKafkaForwarding() {
        return mrsKafkaForwarding;
    }

    public void setMrsKafkaForwarding(MrsKafkaForwarding mrsKafkaForwarding) {
        this.mrsKafkaForwarding = mrsKafkaForwarding;
    }

    public ChannelDetail withDmsRocketmqForwarding(DmsRocketMQForwarding dmsRocketmqForwarding) {
        this.dmsRocketmqForwarding = dmsRocketmqForwarding;
        return this;
    }

    public ChannelDetail withDmsRocketmqForwarding(Consumer<DmsRocketMQForwarding> dmsRocketmqForwardingSetter) {
        if (this.dmsRocketmqForwarding == null) {
            this.dmsRocketmqForwarding = new DmsRocketMQForwarding();
            dmsRocketmqForwardingSetter.accept(this.dmsRocketmqForwarding);
        }

        return this;
    }

    /**
     * Get dmsRocketmqForwarding
     * @return dmsRocketmqForwarding
     */
    public DmsRocketMQForwarding getDmsRocketmqForwarding() {
        return dmsRocketmqForwarding;
    }

    public void setDmsRocketmqForwarding(DmsRocketMQForwarding dmsRocketmqForwarding) {
        this.dmsRocketmqForwarding = dmsRocketmqForwarding;
    }

    public ChannelDetail withMqttDeviceForwarding(MqttDeviceForwarding mqttDeviceForwarding) {
        this.mqttDeviceForwarding = mqttDeviceForwarding;
        return this;
    }

    public ChannelDetail withMqttDeviceForwarding(Consumer<MqttDeviceForwarding> mqttDeviceForwardingSetter) {
        if (this.mqttDeviceForwarding == null) {
            this.mqttDeviceForwarding = new MqttDeviceForwarding();
            mqttDeviceForwardingSetter.accept(this.mqttDeviceForwarding);
        }

        return this;
    }

    /**
     * Get mqttDeviceForwarding
     * @return mqttDeviceForwarding
     */
    public MqttDeviceForwarding getMqttDeviceForwarding() {
        return mqttDeviceForwarding;
    }

    public void setMqttDeviceForwarding(MqttDeviceForwarding mqttDeviceForwarding) {
        this.mqttDeviceForwarding = mqttDeviceForwarding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChannelDetail that = (ChannelDetail) obj;
        return Objects.equals(this.httpForwarding, that.httpForwarding)
            && Objects.equals(this.disForwarding, that.disForwarding)
            && Objects.equals(this.obsForwarding, that.obsForwarding)
            && Objects.equals(this.amqpForwarding, that.amqpForwarding)
            && Objects.equals(this.dmsKafkaForwarding, that.dmsKafkaForwarding)
            && Objects.equals(this.romaForwarding, that.romaForwarding)
            && Objects.equals(this.mysqlForwarding, that.mysqlForwarding)
            && Objects.equals(this.influxdbForwarding, that.influxdbForwarding)
            && Objects.equals(this.functiongraphForwarding, that.functiongraphForwarding)
            && Objects.equals(this.mrsKafkaForwarding, that.mrsKafkaForwarding)
            && Objects.equals(this.dmsRocketmqForwarding, that.dmsRocketmqForwarding)
            && Objects.equals(this.mqttDeviceForwarding, that.mqttDeviceForwarding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpForwarding,
            disForwarding,
            obsForwarding,
            amqpForwarding,
            dmsKafkaForwarding,
            romaForwarding,
            mysqlForwarding,
            influxdbForwarding,
            functiongraphForwarding,
            mrsKafkaForwarding,
            dmsRocketmqForwarding,
            mqttDeviceForwarding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelDetail {\n");
        sb.append("    httpForwarding: ").append(toIndentedString(httpForwarding)).append("\n");
        sb.append("    disForwarding: ").append(toIndentedString(disForwarding)).append("\n");
        sb.append("    obsForwarding: ").append(toIndentedString(obsForwarding)).append("\n");
        sb.append("    amqpForwarding: ").append(toIndentedString(amqpForwarding)).append("\n");
        sb.append("    dmsKafkaForwarding: ").append(toIndentedString(dmsKafkaForwarding)).append("\n");
        sb.append("    romaForwarding: ").append(toIndentedString(romaForwarding)).append("\n");
        sb.append("    mysqlForwarding: ").append(toIndentedString(mysqlForwarding)).append("\n");
        sb.append("    influxdbForwarding: ").append(toIndentedString(influxdbForwarding)).append("\n");
        sb.append("    functiongraphForwarding: ").append(toIndentedString(functiongraphForwarding)).append("\n");
        sb.append("    mrsKafkaForwarding: ").append(toIndentedString(mrsKafkaForwarding)).append("\n");
        sb.append("    dmsRocketmqForwarding: ").append(toIndentedString(dmsRocketmqForwarding)).append("\n");
        sb.append("    mqttDeviceForwarding: ").append(toIndentedString(mqttDeviceForwarding)).append("\n");
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
