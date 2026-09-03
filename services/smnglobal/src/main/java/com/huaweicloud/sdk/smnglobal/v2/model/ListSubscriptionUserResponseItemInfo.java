package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSubscriptionUserResponseItemInfo
 */
public class ListSubscriptionUserResponseItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private List<String> group = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http")

    private ListSubscriptionUserResponseHttpEndpointInfo http;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https")

    private ListSubscriptionUserResponseHttpsEndpointInfo https;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms")

    private ListSubscriptionUserResponseSmsEndpointInfo sms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private ListSubscriptionUserResponseEmailEndpointInfo email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callnotify")

    private ListSubscriptionUserResponseCallnotifyEndpointInfo callnotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wechat")

    private ListSubscriptionUserResponseWechatEndpointInfo wechat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dingding")

    private ListSubscriptionUserResponseDingdingEndpointInfo dingding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feishu")

    private ListSubscriptionUserResponseFeishuEndpointInfo feishu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "welink")

    private ListSubscriptionUserResponseWelinkEndpointInfo welink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ding_talk_bot")

    private ListSubscriptionUserResponseDingTalkBotEndpointInfo dingTalkBot;

    public ListSubscriptionUserResponseItemInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListSubscriptionUserResponseItemInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListSubscriptionUserResponseItemInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 订阅用户名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSubscriptionUserResponseItemInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 订阅用户状态。 UNCONFIRMED：未确认 CONFIRMED：已确认 CANCELLED：已取消
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListSubscriptionUserResponseItemInfo withGroup(List<String> group) {
        this.group = group;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo addGroupItem(String groupItem) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        this.group.add(groupItem);
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withGroup(Consumer<List<String>> groupSetter) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        groupSetter.accept(this.group);
        return this;
    }

    /**
     * 订阅用户分组。
     * @return group
     */
    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }

    public ListSubscriptionUserResponseItemInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListSubscriptionUserResponseItemInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListSubscriptionUserResponseItemInfo withHttp(ListSubscriptionUserResponseHttpEndpointInfo http) {
        this.http = http;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withHttp(
        Consumer<ListSubscriptionUserResponseHttpEndpointInfo> httpSetter) {
        if (this.http == null) {
            this.http = new ListSubscriptionUserResponseHttpEndpointInfo();
            httpSetter.accept(this.http);
        }

        return this;
    }

    /**
     * Get http
     * @return http
     */
    public ListSubscriptionUserResponseHttpEndpointInfo getHttp() {
        return http;
    }

    public void setHttp(ListSubscriptionUserResponseHttpEndpointInfo http) {
        this.http = http;
    }

    public ListSubscriptionUserResponseItemInfo withHttps(ListSubscriptionUserResponseHttpsEndpointInfo https) {
        this.https = https;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withHttps(
        Consumer<ListSubscriptionUserResponseHttpsEndpointInfo> httpsSetter) {
        if (this.https == null) {
            this.https = new ListSubscriptionUserResponseHttpsEndpointInfo();
            httpsSetter.accept(this.https);
        }

        return this;
    }

    /**
     * Get https
     * @return https
     */
    public ListSubscriptionUserResponseHttpsEndpointInfo getHttps() {
        return https;
    }

    public void setHttps(ListSubscriptionUserResponseHttpsEndpointInfo https) {
        this.https = https;
    }

    public ListSubscriptionUserResponseItemInfo withSms(ListSubscriptionUserResponseSmsEndpointInfo sms) {
        this.sms = sms;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withSms(
        Consumer<ListSubscriptionUserResponseSmsEndpointInfo> smsSetter) {
        if (this.sms == null) {
            this.sms = new ListSubscriptionUserResponseSmsEndpointInfo();
            smsSetter.accept(this.sms);
        }

        return this;
    }

    /**
     * Get sms
     * @return sms
     */
    public ListSubscriptionUserResponseSmsEndpointInfo getSms() {
        return sms;
    }

    public void setSms(ListSubscriptionUserResponseSmsEndpointInfo sms) {
        this.sms = sms;
    }

    public ListSubscriptionUserResponseItemInfo withEmail(ListSubscriptionUserResponseEmailEndpointInfo email) {
        this.email = email;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withEmail(
        Consumer<ListSubscriptionUserResponseEmailEndpointInfo> emailSetter) {
        if (this.email == null) {
            this.email = new ListSubscriptionUserResponseEmailEndpointInfo();
            emailSetter.accept(this.email);
        }

        return this;
    }

    /**
     * Get email
     * @return email
     */
    public ListSubscriptionUserResponseEmailEndpointInfo getEmail() {
        return email;
    }

    public void setEmail(ListSubscriptionUserResponseEmailEndpointInfo email) {
        this.email = email;
    }

    public ListSubscriptionUserResponseItemInfo withCallnotify(
        ListSubscriptionUserResponseCallnotifyEndpointInfo callnotify) {
        this.callnotify = callnotify;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withCallnotify(
        Consumer<ListSubscriptionUserResponseCallnotifyEndpointInfo> callnotifySetter) {
        if (this.callnotify == null) {
            this.callnotify = new ListSubscriptionUserResponseCallnotifyEndpointInfo();
            callnotifySetter.accept(this.callnotify);
        }

        return this;
    }

    /**
     * Get callnotify
     * @return callnotify
     */
    public ListSubscriptionUserResponseCallnotifyEndpointInfo getCallnotify() {
        return callnotify;
    }

    public void setCallnotify(ListSubscriptionUserResponseCallnotifyEndpointInfo callnotify) {
        this.callnotify = callnotify;
    }

    public ListSubscriptionUserResponseItemInfo withWechat(ListSubscriptionUserResponseWechatEndpointInfo wechat) {
        this.wechat = wechat;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withWechat(
        Consumer<ListSubscriptionUserResponseWechatEndpointInfo> wechatSetter) {
        if (this.wechat == null) {
            this.wechat = new ListSubscriptionUserResponseWechatEndpointInfo();
            wechatSetter.accept(this.wechat);
        }

        return this;
    }

    /**
     * Get wechat
     * @return wechat
     */
    public ListSubscriptionUserResponseWechatEndpointInfo getWechat() {
        return wechat;
    }

    public void setWechat(ListSubscriptionUserResponseWechatEndpointInfo wechat) {
        this.wechat = wechat;
    }

    public ListSubscriptionUserResponseItemInfo withDingding(
        ListSubscriptionUserResponseDingdingEndpointInfo dingding) {
        this.dingding = dingding;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withDingding(
        Consumer<ListSubscriptionUserResponseDingdingEndpointInfo> dingdingSetter) {
        if (this.dingding == null) {
            this.dingding = new ListSubscriptionUserResponseDingdingEndpointInfo();
            dingdingSetter.accept(this.dingding);
        }

        return this;
    }

    /**
     * Get dingding
     * @return dingding
     */
    public ListSubscriptionUserResponseDingdingEndpointInfo getDingding() {
        return dingding;
    }

    public void setDingding(ListSubscriptionUserResponseDingdingEndpointInfo dingding) {
        this.dingding = dingding;
    }

    public ListSubscriptionUserResponseItemInfo withFeishu(ListSubscriptionUserResponseFeishuEndpointInfo feishu) {
        this.feishu = feishu;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withFeishu(
        Consumer<ListSubscriptionUserResponseFeishuEndpointInfo> feishuSetter) {
        if (this.feishu == null) {
            this.feishu = new ListSubscriptionUserResponseFeishuEndpointInfo();
            feishuSetter.accept(this.feishu);
        }

        return this;
    }

    /**
     * Get feishu
     * @return feishu
     */
    public ListSubscriptionUserResponseFeishuEndpointInfo getFeishu() {
        return feishu;
    }

    public void setFeishu(ListSubscriptionUserResponseFeishuEndpointInfo feishu) {
        this.feishu = feishu;
    }

    public ListSubscriptionUserResponseItemInfo withWelink(ListSubscriptionUserResponseWelinkEndpointInfo welink) {
        this.welink = welink;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withWelink(
        Consumer<ListSubscriptionUserResponseWelinkEndpointInfo> welinkSetter) {
        if (this.welink == null) {
            this.welink = new ListSubscriptionUserResponseWelinkEndpointInfo();
            welinkSetter.accept(this.welink);
        }

        return this;
    }

    /**
     * Get welink
     * @return welink
     */
    public ListSubscriptionUserResponseWelinkEndpointInfo getWelink() {
        return welink;
    }

    public void setWelink(ListSubscriptionUserResponseWelinkEndpointInfo welink) {
        this.welink = welink;
    }

    public ListSubscriptionUserResponseItemInfo withDingTalkBot(
        ListSubscriptionUserResponseDingTalkBotEndpointInfo dingTalkBot) {
        this.dingTalkBot = dingTalkBot;
        return this;
    }

    public ListSubscriptionUserResponseItemInfo withDingTalkBot(
        Consumer<ListSubscriptionUserResponseDingTalkBotEndpointInfo> dingTalkBotSetter) {
        if (this.dingTalkBot == null) {
            this.dingTalkBot = new ListSubscriptionUserResponseDingTalkBotEndpointInfo();
            dingTalkBotSetter.accept(this.dingTalkBot);
        }

        return this;
    }

    /**
     * Get dingTalkBot
     * @return dingTalkBot
     */
    public ListSubscriptionUserResponseDingTalkBotEndpointInfo getDingTalkBot() {
        return dingTalkBot;
    }

    public void setDingTalkBot(ListSubscriptionUserResponseDingTalkBotEndpointInfo dingTalkBot) {
        this.dingTalkBot = dingTalkBot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionUserResponseItemInfo that = (ListSubscriptionUserResponseItemInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.group, that.group) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.http, that.http)
            && Objects.equals(this.https, that.https) && Objects.equals(this.sms, that.sms)
            && Objects.equals(this.email, that.email) && Objects.equals(this.callnotify, that.callnotify)
            && Objects.equals(this.wechat, that.wechat) && Objects.equals(this.dingding, that.dingding)
            && Objects.equals(this.feishu, that.feishu) && Objects.equals(this.welink, that.welink)
            && Objects.equals(this.dingTalkBot, that.dingTalkBot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainId,
            name,
            status,
            group,
            createTime,
            updateTime,
            http,
            https,
            sms,
            email,
            callnotify,
            wechat,
            dingding,
            feishu,
            welink,
            dingTalkBot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionUserResponseItemInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    http: ").append(toIndentedString(http)).append("\n");
        sb.append("    https: ").append(toIndentedString(https)).append("\n");
        sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    callnotify: ").append(toIndentedString(callnotify)).append("\n");
        sb.append("    wechat: ").append(toIndentedString(wechat)).append("\n");
        sb.append("    dingding: ").append(toIndentedString(dingding)).append("\n");
        sb.append("    feishu: ").append(toIndentedString(feishu)).append("\n");
        sb.append("    welink: ").append(toIndentedString(welink)).append("\n");
        sb.append("    dingTalkBot: ").append(toIndentedString(dingTalkBot)).append("\n");
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
