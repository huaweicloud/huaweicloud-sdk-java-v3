package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 扩容实例。 */
public class ExtendClusterInstancesResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_id")

    private String shardId;

    public ExtendClusterInstancesResp withId(String id) {
        this.id = id;
        return this;
    }

    /** 实例ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExtendClusterInstancesResp withName(String name) {
        this.name = name;
        return this;
    }

    /** 实例名字。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtendClusterInstancesResp withType(String type) {
        this.type = type;
        return this;
    }

    /** 实例类型。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExtendClusterInstancesResp withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /** 实例组名。
     * 
     * @return shardId */
    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendClusterInstancesResp extendClusterInstancesResp = (ExtendClusterInstancesResp) o;
        return Objects.equals(this.id, extendClusterInstancesResp.id)
            && Objects.equals(this.name, extendClusterInstancesResp.name)
            && Objects.equals(this.type, extendClusterInstancesResp.type)
            && Objects.equals(this.shardId, extendClusterInstancesResp.shardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, shardId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendClusterInstancesResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    shardId: ").append(toIndentedString(shardId)).append("\n");
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
