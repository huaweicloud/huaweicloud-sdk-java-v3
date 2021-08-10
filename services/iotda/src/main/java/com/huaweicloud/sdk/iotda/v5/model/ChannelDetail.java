package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 物联网平台转发数据的通道配置参数。 */
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

    /** Get httpForwarding
     * 
     * @return httpForwarding */
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

    /** Get disForwarding
     * 
     * @return disForwarding */
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

    /** Get obsForwarding
     * 
     * @return obsForwarding */
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

    /** Get amqpForwarding
     * 
     * @return amqpForwarding */
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

    /** Get dmsKafkaForwarding
     * 
     * @return dmsKafkaForwarding */
    public DmsKafkaForwarding getDmsKafkaForwarding() {
        return dmsKafkaForwarding;
    }

    public void setDmsKafkaForwarding(DmsKafkaForwarding dmsKafkaForwarding) {
        this.dmsKafkaForwarding = dmsKafkaForwarding;
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
        return Objects.equals(this.httpForwarding, channelDetail.httpForwarding)
            && Objects.equals(this.disForwarding, channelDetail.disForwarding)
            && Objects.equals(this.obsForwarding, channelDetail.obsForwarding)
            && Objects.equals(this.amqpForwarding, channelDetail.amqpForwarding)
            && Objects.equals(this.dmsKafkaForwarding, channelDetail.dmsKafkaForwarding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpForwarding, disForwarding, obsForwarding, amqpForwarding, dmsKafkaForwarding);
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
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
