package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListHtapFlavorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_mode")

    private String availabilityZoneMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    public ListHtapFlavorRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * HTAP引擎名。 取值范围： - star-rocks - click-house
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ListHtapFlavorRequest withAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
        return this;
    }

    /**
     * 可用区模式，当前仅支持single。
     * @return availabilityZoneMode
     */
    public String getAvailabilityZoneMode() {
        return availabilityZoneMode;
    }

    public void setAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
    }

    public ListHtapFlavorRequest withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格码，提供后仅查询指定规格码规格信息。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ListHtapFlavorRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型。默认en-us。 取值范围： - en-us - zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListHtapFlavorRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 数据库版本号，不填默认3.1.6.0。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHtapFlavorRequest that = (ListHtapFlavorRequest) obj;
        return Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.availabilityZoneMode, that.availabilityZoneMode)
            && Objects.equals(this.specCode, that.specCode) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.versionName, that.versionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineName, availabilityZoneMode, specCode, xLanguage, versionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHtapFlavorRequest {\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    availabilityZoneMode: ").append(toIndentedString(availabilityZoneMode)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
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
