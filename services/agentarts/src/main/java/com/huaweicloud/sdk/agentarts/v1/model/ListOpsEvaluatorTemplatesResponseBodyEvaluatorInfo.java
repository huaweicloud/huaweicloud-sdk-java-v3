package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 评估器的元数据信息，如供应商和手册链接。 **取值范围：** 不涉及。 
 */
public class ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "benchmark")

    private String benchmark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_manual_url")

    private String userManualUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_url")

    private String vendorUrl;

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo withBenchmark(String benchmark) {
        this.benchmark = benchmark;
        return this;
    }

    /**
     * **参数解释：** 评估器的基准测试标准或参考系。 **取值范围：** 不涉及。 
     * @return benchmark
     */
    public String getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(String benchmark) {
        this.benchmark = benchmark;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo withUserManualUrl(String userManualUrl) {
        this.userManualUrl = userManualUrl;
        return this;
    }

    /**
     * **参数解释：** 用户手册网址。 **取值范围：** 不涉及。 
     * @return userManualUrl
     */
    public String getUserManualUrl() {
        return userManualUrl;
    }

    public void setUserManualUrl(String userManualUrl) {
        this.userManualUrl = userManualUrl;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * **参数解释：** 评估器的提供方或开发机构。 **取值范围：** 供应商名称。 
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo withVendorUrl(String vendorUrl) {
        this.vendorUrl = vendorUrl;
        return this;
    }

    /**
     * **参数解释：** 供应商官方资源链接。 **取值范围：** 不涉及。 
     * @return vendorUrl
     */
    public String getVendorUrl() {
        return vendorUrl;
    }

    public void setVendorUrl(String vendorUrl) {
        this.vendorUrl = vendorUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo that =
            (ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo) obj;
        return Objects.equals(this.benchmark, that.benchmark) && Objects.equals(this.userManualUrl, that.userManualUrl)
            && Objects.equals(this.vendor, that.vendor) && Objects.equals(this.vendorUrl, that.vendorUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(benchmark, userManualUrl, vendor, vendorUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo {\n");
        sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
        sb.append("    userManualUrl: ").append(toIndentedString(userManualUrl)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    vendorUrl: ").append(toIndentedString(vendorUrl)).append("\n");
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
