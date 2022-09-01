package com.huaweicloud.sdk.ccm.v1.model;

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
public class ListCertificateAuthorityObsBucketResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_buckets")

    @JacksonXmlProperty(localName = "obs_buckets")

    private List<ObsBuckets> obsBuckets = null;

    public ListCertificateAuthorityObsBucketResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * OBS桶总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListCertificateAuthorityObsBucketResponse withObsBuckets(List<ObsBuckets> obsBuckets) {
        this.obsBuckets = obsBuckets;
        return this;
    }

    public ListCertificateAuthorityObsBucketResponse addObsBucketsItem(ObsBuckets obsBucketsItem) {
        if (this.obsBuckets == null) {
            this.obsBuckets = new ArrayList<>();
        }
        this.obsBuckets.add(obsBucketsItem);
        return this;
    }

    public ListCertificateAuthorityObsBucketResponse withObsBuckets(Consumer<List<ObsBuckets>> obsBucketsSetter) {
        if (this.obsBuckets == null) {
            this.obsBuckets = new ArrayList<>();
        }
        obsBucketsSetter.accept(this.obsBuckets);
        return this;
    }

    /**
     * OBS桶列表，详情请参见**ObsBuckets**字段数据结构说明。
     * @return obsBuckets
     */
    public List<ObsBuckets> getObsBuckets() {
        return obsBuckets;
    }

    public void setObsBuckets(List<ObsBuckets> obsBuckets) {
        this.obsBuckets = obsBuckets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCertificateAuthorityObsBucketResponse listCertificateAuthorityObsBucketResponse =
            (ListCertificateAuthorityObsBucketResponse) o;
        return Objects.equals(this.total, listCertificateAuthorityObsBucketResponse.total)
            && Objects.equals(this.obsBuckets, listCertificateAuthorityObsBucketResponse.obsBuckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, obsBuckets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificateAuthorityObsBucketResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    obsBuckets: ").append(toIndentedString(obsBuckets)).append("\n");
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
