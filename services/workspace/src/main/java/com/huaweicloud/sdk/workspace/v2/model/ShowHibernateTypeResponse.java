package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHibernateTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hibernate_type")

    private HibernateType hibernateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shutdown_days")

    private Integer shutdownDays;

    public ShowHibernateTypeResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ShowHibernateTypeResponse withHibernateType(HibernateType hibernateType) {
        this.hibernateType = hibernateType;
        return this;
    }

    /**
     * Get hibernateType
     * @return hibernateType
     */
    public HibernateType getHibernateType() {
        return hibernateType;
    }

    public void setHibernateType(HibernateType hibernateType) {
        this.hibernateType = hibernateType;
    }

    public ShowHibernateTypeResponse withShutdownDays(Integer shutdownDays) {
        this.shutdownDays = shutdownDays;
        return this;
    }

    /**
     * 休眠关机时长（天）
     * minimum: 1
     * maximum: 100
     * @return shutdownDays
     */
    public Integer getShutdownDays() {
        return shutdownDays;
    }

    public void setShutdownDays(Integer shutdownDays) {
        this.shutdownDays = shutdownDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHibernateTypeResponse that = (ShowHibernateTypeResponse) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.hibernateType, that.hibernateType)
            && Objects.equals(this.shutdownDays, that.shutdownDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, hibernateType, shutdownDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHibernateTypeResponse {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    hibernateType: ").append(toIndentedString(hibernateType)).append("\n");
        sb.append("    shutdownDays: ").append(toIndentedString(shutdownDays)).append("\n");
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
