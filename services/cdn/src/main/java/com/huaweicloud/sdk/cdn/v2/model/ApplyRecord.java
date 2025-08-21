package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 域名模板应用记录 **约束限制：** 不涉及
 */
public class ApplyRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_id")

    private String operatorId;

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
    @JsonProperty(value = "apply_time")

    private Long applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<Resource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private TemplateConfigs configs;

    public ApplyRecord withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 应用模板结果 **约束限制：** 不涉及 **取值范围：** - success: 应用模板成功 - fail: 应用模板失败 **默认取值：** 不涉及
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApplyRecord withOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    /**
     * **参数解释：** 操作ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return operatorId
     */
    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public ApplyRecord withTmlName(String tmlName) {
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

    public ApplyRecord withRemark(String remark) {
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

    public ApplyRecord withTmlId(String tmlId) {
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

    public ApplyRecord withApplyTime(Long applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * **参数解释：** 域名模板应用时间 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return applyTime
     */
    public Long getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
    }

    public ApplyRecord withType(Integer type) {
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

    public ApplyRecord withAccountId(String accountId) {
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

    public ApplyRecord withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public ApplyRecord addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ApplyRecord withResources(Consumer<List<Resource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public ApplyRecord withConfigs(TemplateConfigs configs) {
        this.configs = configs;
        return this;
    }

    public ApplyRecord withConfigs(Consumer<TemplateConfigs> configsSetter) {
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
        ApplyRecord that = (ApplyRecord) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.operatorId, that.operatorId)
            && Objects.equals(this.tmlName, that.tmlName) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.tmlId, that.tmlId) && Objects.equals(this.applyTime, that.applyTime)
            && Objects.equals(this.type, that.type) && Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, operatorId, tmlName, remark, tmlId, applyTime, type, accountId, resources, configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyRecord {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    tmlName: ").append(toIndentedString(tmlName)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    tmlId: ").append(toIndentedString(tmlId)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
