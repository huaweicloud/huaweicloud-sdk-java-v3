package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量解绑技能请求。
 */
public class DeleteSkillBindingReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_ids")

    private List<String> skillIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public DeleteSkillBindingReq withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public DeleteSkillBindingReq addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public DeleteSkillBindingReq withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 实例 ID 列表。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public DeleteSkillBindingReq withSkillIds(List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }

    public DeleteSkillBindingReq addSkillIdsItem(String skillIdsItem) {
        if (this.skillIds == null) {
            this.skillIds = new ArrayList<>();
        }
        this.skillIds.add(skillIdsItem);
        return this;
    }

    public DeleteSkillBindingReq withSkillIds(Consumer<List<String>> skillIdsSetter) {
        if (this.skillIds == null) {
            this.skillIds = new ArrayList<>();
        }
        skillIdsSetter.accept(this.skillIds);
        return this;
    }

    /**
     * 技能 ID 列表。
     * @return skillIds
     */
    public List<String> getSkillIds() {
        return skillIds;
    }

    public void setSkillIds(List<String> skillIds) {
        this.skillIds = skillIds;
    }

    public DeleteSkillBindingReq withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public DeleteSkillBindingReq addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public DeleteSkillBindingReq withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，格式为 key:value，通过标签查询 tbl_desktop_tags 表获取关联实例ID，与 instance_ids 合并后去重。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteSkillBindingReq that = (DeleteSkillBindingReq) obj;
        return Objects.equals(this.instanceIds, that.instanceIds) && Objects.equals(this.skillIds, that.skillIds)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, skillIds, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSkillBindingReq {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
