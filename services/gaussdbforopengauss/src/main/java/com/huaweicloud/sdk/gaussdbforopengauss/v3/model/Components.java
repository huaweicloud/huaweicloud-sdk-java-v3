package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组件列表
 */
public class Components {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distributed_id")

    private String distributedId;

    public Components withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 组件id，当组件类型为DN，组件id为6001，则对应的值为dn_6001。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Components withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 节点类型，取值为“master”、“slave”，分别对应于主节点、备节点。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Components withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 组件状态。 Primary：该组件为主。 Normal：该组件状态正常。 Down：该组件处于宕机状态。 Standby：该组件为备。 StateFollower：该ETCD为备。 StateLeader：该ETCD为主。 StateCandidate：该ETCD为仲裁。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Components withDistributedId(String distributedId) {
        this.distributedId = distributedId;
        return this;
    }

    /**
     * 分组id，只有dn组件有分组id，用于区分是否是同一个分片下的组件。其他组件为空字符串。
     * @return distributedId
     */
    public String getDistributedId() {
        return distributedId;
    }

    public void setDistributedId(String distributedId) {
        this.distributedId = distributedId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Components that = (Components) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.role, that.role)
            && Objects.equals(this.status, that.status) && Objects.equals(this.distributedId, that.distributedId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role, status, distributedId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Components {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    distributedId: ").append(toIndentedString(distributedId)).append("\n");
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
