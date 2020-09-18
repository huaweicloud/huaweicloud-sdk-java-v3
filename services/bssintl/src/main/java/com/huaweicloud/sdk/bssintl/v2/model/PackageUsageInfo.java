package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PackageUsageInfo
 */
public class PackageUsageInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_instance_id")
    
    private String orderInstanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_name")
    
    private String resourceTypeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_reuse_mode")
    
    private Integer quotaReuseMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_reuse_cycle")
    
    private Integer quotaReuseCycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_reuse_cycle_type")
    
    private Integer quotaReuseCycleType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="balance")
    
    private BigDecimal balance = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private BigDecimal total = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measurement_name")
    
    private String measurementName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_code")
    
    private String regionCode;

    public PackageUsageInfo withOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
        return this;
    }

    


    /**
     * |参数名称：订购实例ID| |参数的约束及描述：订购实例ID|
     * @return orderInstanceId
     */
    public String getOrderInstanceId() {
        return orderInstanceId;
    }

    public void setOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
    }

    public PackageUsageInfo withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    


    /**
     * |参数名称：资源类型名称| |参数的约束及描述：资源类型名称|
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public PackageUsageInfo withQuotaReuseMode(Integer quotaReuseMode) {
        this.quotaReuseMode = quotaReuseMode;
        return this;
    }

    


    /**
     * |参数名称：重用模式| |参数的约束及描述：重用模式: 1：可重用2：不可重用|
     * @return quotaReuseMode
     */
    public Integer getQuotaReuseMode() {
        return quotaReuseMode;
    }

    public void setQuotaReuseMode(Integer quotaReuseMode) {
        this.quotaReuseMode = quotaReuseMode;
    }

    public PackageUsageInfo withQuotaReuseCycle(Integer quotaReuseCycle) {
        this.quotaReuseCycle = quotaReuseCycle;
        return this;
    }

    


    /**
     * |参数名称：重用周期| |参数的约束及描述：重用周期，只有quotaReuseMode为可重用，该字段才有意义.1：小时2：天3：周4：月5：年|
     * @return quotaReuseCycle
     */
    public Integer getQuotaReuseCycle() {
        return quotaReuseCycle;
    }

    public void setQuotaReuseCycle(Integer quotaReuseCycle) {
        this.quotaReuseCycle = quotaReuseCycle;
    }

    public PackageUsageInfo withQuotaReuseCycleType(Integer quotaReuseCycleType) {
        this.quotaReuseCycleType = quotaReuseCycleType;
        return this;
    }

    


    /**
     * |参数名称：重用周期类别| |参数的约束及描述：重置周期类别，只有quotaReuseMode为可重用，该字段才有意义1：按自然周期重置2：按订购周期重置|
     * @return quotaReuseCycleType
     */
    public Integer getQuotaReuseCycleType() {
        return quotaReuseCycleType;
    }

    public void setQuotaReuseCycleType(Integer quotaReuseCycleType) {
        this.quotaReuseCycleType = quotaReuseCycleType;
    }

    public PackageUsageInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * |参数名称：开始时间，格式UTC| |参数的约束及描述：1）如果quotaReuseMode为可重用，则此时间为当前时间所在的重用周期的开始时间2）如果quotaReuseMode为不可重用，则此时间为订购实例的生效时间，|
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public PackageUsageInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * |参数名称：结束时间，格式UTC| |参数的约束及描述：1）如果quotaReuseMode为可重用，则此时间为当前时间所在的重用周期的结束时间2）如果quotaReuseMode为不可重用，则此时间为订购实例的失效时间|
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public PackageUsageInfo withBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    


    /**
     * |参数名称：套餐包内资源剩余量| |参数的约束及描述：套餐包内资源剩余量|
     * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public PackageUsageInfo withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    


    /**
     * |参数名称：套餐包的资源总量| |参数的约束及描述：套餐包的资源总量|
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public PackageUsageInfo withMeasurementName(String measurementName) {
        this.measurementName = measurementName;
        return this;
    }

    


    /**
     * |参数名称：套餐包资源的度量单位名称| |参数的约束及描述：套餐包资源的度量单位名称|
     * @return measurementName
     */
    public String getMeasurementName() {
        return measurementName;
    }

    public void setMeasurementName(String measurementName) {
        this.measurementName = measurementName;
    }

    public PackageUsageInfo withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    


    /**
     * |参数名称：区域编码| |参数的约束及描述：区域编码|
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageUsageInfo packageUsageInfo = (PackageUsageInfo) o;
        return Objects.equals(this.orderInstanceId, packageUsageInfo.orderInstanceId) &&
            Objects.equals(this.resourceTypeName, packageUsageInfo.resourceTypeName) &&
            Objects.equals(this.quotaReuseMode, packageUsageInfo.quotaReuseMode) &&
            Objects.equals(this.quotaReuseCycle, packageUsageInfo.quotaReuseCycle) &&
            Objects.equals(this.quotaReuseCycleType, packageUsageInfo.quotaReuseCycleType) &&
            Objects.equals(this.startTime, packageUsageInfo.startTime) &&
            Objects.equals(this.endTime, packageUsageInfo.endTime) &&
            Objects.equals(this.balance, packageUsageInfo.balance) &&
            Objects.equals(this.total, packageUsageInfo.total) &&
            Objects.equals(this.measurementName, packageUsageInfo.measurementName) &&
            Objects.equals(this.regionCode, packageUsageInfo.regionCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderInstanceId, resourceTypeName, quotaReuseMode, quotaReuseCycle, quotaReuseCycleType, startTime, endTime, balance, total, measurementName, regionCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageUsageInfo {\n");
        sb.append("    orderInstanceId: ").append(toIndentedString(orderInstanceId)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    quotaReuseMode: ").append(toIndentedString(quotaReuseMode)).append("\n");
        sb.append("    quotaReuseCycle: ").append(toIndentedString(quotaReuseCycle)).append("\n");
        sb.append("    quotaReuseCycleType: ").append(toIndentedString(quotaReuseCycleType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    measurementName: ").append(toIndentedString(measurementName)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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

