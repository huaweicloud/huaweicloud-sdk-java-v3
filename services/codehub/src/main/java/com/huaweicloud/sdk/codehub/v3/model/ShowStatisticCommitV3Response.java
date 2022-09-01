package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowStatisticCommitV3Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    @JacksonXmlProperty(localName = "error")

    private Error error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private List<CommitStatistic> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    public ShowStatisticCommitV3Response withError(Error error) {
        this.error = error;
        return this;
    }

    public ShowStatisticCommitV3Response withError(Consumer<Error> errorSetter) {
        if (this.error == null) {
            this.error = new Error();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public ShowStatisticCommitV3Response withResult(List<CommitStatistic> result) {
        this.result = result;
        return this;
    }

    public ShowStatisticCommitV3Response addResultItem(CommitStatistic resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ShowStatisticCommitV3Response withResult(Consumer<List<CommitStatistic>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 代码增加和删除的行数
     * @return result
     */
    public List<CommitStatistic> getResult() {
        return result;
    }

    public void setResult(List<CommitStatistic> result) {
        this.result = result;
    }

    public ShowStatisticCommitV3Response withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 响应状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStatisticCommitV3Response showStatisticCommitV3Response = (ShowStatisticCommitV3Response) o;
        return Objects.equals(this.error, showStatisticCommitV3Response.error)
            && Objects.equals(this.result, showStatisticCommitV3Response.result)
            && Objects.equals(this.status, showStatisticCommitV3Response.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, result, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticCommitV3Response {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
