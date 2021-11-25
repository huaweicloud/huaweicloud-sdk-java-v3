package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListBandwidthTimelineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private String hosts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private String instances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    public ListBandwidthTimelineRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 您可以通过调用企业项目管理服务（EPS)的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListBandwidthTimelineRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /** 起始时间（13位毫秒时间戳），需要和to同时使用
     * 
     * @return from */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListBandwidthTimelineRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /** 结束时间（13位毫秒时间戳），需要和from同时使用
     * 
     * @return to */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListBandwidthTimelineRequest withHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }

    /** 要查询域名列表（通过ListHost接口查询）
     * 
     * @return hosts */
    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public ListBandwidthTimelineRequest withInstances(String instances) {
        this.instances = instances;
        return this;
    }

    /** 要查询实例列表（仅实例化模式涉及）
     * 
     * @return instances */
    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public ListBandwidthTimelineRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /** 展示维度，按天展示时传\"DAY\"
     * 
     * @return groupBy */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBandwidthTimelineRequest listBandwidthTimelineRequest = (ListBandwidthTimelineRequest) o;
        return Objects.equals(this.enterpriseProjectId, listBandwidthTimelineRequest.enterpriseProjectId)
            && Objects.equals(this.from, listBandwidthTimelineRequest.from)
            && Objects.equals(this.to, listBandwidthTimelineRequest.to)
            && Objects.equals(this.hosts, listBandwidthTimelineRequest.hosts)
            && Objects.equals(this.instances, listBandwidthTimelineRequest.instances)
            && Objects.equals(this.groupBy, listBandwidthTimelineRequest.groupBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, from, to, hosts, instances, groupBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthTimelineRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
