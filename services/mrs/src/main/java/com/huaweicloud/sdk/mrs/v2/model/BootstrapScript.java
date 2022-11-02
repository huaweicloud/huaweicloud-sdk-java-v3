package com.huaweicloud.sdk.mrs.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BootstrapScript
 */
public class BootstrapScript  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uri")
    
    
    private String uri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    
    private String parameters;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    
    private List<String> nodes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="active_master")
    
    
    private Boolean activeMaster;
    /**
     * 引导操作脚本执行失败后，是否继续执行后续脚本和创建集群。 缺省值为errorout,表示终止操作。 说明： 建议您在调试阶段设置为“继续”，无论此引导操作是否执行成功，则集群都能继续安装和启动。 枚举值： - continue：继续执行后续脚本。 - errorout：终止操作。
     */
    public static final class FailActionEnum {

        
        /**
         * Enum CONTINUE for value: "continue"
         */
        public static final FailActionEnum CONTINUE = new FailActionEnum("continue");
        
        /**
         * Enum ERROROUT for value: "errorout"
         */
        public static final FailActionEnum ERROROUT = new FailActionEnum("errorout");
        

        private static final Map<String, FailActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailActionEnum> createStaticFields() {
            Map<String, FailActionEnum> map = new HashMap<>();
            map.put("continue", CONTINUE);
            map.put("errorout", ERROROUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailActionEnum(String value) {
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
        public static FailActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FailActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FailActionEnum(value);
            }
            return result;
        }

        public static FailActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FailActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FailActionEnum) {
                return this.value.equals(((FailActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_action")
    
    
    private FailActionEnum failAction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="before_component_start")
    
    
    private Boolean beforeComponentStart;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    
    private Long startTime;
    /**
     * 单个引导操作脚本的运行状态。  - PENDING - IN_PROGRESS - SUCCESS - FAILURE
     */
    public static final class StateEnum {

        
        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final StateEnum PENDING = new StateEnum("PENDING");
        
        /**
         * Enum IN_PROGRESS for value: "IN_PROGRESS"
         */
        public static final StateEnum IN_PROGRESS = new StateEnum("IN_PROGRESS");
        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StateEnum SUCCESS = new StateEnum("SUCCESS");
        
        /**
         * Enum FAILURE for value: "FAILURE"
         */
        public static final StateEnum FAILURE = new StateEnum("FAILURE");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("PENDING", PENDING);
            map.put("IN_PROGRESS", IN_PROGRESS);
            map.put("SUCCESS", SUCCESS);
            map.put("FAILURE", FAILURE);
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
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="state")
    
    
    private StateEnum state;
    /**
     * 枚举值： - BEFORE_COMPONENT_FIRST_START: 组件首次启动后 - AFTER_COMPONENT_FIRST_START: 组件首次启动前 - BEFORE_SCALE_IN: 缩容前 - AFTER_SCALE_IN: 缩容后 - BEFORE_SCALE_OUT: 扩容前 - AFTER_SCALE_OUT: 扩容后
     */
    public static final class ActionStagesEnum {

        
        /**
         * Enum BEFORE_COMPONENT_FIRST_START for value: "BEFORE_COMPONENT_FIRST_START"
         */
        public static final ActionStagesEnum BEFORE_COMPONENT_FIRST_START = new ActionStagesEnum("BEFORE_COMPONENT_FIRST_START");
        
        /**
         * Enum AFTER_COMPONENT_FIRST_START for value: "AFTER_COMPONENT_FIRST_START"
         */
        public static final ActionStagesEnum AFTER_COMPONENT_FIRST_START = new ActionStagesEnum("AFTER_COMPONENT_FIRST_START");
        
        /**
         * Enum BEFORE_SCALE_IN for value: "BEFORE_SCALE_IN"
         */
        public static final ActionStagesEnum BEFORE_SCALE_IN = new ActionStagesEnum("BEFORE_SCALE_IN");
        
        /**
         * Enum AFTER_SCALE_IN for value: "AFTER_SCALE_IN"
         */
        public static final ActionStagesEnum AFTER_SCALE_IN = new ActionStagesEnum("AFTER_SCALE_IN");
        
        /**
         * Enum BEFORE_SCALE_OUT for value: "BEFORE_SCALE_OUT"
         */
        public static final ActionStagesEnum BEFORE_SCALE_OUT = new ActionStagesEnum("BEFORE_SCALE_OUT");
        
        /**
         * Enum AFTER_SCALE_OUT for value: "AFTER_SCALE_OUT"
         */
        public static final ActionStagesEnum AFTER_SCALE_OUT = new ActionStagesEnum("AFTER_SCALE_OUT");
        

        private static final Map<String, ActionStagesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionStagesEnum> createStaticFields() {
            Map<String, ActionStagesEnum> map = new HashMap<>();
            map.put("BEFORE_COMPONENT_FIRST_START", BEFORE_COMPONENT_FIRST_START);
            map.put("AFTER_COMPONENT_FIRST_START", AFTER_COMPONENT_FIRST_START);
            map.put("BEFORE_SCALE_IN", BEFORE_SCALE_IN);
            map.put("AFTER_SCALE_IN", AFTER_SCALE_IN);
            map.put("BEFORE_SCALE_OUT", BEFORE_SCALE_OUT);
            map.put("AFTER_SCALE_OUT", AFTER_SCALE_OUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionStagesEnum(String value) {
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
        public static ActionStagesEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionStagesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionStagesEnum(value);
            }
            return result;
        }

        public static ActionStagesEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionStagesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionStagesEnum) {
                return this.value.equals(((ActionStagesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_stages")
    
    
    private List<ActionStagesEnum> actionStages = null;
    
    public BootstrapScript withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 引导操作脚本的名称，同一个集群的引导操作脚本名称不允许相同。 只能由数字、英文字符、空格、中划线和下划线组成，且不能以空格开头。 可输入的字符串长度为1～64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public BootstrapScript withUri(String uri) {
        this.uri = uri;
        return this;
    }

    


    /**
     * 引导操作脚本的路径。设置为OBS桶的路径或虚拟机本地的路径。 - OBS桶的路径：直接手动输入脚本路径。例如输入MRS提供的公共样例脚本路径。示例：obs://bootstrap/presto/presto-install.sh，其中安装dualroles时，presto-install.sh脚本参数为dualroles, 安装worker时，presto-install.sh脚本参数为worker。根据Presto使用习惯，建议您在Active Master节点上安装dualroles，在Core节点上安装worker。 - 虚拟机本地的路径：用户需要输入正确的脚本路径。脚本所在的路径必须以‘/’开头，以.sh结尾。
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    

    public BootstrapScript withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    


    /**
     * 引导操作脚本参数。
     * @return parameters
     */
    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    

    public BootstrapScript withNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public BootstrapScript addNodesItem(String nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public BootstrapScript withNodes(Consumer<List<String>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 引导操作脚本所执行的节点组名称，包含Master、Core和Task三种类型节点组。
     * @return nodes
     */
    public List<String> getNodes() {
        return nodes;
    }

    public void setNodes(List<String> nodes) {
        this.nodes = nodes;
    }

    

    public BootstrapScript withActiveMaster(Boolean activeMaster) {
        this.activeMaster = activeMaster;
        return this;
    }

    


    /**
     * 引导操作脚本是否只运行在主Master节点上。 缺省值为false，表示引导操作脚本可运行在所有Master节点上。
     * @return activeMaster
     */
    public Boolean getActiveMaster() {
        return activeMaster;
    }

    public void setActiveMaster(Boolean activeMaster) {
        this.activeMaster = activeMaster;
    }

    

    public BootstrapScript withFailAction(FailActionEnum failAction) {
        this.failAction = failAction;
        return this;
    }

    


    /**
     * 引导操作脚本执行失败后，是否继续执行后续脚本和创建集群。 缺省值为errorout,表示终止操作。 说明： 建议您在调试阶段设置为“继续”，无论此引导操作是否执行成功，则集群都能继续安装和启动。 枚举值： - continue：继续执行后续脚本。 - errorout：终止操作。
     * @return failAction
     */
    public FailActionEnum getFailAction() {
        return failAction;
    }

    public void setFailAction(FailActionEnum failAction) {
        this.failAction = failAction;
    }

    

    public BootstrapScript withBeforeComponentStart(Boolean beforeComponentStart) {
        this.beforeComponentStart = beforeComponentStart;
        return this;
    }

    


    /**
     * 引导操作脚本执行的时间。目前支持“组件启动前”和“组件启动后”两种类型。 缺省值为false，表示引导操作脚本在组件启动后执行。
     * @return beforeComponentStart
     */
    public Boolean getBeforeComponentStart() {
        return beforeComponentStart;
    }

    public void setBeforeComponentStart(Boolean beforeComponentStart) {
        this.beforeComponentStart = beforeComponentStart;
    }

    

    public BootstrapScript withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 单个引导操作脚本的执行时间。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    

    public BootstrapScript withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * 单个引导操作脚本的运行状态。  - PENDING - IN_PROGRESS - SUCCESS - FAILURE
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    

    public BootstrapScript withActionStages(List<ActionStagesEnum> actionStages) {
        this.actionStages = actionStages;
        return this;
    }

    
    public BootstrapScript addActionStagesItem(ActionStagesEnum actionStagesItem) {
        if(this.actionStages == null) {
            this.actionStages = new ArrayList<>();
        }
        this.actionStages.add(actionStagesItem);
        return this;
    }

    public BootstrapScript withActionStages(Consumer<List<ActionStagesEnum>> actionStagesSetter) {
        if(this.actionStages == null) {
            this.actionStages = new ArrayList<>();
        }
        actionStagesSetter.accept(this.actionStages);
        return this;
    }

    /**
     * 选择引导操作脚本执行的时间。 - BEFORE_COMPONENT_FIRST_START: 组件首次启动后 - AFTER_COMPONENT_FIRST_START: 组件首次启动前 - BEFORE_SCALE_IN: 缩容前 - AFTER_SCALE_IN: 缩容后 - BEFORE_SCALE_OUT: 扩容前 - AFTER_SCALE_OUT: 扩容后
     * @return actionStages
     */
    public List<ActionStagesEnum> getActionStages() {
        return actionStages;
    }

    public void setActionStages(List<ActionStagesEnum> actionStages) {
        this.actionStages = actionStages;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BootstrapScript bootstrapScript = (BootstrapScript) o;
        return Objects.equals(this.name, bootstrapScript.name) &&
            Objects.equals(this.uri, bootstrapScript.uri) &&
            Objects.equals(this.parameters, bootstrapScript.parameters) &&
            Objects.equals(this.nodes, bootstrapScript.nodes) &&
            Objects.equals(this.activeMaster, bootstrapScript.activeMaster) &&
            Objects.equals(this.failAction, bootstrapScript.failAction) &&
            Objects.equals(this.beforeComponentStart, bootstrapScript.beforeComponentStart) &&
            Objects.equals(this.startTime, bootstrapScript.startTime) &&
            Objects.equals(this.state, bootstrapScript.state) &&
            Objects.equals(this.actionStages, bootstrapScript.actionStages);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, uri, parameters, nodes, activeMaster, failAction, beforeComponentStart, startTime, state, actionStages);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BootstrapScript {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    activeMaster: ").append(toIndentedString(activeMaster)).append("\n");
        sb.append("    failAction: ").append(toIndentedString(failAction)).append("\n");
        sb.append("    beforeComponentStart: ").append(toIndentedString(beforeComponentStart)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    actionStages: ").append(toIndentedString(actionStages)).append("\n");
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

