package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RespcodeBrokens
 */
public class RespcodeBrokens {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkPointFailed")

    private List<Double> checkPointFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private List<Double> error = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "othersFailed")

    private List<Double> othersFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parsedFailed")

    private List<Double> parsedFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refusedFailed")

    private List<Double> refusedFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<Double> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private List<Double> timeout = null;

    public RespcodeBrokens withCheckPointFailed(List<Double> checkPointFailed) {
        this.checkPointFailed = checkPointFailed;
        return this;
    }

    public RespcodeBrokens addCheckPointFailedItem(Double checkPointFailedItem) {
        if (this.checkPointFailed == null) {
            this.checkPointFailed = new ArrayList<>();
        }
        this.checkPointFailed.add(checkPointFailedItem);
        return this;
    }

    public RespcodeBrokens withCheckPointFailed(Consumer<List<Double>> checkPointFailedSetter) {
        if (this.checkPointFailed == null) {
            this.checkPointFailed = new ArrayList<>();
        }
        checkPointFailedSetter.accept(this.checkPointFailed);
        return this;
    }

    /**
     * 校验失败
     * @return checkPointFailed
     */
    public List<Double> getCheckPointFailed() {
        return checkPointFailed;
    }

    public void setCheckPointFailed(List<Double> checkPointFailed) {
        this.checkPointFailed = checkPointFailed;
    }

    public RespcodeBrokens withError(List<Double> error) {
        this.error = error;
        return this;
    }

    public RespcodeBrokens addErrorItem(Double errorItem) {
        if (this.error == null) {
            this.error = new ArrayList<>();
        }
        this.error.add(errorItem);
        return this;
    }

    public RespcodeBrokens withError(Consumer<List<Double>> errorSetter) {
        if (this.error == null) {
            this.error = new ArrayList<>();
        }
        errorSetter.accept(this.error);
        return this;
    }

    /**
     * 异常请求
     * @return error
     */
    public List<Double> getError() {
        return error;
    }

    public void setError(List<Double> error) {
        this.error = error;
    }

    public RespcodeBrokens withOthersFailed(List<Double> othersFailed) {
        this.othersFailed = othersFailed;
        return this;
    }

    public RespcodeBrokens addOthersFailedItem(Double othersFailedItem) {
        if (this.othersFailed == null) {
            this.othersFailed = new ArrayList<>();
        }
        this.othersFailed.add(othersFailedItem);
        return this;
    }

    public RespcodeBrokens withOthersFailed(Consumer<List<Double>> othersFailedSetter) {
        if (this.othersFailed == null) {
            this.othersFailed = new ArrayList<>();
        }
        othersFailedSetter.accept(this.othersFailed);
        return this;
    }

    /**
     * 其他失败
     * @return othersFailed
     */
    public List<Double> getOthersFailed() {
        return othersFailed;
    }

    public void setOthersFailed(List<Double> othersFailed) {
        this.othersFailed = othersFailed;
    }

    public RespcodeBrokens withParsedFailed(List<Double> parsedFailed) {
        this.parsedFailed = parsedFailed;
        return this;
    }

    public RespcodeBrokens addParsedFailedItem(Double parsedFailedItem) {
        if (this.parsedFailed == null) {
            this.parsedFailed = new ArrayList<>();
        }
        this.parsedFailed.add(parsedFailedItem);
        return this;
    }

    public RespcodeBrokens withParsedFailed(Consumer<List<Double>> parsedFailedSetter) {
        if (this.parsedFailed == null) {
            this.parsedFailed = new ArrayList<>();
        }
        parsedFailedSetter.accept(this.parsedFailed);
        return this;
    }

    /**
     * 解析失败
     * @return parsedFailed
     */
    public List<Double> getParsedFailed() {
        return parsedFailed;
    }

    public void setParsedFailed(List<Double> parsedFailed) {
        this.parsedFailed = parsedFailed;
    }

    public RespcodeBrokens withRefusedFailed(List<Double> refusedFailed) {
        this.refusedFailed = refusedFailed;
        return this;
    }

    public RespcodeBrokens addRefusedFailedItem(Double refusedFailedItem) {
        if (this.refusedFailed == null) {
            this.refusedFailed = new ArrayList<>();
        }
        this.refusedFailed.add(refusedFailedItem);
        return this;
    }

    public RespcodeBrokens withRefusedFailed(Consumer<List<Double>> refusedFailedSetter) {
        if (this.refusedFailed == null) {
            this.refusedFailed = new ArrayList<>();
        }
        refusedFailedSetter.accept(this.refusedFailed);
        return this;
    }

    /**
     * 连接被拒
     * @return refusedFailed
     */
    public List<Double> getRefusedFailed() {
        return refusedFailed;
    }

    public void setRefusedFailed(List<Double> refusedFailed) {
        this.refusedFailed = refusedFailed;
    }

    public RespcodeBrokens withSuccess(List<Double> success) {
        this.success = success;
        return this;
    }

    public RespcodeBrokens addSuccessItem(Double successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public RespcodeBrokens withSuccess(Consumer<List<Double>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 成功请求
     * @return success
     */
    public List<Double> getSuccess() {
        return success;
    }

    public void setSuccess(List<Double> success) {
        this.success = success;
    }

    public RespcodeBrokens withTimeout(List<Double> timeout) {
        this.timeout = timeout;
        return this;
    }

    public RespcodeBrokens addTimeoutItem(Double timeoutItem) {
        if (this.timeout == null) {
            this.timeout = new ArrayList<>();
        }
        this.timeout.add(timeoutItem);
        return this;
    }

    public RespcodeBrokens withTimeout(Consumer<List<Double>> timeoutSetter) {
        if (this.timeout == null) {
            this.timeout = new ArrayList<>();
        }
        timeoutSetter.accept(this.timeout);
        return this;
    }

    /**
     * 超时失败
     * @return timeout
     */
    public List<Double> getTimeout() {
        return timeout;
    }

    public void setTimeout(List<Double> timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespcodeBrokens respcodeBrokens = (RespcodeBrokens) o;
        return Objects.equals(this.checkPointFailed, respcodeBrokens.checkPointFailed)
            && Objects.equals(this.error, respcodeBrokens.error)
            && Objects.equals(this.othersFailed, respcodeBrokens.othersFailed)
            && Objects.equals(this.parsedFailed, respcodeBrokens.parsedFailed)
            && Objects.equals(this.refusedFailed, respcodeBrokens.refusedFailed)
            && Objects.equals(this.success, respcodeBrokens.success)
            && Objects.equals(this.timeout, respcodeBrokens.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkPointFailed, error, othersFailed, parsedFailed, refusedFailed, success, timeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespcodeBrokens {\n");
        sb.append("    checkPointFailed: ").append(toIndentedString(checkPointFailed)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    othersFailed: ").append(toIndentedString(othersFailed)).append("\n");
        sb.append("    parsedFailed: ").append(toIndentedString(parsedFailed)).append("\n");
        sb.append("    refusedFailed: ").append(toIndentedString(refusedFailed)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
