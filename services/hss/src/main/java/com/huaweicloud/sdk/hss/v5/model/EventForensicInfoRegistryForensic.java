package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 注册表取证信息 **取值范围**： 不涉及
 */
public class EventForensicInfoRegistryForensic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reg_key")

    private String regKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reg_value")

    private String regValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reg_new_key")

    private String regNewKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reg_op_type")

    private String regOpType;

    public EventForensicInfoRegistryForensic withRegKey(String regKey) {
        this.regKey = regKey;
        return this;
    }

    /**
     * **参数解释**： 注册表KEY **取值范围**： 不涉及
     * @return regKey
     */
    public String getRegKey() {
        return regKey;
    }

    public void setRegKey(String regKey) {
        this.regKey = regKey;
    }

    public EventForensicInfoRegistryForensic withRegValue(String regValue) {
        this.regValue = regValue;
        return this;
    }

    /**
     * **参数解释**： 注册表VALUE **取值范围**： 不涉及
     * @return regValue
     */
    public String getRegValue() {
        return regValue;
    }

    public void setRegValue(String regValue) {
        this.regValue = regValue;
    }

    public EventForensicInfoRegistryForensic withRegNewKey(String regNewKey) {
        this.regNewKey = regNewKey;
        return this;
    }

    /**
     * **参数解释**： 注册表新KEY **取值范围**： 不涉及
     * @return regNewKey
     */
    public String getRegNewKey() {
        return regNewKey;
    }

    public void setRegNewKey(String regNewKey) {
        this.regNewKey = regNewKey;
    }

    public EventForensicInfoRegistryForensic withRegOpType(String regOpType) {
        this.regOpType = regOpType;
        return this;
    }

    /**
     * **参数解释**： 注册表KEY/VALUE操作类型 **取值范围**： 不涉及
     * @return regOpType
     */
    public String getRegOpType() {
        return regOpType;
    }

    public void setRegOpType(String regOpType) {
        this.regOpType = regOpType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfoRegistryForensic that = (EventForensicInfoRegistryForensic) obj;
        return Objects.equals(this.regKey, that.regKey) && Objects.equals(this.regValue, that.regValue)
            && Objects.equals(this.regNewKey, that.regNewKey) && Objects.equals(this.regOpType, that.regOpType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regKey, regValue, regNewKey, regOpType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfoRegistryForensic {\n");
        sb.append("    regKey: ").append(toIndentedString(regKey)).append("\n");
        sb.append("    regValue: ").append(toIndentedString(regValue)).append("\n");
        sb.append("    regNewKey: ").append(toIndentedString(regNewKey)).append("\n");
        sb.append("    regOpType: ").append(toIndentedString(regOpType)).append("\n");
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
