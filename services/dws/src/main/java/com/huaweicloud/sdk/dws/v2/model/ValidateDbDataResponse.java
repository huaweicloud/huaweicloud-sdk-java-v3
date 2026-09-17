package com.huaweicloud.sdk.dws.v2.model;

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
public class ValidateDbDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    private Integer failure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<String> data = null;

    public ValidateDbDataResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 校验总结果数。 **默认取值**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ValidateDbDataResponse withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释**： 校验成功结果数。 **默认取值**： 不涉及。
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public ValidateDbDataResponse withFailure(Integer failure) {
        this.failure = failure;
        return this;
    }

    /**
     * **参数解释**： 校验失败结果数。 **默认取值**： 不涉及。
     * @return failure
     */
    public Integer getFailure() {
        return failure;
    }

    public void setFailure(Integer failure) {
        this.failure = failure;
    }

    public ValidateDbDataResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 校验数据类型。 **默认取值**： schema、table
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ValidateDbDataResponse withData(List<String> data) {
        this.data = data;
        return this;
    }

    public ValidateDbDataResponse addDataItem(String dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ValidateDbDataResponse withData(Consumer<List<String>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释**： 校验成功结果数据。 **默认取值**： 不涉及。
     * @return data
     */
    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateDbDataResponse that = (ValidateDbDataResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.success, that.success)
            && Objects.equals(this.failure, that.failure) && Objects.equals(this.type, that.type)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, success, failure, type, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateDbDataResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
