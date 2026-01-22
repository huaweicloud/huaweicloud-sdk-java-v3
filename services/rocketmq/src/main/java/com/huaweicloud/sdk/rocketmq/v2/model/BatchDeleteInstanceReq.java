package com.huaweicloud.sdk.rocketmq.v2.model;

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
 * BatchDeleteInstanceReq
 */
public class BatchDeleteInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<String> instances = null;

    /**
     * **参数解释**： 对实例的操作：delete。 **约束限制**： 不涉及。 **取值范围**：  - delete **默认取值**： 不涉及
     */
    public static final class ActionEnum {

        /**
         * Enum DELETE for value: "delete"
         */
        public static final ActionEnum DELETE = new ActionEnum("delete");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
     * **参数解释**： 参数值为reliability，表示删除租户所有创建失败的RocketMQ实例。 **约束限制**： 不涉及。 **取值范围**： - reliability **默认取值**： 不涉及。
     */
    public static final class AllFailureEnum {

        /**
         * Enum RELIABILITY for value: "reliability"
         */
        public static final AllFailureEnum RELIABILITY = new AllFailureEnum("reliability");

        private static final Map<String, AllFailureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AllFailureEnum> createStaticFields() {
            Map<String, AllFailureEnum> map = new HashMap<>();
            map.put("reliability", RELIABILITY);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AllFailureEnum(value));
        }

        public static AllFailureEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_delete")

    private Boolean forceDelete;

    public BatchDeleteInstanceReq withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    public BatchDeleteInstanceReq addInstancesItem(String instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public BatchDeleteInstanceReq withInstances(Consumer<List<String>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释**： 实例的ID列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instances
     */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public BatchDeleteInstanceReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 对实例的操作：delete。 **约束限制**： 不涉及。 **取值范围**：  - delete **默认取值**： 不涉及
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public BatchDeleteInstanceReq withAllFailure(AllFailureEnum allFailure) {
        this.allFailure = allFailure;
        return this;
    }

    /**
     * **参数解释**： 参数值为reliability，表示删除租户所有创建失败的RocketMQ实例。 **约束限制**： 不涉及。 **取值范围**： - reliability **默认取值**： 不涉及。
     * @return allFailure
     */
    public AllFailureEnum getAllFailure() {
        return allFailure;
    }

    public void setAllFailure(AllFailureEnum allFailure) {
        this.allFailure = allFailure;
    }

    public BatchDeleteInstanceReq withForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }

    /**
     * **参数解释**： 是否强删除。 **约束限制**： 不涉及。 **取值范围**： - true：强删除，强删除实例不进入回收站。 - false：弱删除，开启回收站功能后，实例进入回收站。 **默认取值**： 不涉及。
     * @return forceDelete
     */
    public Boolean getForceDelete() {
        return forceDelete;
    }

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteInstanceReq that = (BatchDeleteInstanceReq) obj;
        return Objects.equals(this.instances, that.instances) && Objects.equals(this.action, that.action)
            && Objects.equals(this.allFailure, that.allFailure) && Objects.equals(this.forceDelete, that.forceDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, action, allFailure, forceDelete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteInstanceReq {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    allFailure: ").append(toIndentedString(allFailure)).append("\n");
        sb.append("    forceDelete: ").append(toIndentedString(forceDelete)).append("\n");
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
