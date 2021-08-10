package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 校验数据加工规则请求体 */
public class CheckDataTransformationReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_info")

    private List<DatabaseObjectVO> objectInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transformation_info")

    private TransformationInfo transformationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_transformation")

    private ConfigTransformationVo configTransformation;

    public CheckDataTransformationReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务id
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CheckDataTransformationReq withObjectInfo(List<DatabaseObjectVO> objectInfo) {
        this.objectInfo = objectInfo;
        return this;
    }

    public CheckDataTransformationReq addObjectInfoItem(DatabaseObjectVO objectInfoItem) {
        if (this.objectInfo == null) {
            this.objectInfo = new ArrayList<>();
        }
        this.objectInfo.add(objectInfoItem);
        return this;
    }

    public CheckDataTransformationReq withObjectInfo(Consumer<List<DatabaseObjectVO>> objectInfoSetter) {
        if (this.objectInfo == null) {
            this.objectInfo = new ArrayList<>();
        }
        objectInfoSetter.accept(this.objectInfo);
        return this;
    }

    /** 对象信息
     * 
     * @return objectInfo */
    public List<DatabaseObjectVO> getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(List<DatabaseObjectVO> objectInfo) {
        this.objectInfo = objectInfo;
    }

    public CheckDataTransformationReq withTransformationInfo(TransformationInfo transformationInfo) {
        this.transformationInfo = transformationInfo;
        return this;
    }

    public CheckDataTransformationReq withTransformationInfo(Consumer<TransformationInfo> transformationInfoSetter) {
        if (this.transformationInfo == null) {
            this.transformationInfo = new TransformationInfo();
            transformationInfoSetter.accept(this.transformationInfo);
        }

        return this;
    }

    /** Get transformationInfo
     * 
     * @return transformationInfo */
    public TransformationInfo getTransformationInfo() {
        return transformationInfo;
    }

    public void setTransformationInfo(TransformationInfo transformationInfo) {
        this.transformationInfo = transformationInfo;
    }

    public CheckDataTransformationReq withConfigTransformation(ConfigTransformationVo configTransformation) {
        this.configTransformation = configTransformation;
        return this;
    }

    public CheckDataTransformationReq withConfigTransformation(
        Consumer<ConfigTransformationVo> configTransformationSetter) {
        if (this.configTransformation == null) {
            this.configTransformation = new ConfigTransformationVo();
            configTransformationSetter.accept(this.configTransformation);
        }

        return this;
    }

    /** Get configTransformation
     * 
     * @return configTransformation */
    public ConfigTransformationVo getConfigTransformation() {
        return configTransformation;
    }

    public void setConfigTransformation(ConfigTransformationVo configTransformation) {
        this.configTransformation = configTransformation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckDataTransformationReq checkDataTransformationReq = (CheckDataTransformationReq) o;
        return Objects.equals(this.jobId, checkDataTransformationReq.jobId)
            && Objects.equals(this.objectInfo, checkDataTransformationReq.objectInfo)
            && Objects.equals(this.transformationInfo, checkDataTransformationReq.transformationInfo)
            && Objects.equals(this.configTransformation, checkDataTransformationReq.configTransformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, objectInfo, transformationInfo, configTransformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDataTransformationReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    objectInfo: ").append(toIndentedString(objectInfo)).append("\n");
        sb.append("    transformationInfo: ").append(toIndentedString(transformationInfo)).append("\n");
        sb.append("    configTransformation: ").append(toIndentedString(configTransformation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
