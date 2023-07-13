package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 运营商信息
 */
public class Operator {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_name")

    private String i18nName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sa")

    private String sa;

    public Operator withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 运营商ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Operator withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 运营商名称。  取值范围： - chinamobile：中国移动； - chinaunicom：中国联通； - chinatelecom：中国电信。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Operator withI18nName(String i18nName) {
        this.i18nName = i18nName;
        return this;
    }

    /**
     * 运营商国际化名称。
     * @return i18nName
     */
    public String getI18nName() {
        return i18nName;
    }

    public void setI18nName(String i18nName) {
        this.i18nName = i18nName;
    }

    public Operator withSa(String sa) {
        this.sa = sa;
        return this;
    }

    /**
     * 运营商的简写。
     * @return sa
     */
    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Operator that = (Operator) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.i18nName, that.i18nName) && Objects.equals(this.sa, that.sa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, i18nName, sa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Operator {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    i18nName: ").append(toIndentedString(i18nName)).append("\n");
        sb.append("    sa: ").append(toIndentedString(sa)).append("\n");
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
