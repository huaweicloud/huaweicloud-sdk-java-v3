package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量绑定技能到实例请求。
 */
public class CreateSkillBindingReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_ids")

    private List<String> skillIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<String> versions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public CreateSkillBindingReq withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public CreateSkillBindingReq addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public CreateSkillBindingReq withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
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

    public CreateSkillBindingReq withSkillIds(List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }

    public CreateSkillBindingReq addSkillIdsItem(String skillIdsItem) {
        if (this.skillIds == null) {
            this.skillIds = new ArrayList<>();
        }
        this.skillIds.add(skillIdsItem);
        return this;
    }

    public CreateSkillBindingReq withSkillIds(Consumer<List<String>> skillIdsSetter) {
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

    public CreateSkillBindingReq withVersions(List<String> versions) {
        this.versions = versions;
        return this;
    }

    public CreateSkillBindingReq addVersionsItem(String versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public CreateSkillBindingReq withVersions(Consumer<List<String>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 技能版本列表，与 skill_ids 一一对应。不传或对应位置为空时使用技能当前版本。
     * @return versions
     */
    public List<String> getVersions() {
        return versions;
    }

    public void setVersions(List<String> versions) {
        this.versions = versions;
    }

    public CreateSkillBindingReq withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateSkillBindingReq addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateSkillBindingReq withTags(Consumer<List<String>> tagsSetter) {
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
        CreateSkillBindingReq that = (CreateSkillBindingReq) obj;
        return Objects.equals(this.instanceIds, that.instanceIds) && Objects.equals(this.skillIds, that.skillIds)
            && Objects.equals(this.versions, that.versions) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, skillIds, versions, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSkillBindingReq {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
