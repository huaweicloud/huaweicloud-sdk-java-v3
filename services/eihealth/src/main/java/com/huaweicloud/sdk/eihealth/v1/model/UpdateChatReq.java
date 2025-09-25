package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateChatReq
 */
public class UpdateChatReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_top")

    private Boolean enableTop;

    public UpdateChatReq withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * **参数解释**： 对话别名。 **约束限制**： 不涉及 **取值范围**： 取值范围为[1-20]个字符。 **默认取值**： 不涉及 
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public UpdateChatReq withEnableTop(Boolean enableTop) {
        this.enableTop = enableTop;
        return this;
    }

    /**
     * **参数解释**： 是否置顶对话。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return enableTop
     */
    public Boolean getEnableTop() {
        return enableTop;
    }

    public void setEnableTop(Boolean enableTop) {
        this.enableTop = enableTop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateChatReq that = (UpdateChatReq) obj;
        return Objects.equals(this.alias, that.alias) && Objects.equals(this.enableTop, that.enableTop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, enableTop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateChatReq {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    enableTop: ").append(toIndentedString(enableTop)).append("\n");
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
