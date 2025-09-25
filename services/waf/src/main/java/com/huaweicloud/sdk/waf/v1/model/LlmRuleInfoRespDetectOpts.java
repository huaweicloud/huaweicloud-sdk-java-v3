package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 响应合规检测
 */
public class LlmRuleInfoRespDetectOpts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_idx")

    private String contentIdx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private LlmRuleInfoRespDetectOptsAction action;

    public LlmRuleInfoRespDetectOpts withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 检测开关
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public LlmRuleInfoRespDetectOpts withContentIdx(String contentIdx) {
        this.contentIdx = contentIdx;
        return this;
    }

    /**
     * 响应内容索引
     * @return contentIdx
     */
    public String getContentIdx() {
        return contentIdx;
    }

    public void setContentIdx(String contentIdx) {
        this.contentIdx = contentIdx;
    }

    public LlmRuleInfoRespDetectOpts withAction(LlmRuleInfoRespDetectOptsAction action) {
        this.action = action;
        return this;
    }

    public LlmRuleInfoRespDetectOpts withAction(Consumer<LlmRuleInfoRespDetectOptsAction> actionSetter) {
        if (this.action == null) {
            this.action = new LlmRuleInfoRespDetectOptsAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public LlmRuleInfoRespDetectOptsAction getAction() {
        return action;
    }

    public void setAction(LlmRuleInfoRespDetectOptsAction action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LlmRuleInfoRespDetectOpts that = (LlmRuleInfoRespDetectOpts) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.contentIdx, that.contentIdx)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, contentIdx, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LlmRuleInfoRespDetectOpts {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    contentIdx: ").append(toIndentedString(contentIdx)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
