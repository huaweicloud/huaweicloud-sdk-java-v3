package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据输入信息为数据集。
 */
public class InputDataInfoDataset {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_url")

    private String obsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_proportion")

    private Integer datasetProportion;

    public InputDataInfoDataset withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 训练作业的数据集ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InputDataInfoDataset withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 训练作业的数据集版本ID。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public InputDataInfoDataset withObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
        return this;
    }

    /**
     * 训练作业需要的数据集OBS路径URL，ModelArts会通过数据集ID和数据集版本ID自动解析生成。如：“/usr/data/”。
     * @return obsUrl
     */
    public String getObsUrl() {
        return obsUrl;
    }

    public void setObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
    }

    public InputDataInfoDataset withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * **参数解释**：数据集服务类型。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：取值为V3时表示使用的是资产服务提供的数据集，其他表示旧版数据集。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public InputDataInfoDataset withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：训练作业的数据集名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputDataInfoDataset withDatasetProportion(Integer datasetProportion) {
        this.datasetProportion = datasetProportion;
        return this;
    }

    /**
     * **参数解释**：精调训练作业的数据集配比比率，表示使用多少比率的该数据集进行训练。
     * minimum: 1
     * maximum: 100
     * @return datasetProportion
     */
    public Integer getDatasetProportion() {
        return datasetProportion;
    }

    public void setDatasetProportion(Integer datasetProportion) {
        this.datasetProportion = datasetProportion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputDataInfoDataset that = (InputDataInfoDataset) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.obsUrl, that.obsUrl) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.name, that.name) && Objects.equals(this.datasetProportion, that.datasetProportion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, versionId, obsUrl, serviceType, name, datasetProportion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputDataInfoDataset {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    obsUrl: ").append(toIndentedString(obsUrl)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    datasetProportion: ").append(toIndentedString(datasetProportion)).append("\n");
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
