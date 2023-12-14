package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GeoBlockingConfigInfo
 */
public class GeoBlockingConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_whitelist")

    private List<String> areaWhitelist = null;

    public GeoBlockingConfigInfo withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public GeoBlockingConfigInfo withAreaWhitelist(List<String> areaWhitelist) {
        this.areaWhitelist = areaWhitelist;
        return this;
    }

    public GeoBlockingConfigInfo addAreaWhitelistItem(String areaWhitelistItem) {
        if (this.areaWhitelist == null) {
            this.areaWhitelist = new ArrayList<>();
        }
        this.areaWhitelist.add(areaWhitelistItem);
        return this;
    }

    public GeoBlockingConfigInfo withAreaWhitelist(Consumer<List<String>> areaWhitelistSetter) {
        if (this.areaWhitelist == null) {
            this.areaWhitelist = new ArrayList<>();
        }
        areaWhitelistSetter.accept(this.areaWhitelist);
        return this;
    }

    /**
     * 限制区域列表, 空列表表示不限制。 除中国以外，其他地区代码，2位字母大写。代码格式参阅[ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#search/code/) 包含如下部分取值： - CN-IN：中国大陆 - CN-HK：中国香港 - CN-MO：中国澳门 - CN-TW：中国台湾 - BR：巴西
     * @return areaWhitelist
     */
    public List<String> getAreaWhitelist() {
        return areaWhitelist;
    }

    public void setAreaWhitelist(List<String> areaWhitelist) {
        this.areaWhitelist = areaWhitelist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeoBlockingConfigInfo that = (GeoBlockingConfigInfo) obj;
        return Objects.equals(this.app, that.app) && Objects.equals(this.areaWhitelist, that.areaWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, areaWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeoBlockingConfigInfo {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    areaWhitelist: ").append(toIndentedString(areaWhitelist)).append("\n");
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
