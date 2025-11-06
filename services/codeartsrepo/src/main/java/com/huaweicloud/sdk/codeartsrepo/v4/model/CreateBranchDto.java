package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateBranchDto
 */
public class CreateBranchDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_ids")

    private List<String> relatedIds = null;

    public CreateBranchDto withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释：** 分支名称。  **约束限制：** 不支持以 - . refs/heads/ refs/remotes/ 开头，不支持空格 [ \\ < ~ ^ : ? * ! ( ) ' \" | 等特殊字符，不支持以. / .lock结尾。  **取值范围：** 字符串长度不少于1，不超过200。 **默认取值：** 不涉及。
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public CreateBranchDto withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * **参数解释：** 基于分支名称。  **约束限制：** 不支持以 - . refs/heads/ refs/remotes/ 开头，不支持空格 [ \\ < ~ ^ : ? * ! ( ) ' \" | 等特殊字符，不支持以. / .lock结尾。  **取值范围：** 字符串长度不少于1，不超过200。 **默认取值：** 不涉及。
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public CreateBranchDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 分支描述。  **约束限制：** 无。  **取值范围：** 字符串长度不少于1，不超过2000。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateBranchDto withRelatedIds(List<String> relatedIds) {
        this.relatedIds = relatedIds;
        return this;
    }

    public CreateBranchDto addRelatedIdsItem(String relatedIdsItem) {
        if (this.relatedIds == null) {
            this.relatedIds = new ArrayList<>();
        }
        this.relatedIds.add(relatedIdsItem);
        return this;
    }

    public CreateBranchDto withRelatedIds(Consumer<List<String>> relatedIdsSetter) {
        if (this.relatedIds == null) {
            this.relatedIds = new ArrayList<>();
        }
        relatedIdsSetter.accept(this.relatedIds);
        return this;
    }

    /**
     * **参数解释：** 关联工作项列表。  **约束限制：** 无。  **取值范围：** 无。 **默认取值：** 不涉及。
     * @return relatedIds
     */
    public List<String> getRelatedIds() {
        return relatedIds;
    }

    public void setRelatedIds(List<String> relatedIds) {
        this.relatedIds = relatedIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBranchDto that = (CreateBranchDto) obj;
        return Objects.equals(this.branch, that.branch) && Objects.equals(this.ref, that.ref)
            && Objects.equals(this.description, that.description) && Objects.equals(this.relatedIds, that.relatedIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, ref, description, relatedIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBranchDto {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    relatedIds: ").append(toIndentedString(relatedIds)).append("\n");
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
