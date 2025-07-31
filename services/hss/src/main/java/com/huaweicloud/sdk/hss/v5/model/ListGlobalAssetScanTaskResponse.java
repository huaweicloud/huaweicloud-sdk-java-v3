package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListGlobalAssetScanTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist")

    private Boolean exist;

    public ListGlobalAssetScanTaskResponse withExist(Boolean exist) {
        this.exist = exist;
        return this;
    }

    /**
     * 是否存在全量扫描任务: - true ：是 - false : 否
     * @return exist
     */
    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalAssetScanTaskResponse that = (ListGlobalAssetScanTaskResponse) obj;
        return Objects.equals(this.exist, that.exist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalAssetScanTaskResponse {\n");
        sb.append("    exist: ").append(toIndentedString(exist)).append("\n");
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
