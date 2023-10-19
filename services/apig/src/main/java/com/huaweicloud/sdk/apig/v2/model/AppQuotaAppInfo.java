package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * AppQuotaAppInfo
 */
public class AppQuotaAppInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_time")

    private OffsetDateTime registerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_quota_id")

    private String appQuotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_quota_name")

    private String appQuotaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bound_time")

    private OffsetDateTime boundTime;

    public AppQuotaAppInfo withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 凭据编号
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
     * 凭据名称
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
     * 凭据状态： - 1：启用 - 2：禁用
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
     * 凭据的Key
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
     * 凭据描述
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
     * 凭据配额编号
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppQuotaAppInfo that = (AppQuotaAppInfo) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.appKey, that.appKey)
            && Objects.equals(this.remark, that.remark) && Objects.equals(this.registerTime, that.registerTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.appQuotaId, that.appQuotaId)
            && Objects.equals(this.appQuotaName, that.appQuotaName) && Objects.equals(this.boundTime, that.boundTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(appId, name, status, appKey, remark, registerTime, updateTime, appQuotaId, appQuotaName, boundTime);
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
