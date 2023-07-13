package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订阅应用请求体
 */
public class SubscribeAppReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_version")

    private String assetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_app_name")

    private String destinationAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_app_version")

    private String destinationAppVersion;

    public SubscribeAppReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产id。长度1-128，只能包含字母、数字、下划线和中划线
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public SubscribeAppReq withAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
        return this;
    }

    /**
     * 资产版本。长度1-128，字母或数字开头，后面跟小写字母、数字、小数点、斜杠、下划线或中划线
     * @return assetVersion
     */
    public String getAssetVersion() {
        return assetVersion;
    }

    public void setAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
    }

    public SubscribeAppReq withDestinationAppName(String destinationAppName) {
        this.destinationAppName = destinationAppName;
        return this;
    }

    /**
     * 目标应用名称 取值范围：长度为[1,56]，以大小写字母开头，允许出现中划线(-)、下划线(_)、小写字母和数字，且必须以大小写字母或数字结尾。
     * @return destinationAppName
     */
    public String getDestinationAppName() {
        return destinationAppName;
    }

    public void setDestinationAppName(String destinationAppName) {
        this.destinationAppName = destinationAppName;
    }

    public SubscribeAppReq withDestinationAppVersion(String destinationAppVersion) {
        this.destinationAppVersion = destinationAppVersion;
        return this;
    }

    /**
     * 目标应用版本。取值范围：长度[1,24]，以小写字母或数字或大写字母开头，允许出现中划线，必须以小写字母或数字或大写字母结尾。
     * @return destinationAppVersion
     */
    public String getDestinationAppVersion() {
        return destinationAppVersion;
    }

    public void setDestinationAppVersion(String destinationAppVersion) {
        this.destinationAppVersion = destinationAppVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeAppReq that = (SubscribeAppReq) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.assetVersion, that.assetVersion)
            && Objects.equals(this.destinationAppName, that.destinationAppName)
            && Objects.equals(this.destinationAppVersion, that.destinationAppVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, assetVersion, destinationAppName, destinationAppVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeAppReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
        sb.append("    destinationAppName: ").append(toIndentedString(destinationAppName)).append("\n");
        sb.append("    destinationAppVersion: ").append(toIndentedString(destinationAppVersion)).append("\n");
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
