package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AttackActionCountItem
 */
public class AttackActionCountItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Long num;

    public AttackActionCountItem withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 防护动作 **取值范围：** - block: 拦截，表示超过“限速频率”将直接拦截。 - log：仅记录，表示超过“限速频率”将只记录不拦截。 - captcha：表示超过“限速频率”后弹出验证码，进行人机验证，完成验证后，请求将不受访问限制。人机验证目前支持英文。 - dynamic_block：上一个限速周期内，请求频率超过“限速频率”将被拦截，那么在下一个限速周期内，请求频率超过“放行频率”将被拦截。 - advanced_captcha：高阶人机验证，表示超过“限速频率”后弹出验证码，进行人机验证。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AttackActionCountItem withNum(Long num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 数量 **取值范围：** 不涉及
     * @return num
     */
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
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
        AttackActionCountItem that = (AttackActionCountItem) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackActionCountItem {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
