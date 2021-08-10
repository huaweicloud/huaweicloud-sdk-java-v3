package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class UploadJsonAccessoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_id")

    private String accessoryId;

    public UploadJsonAccessoriesResponse withAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
        return this;
    }

    /** 附件id
     * 
     * @return accessoryId */
    public String getAccessoryId() {
        return accessoryId;
    }

    public void setAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadJsonAccessoriesResponse uploadJsonAccessoriesResponse = (UploadJsonAccessoriesResponse) o;
        return Objects.equals(this.accessoryId, uploadJsonAccessoriesResponse.accessoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessoryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadJsonAccessoriesResponse {\n");
        sb.append("    accessoryId: ").append(toIndentedString(accessoryId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
