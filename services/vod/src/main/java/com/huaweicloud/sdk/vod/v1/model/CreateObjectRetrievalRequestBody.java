package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * obs桶取回请求消息
 */
public class CreateObjectRetrievalRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_info")

    private ObsInfo obsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days")

    private Integer days;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_context")

    private String sessionContext;

    public CreateObjectRetrievalRequestBody withObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public CreateObjectRetrievalRequestBody withObsInfo(Consumer<ObsInfo> obsInfoSetter) {
        if (this.obsInfo == null) {
            this.obsInfo = new ObsInfo();
            obsInfoSetter.accept(this.obsInfo);
        }

        return this;
    }

    /**
     * Get obsInfo
     * @return obsInfo
     */
    public ObsInfo getObsInfo() {
        return obsInfo;
    }

    public void setObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
    }

    public CreateObjectRetrievalRequestBody withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * 临时恢复时间，临时恢复会产生一个标准存储副本，副本的存在时间。单位：天，默认1天。 
     * minimum: 1
     * maximum: 30
     * @return days
     */
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public CreateObjectRetrievalRequestBody withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 回调地址，为空则不回调
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public CreateObjectRetrievalRequestBody withSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
        return this;
    }

    /**
     * 自定义上下文，回调时会回调给用户，透传信息
     * @return sessionContext
     */
    public String getSessionContext() {
        return sessionContext;
    }

    public void setSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateObjectRetrievalRequestBody that = (CreateObjectRetrievalRequestBody) obj;
        return Objects.equals(this.obsInfo, that.obsInfo) && Objects.equals(this.days, that.days)
            && Objects.equals(this.callbackUrl, that.callbackUrl)
            && Objects.equals(this.sessionContext, that.sessionContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsInfo, days, callbackUrl, sessionContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateObjectRetrievalRequestBody {\n");
        sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    sessionContext: ").append(toIndentedString(sessionContext)).append("\n");
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
