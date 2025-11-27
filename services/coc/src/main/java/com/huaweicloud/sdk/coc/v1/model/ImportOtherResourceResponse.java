package com.huaweicloud.sdk.coc.v1.model;

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
public class ImportOtherResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_list")

    private List<String> errorList = null;

    public ImportOtherResourceResponse withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释：** 成功数即excel表中数据通过校验成功的数据条数。 **取值范围：** 不涉及。
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public ImportOtherResourceResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 总条数即excel表中数据的总数据条数。 **取值范围：** 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ImportOtherResourceResponse withErrorList(List<String> errorList) {
        this.errorList = errorList;
        return this;
    }

    public ImportOtherResourceResponse addErrorListItem(String errorListItem) {
        if (this.errorList == null) {
            this.errorList = new ArrayList<>();
        }
        this.errorList.add(errorListItem);
        return this;
    }

    public ImportOtherResourceResponse withErrorList(Consumer<List<String>> errorListSetter) {
        if (this.errorList == null) {
            this.errorList = new ArrayList<>();
        }
        errorListSetter.accept(this.errorList);
        return this;
    }

    /**
     * **参数解释：** 失败信息集合即excel表格中校验失败报错信息组合。 **取值范围：** 不涉及。
     * @return errorList
     */
    public List<String> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportOtherResourceResponse that = (ImportOtherResourceResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.total, that.total)
            && Objects.equals(this.errorList, that.errorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, total, errorList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportOtherResourceResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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
