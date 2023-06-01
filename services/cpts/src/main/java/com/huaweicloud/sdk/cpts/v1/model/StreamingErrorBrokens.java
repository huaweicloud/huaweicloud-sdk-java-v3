package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StreamingErrorBrokens
 */
public class StreamingErrorBrokens {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createStreamFailed")

    private List<Double> createStreamFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handShakeFailed")

    private List<Double> handShakeFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parseFileFailed")

    private List<Double> parseFileFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parseFlvFileFailed")

    private List<Double> parseFlvFileFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playFailed")

    private List<Double> playFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publishFailed")

    private List<Double> publishFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retryFailed")

    private List<Double> retryFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtmpConnectFailed")

    private List<Double> rtmpConnectFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcpConnectFailed")

    private List<Double> tcpConnectFailed = null;

    public StreamingErrorBrokens withCreateStreamFailed(List<Double> createStreamFailed) {
        this.createStreamFailed = createStreamFailed;
        return this;
    }

    public StreamingErrorBrokens addCreateStreamFailedItem(Double createStreamFailedItem) {
        if (this.createStreamFailed == null) {
            this.createStreamFailed = new ArrayList<>();
        }
        this.createStreamFailed.add(createStreamFailedItem);
        return this;
    }

    public StreamingErrorBrokens withCreateStreamFailed(Consumer<List<Double>> createStreamFailedSetter) {
        if (this.createStreamFailed == null) {
            this.createStreamFailed = new ArrayList<>();
        }
        createStreamFailedSetter.accept(this.createStreamFailed);
        return this;
    }

    /**
     * 创建流媒体失败数
     * @return createStreamFailed
     */
    public List<Double> getCreateStreamFailed() {
        return createStreamFailed;
    }

    public void setCreateStreamFailed(List<Double> createStreamFailed) {
        this.createStreamFailed = createStreamFailed;
    }

    public StreamingErrorBrokens withHandShakeFailed(List<Double> handShakeFailed) {
        this.handShakeFailed = handShakeFailed;
        return this;
    }

    public StreamingErrorBrokens addHandShakeFailedItem(Double handShakeFailedItem) {
        if (this.handShakeFailed == null) {
            this.handShakeFailed = new ArrayList<>();
        }
        this.handShakeFailed.add(handShakeFailedItem);
        return this;
    }

    public StreamingErrorBrokens withHandShakeFailed(Consumer<List<Double>> handShakeFailedSetter) {
        if (this.handShakeFailed == null) {
            this.handShakeFailed = new ArrayList<>();
        }
        handShakeFailedSetter.accept(this.handShakeFailed);
        return this;
    }

    /**
     * 建立握手失败数
     * @return handShakeFailed
     */
    public List<Double> getHandShakeFailed() {
        return handShakeFailed;
    }

    public void setHandShakeFailed(List<Double> handShakeFailed) {
        this.handShakeFailed = handShakeFailed;
    }

    public StreamingErrorBrokens withParseFileFailed(List<Double> parseFileFailed) {
        this.parseFileFailed = parseFileFailed;
        return this;
    }

    public StreamingErrorBrokens addParseFileFailedItem(Double parseFileFailedItem) {
        if (this.parseFileFailed == null) {
            this.parseFileFailed = new ArrayList<>();
        }
        this.parseFileFailed.add(parseFileFailedItem);
        return this;
    }

    public StreamingErrorBrokens withParseFileFailed(Consumer<List<Double>> parseFileFailedSetter) {
        if (this.parseFileFailed == null) {
            this.parseFileFailed = new ArrayList<>();
        }
        parseFileFailedSetter.accept(this.parseFileFailed);
        return this;
    }

    /**
     * 文件解析失败数
     * @return parseFileFailed
     */
    public List<Double> getParseFileFailed() {
        return parseFileFailed;
    }

    public void setParseFileFailed(List<Double> parseFileFailed) {
        this.parseFileFailed = parseFileFailed;
    }

    public StreamingErrorBrokens withParseFlvFileFailed(List<Double> parseFlvFileFailed) {
        this.parseFlvFileFailed = parseFlvFileFailed;
        return this;
    }

    public StreamingErrorBrokens addParseFlvFileFailedItem(Double parseFlvFileFailedItem) {
        if (this.parseFlvFileFailed == null) {
            this.parseFlvFileFailed = new ArrayList<>();
        }
        this.parseFlvFileFailed.add(parseFlvFileFailedItem);
        return this;
    }

    public StreamingErrorBrokens withParseFlvFileFailed(Consumer<List<Double>> parseFlvFileFailedSetter) {
        if (this.parseFlvFileFailed == null) {
            this.parseFlvFileFailed = new ArrayList<>();
        }
        parseFlvFileFailedSetter.accept(this.parseFlvFileFailed);
        return this;
    }

    /**
     * FLV文件解析失败数
     * @return parseFlvFileFailed
     */
    public List<Double> getParseFlvFileFailed() {
        return parseFlvFileFailed;
    }

    public void setParseFlvFileFailed(List<Double> parseFlvFileFailed) {
        this.parseFlvFileFailed = parseFlvFileFailed;
    }

    public StreamingErrorBrokens withPlayFailed(List<Double> playFailed) {
        this.playFailed = playFailed;
        return this;
    }

    public StreamingErrorBrokens addPlayFailedItem(Double playFailedItem) {
        if (this.playFailed == null) {
            this.playFailed = new ArrayList<>();
        }
        this.playFailed.add(playFailedItem);
        return this;
    }

    public StreamingErrorBrokens withPlayFailed(Consumer<List<Double>> playFailedSetter) {
        if (this.playFailed == null) {
            this.playFailed = new ArrayList<>();
        }
        playFailedSetter.accept(this.playFailed);
        return this;
    }

    /**
     * 播放失败数
     * @return playFailed
     */
    public List<Double> getPlayFailed() {
        return playFailed;
    }

    public void setPlayFailed(List<Double> playFailed) {
        this.playFailed = playFailed;
    }

    public StreamingErrorBrokens withPublishFailed(List<Double> publishFailed) {
        this.publishFailed = publishFailed;
        return this;
    }

    public StreamingErrorBrokens addPublishFailedItem(Double publishFailedItem) {
        if (this.publishFailed == null) {
            this.publishFailed = new ArrayList<>();
        }
        this.publishFailed.add(publishFailedItem);
        return this;
    }

    public StreamingErrorBrokens withPublishFailed(Consumer<List<Double>> publishFailedSetter) {
        if (this.publishFailed == null) {
            this.publishFailed = new ArrayList<>();
        }
        publishFailedSetter.accept(this.publishFailed);
        return this;
    }

    /**
     * 发布失败数
     * @return publishFailed
     */
    public List<Double> getPublishFailed() {
        return publishFailed;
    }

    public void setPublishFailed(List<Double> publishFailed) {
        this.publishFailed = publishFailed;
    }

    public StreamingErrorBrokens withRetryFailed(List<Double> retryFailed) {
        this.retryFailed = retryFailed;
        return this;
    }

    public StreamingErrorBrokens addRetryFailedItem(Double retryFailedItem) {
        if (this.retryFailed == null) {
            this.retryFailed = new ArrayList<>();
        }
        this.retryFailed.add(retryFailedItem);
        return this;
    }

    public StreamingErrorBrokens withRetryFailed(Consumer<List<Double>> retryFailedSetter) {
        if (this.retryFailed == null) {
            this.retryFailed = new ArrayList<>();
        }
        retryFailedSetter.accept(this.retryFailed);
        return this;
    }

    /**
     * 重试失败数
     * @return retryFailed
     */
    public List<Double> getRetryFailed() {
        return retryFailed;
    }

    public void setRetryFailed(List<Double> retryFailed) {
        this.retryFailed = retryFailed;
    }

    public StreamingErrorBrokens withRtmpConnectFailed(List<Double> rtmpConnectFailed) {
        this.rtmpConnectFailed = rtmpConnectFailed;
        return this;
    }

    public StreamingErrorBrokens addRtmpConnectFailedItem(Double rtmpConnectFailedItem) {
        if (this.rtmpConnectFailed == null) {
            this.rtmpConnectFailed = new ArrayList<>();
        }
        this.rtmpConnectFailed.add(rtmpConnectFailedItem);
        return this;
    }

    public StreamingErrorBrokens withRtmpConnectFailed(Consumer<List<Double>> rtmpConnectFailedSetter) {
        if (this.rtmpConnectFailed == null) {
            this.rtmpConnectFailed = new ArrayList<>();
        }
        rtmpConnectFailedSetter.accept(this.rtmpConnectFailed);
        return this;
    }

    /**
     * RTMP连接失败数
     * @return rtmpConnectFailed
     */
    public List<Double> getRtmpConnectFailed() {
        return rtmpConnectFailed;
    }

    public void setRtmpConnectFailed(List<Double> rtmpConnectFailed) {
        this.rtmpConnectFailed = rtmpConnectFailed;
    }

    public StreamingErrorBrokens withTcpConnectFailed(List<Double> tcpConnectFailed) {
        this.tcpConnectFailed = tcpConnectFailed;
        return this;
    }

    public StreamingErrorBrokens addTcpConnectFailedItem(Double tcpConnectFailedItem) {
        if (this.tcpConnectFailed == null) {
            this.tcpConnectFailed = new ArrayList<>();
        }
        this.tcpConnectFailed.add(tcpConnectFailedItem);
        return this;
    }

    public StreamingErrorBrokens withTcpConnectFailed(Consumer<List<Double>> tcpConnectFailedSetter) {
        if (this.tcpConnectFailed == null) {
            this.tcpConnectFailed = new ArrayList<>();
        }
        tcpConnectFailedSetter.accept(this.tcpConnectFailed);
        return this;
    }

    /**
     * TCP连接失败数
     * @return tcpConnectFailed
     */
    public List<Double> getTcpConnectFailed() {
        return tcpConnectFailed;
    }

    public void setTcpConnectFailed(List<Double> tcpConnectFailed) {
        this.tcpConnectFailed = tcpConnectFailed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StreamingErrorBrokens streamingErrorBrokens = (StreamingErrorBrokens) o;
        return Objects.equals(this.createStreamFailed, streamingErrorBrokens.createStreamFailed)
            && Objects.equals(this.handShakeFailed, streamingErrorBrokens.handShakeFailed)
            && Objects.equals(this.parseFileFailed, streamingErrorBrokens.parseFileFailed)
            && Objects.equals(this.parseFlvFileFailed, streamingErrorBrokens.parseFlvFileFailed)
            && Objects.equals(this.playFailed, streamingErrorBrokens.playFailed)
            && Objects.equals(this.publishFailed, streamingErrorBrokens.publishFailed)
            && Objects.equals(this.retryFailed, streamingErrorBrokens.retryFailed)
            && Objects.equals(this.rtmpConnectFailed, streamingErrorBrokens.rtmpConnectFailed)
            && Objects.equals(this.tcpConnectFailed, streamingErrorBrokens.tcpConnectFailed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createStreamFailed,
            handShakeFailed,
            parseFileFailed,
            parseFlvFileFailed,
            playFailed,
            publishFailed,
            retryFailed,
            rtmpConnectFailed,
            tcpConnectFailed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamingErrorBrokens {\n");
        sb.append("    createStreamFailed: ").append(toIndentedString(createStreamFailed)).append("\n");
        sb.append("    handShakeFailed: ").append(toIndentedString(handShakeFailed)).append("\n");
        sb.append("    parseFileFailed: ").append(toIndentedString(parseFileFailed)).append("\n");
        sb.append("    parseFlvFileFailed: ").append(toIndentedString(parseFlvFileFailed)).append("\n");
        sb.append("    playFailed: ").append(toIndentedString(playFailed)).append("\n");
        sb.append("    publishFailed: ").append(toIndentedString(publishFailed)).append("\n");
        sb.append("    retryFailed: ").append(toIndentedString(retryFailed)).append("\n");
        sb.append("    rtmpConnectFailed: ").append(toIndentedString(rtmpConnectFailed)).append("\n");
        sb.append("    tcpConnectFailed: ").append(toIndentedString(tcpConnectFailed)).append("\n");
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
