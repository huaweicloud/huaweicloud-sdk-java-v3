package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 测试计划操作历史详情
 */
public class TestPlanJournalDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    @JacksonXmlProperty(localName = "updated")

    private List<AttributeChange> updated = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added")

    @JacksonXmlProperty(localName = "added")

    private List<NameAndId> added = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    @JacksonXmlProperty(localName = "deleted")

    private List<NameAndId> deleted = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "journalized_type")

    @JacksonXmlProperty(localName = "journalized_type")

    private String journalizedType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    public TestPlanJournalDetail withUpdated(List<AttributeChange> updated) {
        this.updated = updated;
        return this;
    }

    public TestPlanJournalDetail addUpdatedItem(AttributeChange updatedItem) {
        if (this.updated == null) {
            this.updated = new ArrayList<>();
        }
        this.updated.add(updatedItem);
        return this;
    }

    public TestPlanJournalDetail withUpdated(Consumer<List<AttributeChange>> updatedSetter) {
        if (this.updated == null) {
            this.updated = new ArrayList<>();
        }
        updatedSetter.accept(this.updated);
        return this;
    }

    /**
     * 测试计划基础信息变更，包括计划名称，测试类型，计划处理者、版本号、关联迭代、开始日期、截至日期、描述
     * @return updated
     */
    public List<AttributeChange> getUpdated() {
        return updated;
    }

    public void setUpdated(List<AttributeChange> updated) {
        this.updated = updated;
    }

    public TestPlanJournalDetail withAdded(List<NameAndId> added) {
        this.added = added;
        return this;
    }

    public TestPlanJournalDetail addAddedItem(NameAndId addedItem) {
        if (this.added == null) {
            this.added = new ArrayList<>();
        }
        this.added.add(addedItem);
        return this;
    }

    public TestPlanJournalDetail withAdded(Consumer<List<NameAndId>> addedSetter) {
        if (this.added == null) {
            this.added = new ArrayList<>();
        }
        addedSetter.accept(this.added);
        return this;
    }

    /**
     * 测试计划资源的添加记录（工作项或者测试用例）
     * @return added
     */
    public List<NameAndId> getAdded() {
        return added;
    }

    public void setAdded(List<NameAndId> added) {
        this.added = added;
    }

    public TestPlanJournalDetail withDeleted(List<NameAndId> deleted) {
        this.deleted = deleted;
        return this;
    }

    public TestPlanJournalDetail addDeletedItem(NameAndId deletedItem) {
        if (this.deleted == null) {
            this.deleted = new ArrayList<>();
        }
        this.deleted.add(deletedItem);
        return this;
    }

    public TestPlanJournalDetail withDeleted(Consumer<List<NameAndId>> deletedSetter) {
        if (this.deleted == null) {
            this.deleted = new ArrayList<>();
        }
        deletedSetter.accept(this.deleted);
        return this;
    }

    /**
     * 测试计划资源的移除记录（工作项或者测试用例）
     * @return deleted
     */
    public List<NameAndId> getDeleted() {
        return deleted;
    }

    public void setDeleted(List<NameAndId> deleted) {
        this.deleted = deleted;
    }

    public TestPlanJournalDetail withJournalizedType(String journalizedType) {
        this.journalizedType = journalizedType;
        return this;
    }

    /**
     * 表明该条变更记录的具体变更类型，例如测试用例（testCase），需求（issue）
     * @return journalizedType
     */
    public String getJournalizedType() {
        return journalizedType;
    }

    public void setJournalizedType(String journalizedType) {
        this.journalizedType = journalizedType;
    }

    public TestPlanJournalDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 表明该条变更记录属于基础信息变更还是资源（需求添加移除、用例添加移除）变更
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestPlanJournalDetail testPlanJournalDetail = (TestPlanJournalDetail) o;
        return Objects.equals(this.updated, testPlanJournalDetail.updated)
            && Objects.equals(this.added, testPlanJournalDetail.added)
            && Objects.equals(this.deleted, testPlanJournalDetail.deleted)
            && Objects.equals(this.journalizedType, testPlanJournalDetail.journalizedType)
            && Objects.equals(this.type, testPlanJournalDetail.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updated, added, deleted, journalizedType, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestPlanJournalDetail {\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    journalizedType: ").append(toIndentedString(journalizedType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
