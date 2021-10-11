package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class CreateAppCodeAutoV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_code")

    private String appCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public CreateAppCodeAutoV2Response withAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /** App Code值 支持英文，+_!@#$%+/=，且只能以英文和+、/开头，64-180个字符。
     * 
     * @return appCode */
    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public CreateAppCodeAutoV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /** 编号
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAppCodeAutoV2Response withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用编号
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateAppCodeAutoV2Response withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAppCodeAutoV2Response createAppCodeAutoV2Response = (CreateAppCodeAutoV2Response) o;
        return Objects.equals(this.appCode, createAppCodeAutoV2Response.appCode)
            && Objects.equals(this.id, createAppCodeAutoV2Response.id)
            && Objects.equals(this.appId, createAppCodeAutoV2Response.appId)
            && Objects.equals(this.createTime, createAppCodeAutoV2Response.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appCode, id, appId, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppCodeAutoV2Response {\n");
        sb.append("    appCode: ").append(toIndentedString(appCode)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
