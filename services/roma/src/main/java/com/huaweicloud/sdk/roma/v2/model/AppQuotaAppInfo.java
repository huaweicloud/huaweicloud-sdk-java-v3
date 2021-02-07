package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppQuotaAppInfo
 */
public class AppQuotaAppInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_key")
    
    private String appKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="register_time")
    
    private OffsetDateTime registerTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private OffsetDateTime updateTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_quota_id")
    
    private String appQuotaId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_quota_name")
    
    private String appQuotaName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bound_time")
    
    private OffsetDateTime boundTime = null;

    public AppQuotaAppInfo withAppId(String appId) {
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

    public AppQuotaAppInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 客户端应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppQuotaAppInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 客户端应用状态： - 1：启用 - 2：禁用
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AppQuotaAppInfo withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    


    /**
     * 客户端应用的Key
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public AppQuotaAppInfo withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 客户端应用描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public AppQuotaAppInfo withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return registerTime
     */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public AppQuotaAppInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public AppQuotaAppInfo withAppQuotaId(String appQuotaId) {
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

    public AppQuotaAppInfo withAppQuotaName(String appQuotaName) {
        this.appQuotaName = appQuotaName;
        return this;
    }

    


    /**
     * 配额名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3-255字符
     * @return appQuotaName
     */
    public String getAppQuotaName() {
        return appQuotaName;
    }

    public void setAppQuotaName(String appQuotaName) {
        this.appQuotaName = appQuotaName;
    }

    public AppQuotaAppInfo withBoundTime(OffsetDateTime boundTime) {
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
        AppQuotaAppInfo appQuotaAppInfo = (AppQuotaAppInfo) o;
        return Objects.equals(this.appId, appQuotaAppInfo.appId) &&
            Objects.equals(this.name, appQuotaAppInfo.name) &&
            Objects.equals(this.status, appQuotaAppInfo.status) &&
            Objects.equals(this.appKey, appQuotaAppInfo.appKey) &&
            Objects.equals(this.remark, appQuotaAppInfo.remark) &&
            Objects.equals(this.registerTime, appQuotaAppInfo.registerTime) &&
            Objects.equals(this.updateTime, appQuotaAppInfo.updateTime) &&
            Objects.equals(this.appQuotaId, appQuotaAppInfo.appQuotaId) &&
            Objects.equals(this.appQuotaName, appQuotaAppInfo.appQuotaName) &&
            Objects.equals(this.boundTime, appQuotaAppInfo.boundTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, name, status, appKey, remark, registerTime, updateTime, appQuotaId, appQuotaName, boundTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppQuotaAppInfo {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    appQuotaId: ").append(toIndentedString(appQuotaId)).append("\n");
        sb.append("    appQuotaName: ").append(toIndentedString(appQuotaName)).append("\n");
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

