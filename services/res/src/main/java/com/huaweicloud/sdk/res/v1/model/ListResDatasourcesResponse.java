package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListResDatasourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasources")

    private List<Datasources> datasources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public ListResDatasourcesResponse withDatasources(List<Datasources> datasources) {
        this.datasources = datasources;
        return this;
    }

    public ListResDatasourcesResponse addDatasourcesItem(Datasources datasourcesItem) {
        if (this.datasources == null) {
            this.datasources = new ArrayList<>();
        }
        this.datasources.add(datasourcesItem);
        return this;
    }

    public ListResDatasourcesResponse withDatasources(Consumer<List<Datasources>> datasourcesSetter) {
        if (this.datasources == null) {
            this.datasources = new ArrayList<>();
        }
        datasourcesSetter.accept(this.datasources);
        return this;
    }

    /**
     * 数据源详情列表。
     * @return datasources
     */
    public List<Datasources> getDatasources() {
        return datasources;
    }

    public void setDatasources(List<Datasources> datasources) {
        this.datasources = datasources;
    }

    public ListResDatasourcesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListResDatasourcesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 返回消息（请求成功时，不返回此字段）。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListResDatasourcesResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码（请求成功时，不返回此字段）。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResDatasourcesResponse listResDatasourcesResponse = (ListResDatasourcesResponse) o;
        return Objects.equals(this.datasources, listResDatasourcesResponse.datasources)
            && Objects.equals(this.isSuccess, listResDatasourcesResponse.isSuccess)
            && Objects.equals(this.message, listResDatasourcesResponse.message)
            && Objects.equals(this.errorCode, listResDatasourcesResponse.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasources, isSuccess, message, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResDatasourcesResponse {\n");
        sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
