package com.huaweicloud.sdk.waf.v1.model;

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
public class BatchDeleteCustomRegexSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private List<String> deleted = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private List<FailedCustomRegexSet> failed = null;

    public BatchDeleteCustomRegexSetResponse withDeleted(List<String> deleted) {
        this.deleted = deleted;
        return this;
    }

    public BatchDeleteCustomRegexSetResponse addDeletedItem(String deletedItem) {
        if (this.deleted == null) {
            this.deleted = new ArrayList<>();
        }
        this.deleted.add(deletedItem);
        return this;
    }

    public BatchDeleteCustomRegexSetResponse withDeleted(Consumer<List<String>> deletedSetter) {
        if (this.deleted == null) {
            this.deleted = new ArrayList<>();
        }
        deletedSetter.accept(this.deleted);
        return this;
    }

    /**
     * 已成功删除的正则库ID列表
     * @return deleted
     */
    public List<String> getDeleted() {
        return deleted;
    }

    public void setDeleted(List<String> deleted) {
        this.deleted = deleted;
    }

    public BatchDeleteCustomRegexSetResponse withFailed(List<FailedCustomRegexSet> failed) {
        this.failed = failed;
        return this;
    }

    public BatchDeleteCustomRegexSetResponse addFailedItem(FailedCustomRegexSet failedItem) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failedItem);
        return this;
    }

    public BatchDeleteCustomRegexSetResponse withFailed(Consumer<List<FailedCustomRegexSet>> failedSetter) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        failedSetter.accept(this.failed);
        return this;
    }

    /**
     * 删除失败的正则库列表
     * @return failed
     */
    public List<FailedCustomRegexSet> getFailed() {
        return failed;
    }

    public void setFailed(List<FailedCustomRegexSet> failed) {
        this.failed = failed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteCustomRegexSetResponse that = (BatchDeleteCustomRegexSetResponse) obj;
        return Objects.equals(this.deleted, that.deleted) && Objects.equals(this.failed, that.failed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleted, failed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteCustomRegexSetResponse {\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
