package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扩容伸缩组的基本信息
 */
public class ExtensionScaleGroupMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ExtensionScaleGroupMetadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 扩展伸缩组的uuid，由系统自动生成
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ExtensionScaleGroupMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 扩展伸缩组的名称，不能为 **default**，长度不能超过55个字符，只能包含数字和小写字母以及**-** 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionScaleGroupMetadata that = (ExtensionScaleGroupMetadata) obj;
        return Objects.equals(this.uid, that.uid) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionScaleGroupMetadata {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
