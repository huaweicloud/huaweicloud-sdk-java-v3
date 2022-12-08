package com.huaweicloud.sdk.aos.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.ExecutionPlanDiffAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 执行计划元素，承载执行计划中变更的细节。
 */
public class ExecutionPlanItem  {

    /**
     * 资源变更的类型，这里，IN_PLACE_UPDATE、ADD_THEN_DELETE和 DELETE_THEN_ADD均为更新操作，IN_PLACE_UPDATE指原地更新； 而对于不可更新的资源，ADD_THEN_DELETE是先创建新的，再删除旧的；DELETE_THEN_ADD是先删除旧的，再创建新的. 执行计划的执行状态，只有当AVAILABLE的时候才可以使用apply执行 * `ADD` - 新建资源 * `ADD_THEN_DELETE` - 对于不可更新的资源执行先创建再删除的操作 * `DELETE ` - 删除资源 * `DELETE_THEN_ADD` - 对于不可更新的资源执行先删除在创建的操作 * `UPDATE` - 更新资源  * `IN_PLACE_UPDATE` - 更新资源的操作 * `NO_OPERATION` - 变更资源的依赖关系，但是对资源本身并无修改的操作
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
         * Enum IN_PLACE_UPDATE for value: "IN_PLACE_UPDATE"
         */
        public static final ActionEnum IN_PLACE_UPDATE = new ActionEnum("IN_PLACE_UPDATE");
        
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
            map.put("IN_PLACE_UPDATE", IN_PLACE_UPDATE);
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
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="action")
    
    
    private ActionEnum action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_reason")
    
    
    private String actionReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider_name")
    
    
    private String providerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="index")
    
    
    private String index;
    /**
     * * `DATA` - 指可以在模板解析期间运行和获取服务端数据的资源类型，不会操作基础设施组件 * `RESOURCE` - 指通过模板管理的由服务定义的基础设施组件抽象，可以是物理资源也可以是逻辑资源
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
            if( value == null ){
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModeEnum(value);
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="mode")
    
    
    private ModeEnum mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="drifted")
    
    
    private Boolean drifted;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attributes")
    
    
    private List<ExecutionPlanDiffAttribute> attributes = null;
    
    public ExecutionPlanItem withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 资源变更的类型，这里，IN_PLACE_UPDATE、ADD_THEN_DELETE和 DELETE_THEN_ADD均为更新操作，IN_PLACE_UPDATE指原地更新； 而对于不可更新的资源，ADD_THEN_DELETE是先创建新的，再删除旧的；DELETE_THEN_ADD是先删除旧的，再创建新的. 执行计划的执行状态，只有当AVAILABLE的时候才可以使用apply执行 * `ADD` - 新建资源 * `ADD_THEN_DELETE` - 对于不可更新的资源执行先创建再删除的操作 * `DELETE ` - 删除资源 * `DELETE_THEN_ADD` - 对于不可更新的资源执行先删除在创建的操作 * `UPDATE` - 更新资源  * `IN_PLACE_UPDATE` - 更新资源的操作 * `NO_OPERATION` - 变更资源的依赖关系，但是对资源本身并无修改的操作
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
     * 表示该动作触发的原因，例如用户更新模板；远端删除资源等等
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
     * 表示该资源所属的provider名字。
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    

    public ExecutionPlanItem withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 当前资源在HCL模板中对应的类型。
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
     * 当前资源的在HCL模板中指定的名字。
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
     * 表示资源对应的index，例如对于使用count构建的资源，其类型和名字一样，但是index是从1到count的数值；对于使用for_each创建的资源，index可以是for_each中指定的key名。
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    

    public ExecutionPlanItem withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * * `DATA` - 指可以在模板解析期间运行和获取服务端数据的资源类型，不会操作基础设施组件 * `RESOURCE` - 指通过模板管理的由服务定义的基础设施组件抽象，可以是物理资源也可以是逻辑资源
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
     * 当前资源的变更是否由配置漂移导致。
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
     * 当前资源的唯一ID，当操作类型为创建时为空。当资源为新建时为空。注意resouce_name是资源在HCL模板中定义的名字，resource_id是provider提供的唯一ID。
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
        if(this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public ExecutionPlanItem withAttributes(Consumer<List<ExecutionPlanDiffAttribute>> attributesSetter) {
        if(this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 执行计划元素变更的属性，当无属性变更时为空。
     * @return attributes
     */
    public List<ExecutionPlanDiffAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ExecutionPlanDiffAttribute> attributes) {
        this.attributes = attributes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutionPlanItem executionPlanItem = (ExecutionPlanItem) o;
        return Objects.equals(this.action, executionPlanItem.action) &&
            Objects.equals(this.actionReason, executionPlanItem.actionReason) &&
            Objects.equals(this.providerName, executionPlanItem.providerName) &&
            Objects.equals(this.resourceType, executionPlanItem.resourceType) &&
            Objects.equals(this.resourceName, executionPlanItem.resourceName) &&
            Objects.equals(this.index, executionPlanItem.index) &&
            Objects.equals(this.mode, executionPlanItem.mode) &&
            Objects.equals(this.drifted, executionPlanItem.drifted) &&
            Objects.equals(this.resourceId, executionPlanItem.resourceId) &&
            Objects.equals(this.attributes, executionPlanItem.attributes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, actionReason, providerName, resourceType, resourceName, index, mode, drifted, resourceId, attributes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionPlanItem {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionReason: ").append(toIndentedString(actionReason)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

