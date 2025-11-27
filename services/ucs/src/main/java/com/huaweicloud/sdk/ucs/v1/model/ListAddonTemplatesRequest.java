package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAddonTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newest")

    private String newest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addon_template_name")

    private String addonTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_update_addon_version")

    private String baseUpdateAddonVersion;

    public ListAddonTemplatesRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 插件包版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListAddonTemplatesRequest withNewest(String newest) {
        this.newest = newest;
        return this;
    }

    /**
     * 是否获取集群内创建的最新状态
     * @return newest
     */
    public String getNewest() {
        return newest;
    }

    public void setNewest(String newest) {
        this.newest = newest;
    }

    public ListAddonTemplatesRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListAddonTemplatesRequest withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    /**
     * 插件模板名称
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    public ListAddonTemplatesRequest withBaseUpdateAddonVersion(String baseUpdateAddonVersion) {
        this.baseUpdateAddonVersion = baseUpdateAddonVersion;
        return this;
    }

    /**
     * 插件的最低版本
     * @return baseUpdateAddonVersion
     */
    public String getBaseUpdateAddonVersion() {
        return baseUpdateAddonVersion;
    }

    public void setBaseUpdateAddonVersion(String baseUpdateAddonVersion) {
        this.baseUpdateAddonVersion = baseUpdateAddonVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAddonTemplatesRequest that = (ListAddonTemplatesRequest) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.newest, that.newest)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.addonTemplateName, that.addonTemplateName)
            && Objects.equals(this.baseUpdateAddonVersion, that.baseUpdateAddonVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, newest, clusterId, addonTemplateName, baseUpdateAddonVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAddonTemplatesRequest {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    newest: ").append(toIndentedString(newest)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
        sb.append("    baseUpdateAddonVersion: ").append(toIndentedString(baseUpdateAddonVersion)).append("\n");
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
