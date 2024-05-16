package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FlameLineTreeInfo
 */
public class FlameLineTreeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api")

    private String api;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public FlameLineTreeInfo withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 开始时间，比如1704271204595
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public FlameLineTreeInfo withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 结束时间, 比如1704275169491
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public FlameLineTreeInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据类型, CPU 或者 LATENCY
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlameLineTreeInfo withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public FlameLineTreeInfo withApi(String api) {
        this.api = api;
        return this;
    }

    /**
     * api的url,比如: GET_/user/{id}
     * @return api
     */
    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public FlameLineTreeInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 实例所在区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlameLineTreeInfo that = (FlameLineTreeInfo) obj;
        return Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.type, that.type) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.api, that.api) && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, type, instanceId, api, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlameLineTreeInfo {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    api: ").append(toIndentedString(api)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
