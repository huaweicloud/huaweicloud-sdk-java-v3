package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAddonInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addon_template_name")

    private String addonTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_database_status")

    private String isDatabaseStatus;

    public ListAddonInstancesRequest withClusterId(String clusterId) {
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

    public ListAddonInstancesRequest withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    /**
     * 是否使用数据库存储的插件状态
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    public ListAddonInstancesRequest withIsDatabaseStatus(String isDatabaseStatus) {
        this.isDatabaseStatus = isDatabaseStatus;
        return this;
    }

    /**
     * 插件包名字
     * @return isDatabaseStatus
     */
    public String getIsDatabaseStatus() {
        return isDatabaseStatus;
    }

    public void setIsDatabaseStatus(String isDatabaseStatus) {
        this.isDatabaseStatus = isDatabaseStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAddonInstancesRequest that = (ListAddonInstancesRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.addonTemplateName, that.addonTemplateName)
            && Objects.equals(this.isDatabaseStatus, that.isDatabaseStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, addonTemplateName, isDatabaseStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAddonInstancesRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
        sb.append("    isDatabaseStatus: ").append(toIndentedString(isDatabaseStatus)).append("\n");
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
