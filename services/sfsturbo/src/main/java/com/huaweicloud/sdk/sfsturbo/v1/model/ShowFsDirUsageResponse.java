package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFsDirUsageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir_usage")

    private FsDirUasge dirUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowFsDirUsageResponse withDirUsage(FsDirUasge dirUsage) {
        this.dirUsage = dirUsage;
        return this;
    }

    public ShowFsDirUsageResponse withDirUsage(Consumer<FsDirUasge> dirUsageSetter) {
        if (this.dirUsage == null) {
            this.dirUsage = new FsDirUasge();
            dirUsageSetter.accept(this.dirUsage);
        }

        return this;
    }

    /**
     * Get dirUsage
     * @return dirUsage
     */
    public FsDirUasge getDirUsage() {
        return dirUsage;
    }

    public void setDirUsage(FsDirUasge dirUsage) {
        this.dirUsage = dirUsage;
    }

    public ShowFsDirUsageResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFsDirUsageResponse that = (ShowFsDirUsageResponse) obj;
        return Objects.equals(this.dirUsage, that.dirUsage) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dirUsage, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFsDirUsageResponse {\n");
        sb.append("    dirUsage: ").append(toIndentedString(dirUsage)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
