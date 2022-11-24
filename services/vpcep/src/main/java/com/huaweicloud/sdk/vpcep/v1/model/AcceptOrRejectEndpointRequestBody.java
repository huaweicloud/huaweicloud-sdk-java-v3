package com.huaweicloud.sdk.vpcep.v1.model;

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
 * 连接终端节点列表请求结构体
 */
public class AcceptOrRejectEndpointRequestBody {

    /**
     * 允许或拒绝连接。 ● receive：允许连接。 ● reject：拒绝连接。
     */
    public static final class ActionEnum {

        /**
         * Enum RECEIVE for value: "receive"
         */
        public static final ActionEnum RECEIVE = new ActionEnum("receive");

        /**
         * Enum REJECT for value: "reject"
         */
        public static final ActionEnum REJECT = new ActionEnum("reject");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("receive", RECEIVE);
            map.put("reject", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<String> endpoints = null;

    public AcceptOrRejectEndpointRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 允许或拒绝连接。 ● receive：允许连接。 ● reject：拒绝连接。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public AcceptOrRejectEndpointRequestBody withEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public AcceptOrRejectEndpointRequestBody addEndpointsItem(String endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public AcceptOrRejectEndpointRequestBody withEndpoints(Consumer<List<String>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 终端节点ID列表。 每次请求目前支持单条endpoint的接受或拒绝。
     * @return endpoints
     */
    public List<String> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AcceptOrRejectEndpointRequestBody acceptOrRejectEndpointRequestBody = (AcceptOrRejectEndpointRequestBody) o;
        return Objects.equals(this.action, acceptOrRejectEndpointRequestBody.action)
            && Objects.equals(this.endpoints, acceptOrRejectEndpointRequestBody.endpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, endpoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptOrRejectEndpointRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
