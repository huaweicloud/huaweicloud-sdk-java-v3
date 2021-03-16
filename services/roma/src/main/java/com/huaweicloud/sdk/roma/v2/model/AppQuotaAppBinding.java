package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 客户端应用与客户端配额绑定信息
 */
public class AppQuotaAppBinding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_quota_id")
    
    private String appQuotaId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bound_time")
    
    private OffsetDateTime boundTime;

    public AppQuotaAppBinding withAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
        return this;
    }

    


    /**
     * 客户端配额编号
     * @return appQuotaId
     */
    public String getAppQuotaId() {
        return appQuotaId;
    }

    public void setAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
    }

    

    public AppQuotaAppBinding withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 客户端应用编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public AppQuotaAppBinding withBoundTime(OffsetDateTime boundTime) {
        this.boundTime = boundTime;
        return this;
    }

    


    /**
     * 绑定时间
     * @return boundTime
     */
    public OffsetDateTime getBoundTime() {
        return boundTime;
    }

    public void setBoundTime(OffsetDateTime boundTime) {
        this.boundTime = boundTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppQuotaAppBinding appQuotaAppBinding = (AppQuotaAppBinding) o;
        return Objects.equals(this.appQuotaId, appQuotaAppBinding.appQuotaId) &&
            Objects.equals(this.appId, appQuotaAppBinding.appId) &&
            Objects.equals(this.boundTime, appQuotaAppBinding.boundTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appQuotaId, appId, boundTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppQuotaAppBinding {\n");
        sb.append("    appQuotaId: ").append(toIndentedString(appQuotaId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    boundTime: ").append(toIndentedString(boundTime)).append("\n");
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

