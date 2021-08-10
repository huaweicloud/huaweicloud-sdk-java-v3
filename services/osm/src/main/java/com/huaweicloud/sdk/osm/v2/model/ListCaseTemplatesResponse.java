package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListCaseTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_template_list")

    private List<IncidentTempV2> incidentTemplateList = null;

    public ListCaseTemplatesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 总数 minimum: 0 maximum: 65535
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListCaseTemplatesResponse withIncidentTemplateList(List<IncidentTempV2> incidentTemplateList) {
        this.incidentTemplateList = incidentTemplateList;
        return this;
    }

    public ListCaseTemplatesResponse addIncidentTemplateListItem(IncidentTempV2 incidentTemplateListItem) {
        if (this.incidentTemplateList == null) {
            this.incidentTemplateList = new ArrayList<>();
        }
        this.incidentTemplateList.add(incidentTemplateListItem);
        return this;
    }

    public ListCaseTemplatesResponse withIncidentTemplateList(
        Consumer<List<IncidentTempV2>> incidentTemplateListSetter) {
        if (this.incidentTemplateList == null) {
            this.incidentTemplateList = new ArrayList<>();
        }
        incidentTemplateListSetter.accept(this.incidentTemplateList);
        return this;
    }

    /** 模板列表
     * 
     * @return incidentTemplateList */
    public List<IncidentTempV2> getIncidentTemplateList() {
        return incidentTemplateList;
    }

    public void setIncidentTemplateList(List<IncidentTempV2> incidentTemplateList) {
        this.incidentTemplateList = incidentTemplateList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCaseTemplatesResponse listCaseTemplatesResponse = (ListCaseTemplatesResponse) o;
        return Objects.equals(this.totalCount, listCaseTemplatesResponse.totalCount)
            && Objects.equals(this.incidentTemplateList, listCaseTemplatesResponse.incidentTemplateList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incidentTemplateList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCaseTemplatesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    incidentTemplateList: ").append(toIndentedString(incidentTemplateList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
