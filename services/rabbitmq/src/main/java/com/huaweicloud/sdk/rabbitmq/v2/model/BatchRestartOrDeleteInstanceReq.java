package com.huaweicloud.sdk.rabbitmq.v2.model;

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
 * BatchRestartOrDeleteInstanceReq
 */
public class BatchRestartOrDeleteInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<String> instances = null;

    /**
    * 对实例的操作：restart、delete
    */
    public static final class ActionEnum {

        /**
         * Enum RESTART for value: "restart"
         */
        public static final ActionEnum RESTART = new ActionEnum("restart");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final ActionEnum DELETE = new ActionEnum("delete");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("restart", RESTART);
            map.put("delete", DELETE);
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

    /**
     * 是否批量删除创建失败的实例。  当参数值为“rabbitmq”时，删除租户所有创建失败的实例，此时请求参数instances可为空。
     */
    public static final class AllFailureEnum {

        /**
         * Enum RABBITMQ for value: "rabbitmq"
         */
        public static final AllFailureEnum RABBITMQ = new AllFailureEnum("rabbitmq");

        private static final Map<String, AllFailureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AllFailureEnum> createStaticFields() {
            Map<String, AllFailureEnum> map = new HashMap<>();
            map.put("rabbitmq", RABBITMQ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AllFailureEnum(String value) {
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
        public static AllFailureEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AllFailureEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AllFailureEnum(value);
            }
            return result;
        }

        public static AllFailureEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AllFailureEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AllFailureEnum) {
                return this.value.equals(((AllFailureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_failure")

    private AllFailureEnum allFailure;

    public BatchRestartOrDeleteInstanceReq withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    public BatchRestartOrDeleteInstanceReq addInstancesItem(String instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public BatchRestartOrDeleteInstanceReq withInstances(Consumer<List<String>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例的ID列表。
     * @return instances
     */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public BatchRestartOrDeleteInstanceReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 对实例的操作：restart、delete
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public BatchRestartOrDeleteInstanceReq withAllFailure(AllFailureEnum allFailure) {
        this.allFailure = allFailure;
        return this;
    }

    /**
     * 是否批量删除创建失败的实例。  当参数值为“rabbitmq”时，删除租户所有创建失败的实例，此时请求参数instances可为空。
     * @return allFailure
     */
    public AllFailureEnum getAllFailure() {
        return allFailure;
    }

    public void setAllFailure(AllFailureEnum allFailure) {
        this.allFailure = allFailure;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchRestartOrDeleteInstanceReq batchRestartOrDeleteInstanceReq = (BatchRestartOrDeleteInstanceReq) o;
        return Objects.equals(this.instances, batchRestartOrDeleteInstanceReq.instances)
            && Objects.equals(this.action, batchRestartOrDeleteInstanceReq.action)
            && Objects.equals(this.allFailure, batchRestartOrDeleteInstanceReq.allFailure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, action, allFailure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRestartOrDeleteInstanceReq {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    allFailure: ").append(toIndentedString(allFailure)).append("\n");
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
