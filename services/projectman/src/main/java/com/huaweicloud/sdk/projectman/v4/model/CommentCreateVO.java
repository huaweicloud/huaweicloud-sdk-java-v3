package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CommentCreateVO
 */
public class CommentCreateVO {

    /**
     * **参数解释**： 评论类型。 **取值范围**： - comment：评论 - reply：回复 - operation：系统操作（不支持创建）。 **默认取值**： 不涉及。
     */
    public static final class CategoryEnum {

        /**
         * Enum COMMENT for value: "comment"
         */
        public static final CategoryEnum COMMENT = new CategoryEnum("comment");

        /**
         * Enum REPLY for value: "reply"
         */
        public static final CategoryEnum REPLY = new CategoryEnum("reply");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("comment", COMMENT);
            map.put("reply", REPLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_category")

    private String issueCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private String rootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "at")

    private String at;

    public CommentCreateVO withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 评论类型。 **取值范围**： - comment：评论 - reply：回复 - operation：系统操作（不支持创建）。 **默认取值**： 不涉及。
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public CommentCreateVO withIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }

    /**
     * **参数解释**： 评论关联的工作项类型。 **默认取值**： 不涉及。
     * @return issueCategory
     */
    public String getIssueCategory() {
        return issueCategory;
    }

    public void setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
    }

    public CommentCreateVO withDescription(String description) {
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

    public CommentCreateVO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释**： 评论的父ID，取值为需要回复的评论的ID。 **约束限制**： 回复评论时必填。 **取值范围**： 只支持CR。 **默认取值**： 不涉及。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public CommentCreateVO withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * **参数解释**： 评论的根ID，取值为需要回复的首层评论的ID。 **约束限制**： 回复评论时必填，创建评论时不能填。 **默认取值**： 不涉及。
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public CommentCreateVO withAt(String at) {
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
        CommentCreateVO that = (CommentCreateVO) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.issueCategory, that.issueCategory)
            && Objects.equals(this.description, that.description) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.rootId, that.rootId) && Objects.equals(this.at, that.at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, issueCategory, description, parentId, rootId, at);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentCreateVO {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    issueCategory: ").append(toIndentedString(issueCategory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
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
