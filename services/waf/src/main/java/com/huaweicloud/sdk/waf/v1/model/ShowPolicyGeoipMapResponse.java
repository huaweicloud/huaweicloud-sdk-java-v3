package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPolicyGeoipMapResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continent")

    private Object continent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geomap")

    private Object geomap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private Object locale;

    public ShowPolicyGeoipMapResponse withContinent(Object continent) {
        this.continent = continent;
        return this;
    }

    /**
     * **参数解释：** 各个洲上的国家名称分布信息 **取值范围：** 不涉及
     * @return continent
     */
    public Object getContinent() {
        return continent;
    }

    public void setContinent(Object continent) {
        this.continent = continent;
    }

    public ShowPolicyGeoipMapResponse withGeomap(Object geomap) {
        this.geomap = geomap;
        return this;
    }

    /**
     * **参数解释：** key值为各个国家的简称（AB和AB2除外，AB表示海外及港澳台，AB2表示海外），当key为CN时，里面是数组内容为各个省份的简称 **取值范围：** 不涉及
     * @return geomap
     */
    public Object getGeomap() {
        return geomap;
    }

    public void setGeomap(Object geomap) {
        this.geomap = geomap;
    }

    public ShowPolicyGeoipMapResponse withLocale(Object locale) {
        this.locale = locale;
        return this;
    }

    /**
     * **参数解释：** geomap中的值对应语言的显示名称 **取值范围：** 不涉及
     * @return locale
     */
    public Object getLocale() {
        return locale;
    }

    public void setLocale(Object locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPolicyGeoipMapResponse that = (ShowPolicyGeoipMapResponse) obj;
        return Objects.equals(this.continent, that.continent) && Objects.equals(this.geomap, that.geomap)
            && Objects.equals(this.locale, that.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continent, geomap, locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPolicyGeoipMapResponse {\n");
        sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
        sb.append("    geomap: ").append(toIndentedString(geomap)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
