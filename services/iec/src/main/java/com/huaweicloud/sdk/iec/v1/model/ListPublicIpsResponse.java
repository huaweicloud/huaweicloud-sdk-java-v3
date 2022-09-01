package com.huaweicloud.sdk.iec.v1.model;

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
public class ListPublicIpsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    @JacksonXmlProperty(localName = "publicips")

    private List<PublicIp> publicips = null;

    public ListPublicIpsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 弹性公网IP数目。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPublicIpsResponse withPublicips(List<PublicIp> publicips) {
        this.publicips = publicips;
        return this;
    }

    public ListPublicIpsResponse addPublicipsItem(PublicIp publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public ListPublicIpsResponse withPublicips(Consumer<List<PublicIp>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * 弹性公网IP数组对象。
     * @return publicips
     */
    public List<PublicIp> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<PublicIp> publicips) {
        this.publicips = publicips;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPublicIpsResponse listPublicIpsResponse = (ListPublicIpsResponse) o;
        return Objects.equals(this.count, listPublicIpsResponse.count)
            && Objects.equals(this.publicips, listPublicIpsResponse.publicips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, publicips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicIpsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
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
