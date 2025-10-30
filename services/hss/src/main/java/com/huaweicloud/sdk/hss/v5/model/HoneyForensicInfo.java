package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 蜜罐相关取证信息
 */
public class HoneyForensicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_ip")

    private String attackIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sandbox_name")

    private String sandboxName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private String attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_method_desc")

    private String attackMethodDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_desc")

    private String attackDesc;

    public HoneyForensicInfo withAttackIp(String attackIp) {
        this.attackIp = attackIp;
        return this;
    }

    /**
     * **参数解释**： 攻击源 IP **取值范围**： 不涉及
     * @return attackIp
     */
    public String getAttackIp() {
        return attackIp;
    }

    public void setAttackIp(String attackIp) {
        this.attackIp = attackIp;
    }

    public HoneyForensicInfo withSandboxName(String sandboxName) {
        this.sandboxName = sandboxName;
        return this;
    }

    /**
     * **参数解释**： 隔离沙箱名称 **取值范围**： 不涉及
     * @return sandboxName
     */
    public String getSandboxName() {
        return sandboxName;
    }

    public void setSandboxName(String sandboxName) {
        this.sandboxName = sandboxName;
    }

    public HoneyForensicInfo withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * **参数解释**： 欺骗服务 **取值范围**： 不涉及
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public HoneyForensicInfo withAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }

    /**
     * **参数解释**： 攻击类型 **取值范围**： - probe：探测 - invade：入侵
     * @return attackType
     */
    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public HoneyForensicInfo withAttackMethodDesc(String attackMethodDesc) {
        this.attackMethodDesc = attackMethodDesc;
        return this;
    }

    /**
     * **参数解释**： 攻击手法 **取值范围**： 不涉及
     * @return attackMethodDesc
     */
    public String getAttackMethodDesc() {
        return attackMethodDesc;
    }

    public void setAttackMethodDesc(String attackMethodDesc) {
        this.attackMethodDesc = attackMethodDesc;
    }

    public HoneyForensicInfo withAttackDesc(String attackDesc) {
        this.attackDesc = attackDesc;
        return this;
    }

    /**
     * **参数解释**： 攻击行为 **取值范围**： 不涉及
     * @return attackDesc
     */
    public String getAttackDesc() {
        return attackDesc;
    }

    public void setAttackDesc(String attackDesc) {
        this.attackDesc = attackDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HoneyForensicInfo that = (HoneyForensicInfo) obj;
        return Objects.equals(this.attackIp, that.attackIp) && Objects.equals(this.sandboxName, that.sandboxName)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.attackType, that.attackType)
            && Objects.equals(this.attackMethodDesc, that.attackMethodDesc)
            && Objects.equals(this.attackDesc, that.attackDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackIp, sandboxName, serviceName, attackType, attackMethodDesc, attackDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HoneyForensicInfo {\n");
        sb.append("    attackIp: ").append(toIndentedString(attackIp)).append("\n");
        sb.append("    sandboxName: ").append(toIndentedString(sandboxName)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    attackMethodDesc: ").append(toIndentedString(attackMethodDesc)).append("\n");
        sb.append("    attackDesc: ").append(toIndentedString(attackDesc)).append("\n");
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
