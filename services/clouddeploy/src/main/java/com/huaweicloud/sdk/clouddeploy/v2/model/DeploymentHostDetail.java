package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主机信息详情
 */
public class DeploymentHostDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    @JacksonXmlProperty(localName = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    @JacksonXmlProperty(localName = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    @JacksonXmlProperty(localName = "port")

    private Integer port;

    /**
     * 操作系统：windows|linux，需要和主机组保持一致
     */
    public static final class OsEnum {

        /**
         * Enum WINDOWS for value: "windows"
         */
        public static final OsEnum WINDOWS = new OsEnum("windows");

        /**
         * Enum LINUX for value: "linux"
         */
        public static final OsEnum LINUX = new OsEnum("linux");

        private static final Map<String, OsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEnum> createStaticFields() {
            Map<String, OsEnum> map = new HashMap<>();
            map.put("windows", WINDOWS);
            map.put("linux", LINUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsEnum(String value) {
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
        public static OsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsEnum(value);
            }
            return result;
        }

        public static OsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsEnum) {
                return this.value.equals(((OsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    @JacksonXmlProperty(localName = "os")

    private OsEnum os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "as_proxy")

    @JacksonXmlProperty(localName = "as_proxy")

    private Boolean asProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_host_id")

    @JacksonXmlProperty(localName = "proxy_host_id")

    private String proxyHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    @JacksonXmlProperty(localName = "authorization")

    private DeploymentHostAuthorizationBody authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_icagent")

    @JacksonXmlProperty(localName = "install_icagent")

    private Boolean installIcagent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    @JacksonXmlProperty(localName = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_host")

    @JacksonXmlProperty(localName = "proxy_host")

    private DeploymentHostDetail proxyHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    @JacksonXmlProperty(localName = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    @JacksonXmlProperty(localName = "permission")

    private PermissionHostDetail permission;

    public DeploymentHostDetail withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 主机组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DeploymentHostDetail withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public DeploymentHostDetail withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * IP，请输入弹性ip格式：161.17.101.12
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public DeploymentHostDetail withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * ssh端口，如：22
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public DeploymentHostDetail withOs(OsEnum os) {
        this.os = os;
        return this;
    }

    /**
     * 操作系统：windows|linux，需要和主机组保持一致
     * @return os
     */
    public OsEnum getOs() {
        return os;
    }

    public void setOs(OsEnum os) {
        this.os = os;
    }

    public DeploymentHostDetail withAsProxy(Boolean asProxy) {
        this.asProxy = asProxy;
        return this;
    }

    /**
     * 是否为代理机
     * @return asProxy
     */
    public Boolean getAsProxy() {
        return asProxy;
    }

    public void setAsProxy(Boolean asProxy) {
        this.asProxy = asProxy;
    }

    public DeploymentHostDetail withProxyHostId(String proxyHostId) {
        this.proxyHostId = proxyHostId;
        return this;
    }

    /**
     * 代理机id
     * @return proxyHostId
     */
    public String getProxyHostId() {
        return proxyHostId;
    }

    public void setProxyHostId(String proxyHostId) {
        this.proxyHostId = proxyHostId;
    }

    public DeploymentHostDetail withAuthorization(DeploymentHostAuthorizationBody authorization) {
        this.authorization = authorization;
        return this;
    }

    public DeploymentHostDetail withAuthorization(Consumer<DeploymentHostAuthorizationBody> authorizationSetter) {
        if (this.authorization == null) {
            this.authorization = new DeploymentHostAuthorizationBody();
            authorizationSetter.accept(this.authorization);
        }

        return this;
    }

    /**
     * Get authorization
     * @return authorization
     */
    public DeploymentHostAuthorizationBody getAuthorization() {
        return authorization;
    }

    public void setAuthorization(DeploymentHostAuthorizationBody authorization) {
        this.authorization = authorization;
    }

    public DeploymentHostDetail withInstallIcagent(Boolean installIcagent) {
        this.installIcagent = installIcagent;
        return this;
    }

    /**
     * 免费启用应用运维服务（AOM），提供指标监控、日志查询、告警功能（自动安装数据采集器 ICAgent，仅支持华为云linux主机）
     * @return installIcagent
     */
    public Boolean getInstallIcagent() {
        return installIcagent;
    }

    public void setInstallIcagent(Boolean installIcagent) {
        this.installIcagent = installIcagent;
    }

    public DeploymentHostDetail withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public DeploymentHostDetail withProxyHost(DeploymentHostDetail proxyHost) {
        this.proxyHost = proxyHost;
        return this;
    }

    public DeploymentHostDetail withProxyHost(Consumer<DeploymentHostDetail> proxyHostSetter) {
        if (this.proxyHost == null) {
            this.proxyHost = new DeploymentHostDetail();
            proxyHostSetter.accept(this.proxyHost);
        }

        return this;
    }

    /**
     * Get proxyHost
     * @return proxyHost
     */
    public DeploymentHostDetail getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(DeploymentHostDetail proxyHost) {
        this.proxyHost = proxyHost;
    }

    public DeploymentHostDetail withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 主机组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public DeploymentHostDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DeploymentHostDetail withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * devcloud项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public DeploymentHostDetail withPermission(PermissionHostDetail permission) {
        this.permission = permission;
        return this;
    }

    public DeploymentHostDetail withPermission(Consumer<PermissionHostDetail> permissionSetter) {
        if (this.permission == null) {
            this.permission = new PermissionHostDetail();
            permissionSetter.accept(this.permission);
        }

        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    public PermissionHostDetail getPermission() {
        return permission;
    }

    public void setPermission(PermissionHostDetail permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentHostDetail deploymentHostDetail = (DeploymentHostDetail) o;
        return Objects.equals(this.groupId, deploymentHostDetail.groupId)
            && Objects.equals(this.hostName, deploymentHostDetail.hostName)
            && Objects.equals(this.ip, deploymentHostDetail.ip) && Objects.equals(this.port, deploymentHostDetail.port)
            && Objects.equals(this.os, deploymentHostDetail.os)
            && Objects.equals(this.asProxy, deploymentHostDetail.asProxy)
            && Objects.equals(this.proxyHostId, deploymentHostDetail.proxyHostId)
            && Objects.equals(this.authorization, deploymentHostDetail.authorization)
            && Objects.equals(this.installIcagent, deploymentHostDetail.installIcagent)
            && Objects.equals(this.hostId, deploymentHostDetail.hostId)
            && Objects.equals(this.proxyHost, deploymentHostDetail.proxyHost)
            && Objects.equals(this.groupName, deploymentHostDetail.groupName)
            && Objects.equals(this.projectId, deploymentHostDetail.projectId)
            && Objects.equals(this.projectName, deploymentHostDetail.projectName)
            && Objects.equals(this.permission, deploymentHostDetail.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            hostName,
            ip,
            port,
            os,
            asProxy,
            proxyHostId,
            authorization,
            installIcagent,
            hostId,
            proxyHost,
            groupName,
            projectId,
            projectName,
            permission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentHostDetail {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    asProxy: ").append(toIndentedString(asProxy)).append("\n");
        sb.append("    proxyHostId: ").append(toIndentedString(proxyHostId)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    installIcagent: ").append(toIndentedString(installIcagent)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
