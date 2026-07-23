package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估器标签用于分类和检索。 **取值范围：** 不涉及。 
 */
public class ShowOpsEvaluatorTemplateResponseBodyTemplateTags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh-CN")

    private ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN zhCN;

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTags withZhCN(
        ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN zhCN) {
        this.zhCN = zhCN;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTags withZhCN(
        Consumer<ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN> zhCNSetter) {
        if (this.zhCN == null) {
            this.zhCN = new ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN();
            zhCNSetter.accept(this.zhCN);
        }

        return this;
    }

    /**
     * Get zhCN
     * @return zhCN
     */
    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN getZhCN() {
        return zhCN;
    }

    public void setZhCN(ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN zhCN) {
        this.zhCN = zhCN;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluatorTemplateResponseBodyTemplateTags that = (ShowOpsEvaluatorTemplateResponseBodyTemplateTags) obj;
        return Objects.equals(this.zhCN, that.zhCN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zhCN);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponseBodyTemplateTags {\n");
        sb.append("    zhCN: ").append(toIndentedString(zhCN)).append("\n");
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
