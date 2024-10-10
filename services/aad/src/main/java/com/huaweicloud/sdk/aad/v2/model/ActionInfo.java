package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ActionInfo
 */
public class ActionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private DetailInfo detail;

    public ActionInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 动作类型：block:阻断,captcha:人机验证;log: 仅记录;dynamic_block:动态阻断
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ActionInfo withDetail(DetailInfo detail) {
        this.detail = detail;
        return this;
    }

    public ActionInfo withDetail(Consumer<DetailInfo> detailSetter) {
        if (this.detail == null) {
            this.detail = new DetailInfo();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public DetailInfo getDetail() {
        return detail;
    }

    public void setDetail(DetailInfo detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionInfo that = (ActionInfo) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionInfo {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
