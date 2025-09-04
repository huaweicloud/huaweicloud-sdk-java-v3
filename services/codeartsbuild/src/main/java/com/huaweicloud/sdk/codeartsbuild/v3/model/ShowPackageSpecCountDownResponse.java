package com.huaweicloud.sdk.codeartsbuild.v3.model;

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
public class ShowPackageSpecCountDownResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private Object error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<CountdownList> result = null;

    public ShowPackageSpecCountDownResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 接口响应状态。 **取值范围**： ● success：表示接口调用成功。 ● fail：表示接口调用失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowPackageSpecCountDownResponse withError(Object error) {
        this.error = error;
        return this;
    }

    /**
     * 错误
     * @return error
     */
    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public ShowPackageSpecCountDownResponse withResult(List<CountdownList> result) {
        this.result = result;
        return this;
    }

    public ShowPackageSpecCountDownResponse addResultItem(CountdownList resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ShowPackageSpecCountDownResponse withResult(Consumer<List<CountdownList>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 单元测试报告列表
     * @return result
     */
    public List<CountdownList> getResult() {
        return result;
    }

    public void setResult(List<CountdownList> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPackageSpecCountDownResponse that = (ShowPackageSpecCountDownResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.error, that.error)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, error, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPackageSpecCountDownResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
