package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UploadWarehouseAppIconResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appicon_store_path")

    private String appiconStorePath;

    public UploadWarehouseAppIconResponse withAppiconStorePath(String appiconStorePath) {
        this.appiconStorePath = appiconStorePath;
        return this;
    }

    /**
     * 图标文件在obs桶经过cdn加速以后的地址。
     * @return appiconStorePath
     */
    public String getAppiconStorePath() {
        return appiconStorePath;
    }

    public void setAppiconStorePath(String appiconStorePath) {
        this.appiconStorePath = appiconStorePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadWarehouseAppIconResponse that = (UploadWarehouseAppIconResponse) obj;
        return Objects.equals(this.appiconStorePath, that.appiconStorePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appiconStorePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadWarehouseAppIconResponse {\n");
        sb.append("    appiconStorePath: ").append(toIndentedString(appiconStorePath)).append("\n");
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
