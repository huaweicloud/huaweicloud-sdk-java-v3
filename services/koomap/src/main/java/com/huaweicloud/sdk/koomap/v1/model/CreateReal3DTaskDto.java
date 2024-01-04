package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建实景三维任务传输对象。
 */
public class CreateReal3DTaskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_description")

    private String taskDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_type")

    private String modelingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_params")

    private ModelingParams modelingParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_code")

    private String folderCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinate_sys")

    private String coordinateSys;

    public CreateReal3DTaskDto withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。支持中文、英文、数字以及“_”字符，长度限制1~50个字符。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateReal3DTaskDto withTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }

    /**
     * 任务描述。支持中文、英文、数字以及“_”字符，长度限制255个字符以内。
     * @return taskDescription
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public CreateReal3DTaskDto withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型。  - REAL3D-CTRL：实景三维有控建模 - REAL3D-UNCTRL：实景三维无控建模
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public CreateReal3DTaskDto withModelingType(String modelingType) {
        this.modelingType = modelingType;
        return this;
    }

    /**
     * 建模类型。  - Mesh：纹理模型实景三维建模。 - Nerf：显式辐射场实景三维建模。
     * @return modelingType
     */
    public String getModelingType() {
        return modelingType;
    }

    public void setModelingType(String modelingType) {
        this.modelingType = modelingType;
    }

    public CreateReal3DTaskDto withModelingParams(ModelingParams modelingParams) {
        this.modelingParams = modelingParams;
        return this;
    }

    public CreateReal3DTaskDto withModelingParams(Consumer<ModelingParams> modelingParamsSetter) {
        if (this.modelingParams == null) {
            this.modelingParams = new ModelingParams();
            modelingParamsSetter.accept(this.modelingParams);
        }

        return this;
    }

    /**
     * Get modelingParams
     * @return modelingParams
     */
    public ModelingParams getModelingParams() {
        return modelingParams;
    }

    public void setModelingParams(ModelingParams modelingParams) {
        this.modelingParams = modelingParams;
    }

    public CreateReal3DTaskDto withFolderCode(String folderCode) {
        this.folderCode = folderCode;
        return this;
    }

    /**
     * 需要进行三维重建的倾斜影像的影像code。
     * @return folderCode
     */
    public String getFolderCode() {
        return folderCode;
    }

    public void setFolderCode(String folderCode) {
        this.folderCode = folderCode;
    }

    public CreateReal3DTaskDto withCoordinateSys(String coordinateSys) {
        this.coordinateSys = coordinateSys;
        return this;
    }

    /**
     * 建模坐标系。坐标系当前仅支持WGS84-UTM。输入为null或者不填时，均使用缺省值WGS84-UTM。
     * @return coordinateSys
     */
    public String getCoordinateSys() {
        return coordinateSys;
    }

    public void setCoordinateSys(String coordinateSys) {
        this.coordinateSys = coordinateSys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateReal3DTaskDto that = (CreateReal3DTaskDto) obj;
        return Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskDescription, that.taskDescription)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.modelingType, that.modelingType)
            && Objects.equals(this.modelingParams, that.modelingParams)
            && Objects.equals(this.folderCode, that.folderCode)
            && Objects.equals(this.coordinateSys, that.coordinateSys);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskName, taskDescription, taskType, modelingType, modelingParams, folderCode, coordinateSys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReal3DTaskDto {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskDescription: ").append(toIndentedString(taskDescription)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    modelingType: ").append(toIndentedString(modelingType)).append("\n");
        sb.append("    modelingParams: ").append(toIndentedString(modelingParams)).append("\n");
        sb.append("    folderCode: ").append(toIndentedString(folderCode)).append("\n");
        sb.append("    coordinateSys: ").append(toIndentedString(coordinateSys)).append("\n");
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
