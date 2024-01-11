package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TagEntity
 */
public class TagEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public TagEntity withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 标签键。  - 不能为空。  - 对于同一个实例，Key值唯一。  [- 长度不超过36个字符。](tag:cmcc,g42,hk_g42,hk_tm,hws_eu,hws_ocb,ocb,tm)  [- 长度为1~128个字符（中文也可以输入128个字符）。](tag:hws,hws_hk,ctc,hk_sbc,sbc,dt)  [- 不能包含“=”，“*”，“<”，“>”，“\\”，“,”，“|”，“/”](tag:cmcc,g42,hk_g42,hk_tm,hws_eu,hws_ocb,ocb,tm)  [- 由任意语种字母、数字、空格和字符组成，字符仅支持_ . : = + - @](tag:hws,hws_hk,ctc,hk_sbc,sbc,dt)  - 首尾字符不能为空格。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TagEntity withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 标签值。  [- 不能为空。](tag:cmcc,g42,hk_g42,hk_tm,hws_eu,hws_ocb,ocb,tm)  [- 长度不超过43个字符。](tag:cmcc,g42,hk_g42,hk_tm,hws_eu,hws_ocb,ocb,tm)  [- 长度为0~255个字符（中文也可以输入255个字符）。](tag:hws,hws_hk,ctc,hk_sbc,sbc,dt)  [- 不能包含“=”，“*”，“<”，“>”，“\\”，“,”，“|”，“/”](tag:cmcc,g42,hk_g42,hk_tm,hws_eu,hws_ocb,ocb,tm)  [- 由任意语种字母、数字、空格和字符组成，字符仅支持_ . : = + - @](tag:hws,hws_hk,ctc,hk_sbc,sbc,dt)  - 首尾字符不能为空格。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TagEntity that = (TagEntity) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagEntity {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
