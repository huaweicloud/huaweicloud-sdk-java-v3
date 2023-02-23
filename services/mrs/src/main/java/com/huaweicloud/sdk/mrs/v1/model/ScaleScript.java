package com.huaweicloud.sdk.mrs.v1.model;




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
 * ScaleScript
 */
public class ScaleScript  {


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
     * 自自定义自动化脚本执行失败后，是否继续执行后续脚本和创建集群。  说明：  - 建议您在调试阶段设置为“continue”，无论此自定义自动化脚本是否执行成功，则集群都能继续安装和启动。  - 由于缩容成功无法回滚，因此缩容后执行的脚本“fail_action”必须设置为“continue”。  枚举值： - continue：继续执行后续脚本。 - errorout：终止操作。
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
    /**
     * 脚本执行时机。  枚举值： - before_scale_out：扩容前 - before_scale_in：缩容前 - after_scale_out：扩容后 - after_scale_in：缩容后
     */
    public static final class ActionStageEnum {

        
        /**
         * Enum BEFORE_SCALE_OUT for value: "before_scale_out"
         */
        public static final ActionStageEnum BEFORE_SCALE_OUT = new ActionStageEnum("before_scale_out");
        
        /**
         * Enum BEFORE_SCALE_IN for value: "before_scale_in"
         */
        public static final ActionStageEnum BEFORE_SCALE_IN = new ActionStageEnum("before_scale_in");
        
        /**
         * Enum AFTER_SCALE_OUT for value: "after_scale_out"
         */
        public static final ActionStageEnum AFTER_SCALE_OUT = new ActionStageEnum("after_scale_out");
        
        /**
         * Enum AFTER_SCALE_IN for value: "after_scale_in"
         */
        public static final ActionStageEnum AFTER_SCALE_IN = new ActionStageEnum("after_scale_in");
        

        private static final Map<String, ActionStageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionStageEnum> createStaticFields() {
            Map<String, ActionStageEnum> map = new HashMap<>();
            map.put("before_scale_out", BEFORE_SCALE_OUT);
            map.put("before_scale_in", BEFORE_SCALE_IN);
            map.put("after_scale_out", AFTER_SCALE_OUT);
            map.put("after_scale_in", AFTER_SCALE_IN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionStageEnum(String value) {
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
        public static ActionStageEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionStageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionStageEnum(value);
            }
            return result;
        }

        public static ActionStageEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionStageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionStageEnum) {
                return this.value.equals(((ActionStageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_stage")
    

    private ActionStageEnum actionStage;

    public ScaleScript withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 弹性伸缩自定义自动化脚本的名称，同一个集群的自定义自动化脚本名称不允许相同。  只能由数字、英文字符、空格、中划线和下划线组成，且不能以空格开头。  可输入的字符串长度为1～64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ScaleScript withUri(String uri) {
        this.uri = uri;
        return this;
    }

    


    /**
     * 自定义自动化脚本的路径。设置为OBS桶的路径或虚拟机本地的路径。  - OBS桶的路径：直接手动输入脚本路径。示例：s3a://XXX/scale.sh  - 虚拟机本地的路径：用户需要输入正确的脚本路径。脚本所在的路径必须以‘/’开头，以.sh结尾。
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    

    public ScaleScript withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    


    /**
     * 自定义自动化脚本参数。  多个参数间用空格隔开。 可以传入以下系统预定义参数： - ${mrs_scale_node_num}：扩缩容节点数 - ${mrs_scale_type}：扩缩容类型，扩容为scale_out，缩容为scale_in - ${mrs_scale_node_hostnames}：扩缩容的节点主机名称 - ${mrs_scale_node_ips}：扩缩容的节点IP - ${mrs_scale_rule_name}：触发扩缩容的规则名   其他用户自定义参数使用方式与普通shell脚本相同，多个参数中间用空格隔开。
     * @return parameters
     */
    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    

    public ScaleScript withNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public ScaleScript addNodesItem(String nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ScaleScript withNodes(Consumer<List<String>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 自定义自动化脚本所执行的节点组名称（非自定义集群也可使用节点类型，包含Master、Core和Task三种类型）。
     * @return nodes
     */
    public List<String> getNodes() {
        return nodes;
    }

    public void setNodes(List<String> nodes) {
        this.nodes = nodes;
    }

    

    public ScaleScript withActiveMaster(Boolean activeMaster) {
        this.activeMaster = activeMaster;
        return this;
    }

    


    /**
     * 自定义自动化脚本是否只运行在主Master节点上。  缺省值为false，表示自定义自动化脚本可运行在所有Master节点上。
     * @return activeMaster
     */
    public Boolean getActiveMaster() {
        return activeMaster;
    }

    public void setActiveMaster(Boolean activeMaster) {
        this.activeMaster = activeMaster;
    }

    

    public ScaleScript withFailAction(FailActionEnum failAction) {
        this.failAction = failAction;
        return this;
    }

    


    /**
     * 自自定义自动化脚本执行失败后，是否继续执行后续脚本和创建集群。  说明：  - 建议您在调试阶段设置为“continue”，无论此自定义自动化脚本是否执行成功，则集群都能继续安装和启动。  - 由于缩容成功无法回滚，因此缩容后执行的脚本“fail_action”必须设置为“continue”。  枚举值： - continue：继续执行后续脚本。 - errorout：终止操作。
     * @return failAction
     */
    public FailActionEnum getFailAction() {
        return failAction;
    }

    public void setFailAction(FailActionEnum failAction) {
        this.failAction = failAction;
    }

    

    public ScaleScript withActionStage(ActionStageEnum actionStage) {
        this.actionStage = actionStage;
        return this;
    }

    


    /**
     * 脚本执行时机。  枚举值： - before_scale_out：扩容前 - before_scale_in：缩容前 - after_scale_out：扩容后 - after_scale_in：缩容后
     * @return actionStage
     */
    public ActionStageEnum getActionStage() {
        return actionStage;
    }

    public void setActionStage(ActionStageEnum actionStage) {
        this.actionStage = actionStage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScaleScript scaleScript = (ScaleScript) o;
        return Objects.equals(this.name, scaleScript.name) &&
            Objects.equals(this.uri, scaleScript.uri) &&
            Objects.equals(this.parameters, scaleScript.parameters) &&
            Objects.equals(this.nodes, scaleScript.nodes) &&
            Objects.equals(this.activeMaster, scaleScript.activeMaster) &&
            Objects.equals(this.failAction, scaleScript.failAction) &&
            Objects.equals(this.actionStage, scaleScript.actionStage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, uri, parameters, nodes, activeMaster, failAction, actionStage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleScript {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    activeMaster: ").append(toIndentedString(activeMaster)).append("\n");
        sb.append("    failAction: ").append(toIndentedString(failAction)).append("\n");
        sb.append("    actionStage: ").append(toIndentedString(actionStage)).append("\n");
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

