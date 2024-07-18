package com.huaweicloud.sdk.codeartsgovernance.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PrivacyComplianceInfo
 */
public class PrivacyComplianceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtype_list")

    private List<PrivacyComplianceSubtype> subtypeList = null;

    public PrivacyComplianceInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 隐私合规类型
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public PrivacyComplianceInfo withSubtypeList(List<PrivacyComplianceSubtype> subtypeList) {
        this.subtypeList = subtypeList;
        return this;
    }

    public PrivacyComplianceInfo addSubtypeListItem(PrivacyComplianceSubtype subtypeListItem) {
        if (this.subtypeList == null) {
            this.subtypeList = new ArrayList<>();
        }
        this.subtypeList.add(subtypeListItem);
        return this;
    }

    public PrivacyComplianceInfo withSubtypeList(Consumer<List<PrivacyComplianceSubtype>> subtypeListSetter) {
        if (this.subtypeList == null) {
            this.subtypeList = new ArrayList<>();
        }
        subtypeListSetter.accept(this.subtypeList);
        return this;
    }

    /**
     * 隐私合规子类型列表
     * @return subtypeList
     */
    public List<PrivacyComplianceSubtype> getSubtypeList() {
        return subtypeList;
    }

    public void setSubtypeList(List<PrivacyComplianceSubtype> subtypeList) {
        this.subtypeList = subtypeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivacyComplianceInfo that = (PrivacyComplianceInfo) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.subtypeList, that.subtypeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, subtypeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivacyComplianceInfo {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    subtypeList: ").append(toIndentedString(subtypeList)).append("\n");
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
