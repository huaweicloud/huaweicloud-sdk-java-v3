package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowApplicationResDeleteStatusResponse extends SdkResponse {

    /**
     * 代码仓删除状态,deleted:删除成功,failed:删除失败,going:正在删除中
     */
    public static final class RepoStatusEnum {

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final RepoStatusEnum DELETED = new RepoStatusEnum("deleted");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final RepoStatusEnum FAILED = new RepoStatusEnum("failed");

        /**
         * Enum GOING for value: "going"
         */
        public static final RepoStatusEnum GOING = new RepoStatusEnum("going");

        private static final Map<String, RepoStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RepoStatusEnum> createStaticFields() {
            Map<String, RepoStatusEnum> map = new HashMap<>();
            map.put("deleted", DELETED);
            map.put("failed", FAILED);
            map.put("going", GOING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RepoStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RepoStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RepoStatusEnum(value));
        }

        public static RepoStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RepoStatusEnum) {
                return this.value.equals(((RepoStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_status")

    private RepoStatusEnum repoStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_status")

    private List<PipelineDeleteStatus> pipelineStatus = null;

    public ShowApplicationResDeleteStatusResponse withRepoStatus(RepoStatusEnum repoStatus) {
        this.repoStatus = repoStatus;
        return this;
    }

    /**
     * 代码仓删除状态,deleted:删除成功,failed:删除失败,going:正在删除中
     * @return repoStatus
     */
    public RepoStatusEnum getRepoStatus() {
        return repoStatus;
    }

    public void setRepoStatus(RepoStatusEnum repoStatus) {
        this.repoStatus = repoStatus;
    }

    public ShowApplicationResDeleteStatusResponse withPipelineStatus(List<PipelineDeleteStatus> pipelineStatus) {
        this.pipelineStatus = pipelineStatus;
        return this;
    }

    public ShowApplicationResDeleteStatusResponse addPipelineStatusItem(PipelineDeleteStatus pipelineStatusItem) {
        if (this.pipelineStatus == null) {
            this.pipelineStatus = new ArrayList<>();
        }
        this.pipelineStatus.add(pipelineStatusItem);
        return this;
    }

    public ShowApplicationResDeleteStatusResponse withPipelineStatus(
        Consumer<List<PipelineDeleteStatus>> pipelineStatusSetter) {
        if (this.pipelineStatus == null) {
            this.pipelineStatus = new ArrayList<>();
        }
        pipelineStatusSetter.accept(this.pipelineStatus);
        return this;
    }

    /**
     * 流水线删除状态
     * @return pipelineStatus
     */
    public List<PipelineDeleteStatus> getPipelineStatus() {
        return pipelineStatus;
    }

    public void setPipelineStatus(List<PipelineDeleteStatus> pipelineStatus) {
        this.pipelineStatus = pipelineStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowApplicationResDeleteStatusResponse that = (ShowApplicationResDeleteStatusResponse) obj;
        return Objects.equals(this.repoStatus, that.repoStatus)
            && Objects.equals(this.pipelineStatus, that.pipelineStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoStatus, pipelineStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApplicationResDeleteStatusResponse {\n");
        sb.append("    repoStatus: ").append(toIndentedString(repoStatus)).append("\n");
        sb.append("    pipelineStatus: ").append(toIndentedString(pipelineStatus)).append("\n");
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
