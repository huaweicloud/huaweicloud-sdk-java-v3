package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListDisasterRecoveryDrillsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

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
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListDisasterRecoveryDrillsRequest withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /** 保护组的ID。
     * 
     * @return serverGroupId */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public ListDisasterRecoveryDrillsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 容灾演练的名称。支持模糊查询。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDisasterRecoveryDrillsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 容灾演练的状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListDisasterRecoveryDrillsRequest withDrillVpcId(String drillVpcId) {
        this.drillVpcId = drillVpcId;
        return this;
    }

    /** 演练虚拟私有云ID。
     * 
     * @return drillVpcId */
    public String getDrillVpcId() {
        return drillVpcId;
    }

    public void setDrillVpcId(String drillVpcId) {
        this.drillVpcId = drillVpcId;
    }

    public ListDisasterRecoveryDrillsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每次请求返回结果个数限制，取值范围为[0,1000]的正整数，默认值为1000。 minimum: 0 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDisasterRecoveryDrillsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 每次请求开始的下标，即偏移量，默认值为0。offset必须为数字，不能为负数。 minimum: 0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDisasterRecoveryDrillsRequest listDisasterRecoveryDrillsRequest = (ListDisasterRecoveryDrillsRequest) o;
        return Objects.equals(this.serverGroupId, listDisasterRecoveryDrillsRequest.serverGroupId)
            && Objects.equals(this.name, listDisasterRecoveryDrillsRequest.name)
            && Objects.equals(this.status, listDisasterRecoveryDrillsRequest.status)
            && Objects.equals(this.drillVpcId, listDisasterRecoveryDrillsRequest.drillVpcId)
            && Objects.equals(this.limit, listDisasterRecoveryDrillsRequest.limit)
            && Objects.equals(this.offset, listDisasterRecoveryDrillsRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId, name, status, drillVpcId, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDisasterRecoveryDrillsRequest {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    drillVpcId: ").append(toIndentedString(drillVpcId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
