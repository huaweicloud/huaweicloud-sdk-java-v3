package com.huaweicloud.sdk.idmeclassicapi.v1.model;

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
public class ListHistoryDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<HistoryDataModelHistoryViewDTO> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private List<String> errors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageInfo")

    private PageInfoViewDTO pageInfo;

    public ListHistoryDataResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 请求结果。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ListHistoryDataResponse withData(List<HistoryDataModelHistoryViewDTO> data) {
        this.data = data;
        return this;
    }

    public ListHistoryDataResponse addDataItem(HistoryDataModelHistoryViewDTO dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListHistoryDataResponse withData(Consumer<List<HistoryDataModelHistoryViewDTO>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 请求数据。
     * @return data
     */
    public List<HistoryDataModelHistoryViewDTO> getData() {
        return data;
    }

    public void setData(List<HistoryDataModelHistoryViewDTO> data) {
        this.data = data;
    }

    public ListHistoryDataResponse withErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public ListHistoryDataResponse addErrorsItem(String errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public ListHistoryDataResponse withErrors(Consumer<List<String>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 异常信息。
     * @return errors
     */
    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public ListHistoryDataResponse withPageInfo(PageInfoViewDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListHistoryDataResponse withPageInfo(Consumer<PageInfoViewDTO> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoViewDTO();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoViewDTO getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoViewDTO pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHistoryDataResponse that = (ListHistoryDataResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.data, that.data)
            && Objects.equals(this.errors, that.errors) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, data, errors, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryDataResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
