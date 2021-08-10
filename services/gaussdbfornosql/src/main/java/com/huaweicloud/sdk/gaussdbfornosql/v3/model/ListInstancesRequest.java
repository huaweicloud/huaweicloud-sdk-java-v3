package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListInstancesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /** 实例ID。 如果id以“*”起始，表示按照“*”后面的值模糊匹配，否则，按照实际填写的id精确匹配查询。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListInstancesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 实例名称。 如果name以“*”起始，表示按照“*”后面的值模糊匹配，否则，按照实际填写的name精确匹配查询。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancesRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /** 实例类型。 - 取值为“Cluster”，表示GaussDB(for Cassandra)集群实例类型。 - 取值为“Sharding”，表示GaussDB(for Mongo)集群实例类型。 -
     * 取值为“ReplicaSet”，表示GaussDB(for Mongo)副本集实例类型。 - 取值为“InfluxdbCluster”，表示GaussDB(for Influx)集群实例类型。
     * 
     * @return mode */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ListInstancesRequest withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /** 数据库类型。 - 取值为“cassandra”，表示查询GaussDB(for Cassandra)数据库实例。 - 取值为“mongodb”，表示查询GaussDB(for Mongo)数据库实例。 -
     * 取值为“influxdb”，表示查询GaussDB(for Influx)数据库实例。 - 如果不传该参数，表示查询所有数据库实例。
     * 
     * @return datastoreType */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ListInstancesRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 虚拟私有云ID，获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考查询VPC列表。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListInstancesRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /** 子网的网络ID，获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考查询子网列表。
     * 
     * @return subnetId */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ListInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 索引位置偏移量，表示从指定project ID下最新的实例创建时间开始，按时间的先后顺序偏移offset条数据后查询对应的实例信息。
     * 取值大于或等于0。不传该参数时，查询偏移量默认为0，表示从最新的实例创建时间对应的实例开始查询。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 查询实例个数上限值。 取值范围：1~100。不传该参数时，默认查询前100条实例信息。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesRequest listInstancesRequest = (ListInstancesRequest) o;
        return Objects.equals(this.id, listInstancesRequest.id) && Objects.equals(this.name, listInstancesRequest.name)
            && Objects.equals(this.mode, listInstancesRequest.mode)
            && Objects.equals(this.datastoreType, listInstancesRequest.datastoreType)
            && Objects.equals(this.vpcId, listInstancesRequest.vpcId)
            && Objects.equals(this.subnetId, listInstancesRequest.subnetId)
            && Objects.equals(this.offset, listInstancesRequest.offset)
            && Objects.equals(this.limit, listInstancesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mode, datastoreType, vpcId, subnetId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
