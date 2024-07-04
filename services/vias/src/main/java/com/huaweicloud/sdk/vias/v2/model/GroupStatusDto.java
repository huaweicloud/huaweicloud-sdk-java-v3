package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupStatusDto
 */
public class GroupStatusDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_online")

    private Integer numOnline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_exception")

    private Integer numException;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_offline")

    private Integer numOffline;

    public GroupStatusDto withNumOnline(Integer numOnline) {
        this.numOnline = numOnline;
        return this;
    }

    /**
     * 在线视频源数量
     * @return numOnline
     */
    public Integer getNumOnline() {
        return numOnline;
    }

    public void setNumOnline(Integer numOnline) {
        this.numOnline = numOnline;
    }

    public GroupStatusDto withNumException(Integer numException) {
        this.numException = numException;
        return this;
    }

    /**
     * 异常视频源数量
     * @return numException
     */
    public Integer getNumException() {
        return numException;
    }

    public void setNumException(Integer numException) {
        this.numException = numException;
    }

    public GroupStatusDto withNumOffline(Integer numOffline) {
        this.numOffline = numOffline;
        return this;
    }

    /**
     * 离线视频源数量
     * @return numOffline
     */
    public Integer getNumOffline() {
        return numOffline;
    }

    public void setNumOffline(Integer numOffline) {
        this.numOffline = numOffline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupStatusDto that = (GroupStatusDto) obj;
        return Objects.equals(this.numOnline, that.numOnline) && Objects.equals(this.numException, that.numException)
            && Objects.equals(this.numOffline, that.numOffline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOnline, numException, numOffline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupStatusDto {\n");
        sb.append("    numOnline: ").append(toIndentedString(numOnline)).append("\n");
        sb.append("    numException: ").append(toIndentedString(numException)).append("\n");
        sb.append("    numOffline: ").append(toIndentedString(numOffline)).append("\n");
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
