package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户/客户端流控配置
 */
public class QuotaResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private String client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user-default")

    private Boolean userDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client-default")

    private Boolean clientDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "producer-byte-rate")

    private Long producerByteRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer-byte-rate")

    private Long consumerByteRate;

    public QuotaResp withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名。  不对全部用户/客户端限流时，用户名和客户端ID不能同时为空。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public QuotaResp withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * 客户端ID。  不对全部用户/客户端限流时，用户名和客户端ID不能同时为空。
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public QuotaResp withUserDefault(Boolean userDefault) {
        this.userDefault = userDefault;
        return this;
    }

    /**
     * 是否使用用户默认设置。   - 是：表示对全部用户限流。此时不能同时设置用户名。   - 否：表示对特定用户限流。此时需要设置用户名。
     * @return userDefault
     */
    public Boolean getUserDefault() {
        return userDefault;
    }

    public void setUserDefault(Boolean userDefault) {
        this.userDefault = userDefault;
    }

    public QuotaResp withClientDefault(Boolean clientDefault) {
        this.clientDefault = clientDefault;
        return this;
    }

    /**
     * 是否使用客户端默认设置。   - 是：表示对全部客户端限流。此时不能设置客户端ID。   - 否：表示对特定客户端限流。此时需要设置客户端ID。
     * @return clientDefault
     */
    public Boolean getClientDefault() {
        return clientDefault;
    }

    public void setClientDefault(Boolean clientDefault) {
        this.clientDefault = clientDefault;
    }

    public QuotaResp withProducerByteRate(Long producerByteRate) {
        this.producerByteRate = producerByteRate;
        return this;
    }

    /**
     * 生产上限速率（单位为B/s）。
     * @return producerByteRate
     */
    public Long getProducerByteRate() {
        return producerByteRate;
    }

    public void setProducerByteRate(Long producerByteRate) {
        this.producerByteRate = producerByteRate;
    }

    public QuotaResp withConsumerByteRate(Long consumerByteRate) {
        this.consumerByteRate = consumerByteRate;
        return this;
    }

    /**
     * 消费上限速率（单位为B/s）。  > “生产上限速率”和“消费上限速率”不可同时为空。
     * @return consumerByteRate
     */
    public Long getConsumerByteRate() {
        return consumerByteRate;
    }

    public void setConsumerByteRate(Long consumerByteRate) {
        this.consumerByteRate = consumerByteRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaResp that = (QuotaResp) obj;
        return Objects.equals(this.user, that.user) && Objects.equals(this.client, that.client)
            && Objects.equals(this.userDefault, that.userDefault)
            && Objects.equals(this.clientDefault, that.clientDefault)
            && Objects.equals(this.producerByteRate, that.producerByteRate)
            && Objects.equals(this.consumerByteRate, that.consumerByteRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, client, userDefault, clientDefault, producerByteRate, consumerByteRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaResp {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    userDefault: ").append(toIndentedString(userDefault)).append("\n");
        sb.append("    clientDefault: ").append(toIndentedString(clientDefault)).append("\n");
        sb.append("    producerByteRate: ").append(toIndentedString(producerByteRate)).append("\n");
        sb.append("    consumerByteRate: ").append(toIndentedString(consumerByteRate)).append("\n");
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
