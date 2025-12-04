package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAddonInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_database_status")

    private String isDatabaseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public ShowAddonInstanceRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 插件实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAddonInstanceRequest withIsDatabaseStatus(String isDatabaseStatus) {
        this.isDatabaseStatus = isDatabaseStatus;
        return this;
    }

    /**
     * 是否使用数据库存储的插件状态
     * @return isDatabaseStatus
     */
    public String getIsDatabaseStatus() {
        return isDatabaseStatus;
    }

    public void setIsDatabaseStatus(String isDatabaseStatus) {
        this.isDatabaseStatus = isDatabaseStatus;
    }

    public ShowAddonInstanceRequest withClusterId(String clusterId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAddonInstanceRequest that = (ShowAddonInstanceRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.isDatabaseStatus, that.isDatabaseStatus)
            && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isDatabaseStatus, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAddonInstanceRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isDatabaseStatus: ").append(toIndentedString(isDatabaseStatus)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
