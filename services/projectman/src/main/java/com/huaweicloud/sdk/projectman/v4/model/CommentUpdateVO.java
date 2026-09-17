package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CommentUpdateVO
 */
public class CommentUpdateVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "at")

    private String at;

    public CommentUpdateVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 评论内容，使用html标记语言。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommentUpdateVO withAt(String at) {
        this.at = at;
        return this;
    }

    /**
     * **参数解释**： 评论时@他人的用户ID，填写此参数后会通知被@的用户，通知形式在需求管理-设置-工作项设置-通知设置中配置。 **默认取值**： 不涉及。
     * @return at
     */
    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentUpdateVO that = (CommentUpdateVO) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.at, that.at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, at);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentUpdateVO {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    at: ").append(toIndentedString(at)).append("\n");
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
