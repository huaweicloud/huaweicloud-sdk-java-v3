package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListServerMetricDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    public ListServerMetricDataRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 服务器唯一标识。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ListServerMetricDataRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 服务的命名空间：例如 \"SYS.ECS/AGT.ECS\"，当namespace为AGT.ECS，则查询GPU监控指标：  - SYS.ECS：弹性云服务器的基础监控指标。  - AGT.ECS：弹性云服务器操作系统监控的监控指标（GPU指标）。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListServerMetricDataRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 监控查询指标名称:  - SYS.ECS命名空间的指标名称,请参考帮助文档：“[弹性云服务器支持的基础监控指标](https://support.huaweicloud.com/usermanual-ecs/ecs_03_1002.html)”。  - AGT.ECS命名空间的指标名称,请参考帮助文档：“[操作系统监控指标：GPU](https://support.huaweicloud.com/usermanual-ecs/ecs_03_1003.html#section11)”。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ListServerMetricDataRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 查询数据起始时间，UNIX时间戳，单位毫秒。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ListServerMetricDataRequest withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 查询数据截止时间UNIX时间戳，单位毫秒。from必须小于to。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ListServerMetricDataRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 监控数据粒度。 取值范围：  - 1: 实时数据。  - 300: 5分钟粒度。  - 1200: 20分钟粒度。  - 3600: 1小时粒度。  - 14400: 4小时粒度。  - 86400: 1天粒度。
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public ListServerMetricDataRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 数据聚合方式，支持的聚合方式如下:  - average：聚合周期内指标数据的平均值。  - max：聚合周期内指标数据的最大值。  - min：聚合周期内指标数据的最小值。  - sum：聚合周期内指标数据的求和值。  - variance：聚合周期内指标数据的方差。
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServerMetricDataRequest that = (ListServerMetricDataRequest) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.period, that.period)
            && Objects.equals(this.filter, that.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, namespace, metricName, from, to, period, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerMetricDataRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
