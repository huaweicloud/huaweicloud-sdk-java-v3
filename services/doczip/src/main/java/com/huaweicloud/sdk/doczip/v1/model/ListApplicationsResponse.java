package com.huaweicloud.sdk.doczip.v1.model;

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
public class ListApplicationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_list")

    private List<Application> applicationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")

    private String xTraceId;

    public ListApplicationsResponse withApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
        return this;
    }

    public ListApplicationsResponse addApplicationListItem(Application applicationListItem) {
        if (this.applicationList == null) {
            this.applicationList = new ArrayList<>();
        }
        this.applicationList.add(applicationListItem);
        return this;
    }

    public ListApplicationsResponse withApplicationList(Consumer<List<Application>> applicationListSetter) {
        if (this.applicationList == null) {
            this.applicationList = new ArrayList<>();
        }
        applicationListSetter.accept(this.applicationList);
        return this;
    }

    /**
     * **参数解释**： 返回的应用列表信息。 **取值范围**： 不涉及。
     * @return applicationList
     */
    public List<Application> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    public ListApplicationsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 总数。 **取值范围**： 不涉及。
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListApplicationsResponse withXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
        return this;
    }

    /**
     * Get xTraceId
     * @return xTraceId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")
    public String getXTraceId() {
        return xTraceId;
    }

    public void setXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApplicationsResponse that = (ListApplicationsResponse) obj;
        return Objects.equals(this.applicationList, that.applicationList) && Objects.equals(this.total, that.total)
            && Objects.equals(this.xTraceId, that.xTraceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationList, total, xTraceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationsResponse {\n");
        sb.append("    applicationList: ").append(toIndentedString(applicationList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xTraceId: ").append(toIndentedString(xTraceId)).append("\n");
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
