package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNotificationSubscriptionsStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_message")

    private RepoNotificationSubscriptionStateDto internalMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private RepoNotificationSubscriptionStateDto email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qyweixin")

    private RepoNotificationSubscriptionStateDto qyweixin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feishu")

    private RepoNotificationSubscriptionStateDto feishu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dingding")

    private RepoNotificationSubscriptionStateDto dingding;

    public ShowNotificationSubscriptionsStatusResponse withInternalMessage(
        RepoNotificationSubscriptionStateDto internalMessage) {
        this.internalMessage = internalMessage;
        return this;
    }

    public ShowNotificationSubscriptionsStatusResponse withInternalMessage(
        Consumer<RepoNotificationSubscriptionStateDto> internalMessageSetter) {
        if (this.internalMessage == null) {
            this.internalMessage = new RepoNotificationSubscriptionStateDto();
            internalMessageSetter.accept(this.internalMessage);
        }

        return this;
    }

    /**
     * Get internalMessage
     * @return internalMessage
     */
    public RepoNotificationSubscriptionStateDto getInternalMessage() {
        return internalMessage;
    }

    public void setInternalMessage(RepoNotificationSubscriptionStateDto internalMessage) {
        this.internalMessage = internalMessage;
    }

    public ShowNotificationSubscriptionsStatusResponse withEmail(RepoNotificationSubscriptionStateDto email) {
        this.email = email;
        return this;
    }

    public ShowNotificationSubscriptionsStatusResponse withEmail(
        Consumer<RepoNotificationSubscriptionStateDto> emailSetter) {
        if (this.email == null) {
            this.email = new RepoNotificationSubscriptionStateDto();
            emailSetter.accept(this.email);
        }

        return this;
    }

    /**
     * Get email
     * @return email
     */
    public RepoNotificationSubscriptionStateDto getEmail() {
        return email;
    }

    public void setEmail(RepoNotificationSubscriptionStateDto email) {
        this.email = email;
    }

    public ShowNotificationSubscriptionsStatusResponse withQyweixin(RepoNotificationSubscriptionStateDto qyweixin) {
        this.qyweixin = qyweixin;
        return this;
    }

    public ShowNotificationSubscriptionsStatusResponse withQyweixin(
        Consumer<RepoNotificationSubscriptionStateDto> qyweixinSetter) {
        if (this.qyweixin == null) {
            this.qyweixin = new RepoNotificationSubscriptionStateDto();
            qyweixinSetter.accept(this.qyweixin);
        }

        return this;
    }

    /**
     * Get qyweixin
     * @return qyweixin
     */
    public RepoNotificationSubscriptionStateDto getQyweixin() {
        return qyweixin;
    }

    public void setQyweixin(RepoNotificationSubscriptionStateDto qyweixin) {
        this.qyweixin = qyweixin;
    }

    public ShowNotificationSubscriptionsStatusResponse withFeishu(RepoNotificationSubscriptionStateDto feishu) {
        this.feishu = feishu;
        return this;
    }

    public ShowNotificationSubscriptionsStatusResponse withFeishu(
        Consumer<RepoNotificationSubscriptionStateDto> feishuSetter) {
        if (this.feishu == null) {
            this.feishu = new RepoNotificationSubscriptionStateDto();
            feishuSetter.accept(this.feishu);
        }

        return this;
    }

    /**
     * Get feishu
     * @return feishu
     */
    public RepoNotificationSubscriptionStateDto getFeishu() {
        return feishu;
    }

    public void setFeishu(RepoNotificationSubscriptionStateDto feishu) {
        this.feishu = feishu;
    }

    public ShowNotificationSubscriptionsStatusResponse withDingding(RepoNotificationSubscriptionStateDto dingding) {
        this.dingding = dingding;
        return this;
    }

    public ShowNotificationSubscriptionsStatusResponse withDingding(
        Consumer<RepoNotificationSubscriptionStateDto> dingdingSetter) {
        if (this.dingding == null) {
            this.dingding = new RepoNotificationSubscriptionStateDto();
            dingdingSetter.accept(this.dingding);
        }

        return this;
    }

    /**
     * Get dingding
     * @return dingding
     */
    public RepoNotificationSubscriptionStateDto getDingding() {
        return dingding;
    }

    public void setDingding(RepoNotificationSubscriptionStateDto dingding) {
        this.dingding = dingding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNotificationSubscriptionsStatusResponse that = (ShowNotificationSubscriptionsStatusResponse) obj;
        return Objects.equals(this.internalMessage, that.internalMessage) && Objects.equals(this.email, that.email)
            && Objects.equals(this.qyweixin, that.qyweixin) && Objects.equals(this.feishu, that.feishu)
            && Objects.equals(this.dingding, that.dingding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internalMessage, email, qyweixin, feishu, dingding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNotificationSubscriptionsStatusResponse {\n");
        sb.append("    internalMessage: ").append(toIndentedString(internalMessage)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    qyweixin: ").append(toIndentedString(qyweixin)).append("\n");
        sb.append("    feishu: ").append(toIndentedString(feishu)).append("\n");
        sb.append("    dingding: ").append(toIndentedString(dingding)).append("\n");
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
