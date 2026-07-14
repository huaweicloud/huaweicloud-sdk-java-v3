package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 指标采集配置。
 */
public class Metrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheme")

    private String scheme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics_source")

    private String metricsSource;

    public Metrics withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * **参数解释：** 指标采集地址，支持IP地址、域名或localhost。 **取值范围：** 不涉及。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Metrics withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 指标采集路径。 **取值范围：** 不涉及
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Metrics withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释：** 指标采集端口。 **取值范围：** 1~65535。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Metrics withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * **参数解释：** 指标采集协议。 **取值范围：** - HTTP。 - HTTPS。
     * @return scheme
     */
    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public Metrics withMetricsSource(String metricsSource) {
        this.metricsSource = metricsSource;
        return this;
    }

    /**
     * **参数解释：** 指标来源类型。 **取值范围：** - CONTAINER表示容器内。 - OTHERS表示外部其他地址。 **约束限制：** 不涉及。 **默认取值：** CONTAINER。
     * @return metricsSource
     */
    public String getMetricsSource() {
        return metricsSource;
    }

    public void setMetricsSource(String metricsSource) {
        this.metricsSource = metricsSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metrics that = (Metrics) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.path, that.path)
            && Objects.equals(this.port, that.port) && Objects.equals(this.scheme, that.scheme)
            && Objects.equals(this.metricsSource, that.metricsSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, path, port, scheme, metricsSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metrics {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
        sb.append("    metricsSource: ").append(toIndentedString(metricsSource)).append("\n");
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
