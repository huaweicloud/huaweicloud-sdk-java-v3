package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：数据输入输出信息为OBS方式。
 */
public class InputDataInfoRespObs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_url")

    private String obsUrl;

    public InputDataInfoRespObs withObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
        return this;
    }

    /**
     * **参数解释**：训练作业需要的数据集OBS路径URL。如：“/usr/data/”。 **取值范围**：不涉及。
     * @return obsUrl
     */
    public String getObsUrl() {
        return obsUrl;
    }

    public void setObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputDataInfoRespObs that = (InputDataInfoRespObs) obj;
        return Objects.equals(this.obsUrl, that.obsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputDataInfoRespObs {\n");
        sb.append("    obsUrl: ").append(toIndentedString(obsUrl)).append("\n");
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
