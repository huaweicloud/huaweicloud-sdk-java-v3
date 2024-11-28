package com.huaweicloud.sdk.kps.v3.model;

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
public class BatchImportKeypairResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_keypairs")

    private List<FailedKeypair> failedKeypairs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeeded_keypairs")

    private List<CreateKeypairResponseBody> succeededKeypairs = null;

    public BatchImportKeypairResponse withFailedKeypairs(List<FailedKeypair> failedKeypairs) {
        this.failedKeypairs = failedKeypairs;
        return this;
    }

    public BatchImportKeypairResponse addFailedKeypairsItem(FailedKeypair failedKeypairsItem) {
        if (this.failedKeypairs == null) {
            this.failedKeypairs = new ArrayList<>();
        }
        this.failedKeypairs.add(failedKeypairsItem);
        return this;
    }

    public BatchImportKeypairResponse withFailedKeypairs(Consumer<List<FailedKeypair>> failedKeypairsSetter) {
        if (this.failedKeypairs == null) {
            this.failedKeypairs = new ArrayList<>();
        }
        failedKeypairsSetter.accept(this.failedKeypairs);
        return this;
    }

    /**
     * 导入失败的SSH密钥对信息及导入失败的原因
     * @return failedKeypairs
     */
    public List<FailedKeypair> getFailedKeypairs() {
        return failedKeypairs;
    }

    public void setFailedKeypairs(List<FailedKeypair> failedKeypairs) {
        this.failedKeypairs = failedKeypairs;
    }

    public BatchImportKeypairResponse withSucceededKeypairs(List<CreateKeypairResponseBody> succeededKeypairs) {
        this.succeededKeypairs = succeededKeypairs;
        return this;
    }

    public BatchImportKeypairResponse addSucceededKeypairsItem(CreateKeypairResponseBody succeededKeypairsItem) {
        if (this.succeededKeypairs == null) {
            this.succeededKeypairs = new ArrayList<>();
        }
        this.succeededKeypairs.add(succeededKeypairsItem);
        return this;
    }

    public BatchImportKeypairResponse withSucceededKeypairs(
        Consumer<List<CreateKeypairResponseBody>> succeededKeypairsSetter) {
        if (this.succeededKeypairs == null) {
            this.succeededKeypairs = new ArrayList<>();
        }
        succeededKeypairsSetter.accept(this.succeededKeypairs);
        return this;
    }

    /**
     * 成功导入的SSH密钥对信息
     * @return succeededKeypairs
     */
    public List<CreateKeypairResponseBody> getSucceededKeypairs() {
        return succeededKeypairs;
    }

    public void setSucceededKeypairs(List<CreateKeypairResponseBody> succeededKeypairs) {
        this.succeededKeypairs = succeededKeypairs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchImportKeypairResponse that = (BatchImportKeypairResponse) obj;
        return Objects.equals(this.failedKeypairs, that.failedKeypairs)
            && Objects.equals(this.succeededKeypairs, that.succeededKeypairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedKeypairs, succeededKeypairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchImportKeypairResponse {\n");
        sb.append("    failedKeypairs: ").append(toIndentedString(failedKeypairs)).append("\n");
        sb.append("    succeededKeypairs: ").append(toIndentedString(succeededKeypairs)).append("\n");
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
