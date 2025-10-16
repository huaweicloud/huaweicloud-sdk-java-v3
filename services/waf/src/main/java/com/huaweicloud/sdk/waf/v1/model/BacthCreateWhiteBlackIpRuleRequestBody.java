package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建黑白名单规则body
 */
public class BacthCreateWhiteBlackIpRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group_id")

    private String ipGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_mode")

    private String timeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal")

    private Integer terminal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_ids")

    private List<String> policyIds = null;

    public BacthCreateWhiteBlackIpRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称只能由字母、数字、-、_和.组成，长度不能超过64个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * 黑白名单ip地址，需要输入标准的ip地址或地址段，例如：42.123.120.66或42.123.120.0/16
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 黑白名单规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * 防护动作：  - 0 拦截  - 1 放行   - 2 仅记录
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody withIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    /**
     * 创建的Ip地址组id，该参数与addr参数只能使用一个；Ip地址组可在控制台中对象管理->地址组管理中添加。
     * @return ipGroupId
     */
    public String getIpGroupId() {
        return ipGroupId;
    }

    public void setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody withTimeMode(String timeMode) {
        this.timeMode = timeMode;
        return this;
    }

    /**
     * 生效模式，默认为permanent（立即生效）,创建自定义生效规则时请输入：customize
     * @return timeMode
     */
    public String getTimeMode() {
        return timeMode;
    }

    public void setTimeMode(String timeMode) {
        this.timeMode = timeMode;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 规则生效开始时间，生效模式为自定义时，此字段才有效，请输入时间戳
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody withTerminal(Integer terminal) {
        this.terminal = terminal;
        return this;
    }

    /**
     * 规则生效结束时间，生效模式为自定义时，此字段才有效，请输入时间戳
     * @return terminal
     */
    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody withPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody addPolicyIdsItem(String policyIdsItem) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        this.policyIds.add(policyIdsItem);
        return this;
    }

    public BacthCreateWhiteBlackIpRuleRequestBody withPolicyIds(Consumer<List<String>> policyIdsSetter) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        policyIdsSetter.accept(this.policyIds);
        return this;
    }

    /**
     * 策略id
     * @return policyIds
     */
    public List<String> getPolicyIds() {
        return policyIds;
    }

    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BacthCreateWhiteBlackIpRuleRequestBody that = (BacthCreateWhiteBlackIpRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.addr, that.addr)
            && Objects.equals(this.description, that.description) && Objects.equals(this.white, that.white)
            && Objects.equals(this.ipGroupId, that.ipGroupId) && Objects.equals(this.timeMode, that.timeMode)
            && Objects.equals(this.start, that.start) && Objects.equals(this.terminal, that.terminal)
            && Objects.equals(this.policyIds, that.policyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addr, description, white, ipGroupId, timeMode, start, terminal, policyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BacthCreateWhiteBlackIpRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
        sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
        sb.append("    policyIds: ").append(toIndentedString(policyIds)).append("\n");
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
