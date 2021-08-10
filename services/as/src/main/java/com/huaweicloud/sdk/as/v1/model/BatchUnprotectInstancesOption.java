package com.huaweicloud.sdk.as.v1.model;

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

/** 批量取消实例保护 */
public class BatchUnprotectInstancesOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances_id")

    private List<String> instancesId = null;

    /** 从伸缩组中移出实例时，是否删除云服务器。默认为no；可选值为yes或no。只有action为REMOVE时，这个字段才生效。 */
    public static final class InstanceDeleteEnum {

        /** Enum YES for value: "yes" */
        public static final InstanceDeleteEnum YES = new InstanceDeleteEnum("yes");

        /** Enum NO for value: "no" */
        public static final InstanceDeleteEnum NO = new InstanceDeleteEnum("no");

        private static final Map<String, InstanceDeleteEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceDeleteEnum> createStaticFields() {
            Map<String, InstanceDeleteEnum> map = new HashMap<>();
            map.put("yes", YES);
            map.put("no", NO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceDeleteEnum(String value) {
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
        public static InstanceDeleteEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InstanceDeleteEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstanceDeleteEnum(value);
            }
            return result;
        }

        public static InstanceDeleteEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InstanceDeleteEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceDeleteEnum) {
                return this.value.equals(((InstanceDeleteEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_delete")

    private InstanceDeleteEnum instanceDelete;

    /** 批量操作实例action标识：添加：ADD 移除： REMOVE 设置实例保护： PROTECT 取消实例保护： UNPROTECT；转入备用状态：ENTER_STANDBY 移出备用状态:EXIT_STANDBY */
    public static final class ActionEnum {

        /** Enum UNPROTECT for value: "UNPROTECT" */
        public static final ActionEnum UNPROTECT = new ActionEnum("UNPROTECT");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("UNPROTECT", UNPROTECT);
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

    /** 将实例移入备用状态时，是否补充新的云服务器。取值如下：no：不补充新的实例，默认情况为no。yes：补充新的实例。只有action为ENTER_STANDBY时，这个字段才生效。 */
    public static final class InstanceAppendEnum {

        /** Enum NO for value: "no" */
        public static final InstanceAppendEnum NO = new InstanceAppendEnum("no");

        /** Enum YES for value: "yes" */
        public static final InstanceAppendEnum YES = new InstanceAppendEnum("yes");

        private static final Map<String, InstanceAppendEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceAppendEnum> createStaticFields() {
            Map<String, InstanceAppendEnum> map = new HashMap<>();
            map.put("no", NO);
            map.put("yes", YES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceAppendEnum(String value) {
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
        public static InstanceAppendEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InstanceAppendEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstanceAppendEnum(value);
            }
            return result;
        }

        public static InstanceAppendEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InstanceAppendEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceAppendEnum) {
                return this.value.equals(((InstanceAppendEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_append")

    private InstanceAppendEnum instanceAppend;

    public BatchUnprotectInstancesOption withInstancesId(List<String> instancesId) {
        this.instancesId = instancesId;
        return this;
    }

    public BatchUnprotectInstancesOption addInstancesIdItem(String instancesIdItem) {
        if (this.instancesId == null) {
            this.instancesId = new ArrayList<>();
        }
        this.instancesId.add(instancesIdItem);
        return this;
    }

    public BatchUnprotectInstancesOption withInstancesId(Consumer<List<String>> instancesIdSetter) {
        if (this.instancesId == null) {
            this.instancesId = new ArrayList<>();
        }
        instancesIdSetter.accept(this.instancesId);
        return this;
    }

    /** 云服务器ID。
     * 
     * @return instancesId */
    public List<String> getInstancesId() {
        return instancesId;
    }

    public void setInstancesId(List<String> instancesId) {
        this.instancesId = instancesId;
    }

    public BatchUnprotectInstancesOption withInstanceDelete(InstanceDeleteEnum instanceDelete) {
        this.instanceDelete = instanceDelete;
        return this;
    }

    /** 从伸缩组中移出实例时，是否删除云服务器。默认为no；可选值为yes或no。只有action为REMOVE时，这个字段才生效。
     * 
     * @return instanceDelete */
    public InstanceDeleteEnum getInstanceDelete() {
        return instanceDelete;
    }

    public void setInstanceDelete(InstanceDeleteEnum instanceDelete) {
        this.instanceDelete = instanceDelete;
    }

    public BatchUnprotectInstancesOption withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /** 批量操作实例action标识：添加：ADD 移除： REMOVE 设置实例保护： PROTECT 取消实例保护： UNPROTECT；转入备用状态：ENTER_STANDBY 移出备用状态:EXIT_STANDBY
     * 
     * @return action */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public BatchUnprotectInstancesOption withInstanceAppend(InstanceAppendEnum instanceAppend) {
        this.instanceAppend = instanceAppend;
        return this;
    }

    /** 将实例移入备用状态时，是否补充新的云服务器。取值如下：no：不补充新的实例，默认情况为no。yes：补充新的实例。只有action为ENTER_STANDBY时，这个字段才生效。
     * 
     * @return instanceAppend */
    public InstanceAppendEnum getInstanceAppend() {
        return instanceAppend;
    }

    public void setInstanceAppend(InstanceAppendEnum instanceAppend) {
        this.instanceAppend = instanceAppend;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUnprotectInstancesOption batchUnprotectInstancesOption = (BatchUnprotectInstancesOption) o;
        return Objects.equals(this.instancesId, batchUnprotectInstancesOption.instancesId)
            && Objects.equals(this.instanceDelete, batchUnprotectInstancesOption.instanceDelete)
            && Objects.equals(this.action, batchUnprotectInstancesOption.action)
            && Objects.equals(this.instanceAppend, batchUnprotectInstancesOption.instanceAppend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instancesId, instanceDelete, action, instanceAppend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUnprotectInstancesOption {\n");
        sb.append("    instancesId: ").append(toIndentedString(instancesId)).append("\n");
        sb.append("    instanceDelete: ").append(toIndentedString(instanceDelete)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    instanceAppend: ").append(toIndentedString(instanceAppend)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
