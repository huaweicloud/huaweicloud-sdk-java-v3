package com.huaweicloud.sdk.dris.v1.model;

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
public class BatchShowRadarsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radars")

    private List<RadarResourceDTO> radars = null;

    public BatchShowRadarsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：总数 
     * minimum: 0
     * maximum: 1000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public BatchShowRadarsResponse withRadars(List<RadarResourceDTO> radars) {
        this.radars = radars;
        return this;
    }

    public BatchShowRadarsResponse addRadarsItem(RadarResourceDTO radarsItem) {
        if (this.radars == null) {
            this.radars = new ArrayList<>();
        }
        this.radars.add(radarsItem);
        return this;
    }

    public BatchShowRadarsResponse withRadars(Consumer<List<RadarResourceDTO>> radarsSetter) {
        if (this.radars == null) {
            this.radars = new ArrayList<>();
        }
        radarsSetter.accept(this.radars);
        return this;
    }

    /**
     * **参数说明**：数据列表 
     * @return radars
     */
    public List<RadarResourceDTO> getRadars() {
        return radars;
    }

    public void setRadars(List<RadarResourceDTO> radars) {
        this.radars = radars;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchShowRadarsResponse that = (BatchShowRadarsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.radars, that.radars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, radars);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowRadarsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    radars: ").append(toIndentedString(radars)).append("\n");
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
