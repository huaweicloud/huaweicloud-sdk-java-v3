package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 结构化类型。
 */
public class ShowStructTemplateclusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    @JacksonXmlProperty(localName = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_bootstrap_servers")

    @JacksonXmlProperty(localName = "kafka_bootstrap_servers")

    private String kafkaBootstrapServers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_ssl_enable")

    @JacksonXmlProperty(localName = "kafka_ssl_enable")

    private Boolean kafkaSslEnable;

    public ShowStructTemplateclusterInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 测试
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ShowStructTemplateclusterInfo withKafkaBootstrapServers(String kafkaBootstrapServers) {
        this.kafkaBootstrapServers = kafkaBootstrapServers;
        return this;
    }

    /**
     * 测试
     * @return kafkaBootstrapServers
     */
    public String getKafkaBootstrapServers() {
        return kafkaBootstrapServers;
    }

    public void setKafkaBootstrapServers(String kafkaBootstrapServers) {
        this.kafkaBootstrapServers = kafkaBootstrapServers;
    }

    public ShowStructTemplateclusterInfo withKafkaSslEnable(Boolean kafkaSslEnable) {
        this.kafkaSslEnable = kafkaSslEnable;
        return this;
    }

    /**
     * 测试
     * @return kafkaSslEnable
     */
    public Boolean getKafkaSslEnable() {
        return kafkaSslEnable;
    }

    public void setKafkaSslEnable(Boolean kafkaSslEnable) {
        this.kafkaSslEnable = kafkaSslEnable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStructTemplateclusterInfo showStructTemplateclusterInfo = (ShowStructTemplateclusterInfo) o;
        return Objects.equals(this.clusterName, showStructTemplateclusterInfo.clusterName)
            && Objects.equals(this.kafkaBootstrapServers, showStructTemplateclusterInfo.kafkaBootstrapServers)
            && Objects.equals(this.kafkaSslEnable, showStructTemplateclusterInfo.kafkaSslEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName, kafkaBootstrapServers, kafkaSslEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStructTemplateclusterInfo {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    kafkaBootstrapServers: ").append(toIndentedString(kafkaBootstrapServers)).append("\n");
        sb.append("    kafkaSslEnable: ").append(toIndentedString(kafkaSslEnable)).append("\n");
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
