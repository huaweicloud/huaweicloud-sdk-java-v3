package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面小时包详情。
 */
public class HourPackageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_order_id")

    private String rootOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_resource_id")

    private String packageResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_instance_id")

    private String packageInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_spec_code")

    private String packageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combined_product_type_code")

    private String combinedProductTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_up_policy")

    private String useUpPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_duration")

    private Integer packageDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_duration")

    private Integer useDuration;

    public HourPackageInfo withRootOrderId(String rootOrderId) {
        this.rootOrderId = rootOrderId;
        return this;
    }

    /**
     * 小时包根订单ID。
     * @return rootOrderId
     */
    public String getRootOrderId() {
        return rootOrderId;
    }

    public void setRootOrderId(String rootOrderId) {
        this.rootOrderId = rootOrderId;
    }

    public HourPackageInfo withPackageResourceId(String packageResourceId) {
        this.packageResourceId = packageResourceId;
        return this;
    }

    /**
     * 小时包资源ID。
     * @return packageResourceId
     */
    public String getPackageResourceId() {
        return packageResourceId;
    }

    public void setPackageResourceId(String packageResourceId) {
        this.packageResourceId = packageResourceId;
    }

    public HourPackageInfo withPackageInstanceId(String packageInstanceId) {
        this.packageInstanceId = packageInstanceId;
        return this;
    }

    /**
     * 小时包实例ID。
     * @return packageInstanceId
     */
    public String getPackageInstanceId() {
        return packageInstanceId;
    }

    public void setPackageInstanceId(String packageInstanceId) {
        this.packageInstanceId = packageInstanceId;
    }

    public HourPackageInfo withPackageSpecCode(String packageSpecCode) {
        this.packageSpecCode = packageSpecCode;
        return this;
    }

    /**
     * 小时包specCode。
     * @return packageSpecCode
     */
    public String getPackageSpecCode() {
        return packageSpecCode;
    }

    public void setPackageSpecCode(String packageSpecCode) {
        this.packageSpecCode = packageSpecCode;
    }

    public HourPackageInfo withCombinedProductTypeCode(String combinedProductTypeCode) {
        this.combinedProductTypeCode = combinedProductTypeCode;
        return this;
    }

    /**
     * 组合商品resourceTypeCode。
     * @return combinedProductTypeCode
     */
    public String getCombinedProductTypeCode() {
        return combinedProductTypeCode;
    }

    public void setCombinedProductTypeCode(String combinedProductTypeCode) {
        this.combinedProductTypeCode = combinedProductTypeCode;
    }

    public HourPackageInfo withUseUpPolicy(String useUpPolicy) {
        this.useUpPolicy = useUpPolicy;
        return this;
    }

    /**
     * 小时包用完策略：SHUTDOWN_OR_HIBERNATE：自动关机/休眠；PAY_PER_USE：自动按需计费。
     * @return useUpPolicy
     */
    public String getUseUpPolicy() {
        return useUpPolicy;
    }

    public void setUseUpPolicy(String useUpPolicy) {
        this.useUpPolicy = useUpPolicy;
    }

    public HourPackageInfo withPackageDuration(Integer packageDuration) {
        this.packageDuration = packageDuration;
        return this;
    }

    /**
     * 小时包总时长。
     * @return packageDuration
     */
    public Integer getPackageDuration() {
        return packageDuration;
    }

    public void setPackageDuration(Integer packageDuration) {
        this.packageDuration = packageDuration;
    }

    public HourPackageInfo withUseDuration(Integer useDuration) {
        this.useDuration = useDuration;
        return this;
    }

    /**
     * 小时包已用用时长。
     * @return useDuration
     */
    public Integer getUseDuration() {
        return useDuration;
    }

    public void setUseDuration(Integer useDuration) {
        this.useDuration = useDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HourPackageInfo that = (HourPackageInfo) obj;
        return Objects.equals(this.rootOrderId, that.rootOrderId)
            && Objects.equals(this.packageResourceId, that.packageResourceId)
            && Objects.equals(this.packageInstanceId, that.packageInstanceId)
            && Objects.equals(this.packageSpecCode, that.packageSpecCode)
            && Objects.equals(this.combinedProductTypeCode, that.combinedProductTypeCode)
            && Objects.equals(this.useUpPolicy, that.useUpPolicy)
            && Objects.equals(this.packageDuration, that.packageDuration)
            && Objects.equals(this.useDuration, that.useDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rootOrderId,
            packageResourceId,
            packageInstanceId,
            packageSpecCode,
            combinedProductTypeCode,
            useUpPolicy,
            packageDuration,
            useDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HourPackageInfo {\n");
        sb.append("    rootOrderId: ").append(toIndentedString(rootOrderId)).append("\n");
        sb.append("    packageResourceId: ").append(toIndentedString(packageResourceId)).append("\n");
        sb.append("    packageInstanceId: ").append(toIndentedString(packageInstanceId)).append("\n");
        sb.append("    packageSpecCode: ").append(toIndentedString(packageSpecCode)).append("\n");
        sb.append("    combinedProductTypeCode: ").append(toIndentedString(combinedProductTypeCode)).append("\n");
        sb.append("    useUpPolicy: ").append(toIndentedString(useUpPolicy)).append("\n");
        sb.append("    packageDuration: ").append(toIndentedString(packageDuration)).append("\n");
        sb.append("    useDuration: ").append(toIndentedString(useDuration)).append("\n");
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
