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
            && Objects.equals(this.email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, domainId, name, status, group, createTime, updateTime, http, https, sms, email);
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
