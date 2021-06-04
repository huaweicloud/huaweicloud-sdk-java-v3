package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.AmqpForwarding;
import com.huaweicloud.sdk.iotda.v5.model.DisForwarding;
import com.huaweicloud.sdk.iotda.v5.model.DmsKafkaForwarding;
import com.huaweicloud.sdk.iotda.v5.model.FunctionGraphForwarding;
import com.huaweicloud.sdk.iotda.v5.model.HttpForwarding;
import com.huaweicloud.sdk.iotda.v5.model.InfluxDBForwarding;
import com.huaweicloud.sdk.iotda.v5.model.IoTAForwarding;
import com.huaweicloud.sdk.iotda.v5.model.LtsForwarding;
import com.huaweicloud.sdk.iotda.v5.model.MqsForwarding;
import com.huaweicloud.sdk.iotda.v5.model.MqttForwarding;
import com.huaweicloud.sdk.iotda.v5.model.MrsKafkaForwarding;
import com.huaweicloud.sdk.iotda.v5.model.MysqlForwarding;
import com.huaweicloud.sdk.iotda.v5.model.ObsForwarding;
import com.huaweicloud.sdk.iotda.v5.model.PulsarForwarding;
import com.huaweicloud.sdk.iotda.v5.model.RomaForwarding;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 物联网平台转发数据的通道配置参数。
 */
public class ChannelDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http_forwarding")
    
    private HttpForwarding httpForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dis_forwarding")
    
    private DisForwarding disForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_forwarding")
    
    private ObsForwarding obsForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amqp_forwarding")
    
    private AmqpForwarding amqpForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dms_kafka_forwarding")
    
    private DmsKafkaForwarding dmsKafkaForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_forwarding")
    
    private RomaForwarding romaForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iota_forwarding")
    
    private IoTAForwarding iotaForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mqs_forwarding")
    
    private MqsForwarding mqsForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mysql_forwarding")
    
    private MysqlForwarding mysqlForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mqtt_forwarding")
    
    private MqttForwarding mqttForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lts_forwarding")
    
    private LtsForwarding ltsForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="influxdb_forwarding")
    
    private InfluxDBForwarding influxdbForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="functiongraph_forwarding")
    
    private FunctionGraphForwarding functiongraphForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mrs_kafka_forwarding")
    
    private MrsKafkaForwarding mrsKafkaForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pulsar_forwarding")
    
    private PulsarForwarding pulsarForwarding;

    public ChannelDetail withHttpForwarding(HttpForwarding httpForwarding) {
        this.httpForwarding = httpForwarding;
        return this;
    }

    public ChannelDetail withHttpForwarding(Consumer<HttpForwarding> httpForwardingSetter) {
        if(this.httpForwarding == null ){
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
        if(this.disForwarding == null ){
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
        if(this.obsForwarding == null ){
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
        if(this.amqpForwarding == null ){
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
        if(this.dmsKafkaForwarding == null ){
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
        if(this.romaForwarding == null ){
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

    

    public ChannelDetail withIotaForwarding(IoTAForwarding iotaForwarding) {
        this.iotaForwarding = iotaForwarding;
        return this;
    }

    public ChannelDetail withIotaForwarding(Consumer<IoTAForwarding> iotaForwardingSetter) {
        if(this.iotaForwarding == null ){
            this.iotaForwarding = new IoTAForwarding();
            iotaForwardingSetter.accept(this.iotaForwarding);
        }
        
        return this;
    }


    /**
     * Get iotaForwarding
     * @return iotaForwarding
     */
    public IoTAForwarding getIotaForwarding() {
        return iotaForwarding;
    }

    public void setIotaForwarding(IoTAForwarding iotaForwarding) {
        this.iotaForwarding = iotaForwarding;
    }

    

    public ChannelDetail withMqsForwarding(MqsForwarding mqsForwarding) {
        this.mqsForwarding = mqsForwarding;
        return this;
    }

    public ChannelDetail withMqsForwarding(Consumer<MqsForwarding> mqsForwardingSetter) {
        if(this.mqsForwarding == null ){
            this.mqsForwarding = new MqsForwarding();
            mqsForwardingSetter.accept(this.mqsForwarding);
        }
        
        return this;
    }


    /**
     * Get mqsForwarding
     * @return mqsForwarding
     */
    public MqsForwarding getMqsForwarding() {
        return mqsForwarding;
    }

    public void setMqsForwarding(MqsForwarding mqsForwarding) {
        this.mqsForwarding = mqsForwarding;
    }

    

    public ChannelDetail withMysqlForwarding(MysqlForwarding mysqlForwarding) {
        this.mysqlForwarding = mysqlForwarding;
        return this;
    }

    public ChannelDetail withMysqlForwarding(Consumer<MysqlForwarding> mysqlForwardingSetter) {
        if(this.mysqlForwarding == null ){
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

    

    public ChannelDetail withMqttForwarding(MqttForwarding mqttForwarding) {
        this.mqttForwarding = mqttForwarding;
        return this;
    }

    public ChannelDetail withMqttForwarding(Consumer<MqttForwarding> mqttForwardingSetter) {
        if(this.mqttForwarding == null ){
            this.mqttForwarding = new MqttForwarding();
            mqttForwardingSetter.accept(this.mqttForwarding);
        }
        
        return this;
    }


    /**
     * Get mqttForwarding
     * @return mqttForwarding
     */
    public MqttForwarding getMqttForwarding() {
        return mqttForwarding;
    }

    public void setMqttForwarding(MqttForwarding mqttForwarding) {
        this.mqttForwarding = mqttForwarding;
    }

    

    public ChannelDetail withLtsForwarding(LtsForwarding ltsForwarding) {
        this.ltsForwarding = ltsForwarding;
        return this;
    }

    public ChannelDetail withLtsForwarding(Consumer<LtsForwarding> ltsForwardingSetter) {
        if(this.ltsForwarding == null ){
            this.ltsForwarding = new LtsForwarding();
            ltsForwardingSetter.accept(this.ltsForwarding);
        }
        
        return this;
    }


    /**
     * Get ltsForwarding
     * @return ltsForwarding
     */
    public LtsForwarding getLtsForwarding() {
        return ltsForwarding;
    }

    public void setLtsForwarding(LtsForwarding ltsForwarding) {
        this.ltsForwarding = ltsForwarding;
    }

    

    public ChannelDetail withInfluxdbForwarding(InfluxDBForwarding influxdbForwarding) {
        this.influxdbForwarding = influxdbForwarding;
        return this;
    }

    public ChannelDetail withInfluxdbForwarding(Consumer<InfluxDBForwarding> influxdbForwardingSetter) {
        if(this.influxdbForwarding == null ){
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
        if(this.functiongraphForwarding == null ){
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
        if(this.mrsKafkaForwarding == null ){
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

    

    public ChannelDetail withPulsarForwarding(PulsarForwarding pulsarForwarding) {
        this.pulsarForwarding = pulsarForwarding;
        return this;
    }

    public ChannelDetail withPulsarForwarding(Consumer<PulsarForwarding> pulsarForwardingSetter) {
        if(this.pulsarForwarding == null ){
            this.pulsarForwarding = new PulsarForwarding();
            pulsarForwardingSetter.accept(this.pulsarForwarding);
        }
        
        return this;
    }


    /**
     * Get pulsarForwarding
     * @return pulsarForwarding
     */
    public PulsarForwarding getPulsarForwarding() {
        return pulsarForwarding;
    }

    public void setPulsarForwarding(PulsarForwarding pulsarForwarding) {
        this.pulsarForwarding = pulsarForwarding;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelDetail channelDetail = (ChannelDetail) o;
        return Objects.equals(this.httpForwarding, channelDetail.httpForwarding) &&
            Objects.equals(this.disForwarding, channelDetail.disForwarding) &&
            Objects.equals(this.obsForwarding, channelDetail.obsForwarding) &&
            Objects.equals(this.amqpForwarding, channelDetail.amqpForwarding) &&
            Objects.equals(this.dmsKafkaForwarding, channelDetail.dmsKafkaForwarding) &&
            Objects.equals(this.romaForwarding, channelDetail.romaForwarding) &&
            Objects.equals(this.iotaForwarding, channelDetail.iotaForwarding) &&
            Objects.equals(this.mqsForwarding, channelDetail.mqsForwarding) &&
            Objects.equals(this.mysqlForwarding, channelDetail.mysqlForwarding) &&
            Objects.equals(this.mqttForwarding, channelDetail.mqttForwarding) &&
            Objects.equals(this.ltsForwarding, channelDetail.ltsForwarding) &&
            Objects.equals(this.influxdbForwarding, channelDetail.influxdbForwarding) &&
            Objects.equals(this.functiongraphForwarding, channelDetail.functiongraphForwarding) &&
            Objects.equals(this.mrsKafkaForwarding, channelDetail.mrsKafkaForwarding) &&
            Objects.equals(this.pulsarForwarding, channelDetail.pulsarForwarding);
    }
    @Override
    public int hashCode() {
        return Objects.hash(httpForwarding, disForwarding, obsForwarding, amqpForwarding, dmsKafkaForwarding, romaForwarding, iotaForwarding, mqsForwarding, mysqlForwarding, mqttForwarding, ltsForwarding, influxdbForwarding, functiongraphForwarding, mrsKafkaForwarding, pulsarForwarding);
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
        sb.append("    iotaForwarding: ").append(toIndentedString(iotaForwarding)).append("\n");
        sb.append("    mqsForwarding: ").append(toIndentedString(mqsForwarding)).append("\n");
        sb.append("    mysqlForwarding: ").append(toIndentedString(mysqlForwarding)).append("\n");
        sb.append("    mqttForwarding: ").append(toIndentedString(mqttForwarding)).append("\n");
        sb.append("    ltsForwarding: ").append(toIndentedString(ltsForwarding)).append("\n");
        sb.append("    influxdbForwarding: ").append(toIndentedString(influxdbForwarding)).append("\n");
        sb.append("    functiongraphForwarding: ").append(toIndentedString(functiongraphForwarding)).append("\n");
        sb.append("    mrsKafkaForwarding: ").append(toIndentedString(mrsKafkaForwarding)).append("\n");
        sb.append("    pulsarForwarding: ").append(toIndentedString(pulsarForwarding)).append("\n");
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

