package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 各种ATT&amp;CK攻击阶段的名称与数量列表
 */
public class EventAttCkDetailResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "att_ck")

    private String attCk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    public EventAttCkDetailResponseInfo withAttCk(String attCk) {
        this.attCk = attCk;
        return this;
    }

    /**
     * **参数解释**： 攻击阶段名称，根据页面语言环境，返回中文或英文 **取值范围**： 字符长度1-64位 
     * @return attCk
     */
    public String getAttCk() {
        return attCk;
    }

    public void setAttCk(String attCk) {
        this.attCk = attCk;
    }

    public EventAttCkDetailResponseInfo withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释**: 数量 **取值范围**: 最小值0，最大值2147483647 
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
        EventAttCkDetailResponseInfo that = (EventAttCkDetailResponseInfo) obj;
        return Objects.equals(this.attCk, that.attCk) && Objects.equals(this.num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attCk, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventAttCkDetailResponseInfo {\n");
        sb.append("    attCk: ").append(toIndentedString(attCk)).append("\n");
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
