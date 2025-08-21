package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDomainTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tml_name")

    private String tmlName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tml_id")

    private String tmlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tml_type")

    private Integer tmlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    public ShowDomainTemplateRequest withTmlName(String tmlName) {
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

    public ShowDomainTemplateRequest withTmlId(String tmlId) {
        this.tmlId = tmlId;
        return this;
    }

    /**
     * **参数解释：** 域名模板ID，可以通过本接口获取 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return tmlId
     */
    public String getTmlId() {
        return tmlId;
    }

    public void setTmlId(String tmlId) {
        this.tmlId = tmlId;
    }

    public ShowDomainTemplateRequest withTmlType(Integer tmlType) {
        this.tmlType = tmlType;
        return this;
    }

    /**
     * **参数解释：** 域名模板类型 **约束限制：** 不涉及 **取值范围：** - 1: 系统预置模板 - 2: 租户自定义模板 **默认取值：** 不涉及
     * @return tmlType
     */
    public Integer getTmlType() {
        return tmlType;
    }

    public void setTmlType(Integer tmlType) {
        this.tmlType = tmlType;
    }

    public ShowDomainTemplateRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 分页大小 **约束限制：** 不涉及 **取值范围：** 1-10000 **默认取值：** 30
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ShowDomainTemplateRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 查询的页码 **约束限制：** 不涉及 **取值范围：** 0-65535 **默认取值：** 0
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainTemplateRequest that = (ShowDomainTemplateRequest) obj;
        return Objects.equals(this.tmlName, that.tmlName) && Objects.equals(this.tmlId, that.tmlId)
            && Objects.equals(this.tmlType, that.tmlType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tmlName, tmlId, tmlType, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainTemplateRequest {\n");
        sb.append("    tmlName: ").append(toIndentedString(tmlName)).append("\n");
        sb.append("    tmlId: ").append(toIndentedString(tmlId)).append("\n");
        sb.append("    tmlType: ").append(toIndentedString(tmlType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
