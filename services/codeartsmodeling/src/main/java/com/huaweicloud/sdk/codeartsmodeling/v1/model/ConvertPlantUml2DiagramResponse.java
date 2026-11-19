package com.huaweicloud.sdk.codeartsmodeling.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ConvertPlantUml2DiagramResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totals")

    private Long totals;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private Object content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exceptionData")

    private String exceptionData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorCode")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exceptionSystem")

    private String exceptionSystem;

    public ConvertPlantUml2DiagramResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 接口返回的状态信息
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConvertPlantUml2DiagramResponse withTotals(Long totals) {
        this.totals = totals;
        return this;
    }

    /**
     * 对象的总条数
     * @return totals
     */
    public Long getTotals() {
        return totals;
    }

    public void setTotals(Long totals) {
        this.totals = totals;
    }

    public ConvertPlantUml2DiagramResponse withContent(Object content) {
        this.content = content;
        return this;
    }

    /**
     * 返回的数据
     * @return content
     */
    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public ConvertPlantUml2DiagramResponse withExceptionData(String exceptionData) {
        this.exceptionData = exceptionData;
        return this;
    }

    /**
     * 异常信息
     * @return exceptionData
     */
    public String getExceptionData() {
        return exceptionData;
    }

    public void setExceptionData(String exceptionData) {
        this.exceptionData = exceptionData;
    }

    public ConvertPlantUml2DiagramResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 区分对象类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConvertPlantUml2DiagramResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ConvertPlantUml2DiagramResponse withExceptionSystem(String exceptionSystem) {
        this.exceptionSystem = exceptionSystem;
        return this;
    }

    /**
     * 系统运行异常信息
     * @return exceptionSystem
     */
    public String getExceptionSystem() {
        return exceptionSystem;
    }

    public void setExceptionSystem(String exceptionSystem) {
        this.exceptionSystem = exceptionSystem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConvertPlantUml2DiagramResponse that = (ConvertPlantUml2DiagramResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.totals, that.totals)
            && Objects.equals(this.content, that.content) && Objects.equals(this.exceptionData, that.exceptionData)
            && Objects.equals(this.type, that.type) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.exceptionSystem, that.exceptionSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, totals, content, exceptionData, type, errorCode, exceptionSystem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertPlantUml2DiagramResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    exceptionData: ").append(toIndentedString(exceptionData)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    exceptionSystem: ").append(toIndentedString(exceptionSystem)).append("\n");
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
