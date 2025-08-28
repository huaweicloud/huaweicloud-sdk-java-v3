package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RDMParamVOStatisticsPVO
 */
public class RDMParamVOStatisticsPVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private StatisticsPVO params;

    public RDMParamVOStatisticsPVO withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释**：  应用ID。  **约束限制**：  不涉及。  **取值范围**：  由英文字母和数字组成，且长度为32个字符。  **默认取值**：  不涉及。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public RDMParamVOStatisticsPVO withParams(StatisticsPVO params) {
        this.params = params;
        return this;
    }

    public RDMParamVOStatisticsPVO withParams(Consumer<StatisticsPVO> paramsSetter) {
        if (this.params == null) {
            this.params = new StatisticsPVO();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public StatisticsPVO getParams() {
        return params;
    }

    public void setParams(StatisticsPVO params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RDMParamVOStatisticsPVO that = (RDMParamVOStatisticsPVO) obj;
        return Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDMParamVOStatisticsPVO {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
