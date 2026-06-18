package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据实际输入信息。枚举值：   - dataset：指定输入为数据集；   - obs：指定输入为OBS路径。
 */
public class InputDataInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset")

    private InputDataInfoRespDataset dataset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private InputDataInfoRespObs obs;

    public InputDataInfoResp withDataset(InputDataInfoRespDataset dataset) {
        this.dataset = dataset;
        return this;
    }

    public InputDataInfoResp withDataset(Consumer<InputDataInfoRespDataset> datasetSetter) {
        if (this.dataset == null) {
            this.dataset = new InputDataInfoRespDataset();
            datasetSetter.accept(this.dataset);
        }

        return this;
    }

    /**
     * Get dataset
     * @return dataset
     */
    public InputDataInfoRespDataset getDataset() {
        return dataset;
    }

    public void setDataset(InputDataInfoRespDataset dataset) {
        this.dataset = dataset;
    }

    public InputDataInfoResp withObs(InputDataInfoRespObs obs) {
        this.obs = obs;
        return this;
    }

    public InputDataInfoResp withObs(Consumer<InputDataInfoRespObs> obsSetter) {
        if (this.obs == null) {
            this.obs = new InputDataInfoRespObs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public InputDataInfoRespObs getObs() {
        return obs;
    }

    public void setObs(InputDataInfoRespObs obs) {
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
        InputDataInfoResp that = (InputDataInfoResp) obj;
        return Objects.equals(this.dataset, that.dataset) && Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataset, obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputDataInfoResp {\n");
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
