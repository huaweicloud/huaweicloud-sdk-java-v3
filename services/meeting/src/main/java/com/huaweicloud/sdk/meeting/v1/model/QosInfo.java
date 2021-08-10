package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** QoS数据。 */
public class QosInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send")

    private QosSendReceiveInfo send;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receive")

    private QosSendReceiveInfo receive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private QosCpuInfo cpu;

    public QosInfo withType(String type) {
        this.type = type;
        return this;
    }

    /** Qos类型 - aduio：音频 - video：视频 - screen：屏幕共享 - cpu：cpu
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QosInfo withSend(QosSendReceiveInfo send) {
        this.send = send;
        return this;
    }

    public QosInfo withSend(Consumer<QosSendReceiveInfo> sendSetter) {
        if (this.send == null) {
            this.send = new QosSendReceiveInfo();
            sendSetter.accept(this.send);
        }

        return this;
    }

    /** Get send
     * 
     * @return send */
    public QosSendReceiveInfo getSend() {
        return send;
    }

    public void setSend(QosSendReceiveInfo send) {
        this.send = send;
    }

    public QosInfo withReceive(QosSendReceiveInfo receive) {
        this.receive = receive;
        return this;
    }

    public QosInfo withReceive(Consumer<QosSendReceiveInfo> receiveSetter) {
        if (this.receive == null) {
            this.receive = new QosSendReceiveInfo();
            receiveSetter.accept(this.receive);
        }

        return this;
    }

    /** Get receive
     * 
     * @return receive */
    public QosSendReceiveInfo getReceive() {
        return receive;
    }

    public void setReceive(QosSendReceiveInfo receive) {
        this.receive = receive;
    }

    public QosInfo withCpu(QosCpuInfo cpu) {
        this.cpu = cpu;
        return this;
    }

    public QosInfo withCpu(Consumer<QosCpuInfo> cpuSetter) {
        if (this.cpu == null) {
            this.cpu = new QosCpuInfo();
            cpuSetter.accept(this.cpu);
        }

        return this;
    }

    /** Get cpu
     * 
     * @return cpu */
    public QosCpuInfo getCpu() {
        return cpu;
    }

    public void setCpu(QosCpuInfo cpu) {
        this.cpu = cpu;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QosInfo qosInfo = (QosInfo) o;
        return Objects.equals(this.type, qosInfo.type) && Objects.equals(this.send, qosInfo.send)
            && Objects.equals(this.receive, qosInfo.receive) && Objects.equals(this.cpu, qosInfo.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, send, receive, cpu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QosInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    send: ").append(toIndentedString(send)).append("\n");
        sb.append("    receive: ").append(toIndentedString(receive)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
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
