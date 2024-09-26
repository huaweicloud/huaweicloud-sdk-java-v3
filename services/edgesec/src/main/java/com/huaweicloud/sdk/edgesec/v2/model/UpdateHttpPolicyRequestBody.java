package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateHttpPolicyRequestBody
 */
public class UpdateHttpPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private HttpPolicyAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private HttpPolicyOption options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_detection")

    private Boolean fullDetection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_action")

    private HttpPolicyAction robotAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_bot_options")

    private HttpThirdBotOptions thirdBotOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Map<String, String> extend = null;

    public UpdateHttpPolicyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 防护策略名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateHttpPolicyRequestBody withAction(HttpPolicyAction action) {
        this.action = action;
        return this;
    }

    public UpdateHttpPolicyRequestBody withAction(Consumer<HttpPolicyAction> actionSetter) {
        if (this.action == null) {
            this.action = new HttpPolicyAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public HttpPolicyAction getAction() {
        return action;
    }

    public void setAction(HttpPolicyAction action) {
        this.action = action;
    }

    public UpdateHttpPolicyRequestBody withOptions(HttpPolicyOption options) {
        this.options = options;
        return this;
    }

    public UpdateHttpPolicyRequestBody withOptions(Consumer<HttpPolicyOption> optionsSetter) {
        if (this.options == null) {
            this.options = new HttpPolicyOption();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public HttpPolicyOption getOptions() {
        return options;
    }

    public void setOptions(HttpPolicyOption options) {
        this.options = options;
    }

    public UpdateHttpPolicyRequestBody withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 防护等级
     * minimum: 1
     * maximum: 3
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public UpdateHttpPolicyRequestBody withFullDetection(Boolean fullDetection) {
        this.fullDetection = fullDetection;
        return this;
    }

    /**
     * 精准防护中的检测模式
     * @return fullDetection
     */
    public Boolean getFullDetection() {
        return fullDetection;
    }

    public void setFullDetection(Boolean fullDetection) {
        this.fullDetection = fullDetection;
    }

    public UpdateHttpPolicyRequestBody withRobotAction(HttpPolicyAction robotAction) {
        this.robotAction = robotAction;
        return this;
    }

    public UpdateHttpPolicyRequestBody withRobotAction(Consumer<HttpPolicyAction> robotActionSetter) {
        if (this.robotAction == null) {
            this.robotAction = new HttpPolicyAction();
            robotActionSetter.accept(this.robotAction);
        }

        return this;
    }

    /**
     * Get robotAction
     * @return robotAction
     */
    public HttpPolicyAction getRobotAction() {
        return robotAction;
    }

    public void setRobotAction(HttpPolicyAction robotAction) {
        this.robotAction = robotAction;
    }

    public UpdateHttpPolicyRequestBody withThirdBotOptions(HttpThirdBotOptions thirdBotOptions) {
        this.thirdBotOptions = thirdBotOptions;
        return this;
    }

    public UpdateHttpPolicyRequestBody withThirdBotOptions(Consumer<HttpThirdBotOptions> thirdBotOptionsSetter) {
        if (this.thirdBotOptions == null) {
            this.thirdBotOptions = new HttpThirdBotOptions();
            thirdBotOptionsSetter.accept(this.thirdBotOptions);
        }

        return this;
    }

    /**
     * Get thirdBotOptions
     * @return thirdBotOptions
     */
    public HttpThirdBotOptions getThirdBotOptions() {
        return thirdBotOptions;
    }

    public void setThirdBotOptions(HttpThirdBotOptions thirdBotOptions) {
        this.thirdBotOptions = thirdBotOptions;
    }

    public UpdateHttpPolicyRequestBody withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public UpdateHttpPolicyRequestBody putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public UpdateHttpPolicyRequestBody withExtend(Consumer<Map<String, String>> extendSetter) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }

    /**
     * 扩展字段
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHttpPolicyRequestBody that = (UpdateHttpPolicyRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.action, that.action)
            && Objects.equals(this.options, that.options) && Objects.equals(this.level, that.level)
            && Objects.equals(this.fullDetection, that.fullDetection)
            && Objects.equals(this.robotAction, that.robotAction)
            && Objects.equals(this.thirdBotOptions, that.thirdBotOptions) && Objects.equals(this.extend, that.extend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, action, options, level, fullDetection, robotAction, thirdBotOptions, extend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpPolicyRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    fullDetection: ").append(toIndentedString(fullDetection)).append("\n");
        sb.append("    robotAction: ").append(toIndentedString(robotAction)).append("\n");
        sb.append("    thirdBotOptions: ").append(toIndentedString(thirdBotOptions)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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
