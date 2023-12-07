package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChannelCreateReqPolicy
 */
public class ChannelCreateReqPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Effect")

    private String effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Principal")

    private Map<String, ChannelCreateReqPrincipal> principal = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Resource")

    private String resource;

    public ChannelCreateReqPolicy withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 固定值：allow_account_to_put_events
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public ChannelCreateReqPolicy withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 固定值：Allow
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public ChannelCreateReqPolicy withPrincipal(Map<String, ChannelCreateReqPrincipal> principal) {
        this.principal = principal;
        return this;
    }

    public ChannelCreateReqPolicy putPrincipalItem(String key, ChannelCreateReqPrincipal principalItem) {
        if (this.principal == null) {
            this.principal = new HashMap<>();
        }
        this.principal.put(key, principalItem);
        return this;
    }

    public ChannelCreateReqPolicy withPrincipal(Consumer<Map<String, ChannelCreateReqPrincipal>> principalSetter) {
        if (this.principal == null) {
            this.principal = new HashMap<>();
        }
        principalSetter.accept(this.principal);
        return this;
    }

    /**
     * domain白名单
     * @return principal
     */
    public Map<String, ChannelCreateReqPrincipal> getPrincipal() {
        return principal;
    }

    public void setPrincipal(Map<String, ChannelCreateReqPrincipal> principal) {
        this.principal = principal;
    }

    public ChannelCreateReqPolicy withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 固定值：eg:channels:putEvents
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ChannelCreateReqPolicy withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 固定格式：urn:eg:cn-east-2:{project_id}:channel:{channel_name}
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChannelCreateReqPolicy that = (ChannelCreateReqPolicy) obj;
        return Objects.equals(this.sid, that.sid) && Objects.equals(this.effect, that.effect)
            && Objects.equals(this.principal, that.principal) && Objects.equals(this.action, that.action)
            && Objects.equals(this.resource, that.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, effect, principal, action, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelCreateReqPolicy {\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
