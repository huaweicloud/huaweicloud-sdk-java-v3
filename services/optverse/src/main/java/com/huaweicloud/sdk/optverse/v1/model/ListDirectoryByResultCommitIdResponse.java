package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDirectoryByResultCommitIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_info")

    private MetaInfo metaInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload")

    private PayloadObject payload;

    public ListDirectoryByResultCommitIdResponse withMetaInfo(MetaInfo metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }

    public ListDirectoryByResultCommitIdResponse withMetaInfo(Consumer<MetaInfo> metaInfoSetter) {
        if (this.metaInfo == null) {
            this.metaInfo = new MetaInfo();
            metaInfoSetter.accept(this.metaInfo);
        }

        return this;
    }

    /**
     * Get metaInfo
     * @return metaInfo
     */
    public MetaInfo getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(MetaInfo metaInfo) {
        this.metaInfo = metaInfo;
    }

    public ListDirectoryByResultCommitIdResponse withPayload(PayloadObject payload) {
        this.payload = payload;
        return this;
    }

    public ListDirectoryByResultCommitIdResponse withPayload(Consumer<PayloadObject> payloadSetter) {
        if (this.payload == null) {
            this.payload = new PayloadObject();
            payloadSetter.accept(this.payload);
        }

        return this;
    }

    /**
     * Get payload
     * @return payload
     */
    public PayloadObject getPayload() {
        return payload;
    }

    public void setPayload(PayloadObject payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDirectoryByResultCommitIdResponse that = (ListDirectoryByResultCommitIdResponse) obj;
        return Objects.equals(this.metaInfo, that.metaInfo) && Objects.equals(this.payload, that.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaInfo, payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDirectoryByResultCommitIdResponse {\n");
        sb.append("    metaInfo: ").append(toIndentedString(metaInfo)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
