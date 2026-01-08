package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询sysprep版本信息响应。
 */
public class DesktopSysprepInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sysprep_version")

    private String sysprepVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_hibernate")

    private Boolean supportHibernate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_update_route")

    private Boolean supportUpdateRoute;

    public DesktopSysprepInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面id。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DesktopSysprepInfo withSysprepVersion(String sysprepVersion) {
        this.sysprepVersion = sysprepVersion;
        return this;
    }

    /**
     * sysprep版本。
     * @return sysprepVersion
     */
    public String getSysprepVersion() {
        return sysprepVersion;
    }

    public void setSysprepVersion(String sysprepVersion) {
        this.sysprepVersion = sysprepVersion;
    }

    public DesktopSysprepInfo withSupportHibernate(Boolean supportHibernate) {
        this.supportHibernate = supportHibernate;
        return this;
    }

    /**
     * 是否支持休眠。
     * @return supportHibernate
     */
    public Boolean getSupportHibernate() {
        return supportHibernate;
    }

    public void setSupportHibernate(Boolean supportHibernate) {
        this.supportHibernate = supportHibernate;
    }

    public DesktopSysprepInfo withSupportUpdateRoute(Boolean supportUpdateRoute) {
        this.supportUpdateRoute = supportUpdateRoute;
        return this;
    }

    /**
     * 是否支持修改路由。
     * @return supportUpdateRoute
     */
    public Boolean getSupportUpdateRoute() {
        return supportUpdateRoute;
    }

    public void setSupportUpdateRoute(Boolean supportUpdateRoute) {
        this.supportUpdateRoute = supportUpdateRoute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopSysprepInfo that = (DesktopSysprepInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.sysprepVersion, that.sysprepVersion)
            && Objects.equals(this.supportHibernate, that.supportHibernate)
            && Objects.equals(this.supportUpdateRoute, that.supportUpdateRoute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, sysprepVersion, supportHibernate, supportUpdateRoute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopSysprepInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    sysprepVersion: ").append(toIndentedString(sysprepVersion)).append("\n");
        sb.append("    supportHibernate: ").append(toIndentedString(supportHibernate)).append("\n");
        sb.append("    supportUpdateRoute: ").append(toIndentedString(supportUpdateRoute)).append("\n");
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
