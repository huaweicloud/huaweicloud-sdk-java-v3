package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 休眠断开选项
 */
public class VdiDisconnectHibernateOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnect_hibernate_minutes")

    private Integer disconnectHibernateMinutes;

    public VdiDisconnectHibernateOptions withDisconnectHibernateMinutes(Integer disconnectHibernateMinutes) {
        this.disconnectHibernateMinutes = disconnectHibernateMinutes;
        return this;
    }

    /**
     * 断连休眠时间。
     * @return disconnectHibernateMinutes
     */
    public Integer getDisconnectHibernateMinutes() {
        return disconnectHibernateMinutes;
    }

    public void setDisconnectHibernateMinutes(Integer disconnectHibernateMinutes) {
        this.disconnectHibernateMinutes = disconnectHibernateMinutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VdiDisconnectHibernateOptions that = (VdiDisconnectHibernateOptions) obj;
        return Objects.equals(this.disconnectHibernateMinutes, that.disconnectHibernateMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disconnectHibernateMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VdiDisconnectHibernateOptions {\n");
        sb.append("    disconnectHibernateMinutes: ").append(toIndentedString(disconnectHibernateMinutes)).append("\n");
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
