package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportFileReq
 */
public class ImportFileReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Object params;

    /**
     * Gets or Sets sameNamePolicy
     */
    public static final class SameNamePolicyEnum {

        /**
         * Enum SKIP for value: "SKIP"
         */
        public static final SameNamePolicyEnum SKIP = new SameNamePolicyEnum("SKIP");

        /**
         * Enum OVERWRITE for value: "OVERWRITE"
         */
        public static final SameNamePolicyEnum OVERWRITE = new SameNamePolicyEnum("OVERWRITE");

        private static final Map<String, SameNamePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SameNamePolicyEnum> createStaticFields() {
            Map<String, SameNamePolicyEnum> map = new HashMap<>();
            map.put("SKIP", SKIP);
            map.put("OVERWRITE", OVERWRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SameNamePolicyEnum(String value) {
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
        public static SameNamePolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SameNamePolicyEnum(value));
        }

        public static SameNamePolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SameNamePolicyEnum) {
                return this.value.equals(((SameNamePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sameNamePolicy")

    private SameNamePolicyEnum sameNamePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobsParam")

    private Object jobsParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executeUser")

    private String executeUser;

    /**
     * 在开启审批开关后，需要填写该字段。表示创建作业的目标状态，有三种状态：SAVED、SUBMITTED和PRODUCTION，分别表示作业创建后是保存态，提交态，生产态
     */
    public static final class TargetStatusEnum {

        /**
         * Enum SAVED for value: "SAVED"
         */
        public static final TargetStatusEnum SAVED = new TargetStatusEnum("SAVED");

        /**
         * Enum SUBMITTED for value: "SUBMITTED"
         */
        public static final TargetStatusEnum SUBMITTED = new TargetStatusEnum("SUBMITTED");

        /**
         * Enum PRODUCTION for value: "PRODUCTION"
         */
        public static final TargetStatusEnum PRODUCTION = new TargetStatusEnum("PRODUCTION");

        private static final Map<String, TargetStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetStatusEnum> createStaticFields() {
            Map<String, TargetStatusEnum> map = new HashMap<>();
            map.put("SAVED", SAVED);
            map.put("SUBMITTED", SUBMITTED);
            map.put("PRODUCTION", PRODUCTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetStatusEnum(String value) {
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
        public static TargetStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetStatusEnum(value));
        }

        public static TargetStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetStatusEnum) {
                return this.value.equals(((TargetStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetStatus")

    private TargetStatusEnum targetStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvers")

    private List<JobApprover> approvers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<JobResourceInfo> resources = null;

    public ImportFileReq withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ImportFileReq withParams(Object params) {
        this.params = params;
        return this;
    }

    /**
     * 公共作业参数
     * @return params
     */
    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    public ImportFileReq withSameNamePolicy(SameNamePolicyEnum sameNamePolicy) {
        this.sameNamePolicy = sameNamePolicy;
        return this;
    }

    /**
     * Get sameNamePolicy
     * @return sameNamePolicy
     */
    public SameNamePolicyEnum getSameNamePolicy() {
        return sameNamePolicy;
    }

    public void setSameNamePolicy(SameNamePolicyEnum sameNamePolicy) {
        this.sameNamePolicy = sameNamePolicy;
    }

    public ImportFileReq withJobsParam(Object jobsParam) {
        this.jobsParam = jobsParam;
        return this;
    }

    /**
     * 指定作业参数
     * @return jobsParam
     */
    public Object getJobsParam() {
        return jobsParam;
    }

    public void setJobsParam(Object jobsParam) {
        this.jobsParam = jobsParam;
    }

    public ImportFileReq withExecuteUser(String executeUser) {
        this.executeUser = executeUser;
        return this;
    }

    /**
     * Get executeUser
     * @return executeUser
     */
    public String getExecuteUser() {
        return executeUser;
    }

    public void setExecuteUser(String executeUser) {
        this.executeUser = executeUser;
    }

    public ImportFileReq withTargetStatus(TargetStatusEnum targetStatus) {
        this.targetStatus = targetStatus;
        return this;
    }

    /**
     * 在开启审批开关后，需要填写该字段。表示创建作业的目标状态，有三种状态：SAVED、SUBMITTED和PRODUCTION，分别表示作业创建后是保存态，提交态，生产态
     * @return targetStatus
     */
    public TargetStatusEnum getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(TargetStatusEnum targetStatus) {
        this.targetStatus = targetStatus;
    }

    public ImportFileReq withApprovers(List<JobApprover> approvers) {
        this.approvers = approvers;
        return this;
    }

    public ImportFileReq addApproversItem(JobApprover approversItem) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        this.approvers.add(approversItem);
        return this;
    }

    public ImportFileReq withApprovers(Consumer<List<JobApprover>> approversSetter) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        approversSetter.accept(this.approvers);
        return this;
    }

    /**
     * 在开启审批开关后，需要填写该字段，表示作业审批人
     * @return approvers
     */
    public List<JobApprover> getApprovers() {
        return approvers;
    }

    public void setApprovers(List<JobApprover> approvers) {
        this.approvers = approvers;
    }

    public ImportFileReq withResources(List<JobResourceInfo> resources) {
        this.resources = resources;
        return this;
    }

    public ImportFileReq addResourcesItem(JobResourceInfo resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ImportFileReq withResources(Consumer<List<JobResourceInfo>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 如需替换资源，需要填写该字段，包含替换的资源名和资源类型和替换后的资源名
     * @return resources
     */
    public List<JobResourceInfo> getResources() {
        return resources;
    }

    public void setResources(List<JobResourceInfo> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportFileReq that = (ImportFileReq) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.params, that.params)
            && Objects.equals(this.sameNamePolicy, that.sameNamePolicy)
            && Objects.equals(this.jobsParam, that.jobsParam) && Objects.equals(this.executeUser, that.executeUser)
            && Objects.equals(this.targetStatus, that.targetStatus) && Objects.equals(this.approvers, that.approvers)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, params, sameNamePolicy, jobsParam, executeUser, targetStatus, approvers, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportFileReq {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    sameNamePolicy: ").append(toIndentedString(sameNamePolicy)).append("\n");
        sb.append("    jobsParam: ").append(toIndentedString(jobsParam)).append("\n");
        sb.append("    executeUser: ").append(toIndentedString(executeUser)).append("\n");
        sb.append("    targetStatus: ").append(toIndentedString(targetStatus)).append("\n");
        sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
