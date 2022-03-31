package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListCloudConnectionRoutesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private List<String> cloudConnectionId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private List<String> instanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public ListCloudConnectionRoutesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 分页查询时，每页返回的个数。 minimum: 1 maximum: 2000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCloudConnectionRoutesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 分页查询时，上一页最后一条记录的ID，为空时为查询第一页。 使用说明：必须与limit一起使用。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListCloudConnectionRoutesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /** 根据云连接路由ID过滤云连接路由条目列表。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListCloudConnectionRoutesRequest withCloudConnectionId(List<String> cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    public ListCloudConnectionRoutesRequest addCloudConnectionIdItem(String cloudConnectionIdItem) {
        if (this.cloudConnectionId == null) {
            this.cloudConnectionId = new ArrayList<>();
        }
        this.cloudConnectionId.add(cloudConnectionIdItem);
        return this;
    }

    public ListCloudConnectionRoutesRequest withCloudConnectionId(Consumer<List<String>> cloudConnectionIdSetter) {
        if (this.cloudConnectionId == null) {
            this.cloudConnectionId = new ArrayList<>();
        }
        cloudConnectionIdSetter.accept(this.cloudConnectionId);
        return this;
    }

    /** 根据云连接实例ID过滤云连接路由条目列表。
     * 
     * @return cloudConnectionId */
    public List<String> getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(List<String> cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public ListCloudConnectionRoutesRequest withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public ListCloudConnectionRoutesRequest addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public ListCloudConnectionRoutesRequest withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /** 根据网络实例ID过滤云连接路由条目列表。
     * 
     * @return instanceId */
    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    public ListCloudConnectionRoutesRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /** 根据Region ID过滤云连接路由条目列表。
     * 
     * @return regionId */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCloudConnectionRoutesRequest listCloudConnectionRoutesRequest = (ListCloudConnectionRoutesRequest) o;
        return Objects.equals(this.limit, listCloudConnectionRoutesRequest.limit)
            && Objects.equals(this.marker, listCloudConnectionRoutesRequest.marker)
            && Objects.equals(this.id, listCloudConnectionRoutesRequest.id)
            && Objects.equals(this.cloudConnectionId, listCloudConnectionRoutesRequest.cloudConnectionId)
            && Objects.equals(this.instanceId, listCloudConnectionRoutesRequest.instanceId)
            && Objects.equals(this.regionId, listCloudConnectionRoutesRequest.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, cloudConnectionId, instanceId, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudConnectionRoutesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
