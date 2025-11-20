package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UnusedAction
 */
public class UnusedAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_accessed")

    private Object lastAccessed;

    public UnusedAction withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 授权项名称。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UnusedAction withLastAccessed(Object lastAccessed) {
        this.lastAccessed = lastAccessed;
        return this;
    }

    /**
     * 用户使用授权项的最后访问时间。
     * @return lastAccessed
     */
    public Object getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(Object lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnusedAction that = (UnusedAction) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.lastAccessed, that.lastAccessed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, lastAccessed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnusedAction {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
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
