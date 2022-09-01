package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAvailableZoneResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_infos")

    @JacksonXmlProperty(localName = "az_infos")

    private List<AzInfoResp> azInfos = null;

    public ListAvailableZoneResponse withAzInfos(List<AzInfoResp> azInfos) {
        this.azInfos = azInfos;
        return this;
    }

    public ListAvailableZoneResponse addAzInfosItem(AzInfoResp azInfosItem) {
        if (this.azInfos == null) {
            this.azInfos = new ArrayList<>();
        }
        this.azInfos.add(azInfosItem);
        return this;
    }

    public ListAvailableZoneResponse withAzInfos(Consumer<List<AzInfoResp>> azInfosSetter) {
        if (this.azInfos == null) {
            this.azInfos = new ArrayList<>();
        }
        azInfosSetter.accept(this.azInfos);
        return this;
    }

    /**
     * 可用区信息
     * @return azInfos
     */
    public List<AzInfoResp> getAzInfos() {
        return azInfos;
    }

    public void setAzInfos(List<AzInfoResp> azInfos) {
        this.azInfos = azInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailableZoneResponse listAvailableZoneResponse = (ListAvailableZoneResponse) o;
        return Objects.equals(this.azInfos, listAvailableZoneResponse.azInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableZoneResponse {\n");
        sb.append("    azInfos: ").append(toIndentedString(azInfos)).append("\n");
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
