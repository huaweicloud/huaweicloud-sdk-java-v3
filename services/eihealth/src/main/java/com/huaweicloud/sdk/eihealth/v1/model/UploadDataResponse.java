package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UploadDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multipart_id")

    private String multipartId;

    public UploadDataResponse withMultipartId(String multipartId) {
        this.multipartId = multipartId;
        return this;
    }

    /**
     * 分段上传任务id
     * @return multipartId
     */
    public String getMultipartId() {
        return multipartId;
    }

    public void setMultipartId(String multipartId) {
        this.multipartId = multipartId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadDataResponse uploadDataResponse = (UploadDataResponse) o;
        return Objects.equals(this.multipartId, uploadDataResponse.multipartId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multipartId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadDataResponse {\n");
        sb.append("    multipartId: ").append(toIndentedString(multipartId)).append("\n");
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
