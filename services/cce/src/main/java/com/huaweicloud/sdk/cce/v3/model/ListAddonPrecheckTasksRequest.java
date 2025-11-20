package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAddonPrecheckTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    /**
     * **参数解释：** 根据插件检查类型筛选结果 **约束限制：** 不涉及 **取值范围：** - addonStatic: 运行中插件巡检 - addonUpgrade: 插件升级前检查  **默认取值：** 不涉及 
     */
    public static final class TypeEnum {

        /**
         * Enum ADDONSTATIC for value: "addonStatic"
         */
        public static final TypeEnum ADDONSTATIC = new TypeEnum("addonStatic");

        /**
         * Enum ADDONUPGRADE for value: "addonUpgrade"
         */
        public static final TypeEnum ADDONUPGRADE = new TypeEnum("addonUpgrade");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("addonStatic", ADDONSTATIC);
            map.put("addonUpgrade", ADDONUPGRADE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addon_instance_id")

    private String addonInstanceId;

    public ListAddonPrecheckTasksRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListAddonPrecheckTasksRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 根据插件检查类型筛选结果 **约束限制：** 不涉及 **取值范围：** - addonStatic: 运行中插件巡检 - addonUpgrade: 插件升级前检查  **默认取值：** 不涉及 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListAddonPrecheckTasksRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 根据插件检查任务ID筛选结果，插件检查任务ID可以通过[批量创建插件检查任务](BatchCreateAddonPrecheck.xml)中的status.items[].metadata.taskID字段获取 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListAddonPrecheckTasksRequest withAddonInstanceId(String addonInstanceId) {
        this.addonInstanceId = addonInstanceId;
        return this;
    }

    /**
     * **参数解释：** 根据插件实例ID筛选结果，实例ID可以通过[获取AddonInstance列表](cce_02_0326.xml)中的items[].metadata.uid字段获取 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return addonInstanceId
     */
    public String getAddonInstanceId() {
        return addonInstanceId;
    }

    public void setAddonInstanceId(String addonInstanceId) {
        this.addonInstanceId = addonInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAddonPrecheckTasksRequest that = (ListAddonPrecheckTasksRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.addonInstanceId, that.addonInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, type, taskId, addonInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAddonPrecheckTasksRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    addonInstanceId: ").append(toIndentedString(addonInstanceId)).append("\n");
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
