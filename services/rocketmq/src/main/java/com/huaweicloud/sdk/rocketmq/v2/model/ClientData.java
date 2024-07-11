package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClientData
 */
public class ClientData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_addr")

    private String clientAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    private List<Subscription> subscriptions = null;

    public ClientData withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 客户端语言。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ClientData withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 客户端版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClientData withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 客户端ID。
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ClientData withClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }

    /**
     * 客户端地址。
     * @return clientAddr
     */
    public String getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
    }

    public ClientData withSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public ClientData addSubscriptionsItem(Subscription subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public ClientData withSubscriptions(Consumer<List<Subscription>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * 订阅关系列表。
     * @return subscriptions
     */
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClientData that = (ClientData) obj;
        return Objects.equals(this.language, that.language) && Objects.equals(this.version, that.version)
            && Objects.equals(this.clientId, that.clientId) && Objects.equals(this.clientAddr, that.clientAddr)
            && Objects.equals(this.subscriptions, that.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, version, clientId, clientAddr, subscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientData {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientAddr: ").append(toIndentedString(clientAddr)).append("\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
