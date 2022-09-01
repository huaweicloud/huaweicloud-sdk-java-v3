package com.huaweicloud.sdk.elb.v2.model;

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
 * 创建后端云服务器组的请求体
 */
public class CreatePoolReq {

    /**
     * 后端云服务器组的后端协议。取值：UDP、TCP、HTTP。当指定istener_id创建后端云服务器组时，后端云服务器组的protocol和它关联的监听器的protocol有如下关系：监听器的protocol为TCP时，后端云服务器组的protocol必须为TCP。监听器的protocol为UDP时，后端云服务器组的protocol必须为UDP。监听器的protocol为HTTP或TERMINATED_HTTPS时，后端云服务器组的protocol必须为HTTP。
     */
    public static final class ProtocolEnum {

        /**
         * Enum UDP for value: "UDP"
         */
        public static final ProtocolEnum UDP = new ProtocolEnum("UDP");

        /**
         * Enum TCP for value: "TCP"
         */
        public static final ProtocolEnum TCP = new ProtocolEnum("TCP");

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("UDP", UDP);
            map.put("TCP", TCP);
            map.put("HTTP", HTTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    @JacksonXmlProperty(localName = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    @JacksonXmlProperty(localName = "lb_algorithm")

    private String lbAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    @JacksonXmlProperty(localName = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    @JacksonXmlProperty(localName = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    @JacksonXmlProperty(localName = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    @JacksonXmlProperty(localName = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_persistence")

    @JacksonXmlProperty(localName = "session_persistence")

    private SessionPersistence sessionPersistence;

    public CreatePoolReq withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 后端云服务器组的后端协议。取值：UDP、TCP、HTTP。当指定istener_id创建后端云服务器组时，后端云服务器组的protocol和它关联的监听器的protocol有如下关系：监听器的protocol为TCP时，后端云服务器组的protocol必须为TCP。监听器的protocol为UDP时，后端云服务器组的protocol必须为UDP。监听器的protocol为HTTP或TERMINATED_HTTPS时，后端云服务器组的protocol必须为HTTP。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public CreatePoolReq withLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    /**
     * 后端云服务器组的负载均衡算法，取值：ROUND_ROBIN：加权轮询算法；LEAST_CONNECTIONS：加权最少连接算法；SOURCE_IP：源IP算法；当该字段的取值为SOURCE_IP时，后端云服务器组绑定的后端云服务器的weight字段无效。
     * @return lbAlgorithm
     */
    public String getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public CreatePoolReq withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 后端云服务器组关联的负载均衡器ID。listener_id和loadbalancer_id中至少指定一个。
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CreatePoolReq withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 后端云服务器组关联的监听器的ID。listener_id和loadbalancer_id中至少指定一个。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreatePoolReq withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 后端云服务器组所在的项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreatePoolReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 后端云服务器组的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePoolReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 后端云服务器组的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePoolReq withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 后端云服务器组的管理状态。只支持设定为true，该字段的值无实际意义。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreatePoolReq withSessionPersistence(SessionPersistence sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
        return this;
    }

    public CreatePoolReq withSessionPersistence(Consumer<SessionPersistence> sessionPersistenceSetter) {
        if (this.sessionPersistence == null) {
            this.sessionPersistence = new SessionPersistence();
            sessionPersistenceSetter.accept(this.sessionPersistence);
        }

        return this;
    }

    /**
     * Get sessionPersistence
     * @return sessionPersistence
     */
    public SessionPersistence getSessionPersistence() {
        return sessionPersistence;
    }

    public void setSessionPersistence(SessionPersistence sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePoolReq createPoolReq = (CreatePoolReq) o;
        return Objects.equals(this.protocol, createPoolReq.protocol)
            && Objects.equals(this.lbAlgorithm, createPoolReq.lbAlgorithm)
            && Objects.equals(this.loadbalancerId, createPoolReq.loadbalancerId)
            && Objects.equals(this.listenerId, createPoolReq.listenerId)
            && Objects.equals(this.tenantId, createPoolReq.tenantId) && Objects.equals(this.name, createPoolReq.name)
            && Objects.equals(this.description, createPoolReq.description)
            && Objects.equals(this.adminStateUp, createPoolReq.adminStateUp)
            && Objects.equals(this.sessionPersistence, createPoolReq.sessionPersistence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol,
            lbAlgorithm,
            loadbalancerId,
            listenerId,
            tenantId,
            name,
            description,
            adminStateUp,
            sessionPersistence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolReq {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    sessionPersistence: ").append(toIndentedString(sessionPersistence)).append("\n");
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
