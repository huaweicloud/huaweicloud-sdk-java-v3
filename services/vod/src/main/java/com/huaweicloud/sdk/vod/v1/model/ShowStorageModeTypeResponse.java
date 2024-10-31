package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowStorageModeTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mode_type")

    private String storageModeType;

    public ShowStorageModeTypeResponse withStorageModeType(String storageModeType) {
        this.storageModeType = storageModeType;
        return this;
    }

    /**
     * 降冷模式。 取值如下： - WHOLE：整个媒资粒度。 - ORIGIN：原文件粒度。 
     * @return storageModeType
     */
    public String getStorageModeType() {
        return storageModeType;
    }

    public void setStorageModeType(String storageModeType) {
        this.storageModeType = storageModeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStorageModeTypeResponse that = (ShowStorageModeTypeResponse) obj;
        return Objects.equals(this.storageModeType, that.storageModeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageModeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStorageModeTypeResponse {\n");
        sb.append("    storageModeType: ").append(toIndentedString(storageModeType)).append("\n");
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
