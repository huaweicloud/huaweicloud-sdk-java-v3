package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 不操作休眠选项。
 */
public class VdiNoOperationHibernateOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_operation_hibernate_minutes")

    private Integer noOperationHibernateMinutes;

    public VdiNoOperationHibernateOptions withNoOperationHibernateMinutes(Integer noOperationHibernateMinutes) {
        this.noOperationHibernateMinutes = noOperationHibernateMinutes;
        return this;
    }

    /**
     * 策略组ID。
     * minimum: 0
     * maximum: 86400
     * @return noOperationHibernateMinutes
     */
    public Integer getNoOperationHibernateMinutes() {
        return noOperationHibernateMinutes;
    }

    public void setNoOperationHibernateMinutes(Integer noOperationHibernateMinutes) {
        this.noOperationHibernateMinutes = noOperationHibernateMinutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VdiNoOperationHibernateOptions that = (VdiNoOperationHibernateOptions) obj;
        return Objects.equals(this.noOperationHibernateMinutes, that.noOperationHibernateMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noOperationHibernateMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VdiNoOperationHibernateOptions {\n");
        sb.append("    noOperationHibernateMinutes: ")
            .append(toIndentedString(noOperationHibernateMinutes))
            .append("\n");
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
