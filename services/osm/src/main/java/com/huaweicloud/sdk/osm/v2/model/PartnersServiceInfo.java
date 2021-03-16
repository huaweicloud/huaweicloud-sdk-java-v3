package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PartnersServiceInfo
 */
public class PartnersServiceInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_name")
    
    private String customerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_time_zone")
    
    private String serviceTimeZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_time_day")
    
    private String serviceTimeDay;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_time_hour")
    
    private String serviceTimeHour;

    public PartnersServiceInfo withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * 客户id
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    

    public PartnersServiceInfo withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    


    /**
     * 客户名称
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    

    public PartnersServiceInfo withServiceTimeZone(String serviceTimeZone) {
        this.serviceTimeZone = serviceTimeZone;
        return this;
    }

    


    /**
     * 服务时区，GMT+08:00
     * @return serviceTimeZone
     */
    public String getServiceTimeZone() {
        return serviceTimeZone;
    }

    public void setServiceTimeZone(String serviceTimeZone) {
        this.serviceTimeZone = serviceTimeZone;
    }

    

    public PartnersServiceInfo withServiceTimeDay(String serviceTimeDay) {
        this.serviceTimeDay = serviceTimeDay;
        return this;
    }

    


    /**
     * 每周服务天数
     * @return serviceTimeDay
     */
    public String getServiceTimeDay() {
        return serviceTimeDay;
    }

    public void setServiceTimeDay(String serviceTimeDay) {
        this.serviceTimeDay = serviceTimeDay;
    }

    

    public PartnersServiceInfo withServiceTimeHour(String serviceTimeHour) {
        this.serviceTimeHour = serviceTimeHour;
        return this;
    }

    


    /**
     * 每天服务小时
     * @return serviceTimeHour
     */
    public String getServiceTimeHour() {
        return serviceTimeHour;
    }

    public void setServiceTimeHour(String serviceTimeHour) {
        this.serviceTimeHour = serviceTimeHour;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartnersServiceInfo partnersServiceInfo = (PartnersServiceInfo) o;
        return Objects.equals(this.customerId, partnersServiceInfo.customerId) &&
            Objects.equals(this.customerName, partnersServiceInfo.customerName) &&
            Objects.equals(this.serviceTimeZone, partnersServiceInfo.serviceTimeZone) &&
            Objects.equals(this.serviceTimeDay, partnersServiceInfo.serviceTimeDay) &&
            Objects.equals(this.serviceTimeHour, partnersServiceInfo.serviceTimeHour);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, serviceTimeZone, serviceTimeDay, serviceTimeHour);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartnersServiceInfo {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("    serviceTimeZone: ").append(toIndentedString(serviceTimeZone)).append("\n");
        sb.append("    serviceTimeDay: ").append(toIndentedString(serviceTimeDay)).append("\n");
        sb.append("    serviceTimeHour: ").append(toIndentedString(serviceTimeHour)).append("\n");
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

