package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAddonTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addon_template_name")

    private String addonTemplateName;

    public ListAddonTemplatesRequest withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    /**
     * **参数解释**： 指定的插件名称或插件别名，不填写则查询列表。 **约束限制**： 不涉及 **取值范围**： 以字母或数字开头和结尾，支持字母、数字、连字符(-)、下划线(_)和点号(.)，长度范围2~30位。 **默认取值**： 不涉及
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAddonTemplatesRequest that = (ListAddonTemplatesRequest) obj;
        return Objects.equals(this.addonTemplateName, that.addonTemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addonTemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAddonTemplatesRequest {\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
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
