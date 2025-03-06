package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListInstanceEngineDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_instance_details")

    private List<InstanceEngineDetail> engineInstanceDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListInstanceEngineDetailResponse withEngineInstanceDetails(
        List<InstanceEngineDetail> engineInstanceDetails) {
        this.engineInstanceDetails = engineInstanceDetails;
        return this;
    }

    public ListInstanceEngineDetailResponse addEngineInstanceDetailsItem(
        InstanceEngineDetail engineInstanceDetailsItem) {
        if (this.engineInstanceDetails == null) {
            this.engineInstanceDetails = new ArrayList<>();
        }
        this.engineInstanceDetails.add(engineInstanceDetailsItem);
        return this;
    }

    public ListInstanceEngineDetailResponse withEngineInstanceDetails(
        Consumer<List<InstanceEngineDetail>> engineInstanceDetailsSetter) {
        if (this.engineInstanceDetails == null) {
            this.engineInstanceDetails = new ArrayList<>();
        }
        engineInstanceDetailsSetter.accept(this.engineInstanceDetails);
        return this;
    }

    /**
     * 引擎版本和相应的实例详情。
     * @return engineInstanceDetails
     */
    public List<InstanceEngineDetail> getEngineInstanceDetails() {
        return engineInstanceDetails;
    }

    public void setEngineInstanceDetails(List<InstanceEngineDetail> engineInstanceDetails) {
        this.engineInstanceDetails = engineInstanceDetails;
    }

    public ListInstanceEngineDetailResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 引擎版本数量。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceEngineDetailResponse that = (ListInstanceEngineDetailResponse) obj;
        return Objects.equals(this.engineInstanceDetails, that.engineInstanceDetails)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineInstanceDetails, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceEngineDetailResponse {\n");
        sb.append("    engineInstanceDetails: ").append(toIndentedString(engineInstanceDetails)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
