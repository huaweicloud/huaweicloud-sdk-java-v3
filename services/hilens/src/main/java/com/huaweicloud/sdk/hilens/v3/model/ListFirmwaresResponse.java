package com.huaweicloud.sdk.hilens.v3.model;

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
public class ListFirmwaresResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmwares")

    private List<ListFirmwaresResponseData> firmwares = null;

    public ListFirmwaresResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 固件数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListFirmwaresResponse withFirmwares(List<ListFirmwaresResponseData> firmwares) {
        this.firmwares = firmwares;
        return this;
    }

    public ListFirmwaresResponse addFirmwaresItem(ListFirmwaresResponseData firmwaresItem) {
        if (this.firmwares == null) {
            this.firmwares = new ArrayList<>();
        }
        this.firmwares.add(firmwaresItem);
        return this;
    }

    public ListFirmwaresResponse withFirmwares(Consumer<List<ListFirmwaresResponseData>> firmwaresSetter) {
        if (this.firmwares == null) {
            this.firmwares = new ArrayList<>();
        }
        firmwaresSetter.accept(this.firmwares);
        return this;
    }

    /**
     * 固件列表
     * @return firmwares
     */
    public List<ListFirmwaresResponseData> getFirmwares() {
        return firmwares;
    }

    public void setFirmwares(List<ListFirmwaresResponseData> firmwares) {
        this.firmwares = firmwares;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFirmwaresResponse that = (ListFirmwaresResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.firmwares, that.firmwares);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, firmwares);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFirmwaresResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    firmwares: ").append(toIndentedString(firmwares)).append("\n");
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
