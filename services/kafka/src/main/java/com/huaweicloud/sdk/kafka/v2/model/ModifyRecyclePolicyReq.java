package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyRecyclePolicyReq
 */
public class ModifyRecyclePolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_use_recycle")

    private Boolean defaultUseRecycle;

    public ModifyRecyclePolicyReq withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * **参数解释**： 保留天数。 **约束限制**： 不涉及。 **取值范围**： 1~7天。 **默认取值**： 不涉及
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public ModifyRecyclePolicyReq withDefaultUseRecycle(Boolean defaultUseRecycle) {
        this.defaultUseRecycle = defaultUseRecycle;
        return this;
    }

    /**
     * **参数解释**： 是否使用回收站。  **约束限制**： 不涉及。 **取值范围**： - true：使用回收站。 - false：不使用回收站。 **默认取值**： 不涉及
     * @return defaultUseRecycle
     */
    public Boolean getDefaultUseRecycle() {
        return defaultUseRecycle;
    }

    public void setDefaultUseRecycle(Boolean defaultUseRecycle) {
        this.defaultUseRecycle = defaultUseRecycle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyRecyclePolicyReq that = (ModifyRecyclePolicyReq) obj;
        return Objects.equals(this.retentionDays, that.retentionDays)
            && Objects.equals(this.defaultUseRecycle, that.defaultUseRecycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retentionDays, defaultUseRecycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyRecyclePolicyReq {\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("    defaultUseRecycle: ").append(toIndentedString(defaultUseRecycle)).append("\n");
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
