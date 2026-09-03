package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量查询技能包请求。
 */
public class BatchListSkillPackagesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_ids")

    private List<String> skillIds = null;

    public BatchListSkillPackagesReq withSkillIds(List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }

    public BatchListSkillPackagesReq addSkillIdsItem(String skillIdsItem) {
        if (this.skillIds == null) {
            this.skillIds = new ArrayList<>();
        }
        this.skillIds.add(skillIdsItem);
        return this;
    }

    public BatchListSkillPackagesReq withSkillIds(Consumer<List<String>> skillIdsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListSkillPackagesReq that = (BatchListSkillPackagesReq) obj;
        return Objects.equals(this.skillIds, that.skillIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListSkillPackagesReq {\n");
        sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
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
