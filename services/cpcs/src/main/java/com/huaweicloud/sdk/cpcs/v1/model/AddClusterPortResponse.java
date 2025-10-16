package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class AddClusterPortResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_id")

    private String elbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_ip")

    private String elbIp;

    /**
     * PROXY：代理模式端口 TUNNEL：隧道模式自定端口 TUNNEL_FIXED：隧道模式的固定隧道端口
     */
    public static final class ModeEnum {

        /**
         * Enum TUNNEL_FIXED for value: "TUNNEL_FIXED"
         */
        public static final ModeEnum TUNNEL_FIXED = new ModeEnum("TUNNEL_FIXED");

        /**
         * Enum TUNNEL for value: "TUNNEL"
         */
        public static final ModeEnum TUNNEL = new ModeEnum("TUNNEL");

        /**
         * Enum PROXY for value: "PROXY"
         */
        public static final ModeEnum PROXY = new ModeEnum("PROXY");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("TUNNEL_FIXED", TUNNEL_FIXED);
            map.put("TUNNEL", TUNNEL);
            map.put("PROXY", PROXY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_port")

    private Integer listenerPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_port")

    private Integer serverGroupPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_time")

    private String validateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wrong")

    private Boolean wrong;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wrong_msg")

    private String wrongMsg;

    public AddClusterPortResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AddClusterPortResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 该端口归属的集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public AddClusterPortResponse withElbId(String elbId) {
        this.elbId = elbId;
        return this;
    }

    /**
     * 租户的elbId
     * @return elbId
     */
    public String getElbId() {
        return elbId;
    }

    public void setElbId(String elbId) {
        this.elbId = elbId;
    }

    public AddClusterPortResponse withElbIp(String elbIp) {
        this.elbIp = elbIp;
        return this;
    }

    /**
     * 租户的elb的ip
     * @return elbIp
     */
    public String getElbIp() {
        return elbIp;
    }

    public void setElbIp(String elbIp) {
        this.elbIp = elbIp;
    }

    public AddClusterPortResponse withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * PROXY：代理模式端口 TUNNEL：隧道模式自定端口 TUNNEL_FIXED：隧道模式的固定隧道端口
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public AddClusterPortResponse withListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    /**
     * elb监听端口
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return listenerPort;
    }

    public void setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
    }

    public AddClusterPortResponse withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * elb监听器id
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public AddClusterPortResponse withServerGroupPort(Integer serverGroupPort) {
        this.serverGroupPort = serverGroupPort;
        return this;
    }

    /**
     * 后端服务组绑定的后端服务器的业务端口
     * @return serverGroupPort
     */
    public Integer getServerGroupPort() {
        return serverGroupPort;
    }

    public void setServerGroupPort(Integer serverGroupPort) {
        this.serverGroupPort = serverGroupPort;
    }

    public AddClusterPortResponse withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 后端服务组id
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public AddClusterPortResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AddClusterPortResponse withValidateTime(String validateTime) {
        this.validateTime = validateTime;
        return this;
    }

    /**
     * 最后验证时间
     * @return validateTime
     */
    public String getValidateTime() {
        return validateTime;
    }

    public void setValidateTime(String validateTime) {
        this.validateTime = validateTime;
    }

    public AddClusterPortResponse withWrong(Boolean wrong) {
        this.wrong = wrong;
        return this;
    }

    /**
     * 资源是否异常。 由于该接口功能是cpcs操作租户的elb。而租户是可以二次操作cpcs创建的端口映射的。cpcs提供了一个检测接口，用以检测cpcs创建的这一套监听端口是否有误。
     * @return wrong
     */
    public Boolean getWrong() {
        return wrong;
    }

    public void setWrong(Boolean wrong) {
        this.wrong = wrong;
    }

    public AddClusterPortResponse withWrongMsg(String wrongMsg) {
        this.wrongMsg = wrongMsg;
        return this;
    }

    /**
     * 若端口有误。即wrong=true时。该字段描述错误的地方
     * @return wrongMsg
     */
    public String getWrongMsg() {
        return wrongMsg;
    }

    public void setWrongMsg(String wrongMsg) {
        this.wrongMsg = wrongMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddClusterPortResponse that = (AddClusterPortResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.elbId, that.elbId) && Objects.equals(this.elbIp, that.elbIp)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.listenerPort, that.listenerPort)
            && Objects.equals(this.listenerId, that.listenerId)
            && Objects.equals(this.serverGroupPort, that.serverGroupPort)
            && Objects.equals(this.serverGroupId, that.serverGroupId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.validateTime, that.validateTime) && Objects.equals(this.wrong, that.wrong)
            && Objects.equals(this.wrongMsg, that.wrongMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            clusterId,
            elbId,
            elbIp,
            mode,
            listenerPort,
            listenerId,
            serverGroupPort,
            serverGroupId,
            projectId,
            validateTime,
            wrong,
            wrongMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddClusterPortResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    elbId: ").append(toIndentedString(elbId)).append("\n");
        sb.append("    elbIp: ").append(toIndentedString(elbIp)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    listenerPort: ").append(toIndentedString(listenerPort)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    serverGroupPort: ").append(toIndentedString(serverGroupPort)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    validateTime: ").append(toIndentedString(validateTime)).append("\n");
        sb.append("    wrong: ").append(toIndentedString(wrong)).append("\n");
        sb.append("    wrongMsg: ").append(toIndentedString(wrongMsg)).append("\n");
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
