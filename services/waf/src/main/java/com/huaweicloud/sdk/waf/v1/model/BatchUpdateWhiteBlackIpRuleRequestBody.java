package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新黑白名单规则请求体，其中请求体中必须包含name、white以及addr或者ip_group_id中一个
 */
public class BatchUpdateWhiteBlackIpRuleRequestBody {

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
    @JsonProperty(value = "policy_rule_ids")

    private List<PolicyRuleIdRequestBodyPolicyRuleIds> policyRuleIds = null;

    public BatchUpdateWhiteBlackIpRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 黑白名单规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchUpdateWhiteBlackIpRuleRequestBody withAddr(String addr) {
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

    public BatchUpdateWhiteBlackIpRuleRequestBody withDescription(String description) {
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

    public BatchUpdateWhiteBlackIpRuleRequestBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * 防护动作：  - 0 拦截  - 1 放行  - 2 仅记录
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public BatchUpdateWhiteBlackIpRuleRequestBody withIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    /**
     * 创建的Ip地址组id，该参数与addr参数使用一个即可；Ip地址组可在控制台中对象管理->地址组管理中添加。
     * @return ipGroupId
     */
    public String getIpGroupId() {
        return ipGroupId;
    }

    public void setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
    }

    public BatchUpdateWhiteBlackIpRuleRequestBody withTimeMode(String timeMode) {
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

    public BatchUpdateWhiteBlackIpRuleRequestBody withStart(Integer start) {
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

    public BatchUpdateWhiteBlackIpRuleRequestBody withTerminal(Integer terminal) {
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

    public BatchUpdateWhiteBlackIpRuleRequestBody withPolicyRuleIds(
        List<PolicyRuleIdRequestBodyPolicyRuleIds> policyRuleIds) {
        this.policyRuleIds = policyRuleIds;
        return this;
    }

    public BatchUpdateWhiteBlackIpRuleRequestBody addPolicyRuleIdsItem(
        PolicyRuleIdRequestBodyPolicyRuleIds policyRuleIdsItem) {
        if (this.policyRuleIds == null) {
            this.policyRuleIds = new ArrayList<>();
        }
        this.policyRuleIds.add(policyRuleIdsItem);
        return this;
    }

    public BatchUpdateWhiteBlackIpRuleRequestBody withPolicyRuleIds(
        Consumer<List<PolicyRuleIdRequestBodyPolicyRuleIds>> policyRuleIdsSetter) {
        if (this.policyRuleIds == null) {
            this.policyRuleIds = new ArrayList<>();
        }
        policyRuleIdsSetter.accept(this.policyRuleIds);
        return this;
    }

    /**
     * **参数解释：** 策略和规则id数组，关联防护策略与对应的规则集合 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyRuleIds
     */
    public List<PolicyRuleIdRequestBodyPolicyRuleIds> getPolicyRuleIds() {
        return policyRuleIds;
    }

    public void setPolicyRuleIds(List<PolicyRuleIdRequestBodyPolicyRuleIds> policyRuleIds) {
        this.policyRuleIds = policyRuleIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateWhiteBlackIpRuleRequestBody that = (BatchUpdateWhiteBlackIpRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.addr, that.addr)
            && Objects.equals(this.description, that.description) && Objects.equals(this.white, that.white)
            && Objects.equals(this.ipGroupId, that.ipGroupId) && Objects.equals(this.timeMode, that.timeMode)
            && Objects.equals(this.start, that.start) && Objects.equals(this.terminal, that.terminal)
            && Objects.equals(this.policyRuleIds, that.policyRuleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addr, description, white, ipGroupId, timeMode, start, terminal, policyRuleIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateWhiteBlackIpRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
        sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
        sb.append("    policyRuleIds: ").append(toIndentedString(policyRuleIds)).append("\n");
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
