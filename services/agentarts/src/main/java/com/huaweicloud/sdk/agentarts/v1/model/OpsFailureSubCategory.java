package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpsFailureSubCategory
 */
public class OpsFailureSubCategory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_sub_category_name")

    private String errorSubCategoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_session_count")

    private Integer affectedSessionCount;

    public OpsFailureSubCategory withErrorSubCategoryName(String errorSubCategoryName) {
        this.errorSubCategoryName = errorSubCategoryName;
        return this;
    }

    /**
     * **参数解释：** 故障类别名称。  **取值范围：** 长度1-128个字符。
     * @return errorSubCategoryName
     */
    public String getErrorSubCategoryName() {
        return errorSubCategoryName;
    }

    public void setErrorSubCategoryName(String errorSubCategoryName) {
        this.errorSubCategoryName = errorSubCategoryName;
    }

    public OpsFailureSubCategory withAffectedSessionCount(Integer affectedSessionCount) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsFailureSubCategory that = (OpsFailureSubCategory) obj;
        return Objects.equals(this.errorSubCategoryName, that.errorSubCategoryName)
            && Objects.equals(this.affectedSessionCount, that.affectedSessionCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorSubCategoryName, affectedSessionCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFailureSubCategory {\n");
        sb.append("    errorSubCategoryName: ").append(toIndentedString(errorSubCategoryName)).append("\n");
        sb.append("    affectedSessionCount: ").append(toIndentedString(affectedSessionCount)).append("\n");
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
