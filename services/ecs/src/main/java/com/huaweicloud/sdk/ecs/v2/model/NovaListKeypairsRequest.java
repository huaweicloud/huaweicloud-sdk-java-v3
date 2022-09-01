package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class NovaListKeypairsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    @JacksonXmlProperty(localName = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OpenStack-API-Version")

    @JacksonXmlProperty(localName = "OpenStack-API-Version")

    private String openStackAPIVersion;

    public NovaListKeypairsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回秘钥数量限制。  在微版本2.35后支持
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public NovaListKeypairsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 从marker指定的keypair的名称的下一条数据开始查询。  在微版本2.35后支持。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public NovaListKeypairsRequest withOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
        return this;
    }

    /**
     * 微版本头
     * @return openStackAPIVersion
     */
    public String getOpenStackAPIVersion() {
        return openStackAPIVersion;
    }

    public void setOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaListKeypairsRequest novaListKeypairsRequest = (NovaListKeypairsRequest) o;
        return Objects.equals(this.limit, novaListKeypairsRequest.limit)
            && Objects.equals(this.marker, novaListKeypairsRequest.marker)
            && Objects.equals(this.openStackAPIVersion, novaListKeypairsRequest.openStackAPIVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, openStackAPIVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaListKeypairsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    openStackAPIVersion: ").append(toIndentedString(openStackAPIVersion)).append("\n");
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
