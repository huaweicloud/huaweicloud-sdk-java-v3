package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourcePackageDescription
 */
public class ResourcePackageDescription {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh_cn")

    private String zhCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_us")

    private String enUs;

    public ResourcePackageDescription withZhCn(String zhCn) {
        this.zhCn = zhCn;
        return this;
    }

    /**
     * 中文描述。
     * @return zhCn
     */
    public String getZhCn() {
        return zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public ResourcePackageDescription withEnUs(String enUs) {
        this.enUs = enUs;
        return this;
    }

    /**
     * 英文描述。
     * @return enUs
     */
    public String getEnUs() {
        return enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcePackageDescription that = (ResourcePackageDescription) obj;
        return Objects.equals(this.zhCn, that.zhCn) && Objects.equals(this.enUs, that.enUs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zhCn, enUs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcePackageDescription {\n");
        sb.append("    zhCn: ").append(toIndentedString(zhCn)).append("\n");
        sb.append("    enUs: ").append(toIndentedString(enUs)).append("\n");
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
