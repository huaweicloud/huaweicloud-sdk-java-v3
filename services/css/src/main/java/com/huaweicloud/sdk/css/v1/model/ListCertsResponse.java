package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCertsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certsRecords")

    private CertsRecordsDatastore certsRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSize")

    private Integer totalSize;

    public ListCertsResponse withCertsRecords(CertsRecordsDatastore certsRecords) {
        this.certsRecords = certsRecords;
        return this;
    }

    public ListCertsResponse withCertsRecords(Consumer<CertsRecordsDatastore> certsRecordsSetter) {
        if (this.certsRecords == null) {
            this.certsRecords = new CertsRecordsDatastore();
            certsRecordsSetter.accept(this.certsRecords);
        }

        return this;
    }

    /**
     * Get certsRecords
     * @return certsRecords
     */
    public CertsRecordsDatastore getCertsRecords() {
        return certsRecords;
    }

    public void setCertsRecords(CertsRecordsDatastore certsRecords) {
        this.certsRecords = certsRecords;
    }

    public ListCertsResponse withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 证书记录数量。
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCertsResponse that = (ListCertsResponse) obj;
        return Objects.equals(this.certsRecords, that.certsRecords) && Objects.equals(this.totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certsRecords, totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertsResponse {\n");
        sb.append("    certsRecords: ").append(toIndentedString(certsRecords)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
