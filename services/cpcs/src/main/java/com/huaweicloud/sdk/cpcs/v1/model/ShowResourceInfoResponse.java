package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResourceInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service")

    private CloudServiceInfo cloudService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccsp_service")

    private CcspServiceInfo ccspService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vsm")

    private VsmResourceInfo vsm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private AppResourceInfo app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms")

    private KmsResourceInfo kms;

    public ShowResourceInfoResponse withCloudService(CloudServiceInfo cloudService) {
        this.cloudService = cloudService;
        return this;
    }

    public ShowResourceInfoResponse withCloudService(Consumer<CloudServiceInfo> cloudServiceSetter) {
        if (this.cloudService == null) {
            this.cloudService = new CloudServiceInfo();
            cloudServiceSetter.accept(this.cloudService);
        }

        return this;
    }

    /**
     * Get cloudService
     * @return cloudService
     */
    public CloudServiceInfo getCloudService() {
        return cloudService;
    }

    public void setCloudService(CloudServiceInfo cloudService) {
        this.cloudService = cloudService;
    }

    public ShowResourceInfoResponse withCcspService(CcspServiceInfo ccspService) {
        this.ccspService = ccspService;
        return this;
    }

    public ShowResourceInfoResponse withCcspService(Consumer<CcspServiceInfo> ccspServiceSetter) {
        if (this.ccspService == null) {
            this.ccspService = new CcspServiceInfo();
            ccspServiceSetter.accept(this.ccspService);
        }

        return this;
    }

    /**
     * Get ccspService
     * @return ccspService
     */
    public CcspServiceInfo getCcspService() {
        return ccspService;
    }

    public void setCcspService(CcspServiceInfo ccspService) {
        this.ccspService = ccspService;
    }

    public ShowResourceInfoResponse withVsm(VsmResourceInfo vsm) {
        this.vsm = vsm;
        return this;
    }

    public ShowResourceInfoResponse withVsm(Consumer<VsmResourceInfo> vsmSetter) {
        if (this.vsm == null) {
            this.vsm = new VsmResourceInfo();
            vsmSetter.accept(this.vsm);
        }

        return this;
    }

    /**
     * Get vsm
     * @return vsm
     */
    public VsmResourceInfo getVsm() {
        return vsm;
    }

    public void setVsm(VsmResourceInfo vsm) {
        this.vsm = vsm;
    }

    public ShowResourceInfoResponse withApp(AppResourceInfo app) {
        this.app = app;
        return this;
    }

    public ShowResourceInfoResponse withApp(Consumer<AppResourceInfo> appSetter) {
        if (this.app == null) {
            this.app = new AppResourceInfo();
            appSetter.accept(this.app);
        }

        return this;
    }

    /**
     * Get app
     * @return app
     */
    public AppResourceInfo getApp() {
        return app;
    }

    public void setApp(AppResourceInfo app) {
        this.app = app;
    }

    public ShowResourceInfoResponse withKms(KmsResourceInfo kms) {
        this.kms = kms;
        return this;
    }

    public ShowResourceInfoResponse withKms(Consumer<KmsResourceInfo> kmsSetter) {
        if (this.kms == null) {
            this.kms = new KmsResourceInfo();
            kmsSetter.accept(this.kms);
        }

        return this;
    }

    /**
     * Get kms
     * @return kms
     */
    public KmsResourceInfo getKms() {
        return kms;
    }

    public void setKms(KmsResourceInfo kms) {
        this.kms = kms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceInfoResponse that = (ShowResourceInfoResponse) obj;
        return Objects.equals(this.cloudService, that.cloudService)
            && Objects.equals(this.ccspService, that.ccspService) && Objects.equals(this.vsm, that.vsm)
            && Objects.equals(this.app, that.app) && Objects.equals(this.kms, that.kms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudService, ccspService, vsm, app, kms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceInfoResponse {\n");
        sb.append("    cloudService: ").append(toIndentedString(cloudService)).append("\n");
        sb.append("    ccspService: ").append(toIndentedString(ccspService)).append("\n");
        sb.append("    vsm: ").append(toIndentedString(vsm)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    kms: ").append(toIndentedString(kms)).append("\n");
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
