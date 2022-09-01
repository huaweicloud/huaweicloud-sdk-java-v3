package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 会议与会者CPU QoS数据，当qosType &#x3D; cpu 时有效。
 */
public class QosCpuInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_cpu_max")

    @JacksonXmlProperty(localName = "client_cpu_max")

    private List<QosDataElement> clientCpuMax = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_cpu_max")

    @JacksonXmlProperty(localName = "system_cpu_max")

    private List<QosDataElement> systemCpuMax = null;

    public QosCpuInfo withClientCpuMax(List<QosDataElement> clientCpuMax) {
        this.clientCpuMax = clientCpuMax;
        return this;
    }

    public QosCpuInfo addClientCpuMaxItem(QosDataElement clientCpuMaxItem) {
        if (this.clientCpuMax == null) {
            this.clientCpuMax = new ArrayList<>();
        }
        this.clientCpuMax.add(clientCpuMaxItem);
        return this;
    }

    public QosCpuInfo withClientCpuMax(Consumer<List<QosDataElement>> clientCpuMaxSetter) {
        if (this.clientCpuMax == null) {
            this.clientCpuMax = new ArrayList<>();
        }
        clientCpuMaxSetter.accept(this.clientCpuMax);
        return this;
    }

    /**
     * 华为云会议最大CPU使用率。
     * @return clientCpuMax
     */
    public List<QosDataElement> getClientCpuMax() {
        return clientCpuMax;
    }

    public void setClientCpuMax(List<QosDataElement> clientCpuMax) {
        this.clientCpuMax = clientCpuMax;
    }

    public QosCpuInfo withSystemCpuMax(List<QosDataElement> systemCpuMax) {
        this.systemCpuMax = systemCpuMax;
        return this;
    }

    public QosCpuInfo addSystemCpuMaxItem(QosDataElement systemCpuMaxItem) {
        if (this.systemCpuMax == null) {
            this.systemCpuMax = new ArrayList<>();
        }
        this.systemCpuMax.add(systemCpuMaxItem);
        return this;
    }

    public QosCpuInfo withSystemCpuMax(Consumer<List<QosDataElement>> systemCpuMaxSetter) {
        if (this.systemCpuMax == null) {
            this.systemCpuMax = new ArrayList<>();
        }
        systemCpuMaxSetter.accept(this.systemCpuMax);
        return this;
    }

    /**
     * 系统最大CPU使用率。
     * @return systemCpuMax
     */
    public List<QosDataElement> getSystemCpuMax() {
        return systemCpuMax;
    }

    public void setSystemCpuMax(List<QosDataElement> systemCpuMax) {
        this.systemCpuMax = systemCpuMax;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QosCpuInfo qosCpuInfo = (QosCpuInfo) o;
        return Objects.equals(this.clientCpuMax, qosCpuInfo.clientCpuMax)
            && Objects.equals(this.systemCpuMax, qosCpuInfo.systemCpuMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientCpuMax, systemCpuMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QosCpuInfo {\n");
        sb.append("    clientCpuMax: ").append(toIndentedString(clientCpuMax)).append("\n");
        sb.append("    systemCpuMax: ").append(toIndentedString(systemCpuMax)).append("\n");
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
