package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RunOption
 */
public class RunOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_num")

    private Integer threadNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_window")

    private BatchWindow batchWindow;

    public RunOption withThreadNum(Integer threadNum) {
        this.threadNum = threadNum;
        return this;
    }

    /**
     * 并发数
     * @return threadNum
     */
    public Integer getThreadNum() {
        return threadNum;
    }

    public void setThreadNum(Integer threadNum) {
        this.threadNum = threadNum;
    }

    public RunOption withBatchWindow(BatchWindow batchWindow) {
        this.batchWindow = batchWindow;
        return this;
    }

    public RunOption withBatchWindow(Consumer<BatchWindow> batchWindowSetter) {
        if (this.batchWindow == null) {
            this.batchWindow = new BatchWindow();
            batchWindowSetter.accept(this.batchWindow);
        }

        return this;
    }

    /**
     * Get batchWindow
     * @return batchWindow
     */
    public BatchWindow getBatchWindow() {
        return batchWindow;
    }

    public void setBatchWindow(BatchWindow batchWindow) {
        this.batchWindow = batchWindow;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunOption runOption = (RunOption) o;
        return Objects.equals(this.threadNum, runOption.threadNum)
            && Objects.equals(this.batchWindow, runOption.batchWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(threadNum, batchWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunOption {\n");
        sb.append("    threadNum: ").append(toIndentedString(threadNum)).append("\n");
        sb.append("    batchWindow: ").append(toIndentedString(batchWindow)).append("\n");
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
