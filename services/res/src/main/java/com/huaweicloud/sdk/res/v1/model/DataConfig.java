package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class DataConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline")

    @JacksonXmlProperty(localName = "offline")

    private Offline offline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nearline")

    @JacksonXmlProperty(localName = "nearline")

    private Nearline nearline;

    public DataConfig withOffline(Offline offline) {
        this.offline = offline;
        return this;
    }

    public DataConfig withOffline(Consumer<Offline> offlineSetter) {
        if (this.offline == null) {
            this.offline = new Offline();
            offlineSetter.accept(this.offline);
        }

        return this;
    }

    /**
     * Get offline
     * @return offline
     */
    public Offline getOffline() {
        return offline;
    }

    public void setOffline(Offline offline) {
        this.offline = offline;
    }

    public DataConfig withNearline(Nearline nearline) {
        this.nearline = nearline;
        return this;
    }

    public DataConfig withNearline(Consumer<Nearline> nearlineSetter) {
        if (this.nearline == null) {
            this.nearline = new Nearline();
            nearlineSetter.accept(this.nearline);
        }

        return this;
    }

    /**
     * Get nearline
     * @return nearline
     */
    public Nearline getNearline() {
        return nearline;
    }

    public void setNearline(Nearline nearline) {
        this.nearline = nearline;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataConfig dataConfig = (DataConfig) o;
        return Objects.equals(this.offline, dataConfig.offline) && Objects.equals(this.nearline, dataConfig.nearline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offline, nearline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataConfig {\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
        sb.append("    nearline: ").append(toIndentedString(nearline)).append("\n");
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
