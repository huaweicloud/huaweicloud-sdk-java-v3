package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 升级时插件操作配置。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class UpgradeAddonConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTemplateName")

    private String addonTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private Object values;

    public UpgradeAddonConfig withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    /**
     * **参数解释：** CCE插件名称 **约束限制：** 不涉及 **取值范围：** 集群中已安装的插件名称。[集群中已安装插件详情见[获取AddonInstance列表](https://support.huaweicloud.com/api-cce/cce_02_0326.html)](tag:hws) **默认取值：** 不涉及
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    public UpgradeAddonConfig withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * **参数解释：** 升级插件的执行动作 **约束限制：** 不涉及 **取值范围：** - patch：表示升级插件版本  **默认取值：** 不涉及
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public UpgradeAddonConfig withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 目标插件版本号 **约束限制：** 目标插件版本必须与目标集群版本配套。[集群版本配套关系见[查询AddonTemplates列表](https://support.huaweicloud.com/api-cce/cce_02_0321.html)](tag:hws) **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpgradeAddonConfig withValues(Object values) {
        this.values = values;
        return this;
    }

    /**
     * **参数解释：** 插件参数列表，Key:Value格式。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return values
     */
    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeAddonConfig that = (UpgradeAddonConfig) obj;
        return Objects.equals(this.addonTemplateName, that.addonTemplateName)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.version, that.version)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addonTemplateName, operation, version, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeAddonConfig {\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
