package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 带宽包线路。
 */
public class BandwidthPackageLine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_region_id")

    private String localRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_region_id")

    private String remoteRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_site_code")

    private String localSiteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_site_code")

    private String remoteSiteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_levels")

    private List<String> supportLevels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_codes")

    private List<BandwidthPackageLineSpecCode> specCodes = null;

    public BandwidthPackageLine withLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
        return this;
    }

    /**
     * RegionID。
     * @return localRegionId
     */
    public String getLocalRegionId() {
        return localRegionId;
    }

    public void setLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
    }

    public BandwidthPackageLine withRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
        return this;
    }

    /**
     * RegionID。
     * @return remoteRegionId
     */
    public String getRemoteRegionId() {
        return remoteRegionId;
    }

    public void setRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
    }

    public BandwidthPackageLine withLocalSiteCode(String localSiteCode) {
        this.localSiteCode = localSiteCode;
        return this;
    }

    /**
     * 站点编码。
     * @return localSiteCode
     */
    public String getLocalSiteCode() {
        return localSiteCode;
    }

    public void setLocalSiteCode(String localSiteCode) {
        this.localSiteCode = localSiteCode;
    }

    public BandwidthPackageLine withRemoteSiteCode(String remoteSiteCode) {
        this.remoteSiteCode = remoteSiteCode;
        return this;
    }

    /**
     * 站点编码。
     * @return remoteSiteCode
     */
    public String getRemoteSiteCode() {
        return remoteSiteCode;
    }

    public void setRemoteSiteCode(String remoteSiteCode) {
        this.remoteSiteCode = remoteSiteCode;
    }

    public BandwidthPackageLine withSupportLevels(List<String> supportLevels) {
        this.supportLevels = supportLevels;
        return this;
    }

    public BandwidthPackageLine addSupportLevelsItem(String supportLevelsItem) {
        if (this.supportLevels == null) {
            this.supportLevels = new ArrayList<>();
        }
        this.supportLevels.add(supportLevelsItem);
        return this;
    }

    public BandwidthPackageLine withSupportLevels(Consumer<List<String>> supportLevelsSetter) {
        if (this.supportLevels == null) {
            this.supportLevels = new ArrayList<>();
        }
        supportLevelsSetter.accept(this.supportLevels);
        return this;
    }

    /**
     * 支持的等级列表。
     * @return supportLevels
     */
    public List<String> getSupportLevels() {
        return supportLevels;
    }

    public void setSupportLevels(List<String> supportLevels) {
        this.supportLevels = supportLevels;
    }

    public BandwidthPackageLine withSpecCodes(List<BandwidthPackageLineSpecCode> specCodes) {
        this.specCodes = specCodes;
        return this;
    }

    public BandwidthPackageLine addSpecCodesItem(BandwidthPackageLineSpecCode specCodesItem) {
        if (this.specCodes == null) {
            this.specCodes = new ArrayList<>();
        }
        this.specCodes.add(specCodesItem);
        return this;
    }

    public BandwidthPackageLine withSpecCodes(Consumer<List<BandwidthPackageLineSpecCode>> specCodesSetter) {
        if (this.specCodes == null) {
            this.specCodes = new ArrayList<>();
        }
        specCodesSetter.accept(this.specCodes);
        return this;
    }

    /**
     * 产品编码列表。
     * @return specCodes
     */
    public List<BandwidthPackageLineSpecCode> getSpecCodes() {
        return specCodes;
    }

    public void setSpecCodes(List<BandwidthPackageLineSpecCode> specCodes) {
        this.specCodes = specCodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BandwidthPackageLine that = (BandwidthPackageLine) obj;
        return Objects.equals(this.localRegionId, that.localRegionId)
            && Objects.equals(this.remoteRegionId, that.remoteRegionId)
            && Objects.equals(this.localSiteCode, that.localSiteCode)
            && Objects.equals(this.remoteSiteCode, that.remoteSiteCode)
            && Objects.equals(this.supportLevels, that.supportLevels) && Objects.equals(this.specCodes, that.specCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localRegionId, remoteRegionId, localSiteCode, remoteSiteCode, supportLevels, specCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthPackageLine {\n");
        sb.append("    localRegionId: ").append(toIndentedString(localRegionId)).append("\n");
        sb.append("    remoteRegionId: ").append(toIndentedString(remoteRegionId)).append("\n");
        sb.append("    localSiteCode: ").append(toIndentedString(localSiteCode)).append("\n");
        sb.append("    remoteSiteCode: ").append(toIndentedString(remoteSiteCode)).append("\n");
        sb.append("    supportLevels: ").append(toIndentedString(supportLevels)).append("\n");
        sb.append("    specCodes: ").append(toIndentedString(specCodes)).append("\n");
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
