package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询容灾演练数据结构
 */
public class ShowDisasterRecoveryDrillParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drill_vpc_id")

    private String drillVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drill_servers")

    private List<DrillServerParams> drillServers = null;

    public ShowDisasterRecoveryDrillParams withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 容灾演练的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDisasterRecoveryDrillParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 容灾演练的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDisasterRecoveryDrillParams withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 容灾演练的状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDisasterRecoveryDrillParams withDrillVpcId(String drillVpcId) {
        this.drillVpcId = drillVpcId;
        return this;
    }

    /**
     * 演练虚拟私有云id。
     * @return drillVpcId
     */
    public String getDrillVpcId() {
        return drillVpcId;
    }

    public void setDrillVpcId(String drillVpcId) {
        this.drillVpcId = drillVpcId;
    }

    public ShowDisasterRecoveryDrillParams withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。默认格式为：\"yyyy-MM-dd HH:mm:ss.SSS\"，例：\"2019-04-01 12:00:00.000\"。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowDisasterRecoveryDrillParams withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。默认格式为：\"yyyy-MM-dd HH:mm:ss.SSS\"，例：\"2019-04-01 12:00:00.000\"。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowDisasterRecoveryDrillParams withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 保护组的ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public ShowDisasterRecoveryDrillParams withDrillServers(List<DrillServerParams> drillServers) {
        this.drillServers = drillServers;
        return this;
    }

    public ShowDisasterRecoveryDrillParams addDrillServersItem(DrillServerParams drillServersItem) {
        if (this.drillServers == null) {
            this.drillServers = new ArrayList<>();
        }
        this.drillServers.add(drillServersItem);
        return this;
    }

    public ShowDisasterRecoveryDrillParams withDrillServers(Consumer<List<DrillServerParams>> drillServersSetter) {
        if (this.drillServers == null) {
            this.drillServers = new ArrayList<>();
        }
        drillServersSetter.accept(this.drillServers);
        return this;
    }

    /**
     * 演练云服务器列表。
     * @return drillServers
     */
    public List<DrillServerParams> getDrillServers() {
        return drillServers;
    }

    public void setDrillServers(List<DrillServerParams> drillServers) {
        this.drillServers = drillServers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDisasterRecoveryDrillParams that = (ShowDisasterRecoveryDrillParams) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.drillVpcId, that.drillVpcId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.serverGroupId, that.serverGroupId)
            && Objects.equals(this.drillServers, that.drillServers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, drillVpcId, createdAt, updatedAt, serverGroupId, drillServers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDisasterRecoveryDrillParams {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    drillVpcId: ").append(toIndentedString(drillVpcId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    drillServers: ").append(toIndentedString(drillServers)).append("\n");
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
