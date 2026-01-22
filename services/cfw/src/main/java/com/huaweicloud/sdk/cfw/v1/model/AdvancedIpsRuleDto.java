package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdvancedIpsRuleDto
 */
public class AdvancedIpsRuleDto {

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
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param")

    private String param;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public AdvancedIpsRuleDto withAction(Integer action) {
        this.action = action;
        return this;
    }

    /**
     * 动作：0表示仅记录日志、1表示拦截session、2表示拦截ip
     * minimum: 0
     * maximum: 2
     * @return action
     */
    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public AdvancedIpsRuleDto withIpsRuleId(String ipsRuleId) {
        this.ipsRuleId = ipsRuleId;
        return this;
    }

    /**
     * 高级ips规则id
     * @return ipsRuleId
     */
    public String getIpsRuleId() {
        return ipsRuleId;
    }

    public void setIpsRuleId(String ipsRuleId) {
        this.ipsRuleId = ipsRuleId;
    }

    public AdvancedIpsRuleDto withIpsRuleType(Integer ipsRuleType) {
        this.ipsRuleType = ipsRuleType;
        return this;
    }

    /**
     * ips规则类型：0表示敏感目录扫描、1表示反弹xshell
     * minimum: 0
     * maximum: 1
     * @return ipsRuleType
     */
    public Integer getIpsRuleType() {
        return ipsRuleType;
    }

    public void setIpsRuleType(Integer ipsRuleType) {
        this.ipsRuleType = ipsRuleType;
    }

    public AdvancedIpsRuleDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public AdvancedIpsRuleDto withParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * 包含特殊参数的JSON字符串
     * @return param
     */
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public AdvancedIpsRuleDto withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 频率ips规则状态，0表示关闭，1表示打开
     * minimum: 0
     * maximum: 1
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
        AdvancedIpsRuleDto that = (AdvancedIpsRuleDto) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.ipsRuleId, that.ipsRuleId)
            && Objects.equals(this.ipsRuleType, that.ipsRuleType) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.param, that.param) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, ipsRuleId, ipsRuleType, objectId, param, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedIpsRuleDto {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    ipsRuleId: ").append(toIndentedString(ipsRuleId)).append("\n");
        sb.append("    ipsRuleType: ").append(toIndentedString(ipsRuleType)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
