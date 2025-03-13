package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 公网访问诊断结果
 */
public class PublicNetworkAccess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private DiagnoseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_network_info")

    private List<PublicNetworkStatus> publicNetworkInfo = null;

    public PublicNetworkAccess withResult(DiagnoseResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     * @return result
     */
    public DiagnoseResult getResult() {
        return result;
    }

    public void setResult(DiagnoseResult result) {
        this.result = result;
    }

    public PublicNetworkAccess withPublicNetworkInfo(List<PublicNetworkStatus> publicNetworkInfo) {
        this.publicNetworkInfo = publicNetworkInfo;
        return this;
    }

    public PublicNetworkAccess addPublicNetworkInfoItem(PublicNetworkStatus publicNetworkInfoItem) {
        if (this.publicNetworkInfo == null) {
            this.publicNetworkInfo = new ArrayList<>();
        }
        this.publicNetworkInfo.add(publicNetworkInfoItem);
        return this;
    }

    public PublicNetworkAccess withPublicNetworkInfo(Consumer<List<PublicNetworkStatus>> publicNetworkInfoSetter) {
        if (this.publicNetworkInfo == null) {
            this.publicNetworkInfo = new ArrayList<>();
        }
        publicNetworkInfoSetter.accept(this.publicNetworkInfo);
        return this;
    }

    /**
     * kerberos信息
     * @return publicNetworkInfo
     */
    public List<PublicNetworkStatus> getPublicNetworkInfo() {
        return publicNetworkInfo;
    }

    public void setPublicNetworkInfo(List<PublicNetworkStatus> publicNetworkInfo) {
        this.publicNetworkInfo = publicNetworkInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicNetworkAccess that = (PublicNetworkAccess) obj;
        return Objects.equals(this.result, that.result)
            && Objects.equals(this.publicNetworkInfo, that.publicNetworkInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, publicNetworkInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicNetworkAccess {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    publicNetworkInfo: ").append(toIndentedString(publicNetworkInfo)).append("\n");
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
