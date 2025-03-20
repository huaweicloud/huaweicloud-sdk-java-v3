package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListMfaDevicesV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mfa_devices")

    private List<MfaDeviceMetadata> mfaDevices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListMfaDevicesV5Response withMfaDevices(List<MfaDeviceMetadata> mfaDevices) {
        this.mfaDevices = mfaDevices;
        return this;
    }

    public ListMfaDevicesV5Response addMfaDevicesItem(MfaDeviceMetadata mfaDevicesItem) {
        if (this.mfaDevices == null) {
            this.mfaDevices = new ArrayList<>();
        }
        this.mfaDevices.add(mfaDevicesItem);
        return this;
    }

    public ListMfaDevicesV5Response withMfaDevices(Consumer<List<MfaDeviceMetadata>> mfaDevicesSetter) {
        if (this.mfaDevices == null) {
            this.mfaDevices = new ArrayList<>();
        }
        mfaDevicesSetter.accept(this.mfaDevices);
        return this;
    }

    /**
     * 虚拟MFA设备列表。
     * @return mfaDevices
     */
    public List<MfaDeviceMetadata> getMfaDevices() {
        return mfaDevices;
    }

    public void setMfaDevices(List<MfaDeviceMetadata> mfaDevices) {
        this.mfaDevices = mfaDevices;
    }

    public ListMfaDevicesV5Response withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListMfaDevicesV5Response withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMfaDevicesV5Response that = (ListMfaDevicesV5Response) obj;
        return Objects.equals(this.mfaDevices, that.mfaDevices) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mfaDevices, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMfaDevicesV5Response {\n");
        sb.append("    mfaDevices: ").append(toIndentedString(mfaDevices)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
