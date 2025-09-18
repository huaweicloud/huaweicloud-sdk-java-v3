package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CodeEvent
 */
public class CodeEvent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public CodeEvent withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 事件类型。 **约束限制**： 不涉及。 **取值范围**： - merge_request：MR 触发。 - push：代码Push触发。 - tag_push：标签触发。 - issue：Gitee仓库ISSUE触发。 - note：Gitee仓库评论触发。 **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CodeEvent withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**： 代码仓是否可用。 **约束限制**： 不涉及。 **取值范围**： - true：代码仓可用。 - false：代码仓不可用。 **默认取值**： 不涉及。 
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodeEvent that = (CodeEvent) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeEvent {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
