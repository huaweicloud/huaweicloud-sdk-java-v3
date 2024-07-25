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
public class ListBatchQueryRelatedObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<RelatedObjectViewDTO> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private List<String> errors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageInfo")

    private PageInfoViewDTO pageInfo;

    public ListBatchQueryRelatedObjectsResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释：**  请求结果。  **取值范围：**  - SUCCESS：请求成功。 - FAIL：请求失败。  **默认取值：**  不涉及。 
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ListBatchQueryRelatedObjectsResponse withData(List<RelatedObjectViewDTO> data) {
        this.data = data;
        return this;
    }

    public ListBatchQueryRelatedObjectsResponse addDataItem(RelatedObjectViewDTO dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListBatchQueryRelatedObjectsResponse withData(Consumer<List<RelatedObjectViewDTO>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释：**  请求数据。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return data
     */
    public List<RelatedObjectViewDTO> getData() {
        return data;
    }

    public void setData(List<RelatedObjectViewDTO> data) {
        this.data = data;
    }

    public ListBatchQueryRelatedObjectsResponse withErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public ListBatchQueryRelatedObjectsResponse addErrorsItem(String errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public ListBatchQueryRelatedObjectsResponse withErrors(Consumer<List<String>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * **参数解释：**  异常信息。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return errors
     */
    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public ListBatchQueryRelatedObjectsResponse withPageInfo(PageInfoViewDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListBatchQueryRelatedObjectsResponse withPageInfo(Consumer<PageInfoViewDTO> pageInfoSetter) {
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
        ListBatchQueryRelatedObjectsResponse that = (ListBatchQueryRelatedObjectsResponse) obj;
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
        sb.append("class ListBatchQueryRelatedObjectsResponse {\n");
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
