package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 查询模板配置 **约束限制：** 不涉及
 */
public class TemplateItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tml_name")

    private String tmlName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tml_id")

    private String tmlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_time")

    private Long modifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private TemplateConfigs configs;

    public TemplateItem withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * **参数解释：** 账户ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public TemplateItem withTmlName(String tmlName) {
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

    public TemplateItem withRemark(String remark) {
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

    public TemplateItem withTmlId(String tmlId) {
        this.tmlId = tmlId;
        return this;
    }

    /**
     * **参数解释：** 域名模板ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return tmlId
     */
    public String getTmlId() {
        return tmlId;
    }

    public void setTmlId(String tmlId) {
        this.tmlId = tmlId;
    }

    public TemplateItem withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 域名模板类型 **约束限制：** 不涉及 **取值范围：** - 1: 系统预置模板 - 2: 租户自定义模板 **默认取值：** 不涉及
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public TemplateItem withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public TemplateItem withModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * **参数解释：** 修改时间 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return modifyTime
     */
    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public TemplateItem withConfigs(TemplateConfigs configs) {
        this.configs = configs;
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
        TemplateItem that = (TemplateItem) obj;
        return Objects.equals(this.accountId, that.accountId) && Objects.equals(this.tmlName, that.tmlName)
            && Objects.equals(this.remark, that.remark) && Objects.equals(this.tmlId, that.tmlId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.modifyTime, that.modifyTime) && Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, tmlName, remark, tmlId, type, createTime, modifyTime, configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateItem {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    tmlName: ").append(toIndentedString(tmlName)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    tmlId: ").append(toIndentedString(tmlId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
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
