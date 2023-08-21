package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDashboardRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_charts")

    private Boolean isDeleteCharts;

    public DeleteDashboardRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 仪表盘id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteDashboardRequest withIsDeleteCharts(Boolean isDeleteCharts) {
        this.isDeleteCharts = isDeleteCharts;
        return this;
    }

    /**
     * 是否删除图表
     * @return isDeleteCharts
     */
    public Boolean getIsDeleteCharts() {
        return isDeleteCharts;
    }

    public void setIsDeleteCharts(Boolean isDeleteCharts) {
        this.isDeleteCharts = isDeleteCharts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDashboardRequest that = (DeleteDashboardRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.isDeleteCharts, that.isDeleteCharts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isDeleteCharts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDashboardRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isDeleteCharts: ").append(toIndentedString(isDeleteCharts)).append("\n");
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
