package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListHarmonySoftBusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "harmony_soft_buses")

    private List<HarmonySoftBusResponseDTO> harmonySoftBuses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListHarmonySoftBusResponse withHarmonySoftBuses(List<HarmonySoftBusResponseDTO> harmonySoftBuses) {
        this.harmonySoftBuses = harmonySoftBuses;
        return this;
    }

    public ListHarmonySoftBusResponse addHarmonySoftBusesItem(HarmonySoftBusResponseDTO harmonySoftBusesItem) {
        if (this.harmonySoftBuses == null) {
            this.harmonySoftBuses = new ArrayList<>();
        }
        this.harmonySoftBuses.add(harmonySoftBusesItem);
        return this;
    }

    public ListHarmonySoftBusResponse withHarmonySoftBuses(
        Consumer<List<HarmonySoftBusResponseDTO>> harmonySoftBusesSetter) {
        if (this.harmonySoftBuses == null) {
            this.harmonySoftBuses = new ArrayList<>();
        }
        harmonySoftBusesSetter.accept(this.harmonySoftBuses);
        return this;
    }

    /**
     * 设备组信息列表。
     * @return harmonySoftBuses
     */
    public List<HarmonySoftBusResponseDTO> getHarmonySoftBuses() {
        return harmonySoftBuses;
    }

    public void setHarmonySoftBuses(List<HarmonySoftBusResponseDTO> harmonySoftBuses) {
        this.harmonySoftBuses = harmonySoftBuses;
    }

    public ListHarmonySoftBusResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListHarmonySoftBusResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHarmonySoftBusResponse that = (ListHarmonySoftBusResponse) obj;
        return Objects.equals(this.harmonySoftBuses, that.harmonySoftBuses) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(harmonySoftBuses, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHarmonySoftBusResponse {\n");
        sb.append("    harmonySoftBuses: ").append(toIndentedString(harmonySoftBuses)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
