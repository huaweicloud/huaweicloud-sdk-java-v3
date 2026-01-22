package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AntiVirusVO
 */
public class AntiVirusVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anti_virus_status")

    private Integer antiVirusStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public AntiVirusVO withAntiVirusStatus(Integer antiVirusStatus) {
        this.antiVirusStatus = antiVirusStatus;
        return this;
    }

    /**
     * 反病毒开关状态，0表示关闭，1表示开启
     * @return antiVirusStatus
     */
    public Integer getAntiVirusStatus() {
        return antiVirusStatus;
    }

    public void setAntiVirusStatus(Integer antiVirusStatus) {
        this.antiVirusStatus = antiVirusStatus;
    }

    public AntiVirusVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 防护对象id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AntiVirusVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 防护对象名称
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
        AntiVirusVO that = (AntiVirusVO) obj;
        return Objects.equals(this.antiVirusStatus, that.antiVirusStatus) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(antiVirusStatus, id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusVO {\n");
        sb.append("    antiVirusStatus: ").append(toIndentedString(antiVirusStatus)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
