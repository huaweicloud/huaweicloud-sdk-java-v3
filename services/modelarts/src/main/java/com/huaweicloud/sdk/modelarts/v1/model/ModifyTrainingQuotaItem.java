package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：训练作业配额项。
 */
public class ModifyTrainingQuotaItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private String extraInfo;

    public ModifyTrainingQuotaItem withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * **参数解释**：配额的资源类型。 **约束限制**：不涉及。 **取值范围**：枚举值如下： - job-num: 作业个数配额 - visual-job-num: 可视化作业个数配额 - job-retention-enabled: 用户级作业自动老化开关 - job-num-quota-notify: 配额告警SMN通知配置 **默认取值**：不涉及。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public ModifyTrainingQuotaItem withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释**：配额个数。 **约束限制**：取值约束因资源类型而异：job-retention-enabled取值0（关闭）或1（开启）；job-num-quota-notify固定为0，通知主题URN存于extra_info；其余资源类型要求不小于1。 **取值范围**：0 ~ 2147483647。 **默认取值**：不涉及。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public ModifyTrainingQuotaItem withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释**：已使用的个数。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public ModifyTrainingQuotaItem withExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /**
     * **参数解释**：配额的额外信息。 **约束限制**：当resource为job-num-quota-notify时，该字段存储SMN通知主题URN。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return extraInfo
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyTrainingQuotaItem that = (ModifyTrainingQuotaItem) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.used, that.used) && Objects.equals(this.extraInfo, that.extraInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, quota, used, extraInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyTrainingQuotaItem {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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
