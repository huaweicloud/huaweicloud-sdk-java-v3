package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据实际输入信息。枚举值：   - dataset：指定输入为数据集；   - obs：指定输入为OBS路径。
 */
public class InputDataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset")

    private InputDataInfoDataset dataset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private InputDataInfoObs obs;

    public InputDataInfo withDataset(InputDataInfoDataset dataset) {
        this.dataset = dataset;
        return this;
    }

    public InputDataInfo withDataset(Consumer<InputDataInfoDataset> datasetSetter) {
        if (this.dataset == null) {
            this.dataset = new InputDataInfoDataset();
            datasetSetter.accept(this.dataset);
        }

        return this;
    }

    /**
     * Get dataset
     * @return dataset
     */
    public InputDataInfoDataset getDataset() {
        return dataset;
    }

    public void setDataset(InputDataInfoDataset dataset) {
        this.dataset = dataset;
    }

    public InputDataInfo withObs(InputDataInfoObs obs) {
        this.obs = obs;
        return this;
    }

    public InputDataInfo withObs(Consumer<InputDataInfoObs> obsSetter) {
        if (this.obs == null) {
            this.obs = new InputDataInfoObs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public InputDataInfoObs getObs() {
        return obs;
    }

    public void setObs(InputDataInfoObs obs) {
        this.obs = obs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputDataInfo that = (InputDataInfo) obj;
        return Objects.equals(this.dataset, that.dataset) && Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataset, obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputDataInfo {\n");
        sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
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
