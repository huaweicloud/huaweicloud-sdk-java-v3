package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 扩容前检查响应体。 当请求header中x-language字段为zh_cn时返回中文描述、类型信息。 当请求header中x-language字段为en_us时返回英文描述、类型信息。 **取值范围**： 不涉及。
 */
public class GrowCheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pass")

    private Boolean pass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public GrowCheckResult withPass(Boolean pass) {
        this.pass = pass;
        return this;
    }

    /**
     * **参数解释**： 检查是否通过，检查通过项默认不展示。 **取值范围**： true/false
     * @return pass
     */
    public Boolean getPass() {
        return pass;
    }

    public void setPass(Boolean pass) {
        this.pass = pass;
    }

    public GrowCheckResult withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**： 检查不通过的原因描述。 **取值范围**： 不涉及。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public GrowCheckResult withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * **参数解释**： 是否必须检查项。 **取值范围**： - true：必须，校验不通过时不允许扩容，继续扩容也会失败 - false：非必须，校验不通过时允许扩容，仅做提示告知风险
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public GrowCheckResult withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * **参数解释**： 描述信息。 **取值范围**： 不涉及。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public GrowCheckResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 分类。 **取值范围**： 配额、权限、版本、状态
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GrowCheckResult that = (GrowCheckResult) obj;
        return Objects.equals(this.pass, that.pass) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.required, that.required) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pass, reason, required, desc, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrowCheckResult {\n");
        sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
