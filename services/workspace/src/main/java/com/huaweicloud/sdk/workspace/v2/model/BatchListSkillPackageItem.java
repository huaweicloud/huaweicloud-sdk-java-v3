package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量查询技能包响应项。
 */
public class BatchListSkillPackageItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_id")

    private String skillId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_package")

    private CurrentPackageInfo currentPackage;

    public BatchListSkillPackageItem withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * 技能 ID。
     * @return skillId
     */
    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public BatchListSkillPackageItem withCurrentPackage(CurrentPackageInfo currentPackage) {
        this.currentPackage = currentPackage;
        return this;
    }

    public BatchListSkillPackageItem withCurrentPackage(Consumer<CurrentPackageInfo> currentPackageSetter) {
        if (this.currentPackage == null) {
            this.currentPackage = new CurrentPackageInfo();
            currentPackageSetter.accept(this.currentPackage);
        }

        return this;
    }

    /**
     * Get currentPackage
     * @return currentPackage
     */
    public CurrentPackageInfo getCurrentPackage() {
        return currentPackage;
    }

    public void setCurrentPackage(CurrentPackageInfo currentPackage) {
        this.currentPackage = currentPackage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListSkillPackageItem that = (BatchListSkillPackageItem) obj;
        return Objects.equals(this.skillId, that.skillId) && Objects.equals(this.currentPackage, that.currentPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, currentPackage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListSkillPackageItem {\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    currentPackage: ").append(toIndentedString(currentPackage)).append("\n");
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
