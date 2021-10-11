package com.huaweicloud.sdk.mrs.v1.model;




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
 * BootstrapScriptResp
 */
public class BootstrapScriptResp  {



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
     * 引导操作脚本执行失败后，是否继续执行后续脚本和创建集群。  缺省值为errorout,表示终止操作。   说明： 建议您在调试阶段设置为“继续”，无论此引导操作是否执行成功，则集群都能继续安装和启动。  枚举值： - continue：继续执行后续脚本。 - errorout：终止操作。
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    
    private String state;

    public BootstrapScriptResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 引导操作脚本的名称，同一个集群的引导操作脚本名称不允许相同。  只能由数字、英文字符、空格、中划线和下划线组成，且不能以空格开头。  可输入的字符串长度为1～64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public BootstrapScriptResp withUri(String uri) {
        this.uri = uri;
        return this;
    }

    


    /**
     * 引导操作脚本的路径。设置为OBS桶的路径或虚拟机本地的路径。 - OBS桶的路径：直接手动输入脚本路径。例如输入MRS提供的公共样例脚本路径。示例：s3a://bootstrap/presto/presto-install.sh，其中安装dualroles时，presto-install.sh脚本参数为dualroles, 安装worker时，presto-install.sh脚本参数为worker。根据Presto使用习惯，建议您在Active Master节点上安装dualroles，在Core节点上安装worker。 - 虚拟机本地的路径：用户需要输入正确的脚本路径。脚本所在的路径必须以‘/’开头，以.sh结尾。
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    

    public BootstrapScriptResp withParameters(String parameters) {
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

    

    public BootstrapScriptResp withNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public BootstrapScriptResp addNodesItem(String nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public BootstrapScriptResp withNodes(Consumer<List<String>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 引导操作脚本所执行的节点类型，包含Master、Core和Task三种类型。
     * @return nodes
     */
    public List<String> getNodes() {
        return nodes;
    }

    public void setNodes(List<String> nodes) {
        this.nodes = nodes;
    }

    

    public BootstrapScriptResp withActiveMaster(Boolean activeMaster) {
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

    

    public BootstrapScriptResp withFailAction(FailActionEnum failAction) {
        this.failAction = failAction;
        return this;
    }

    


    /**
     * 引导操作脚本执行失败后，是否继续执行后续脚本和创建集群。  缺省值为errorout,表示终止操作。   说明： 建议您在调试阶段设置为“继续”，无论此引导操作是否执行成功，则集群都能继续安装和启动。  枚举值： - continue：继续执行后续脚本。 - errorout：终止操作。
     * @return failAction
     */
    public FailActionEnum getFailAction() {
        return failAction;
    }

    public void setFailAction(FailActionEnum failAction) {
        this.failAction = failAction;
    }

    

    public BootstrapScriptResp withBeforeComponentStart(Boolean beforeComponentStart) {
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

    

    public BootstrapScriptResp withStartTime(Long startTime) {
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

    

    public BootstrapScriptResp withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * 单个引导操作脚本的运行状态。 - PENDING - IN_PROGRESS - SUCCESS - FAILURE
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BootstrapScriptResp bootstrapScriptResp = (BootstrapScriptResp) o;
        return Objects.equals(this.name, bootstrapScriptResp.name) &&
            Objects.equals(this.uri, bootstrapScriptResp.uri) &&
            Objects.equals(this.parameters, bootstrapScriptResp.parameters) &&
            Objects.equals(this.nodes, bootstrapScriptResp.nodes) &&
            Objects.equals(this.activeMaster, bootstrapScriptResp.activeMaster) &&
            Objects.equals(this.failAction, bootstrapScriptResp.failAction) &&
            Objects.equals(this.beforeComponentStart, bootstrapScriptResp.beforeComponentStart) &&
            Objects.equals(this.startTime, bootstrapScriptResp.startTime) &&
            Objects.equals(this.state, bootstrapScriptResp.state);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, uri, parameters, nodes, activeMaster, failAction, beforeComponentStart, startTime, state);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BootstrapScriptResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    activeMaster: ").append(toIndentedString(activeMaster)).append("\n");
        sb.append("    failAction: ").append(toIndentedString(failAction)).append("\n");
        sb.append("    beforeComponentStart: ").append(toIndentedString(beforeComponentStart)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

