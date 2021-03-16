package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApplicationItem
 */
public class ApplicationItem  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform")
    
    private String platform;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_urn")
    
    private String applicationUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_id")
    
    private String applicationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private String enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apple_certificate_expiration_date")
    
    private String appleCertificateExpirationDate;

    public ApplicationItem withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 创建application的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ApplicationItem withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * 应用平台。
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    

    public ApplicationItem withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建application的时间时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public ApplicationItem withApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
        return this;
    }

    


    /**
     * Application的唯一资源标识。
     * @return applicationUrn
     */
    public String getApplicationUrn() {
        return applicationUrn;
    }

    public void setApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
    }

    

    public ApplicationItem withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    


    /**
     * Application的唯一标识ID。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    

    public ApplicationItem withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * 应用平台是否启用。
     * @return enabled
     */
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    

    public ApplicationItem withAppleCertificateExpirationDate(String appleCertificateExpirationDate) {
        this.appleCertificateExpirationDate = appleCertificateExpirationDate;
        return this;
    }

    


    /**
     * 苹果证书过期时间APNS、APNS_SANDBOX平台特有属性时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return appleCertificateExpirationDate
     */
    public String getAppleCertificateExpirationDate() {
        return appleCertificateExpirationDate;
    }

    public void setAppleCertificateExpirationDate(String appleCertificateExpirationDate) {
        this.appleCertificateExpirationDate = appleCertificateExpirationDate;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationItem applicationItem = (ApplicationItem) o;
        return Objects.equals(this.name, applicationItem.name) &&
            Objects.equals(this.platform, applicationItem.platform) &&
            Objects.equals(this.createTime, applicationItem.createTime) &&
            Objects.equals(this.applicationUrn, applicationItem.applicationUrn) &&
            Objects.equals(this.applicationId, applicationItem.applicationId) &&
            Objects.equals(this.enabled, applicationItem.enabled) &&
            Objects.equals(this.appleCertificateExpirationDate, applicationItem.appleCertificateExpirationDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, platform, createTime, applicationUrn, applicationId, enabled, appleCertificateExpirationDate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    applicationUrn: ").append(toIndentedString(applicationUrn)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    appleCertificateExpirationDate: ").append(toIndentedString(appleCertificateExpirationDate)).append("\n");
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

