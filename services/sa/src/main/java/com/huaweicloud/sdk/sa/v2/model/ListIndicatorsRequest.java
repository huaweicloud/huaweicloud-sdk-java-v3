package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListIndicatorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_date")

    private String fromDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_date")

    private String toDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IndicatorListSearchRequest body;

    public ListIndicatorsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * workspace id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListIndicatorsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * sort order, ASC, DESC.
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListIndicatorsRequest withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * 起始时间
     * @return fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public ListIndicatorsRequest withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * 结束时间
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public ListIndicatorsRequest withBody(IndicatorListSearchRequest body) {
        this.body = body;
        return this;
    }

    public ListIndicatorsRequest withBody(Consumer<IndicatorListSearchRequest> bodySetter) {
        if (this.body == null) {
            this.body = new IndicatorListSearchRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IndicatorListSearchRequest getBody() {
        return body;
    }

    public void setBody(IndicatorListSearchRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIndicatorsRequest that = (ListIndicatorsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.order, that.order)
            && Objects.equals(this.fromDate, that.fromDate) && Objects.equals(this.toDate, that.toDate)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, order, fromDate, toDate, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIndicatorsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
