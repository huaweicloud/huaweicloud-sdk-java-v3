package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ShowFactoryJobDependInstancesResponseBody
 */
public class ShowFactoryJobDependInstancesResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_path")

    private String jobPath;

    /**
     * 当前作业与查询目标作业的依赖关系方向。 取值范围： - parent：当前作业是查询目标作业的上游作业。 - child：当前作业是查询目标作业的下游作业。
     */
    public static final class DependLayerEnum {

        /**
         * Enum PARENT for value: "parent"
         */
        public static final DependLayerEnum PARENT = new DependLayerEnum("parent");

        /**
         * Enum CHILD for value: "child"
         */
        public static final DependLayerEnum CHILD = new DependLayerEnum("child");

        private static final Map<String, DependLayerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DependLayerEnum> createStaticFields() {
            Map<String, DependLayerEnum> map = new HashMap<>();
            map.put("parent", PARENT);
            map.put("child", CHILD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DependLayerEnum(String value) {
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
        public static DependLayerEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DependLayerEnum(value));
        }

        public static DependLayerEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DependLayerEnum) {
                return this.value.equals(((DependLayerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_layer")

    private DependLayerEnum dependLayer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    public ShowFactoryJobDependInstancesResponseBody withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 依赖的作业名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowFactoryJobDependInstancesResponseBody withJobPath(String jobPath) {
        this.jobPath = jobPath;
        return this;
    }

    /**
     * 依赖的作业所在目录路径。作业在根目录下返回\"/\"。
     * @return jobPath
     */
    public String getJobPath() {
        return jobPath;
    }

    public void setJobPath(String jobPath) {
        this.jobPath = jobPath;
    }

    public ShowFactoryJobDependInstancesResponseBody withDependLayer(DependLayerEnum dependLayer) {
        this.dependLayer = dependLayer;
        return this;
    }

    /**
     * 当前作业与查询目标作业的依赖关系方向。 取值范围： - parent：当前作业是查询目标作业的上游作业。 - child：当前作业是查询目标作业的下游作业。
     * @return dependLayer
     */
    public DependLayerEnum getDependLayer() {
        return dependLayer;
    }

    public void setDependLayer(DependLayerEnum dependLayer) {
        this.dependLayer = dependLayer;
    }

    public ShowFactoryJobDependInstancesResponseBody withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 依赖的作业所在的工作空间名称。
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public ShowFactoryJobDependInstancesResponseBody withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 作业责任人。创建作业时指定的作业负责人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFactoryJobDependInstancesResponseBody that = (ShowFactoryJobDependInstancesResponseBody) obj;
        return Objects.equals(this.jobName, that.jobName) && Objects.equals(this.jobPath, that.jobPath)
            && Objects.equals(this.dependLayer, that.dependLayer)
            && Objects.equals(this.workspaceName, that.workspaceName) && Objects.equals(this.owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName, jobPath, dependLayer, workspaceName, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFactoryJobDependInstancesResponseBody {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobPath: ").append(toIndentedString(jobPath)).append("\n");
        sb.append("    dependLayer: ").append(toIndentedString(dependLayer)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
