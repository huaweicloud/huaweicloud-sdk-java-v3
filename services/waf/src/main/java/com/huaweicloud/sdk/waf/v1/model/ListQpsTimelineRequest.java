package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListQpsTimelineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    @JacksonXmlProperty(localName = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    @JacksonXmlProperty(localName = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    @JacksonXmlProperty(localName = "hosts")

    private String hosts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    @JacksonXmlProperty(localName = "instances")

    private String instances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    @JacksonXmlProperty(localName = "group_by")

    private String groupBy;

    public ListQpsTimelineRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 通过企业项目管理服务的查询企业项目列表接口ListEnterpriseProject查询通过企业项目管理服务的查询企业项目列表接口ListEnterpriseProject查询企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListQpsTimelineRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 起始时间（13位毫秒时间戳），需要和to同时使用
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListQpsTimelineRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 结束时间（13位毫秒时间戳），需要和from同时使用
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListQpsTimelineRequest withHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * 域名id，通过查询云模式防护域名列表（ListHost）获取域名id或者通过独享模式域名列表（ListPremiumHost）获取域名id
     * @return hosts
     */
    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public ListQpsTimelineRequest withInstances(String instances) {
        this.instances = instances;
        return this;
    }

    /**
     * 要查询引擎实例id（仅独享或者ELB实例化模式涉及）
     * @return instances
     */
    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public ListQpsTimelineRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 展示维度，按天展示时传\"DAY\"；默认不传，按照分钟展示
     * @return groupBy
     */
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
        ListQpsTimelineRequest listQpsTimelineRequest = (ListQpsTimelineRequest) o;
        return Objects.equals(this.enterpriseProjectId, listQpsTimelineRequest.enterpriseProjectId)
            && Objects.equals(this.from, listQpsTimelineRequest.from)
            && Objects.equals(this.to, listQpsTimelineRequest.to)
            && Objects.equals(this.hosts, listQpsTimelineRequest.hosts)
            && Objects.equals(this.instances, listQpsTimelineRequest.instances)
            && Objects.equals(this.groupBy, listQpsTimelineRequest.groupBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, from, to, hosts, instances, groupBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQpsTimelineRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
