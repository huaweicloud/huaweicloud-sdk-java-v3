package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private String pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private String pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_start_time")

    private String queryStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_end_time")

    private String queryEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_scene_tag")

    private String poolSceneTag;

    public ListInstancesRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * 消息跟踪唯一id
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public ListInstancesRequest withPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * Get pageNo
     * @return pageNo
     */
    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public ListInstancesRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get pageSize
     * @return pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public ListInstancesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstancesRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * Get instanceName
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ListInstancesRequest withQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }

    /**
     * 查询开始时间，UTC时间，格式2023-08-15 14:30:45
     * @return queryStartTime
     */
    public String getQueryStartTime() {
        return queryStartTime;
    }

    public void setQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
    }

    public ListInstancesRequest withQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    /**
     * 查询结束时间，UTC时间，格式2023-08-15 14:30:45
     * @return queryEndTime
     */
    public String getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    public ListInstancesRequest withPoolSceneTag(String poolSceneTag) {
        this.poolSceneTag = poolSceneTag;
        return this;
    }

    /**
     * CLOUD_APP 云应用， CLOUD_PHONE云手机
     * @return poolSceneTag
     */
    public String getPoolSceneTag() {
        return poolSceneTag;
    }

    public void setPoolSceneTag(String poolSceneTag) {
        this.poolSceneTag = poolSceneTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesRequest that = (ListInstancesRequest) obj;
        return Objects.equals(this.xRequestId, that.xRequestId) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.queryStartTime, that.queryStartTime)
            && Objects.equals(this.queryEndTime, that.queryEndTime)
            && Objects.equals(this.poolSceneTag, that.poolSceneTag);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(xRequestId, pageNo, pageSize, instanceId, instanceName, queryStartTime, queryEndTime, poolSceneTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    queryStartTime: ").append(toIndentedString(queryStartTime)).append("\n");
        sb.append("    queryEndTime: ").append(toIndentedString(queryEndTime)).append("\n");
        sb.append("    poolSceneTag: ").append(toIndentedString(poolSceneTag)).append("\n");
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
