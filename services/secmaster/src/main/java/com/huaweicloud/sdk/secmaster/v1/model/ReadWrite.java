package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 读写记录
 */
public class ReadWrite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accept_count")

    private Long acceptCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accept_rate")

    private Long acceptRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_instance_count")

    private Integer channelInstanceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "heart_beat")

    private HeartBeat heartBeat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "heart_beat_time")

    private Long heartBeatTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_transmission_time")

    private OffsetDateTime latestTransmissionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minion_id")

    private String minionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_count")

    private Long sendCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_rate")

    private Long sendRate;

    public ReadWrite withAcceptCount(Long acceptCount) {
        this.acceptCount = acceptCount;
        return this;
    }

    /**
     * 数值
     * minimum: 1
     * maximum: 1024
     * @return acceptCount
     */
    public Long getAcceptCount() {
        return acceptCount;
    }

    public void setAcceptCount(Long acceptCount) {
        this.acceptCount = acceptCount;
    }

    public ReadWrite withAcceptRate(Long acceptRate) {
        this.acceptRate = acceptRate;
        return this;
    }

    /**
     * 数值
     * minimum: 1
     * maximum: 1024
     * @return acceptRate
     */
    public Long getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(Long acceptRate) {
        this.acceptRate = acceptRate;
    }

    public ReadWrite withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * UUID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public ReadWrite withChannelInstanceCount(Integer channelInstanceCount) {
        this.channelInstanceCount = channelInstanceCount;
        return this;
    }

    /**
     * 采集通道实例的数量
     * minimum: 1
     * maximum: 1024
     * @return channelInstanceCount
     */
    public Integer getChannelInstanceCount() {
        return channelInstanceCount;
    }

    public void setChannelInstanceCount(Integer channelInstanceCount) {
        this.channelInstanceCount = channelInstanceCount;
    }

    public ReadWrite withHeartBeat(HeartBeat heartBeat) {
        this.heartBeat = heartBeat;
        return this;
    }

    /**
     * Get heartBeat
     * @return heartBeat
     */
    public HeartBeat getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(HeartBeat heartBeat) {
        this.heartBeat = heartBeat;
    }

    public ReadWrite withHeartBeatTime(Long heartBeatTime) {
        this.heartBeatTime = heartBeatTime;
        return this;
    }

    /**
     * 最后一次接收到心跳信号的时间
     * minimum: 0
     * maximum: 9223372036854775800
     * @return heartBeatTime
     */
    public Long getHeartBeatTime() {
        return heartBeatTime;
    }

    public void setHeartBeatTime(Long heartBeatTime) {
        this.heartBeatTime = heartBeatTime;
    }

    public ReadWrite withLatestTransmissionTime(OffsetDateTime latestTransmissionTime) {
        this.latestTransmissionTime = latestTransmissionTime;
        return this;
    }

    /**
     * 最后一次传输的时间
     * @return latestTransmissionTime
     */
    public OffsetDateTime getLatestTransmissionTime() {
        return latestTransmissionTime;
    }

    public void setLatestTransmissionTime(OffsetDateTime latestTransmissionTime) {
        this.latestTransmissionTime = latestTransmissionTime;
    }

    public ReadWrite withMinionId(String minionId) {
        this.minionId = minionId;
        return this;
    }

    /**
     * UUID
     * @return minionId
     */
    public String getMinionId() {
        return minionId;
    }

    public void setMinionId(String minionId) {
        this.minionId = minionId;
    }

    public ReadWrite withSendCount(Long sendCount) {
        this.sendCount = sendCount;
        return this;
    }

    /**
     * 数值
     * minimum: 1
     * maximum: 1024
     * @return sendCount
     */
    public Long getSendCount() {
        return sendCount;
    }

    public void setSendCount(Long sendCount) {
        this.sendCount = sendCount;
    }

    public ReadWrite withSendRate(Long sendRate) {
        this.sendRate = sendRate;
        return this;
    }

    /**
     * 数值
     * minimum: 1
     * maximum: 1024
     * @return sendRate
     */
    public Long getSendRate() {
        return sendRate;
    }

    public void setSendRate(Long sendRate) {
        this.sendRate = sendRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReadWrite that = (ReadWrite) obj;
        return Objects.equals(this.acceptCount, that.acceptCount) && Objects.equals(this.acceptRate, that.acceptRate)
            && Objects.equals(this.channelId, that.channelId)
            && Objects.equals(this.channelInstanceCount, that.channelInstanceCount)
            && Objects.equals(this.heartBeat, that.heartBeat) && Objects.equals(this.heartBeatTime, that.heartBeatTime)
            && Objects.equals(this.latestTransmissionTime, that.latestTransmissionTime)
            && Objects.equals(this.minionId, that.minionId) && Objects.equals(this.sendCount, that.sendCount)
            && Objects.equals(this.sendRate, that.sendRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceptCount,
            acceptRate,
            channelId,
            channelInstanceCount,
            heartBeat,
            heartBeatTime,
            latestTransmissionTime,
            minionId,
            sendCount,
            sendRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadWrite {\n");
        sb.append("    acceptCount: ").append(toIndentedString(acceptCount)).append("\n");
        sb.append("    acceptRate: ").append(toIndentedString(acceptRate)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    channelInstanceCount: ").append(toIndentedString(channelInstanceCount)).append("\n");
        sb.append("    heartBeat: ").append(toIndentedString(heartBeat)).append("\n");
        sb.append("    heartBeatTime: ").append(toIndentedString(heartBeatTime)).append("\n");
        sb.append("    latestTransmissionTime: ").append(toIndentedString(latestTransmissionTime)).append("\n");
        sb.append("    minionId: ").append(toIndentedString(minionId)).append("\n");
        sb.append("    sendCount: ").append(toIndentedString(sendCount)).append("\n");
        sb.append("    sendRate: ").append(toIndentedString(sendRate)).append("\n");
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
