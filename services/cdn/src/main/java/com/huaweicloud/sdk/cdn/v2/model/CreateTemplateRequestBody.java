package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 创建域名模板配置 **约束限制：** 不涉及
 */
public class CreateTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tml_name")

    private String tmlName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private TemplateConfigs configs;

    public CreateTemplateRequestBody withTmlName(String tmlName) {
        this.tmlName = tmlName;
        return this;
    }

    /**
     * **参数解释：** 域名模板名称 **约束限制：** 不涉及 **取值范围：** - 1-100个字符 - 仅支持字母、数字、中文、下划线（_）、中横线（-） **默认取值：** 不涉及
     * @return tmlName
     */
    public String getTmlName() {
        return tmlName;
    }

    public void setTmlName(String tmlName) {
        this.tmlName = tmlName;
    }

    public CreateTemplateRequestBody withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * **参数解释：** 域名模板描述 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public CreateTemplateRequestBody withConfigs(TemplateConfigs configs) {
        this.configs = configs;
        return this;
    }

    public CreateTemplateRequestBody withConfigs(Consumer<TemplateConfigs> configsSetter) {
        if (this.configs == null) {
            this.configs = new TemplateConfigs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public TemplateConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(TemplateConfigs configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTemplateRequestBody that = (CreateTemplateRequestBody) obj;
        return Objects.equals(this.tmlName, that.tmlName) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tmlName, remark, configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplateRequestBody {\n");
        sb.append("    tmlName: ").append(toIndentedString(tmlName)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
