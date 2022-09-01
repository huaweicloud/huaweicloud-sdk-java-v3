package com.huaweicloud.sdk.cse.v1.model;

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
public class DownloadKieResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private DownloadKieResponseBodyMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    @JacksonXmlProperty(localName = "data")

    private List<CreateKieReq> data = null;

    public DownloadKieResponse withMetadata(DownloadKieResponseBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public DownloadKieResponse withMetadata(Consumer<DownloadKieResponseBodyMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new DownloadKieResponseBodyMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public DownloadKieResponseBodyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(DownloadKieResponseBodyMetadata metadata) {
        this.metadata = metadata;
    }

    public DownloadKieResponse withData(List<CreateKieReq> data) {
        this.data = data;
        return this;
    }

    public DownloadKieResponse addDataItem(CreateKieReq dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public DownloadKieResponse withData(Consumer<List<CreateKieReq>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 导出的配置项列表。
     * @return data
     */
    public List<CreateKieReq> getData() {
        return data;
    }

    public void setData(List<CreateKieReq> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadKieResponse downloadKieResponse = (DownloadKieResponse) o;
        return Objects.equals(this.metadata, downloadKieResponse.metadata)
            && Objects.equals(this.data, downloadKieResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadKieResponse {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
