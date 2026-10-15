package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Landing Zone版本详细信息。
 */
public class LandingZoneVersionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_date")

    private String releaseDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_notes")

    private String releaseNotes;

    public LandingZoneVersionDetail withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Landing Zone版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LandingZoneVersionDetail withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Landing Zone版本发布时间。
     * @return releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LandingZoneVersionDetail withReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
        return this;
    }

    /**
     * Landing Zone版本发布说明。
     * @return releaseNotes
     */
    public String getReleaseNotes() {
        return releaseNotes;
    }

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LandingZoneVersionDetail that = (LandingZoneVersionDetail) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.releaseDate, that.releaseDate)
            && Objects.equals(this.releaseNotes, that.releaseNotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, releaseDate, releaseNotes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LandingZoneVersionDetail {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    releaseNotes: ").append(toIndentedString(releaseNotes)).append("\n");
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
