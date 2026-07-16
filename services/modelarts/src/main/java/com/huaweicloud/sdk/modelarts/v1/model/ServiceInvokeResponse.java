package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 服务调用时的相关配置。
 */
public class ServiceInvokeResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_access_enable")

    private Boolean internetAccessEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_approval_enable")

    private Boolean intranetApprovalEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamic_routing_enable")

    private Boolean dynamicRoutingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private String strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_api_scheme")

    private String metricApiScheme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_api_port")

    private String metricApiPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_api_path")

    private String metricApiPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ems_enable")

    private Boolean emsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_retry_enable")

    private Boolean requestRetryEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_retry_cnt_max")

    private Integer requestRetryCntMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_retry_interval_ms")

    private Integer requestRetryIntervalMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuse_configs")

    private FuseConfig fuseConfigs;

    public ServiceInvokeResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释：** 服务端口号。 **取值范围：** [1, 65535]。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ServiceInvokeResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释：** 服务请求协议。当选择WSS与WS时，服务接口会升级为WebSocket。开启WebSocket时，不支持同时设置“服务流量限制”。 **取值范围：** - HTTP：HTTP协议。 - HTTPS：HTTPS协议。 - WSS：WebSocket Secure协议。 - WS：WebSocket协议。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ServiceInvokeResponse withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * **参数解释：** 认证类型。 **取值范围：** - TOKEN：IAM Token认证。 - API_KEY：API Key认证。 - NONE：无认证。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public ServiceInvokeResponse withInternetAccessEnable(Boolean internetAccessEnable) {
        this.internetAccessEnable = internetAccessEnable;
        return this;
    }

    /**
     * **参数解释：** 外网访问。 **取值范围：** - TRUE：要外网访问。 - FALSE：不要外网访问。
     * @return internetAccessEnable
     */
    public Boolean getInternetAccessEnable() {
        return internetAccessEnable;
    }

    public void setInternetAccessEnable(Boolean internetAccessEnable) {
        this.internetAccessEnable = internetAccessEnable;
    }

    public ServiceInvokeResponse withIntranetApprovalEnable(Boolean intranetApprovalEnable) {
        this.intranetApprovalEnable = intranetApprovalEnable;
        return this;
    }

    /**
     * **参数解释：** 内网审批。 **取值范围：** - TRUE：要内网审批。 - FALSE：不要内网审批。
     * @return intranetApprovalEnable
     */
    public Boolean getIntranetApprovalEnable() {
        return intranetApprovalEnable;
    }

    public void setIntranetApprovalEnable(Boolean intranetApprovalEnable) {
        this.intranetApprovalEnable = intranetApprovalEnable;
    }

    public ServiceInvokeResponse withDynamicRoutingEnable(Boolean dynamicRoutingEnable) {
        this.dynamicRoutingEnable = dynamicRoutingEnable;
        return this;
    }

    /**
     * **参数解释：** 动态路由开关。 **取值范围：** - TRUE：开启动态路由。 - FALSE：不开启动态路由。
     * @return dynamicRoutingEnable
     */
    public Boolean getDynamicRoutingEnable() {
        return dynamicRoutingEnable;
    }

    public void setDynamicRoutingEnable(Boolean dynamicRoutingEnable) {
        this.dynamicRoutingEnable = dynamicRoutingEnable;
    }

    public ServiceInvokeResponse withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * **参数解释：** 智能路由策略。 **取值范围：** - ROUND_ROBIN：轮询。 - ORIGIN_IP_HASH：源IP哈希。 - MIN_CONN：最小连接数。 - MIN_FIRST_TOKEN_TIME：最小首token时延。 - COMPOSITE：综合负载。 - SLO_BASED：SLO优先级。
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public ServiceInvokeResponse withMetricApiScheme(String metricApiScheme) {
        this.metricApiScheme = metricApiScheme;
        return this;
    }

    /**
     * **参数解释：** 指标接口服务请求协议。 **取值范围：** - HTTP：HTTP协议。 - HTTPS：HTTPS协议。
     * @return metricApiScheme
     */
    public String getMetricApiScheme() {
        return metricApiScheme;
    }

    public void setMetricApiScheme(String metricApiScheme) {
        this.metricApiScheme = metricApiScheme;
    }

    public ServiceInvokeResponse withMetricApiPort(String metricApiPort) {
        this.metricApiPort = metricApiPort;
        return this;
    }

    /**
     * **参数解释：** 指标接口端口号。 **取值范围：** [1, 65535]。
     * @return metricApiPort
     */
    public String getMetricApiPort() {
        return metricApiPort;
    }

    public void setMetricApiPort(String metricApiPort) {
        this.metricApiPort = metricApiPort;
    }

    public ServiceInvokeResponse withMetricApiPath(String metricApiPath) {
        this.metricApiPath = metricApiPath;
        return this;
    }

    /**
     * **参数解释：** 指标接口path。 **取值范围：** 不涉及。
     * @return metricApiPath
     */
    public String getMetricApiPath() {
        return metricApiPath;
    }

    public void setMetricApiPath(String metricApiPath) {
        this.metricApiPath = metricApiPath;
    }

    public ServiceInvokeResponse withEmsEnable(Boolean emsEnable) {
        this.emsEnable = emsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否开启EMS加速。 **取值范围：** - TRUE：开启EMS加速。 - FALSE：不开启EMS加速。
     * @return emsEnable
     */
    public Boolean getEmsEnable() {
        return emsEnable;
    }

    public void setEmsEnable(Boolean emsEnable) {
        this.emsEnable = emsEnable;
    }

    public ServiceInvokeResponse withRequestRetryEnable(Boolean requestRetryEnable) {
        this.requestRetryEnable = requestRetryEnable;
        return this;
    }

    /**
     * **参数解释：** proxy支持请求重调度开关。 **取值范围：** - true：开启proxy支持请求重调度。 - false：不开启proxy支持请求重调度。
     * @return requestRetryEnable
     */
    public Boolean getRequestRetryEnable() {
        return requestRetryEnable;
    }

    public void setRequestRetryEnable(Boolean requestRetryEnable) {
        this.requestRetryEnable = requestRetryEnable;
    }

    public ServiceInvokeResponse withRequestRetryCntMax(Integer requestRetryCntMax) {
        this.requestRetryCntMax = requestRetryCntMax;
        return this;
    }

    /**
     * **参数解释：** proxy支持请求重调度的重试次数 **取值范围：** [1, 10]。
     * @return requestRetryCntMax
     */
    public Integer getRequestRetryCntMax() {
        return requestRetryCntMax;
    }

    public void setRequestRetryCntMax(Integer requestRetryCntMax) {
        this.requestRetryCntMax = requestRetryCntMax;
    }

    public ServiceInvokeResponse withRequestRetryIntervalMs(Integer requestRetryIntervalMs) {
        this.requestRetryIntervalMs = requestRetryIntervalMs;
        return this;
    }

    /**
     * **参数解释：** proxy支持请求重调度的重试间隔，单位ms **取值范围：** [1, 10000]。
     * @return requestRetryIntervalMs
     */
    public Integer getRequestRetryIntervalMs() {
        return requestRetryIntervalMs;
    }

    public void setRequestRetryIntervalMs(Integer requestRetryIntervalMs) {
        this.requestRetryIntervalMs = requestRetryIntervalMs;
    }

    public ServiceInvokeResponse withFuseConfigs(FuseConfig fuseConfigs) {
        this.fuseConfigs = fuseConfigs;
        return this;
    }

    public ServiceInvokeResponse withFuseConfigs(Consumer<FuseConfig> fuseConfigsSetter) {
        if (this.fuseConfigs == null) {
            this.fuseConfigs = new FuseConfig();
            fuseConfigsSetter.accept(this.fuseConfigs);
        }

        return this;
    }

    /**
     * Get fuseConfigs
     * @return fuseConfigs
     */
    public FuseConfig getFuseConfigs() {
        return fuseConfigs;
    }

    public void setFuseConfigs(FuseConfig fuseConfigs) {
        this.fuseConfigs = fuseConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceInvokeResponse that = (ServiceInvokeResponse) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.internetAccessEnable, that.internetAccessEnable)
            && Objects.equals(this.intranetApprovalEnable, that.intranetApprovalEnable)
            && Objects.equals(this.dynamicRoutingEnable, that.dynamicRoutingEnable)
            && Objects.equals(this.strategy, that.strategy)
            && Objects.equals(this.metricApiScheme, that.metricApiScheme)
            && Objects.equals(this.metricApiPort, that.metricApiPort)
            && Objects.equals(this.metricApiPath, that.metricApiPath) && Objects.equals(this.emsEnable, that.emsEnable)
            && Objects.equals(this.requestRetryEnable, that.requestRetryEnable)
            && Objects.equals(this.requestRetryCntMax, that.requestRetryCntMax)
            && Objects.equals(this.requestRetryIntervalMs, that.requestRetryIntervalMs)
            && Objects.equals(this.fuseConfigs, that.fuseConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port,
            protocol,
            authType,
            internetAccessEnable,
            intranetApprovalEnable,
            dynamicRoutingEnable,
            strategy,
            metricApiScheme,
            metricApiPort,
            metricApiPath,
            emsEnable,
            requestRetryEnable,
            requestRetryCntMax,
            requestRetryIntervalMs,
            fuseConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceInvokeResponse {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    internetAccessEnable: ").append(toIndentedString(internetAccessEnable)).append("\n");
        sb.append("    intranetApprovalEnable: ").append(toIndentedString(intranetApprovalEnable)).append("\n");
        sb.append("    dynamicRoutingEnable: ").append(toIndentedString(dynamicRoutingEnable)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    metricApiScheme: ").append(toIndentedString(metricApiScheme)).append("\n");
        sb.append("    metricApiPort: ").append(toIndentedString(metricApiPort)).append("\n");
        sb.append("    metricApiPath: ").append(toIndentedString(metricApiPath)).append("\n");
        sb.append("    emsEnable: ").append(toIndentedString(emsEnable)).append("\n");
        sb.append("    requestRetryEnable: ").append(toIndentedString(requestRetryEnable)).append("\n");
        sb.append("    requestRetryCntMax: ").append(toIndentedString(requestRetryCntMax)).append("\n");
        sb.append("    requestRetryIntervalMs: ").append(toIndentedString(requestRetryIntervalMs)).append("\n");
        sb.append("    fuseConfigs: ").append(toIndentedString(fuseConfigs)).append("\n");
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
