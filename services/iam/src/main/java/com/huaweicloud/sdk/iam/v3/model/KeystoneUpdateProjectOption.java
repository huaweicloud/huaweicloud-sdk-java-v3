package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改的项目信息。
 */
public class KeystoneUpdateProjectOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public KeystoneUpdateProjectOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目名称，必须以存在的\"区域ID_\"开头，长度小于等于64字符。项目所属区域不能改变，即原项目名为“cn-north-1_IAMProject”时，新项目名只能以“cn-north-1_”开头。“name”与\"description\"至少填写一个。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeystoneUpdateProjectOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 项目描述，长度小于等于255字符。“name”与\"description\"至少填写一个。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneUpdateProjectOption keystoneUpdateProjectOption = (KeystoneUpdateProjectOption) o;
        return Objects.equals(this.name, keystoneUpdateProjectOption.name)
            && Objects.equals(this.description, keystoneUpdateProjectOption.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateProjectOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
