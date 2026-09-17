package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowConnectionDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "das_conn_info")

    private DasConnInfo dasConnInfo;

    public ShowConnectionDetailResponse withDasConnInfo(DasConnInfo dasConnInfo) {
        this.dasConnInfo = dasConnInfo;
        return this;
    }

    public ShowConnectionDetailResponse withDasConnInfo(Consumer<DasConnInfo> dasConnInfoSetter) {
        if (this.dasConnInfo == null) {
            this.dasConnInfo = new DasConnInfo();
            dasConnInfoSetter.accept(this.dasConnInfo);
        }

        return this;
    }

    /**
     * Get dasConnInfo
     * @return dasConnInfo
     */
    public DasConnInfo getDasConnInfo() {
        return dasConnInfo;
    }

    public void setDasConnInfo(DasConnInfo dasConnInfo) {
        this.dasConnInfo = dasConnInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConnectionDetailResponse that = (ShowConnectionDetailResponse) obj;
        return Objects.equals(this.dasConnInfo, that.dasConnInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dasConnInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConnectionDetailResponse {\n");
        sb.append("    dasConnInfo: ").append(toIndentedString(dasConnInfo)).append("\n");
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
