package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateRuleAclDto
 */
public class OrderRuleAclDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_rule_id")

    private String destRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bottom")

    private Integer bottom;

    public OrderRuleAclDto withDestRuleId(String destRuleId) {
        this.destRuleId = destRuleId;
        return this;
    }

    /**
     * 目标规则id，添加规则位于此规则之后，非置顶时不能为空，置顶时为空
     * @return destRuleId
     */
    public String getDestRuleId() {
        return destRuleId;
    }

    public void setDestRuleId(String destRuleId) {
        this.destRuleId = destRuleId;
    }

    public OrderRuleAclDto withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * 是否置顶，0代表非置顶，1代表置顶
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public OrderRuleAclDto withBottom(Integer bottom) {
        this.bottom = bottom;
        return this;
    }

    /**
     * 是否置底，0代表非置底，1代表置底
     * @return bottom
     */
    public Integer getBottom() {
        return bottom;
    }

    public void setBottom(Integer bottom) {
        this.bottom = bottom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderRuleAclDto that = (OrderRuleAclDto) obj;
        return Objects.equals(this.destRuleId, that.destRuleId) && Objects.equals(this.top, that.top)
            && Objects.equals(this.bottom, that.bottom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destRuleId, top, bottom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderRuleAclDto {\n");
        sb.append("    destRuleId: ").append(toIndentedString(destRuleId)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
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
