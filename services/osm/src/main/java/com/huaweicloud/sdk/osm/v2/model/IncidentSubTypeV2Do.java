package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IncidentSubTypeV2Do
 */
public class IncidentSubTypeV2Do {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_sub_type_id")

    private String incidentSubTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_sub_type_name")

    private String incidentSubTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_product_category_list")

    private List<IncidentProductCategoryV2> incidentProductCategoryList = null;

    public IncidentSubTypeV2Do withIncidentSubTypeId(String incidentSubTypeId) {
        this.incidentSubTypeId = incidentSubTypeId;
        return this;
    }

    /**
     * 工单子类型id
     * @return incidentSubTypeId
     */
    public String getIncidentSubTypeId() {
        return incidentSubTypeId;
    }

    public void setIncidentSubTypeId(String incidentSubTypeId) {
        this.incidentSubTypeId = incidentSubTypeId;
    }

    public IncidentSubTypeV2Do withIncidentSubTypeName(String incidentSubTypeName) {
        this.incidentSubTypeName = incidentSubTypeName;
        return this;
    }

    /**
     * 工单子类型名称
     * @return incidentSubTypeName
     */
    public String getIncidentSubTypeName() {
        return incidentSubTypeName;
    }

    public void setIncidentSubTypeName(String incidentSubTypeName) {
        this.incidentSubTypeName = incidentSubTypeName;
    }

    public IncidentSubTypeV2Do withIncidentProductCategoryList(
        List<IncidentProductCategoryV2> incidentProductCategoryList) {
        this.incidentProductCategoryList = incidentProductCategoryList;
        return this;
    }

    public IncidentSubTypeV2Do addIncidentProductCategoryListItem(
        IncidentProductCategoryV2 incidentProductCategoryListItem) {
        if (this.incidentProductCategoryList == null) {
            this.incidentProductCategoryList = new ArrayList<>();
        }
        this.incidentProductCategoryList.add(incidentProductCategoryListItem);
        return this;
    }

    public IncidentSubTypeV2Do withIncidentProductCategoryList(
        Consumer<List<IncidentProductCategoryV2>> incidentProductCategoryListSetter) {
        if (this.incidentProductCategoryList == null) {
            this.incidentProductCategoryList = new ArrayList<>();
        }
        incidentProductCategoryListSetter.accept(this.incidentProductCategoryList);
        return this;
    }

    /**
     * 产品类型列表
     * @return incidentProductCategoryList
     */
    public List<IncidentProductCategoryV2> getIncidentProductCategoryList() {
        return incidentProductCategoryList;
    }

    public void setIncidentProductCategoryList(List<IncidentProductCategoryV2> incidentProductCategoryList) {
        this.incidentProductCategoryList = incidentProductCategoryList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentSubTypeV2Do that = (IncidentSubTypeV2Do) obj;
        return Objects.equals(this.incidentSubTypeId, that.incidentSubTypeId)
            && Objects.equals(this.incidentSubTypeName, that.incidentSubTypeName)
            && Objects.equals(this.incidentProductCategoryList, that.incidentProductCategoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentSubTypeId, incidentSubTypeName, incidentProductCategoryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentSubTypeV2Do {\n");
        sb.append("    incidentSubTypeId: ").append(toIndentedString(incidentSubTypeId)).append("\n");
        sb.append("    incidentSubTypeName: ").append(toIndentedString(incidentSubTypeName)).append("\n");
        sb.append("    incidentProductCategoryList: ")
            .append(toIndentedString(incidentProductCategoryList))
            .append("\n");
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
