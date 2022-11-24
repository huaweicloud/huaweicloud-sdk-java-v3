package com.huaweicloud.sdk.dwr.v3.model;

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
 * 创建工作流的请求Body
 */
public class CreateWorkflowRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "states")

    private List<State> states = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<Input> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 工作流执行类型：同步（EXPRESS）、异步（NORMAL）
     */
    public static final class ModeEnum {

        /**
         * Enum EXPRESS for value: "EXPRESS"
         */
        public static final ModeEnum EXPRESS = new ModeEnum("EXPRESS");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final ModeEnum NORMAL = new ModeEnum("NORMAL");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("EXPRESS", EXPRESS);
            map.put("NORMAL", NORMAL);
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
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModeEnum(value);
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "express_config")

    private ExpressConfig expressConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_vpc")

    private FuncVpc funcVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    public CreateWorkflowRequestBody withStates(List<State> states) {
        this.states = states;
        return this;
    }

    public CreateWorkflowRequestBody addStatesItem(State statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public CreateWorkflowRequestBody withStates(Consumer<List<State>> statesSetter) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /**
     * 工作流的编排定义,必须有TYPE，TYPE值必须是3种State（DELAY，OPERATION，END）中一种。每个state的名字是1-80长度的只含数字，字母，-和_的String。
     * @return states
     */
    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public CreateWorkflowRequestBody withInputs(List<Input> inputs) {
        this.inputs = inputs;
        return this;
    }

    public CreateWorkflowRequestBody addInputsItem(Input inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public CreateWorkflowRequestBody withInputs(Consumer<List<Input>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 工作流中用户可修改的参数项
     * @return inputs
     */
    public List<Input> getInputs() {
        return inputs;
    }

    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    public CreateWorkflowRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作流的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWorkflowRequestBody withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 工作流执行类型：同步（EXPRESS）、异步（NORMAL）
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public CreateWorkflowRequestBody withExpressConfig(ExpressConfig expressConfig) {
        this.expressConfig = expressConfig;
        return this;
    }

    public CreateWorkflowRequestBody withExpressConfig(Consumer<ExpressConfig> expressConfigSetter) {
        if (this.expressConfig == null) {
            this.expressConfig = new ExpressConfig();
            expressConfigSetter.accept(this.expressConfig);
        }

        return this;
    }

    /**
     * Get expressConfig
     * @return expressConfig
     */
    public ExpressConfig getExpressConfig() {
        return expressConfig;
    }

    public void setExpressConfig(ExpressConfig expressConfig) {
        this.expressConfig = expressConfig;
    }

    public CreateWorkflowRequestBody withFuncVpc(FuncVpc funcVpc) {
        this.funcVpc = funcVpc;
        return this;
    }

    public CreateWorkflowRequestBody withFuncVpc(Consumer<FuncVpc> funcVpcSetter) {
        if (this.funcVpc == null) {
            this.funcVpc = new FuncVpc();
            funcVpcSetter.accept(this.funcVpc);
        }

        return this;
    }

    /**
     * Get funcVpc
     * @return funcVpc
     */
    public FuncVpc getFuncVpc() {
        return funcVpc;
    }

    public void setFuncVpc(FuncVpc funcVpc) {
        this.funcVpc = funcVpc;
    }

    public CreateWorkflowRequestBody withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 用戶传入用于创建工作流时使用的委托的委托名
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWorkflowRequestBody createWorkflowRequestBody = (CreateWorkflowRequestBody) o;
        return Objects.equals(this.states, createWorkflowRequestBody.states)
            && Objects.equals(this.inputs, createWorkflowRequestBody.inputs)
            && Objects.equals(this.description, createWorkflowRequestBody.description)
            && Objects.equals(this.mode, createWorkflowRequestBody.mode)
            && Objects.equals(this.expressConfig, createWorkflowRequestBody.expressConfig)
            && Objects.equals(this.funcVpc, createWorkflowRequestBody.funcVpc)
            && Objects.equals(this.agency, createWorkflowRequestBody.agency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(states, inputs, description, mode, expressConfig, funcVpc, agency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkflowRequestBody {\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    expressConfig: ").append(toIndentedString(expressConfig)).append("\n");
        sb.append("    funcVpc: ").append(toIndentedString(funcVpc)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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
