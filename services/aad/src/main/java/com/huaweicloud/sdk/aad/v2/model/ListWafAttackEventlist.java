package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListWafAttackEventlist
 */
public class ListWafAttackEventlist {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Integer time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sip")

    private String sip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend")

    private Backend backend;

    public ListWafAttackEventlist withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListWafAttackEventlist withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 攻击目标域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListWafAttackEventlist withTime(Integer time) {
        this.time = time;
        return this;
    }

    /**
     * 攻击时间
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public ListWafAttackEventlist withSip(String sip) {
        this.sip = sip;
        return this;
    }

    /**
     * 攻击源IP
     * @return sip
     */
    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public ListWafAttackEventlist withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 防御动作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListWafAttackEventlist withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 攻击url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ListWafAttackEventlist withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 攻击类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListWafAttackEventlist withBackend(Backend backend) {
        this.backend = backend;
        return this;
    }

    public ListWafAttackEventlist withBackend(Consumer<Backend> backendSetter) {
        if (this.backend == null) {
            this.backend = new Backend();
            backendSetter.accept(this.backend);
        }

        return this;
    }

    /**
     * Get backend
     * @return backend
     */
    public Backend getBackend() {
        return backend;
    }

    public void setBackend(Backend backend) {
        this.backend = backend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWafAttackEventlist that = (ListWafAttackEventlist) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.time, that.time) && Objects.equals(this.sip, that.sip)
            && Objects.equals(this.action, that.action) && Objects.equals(this.url, that.url)
            && Objects.equals(this.type, that.type) && Objects.equals(this.backend, that.backend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, domain, time, sip, action, url, type, backend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWafAttackEventlist {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
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
