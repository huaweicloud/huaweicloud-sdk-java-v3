package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
public class UpdatePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    @JacksonXmlProperty(localName = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_detection")

    @JacksonXmlProperty(localName = "full_detection")

    private Boolean fullDetection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_action")

    @JacksonXmlProperty(localName = "robot_action")

    private Action robotAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    @JacksonXmlProperty(localName = "action")

    private PolicyAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    @JacksonXmlProperty(localName = "options")

    private PolicyOption options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modulex_options")

    @JacksonXmlProperty(localName = "modulex_options")

    private Map<String, Object> modulexOptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    @JacksonXmlProperty(localName = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_host")

    @JacksonXmlProperty(localName = "bind_host")

    private List<BindHost> bindHost = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    @JacksonXmlProperty(localName = "extend")

    private Map<String, String> extend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    @JacksonXmlProperty(localName = "timestamp")

    private Long timestamp;

    public UpdatePolicyResponse withId(String id) {
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

    public UpdatePolicyResponse withName(String name) {
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

    public UpdatePolicyResponse withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * Web基础防护等级   - 1 : 宽松，防护粒度较粗，只拦截攻击特征比较明显的请求。当误报情况较多的场景下，建议选择“宽松”模式。   - 2：中等，默认为“中等”防护模式，满足大多数场景下的Web防护需求。   - 3：严格，防护粒度最精细，可以拦截具有复杂的绕过特征的攻击请求，例如jolokia网络攻击、探测CGI漏洞、探测 Druid SQL注入攻击
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public UpdatePolicyResponse withFullDetection(Boolean fullDetection) {
        this.fullDetection = fullDetection;
        return this;
    }

    /**
     * 精准防护中的检测模式。   - false：短路检测，当用户的请求符合精准防护中的拦截条件时，便立刻终止检测，进行拦截   - true ：全检测，请求符合精准防护中的拦截条件时，全检测不会立即拦截，会继续执行其他防护的检测，最后进行拦截。
     * @return fullDetection
     */
    public Boolean getFullDetection() {
        return fullDetection;
    }

    public void setFullDetection(Boolean fullDetection) {
        this.fullDetection = fullDetection;
    }

    public UpdatePolicyResponse withRobotAction(Action robotAction) {
        this.robotAction = robotAction;
        return this;
    }

    public UpdatePolicyResponse withRobotAction(Consumer<Action> robotActionSetter) {
        if (this.robotAction == null) {
            this.robotAction = new Action();
            robotActionSetter.accept(this.robotAction);
        }

        return this;
    }

    /**
     * Get robotAction
     * @return robotAction
     */
    public Action getRobotAction() {
        return robotAction;
    }

    public void setRobotAction(Action robotAction) {
        this.robotAction = robotAction;
    }

    public UpdatePolicyResponse withAction(PolicyAction action) {
        this.action = action;
        return this;
    }

    public UpdatePolicyResponse withAction(Consumer<PolicyAction> actionSetter) {
        if (this.action == null) {
            this.action = new PolicyAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public PolicyAction getAction() {
        return action;
    }

    public void setAction(PolicyAction action) {
        this.action = action;
    }

    public UpdatePolicyResponse withOptions(PolicyOption options) {
        this.options = options;
        return this;
    }

    public UpdatePolicyResponse withOptions(Consumer<PolicyOption> optionsSetter) {
        if (this.options == null) {
            this.options = new PolicyOption();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PolicyOption getOptions() {
        return options;
    }

    public void setOptions(PolicyOption options) {
        this.options = options;
    }

    public UpdatePolicyResponse withModulexOptions(Map<String, Object> modulexOptions) {
        this.modulexOptions = modulexOptions;
        return this;
    }

    public UpdatePolicyResponse putModulexOptionsItem(String key, Object modulexOptionsItem) {
        if (this.modulexOptions == null) {
            this.modulexOptions = new HashMap<>();
        }
        this.modulexOptions.put(key, modulexOptionsItem);
        return this;
    }

    public UpdatePolicyResponse withModulexOptions(Consumer<Map<String, Object>> modulexOptionsSetter) {
        if (this.modulexOptions == null) {
            this.modulexOptions = new HashMap<>();
        }
        modulexOptionsSetter.accept(this.modulexOptions);
        return this;
    }

    /**
     * 智能访问控制防护项相关配置信息，目前该特性还处于公测阶段，只有部分局点支持该特性
     * @return modulexOptions
     */
    public Map<String, Object> getModulexOptions() {
        return modulexOptions;
    }

    public void setModulexOptions(Map<String, Object> modulexOptions) {
        this.modulexOptions = modulexOptions;
    }

    public UpdatePolicyResponse withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public UpdatePolicyResponse addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public UpdatePolicyResponse withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 与防护策略绑定的防护的域名id数组
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public UpdatePolicyResponse withBindHost(List<BindHost> bindHost) {
        this.bindHost = bindHost;
        return this;
    }

    public UpdatePolicyResponse addBindHostItem(BindHost bindHostItem) {
        if (this.bindHost == null) {
            this.bindHost = new ArrayList<>();
        }
        this.bindHost.add(bindHostItem);
        return this;
    }

    public UpdatePolicyResponse withBindHost(Consumer<List<BindHost>> bindHostSetter) {
        if (this.bindHost == null) {
            this.bindHost = new ArrayList<>();
        }
        bindHostSetter.accept(this.bindHost);
        return this;
    }

    /**
     * 与防护策略绑定的防护的域名信息数组，相对于hosts字段，包含更详细的域名信息
     * @return bindHost
     */
    public List<BindHost> getBindHost() {
        return bindHost;
    }

    public void setBindHost(List<BindHost> bindHost) {
        this.bindHost = bindHost;
    }

    public UpdatePolicyResponse withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    public UpdatePolicyResponse putExtendItem(String key, String extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public UpdatePolicyResponse withExtend(Consumer<Map<String, String>> extendSetter) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }

    /**
     * 扩展字段，用于存放Web基础防护中一些开关配置等信息
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    public UpdatePolicyResponse withTimestamp(Long timestamp) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePolicyResponse updatePolicyResponse = (UpdatePolicyResponse) o;
        return Objects.equals(this.id, updatePolicyResponse.id) && Objects.equals(this.name, updatePolicyResponse.name)
            && Objects.equals(this.level, updatePolicyResponse.level)
            && Objects.equals(this.fullDetection, updatePolicyResponse.fullDetection)
            && Objects.equals(this.robotAction, updatePolicyResponse.robotAction)
            && Objects.equals(this.action, updatePolicyResponse.action)
            && Objects.equals(this.options, updatePolicyResponse.options)
            && Objects.equals(this.modulexOptions, updatePolicyResponse.modulexOptions)
            && Objects.equals(this.hosts, updatePolicyResponse.hosts)
            && Objects.equals(this.bindHost, updatePolicyResponse.bindHost)
            && Objects.equals(this.extend, updatePolicyResponse.extend)
            && Objects.equals(this.timestamp, updatePolicyResponse.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            level,
            fullDetection,
            robotAction,
            action,
            options,
            modulexOptions,
            hosts,
            bindHost,
            extend,
            timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    fullDetection: ").append(toIndentedString(fullDetection)).append("\n");
        sb.append("    robotAction: ").append(toIndentedString(robotAction)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    modulexOptions: ").append(toIndentedString(modulexOptions)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    bindHost: ").append(toIndentedString(bindHost)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
