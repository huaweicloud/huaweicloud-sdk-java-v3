package com.huaweicloud.sdk.live.v2.model;

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
public class ListSingleStreamBitrateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate_info_list")

    @JacksonXmlProperty(localName = "bitrate_info_list")

    private List<V2BitrateInfo> bitrateInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    @JacksonXmlProperty(localName = "X-Request-Id")

    private String xRequestId;

    public ListSingleStreamBitrateResponse withBitrateInfoList(List<V2BitrateInfo> bitrateInfoList) {
        this.bitrateInfoList = bitrateInfoList;
        return this;
    }

    public ListSingleStreamBitrateResponse addBitrateInfoListItem(V2BitrateInfo bitrateInfoListItem) {
        if (this.bitrateInfoList == null) {
            this.bitrateInfoList = new ArrayList<>();
        }
        this.bitrateInfoList.add(bitrateInfoListItem);
        return this;
    }

    public ListSingleStreamBitrateResponse withBitrateInfoList(Consumer<List<V2BitrateInfo>> bitrateInfoListSetter) {
        if (this.bitrateInfoList == null) {
            this.bitrateInfoList = new ArrayList<>();
        }
        bitrateInfoListSetter.accept(this.bitrateInfoList);
        return this;
    }

    /**
     * 用量详情。
     * @return bitrateInfoList
     */
    public List<V2BitrateInfo> getBitrateInfoList() {
        return bitrateInfoList;
    }

    public void setBitrateInfoList(List<V2BitrateInfo> bitrateInfoList) {
        this.bitrateInfoList = bitrateInfoList;
    }

    public ListSingleStreamBitrateResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSingleStreamBitrateResponse listSingleStreamBitrateResponse = (ListSingleStreamBitrateResponse) o;
        return Objects.equals(this.bitrateInfoList, listSingleStreamBitrateResponse.bitrateInfoList)
            && Objects.equals(this.xRequestId, listSingleStreamBitrateResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bitrateInfoList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSingleStreamBitrateResponse {\n");
        sb.append("    bitrateInfoList: ").append(toIndentedString(bitrateInfoList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
