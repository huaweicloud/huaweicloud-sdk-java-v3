package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AI组件的统计列表信息
 */
public class AIStatisticInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_component_name")

    private String aiComponentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    public AIStatisticInfoResponseInfo withAiComponentName(String aiComponentName) {
        this.aiComponentName = aiComponentName;
        return this;
    }

    /**
     * **参数解释**： AI组件对应类型的名称 **取值范围**： 字符长度1-256位 
     * @return aiComponentName
     */
    public String getAiComponentName() {
        return aiComponentName;
    }

    public void setAiComponentName(String aiComponentName) {
        this.aiComponentName = aiComponentName;
    }

    public AIStatisticInfoResponseInfo withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释**： AI组件所在的服务器数量 
     * minimum: 0
     * maximum: 2147483647
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AIStatisticInfoResponseInfo that = (AIStatisticInfoResponseInfo) obj;
        return Objects.equals(this.aiComponentName, that.aiComponentName) && Objects.equals(this.num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiComponentName, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIStatisticInfoResponseInfo {\n");
        sb.append("    aiComponentName: ").append(toIndentedString(aiComponentName)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
