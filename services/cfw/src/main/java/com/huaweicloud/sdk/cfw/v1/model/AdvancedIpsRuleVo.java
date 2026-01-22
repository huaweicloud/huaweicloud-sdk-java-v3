package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdvancedIpsRuleVo
 */
public class AdvancedIpsRuleVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private Integer action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_rule_id")

    private String ipsRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_rule_type")

    private Integer ipsRuleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param")

    private String param;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public AdvancedIpsRuleVo withAction(Integer action) {
        this.action = action;
        return this;
    }

    /**
     * 动作：0表示仅记录日志、1表示拦截session、2表示拦截ip
     * @return action
     */
    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public AdvancedIpsRuleVo withIpsRuleId(String ipsRuleId) {
        this.ipsRuleId = ipsRuleId;
        return this;
    }

    /**
     * 频率ips规则id
     * @return ipsRuleId
     */
    public String getIpsRuleId() {
        return ipsRuleId;
    }

    public void setIpsRuleId(String ipsRuleId) {
        this.ipsRuleId = ipsRuleId;
    }

    public AdvancedIpsRuleVo withIpsRuleType(Integer ipsRuleType) {
        this.ipsRuleType = ipsRuleType;
        return this;
    }

    /**
     * ips规则类型：0表示敏感目录扫描、1表示反弹shell
     * @return ipsRuleType
     */
    public Integer getIpsRuleType() {
        return ipsRuleType;
    }

    public void setIpsRuleType(Integer ipsRuleType) {
        this.ipsRuleType = ipsRuleType;
    }

    public AdvancedIpsRuleVo withParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * 频率ips定义JSON字符串
     * @return param
     */
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public AdvancedIpsRuleVo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 频率ips规则状态，0表示关闭，1表示开启
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdvancedIpsRuleVo that = (AdvancedIpsRuleVo) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.ipsRuleId, that.ipsRuleId)
            && Objects.equals(this.ipsRuleType, that.ipsRuleType) && Objects.equals(this.param, that.param)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, ipsRuleId, ipsRuleType, param, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedIpsRuleVo {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    ipsRuleId: ").append(toIndentedString(ipsRuleId)).append("\n");
        sb.append("    ipsRuleType: ").append(toIndentedString(ipsRuleType)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
