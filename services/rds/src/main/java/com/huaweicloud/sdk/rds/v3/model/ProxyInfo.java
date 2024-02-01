package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库代理信息。
 */
public class ProxyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_threshold_in_seconds")

    private Integer delayThresholdInSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<ProxyInfoNodes> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_info")

    private ProxyInfoFlavorInfo flavorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_split")

    private String transactionSplit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_pool_type")

    private String connectionPoolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_mode")

    private String payMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_mode")

    private String proxyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_name")

    private String dnsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    /**
     * 数据库代理秒级监控状态。
     */
    public static final class SecondsLevelMonitorFunStatusEnum {

        /**
         * Enum OFF for value: "off"
         */
        public static final SecondsLevelMonitorFunStatusEnum OFF = new SecondsLevelMonitorFunStatusEnum("off");

        /**
         * Enum ON for value: "on"
         */
        public static final SecondsLevelMonitorFunStatusEnum ON = new SecondsLevelMonitorFunStatusEnum("on");

        private static final Map<String, SecondsLevelMonitorFunStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SecondsLevelMonitorFunStatusEnum> createStaticFields() {
            Map<String, SecondsLevelMonitorFunStatusEnum> map = new HashMap<>();
            map.put("off", OFF);
            map.put("on", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SecondsLevelMonitorFunStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SecondsLevelMonitorFunStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new SecondsLevelMonitorFunStatusEnum(value));
        }

        public static SecondsLevelMonitorFunStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SecondsLevelMonitorFunStatusEnum) {
                return this.value.equals(((SecondsLevelMonitorFunStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seconds_level_monitor_fun_status")

    private SecondsLevelMonitorFunStatusEnum secondsLevelMonitorFunStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alt_flag")

    private Boolean altFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_read_only")

    private Boolean forceReadOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_mode")

    private Integer routeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_option")

    private Boolean sslOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_balance_route_mode")

    private Boolean supportBalanceRouteMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_proxy_ssl")

    private Boolean supportProxySsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_switch_connection_pool_type")

    private Boolean supportSwitchConnectionPoolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_transaction_split")

    private Boolean supportTransactionSplit;

    public ProxyInfo withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 数据库代理实例ID。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ProxyInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据库代理状态。  取值: NORMAL：表示数据库代理正常。 ENABLING：表示数据库代理正在开启。 DISABLING：表示数据库代理正在关闭。 CHANGING_NODE_NUM：表示数据库代理正在调整节点数量。 SCALING: 表示数据库代理正在规格变更。 UPGRADING: 表示数据库代理正在升级内核版本。 IPMODIFYING: 表示数据库代理正在修改读写分离地址。 RESTARTING: 表示数据库代理正在重启进程。 TRANSACTION_SPLITTING: 表示数据库代理正在变更事务拆分功能状态。 CONNECTION_POOL_SWITCH_OPERATING: 表示数据库代理正在变更会话连接池类型。 PORT_MODIFYING: 表示数据库代理正在修改端口。 PROXY_SSL_SWITCHING: 表示数据库代理正在变更SSL状态。 ALT_SWITCH_OPERATING: 表示数据库代理正在变更ALT状态。 CHANGING_RESOURCES: 表示数据库代理正在进行资源变更。 NORMAL: 表示数据库代理正常。 ABNORMAL: 表示数据库代理异常。 FAILED: 表示数据库代理创建失败。 FROZEN: 表示数据库代理已冻结。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProxyInfo withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 读写分离地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ProxyInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口号。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ProxyInfo withDelayThresholdInSeconds(Integer delayThresholdInSeconds) {
        this.delayThresholdInSeconds = delayThresholdInSeconds;
        return this;
    }

    /**
     * 延时阈值，单位：秒。
     * @return delayThresholdInSeconds
     */
    public Integer getDelayThresholdInSeconds() {
        return delayThresholdInSeconds;
    }

    public void setDelayThresholdInSeconds(Integer delayThresholdInSeconds) {
        this.delayThresholdInSeconds = delayThresholdInSeconds;
    }

    public ProxyInfo withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 数据库代理规格的CPU大小。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ProxyInfo withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 数据库代理规格的内存大小。
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public ProxyInfo withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 数据库代理节点个数。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public ProxyInfo withNodes(List<ProxyInfoNodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ProxyInfo addNodesItem(ProxyInfoNodes nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ProxyInfo withNodes(Consumer<List<ProxyInfoNodes>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 数据库代理节点信息列表。
     * @return nodes
     */
    public List<ProxyInfoNodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<ProxyInfoNodes> nodes) {
        this.nodes = nodes;
    }

    public ProxyInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 数据库代理集群模式。 取值：     Cluster：集群模式     Ha：主备模式
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ProxyInfo withFlavorInfo(ProxyInfoFlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
        return this;
    }

    public ProxyInfo withFlavorInfo(Consumer<ProxyInfoFlavorInfo> flavorInfoSetter) {
        if (this.flavorInfo == null) {
            this.flavorInfo = new ProxyInfoFlavorInfo();
            flavorInfoSetter.accept(this.flavorInfo);
        }

        return this;
    }

    /**
     * Get flavorInfo
     * @return flavorInfo
     */
    public ProxyInfoFlavorInfo getFlavorInfo() {
        return flavorInfo;
    }

    public void setFlavorInfo(ProxyInfoFlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
    }

    public ProxyInfo withTransactionSplit(String transactionSplit) {
        this.transactionSplit = transactionSplit;
        return this;
    }

    /**
     * 数据库代理事务拆分开关状态。  true：开启。  false：关闭。
     * @return transactionSplit
     */
    public String getTransactionSplit() {
        return transactionSplit;
    }

    public void setTransactionSplit(String transactionSplit) {
        this.transactionSplit = transactionSplit;
    }

    public ProxyInfo withConnectionPoolType(String connectionPoolType) {
        this.connectionPoolType = connectionPoolType;
        return this;
    }

    /**
     * 连接池类型。  取值范围:  CLOSED: 关闭连接池。  SESSION: 开启会话级连接池。
     * @return connectionPoolType
     */
    public String getConnectionPoolType() {
        return connectionPoolType;
    }

    public void setConnectionPoolType(String connectionPoolType) {
        this.connectionPoolType = connectionPoolType;
    }

    public ProxyInfo withPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }

    /**
     * 数据库代理计费模式。  取值范围： 0:按需计费 1:包周期计费
     * @return payMode
     */
    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public ProxyInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库代理名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProxyInfo withProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }

    /**
     * 数据库代理读写模式。 取值范围：     readwrite 读写模式     readonly 只读模式
     * @return proxyMode
     */
    public String getProxyMode() {
        return proxyMode;
    }

    public void setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
    }

    public ProxyInfo withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * 数据库代理读写分离地址内网域名。 该字段为空表示未申请读写内网域名。
     * @return dnsName
     */
    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    public ProxyInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 数据库代理实例所属子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ProxyInfo withSecondsLevelMonitorFunStatus(SecondsLevelMonitorFunStatusEnum secondsLevelMonitorFunStatus) {
        this.secondsLevelMonitorFunStatus = secondsLevelMonitorFunStatus;
        return this;
    }

    /**
     * 数据库代理秒级监控状态。
     * @return secondsLevelMonitorFunStatus
     */
    public SecondsLevelMonitorFunStatusEnum getSecondsLevelMonitorFunStatus() {
        return secondsLevelMonitorFunStatus;
    }

    public void setSecondsLevelMonitorFunStatus(SecondsLevelMonitorFunStatusEnum secondsLevelMonitorFunStatus) {
        this.secondsLevelMonitorFunStatus = secondsLevelMonitorFunStatus;
    }

    public ProxyInfo withAltFlag(Boolean altFlag) {
        this.altFlag = altFlag;
        return this;
    }

    /**
     * ALT开关状态。
     * @return altFlag
     */
    public Boolean getAltFlag() {
        return altFlag;
    }

    public void setAltFlag(Boolean altFlag) {
        this.altFlag = altFlag;
    }

    public ProxyInfo withForceReadOnly(Boolean forceReadOnly) {
        this.forceReadOnly = forceReadOnly;
        return this;
    }

    /**
     * 是否强制读路由到只读。
     * @return forceReadOnly
     */
    public Boolean getForceReadOnly() {
        return forceReadOnly;
    }

    public void setForceReadOnly(Boolean forceReadOnly) {
        this.forceReadOnly = forceReadOnly;
    }

    public ProxyInfo withRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
        return this;
    }

    /**
     * 数据库代理路由模式。 取值范围:     0：表示权重负载模式。     1：表示负载均衡模式（数据库主实例不接受读请求）。     2：表示负载均衡模式（数据库主实例接受读请求）。
     * @return routeMode
     */
    public Integer getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
    }

    public ProxyInfo withSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    /**
     * ssl开关状态。
     * @return sslOption
     */
    public Boolean getSslOption() {
        return sslOption;
    }

    public void setSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
    }

    public ProxyInfo withSupportBalanceRouteMode(Boolean supportBalanceRouteMode) {
        this.supportBalanceRouteMode = supportBalanceRouteMode;
        return this;
    }

    /**
     * 数据库代理是否支持开启负载均衡路由模式。
     * @return supportBalanceRouteMode
     */
    public Boolean getSupportBalanceRouteMode() {
        return supportBalanceRouteMode;
    }

    public void setSupportBalanceRouteMode(Boolean supportBalanceRouteMode) {
        this.supportBalanceRouteMode = supportBalanceRouteMode;
    }

    public ProxyInfo withSupportProxySsl(Boolean supportProxySsl) {
        this.supportProxySsl = supportProxySsl;
        return this;
    }

    /**
     * 数据库代理是否支持开启ssl功能。
     * @return supportProxySsl
     */
    public Boolean getSupportProxySsl() {
        return supportProxySsl;
    }

    public void setSupportProxySsl(Boolean supportProxySsl) {
        this.supportProxySsl = supportProxySsl;
    }

    public ProxyInfo withSupportSwitchConnectionPoolType(Boolean supportSwitchConnectionPoolType) {
        this.supportSwitchConnectionPoolType = supportSwitchConnectionPoolType;
        return this;
    }

    /**
     * 数据库代理是否支持切换会话连接池类型。
     * @return supportSwitchConnectionPoolType
     */
    public Boolean getSupportSwitchConnectionPoolType() {
        return supportSwitchConnectionPoolType;
    }

    public void setSupportSwitchConnectionPoolType(Boolean supportSwitchConnectionPoolType) {
        this.supportSwitchConnectionPoolType = supportSwitchConnectionPoolType;
    }

    public ProxyInfo withSupportTransactionSplit(Boolean supportTransactionSplit) {
        this.supportTransactionSplit = supportTransactionSplit;
        return this;
    }

    /**
     * 数据库代理是否支持开启事务拆分。
     * @return supportTransactionSplit
     */
    public Boolean getSupportTransactionSplit() {
        return supportTransactionSplit;
    }

    public void setSupportTransactionSplit(Boolean supportTransactionSplit) {
        this.supportTransactionSplit = supportTransactionSplit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyInfo that = (ProxyInfo) obj;
        return Objects.equals(this.poolId, that.poolId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.address, that.address) && Objects.equals(this.port, that.port)
            && Objects.equals(this.delayThresholdInSeconds, that.delayThresholdInSeconds)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.flavorInfo, that.flavorInfo)
            && Objects.equals(this.transactionSplit, that.transactionSplit)
            && Objects.equals(this.connectionPoolType, that.connectionPoolType)
            && Objects.equals(this.payMode, that.payMode) && Objects.equals(this.name, that.name)
            && Objects.equals(this.proxyMode, that.proxyMode) && Objects.equals(this.dnsName, that.dnsName)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.secondsLevelMonitorFunStatus, that.secondsLevelMonitorFunStatus)
            && Objects.equals(this.altFlag, that.altFlag) && Objects.equals(this.forceReadOnly, that.forceReadOnly)
            && Objects.equals(this.routeMode, that.routeMode) && Objects.equals(this.sslOption, that.sslOption)
            && Objects.equals(this.supportBalanceRouteMode, that.supportBalanceRouteMode)
            && Objects.equals(this.supportProxySsl, that.supportProxySsl)
            && Objects.equals(this.supportSwitchConnectionPoolType, that.supportSwitchConnectionPoolType)
            && Objects.equals(this.supportTransactionSplit, that.supportTransactionSplit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId,
            status,
            address,
            port,
            delayThresholdInSeconds,
            cpu,
            mem,
            nodeNum,
            nodes,
            mode,
            flavorInfo,
            transactionSplit,
            connectionPoolType,
            payMode,
            name,
            proxyMode,
            dnsName,
            subnetId,
            secondsLevelMonitorFunStatus,
            altFlag,
            forceReadOnly,
            routeMode,
            sslOption,
            supportBalanceRouteMode,
            supportProxySsl,
            supportSwitchConnectionPoolType,
            supportTransactionSplit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyInfo {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    delayThresholdInSeconds: ").append(toIndentedString(delayThresholdInSeconds)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    flavorInfo: ").append(toIndentedString(flavorInfo)).append("\n");
        sb.append("    transactionSplit: ").append(toIndentedString(transactionSplit)).append("\n");
        sb.append("    connectionPoolType: ").append(toIndentedString(connectionPoolType)).append("\n");
        sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    proxyMode: ").append(toIndentedString(proxyMode)).append("\n");
        sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    secondsLevelMonitorFunStatus: ")
            .append(toIndentedString(secondsLevelMonitorFunStatus))
            .append("\n");
        sb.append("    altFlag: ").append(toIndentedString(altFlag)).append("\n");
        sb.append("    forceReadOnly: ").append(toIndentedString(forceReadOnly)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
        sb.append("    supportBalanceRouteMode: ").append(toIndentedString(supportBalanceRouteMode)).append("\n");
        sb.append("    supportProxySsl: ").append(toIndentedString(supportProxySsl)).append("\n");
        sb.append("    supportSwitchConnectionPoolType: ")
            .append(toIndentedString(supportSwitchConnectionPoolType))
            .append("\n");
        sb.append("    supportTransactionSplit: ").append(toIndentedString(supportTransactionSplit)).append("\n");
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
