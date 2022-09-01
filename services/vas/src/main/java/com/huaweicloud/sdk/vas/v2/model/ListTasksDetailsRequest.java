package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTasksDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    @JacksonXmlProperty(localName = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    @JacksonXmlProperty(localName = "service_version")

    private String serviceVersion;

    /**
     * 目标服务作业的状态，分别为PENDING（等待中），RECOVERING（恢复中），STARTING（启动中），UPGRADING（升级中），CREATE_FAILED（创建失败），START_FAILED（启动失败），RUNNING（运行中），STOPPING（停止中），STOPPED（已停止），ABNORMAL（异常），SUCCEEDED（运行成功），FAILED（运行失败），DELETING（删除中），FREEZING（冻结中），FROZEN（已冻结）
     */
    public static final class StateEnum {

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final StateEnum PENDING = new StateEnum("PENDING");

        /**
         * Enum RECOVERING for value: "RECOVERING"
         */
        public static final StateEnum RECOVERING = new StateEnum("RECOVERING");

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StateEnum STARTING = new StateEnum("STARTING");

        /**
         * Enum UPGRADING for value: "UPGRADING"
         */
        public static final StateEnum UPGRADING = new StateEnum("UPGRADING");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StateEnum CREATE_FAILED = new StateEnum("CREATE_FAILED");

        /**
         * Enum START_FAILED for value: "START_FAILED"
         */
        public static final StateEnum START_FAILED = new StateEnum("START_FAILED");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final StateEnum STOPPING = new StateEnum("STOPPING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StateEnum STOPPED = new StateEnum("STOPPED");

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final StateEnum ABNORMAL = new StateEnum("ABNORMAL");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StateEnum SUCCEEDED = new StateEnum("SUCCEEDED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StateEnum DELETING = new StateEnum("DELETING");

        /**
         * Enum FREEZING for value: "FREEZING"
         */
        public static final StateEnum FREEZING = new StateEnum("FREEZING");

        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StateEnum FROZEN = new StateEnum("FROZEN");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("PENDING", PENDING);
            map.put("RECOVERING", RECOVERING);
            map.put("STARTING", STARTING);
            map.put("UPGRADING", UPGRADING);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("START_FAILED", START_FAILED);
            map.put("RUNNING", RUNNING);
            map.put("STOPPING", STOPPING);
            map.put("STOPPED", STOPPED);
            map.put("ABNORMAL", ABNORMAL);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("FAILED", FAILED);
            map.put("DELETING", DELETING);
            map.put("FREEZING", FREEZING);
            map.put("FROZEN", FROZEN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_like")

    @JacksonXmlProperty(localName = "name_like")

    private String nameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_like")

    @JacksonXmlProperty(localName = "id_like")

    private String idLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_since")

    @JacksonXmlProperty(localName = "created_since")

    private Long createdSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_until")

    @JacksonXmlProperty(localName = "created_until")

    private Long createdUntil;

    /**
     * 展示服务作业时的排序字段和顺序，分别为name:ASC（按名称顺序排序），name:DESC（按名称倒序排序），created_at:ASC（按创建时间正序排序），created_at:DESC（按创建时间倒序排序），updated_at:ASC（按更新时间正序排序），updated_at:DESC（按更新时间倒序排序）
     */
    public static final class OrderEnum {

        /**
         * Enum NAME_ASC for value: "name:ASC"
         */
        public static final OrderEnum NAME_ASC = new OrderEnum("name:ASC");

        /**
         * Enum NAME_DESC for value: "name:DESC"
         */
        public static final OrderEnum NAME_DESC = new OrderEnum("name:DESC");

        /**
         * Enum CREATED_AT_ASC for value: "created_at:ASC"
         */
        public static final OrderEnum CREATED_AT_ASC = new OrderEnum("created_at:ASC");

        /**
         * Enum CREATED_AT_DESC for value: "created_at:DESC"
         */
        public static final OrderEnum CREATED_AT_DESC = new OrderEnum("created_at:DESC");

        /**
         * Enum UPDATED_AT_ASC for value: "updated_at:ASC"
         */
        public static final OrderEnum UPDATED_AT_ASC = new OrderEnum("updated_at:ASC");

        /**
         * Enum UPDATED_AT_DESC for value: "updated_at:DESC"
         */
        public static final OrderEnum UPDATED_AT_DESC = new OrderEnum("updated_at:DESC");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("name:ASC", NAME_ASC);
            map.put("name:DESC", NAME_DESC);
            map.put("created_at:ASC", CREATED_AT_ASC);
            map.put("created_at:DESC", CREATED_AT_DESC);
            map.put("updated_at:ASC", UPDATED_AT_ASC);
            map.put("updated_at:DESC", UPDATED_AT_DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
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
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OrderEnum(value);
            }
            return result;
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    @JacksonXmlProperty(localName = "order")

    private OrderEnum order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ListTasksDetailsRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ListTasksDetailsRequest withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * 目标服务作业对应的服务版本号
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public ListTasksDetailsRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 目标服务作业的状态，分别为PENDING（等待中），RECOVERING（恢复中），STARTING（启动中），UPGRADING（升级中），CREATE_FAILED（创建失败），START_FAILED（启动失败），RUNNING（运行中），STOPPING（停止中），STOPPED（已停止），ABNORMAL（异常），SUCCEEDED（运行成功），FAILED（运行失败），DELETING（删除中），FREEZING（冻结中），FROZEN（已冻结）
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ListTasksDetailsRequest withNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    /**
     * 目标服务作业的名称，支持模糊匹配
     * @return nameLike
     */
    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public ListTasksDetailsRequest withIdLike(String idLike) {
        this.idLike = idLike;
        return this;
    }

    /**
     * 目标服务作业的ID，支持模糊匹配
     * @return idLike
     */
    public String getIdLike() {
        return idLike;
    }

    public void setIdLike(String idLike) {
        this.idLike = idLike;
    }

    public ListTasksDetailsRequest withCreatedSince(Long createdSince) {
        this.createdSince = createdSince;
        return this;
    }

    /**
     * 目标服务作业的创建起始时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createdSince
     */
    public Long getCreatedSince() {
        return createdSince;
    }

    public void setCreatedSince(Long createdSince) {
        this.createdSince = createdSince;
    }

    public ListTasksDetailsRequest withCreatedUntil(Long createdUntil) {
        this.createdUntil = createdUntil;
        return this;
    }

    /**
     * 目标服务作业的创建截止时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createdUntil
     */
    public Long getCreatedUntil() {
        return createdUntil;
    }

    public void setCreatedUntil(Long createdUntil) {
        this.createdUntil = createdUntil;
    }

    public ListTasksDetailsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 展示服务作业时的排序字段和顺序，分别为name:ASC（按名称顺序排序），name:DESC（按名称倒序排序），created_at:ASC（按创建时间正序排序），created_at:DESC（按创建时间倒序排序），updated_at:ASC（按更新时间正序排序），updated_at:DESC（按更新时间倒序排序）
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public ListTasksDetailsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 首个展示的服务作业的偏移量
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTasksDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 展示服务作业的数量
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTasksDetailsRequest listTasksDetailsRequest = (ListTasksDetailsRequest) o;
        return Objects.equals(this.serviceName, listTasksDetailsRequest.serviceName)
            && Objects.equals(this.serviceVersion, listTasksDetailsRequest.serviceVersion)
            && Objects.equals(this.state, listTasksDetailsRequest.state)
            && Objects.equals(this.nameLike, listTasksDetailsRequest.nameLike)
            && Objects.equals(this.idLike, listTasksDetailsRequest.idLike)
            && Objects.equals(this.createdSince, listTasksDetailsRequest.createdSince)
            && Objects.equals(this.createdUntil, listTasksDetailsRequest.createdUntil)
            && Objects.equals(this.order, listTasksDetailsRequest.order)
            && Objects.equals(this.offset, listTasksDetailsRequest.offset)
            && Objects.equals(this.limit, listTasksDetailsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName,
            serviceVersion,
            state,
            nameLike,
            idLike,
            createdSince,
            createdUntil,
            order,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksDetailsRequest {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
        sb.append("    idLike: ").append(toIndentedString(idLike)).append("\n");
        sb.append("    createdSince: ").append(toIndentedString(createdSince)).append("\n");
        sb.append("    createdUntil: ").append(toIndentedString(createdUntil)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
