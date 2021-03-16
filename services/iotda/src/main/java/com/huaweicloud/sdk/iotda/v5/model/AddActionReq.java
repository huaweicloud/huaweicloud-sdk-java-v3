package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.ChannelDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建规则动作请求结构体
 */
public class AddActionReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_id")
    
    private String ruleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel")
    
    private String channel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel_detail")
    
    private ChannelDetail channelDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="batch")
    
    private Boolean batch;

    public AddActionReq withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    


    /**
     * 规则触发条件ID，用于唯一标识一条规则触发条件，在创建规则时由物联网平台分配获得。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    

    public AddActionReq withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    


    /**
     * 规则动作的类型，取值范围： - HTTP_FORWARDING：HTTP服务消息类型。 - DIS_FORWARDING：转发DIS服务消息类型。 - OBS_FORWARDING：转发OBS服务消息类型。 - AMQP_FORWARDING：转发AMQP服务消息类型。 - DMS_KAFKA_FORWARDING：转发kafka消息类型。 
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    

    public AddActionReq withChannelDetail(ChannelDetail channelDetail) {
        this.channelDetail = channelDetail;
        return this;
    }

    public AddActionReq withChannelDetail(Consumer<ChannelDetail> channelDetailSetter) {
        if(this.channelDetail == null ){
            this.channelDetail = new ChannelDetail();
            channelDetailSetter.accept(this.channelDetail);
        }
        
        return this;
    }


    /**
     * Get channelDetail
     * @return channelDetail
     */
    public ChannelDetail getChannelDetail() {
        return channelDetail;
    }

    public void setChannelDetail(ChannelDetail channelDetail) {
        this.channelDetail = channelDetail;
    }

    

    public AddActionReq withBatch(Boolean batch) {
        this.batch = batch;
        return this;
    }

    


    /**
     * 是否支持批量接收推送消息。
     * @return batch
     */
    public Boolean getBatch() {
        return batch;
    }

    public void setBatch(Boolean batch) {
        this.batch = batch;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddActionReq addActionReq = (AddActionReq) o;
        return Objects.equals(this.ruleId, addActionReq.ruleId) &&
            Objects.equals(this.channel, addActionReq.channel) &&
            Objects.equals(this.channelDetail, addActionReq.channelDetail) &&
            Objects.equals(this.batch, addActionReq.batch);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ruleId, channel, channelDetail, batch);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddActionReq {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    channelDetail: ").append(toIndentedString(channelDetail)).append("\n");
        sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
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

