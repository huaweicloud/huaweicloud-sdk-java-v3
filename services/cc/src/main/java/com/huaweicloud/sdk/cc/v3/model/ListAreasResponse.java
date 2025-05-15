package com.huaweicloud.sdk.cc.v3.model;

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
public class ListAreasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "areas")

    private List<Area> areas = null;

    public ListAreasResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListAreasResponse withAreas(List<Area> areas) {
        this.areas = areas;
        return this;
    }

    public ListAreasResponse addAreasItem(Area areasItem) {
        if (this.areas == null) {
            this.areas = new ArrayList<>();
        }
        this.areas.add(areasItem);
        return this;
    }

    public ListAreasResponse withAreas(Consumer<List<Area>> areasSetter) {
        if (this.areas == null) {
            this.areas = new ArrayList<>();
        }
        areasSetter.accept(this.areas);
        return this;
    }

    /**
     * 大区列表。
     * @return areas
     */
    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAreasResponse that = (ListAreasResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.areas, that.areas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, areas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAreasResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
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
