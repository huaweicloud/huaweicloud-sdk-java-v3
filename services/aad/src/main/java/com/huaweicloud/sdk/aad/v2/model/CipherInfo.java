package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * cipher
 */
public class CipherInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algo")

    private String algo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_cn")

    private String descCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_en")

    private String descEn;

    public CipherInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 套件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CipherInfo withAlgo(String algo) {
        this.algo = algo;
        return this;
    }

    /**
     * 对应的加密算法
     * @return algo
     */
    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }

    public CipherInfo withDescCn(String descCn) {
        this.descCn = descCn;
        return this;
    }

    /**
     * 中文描述
     * @return descCn
     */
    public String getDescCn() {
        return descCn;
    }

    public void setDescCn(String descCn) {
        this.descCn = descCn;
    }

    public CipherInfo withDescEn(String descEn) {
        this.descEn = descEn;
        return this;
    }

    /**
     * 英文描述
     * @return descEn
     */
    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CipherInfo that = (CipherInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.algo, that.algo)
            && Objects.equals(this.descCn, that.descCn) && Objects.equals(this.descEn, that.descEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, algo, descCn, descEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CipherInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    algo: ").append(toIndentedString(algo)).append("\n");
        sb.append("    descCn: ").append(toIndentedString(descCn)).append("\n");
        sb.append("    descEn: ").append(toIndentedString(descEn)).append("\n");
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
