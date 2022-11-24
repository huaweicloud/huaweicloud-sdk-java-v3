package com.huaweicloud.sdk.elb.v2.model;

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
 * 后端云服务器组响应体
 */
public class PoolResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancers")

    private List<ResourceList> loadbalancers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<ResourceList> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<ResourceList> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor_id")

    private String healthmonitorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_persistence")

    private SessionPersistence sessionPersistence;

    /**
     * 后端云服务器组的后端协议。
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

    private ProtocolEnum protocol;

    /**
     * 后端云服务器组的负载均衡算法，取值：ROUND_ROBIN：加权轮询算法；LEAST_CONNECTIONS：加权最少连接算法；SOURCE_IP：源IP算法。当该字段的取值为SOURCE_IP时，后端云服务器组绑定的后端云服务器的weight字段无效。
     */
    public static final class LbAlgorithmEnum {

        /**
         * Enum ROUND_ROBIN for value: "ROUND_ROBIN"
         */
        public static final LbAlgorithmEnum ROUND_ROBIN = new LbAlgorithmEnum("ROUND_ROBIN");

        /**
         * Enum LEAST_CONNECTIONS for value: "LEAST_CONNECTIONS"
         */
        public static final LbAlgorithmEnum LEAST_CONNECTIONS = new LbAlgorithmEnum("LEAST_CONNECTIONS");

        /**
         * Enum SOURCE_IP for value: "SOURCE_IP"
         */
        public static final LbAlgorithmEnum SOURCE_IP = new LbAlgorithmEnum("SOURCE_IP");

        private static final Map<String, LbAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LbAlgorithmEnum> createStaticFields() {
            Map<String, LbAlgorithmEnum> map = new HashMap<>();
            map.put("ROUND_ROBIN", ROUND_ROBIN);
            map.put("LEAST_CONNECTIONS", LEAST_CONNECTIONS);
            map.put("SOURCE_IP", SOURCE_IP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LbAlgorithmEnum(String value) {
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
        public static LbAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LbAlgorithmEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LbAlgorithmEnum(value);
            }
            return result;
        }

        public static LbAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LbAlgorithmEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LbAlgorithmEnum) {
                return this.value.equals(((LbAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    private LbAlgorithmEnum lbAlgorithm;

    public PoolResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 后端云服务器组的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PoolResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 后端云服务器组所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PoolResp withTenantId(String tenantId) {
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

    public PoolResp withName(String name) {
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

    public PoolResp withDescription(String description) {
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

    public PoolResp withAdminStateUp(Boolean adminStateUp) {
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

    public PoolResp withLoadbalancers(List<ResourceList> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }

    public PoolResp addLoadbalancersItem(ResourceList loadbalancersItem) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        this.loadbalancers.add(loadbalancersItem);
        return this;
    }

    public PoolResp withLoadbalancers(Consumer<List<ResourceList>> loadbalancersSetter) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        loadbalancersSetter.accept(this.loadbalancers);
        return this;
    }

    /**
     * 后端云服务器组绑定的负载均衡器ID的列表。
     * @return loadbalancers
     */
    public List<ResourceList> getLoadbalancers() {
        return loadbalancers;
    }

    public void setLoadbalancers(List<ResourceList> loadbalancers) {
        this.loadbalancers = loadbalancers;
    }

    public PoolResp withListeners(List<ResourceList> listeners) {
        this.listeners = listeners;
        return this;
    }

    public PoolResp addListenersItem(ResourceList listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public PoolResp withListeners(Consumer<List<ResourceList>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 后端云服务器组关联的监听器ID的列表。
     * @return listeners
     */
    public List<ResourceList> getListeners() {
        return listeners;
    }

    public void setListeners(List<ResourceList> listeners) {
        this.listeners = listeners;
    }

    public PoolResp withMembers(List<ResourceList> members) {
        this.members = members;
        return this;
    }

    public PoolResp addMembersItem(ResourceList membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public PoolResp withMembers(Consumer<List<ResourceList>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 后端云服务器组关联的后端云服务器ID的列表。
     * @return members
     */
    public List<ResourceList> getMembers() {
        return members;
    }

    public void setMembers(List<ResourceList> members) {
        this.members = members;
    }

    public PoolResp withHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
        return this;
    }

    /**
     * 后端云服务器组关联的健康检查的ID。
     * @return healthmonitorId
     */
    public String getHealthmonitorId() {
        return healthmonitorId;
    }

    public void setHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
    }

    public PoolResp withSessionPersistence(SessionPersistence sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
        return this;
    }

    public PoolResp withSessionPersistence(Consumer<SessionPersistence> sessionPersistenceSetter) {
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

    public PoolResp withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 后端云服务器组的后端协议。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public PoolResp withLbAlgorithm(LbAlgorithmEnum lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    /**
     * 后端云服务器组的负载均衡算法，取值：ROUND_ROBIN：加权轮询算法；LEAST_CONNECTIONS：加权最少连接算法；SOURCE_IP：源IP算法。当该字段的取值为SOURCE_IP时，后端云服务器组绑定的后端云服务器的weight字段无效。
     * @return lbAlgorithm
     */
    public LbAlgorithmEnum getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(LbAlgorithmEnum lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PoolResp poolResp = (PoolResp) o;
        return Objects.equals(this.id, poolResp.id) && Objects.equals(this.projectId, poolResp.projectId)
            && Objects.equals(this.tenantId, poolResp.tenantId) && Objects.equals(this.name, poolResp.name)
            && Objects.equals(this.description, poolResp.description)
            && Objects.equals(this.adminStateUp, poolResp.adminStateUp)
            && Objects.equals(this.loadbalancers, poolResp.loadbalancers)
            && Objects.equals(this.listeners, poolResp.listeners) && Objects.equals(this.members, poolResp.members)
            && Objects.equals(this.healthmonitorId, poolResp.healthmonitorId)
            && Objects.equals(this.sessionPersistence, poolResp.sessionPersistence)
            && Objects.equals(this.protocol, poolResp.protocol)
            && Objects.equals(this.lbAlgorithm, poolResp.lbAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            tenantId,
            name,
            description,
            adminStateUp,
            loadbalancers,
            listeners,
            members,
            healthmonitorId,
            sessionPersistence,
            protocol,
            lbAlgorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    healthmonitorId: ").append(toIndentedString(healthmonitorId)).append("\n");
        sb.append("    sessionPersistence: ").append(toIndentedString(sessionPersistence)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
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
