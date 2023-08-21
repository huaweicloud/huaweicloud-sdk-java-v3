package com.huaweicloud.sdk.edgesec.v1.model;

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
public class ApplyWafPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private WafPolicyAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private WafPolicyOption options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_detection")

    private Boolean fullDetection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_action")

    private WafPolicyAction robotAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_host")

    private List<WafPolicyBindHost> bindHost = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Map<String, String> extend = null;

    public ApplyWafPolicyResponse withId(String id) {
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

    public ApplyWafPolicyResponse withName(String name) {
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

    public ApplyWafPolicyResponse withAction(WafPolicyAction action) {
        this.action = action;
        return this;
    }

    public ApplyWafPolicyResponse withAction(Consumer<WafPolicyAction> actionSetter) {
        if (this.action == null) {
            this.action = new WafPolicyAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public WafPolicyAction getAction() {
        return action;
    }

    public void setAction(WafPolicyAction action) {
        this.action = action;
    }

    public ApplyWafPolicyResponse withOptions(WafPolicyOption options) {
        this.options = options;
        return this;
    }

    public ApplyWafPolicyResponse withOptions(Consumer<WafPolicyOption> optionsSetter) {
        if (this.options == null) {
            this.options = new WafPolicyOption();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public WafPolicyOption getOptions() {
        return options;
    }

    public void setOptions(WafPolicyOption options) {
        this.options = options;
    }

    public ApplyWafPolicyResponse withLevel(Integer level) {
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

    public ApplyWafPolicyResponse withFullDetection(Boolean fullDetection) {
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

    public ApplyWafPolicyResponse withRobotAction(WafPolicyAction robotAction) {
        this.robotAction = robotAction;
        return this;
    }

    public ApplyWafPolicyResponse withRobotAction(Consumer<WafPolicyAction> robotActionSetter) {
        if (this.robotAction == null) {
            this.robotAction = new WafPolicyAction();
            robotActionSetter.accept(this.robotAction);
        }

        return this;
    }

    /**
     * Get robotAction
     * @return robotAction
     */
    public WafPolicyAction getRobotAction() {
        return robotAction;
    }

    public void setRobotAction(WafPolicyAction robotAction) {
        this.robotAction = robotAction;
    }

    public ApplyWafPolicyResponse withBindHost(List<WafPolicyBindHost> bindHost) {
        this.bindHost = bindHost;
        return this;
    }

    public ApplyWafPolicyResponse addBindHostItem(WafPolicyBindHost bindHostItem) {
        if (this.bindHost == null) {
            this.bindHost = new ArrayList<>();
        }
        this.bindHost.add(bindHostItem);
        return this;
    }

    public ApplyWafPolicyResponse withBindHost(Consumer<List<WafPolicyBindHost>> bindHostSetter) {
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
    public List<WafPolicyBindHost> getBindHost() {
        return bindHost;
    }

    public void setBindHost(List<WafPolicyBindHost> bindHost) {
        this.bindHost = bindHost;
    }

    public ApplyWafPolicyResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建防护策略的时间
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ApplyWafPolicyResponse withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public ApplyWafPolicyResponse putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public ApplyWafPolicyResponse withExtend(Consumer<Map<String, String>> extendSetter) {
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
        ApplyWafPolicyResponse that = (ApplyWafPolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.action, that.action) && Objects.equals(this.options, that.options)
            && Objects.equals(this.level, that.level) && Objects.equals(this.fullDetection, that.fullDetection)
            && Objects.equals(this.robotAction, that.robotAction) && Objects.equals(this.bindHost, that.bindHost)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.extend, that.extend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, action, options, level, fullDetection, robotAction, bindHost, timestamp, extend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyWafPolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    fullDetection: ").append(toIndentedString(fullDetection)).append("\n");
        sb.append("    robotAction: ").append(toIndentedString(robotAction)).append("\n");
        sb.append("    bindHost: ").append(toIndentedString(bindHost)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
