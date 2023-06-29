package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ModelExtends {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_ids")

    private Tag tagIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    private List<String> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_all_answers")

    private Boolean returnAllAnswers;

    public ModelExtends withTagIds(Tag tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    public ModelExtends withTagIds(Consumer<Tag> tagIdsSetter) {
        if (this.tagIds == null) {
            this.tagIds = new Tag();
            tagIdsSetter.accept(this.tagIds);
        }

        return this;
    }

    /**
     * Get tagIds
     * @return tagIds
     */
    public Tag getTagIds() {
        return tagIds;
    }

    public void setTagIds(Tag tagIds) {
        this.tagIds = tagIds;
    }

    public ModelExtends withDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public ModelExtends addDomainIdsItem(String domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public ModelExtends withDomainIds(Consumer<List<String>> domainIdsSetter) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        domainIdsSetter.accept(this.domainIds);
        return this;
    }

    /**
     * 领域列表，多个领域用分号隔开。如果设置了领域且领域不为空，就从这些领域中匹配答案，否则就从该用户的全部知识库匹配答案。  当前最多支持10个领域。 
     * @return domainIds
     */
    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public ModelExtends withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 问题来源 其他支持用户自定义，最终体现在问答日志里
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ModelExtends withReturnAllAnswers(Boolean returnAllAnswers) {
        this.returnAllAnswers = returnAllAnswers;
        return this;
    }

    /**
     * 是否返回所有类型的回答
     * @return returnAllAnswers
     */
    public Boolean getReturnAllAnswers() {
        return returnAllAnswers;
    }

    public void setReturnAllAnswers(Boolean returnAllAnswers) {
        this.returnAllAnswers = returnAllAnswers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelExtends that = (ModelExtends) obj;
        return Objects.equals(this.tagIds, that.tagIds) && Objects.equals(this.domainIds, that.domainIds)
            && Objects.equals(this.source, that.source) && Objects.equals(this.returnAllAnswers, that.returnAllAnswers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagIds, domainIds, source, returnAllAnswers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelExtends {\n");
        sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    returnAllAnswers: ").append(toIndentedString(returnAllAnswers)).append("\n");
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
