package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepositoryHookRequest
 */
public class RepositoryHookRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_url")

    private String hookUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_events")

    private List<String> hookEvents = null;

    public RepositoryHookRequest withHookUrl(String hookUrl) {
        this.hookUrl = hookUrl;
        return this;
    }

    /**
     * 触发url
     * @return hookUrl
     */
    public String getHookUrl() {
        return hookUrl;
    }

    public void setHookUrl(String hookUrl) {
        this.hookUrl = hookUrl;
    }

    public RepositoryHookRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 事件来源
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public RepositoryHookRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 安全令牌
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public RepositoryHookRequest withHookEvents(List<String> hookEvents) {
        this.hookEvents = hookEvents;
        return this;
    }

    public RepositoryHookRequest addHookEventsItem(String hookEventsItem) {
        if (this.hookEvents == null) {
            this.hookEvents = new ArrayList<>();
        }
        this.hookEvents.add(hookEventsItem);
        return this;
    }

    public RepositoryHookRequest withHookEvents(Consumer<List<String>> hookEventsSetter) {
        if (this.hookEvents == null) {
            this.hookEvents = new ArrayList<>();
        }
        hookEventsSetter.accept(this.hookEvents);
        return this;
    }

    /**
     * 触发事件
     * @return hookEvents
     */
    public List<String> getHookEvents() {
        return hookEvents;
    }

    public void setHookEvents(List<String> hookEvents) {
        this.hookEvents = hookEvents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryHookRequest that = (RepositoryHookRequest) obj;
        return Objects.equals(this.hookUrl, that.hookUrl) && Objects.equals(this.service, that.service)
            && Objects.equals(this.token, that.token) && Objects.equals(this.hookEvents, that.hookEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hookUrl, service, token, hookEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryHookRequest {\n");
        sb.append("    hookUrl: ").append(toIndentedString(hookUrl)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    hookEvents: ").append(toIndentedString(hookEvents)).append("\n");
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
