package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据加工详情
 */
public class DataTransformationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transformation_info")

    private TransformationInfo transformationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_transformation")

    private ConfigTransformationVo configTransformation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_transformation_object_infos")

    private List<DataTransformationObjectVO> dataTransformationObjectInfos = null;

    public DataTransformationInfo withTransformationInfo(TransformationInfo transformationInfo) {
        this.transformationInfo = transformationInfo;
        return this;
    }

    public DataTransformationInfo withTransformationInfo(Consumer<TransformationInfo> transformationInfoSetter) {
        if (this.transformationInfo == null) {
            this.transformationInfo = new TransformationInfo();
            transformationInfoSetter.accept(this.transformationInfo);
        }

        return this;
    }

    /**
     * Get transformationInfo
     * @return transformationInfo
     */
    public TransformationInfo getTransformationInfo() {
        return transformationInfo;
    }

    public void setTransformationInfo(TransformationInfo transformationInfo) {
        this.transformationInfo = transformationInfo;
    }

    public DataTransformationInfo withConfigTransformation(ConfigTransformationVo configTransformation) {
        this.configTransformation = configTransformation;
        return this;
    }

    public DataTransformationInfo withConfigTransformation(
        Consumer<ConfigTransformationVo> configTransformationSetter) {
        if (this.configTransformation == null) {
            this.configTransformation = new ConfigTransformationVo();
            configTransformationSetter.accept(this.configTransformation);
        }

        return this;
    }

    /**
     * Get configTransformation
     * @return configTransformation
     */
    public ConfigTransformationVo getConfigTransformation() {
        return configTransformation;
    }

    public void setConfigTransformation(ConfigTransformationVo configTransformation) {
        this.configTransformation = configTransformation;
    }

    public DataTransformationInfo withDataTransformationObjectInfos(
        List<DataTransformationObjectVO> dataTransformationObjectInfos) {
        this.dataTransformationObjectInfos = dataTransformationObjectInfos;
        return this;
    }

    public DataTransformationInfo addDataTransformationObjectInfosItem(
        DataTransformationObjectVO dataTransformationObjectInfosItem) {
        if (this.dataTransformationObjectInfos == null) {
            this.dataTransformationObjectInfos = new ArrayList<>();
        }
        this.dataTransformationObjectInfos.add(dataTransformationObjectInfosItem);
        return this;
    }

    public DataTransformationInfo withDataTransformationObjectInfos(
        Consumer<List<DataTransformationObjectVO>> dataTransformationObjectInfosSetter) {
        if (this.dataTransformationObjectInfos == null) {
            this.dataTransformationObjectInfos = new ArrayList<>();
        }
        dataTransformationObjectInfosSetter.accept(this.dataTransformationObjectInfos);
        return this;
    }

    /**
     * 数据加工对象。
     * @return dataTransformationObjectInfos
     */
    public List<DataTransformationObjectVO> getDataTransformationObjectInfos() {
        return dataTransformationObjectInfos;
    }

    public void setDataTransformationObjectInfos(List<DataTransformationObjectVO> dataTransformationObjectInfos) {
        this.dataTransformationObjectInfos = dataTransformationObjectInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataTransformationInfo dataTransformationInfo = (DataTransformationInfo) o;
        return Objects.equals(this.transformationInfo, dataTransformationInfo.transformationInfo)
            && Objects.equals(this.configTransformation, dataTransformationInfo.configTransformation)
            && Objects.equals(this.dataTransformationObjectInfos, dataTransformationInfo.dataTransformationObjectInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transformationInfo, configTransformation, dataTransformationObjectInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataTransformationInfo {\n");
        sb.append("    transformationInfo: ").append(toIndentedString(transformationInfo)).append("\n");
        sb.append("    configTransformation: ").append(toIndentedString(configTransformation)).append("\n");
        sb.append("    dataTransformationObjectInfos: ")
            .append(toIndentedString(dataTransformationObjectInfos))
            .append("\n");
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
