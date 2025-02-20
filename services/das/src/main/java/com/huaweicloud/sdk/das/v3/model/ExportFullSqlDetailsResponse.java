package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ExportFullSqlDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sql_details")

    private List<FullSqlDetail> fullSqlDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ExportFullSqlDetailsResponse withFullSqlDetails(List<FullSqlDetail> fullSqlDetails) {
        this.fullSqlDetails = fullSqlDetails;
        return this;
    }

    public ExportFullSqlDetailsResponse addFullSqlDetailsItem(FullSqlDetail fullSqlDetailsItem) {
        if (this.fullSqlDetails == null) {
            this.fullSqlDetails = new ArrayList<>();
        }
        this.fullSqlDetails.add(fullSqlDetailsItem);
        return this;
    }

    public ExportFullSqlDetailsResponse withFullSqlDetails(Consumer<List<FullSqlDetail>> fullSqlDetailsSetter) {
        if (this.fullSqlDetails == null) {
            this.fullSqlDetails = new ArrayList<>();
        }
        fullSqlDetailsSetter.accept(this.fullSqlDetails);
        return this;
    }

    /**
     * 全量SQL明细列表。
     * @return fullSqlDetails
     */
    public List<FullSqlDetail> getFullSqlDetails() {
        return fullSqlDetails;
    }

    public void setFullSqlDetails(List<FullSqlDetail> fullSqlDetails) {
        this.fullSqlDetails = fullSqlDetails;
    }

    public ExportFullSqlDetailsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportFullSqlDetailsResponse that = (ExportFullSqlDetailsResponse) obj;
        return Objects.equals(this.fullSqlDetails, that.fullSqlDetails) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullSqlDetails, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportFullSqlDetailsResponse {\n");
        sb.append("    fullSqlDetails: ").append(toIndentedString(fullSqlDetails)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
