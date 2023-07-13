package com.huaweicloud.sdk.aos.v1.model;

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
 * ExecutionPlanItem
 */
public class ExecutionPlanItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    /**
     * 资源变更的类型   * `ADD` - 新增资源   * `ADD_THEN_DELETE` - 由不可更新的资源返回，先创建新资源，再删除旧资源   * `DELETE ` - 删除资源   * `DELETE_THEN_ADD` - 由不可更新的资源返回，先删除旧资源，再创建新资源   * `UPDATE` - 更新资源    * `NO_OPERATION` - 仅变更资源的依赖关系，但是对资源本身并无修改的操作
     */
    public static final class ActionEnum {

        /**
         * Enum ADD for value: "ADD"
         */
        public static final ActionEnum ADD = new ActionEnum("ADD");

        /**
         * Enum ADD_THEN_DELETE for value: "ADD_THEN_DELETE"
         */
        public static final ActionEnum ADD_THEN_DELETE = new ActionEnum("ADD_THEN_DELETE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ActionEnum DELETE = new ActionEnum("DELETE");

        /**
         * Enum DELETE_THEN_ADD for value: "DELETE_THEN_ADD"
         */
        public static final ActionEnum DELETE_THEN_ADD = new ActionEnum("DELETE_THEN_ADD");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final ActionEnum UPDATE = new ActionEnum("UPDATE");

        /**
         * Enum NO_OPERATION for value: "NO_OPERATION"
         */
        public static final ActionEnum NO_OPERATION = new ActionEnum("NO_OPERATION");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("ADD", ADD);
            map.put("ADD_THEN_DELETE", ADD_THEN_DELETE);
            map.put("DELETE", DELETE);
            map.put("DELETE_THEN_ADD", DELETE_THEN_ADD);
            map.put("UPDATE", UPDATE);
            map.put("NO_OPERATION", NO_OPERATION);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_reason")

    private String actionReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    /**
     * 资源模式   * `DATA` - 指可以在模板解析期间运行和获取服务端数据的资源类型，不会操作基础设施组件   * `RESOURCE` - 指通过模板管理的由服务定义的基础设施组件抽象，可以是物理资源也可以是逻辑资源
     */
    public static final class ModeEnum {

        /**
         * Enum DATA for value: "DATA"
         */
        public static final ModeEnum DATA = new ModeEnum("DATA");

        /**
         * Enum RESOURCE for value: "RESOURCE"
         */
        public static final ModeEnum RESOURCE = new ModeEnum("RESOURCE");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("DATA", DATA);
            map.put("RESOURCE", RESOURCE);
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
    @JsonProperty(value = "drifted")

    private Boolean drifted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private List<ExecutionPlanDiffAttribute> attributes = null;

    public ExecutionPlanItem withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源的类型  以HCL格式的模板为例，resource_type 为 huaweicloud_vpc  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   name = \"test_vpc\" } ```  以json格式的模板为例，resource_type 为 huaweicloud_vpc  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\"       }     }   } } ```
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ExecutionPlanItem withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源的名称，默认为资源的逻辑名称  以HCL格式的模板为例，resource_name 为 my_hello_world_vpc  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   name = \"test_vpc\" } ```  以json格式的模板为例，resource_name 为 my_hello_world_vpc  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\"       }     }   } } ```
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ExecutionPlanItem withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * 资源的索引，若用户在模板中使用了count或for_each则会返回index。若index出现，则resource_name + index可以作为该资源的一种标识  若用户在模板中使用count，则index为从0开始的数字  以HCL格式的模板为例，用户在模板中可以通过`huaweicloud_vpc.my_hello_world_vpc[0]`和`huaweicloud_vpc.my_hello_world_vpc[1]`标识两个资源  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   count = 2   name = \"test_vpc\" } ```  以json格式的模板为例，用户在模板中可以通过`huaweicloud_vpc.my_hello_world_vpc[0]`和`huaweicloud_vpc.my_hello_world_vpc[1]`标识两个资源  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\",         \"count\": 2       }     }   } } ```  若用户在模板中使用for_each，则index为用户自定义的字符串  以HCL格式的模板为例，用户在模板中可以通过`huaweicloud_vpc.my_hello_world_vpc[\"vpc1\"]`和`huaweicloud_vpc.my_hello_world_vpc[\"vpc2\"]`标识两个资源  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   for_each = {     \"vpc1\" = \"test_vpc\"     \"vpc2\" = \"test_vpc\"   }   name = each.value } ```  以json格式的模板为例，用户在模板中可以通过`huaweicloud_vpc.my_hello_world_vpc[\"vpc1\"]`和`huaweicloud_vpc.my_hello_world_vpc[\"vpc2\"]`标识两个资源  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"for_each\": {           \"vpc1\": \"test_vpc\",           \"vpc2\": \"test_vpc\"         }         \"name\": \"${each.value}\"       }     }   } } ```
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public ExecutionPlanItem withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 资源变更的类型   * `ADD` - 新增资源   * `ADD_THEN_DELETE` - 由不可更新的资源返回，先创建新资源，再删除旧资源   * `DELETE ` - 删除资源   * `DELETE_THEN_ADD` - 由不可更新的资源返回，先删除旧资源，再创建新资源   * `UPDATE` - 更新资源    * `NO_OPERATION` - 仅变更资源的依赖关系，但是对资源本身并无修改的操作
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ExecutionPlanItem withActionReason(String actionReason) {
        this.actionReason = actionReason;
        return this;
    }

    /**
     * 触发该项目变更的原因，例如用户更新模板；远端删除资源等等
     * @return actionReason
     */
    public String getActionReason() {
        return actionReason;
    }

    public void setActionReason(String actionReason) {
        this.actionReason = actionReason;
    }

    public ExecutionPlanItem withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 该项目所属的provider名称。
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ExecutionPlanItem withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 资源模式   * `DATA` - 指可以在模板解析期间运行和获取服务端数据的资源类型，不会操作基础设施组件   * `RESOURCE` - 指通过模板管理的由服务定义的基础设施组件抽象，可以是物理资源也可以是逻辑资源
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public ExecutionPlanItem withDrifted(Boolean drifted) {
        this.drifted = drifted;
        return this;
    }

    /**
     * 当前资源的变更是否由偏差导致。  偏差，也叫漂移。指的是资源被资源编排服务创建以后，又经历过非资源编排服务触发的修改，如手动修改、调用SDK修改等，使得资源的配置与本服务所记录的资源的配置不一致。这种不一致便称为偏差。  当资源产生偏差以后： * 如果用户试图创建执行计划，则会提示用户产生偏差 * 如果用户直接部署，则偏差有可能被覆盖，资源编排服务只保证资源和模板最终一致。  资源的偏差有两种类型： * 资源定位属性被修改：如果是定位属性被修改，常见于删除后重建，此时资源已经不属于同一个资源。资源编排服务会认为此资源已经被删除，会尝试创建一个新的资源。 * 资源普通属性被修改：如果是普通属性被修改，则资源编排服务依然可以找到资源，但是下次部署会尝试修复偏差，即将资源保持和模板最终一致。  **注：资源编排服务团队极力推荐，如果资源是通过本服务创建的，请一直使用本服务进行维护和更新以确保资源和模板保持一致。建议非紧急事件以外的情况不要手动调整。**
     * @return drifted
     */
    public Boolean getDrifted() {
        return drifted;
    }

    public void setDrifted(Boolean drifted) {
        this.drifted = drifted;
    }

    public ExecutionPlanItem withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源的物理id，是唯一id，由为该资源提供服务的provider、云服务或其他服务提供方在资源部署的时候生成
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ExecutionPlanItem withAttributes(List<ExecutionPlanDiffAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ExecutionPlanItem addAttributesItem(ExecutionPlanDiffAttribute attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public ExecutionPlanItem withAttributes(Consumer<List<ExecutionPlanDiffAttribute>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 执行计划项目中变更的属性，当无属性变更时为空列表。
     * @return attributes
     */
    public List<ExecutionPlanDiffAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ExecutionPlanDiffAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionPlanItem that = (ExecutionPlanItem) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.index, that.index)
            && Objects.equals(this.action, that.action) && Objects.equals(this.actionReason, that.actionReason)
            && Objects.equals(this.providerName, that.providerName) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.drifted, that.drifted) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType,
            resourceName,
            index,
            action,
            actionReason,
            providerName,
            mode,
            drifted,
            resourceId,
            attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionPlanItem {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionReason: ").append(toIndentedString(actionReason)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    drifted: ").append(toIndentedString(drifted)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
