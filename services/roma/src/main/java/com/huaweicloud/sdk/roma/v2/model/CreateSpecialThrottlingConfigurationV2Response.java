package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateSpecialThrottlingConfigurationV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_limits")

    @JacksonXmlProperty(localName = "call_limits")

    private Integer callLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_time")

    @JacksonXmlProperty(localName = "apply_time")

    private OffsetDateTime applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    @JacksonXmlProperty(localName = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    @JacksonXmlProperty(localName = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    @JacksonXmlProperty(localName = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    @JacksonXmlProperty(localName = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throttle_id")

    @JacksonXmlProperty(localName = "throttle_id")

    private String throttleId;

    public CreateSpecialThrottlingConfigurationV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 特殊配置的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateSpecialThrottlingConfigurationV2Response withCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
        return this;
    }

    /**
     * 特殊对象在流控时间内能够访问API的最大次数限制
     * @return callLimits
     */
    public Integer getCallLimits() {
        return callLimits;
    }

    public void setCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
    }

    public CreateSpecialThrottlingConfigurationV2Response withApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * 设置时间
     * @return applyTime
     */
    public OffsetDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public CreateSpecialThrottlingConfigurationV2Response withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 作用的APP名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public CreateSpecialThrottlingConfigurationV2Response withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 作用的APP编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateSpecialThrottlingConfigurationV2Response withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 特殊对象的身份标识
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public CreateSpecialThrottlingConfigurationV2Response withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 特殊对象类型：APP、USER
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public CreateSpecialThrottlingConfigurationV2Response withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * [作用的APP或租户的名称](tag:hws;hws_hk;hcs;fcs;g42;)[作用的APP或租户ID](tag:Site)
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public CreateSpecialThrottlingConfigurationV2Response withThrottleId(String throttleId) {
        this.throttleId = throttleId;
        return this;
    }

    /**
     * 流控策略编号
     * @return throttleId
     */
    public String getThrottleId() {
        return throttleId;
    }

    public void setThrottleId(String throttleId) {
        this.throttleId = throttleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSpecialThrottlingConfigurationV2Response createSpecialThrottlingConfigurationV2Response =
            (CreateSpecialThrottlingConfigurationV2Response) o;
        return Objects.equals(this.id, createSpecialThrottlingConfigurationV2Response.id)
            && Objects.equals(this.callLimits, createSpecialThrottlingConfigurationV2Response.callLimits)
            && Objects.equals(this.applyTime, createSpecialThrottlingConfigurationV2Response.applyTime)
            && Objects.equals(this.appName, createSpecialThrottlingConfigurationV2Response.appName)
            && Objects.equals(this.appId, createSpecialThrottlingConfigurationV2Response.appId)
            && Objects.equals(this.objectId, createSpecialThrottlingConfigurationV2Response.objectId)
            && Objects.equals(this.objectType, createSpecialThrottlingConfigurationV2Response.objectType)
            && Objects.equals(this.objectName, createSpecialThrottlingConfigurationV2Response.objectName)
            && Objects.equals(this.throttleId, createSpecialThrottlingConfigurationV2Response.throttleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, callLimits, applyTime, appName, appId, objectId, objectType, objectName, throttleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSpecialThrottlingConfigurationV2Response {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    callLimits: ").append(toIndentedString(callLimits)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    throttleId: ").append(toIndentedString(throttleId)).append("\n");
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
