package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.AmqpForwarding;
import com.huaweicloud.sdk.iotda.v5.model.HttpForwarding;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 物联网平台转发数据的通道配置参数。
 */
public class ChannelDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http_forwarding")
    
    private HttpForwarding httpForwarding = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amqp_forwarding")
    
    private AmqpForwarding amqpForwarding = null;

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
            Objects.equals(this.amqpForwarding, channelDetail.amqpForwarding);
    }
    @Override
    public int hashCode() {
        return Objects.hash(httpForwarding, amqpForwarding);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelDetail {\n");
        sb.append("    httpForwarding: ").append(toIndentedString(httpForwarding)).append("\n");
        sb.append("    amqpForwarding: ").append(toIndentedString(amqpForwarding)).append("\n");
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

