package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PromConfigModel
 */
public class PromConfigModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_write_url")

    private String remoteWriteUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_read_url")

    private String remoteReadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_http_api_endpoint")

    private String promHttpApiEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_id")

    private String dashboardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public PromConfigModel withRemoteWriteUrl(String remoteWriteUrl) {
        this.remoteWriteUrl = remoteWriteUrl;
        return this;
    }

    /**
     * 普罗实例remote-write地址
     * @return remoteWriteUrl
     */
    public String getRemoteWriteUrl() {
        return remoteWriteUrl;
    }

    public void setRemoteWriteUrl(String remoteWriteUrl) {
        this.remoteWriteUrl = remoteWriteUrl;
    }

    public PromConfigModel withRemoteReadUrl(String remoteReadUrl) {
        this.remoteReadUrl = remoteReadUrl;
        return this;
    }

    /**
     * 普罗实例remote-read地址
     * @return remoteReadUrl
     */
    public String getRemoteReadUrl() {
        return remoteReadUrl;
    }

    public void setRemoteReadUrl(String remoteReadUrl) {
        this.remoteReadUrl = remoteReadUrl;
    }

    public PromConfigModel withPromHttpApiEndpoint(String promHttpApiEndpoint) {
        this.promHttpApiEndpoint = promHttpApiEndpoint;
        return this;
    }

    /**
     * 普罗实例调用url
     * @return promHttpApiEndpoint
     */
    public String getPromHttpApiEndpoint() {
        return promHttpApiEndpoint;
    }

    public void setPromHttpApiEndpoint(String promHttpApiEndpoint) {
        this.promHttpApiEndpoint = promHttpApiEndpoint;
    }

    public PromConfigModel withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * 普罗实例关联dashboard的dashboard ID
     * @return dashboardId
     */
    public String getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    public PromConfigModel withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 普罗实例所属的region
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PromConfigModel that = (PromConfigModel) obj;
        return Objects.equals(this.remoteWriteUrl, that.remoteWriteUrl)
            && Objects.equals(this.remoteReadUrl, that.remoteReadUrl)
            && Objects.equals(this.promHttpApiEndpoint, that.promHttpApiEndpoint)
            && Objects.equals(this.dashboardId, that.dashboardId) && Objects.equals(this.regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteWriteUrl, remoteReadUrl, promHttpApiEndpoint, dashboardId, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromConfigModel {\n");
        sb.append("    remoteWriteUrl: ").append(toIndentedString(remoteWriteUrl)).append("\n");
        sb.append("    remoteReadUrl: ").append(toIndentedString(remoteReadUrl)).append("\n");
        sb.append("    promHttpApiEndpoint: ").append(toIndentedString(promHttpApiEndpoint)).append("\n");
        sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
