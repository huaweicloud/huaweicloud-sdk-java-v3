package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateHttpPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_detection")

    private Boolean fullDetection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private HttpPolicyAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_action")

    private HttpPolicyAction robotAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private HttpPolicyOption options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_host")

    private List<HttpPolicyBindHost> bindHost = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Map<String, String> extend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_bot_options")

    private Map<String, Object> thirdBotOptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wap_managed_ruleset_id")

    private String wapManagedRulesetId;

    public UpdateHttpPolicyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 防护策略id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateHttpPolicyResponse withName(String name) {
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

    public UpdateHttpPolicyResponse withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 防护等级
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public UpdateHttpPolicyResponse withFullDetection(Boolean fullDetection) {
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

    public UpdateHttpPolicyResponse withAction(HttpPolicyAction action) {
        this.action = action;
        return this;
    }

    public UpdateHttpPolicyResponse withAction(Consumer<HttpPolicyAction> actionSetter) {
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

    public UpdateHttpPolicyResponse withRobotAction(HttpPolicyAction robotAction) {
        this.robotAction = robotAction;
        return this;
    }

    public UpdateHttpPolicyResponse withRobotAction(Consumer<HttpPolicyAction> robotActionSetter) {
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

    public UpdateHttpPolicyResponse withOptions(HttpPolicyOption options) {
        this.options = options;
        return this;
    }

    public UpdateHttpPolicyResponse withOptions(Consumer<HttpPolicyOption> optionsSetter) {
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

    public UpdateHttpPolicyResponse withBindHost(List<HttpPolicyBindHost> bindHost) {
        this.bindHost = bindHost;
        return this;
    }

    public UpdateHttpPolicyResponse addBindHostItem(HttpPolicyBindHost bindHostItem) {
        if (this.bindHost == null) {
            this.bindHost = new ArrayList<>();
        }
        this.bindHost.add(bindHostItem);
        return this;
    }

    public UpdateHttpPolicyResponse withBindHost(Consumer<List<HttpPolicyBindHost>> bindHostSetter) {
        if (this.bindHost == null) {
            this.bindHost = new ArrayList<>();
        }
        bindHostSetter.accept(this.bindHost);
        return this;
    }

    /**
     * 防护域名的信息
     * @return bindHost
     */
    public List<HttpPolicyBindHost> getBindHost() {
        return bindHost;
    }

    public void setBindHost(List<HttpPolicyBindHost> bindHost) {
        this.bindHost = bindHost;
    }

    public UpdateHttpPolicyResponse withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public UpdateHttpPolicyResponse putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public UpdateHttpPolicyResponse withExtend(Consumer<Map<String, String>> extendSetter) {
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

    public UpdateHttpPolicyResponse withThirdBotOptions(Map<String, Object> thirdBotOptions) {
        this.thirdBotOptions = thirdBotOptions;
        return this;
    }

    public UpdateHttpPolicyResponse putThirdBotOptionsItem(String key, Object thirdBotOptionsItem) {
        if (this.thirdBotOptions == null) {
            this.thirdBotOptions = new HashMap<>();
        }
        this.thirdBotOptions.put(key, thirdBotOptionsItem);
        return this;
    }

    public UpdateHttpPolicyResponse withThirdBotOptions(Consumer<Map<String, Object>> thirdBotOptionsSetter) {
        if (this.thirdBotOptions == null) {
            this.thirdBotOptions = new HashMap<>();
        }
        thirdBotOptionsSetter.accept(this.thirdBotOptions);
        return this;
    }

    /**
     * 三方BOT操作
     * @return thirdBotOptions
     */
    public Map<String, Object> getThirdBotOptions() {
        return thirdBotOptions;
    }

    public void setThirdBotOptions(Map<String, Object> thirdBotOptions) {
        this.thirdBotOptions = thirdBotOptions;
    }

    public UpdateHttpPolicyResponse withWapManagedRulesetId(String wapManagedRulesetId) {
        this.wapManagedRulesetId = wapManagedRulesetId;
        return this;
    }

    /**
     * web基础防护托管规则集id
     * @return wapManagedRulesetId
     */
    public String getWapManagedRulesetId() {
        return wapManagedRulesetId;
    }

    public void setWapManagedRulesetId(String wapManagedRulesetId) {
        this.wapManagedRulesetId = wapManagedRulesetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHttpPolicyResponse that = (UpdateHttpPolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.level, that.level) && Objects.equals(this.fullDetection, that.fullDetection)
            && Objects.equals(this.action, that.action) && Objects.equals(this.robotAction, that.robotAction)
            && Objects.equals(this.options, that.options) && Objects.equals(this.bindHost, that.bindHost)
            && Objects.equals(this.extend, that.extend) && Objects.equals(this.thirdBotOptions, that.thirdBotOptions)
            && Objects.equals(this.wapManagedRulesetId, that.wapManagedRulesetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            level,
            fullDetection,
            action,
            robotAction,
            options,
            bindHost,
            extend,
            thirdBotOptions,
            wapManagedRulesetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpPolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    fullDetection: ").append(toIndentedString(fullDetection)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    robotAction: ").append(toIndentedString(robotAction)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    bindHost: ").append(toIndentedString(bindHost)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    thirdBotOptions: ").append(toIndentedString(thirdBotOptions)).append("\n");
        sb.append("    wapManagedRulesetId: ").append(toIndentedString(wapManagedRulesetId)).append("\n");
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
