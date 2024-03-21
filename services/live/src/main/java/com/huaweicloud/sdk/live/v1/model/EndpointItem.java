package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 拉流打包信息
 */
public class EndpointItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_package")

    private List<HlsPackageItem> hlsPackage = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dash_package")

    private List<DashPackageItem> dashPackage = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mss_package")

    private List<MssPackageItem> mssPackage = null;

    public EndpointItem withHlsPackage(List<HlsPackageItem> hlsPackage) {
        this.hlsPackage = hlsPackage;
        return this;
    }

    public EndpointItem addHlsPackageItem(HlsPackageItem hlsPackageItem) {
        if (this.hlsPackage == null) {
            this.hlsPackage = new ArrayList<>();
        }
        this.hlsPackage.add(hlsPackageItem);
        return this;
    }

    public EndpointItem withHlsPackage(Consumer<List<HlsPackageItem>> hlsPackageSetter) {
        if (this.hlsPackage == null) {
            this.hlsPackage = new ArrayList<>();
        }
        hlsPackageSetter.accept(this.hlsPackage);
        return this;
    }

    /**
     * HLS打包信息
     * @return hlsPackage
     */
    public List<HlsPackageItem> getHlsPackage() {
        return hlsPackage;
    }

    public void setHlsPackage(List<HlsPackageItem> hlsPackage) {
        this.hlsPackage = hlsPackage;
    }

    public EndpointItem withDashPackage(List<DashPackageItem> dashPackage) {
        this.dashPackage = dashPackage;
        return this;
    }

    public EndpointItem addDashPackageItem(DashPackageItem dashPackageItem) {
        if (this.dashPackage == null) {
            this.dashPackage = new ArrayList<>();
        }
        this.dashPackage.add(dashPackageItem);
        return this;
    }

    public EndpointItem withDashPackage(Consumer<List<DashPackageItem>> dashPackageSetter) {
        if (this.dashPackage == null) {
            this.dashPackage = new ArrayList<>();
        }
        dashPackageSetter.accept(this.dashPackage);
        return this;
    }

    /**
     * DASH打包信息
     * @return dashPackage
     */
    public List<DashPackageItem> getDashPackage() {
        return dashPackage;
    }

    public void setDashPackage(List<DashPackageItem> dashPackage) {
        this.dashPackage = dashPackage;
    }

    public EndpointItem withMssPackage(List<MssPackageItem> mssPackage) {
        this.mssPackage = mssPackage;
        return this;
    }

    public EndpointItem addMssPackageItem(MssPackageItem mssPackageItem) {
        if (this.mssPackage == null) {
            this.mssPackage = new ArrayList<>();
        }
        this.mssPackage.add(mssPackageItem);
        return this;
    }

    public EndpointItem withMssPackage(Consumer<List<MssPackageItem>> mssPackageSetter) {
        if (this.mssPackage == null) {
            this.mssPackage = new ArrayList<>();
        }
        mssPackageSetter.accept(this.mssPackage);
        return this;
    }

    /**
     * MSS打包信息
     * @return mssPackage
     */
    public List<MssPackageItem> getMssPackage() {
        return mssPackage;
    }

    public void setMssPackage(List<MssPackageItem> mssPackage) {
        this.mssPackage = mssPackage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndpointItem that = (EndpointItem) obj;
        return Objects.equals(this.hlsPackage, that.hlsPackage) && Objects.equals(this.dashPackage, that.dashPackage)
            && Objects.equals(this.mssPackage, that.mssPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hlsPackage, dashPackage, mssPackage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointItem {\n");
        sb.append("    hlsPackage: ").append(toIndentedString(hlsPackage)).append("\n");
        sb.append("    dashPackage: ").append(toIndentedString(dashPackage)).append("\n");
        sb.append("    mssPackage: ").append(toIndentedString(mssPackage)).append("\n");
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
