package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpsFailureCategory
 */
public class OpsFailureCategory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_category_name")

    private String errorCategoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_session_count")

    private Integer affectedSessionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_categories")

    private List<OpsFailureSubCategory> subCategories = null;

    public OpsFailureCategory withErrorCategoryName(String errorCategoryName) {
        this.errorCategoryName = errorCategoryName;
        return this;
    }

    /**
     * **参数解释：** 故障类别名称。  **取值范围：** 长度1-128个字符。
     * @return errorCategoryName
     */
    public String getErrorCategoryName() {
        return errorCategoryName;
    }

    public void setErrorCategoryName(String errorCategoryName) {
        this.errorCategoryName = errorCategoryName;
    }

    public OpsFailureCategory withAffectedSessionCount(Integer affectedSessionCount) {
        this.affectedSessionCount = affectedSessionCount;
        return this;
    }

    /**
     * **参数解释：** 故障影响的会话个数。  **取值范围：** 大小为0到10000。
     * minimum: 0
     * maximum: 10000
     * @return affectedSessionCount
     */
    public Integer getAffectedSessionCount() {
        return affectedSessionCount;
    }

    public void setAffectedSessionCount(Integer affectedSessionCount) {
        this.affectedSessionCount = affectedSessionCount;
    }

    public OpsFailureCategory withSubCategories(List<OpsFailureSubCategory> subCategories) {
        this.subCategories = subCategories;
        return this;
    }

    public OpsFailureCategory addSubCategoriesItem(OpsFailureSubCategory subCategoriesItem) {
        if (this.subCategories == null) {
            this.subCategories = new ArrayList<>();
        }
        this.subCategories.add(subCategoriesItem);
        return this;
    }

    public OpsFailureCategory withSubCategories(Consumer<List<OpsFailureSubCategory>> subCategoriesSetter) {
        if (this.subCategories == null) {
            this.subCategories = new ArrayList<>();
        }
        subCategoriesSetter.accept(this.subCategories);
        return this;
    }

    /**
     * **参数解释：** 子故障类别列表。  **取值范围：** 长度0-100的数组。
     * @return subCategories
     */
    public List<OpsFailureSubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<OpsFailureSubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsFailureCategory that = (OpsFailureCategory) obj;
        return Objects.equals(this.errorCategoryName, that.errorCategoryName)
            && Objects.equals(this.affectedSessionCount, that.affectedSessionCount)
            && Objects.equals(this.subCategories, that.subCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCategoryName, affectedSessionCount, subCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFailureCategory {\n");
        sb.append("    errorCategoryName: ").append(toIndentedString(errorCategoryName)).append("\n");
        sb.append("    affectedSessionCount: ").append(toIndentedString(affectedSessionCount)).append("\n");
        sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
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
