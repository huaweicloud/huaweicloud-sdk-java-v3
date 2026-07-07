package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模型信息
 */
public class Model {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quant_type")

    private String quantType;

    public Model withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：模型名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**：模型OBS路径。 **取值范围**：不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Model withQuantType(String quantType) {
        this.quantType = quantType;
        return this;
    }

    /**
     * **参数解释**：量化数据类型。 **取值范围**：- w8A8 - fp16
     * @return quantType
     */
    public String getQuantType() {
        return quantType;
    }

    public void setQuantType(String quantType) {
        this.quantType = quantType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Model that = (Model) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.url, that.url)
            && Objects.equals(this.quantType, that.quantType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url, quantType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Model {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    quantType: ").append(toIndentedString(quantType)).append("\n");
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
