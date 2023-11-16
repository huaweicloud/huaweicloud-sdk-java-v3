package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 项目级级开源治理策略实例详情
 */
public class OpenSourceRuleSetCreateVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private OpenSourceRuleContent content;

    public OpenSourceRuleSetCreateVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 开源治理策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpenSourceRuleSetCreateVO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 开源治理策略父策略ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public OpenSourceRuleSetCreateVO withContent(OpenSourceRuleContent content) {
        this.content = content;
        return this;
    }

    public OpenSourceRuleSetCreateVO withContent(Consumer<OpenSourceRuleContent> contentSetter) {
        if (this.content == null) {
            this.content = new OpenSourceRuleContent();
            contentSetter.accept(this.content);
        }

        return this;
    }

    /**
     * Get content
     * @return content
     */
    public OpenSourceRuleContent getContent() {
        return content;
    }

    public void setContent(OpenSourceRuleContent content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenSourceRuleSetCreateVO that = (OpenSourceRuleSetCreateVO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parentId, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenSourceRuleSetCreateVO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
