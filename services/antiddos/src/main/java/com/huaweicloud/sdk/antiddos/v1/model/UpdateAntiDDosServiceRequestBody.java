package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateAntiDDosServiceRequestBody
 */
public class UpdateAntiDDosServiceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type_id")

    private Integer appTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cleaning_access_pos_id")

    private Integer cleaningAccessPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_L7")

    private Boolean enableL7;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_request_pos_id")

    private Integer httpRequestPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_pos_id")

    private Integer trafficPosId;

    public UpdateAntiDDosServiceRequestBody withAppTypeId(Integer appTypeId) {
        this.appTypeId = appTypeId;
        return this;
    }

    /**
     * 应用类型ID，可选取值： - 0 - 1
     * @return appTypeId
     */
    public Integer getAppTypeId() {
        return appTypeId;
    }

    public void setAppTypeId(Integer appTypeId) {
        this.appTypeId = appTypeId;
    }

    public UpdateAntiDDosServiceRequestBody withCleaningAccessPosId(Integer cleaningAccessPosId) {
        this.cleaningAccessPosId = cleaningAccessPosId;
        return this;
    }

    /**
     * 清洗时访问限制分段ID，取值范围：1～8
     * @return cleaningAccessPosId
     */
    public Integer getCleaningAccessPosId() {
        return cleaningAccessPosId;
    }

    public void setCleaningAccessPosId(Integer cleaningAccessPosId) {
        this.cleaningAccessPosId = cleaningAccessPosId;
    }

    public UpdateAntiDDosServiceRequestBody withEnableL7(Boolean enableL7) {
        this.enableL7 = enableL7;
        return this;
    }

    /**
     * 是否开启L7层防护
     * @return enableL7
     */
    public Boolean getEnableL7() {
        return enableL7;
    }

    public void setEnableL7(Boolean enableL7) {
        this.enableL7 = enableL7;
    }

    public UpdateAntiDDosServiceRequestBody withHttpRequestPosId(Integer httpRequestPosId) {
        this.httpRequestPosId = httpRequestPosId;
        return this;
    }

    /**
     * HTTP请求数分段ID，取值范围：1～15
     * @return httpRequestPosId
     */
    public Integer getHttpRequestPosId() {
        return httpRequestPosId;
    }

    public void setHttpRequestPosId(Integer httpRequestPosId) {
        this.httpRequestPosId = httpRequestPosId;
    }

    public UpdateAntiDDosServiceRequestBody withTrafficPosId(Integer trafficPosId) {
        this.trafficPosId = trafficPosId;
        return this;
    }

    /**
     * 流量分段ID，取值范围：1～9
     * @return trafficPosId
     */
    public Integer getTrafficPosId() {
        return trafficPosId;
    }

    public void setTrafficPosId(Integer trafficPosId) {
        this.trafficPosId = trafficPosId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAntiDDosServiceRequestBody that = (UpdateAntiDDosServiceRequestBody) obj;
        return Objects.equals(this.appTypeId, that.appTypeId)
            && Objects.equals(this.cleaningAccessPosId, that.cleaningAccessPosId)
            && Objects.equals(this.enableL7, that.enableL7)
            && Objects.equals(this.httpRequestPosId, that.httpRequestPosId)
            && Objects.equals(this.trafficPosId, that.trafficPosId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appTypeId, cleaningAccessPosId, enableL7, httpRequestPosId, trafficPosId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAntiDDosServiceRequestBody {\n");
        sb.append("    appTypeId: ").append(toIndentedString(appTypeId)).append("\n");
        sb.append("    cleaningAccessPosId: ").append(toIndentedString(cleaningAccessPosId)).append("\n");
        sb.append("    enableL7: ").append(toIndentedString(enableL7)).append("\n");
        sb.append("    httpRequestPosId: ").append(toIndentedString(httpRequestPosId)).append("\n");
        sb.append("    trafficPosId: ").append(toIndentedString(trafficPosId)).append("\n");
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
