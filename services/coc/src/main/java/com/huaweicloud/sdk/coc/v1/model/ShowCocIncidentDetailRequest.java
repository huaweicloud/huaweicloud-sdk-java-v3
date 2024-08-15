package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCocIncidentDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_num")

    private String incidentNum;

    public ShowCocIncidentDetailRequest withIncidentNum(String incidentNum) {
        this.incidentNum = incidentNum;
        return this;
    }

    /**
     * 事件单号
     * @return incidentNum
     */
    public String getIncidentNum() {
        return incidentNum;
    }

    public void setIncidentNum(String incidentNum) {
        this.incidentNum = incidentNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCocIncidentDetailRequest that = (ShowCocIncidentDetailRequest) obj;
        return Objects.equals(this.incidentNum, that.incidentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCocIncidentDetailRequest {\n");
        sb.append("    incidentNum: ").append(toIndentedString(incidentNum)).append("\n");
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
