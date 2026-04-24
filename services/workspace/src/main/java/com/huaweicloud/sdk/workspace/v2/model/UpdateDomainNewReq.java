package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新域控的配置信息请求。
 */
public class UpdateDomainNewReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uos_domain_info")

    private UpdateUosDomainInfo uosDomainInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_domain_info")

    private AdDomain adDomainInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private DomainType authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config_id")

    private String authConfigId;

    public UpdateDomainNewReq withUosDomainInfo(UpdateUosDomainInfo uosDomainInfo) {
        this.uosDomainInfo = uosDomainInfo;
        return this;
    }

    public UpdateDomainNewReq withUosDomainInfo(Consumer<UpdateUosDomainInfo> uosDomainInfoSetter) {
        if (this.uosDomainInfo == null) {
            this.uosDomainInfo = new UpdateUosDomainInfo();
            uosDomainInfoSetter.accept(this.uosDomainInfo);
        }

        return this;
    }

    /**
     * Get uosDomainInfo
     * @return uosDomainInfo
     */
    public UpdateUosDomainInfo getUosDomainInfo() {
        return uosDomainInfo;
    }

    public void setUosDomainInfo(UpdateUosDomainInfo uosDomainInfo) {
        this.uosDomainInfo = uosDomainInfo;
    }

    public UpdateDomainNewReq withAdDomainInfo(AdDomain adDomainInfo) {
        this.adDomainInfo = adDomainInfo;
        return this;
    }

    public UpdateDomainNewReq withAdDomainInfo(Consumer<AdDomain> adDomainInfoSetter) {
        if (this.adDomainInfo == null) {
            this.adDomainInfo = new AdDomain();
            adDomainInfoSetter.accept(this.adDomainInfo);
        }

        return this;
    }

    /**
     * Get adDomainInfo
     * @return adDomainInfo
     */
    public AdDomain getAdDomainInfo() {
        return adDomainInfo;
    }

    public void setAdDomainInfo(AdDomain adDomainInfo) {
        this.adDomainInfo = adDomainInfo;
    }

    public UpdateDomainNewReq withAuthType(DomainType authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get authType
     * @return authType
     */
    public DomainType getAuthType() {
        return authType;
    }

    public void setAuthType(DomainType authType) {
        this.authType = authType;
    }

    public UpdateDomainNewReq withAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
        return this;
    }

    /**
     * 认证配置id。
     * @return authConfigId
     */
    public String getAuthConfigId() {
        return authConfigId;
    }

    public void setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDomainNewReq that = (UpdateDomainNewReq) obj;
        return Objects.equals(this.uosDomainInfo, that.uosDomainInfo)
            && Objects.equals(this.adDomainInfo, that.adDomainInfo) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.authConfigId, that.authConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uosDomainInfo, adDomainInfo, authType, authConfigId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainNewReq {\n");
        sb.append("    uosDomainInfo: ").append(toIndentedString(uosDomainInfo)).append("\n");
        sb.append("    adDomainInfo: ").append(toIndentedString(adDomainInfo)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
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
