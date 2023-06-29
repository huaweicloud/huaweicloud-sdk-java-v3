package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StreamingMediaReport
 */
public class StreamingMediaReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streamingPlayTimes")

    private Long streamingPlayTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streamingErrorTimes")

    private Long streamingErrorTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streamingSuccessRate")

    private Double streamingSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sentPacketsPerSecond")

    private Double sentPacketsPerSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receivedPacketsPerSecond")

    private Double receivedPacketsPerSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recvPackets")

    private Double recvPackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sendPackets")

    private Double sendPackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audioSentBytes")

    private Double audioSentBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audioRecBytes")

    private Double audioRecBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videoSentBytes")

    private Double videoSentBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videoRecBytes")

    private Double videoRecBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sumRecvKeyFrameDelay")

    private Double sumRecvKeyFrameDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgRecvKeyFrameDelay")

    private Double avgRecvKeyFrameDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minRecvKeyFrameDelay")

    private Double minRecvKeyFrameDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRecvKeyFrameDelay")

    private Double maxRecvKeyFrameDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sumSendKeyFrameDelay")

    private Double sumSendKeyFrameDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgSendKeyFrameDelay")

    private Double avgSendKeyFrameDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minSendKeyFrameDelay")

    private Double minSendKeyFrameDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSendKeyFrameDelay")

    private Double maxSendKeyFrameDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyFrameSendCnt")

    private Double keyFrameSendCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyFrameReceiveCnt")

    private Double keyFrameReceiveCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcpConnectFailed")

    private Double tcpConnectFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handShakeFailed")

    private Double handShakeFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtmpConnectFailed")

    private Double rtmpConnectFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createStreamFailed")

    private Double createStreamFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playFailed")

    private Double playFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publishFailed")

    private Double publishFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retryFailed")

    private Double retryFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parseFileFailed")

    private Double parseFileFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "illegalUrlFailed")

    private Double illegalUrlFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "illegalFlvHeaderFailed")

    private Double illegalFlvHeaderFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpTimeoutFailed")

    private Double httpTimeoutFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parseFlvFileFailed")

    private Double parseFlvFileFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknownFailed")

    private Double unknownFailed;

    public StreamingMediaReport withStreamingPlayTimes(Long streamingPlayTimes) {
        this.streamingPlayTimes = streamingPlayTimes;
        return this;
    }

    /**
     * 流媒体播放次数(流媒体aw执行次数)
     * @return streamingPlayTimes
     */
    public Long getStreamingPlayTimes() {
        return streamingPlayTimes;
    }

    public void setStreamingPlayTimes(Long streamingPlayTimes) {
        this.streamingPlayTimes = streamingPlayTimes;
    }

    public StreamingMediaReport withStreamingErrorTimes(Long streamingErrorTimes) {
        this.streamingErrorTimes = streamingErrorTimes;
        return this;
    }

    /**
     * 流媒体播放出现失败的次数(失败的流媒体aw次数)
     * @return streamingErrorTimes
     */
    public Long getStreamingErrorTimes() {
        return streamingErrorTimes;
    }

    public void setStreamingErrorTimes(Long streamingErrorTimes) {
        this.streamingErrorTimes = streamingErrorTimes;
    }

    public StreamingMediaReport withStreamingSuccessRate(Double streamingSuccessRate) {
        this.streamingSuccessRate = streamingSuccessRate;
        return this;
    }

    /**
     * 流媒体播放成功率
     * @return streamingSuccessRate
     */
    public Double getStreamingSuccessRate() {
        return streamingSuccessRate;
    }

    public void setStreamingSuccessRate(Double streamingSuccessRate) {
        this.streamingSuccessRate = streamingSuccessRate;
    }

    public StreamingMediaReport withSentPacketsPerSecond(Double sentPacketsPerSecond) {
        this.sentPacketsPerSecond = sentPacketsPerSecond;
        return this;
    }

    /**
     * 每秒发送数据包大小
     * @return sentPacketsPerSecond
     */
    public Double getSentPacketsPerSecond() {
        return sentPacketsPerSecond;
    }

    public void setSentPacketsPerSecond(Double sentPacketsPerSecond) {
        this.sentPacketsPerSecond = sentPacketsPerSecond;
    }

    public StreamingMediaReport withReceivedPacketsPerSecond(Double receivedPacketsPerSecond) {
        this.receivedPacketsPerSecond = receivedPacketsPerSecond;
        return this;
    }

    /**
     * 每秒接收数据包大小
     * @return receivedPacketsPerSecond
     */
    public Double getReceivedPacketsPerSecond() {
        return receivedPacketsPerSecond;
    }

    public void setReceivedPacketsPerSecond(Double receivedPacketsPerSecond) {
        this.receivedPacketsPerSecond = receivedPacketsPerSecond;
    }

    public StreamingMediaReport withRecvPackets(Double recvPackets) {
        this.recvPackets = recvPackets;
        return this;
    }

    /**
     * 接收数据包大小
     * @return recvPackets
     */
    public Double getRecvPackets() {
        return recvPackets;
    }

    public void setRecvPackets(Double recvPackets) {
        this.recvPackets = recvPackets;
    }

    public StreamingMediaReport withSendPackets(Double sendPackets) {
        this.sendPackets = sendPackets;
        return this;
    }

    /**
     * 发送数据包大小
     * @return sendPackets
     */
    public Double getSendPackets() {
        return sendPackets;
    }

    public void setSendPackets(Double sendPackets) {
        this.sendPackets = sendPackets;
    }

    public StreamingMediaReport withAudioSentBytes(Double audioSentBytes) {
        this.audioSentBytes = audioSentBytes;
        return this;
    }

    /**
     * 音频发送字节大小
     * @return audioSentBytes
     */
    public Double getAudioSentBytes() {
        return audioSentBytes;
    }

    public void setAudioSentBytes(Double audioSentBytes) {
        this.audioSentBytes = audioSentBytes;
    }

    public StreamingMediaReport withAudioRecBytes(Double audioRecBytes) {
        this.audioRecBytes = audioRecBytes;
        return this;
    }

    /**
     * 音频接收字节大小
     * @return audioRecBytes
     */
    public Double getAudioRecBytes() {
        return audioRecBytes;
    }

    public void setAudioRecBytes(Double audioRecBytes) {
        this.audioRecBytes = audioRecBytes;
    }

    public StreamingMediaReport withVideoSentBytes(Double videoSentBytes) {
        this.videoSentBytes = videoSentBytes;
        return this;
    }

    /**
     * 视频发送字节大小
     * @return videoSentBytes
     */
    public Double getVideoSentBytes() {
        return videoSentBytes;
    }

    public void setVideoSentBytes(Double videoSentBytes) {
        this.videoSentBytes = videoSentBytes;
    }

    public StreamingMediaReport withVideoRecBytes(Double videoRecBytes) {
        this.videoRecBytes = videoRecBytes;
        return this;
    }

    /**
     * 视频接收字节大小
     * @return videoRecBytes
     */
    public Double getVideoRecBytes() {
        return videoRecBytes;
    }

    public void setVideoRecBytes(Double videoRecBytes) {
        this.videoRecBytes = videoRecBytes;
    }

    public StreamingMediaReport withSumRecvKeyFrameDelay(Double sumRecvKeyFrameDelay) {
        this.sumRecvKeyFrameDelay = sumRecvKeyFrameDelay;
        return this;
    }

    /**
     * 接收关键帧延迟之和
     * @return sumRecvKeyFrameDelay
     */
    public Double getSumRecvKeyFrameDelay() {
        return sumRecvKeyFrameDelay;
    }

    public void setSumRecvKeyFrameDelay(Double sumRecvKeyFrameDelay) {
        this.sumRecvKeyFrameDelay = sumRecvKeyFrameDelay;
    }

    public StreamingMediaReport withAvgRecvKeyFrameDelay(Double avgRecvKeyFrameDelay) {
        this.avgRecvKeyFrameDelay = avgRecvKeyFrameDelay;
        return this;
    }

    /**
     * 平均接收关键帧延迟
     * @return avgRecvKeyFrameDelay
     */
    public Double getAvgRecvKeyFrameDelay() {
        return avgRecvKeyFrameDelay;
    }

    public void setAvgRecvKeyFrameDelay(Double avgRecvKeyFrameDelay) {
        this.avgRecvKeyFrameDelay = avgRecvKeyFrameDelay;
    }

    public StreamingMediaReport withMinRecvKeyFrameDelay(Double minRecvKeyFrameDelay) {
        this.minRecvKeyFrameDelay = minRecvKeyFrameDelay;
        return this;
    }

    /**
     * 最小接收关键帧延迟
     * @return minRecvKeyFrameDelay
     */
    public Double getMinRecvKeyFrameDelay() {
        return minRecvKeyFrameDelay;
    }

    public void setMinRecvKeyFrameDelay(Double minRecvKeyFrameDelay) {
        this.minRecvKeyFrameDelay = minRecvKeyFrameDelay;
    }

    public StreamingMediaReport withMaxRecvKeyFrameDelay(Double maxRecvKeyFrameDelay) {
        this.maxRecvKeyFrameDelay = maxRecvKeyFrameDelay;
        return this;
    }

    /**
     * 最大接收关键帧延迟
     * @return maxRecvKeyFrameDelay
     */
    public Double getMaxRecvKeyFrameDelay() {
        return maxRecvKeyFrameDelay;
    }

    public void setMaxRecvKeyFrameDelay(Double maxRecvKeyFrameDelay) {
        this.maxRecvKeyFrameDelay = maxRecvKeyFrameDelay;
    }

    public StreamingMediaReport withSumSendKeyFrameDelay(Double sumSendKeyFrameDelay) {
        this.sumSendKeyFrameDelay = sumSendKeyFrameDelay;
        return this;
    }

    /**
     * 发送关键帧延迟之和
     * @return sumSendKeyFrameDelay
     */
    public Double getSumSendKeyFrameDelay() {
        return sumSendKeyFrameDelay;
    }

    public void setSumSendKeyFrameDelay(Double sumSendKeyFrameDelay) {
        this.sumSendKeyFrameDelay = sumSendKeyFrameDelay;
    }

    public StreamingMediaReport withAvgSendKeyFrameDelay(Double avgSendKeyFrameDelay) {
        this.avgSendKeyFrameDelay = avgSendKeyFrameDelay;
        return this;
    }

    /**
     * 平均发送关键帧延迟
     * @return avgSendKeyFrameDelay
     */
    public Double getAvgSendKeyFrameDelay() {
        return avgSendKeyFrameDelay;
    }

    public void setAvgSendKeyFrameDelay(Double avgSendKeyFrameDelay) {
        this.avgSendKeyFrameDelay = avgSendKeyFrameDelay;
    }

    public StreamingMediaReport withMinSendKeyFrameDelay(Double minSendKeyFrameDelay) {
        this.minSendKeyFrameDelay = minSendKeyFrameDelay;
        return this;
    }

    /**
     * 最小发送关键帧延迟
     * @return minSendKeyFrameDelay
     */
    public Double getMinSendKeyFrameDelay() {
        return minSendKeyFrameDelay;
    }

    public void setMinSendKeyFrameDelay(Double minSendKeyFrameDelay) {
        this.minSendKeyFrameDelay = minSendKeyFrameDelay;
    }

    public StreamingMediaReport withMaxSendKeyFrameDelay(Double maxSendKeyFrameDelay) {
        this.maxSendKeyFrameDelay = maxSendKeyFrameDelay;
        return this;
    }

    /**
     * 最大发送关键帧延迟
     * @return maxSendKeyFrameDelay
     */
    public Double getMaxSendKeyFrameDelay() {
        return maxSendKeyFrameDelay;
    }

    public void setMaxSendKeyFrameDelay(Double maxSendKeyFrameDelay) {
        this.maxSendKeyFrameDelay = maxSendKeyFrameDelay;
    }

    public StreamingMediaReport withKeyFrameSendCnt(Double keyFrameSendCnt) {
        this.keyFrameSendCnt = keyFrameSendCnt;
        return this;
    }

    /**
     * 关键帧发送次数
     * @return keyFrameSendCnt
     */
    public Double getKeyFrameSendCnt() {
        return keyFrameSendCnt;
    }

    public void setKeyFrameSendCnt(Double keyFrameSendCnt) {
        this.keyFrameSendCnt = keyFrameSendCnt;
    }

    public StreamingMediaReport withKeyFrameReceiveCnt(Double keyFrameReceiveCnt) {
        this.keyFrameReceiveCnt = keyFrameReceiveCnt;
        return this;
    }

    /**
     * 关键帧接收次数
     * @return keyFrameReceiveCnt
     */
    public Double getKeyFrameReceiveCnt() {
        return keyFrameReceiveCnt;
    }

    public void setKeyFrameReceiveCnt(Double keyFrameReceiveCnt) {
        this.keyFrameReceiveCnt = keyFrameReceiveCnt;
    }

    public StreamingMediaReport withTcpConnectFailed(Double tcpConnectFailed) {
        this.tcpConnectFailed = tcpConnectFailed;
        return this;
    }

    /**
     * TCP连接失败数
     * @return tcpConnectFailed
     */
    public Double getTcpConnectFailed() {
        return tcpConnectFailed;
    }

    public void setTcpConnectFailed(Double tcpConnectFailed) {
        this.tcpConnectFailed = tcpConnectFailed;
    }

    public StreamingMediaReport withHandShakeFailed(Double handShakeFailed) {
        this.handShakeFailed = handShakeFailed;
        return this;
    }

    /**
     * 握手失败数
     * @return handShakeFailed
     */
    public Double getHandShakeFailed() {
        return handShakeFailed;
    }

    public void setHandShakeFailed(Double handShakeFailed) {
        this.handShakeFailed = handShakeFailed;
    }

    public StreamingMediaReport withRtmpConnectFailed(Double rtmpConnectFailed) {
        this.rtmpConnectFailed = rtmpConnectFailed;
        return this;
    }

    /**
     * RTMP连接失败数
     * @return rtmpConnectFailed
     */
    public Double getRtmpConnectFailed() {
        return rtmpConnectFailed;
    }

    public void setRtmpConnectFailed(Double rtmpConnectFailed) {
        this.rtmpConnectFailed = rtmpConnectFailed;
    }

    public StreamingMediaReport withCreateStreamFailed(Double createStreamFailed) {
        this.createStreamFailed = createStreamFailed;
        return this;
    }

    /**
     * 创建流失败数
     * @return createStreamFailed
     */
    public Double getCreateStreamFailed() {
        return createStreamFailed;
    }

    public void setCreateStreamFailed(Double createStreamFailed) {
        this.createStreamFailed = createStreamFailed;
    }

    public StreamingMediaReport withPlayFailed(Double playFailed) {
        this.playFailed = playFailed;
        return this;
    }

    /**
     * 播放失败数
     * @return playFailed
     */
    public Double getPlayFailed() {
        return playFailed;
    }

    public void setPlayFailed(Double playFailed) {
        this.playFailed = playFailed;
    }

    public StreamingMediaReport withPublishFailed(Double publishFailed) {
        this.publishFailed = publishFailed;
        return this;
    }

    /**
     * 发布失败数
     * @return publishFailed
     */
    public Double getPublishFailed() {
        return publishFailed;
    }

    public void setPublishFailed(Double publishFailed) {
        this.publishFailed = publishFailed;
    }

    public StreamingMediaReport withRetryFailed(Double retryFailed) {
        this.retryFailed = retryFailed;
        return this;
    }

    /**
     * 重试失败数
     * @return retryFailed
     */
    public Double getRetryFailed() {
        return retryFailed;
    }

    public void setRetryFailed(Double retryFailed) {
        this.retryFailed = retryFailed;
    }

    public StreamingMediaReport withParseFileFailed(Double parseFileFailed) {
        this.parseFileFailed = parseFileFailed;
        return this;
    }

    /**
     * 解析文件失败数
     * @return parseFileFailed
     */
    public Double getParseFileFailed() {
        return parseFileFailed;
    }

    public void setParseFileFailed(Double parseFileFailed) {
        this.parseFileFailed = parseFileFailed;
    }

    public StreamingMediaReport withIllegalUrlFailed(Double illegalUrlFailed) {
        this.illegalUrlFailed = illegalUrlFailed;
        return this;
    }

    /**
     * 非法URL失败数
     * @return illegalUrlFailed
     */
    public Double getIllegalUrlFailed() {
        return illegalUrlFailed;
    }

    public void setIllegalUrlFailed(Double illegalUrlFailed) {
        this.illegalUrlFailed = illegalUrlFailed;
    }

    public StreamingMediaReport withIllegalFlvHeaderFailed(Double illegalFlvHeaderFailed) {
        this.illegalFlvHeaderFailed = illegalFlvHeaderFailed;
        return this;
    }

    /**
     * 非法FLV Header失败数
     * @return illegalFlvHeaderFailed
     */
    public Double getIllegalFlvHeaderFailed() {
        return illegalFlvHeaderFailed;
    }

    public void setIllegalFlvHeaderFailed(Double illegalFlvHeaderFailed) {
        this.illegalFlvHeaderFailed = illegalFlvHeaderFailed;
    }

    public StreamingMediaReport withHttpTimeoutFailed(Double httpTimeoutFailed) {
        this.httpTimeoutFailed = httpTimeoutFailed;
        return this;
    }

    /**
     * HTTP连接超时数
     * @return httpTimeoutFailed
     */
    public Double getHttpTimeoutFailed() {
        return httpTimeoutFailed;
    }

    public void setHttpTimeoutFailed(Double httpTimeoutFailed) {
        this.httpTimeoutFailed = httpTimeoutFailed;
    }

    public StreamingMediaReport withParseFlvFileFailed(Double parseFlvFileFailed) {
        this.parseFlvFileFailed = parseFlvFileFailed;
        return this;
    }

    /**
     * 解析FLV文件失败数
     * @return parseFlvFileFailed
     */
    public Double getParseFlvFileFailed() {
        return parseFlvFileFailed;
    }

    public void setParseFlvFileFailed(Double parseFlvFileFailed) {
        this.parseFlvFileFailed = parseFlvFileFailed;
    }

    public StreamingMediaReport withUnknownFailed(Double unknownFailed) {
        this.unknownFailed = unknownFailed;
        return this;
    }

    /**
     * 未知错误数
     * @return unknownFailed
     */
    public Double getUnknownFailed() {
        return unknownFailed;
    }

    public void setUnknownFailed(Double unknownFailed) {
        this.unknownFailed = unknownFailed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamingMediaReport that = (StreamingMediaReport) obj;
        return Objects.equals(this.streamingPlayTimes, that.streamingPlayTimes)
            && Objects.equals(this.streamingErrorTimes, that.streamingErrorTimes)
            && Objects.equals(this.streamingSuccessRate, that.streamingSuccessRate)
            && Objects.equals(this.sentPacketsPerSecond, that.sentPacketsPerSecond)
            && Objects.equals(this.receivedPacketsPerSecond, that.receivedPacketsPerSecond)
            && Objects.equals(this.recvPackets, that.recvPackets) && Objects.equals(this.sendPackets, that.sendPackets)
            && Objects.equals(this.audioSentBytes, that.audioSentBytes)
            && Objects.equals(this.audioRecBytes, that.audioRecBytes)
            && Objects.equals(this.videoSentBytes, that.videoSentBytes)
            && Objects.equals(this.videoRecBytes, that.videoRecBytes)
            && Objects.equals(this.sumRecvKeyFrameDelay, that.sumRecvKeyFrameDelay)
            && Objects.equals(this.avgRecvKeyFrameDelay, that.avgRecvKeyFrameDelay)
            && Objects.equals(this.minRecvKeyFrameDelay, that.minRecvKeyFrameDelay)
            && Objects.equals(this.maxRecvKeyFrameDelay, that.maxRecvKeyFrameDelay)
            && Objects.equals(this.sumSendKeyFrameDelay, that.sumSendKeyFrameDelay)
            && Objects.equals(this.avgSendKeyFrameDelay, that.avgSendKeyFrameDelay)
            && Objects.equals(this.minSendKeyFrameDelay, that.minSendKeyFrameDelay)
            && Objects.equals(this.maxSendKeyFrameDelay, that.maxSendKeyFrameDelay)
            && Objects.equals(this.keyFrameSendCnt, that.keyFrameSendCnt)
            && Objects.equals(this.keyFrameReceiveCnt, that.keyFrameReceiveCnt)
            && Objects.equals(this.tcpConnectFailed, that.tcpConnectFailed)
            && Objects.equals(this.handShakeFailed, that.handShakeFailed)
            && Objects.equals(this.rtmpConnectFailed, that.rtmpConnectFailed)
            && Objects.equals(this.createStreamFailed, that.createStreamFailed)
            && Objects.equals(this.playFailed, that.playFailed)
            && Objects.equals(this.publishFailed, that.publishFailed)
            && Objects.equals(this.retryFailed, that.retryFailed)
            && Objects.equals(this.parseFileFailed, that.parseFileFailed)
            && Objects.equals(this.illegalUrlFailed, that.illegalUrlFailed)
            && Objects.equals(this.illegalFlvHeaderFailed, that.illegalFlvHeaderFailed)
            && Objects.equals(this.httpTimeoutFailed, that.httpTimeoutFailed)
            && Objects.equals(this.parseFlvFileFailed, that.parseFlvFileFailed)
            && Objects.equals(this.unknownFailed, that.unknownFailed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamingPlayTimes,
            streamingErrorTimes,
            streamingSuccessRate,
            sentPacketsPerSecond,
            receivedPacketsPerSecond,
            recvPackets,
            sendPackets,
            audioSentBytes,
            audioRecBytes,
            videoSentBytes,
            videoRecBytes,
            sumRecvKeyFrameDelay,
            avgRecvKeyFrameDelay,
            minRecvKeyFrameDelay,
            maxRecvKeyFrameDelay,
            sumSendKeyFrameDelay,
            avgSendKeyFrameDelay,
            minSendKeyFrameDelay,
            maxSendKeyFrameDelay,
            keyFrameSendCnt,
            keyFrameReceiveCnt,
            tcpConnectFailed,
            handShakeFailed,
            rtmpConnectFailed,
            createStreamFailed,
            playFailed,
            publishFailed,
            retryFailed,
            parseFileFailed,
            illegalUrlFailed,
            illegalFlvHeaderFailed,
            httpTimeoutFailed,
            parseFlvFileFailed,
            unknownFailed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamingMediaReport {\n");
        sb.append("    streamingPlayTimes: ").append(toIndentedString(streamingPlayTimes)).append("\n");
        sb.append("    streamingErrorTimes: ").append(toIndentedString(streamingErrorTimes)).append("\n");
        sb.append("    streamingSuccessRate: ").append(toIndentedString(streamingSuccessRate)).append("\n");
        sb.append("    sentPacketsPerSecond: ").append(toIndentedString(sentPacketsPerSecond)).append("\n");
        sb.append("    receivedPacketsPerSecond: ").append(toIndentedString(receivedPacketsPerSecond)).append("\n");
        sb.append("    recvPackets: ").append(toIndentedString(recvPackets)).append("\n");
        sb.append("    sendPackets: ").append(toIndentedString(sendPackets)).append("\n");
        sb.append("    audioSentBytes: ").append(toIndentedString(audioSentBytes)).append("\n");
        sb.append("    audioRecBytes: ").append(toIndentedString(audioRecBytes)).append("\n");
        sb.append("    videoSentBytes: ").append(toIndentedString(videoSentBytes)).append("\n");
        sb.append("    videoRecBytes: ").append(toIndentedString(videoRecBytes)).append("\n");
        sb.append("    sumRecvKeyFrameDelay: ").append(toIndentedString(sumRecvKeyFrameDelay)).append("\n");
        sb.append("    avgRecvKeyFrameDelay: ").append(toIndentedString(avgRecvKeyFrameDelay)).append("\n");
        sb.append("    minRecvKeyFrameDelay: ").append(toIndentedString(minRecvKeyFrameDelay)).append("\n");
        sb.append("    maxRecvKeyFrameDelay: ").append(toIndentedString(maxRecvKeyFrameDelay)).append("\n");
        sb.append("    sumSendKeyFrameDelay: ").append(toIndentedString(sumSendKeyFrameDelay)).append("\n");
        sb.append("    avgSendKeyFrameDelay: ").append(toIndentedString(avgSendKeyFrameDelay)).append("\n");
        sb.append("    minSendKeyFrameDelay: ").append(toIndentedString(minSendKeyFrameDelay)).append("\n");
        sb.append("    maxSendKeyFrameDelay: ").append(toIndentedString(maxSendKeyFrameDelay)).append("\n");
        sb.append("    keyFrameSendCnt: ").append(toIndentedString(keyFrameSendCnt)).append("\n");
        sb.append("    keyFrameReceiveCnt: ").append(toIndentedString(keyFrameReceiveCnt)).append("\n");
        sb.append("    tcpConnectFailed: ").append(toIndentedString(tcpConnectFailed)).append("\n");
        sb.append("    handShakeFailed: ").append(toIndentedString(handShakeFailed)).append("\n");
        sb.append("    rtmpConnectFailed: ").append(toIndentedString(rtmpConnectFailed)).append("\n");
        sb.append("    createStreamFailed: ").append(toIndentedString(createStreamFailed)).append("\n");
        sb.append("    playFailed: ").append(toIndentedString(playFailed)).append("\n");
        sb.append("    publishFailed: ").append(toIndentedString(publishFailed)).append("\n");
        sb.append("    retryFailed: ").append(toIndentedString(retryFailed)).append("\n");
        sb.append("    parseFileFailed: ").append(toIndentedString(parseFileFailed)).append("\n");
        sb.append("    illegalUrlFailed: ").append(toIndentedString(illegalUrlFailed)).append("\n");
        sb.append("    illegalFlvHeaderFailed: ").append(toIndentedString(illegalFlvHeaderFailed)).append("\n");
        sb.append("    httpTimeoutFailed: ").append(toIndentedString(httpTimeoutFailed)).append("\n");
        sb.append("    parseFlvFileFailed: ").append(toIndentedString(parseFlvFileFailed)).append("\n");
        sb.append("    unknownFailed: ").append(toIndentedString(unknownFailed)).append("\n");
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
