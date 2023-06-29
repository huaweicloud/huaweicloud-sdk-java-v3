package com.huaweicloud.sdk.koomessage.v1.model;

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
public class CheckMobileCapabilityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_mobiles")

    private List<String> supportedMobiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsupported_mobiles")

    private List<String> unsupportedMobiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    public CheckMobileCapabilityResponse withSupportedMobiles(List<String> supportedMobiles) {
        this.supportedMobiles = supportedMobiles;
        return this;
    }

    public CheckMobileCapabilityResponse addSupportedMobilesItem(String supportedMobilesItem) {
        if (this.supportedMobiles == null) {
            this.supportedMobiles = new ArrayList<>();
        }
        this.supportedMobiles.add(supportedMobilesItem);
        return this;
    }

    public CheckMobileCapabilityResponse withSupportedMobiles(Consumer<List<String>> supportedMobilesSetter) {
        if (this.supportedMobiles == null) {
            this.supportedMobiles = new ArrayList<>();
        }
        supportedMobilesSetter.accept(this.supportedMobiles);
        return this;
    }

    /**
     * 支持智能信息手机号码列表。
     * @return supportedMobiles
     */
    public List<String> getSupportedMobiles() {
        return supportedMobiles;
    }

    public void setSupportedMobiles(List<String> supportedMobiles) {
        this.supportedMobiles = supportedMobiles;
    }

    public CheckMobileCapabilityResponse withUnsupportedMobiles(List<String> unsupportedMobiles) {
        this.unsupportedMobiles = unsupportedMobiles;
        return this;
    }

    public CheckMobileCapabilityResponse addUnsupportedMobilesItem(String unsupportedMobilesItem) {
        if (this.unsupportedMobiles == null) {
            this.unsupportedMobiles = new ArrayList<>();
        }
        this.unsupportedMobiles.add(unsupportedMobilesItem);
        return this;
    }

    public CheckMobileCapabilityResponse withUnsupportedMobiles(Consumer<List<String>> unsupportedMobilesSetter) {
        if (this.unsupportedMobiles == null) {
            this.unsupportedMobiles = new ArrayList<>();
        }
        unsupportedMobilesSetter.accept(this.unsupportedMobiles);
        return this;
    }

    /**
     * 不支持智能信息手机号码列表。
     * @return unsupportedMobiles
     */
    public List<String> getUnsupportedMobiles() {
        return unsupportedMobiles;
    }

    public void setUnsupportedMobiles(List<String> unsupportedMobiles) {
        this.unsupportedMobiles = unsupportedMobiles;
    }

    public CheckMobileCapabilityResponse withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息模板ID，由9位数字组成。 
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckMobileCapabilityResponse that = (CheckMobileCapabilityResponse) obj;
        return Objects.equals(this.supportedMobiles, that.supportedMobiles)
            && Objects.equals(this.unsupportedMobiles, that.unsupportedMobiles)
            && Objects.equals(this.tplId, that.tplId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportedMobiles, unsupportedMobiles, tplId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckMobileCapabilityResponse {\n");
        sb.append("    supportedMobiles: ").append(toIndentedString(supportedMobiles)).append("\n");
        sb.append("    unsupportedMobiles: ").append(toIndentedString(unsupportedMobiles)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
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
