package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 标签信息
 */
public class LabelInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "val")

    private String val;

    public LabelInfo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 标签名称
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LabelInfo withVal(String val) {
        this.val = val;
        return this;
    }

    /**
     * 标签值
     * @return val
     */
    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LabelInfo that = (LabelInfo) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.val, that.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, val);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelInfo {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    val: ").append(toIndentedString(val)).append("\n");
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
