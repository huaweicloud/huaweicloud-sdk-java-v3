package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSubscriptionUserRequestBody
 */
public class CreateSubscriptionUserRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private List<String> group = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http")

    private CreateSubscriptionUserRequestHttpEndpointInfo http;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https")

    private CreateSubscriptionUserRequestHttpsEndpointInfo https;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms")

    private CreateSubscriptionUserRequestSmsEndpointInfo sms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private CreateSubscriptionUserRequestEmailEndpointInfo email;

    public CreateSubscriptionUserRequestBody withName(String name) {
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

    public CreateSubscriptionUserRequestBody withGroup(List<String> group) {
        this.group = group;
        return this;
    }

    public CreateSubscriptionUserRequestBody addGroupItem(String groupItem) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        this.group.add(groupItem);
        return this;
    }

    public CreateSubscriptionUserRequestBody withGroup(Consumer<List<String>> groupSetter) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        groupSetter.accept(this.group);
        return this;
    }

    /**
     * 订阅用户分组。每个订阅分组只能包含中英文、数字([0-9])、下划线(_)，下划线不能出现在开始或结尾，下划线不能连续出现，长度为1到32个字符。
     * @return group
     */
    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }

    public CreateSubscriptionUserRequestBody withHttp(CreateSubscriptionUserRequestHttpEndpointInfo http) {
        this.http = http;
        return this;
    }

    public CreateSubscriptionUserRequestBody withHttp(
        Consumer<CreateSubscriptionUserRequestHttpEndpointInfo> httpSetter) {
        if (this.http == null) {
            this.http = new CreateSubscriptionUserRequestHttpEndpointInfo();
            httpSetter.accept(this.http);
        }

        return this;
    }

    /**
     * Get http
     * @return http
     */
    public CreateSubscriptionUserRequestHttpEndpointInfo getHttp() {
        return http;
    }

    public void setHttp(CreateSubscriptionUserRequestHttpEndpointInfo http) {
        this.http = http;
    }

    public CreateSubscriptionUserRequestBody withHttps(CreateSubscriptionUserRequestHttpsEndpointInfo https) {
        this.https = https;
        return this;
    }

    public CreateSubscriptionUserRequestBody withHttps(
        Consumer<CreateSubscriptionUserRequestHttpsEndpointInfo> httpsSetter) {
        if (this.https == null) {
            this.https = new CreateSubscriptionUserRequestHttpsEndpointInfo();
            httpsSetter.accept(this.https);
        }

        return this;
    }

    /**
     * Get https
     * @return https
     */
    public CreateSubscriptionUserRequestHttpsEndpointInfo getHttps() {
        return https;
    }

    public void setHttps(CreateSubscriptionUserRequestHttpsEndpointInfo https) {
        this.https = https;
    }

    public CreateSubscriptionUserRequestBody withSms(CreateSubscriptionUserRequestSmsEndpointInfo sms) {
        this.sms = sms;
        return this;
    }

    public CreateSubscriptionUserRequestBody withSms(Consumer<CreateSubscriptionUserRequestSmsEndpointInfo> smsSetter) {
        if (this.sms == null) {
            this.sms = new CreateSubscriptionUserRequestSmsEndpointInfo();
            smsSetter.accept(this.sms);
        }

        return this;
    }

    /**
     * Get sms
     * @return sms
     */
    public CreateSubscriptionUserRequestSmsEndpointInfo getSms() {
        return sms;
    }

    public void setSms(CreateSubscriptionUserRequestSmsEndpointInfo sms) {
        this.sms = sms;
    }

    public CreateSubscriptionUserRequestBody withEmail(CreateSubscriptionUserRequestEmailEndpointInfo email) {
        this.email = email;
        return this;
    }

    public CreateSubscriptionUserRequestBody withEmail(
        Consumer<CreateSubscriptionUserRequestEmailEndpointInfo> emailSetter) {
        if (this.email == null) {
            this.email = new CreateSubscriptionUserRequestEmailEndpointInfo();
            emailSetter.accept(this.email);
        }

        return this;
    }

    /**
     * Get email
     * @return email
     */
    public CreateSubscriptionUserRequestEmailEndpointInfo getEmail() {
        return email;
    }

    public void setEmail(CreateSubscriptionUserRequestEmailEndpointInfo email) {
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
        CreateSubscriptionUserRequestBody that = (CreateSubscriptionUserRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.group, that.group)
            && Objects.equals(this.http, that.http) && Objects.equals(this.https, that.https)
            && Objects.equals(this.sms, that.sms) && Objects.equals(this.email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, http, https, sms, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscriptionUserRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
