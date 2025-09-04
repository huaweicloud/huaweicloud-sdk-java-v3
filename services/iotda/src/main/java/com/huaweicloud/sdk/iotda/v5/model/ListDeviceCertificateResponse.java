package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListDeviceCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_certificates")

    private List<DeviceCertificateSimple> deviceCertificates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListDeviceCertificateResponse withDeviceCertificates(List<DeviceCertificateSimple> deviceCertificates) {
        this.deviceCertificates = deviceCertificates;
        return this;
    }

    public ListDeviceCertificateResponse addDeviceCertificatesItem(DeviceCertificateSimple deviceCertificatesItem) {
        if (this.deviceCertificates == null) {
            this.deviceCertificates = new ArrayList<>();
        }
        this.deviceCertificates.add(deviceCertificatesItem);
        return this;
    }

    public ListDeviceCertificateResponse withDeviceCertificates(
        Consumer<List<DeviceCertificateSimple>> deviceCertificatesSetter) {
        if (this.deviceCertificates == null) {
            this.deviceCertificates = new ArrayList<>();
        }
        deviceCertificatesSetter.accept(this.deviceCertificates);
        return this;
    }

    /**
     * 设备证书列表
     * @return deviceCertificates
     */
    public List<DeviceCertificateSimple> getDeviceCertificates() {
        return deviceCertificates;
    }

    public void setDeviceCertificates(List<DeviceCertificateSimple> deviceCertificates) {
        this.deviceCertificates = deviceCertificates;
    }

    public ListDeviceCertificateResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDeviceCertificateResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDeviceCertificateResponse that = (ListDeviceCertificateResponse) obj;
        return Objects.equals(this.deviceCertificates, that.deviceCertificates) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceCertificates, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceCertificateResponse {\n");
        sb.append("    deviceCertificates: ").append(toIndentedString(deviceCertificates)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
